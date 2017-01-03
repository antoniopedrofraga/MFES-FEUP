package gui;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.ui.view.Viewer;
import org.overture.codegen.runtime.VDMSeq;

import vdmpp.EshopModelTester;
import vdmpp.Feature;
import vdmpp.Model;
import vdmpp.Parent;

public class InAppGUI {

	public static void main(String[] args) {
		System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
		
		InAppGUI gui = new InAppGUI();
		gui.displayModel(new EshopModelTester().createModel());
	}

	private void displayModel(Model model) {
		Graph graph = new MultiGraph("Model Viewer");
		graph.addAttribute("ui.stylesheet", "node { size: 40px; text-alignment: at-right; text-padding: 3px, 2px; text-background-mode: rounded-box; text-background-color: #EB2; text-color: #222; }");
		graph.addAttribute("ui.quality");
		graph.addAttribute("ui.antialias");
		
		int nodeCount = model.nodeCount().intValue();
		displayFromRoot(graph, null, model.getRoot(), 0, 1, nodeCount);

		Viewer viewer = graph.display();
		viewer.disableAutoLayout();
	}
	
	private void displayFromRoot(Graph graph, Parent parent, Feature feature, float x, float y, float xSpace) {
		
		graph.addNode(feature.getName());
		Node node = graph.getNode(feature.getName());
		String name = feature instanceof Parent ? feature.getName() + " " + ((Parent)feature).getParentType() : feature.getName();
		node.addAttribute("ui.label", name);
		node.setAttribute("y", y);
		node.setAttribute("x", x);
		System.out.println("x:" + x + " y:" + y + " xSpace:" + xSpace);
		
		if (parent != null) { graph.addEdge(parent.getName() + "-" + feature.getName(), parent.getName(), feature.getName()); }
		if (feature instanceof Parent){
			Parent f = (Parent) feature;
			VDMSeq subFeatures = f.getSubFeatures();
			float xDelta = xSpace / subFeatures.size();
			float newx = x - xSpace / 2;
			for (int i = 0; i < subFeatures.size(); i++){
				displayFromRoot(graph, (Parent) feature, (Feature) subFeatures.get(i), newx + xDelta * i + xDelta / 2, y - 1, xDelta);
			}
		}
	}

}
