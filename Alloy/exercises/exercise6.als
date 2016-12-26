sig Point {}
sig Angulo {}
sig Poligono {
 vertices: set Point,
 lados: Point -> Point,
 angulo: Point -> one Angulo
}
pred bemConstruido[p: Poligono] {
	(p.angulo.Angulo + p.lados.Point + p.lados[Point]) in p.vertices
}
pred angulosIguais[p: Poligono] {
	one p.angulo[Point]
}
pred removeVertice[p: Poligono, p': Poligono] {
	one v: p.vertices | p'.vertices = p.vertices - v && 
	p'.lados.Point = p.lados.Point - p.lados.v &&
	p'.lados[Point] = p.lados[Point] - p.lados[v] &&
	p'.angulo[Point] = p.angulo[Point] - p.angulo[v]
}
