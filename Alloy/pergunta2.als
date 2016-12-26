abstract sig X {
	a: X -> X,
	b: set X	
} {
	a = D -> T + T -> D + T -> T
	b = T + D
}
one sig D, T extends X {}
run {} 
