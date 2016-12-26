abstract sig X {
	a: X -> X,
	b: X -> X,
	c: X -> X,
	r: lone X 
} {
a = (X0 -> X2) + (X1 -> X2) 
b = (X1 -> X2) + (X2 -> X2) 
c = (X3 -> X2) + (X2 -> X1) + (X1 -> X3) 
} fact {
	no x: X | x in x.^r 
}

one sig X0, X1, X2, X3 extends X {}
run {}

/*
X.a in  (X.a) . ^(X.a)
X.b in  (X.b) . ^(X.b)
X.c in  (X.c) . ^(X.c)
*/
