sig Name {}
sig Pessoa {
	n: one Name,
	descendentes : set Pessoa
}

fact desc {
	all p: Pessoa | #(p[descendentes])  = 2
}
fun origem[]: Pessoa {
	{p: Pessoa | (Pessoa.descendentes - p) = p.^(descendentes)}
}
run {} for exactly 5 Pessoa, 5 Name
