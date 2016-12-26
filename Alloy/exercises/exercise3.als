abstract sig X {
	a:  X->X,
	b: X->X,
	c: X->X
} {
	a = A0 -> D0 + A1 -> C0 + D4 -> B1 + D0 -> D4
	b = B0 -> A0 + B1 -> D4
	c = C0 -> B0 + C1 -> B1 + D4 -> A0
}

one sig A0, A1, B0, B1, C0, C1, D0, D4 extends X {}

run {}

/*
a)		(X.c) . (X.b) . (X.a) :> B1
b)		A0 . ^(X.a)
*/
