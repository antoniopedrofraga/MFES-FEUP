sig Point {}
sig Edge {
 top: one Point,
 right: lone Point,
 left: lone Point
}
sig Tree{
 root: Point,
 edges: set Edge
} {
	Edge in edges
	Point in (Edge.top + Edge.right + Edge.left)
	all p: Edge.top | p not in Edge.right && p not in Edge.left
	all p: Point | #(top :> p) <= 1 
}
pred leafs[t: Tree, leafs: set Point] {
	all p: leafs | p not in Edge.top
}
pred rootPoint[t: Tree] {
	
}

run leafs for exactly 1 Tree, 10 Edge, 10 Point
