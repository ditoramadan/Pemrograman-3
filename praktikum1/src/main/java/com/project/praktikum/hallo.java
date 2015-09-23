package com.praktikum.project;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class Hallo{
	public static void main (String[] xx) {
		JFrame fr = new JFrame();
		fr.setTitle("HalloSwing");
		
		fr.setSize(200,200);
		fr.setLoactionRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		fr.setResizable(false);
		
		JPanel pnl = new JPanel();
		JPanel lnl = new JLabel("Label pada jPanel");
		pnl.add(lbl);
		fr.add(pnl);
		JOptionPane.showMessageDialog(null,"Hallo Dialog");
		
		fr.setVisible(true);
	}
}