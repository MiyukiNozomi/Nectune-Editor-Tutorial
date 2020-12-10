package org.nectune.editor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Editor extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JTextPane document;
	private JTextField detail;
	
	public Editor() {
		setLayout(new BorderLayout());
		
		document = new JTextPane();
		document.setForeground(Color.DARK_GRAY);
		document.setFont(new Font("Consolas",Font.PLAIN,15));
		detail = new JTextField();
		detail.setForeground(Color.DARK_GRAY);
		
		add(new JScrollPane(document),BorderLayout.CENTER);
		add(detail,BorderLayout.SOUTH);
	}
}