sig Account {}
abstract sig Transaction { amount: Int }
sig Deposit, Withdrawal extends Transaction {}
sig Client {
accounts: some Account, -- a client can access several accounts (1 or more)
withdrawPrivileges: set Account, -- but can’t withdraw from all of them (0..*)
balance: set Account -> one Int, --the amount each account currently has
transactions: Account -> set Transaction --a list of all account movements
}


pred invariants[c: Client] {
	all i: c.accounts | c.balance[i] > 0
	all a: c.transactions.Withdrawal | a in c.withdrawPrivileges
	all a: c.balance.Int | a in c.accounts 
}

pred withdraw[c, c': Client, a: Account, qty: Int, t: Withdrawal] {
	/* Pre Conditions */
	a in c.withdrawPrivileges
	c.balance[a] > qty
	qty > 0
	
	/* Method */
	t.amount = qty
	c'.accounts = c.accounts
	c'.withdrawPrivileges = c.withdrawPrivileges
	c'.transactions = c.transactions + (a -> t)
	c'.balance = c.balance ++ (a->minus[c.balance[a], qty])

}

run withdraw
