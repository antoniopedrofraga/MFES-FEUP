sig A {}
sig B {}
sig C {
	r: A one -> one B
}

run {}

/*
	#(C.r.B) = #(A.(C.r))
*/
