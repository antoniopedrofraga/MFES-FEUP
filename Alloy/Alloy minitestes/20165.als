abstract sig X {
	a: set X,
	b: X -> X
} {
	a = Tres + Um
	b = (Dois -> Tres) + (Tres -> Dois) + (Tres -> Tres)
}
one sig Um, Dois, Tres extends X {}
run {}
