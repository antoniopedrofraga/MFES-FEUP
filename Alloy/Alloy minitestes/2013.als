enum X {A, B}

fact test {
	all r: (A->B) | r.~r = ~r.r
}

run {}
