package View;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import Controller.AddGUIController;
import Controller.*;
public class HomePage extends JFrame {
	private static final long serialVersionUID = 1L;

	public HomePage() {
		this.setTitle("Film Archive System");
		//this.setSize(1250, 960);
		//Frame frame = null;
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//frame.setVisible(true);
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//this.setFocusableWindowState(isMaximumSizeSet());
		//this.setLayout(null);
		HomePage(this.getContentPane());
		this.setVisible(true);
		//this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void HomePage(Container window) {
		JPanel rightPanel = new JPanel();
		JPanel topRightPanel = new JPanel();
		JPanel firstPanel = new JPanel();
		JPanel totalGUI = new JPanel();

		// Desing of the home page and buttons

		window.add(rightPanel);
		window.add(topRightPanel);
		window.add(firstPanel);

		
		
		

		JTextField searchBox = new JTextField(20);
		this.add(searchBox);
		topRightPanel.add(searchBox);
		searchBox.setBounds(20, 30, 150, 30);

		
		firstPanel.setBackground(Color.DARK_GRAY);
		JScrollPane pane1 = new JScrollPane(firstPanel);
		getContentPane().add(pane1);
		pane1.setBounds(0, 0, 1020, 720);
		//pane1.getHorizontalScrollBar();
		//pane1.getVerticalScrollBar();
		
		
		
		//JScrollPane pane2 = new JScrollPane(rightPanel);
		//getContentPane().add(pane2);
		//pane2.getHorizontalScrollBar();
		//pane2.getVerticalScrollBar();
		rightPanel.setBackground(Color.LIGHT_GRAY);
		rightPanel.setBorder(null);
		rightPanel.setLayout(null);
		rightPanel.setBounds(1020, 70, 1050, 820);
		rightPanel.setBorder(new TitledBorder("All Categories"));
		

		topRightPanel.setBackground(Color.GRAY);
		topRightPanel.setBorder(null);
		topRightPanel.setLayout(null);
		topRightPanel.setBounds(1020, 0, 1080, 70);
		topRightPanel.setBorder(new TitledBorder("Search"));
		//JScrollPane pane3 = new JScrollPane(topRightPanel);
		//getContentPane().add(pane3);
		

		JButton button4 = new JButton("SEARCH");
		button4.setBounds(170, 30, 80, 30);
		topRightPanel.add(button4);

		JButton addButton = new JButton("ADD");
		addButton.setBounds(190, 30, 50, 30);
		firstPanel.add(addButton);

		JButton buton1 = new JButton("ACTION");
		JButton buton2 = new JButton("ADVENTURE");
		JButton buton3 = new JButton("ANIMATION");
		JButton buton4 = new JButton("BIOGRAPHY");
		JButton buton5 = new JButton("COMEDY");
		JButton buton6 = new JButton("CRIME");
		JButton buton7 = new JButton("DOCUMENTARY");
		JButton buton8 = new JButton("DRAMA");
		JButton buton9 = new JButton("FAMILY");
		JButton buton10 = new JButton("FANTASY");
		JButton buton11 = new JButton("ROMANCE");
		JButton buton12 = new JButton("OTHERS");
		rightPanel.add(buton1);
		rightPanel.add(buton2);
		rightPanel.add(buton3);
		rightPanel.add(buton4);
		rightPanel.add(buton5);
		rightPanel.add(buton6);
		rightPanel.add(buton7);
		rightPanel.add(buton8);
		rightPanel.add(buton9);
		rightPanel.add(buton10);
		rightPanel.add(buton11);
		rightPanel.add(buton12);
		buton1.setBounds(20, 30, 150, 40);
		buton2.setBounds(20, 80, 150, 40);
		buton3.setBounds(20, 130, 150, 40);
		buton4.setBounds(20, 180, 150, 40);
		buton5.setBounds(20, 230, 150, 40);
		buton6.setBounds(20, 280, 150, 40);
		buton7.setBounds(20, 330, 150, 40);
		buton8.setBounds(20, 380, 150, 40);
		buton9.setBounds(20, 430, 150, 40);
		buton10.setBounds(20, 480, 150, 40);
		buton11.setBounds(20, 530, 150, 40);
		buton12.setBounds(20, 580, 150, 40);

		// Action Listener

		addButton.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				AddGUIController ad=new AddGUIController();

			}

		});

	}

	public static void main(String[] args) {
		//new HomePage();
		//AddGUIController ad=new AddGUIController();

		
	}

}
