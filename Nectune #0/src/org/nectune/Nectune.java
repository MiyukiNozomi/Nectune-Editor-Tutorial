package org.nectune;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

import org.nectune.editor.Editor;

public class Nectune extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public Nectune() {
		super("Nectune");
		setSize(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JTabbedPane tabbedPane = new JTabbedPane();
		add(tabbedPane);
		
		tabbedPane.add("Test Editor",new Editor());
	}
	
	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		new Nectune().setVisible(true);
	}
}