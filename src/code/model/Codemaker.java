package code.model;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JEditorPane;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class Codemaker extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Codemaker() 
	{
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 115, 434, 20);
		panel.add(textField);
		textField.setColumns(10);
		
	}
	
	public boolean customcode; //anything you want to do
	private JTextField textField;
	{
		
	}
	public void start()
	{

	}
}
