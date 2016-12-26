open util/ordering[State]

abstract sig Rod {}

one sig A, B, C extends Rod {}

abstract sig Disk {
	size: Int
}

sig State { 
	rods: Rod -> (seq Disk)
}{
	all d: Disk | one rods.d /* um disco d só pode estar numa haste */ 
	all r: Rod, disj i1, i2: rods[r].inds | i1 < i2 implies rods[r][i1].size > rods[r][i2].size
}

one sig D1 extends Disk {} { size = 1}
one sig D2 extends Disk {} { size = 2}
one sig D3 extends Disk {} { size = 3}
one sig initialState extends State {}{
	rods[A].elems = Disk
}
one sig finalState extends State {}{
	rods[C].elems = Disk
}

pred move[d: Disk, from: Rod, to: Rod, s: State, s': State] {
	d = s.rods[from].last /* d é o último disco da rod de origem */
	#s.rods[to] > 0 implies s.rods[to].last.size > d.size /* se o nr de discos na rod de destino for > 0 então vamos fazer a verificação */
	
	s'.rods[from] = s.rods[from].butlast
	s'.rods[to] = s.rods[to].add[d]
	all r: Rod - ( from + to )  | s'.rods[r] = s.rods[r]
}

fact validTraces {
	all e: State, e': e.next | some from: Rod, to: Rod, d: Disk | move[d, from, to, e, e']
}

run movesSet {
	first = initialState
	last = finalState
} for 10


