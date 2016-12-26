abstract sig X {
	a : X -> X
} {
	a = A0 -> D0 + B0 -> A0 + B1 -> C1 + D0 -> D4 + D4 -> B1
}

one sig A0, B0, B1, C1, D0, D4 extends X {}

run {}

/* 
a)		(A0 + B1) <: X.a
b)		A0 . ^(X.a)
*/
