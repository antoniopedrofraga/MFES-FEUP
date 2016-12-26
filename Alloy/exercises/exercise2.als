abstract sig X {
	a: set X,
	c: X -> X,
	d: X -> X
} {
	a = N1 + N2 + N3
	c = N1->N1 + N1->N2 + N3->N2
	d = X1->N2 + X1->N1 + X3->X1
}

one sig N1, N2, N3, X1, X3 extends X {}

run {}
/*
a)		X.c.(X.a) -> X.c[X.a]
b)		X.c ++ ~(X.d)
*/
