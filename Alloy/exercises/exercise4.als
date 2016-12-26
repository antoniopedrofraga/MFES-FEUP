abstract sig X {
	a: X -> X,
	b: X -> X	
} {
	a = A0 -> D0 + B0 -> A0 + B1 -> C1 + D0 -> D4 + D4 -> B1
	b = B0 -> D4 + C1 -> A0
}

one sig A0, B0, B1, C1, D0, D4 extends X {}

run {}
/*
a)		(A0 + B1) <: ((X.a) . ~(X.b))
b)		D0 . ^(X.a)
*/
