package gui;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.UIManager;

import org.overture.codegen.runtime.VDMMap;

import vdmpp.Model;

public class GraphGUI extends JFrame {

	private static final long serialVersionUID = -5557695447991471706L;

	GraphGUI(String name, int mode) {
		super(name);
		this.setLayout(new FlowLayout());
		addFileChooser(mode);
		
	}
	private void addFileChooser(int mode) {
		UIManager.put("FileChooser.openDialogTitleText", "Choose model to be loaded");
		
		JSONChooser jsonChooser = new JSONChooser();
		Model model = jsonChooser.getModel();
		VDMMap map = null;
		
		if (mode == Utilities.VALIDATE) { 
			UIManager.put("FileChooser.openDialogTitleText", "Choose configuration to be loaded");
			jsonChooser = new JSONChooser();
			map = jsonChooser.getConfiguration();
			if (map == null) return;
		}
		if (model != null) { addGraphPanel(model, map); } else { System.out.println("There was a problem while loading the file"); return; }
		
		
		this.pack();
		this.setVisible(true);
		this.setAlwaysOnTop(true);
	    this.toFront();
	    this.requestFocus();
	    this.setAlwaysOnTop(false);
	}
	private void addGraphPanel(Model model, VDMMap map) {
		GraphPanel graphPanel = new GraphPanel();
		graphPanel.displayModel(model, map);
		this.add(graphPanel);
	}
}
