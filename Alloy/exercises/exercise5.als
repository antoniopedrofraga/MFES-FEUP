
sig Point {}

sig Graph{
	edge: Point -> set Point
}
pred biconnected[g: Graph] {
	all pi, pf: g.edge.Point + g.edge[Point] | pi -> pf in ^(g.edge + ~(g.edge))
}
pred insert[g: Graph,  g': Graph, pi: Point, pf: Point] {
	(pi + pf) in (g.edge.Point + g.edge[Point])
	g'.edge = g.edge + pi->pf
}
run insert for exactly 1 Graph, 5 Point
