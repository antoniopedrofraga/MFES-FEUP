abstract sig X {
	a: X -> X,
	b: X -> X
} {
	a = U -> D + D -> T
	b = D -> U + T -> D + T -> U
}
one sig U, D, T extends X {}
run {}
