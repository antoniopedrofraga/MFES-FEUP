sig Medicin {
	incompatibilities: set Medicin-this // other medicins incompatible with this one
}
sig Doctor { }
sig Patient {
	doctors: some Doctor,
	alergies: set Medicin, 
	prescriptions: Doctor lone -> set Medicin
}
fact incompatibilities_symmetry {
	incompatibilities = ~incompatibilities
}
fun medicins[p: Patient] : set Medicin {
	p.prescriptions[Doctor]
}
pred safety_invariants[p: Patient] {
	/* a */
	p.prescriptions[Doctor] not in p.alergies
	/* b */
	no m1, m2: p.prescriptions[Doctor] | m1 in m2.incompatibilities
	/* c */
	p.prescriptions.Medicin in p.doctors
}
pred prescribe[d: Doctor, m: Medicin, p, p': Patient] {
	/* pre-conditions */	
	d in p.doctors
 	m not in p.alergies
	m not in p.prescriptions[Doctor]
	m not in (p.prescriptions[Doctor])[incompatibilities]
	/* post-conditions */
	p'.alergies = p.alergies
	p'.doctors = p.doctors
	p'.prescriptions = p.prescriptions + d -> m 
}



run safety_invariants
