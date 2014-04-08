package View;

import java.awt.Checkbox;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;

import Controller.AddGUIController;
import Model.*;
import Controller.*;
public class AddGUI extends JFrame {
	
	public String isim;
	private JLabel name;
	private JTextField nameBox;
	private JLabel country;
	private JTextField countryBox;
	private JLabel directorName;
	private JTextField directorNameBox;
	private JLabel year;
	private JButton saveButton;
	private JButton cancelButton;
	private JCheckBox comedy;
	private JCheckBox drama;
	private JCheckBox romance;
	private String path = null;
	//public JComboBox combo;
	 final List<JCheckBox> checkBoxList = new ArrayList<JCheckBox>();

	 public JComboBox combo = new JComboBox();
	


	public AddGUI() {

		// isim : JLabel
		name = new JLabel("Enter the movie name * : ");
		this.add(name);
		// isimKutusu : JTextField
		nameBox = new JTextField(20);
		this.add(nameBox);
		nameBox.setBounds(0, 0, 50, 50);
		// Date year = new

		year = new JLabel("Year : ");
		this.add(year);
		//JComboBox combo = new JComboBox();
		
	    int i;
		for (i = 1900; i <= 2015; i++) {

			combo.addItem(i);
		}
		this.add(combo);
		
		

		country = new JLabel("Country : ");
		this.add(country);
		countryBox = new JTextField(20);
		this.add(countryBox);

		directorName = new JLabel("Director's Name : ");
		this.add(directorName);
		directorNameBox = new JTextField(20);
		this.add(directorNameBox);

		final JFileChooser fileChooser = new JFileChooser();
		final JButton fileChooserButton = new JButton("Open");
		this.add(fileChooserButton);

		fileChooserButton.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				int returnValue = fileChooser.showOpenDialog(AddGUI.this);

				if (returnValue == JFileChooser.APPROVE_OPTION) {
					File movieFile = fileChooser.getSelectedFile();
					// DbPathAdd DbPath = new DbPathAdd();
					// DbPath.DbPathAdd(movieFile.getPath());
					path = movieFile.getPath();

				}
			}
		});

		//final List<JCheckBox> checkBoxList = new ArrayList<JCheckBox>();

		this.add(new JLabel("Type : "));

		comedy = new JCheckBox("Comedy");
		this.add(comedy);
		checkBoxList.add(comedy);

		JCheckBox action = new JCheckBox("Action");
		this.add(action);
		checkBoxList.add(action);

		JCheckBox adventure = new JCheckBox("Adventure");
		this.add(adventure);
		checkBoxList.add(adventure);

		JCheckBox animation = new JCheckBox("Animation");
		this.add(animation);
		checkBoxList.add(animation);

		JCheckBox biography = new JCheckBox("Biography");
		this.add(biography);
		checkBoxList.add(biography);

		JCheckBox crime = new JCheckBox("Crime");
		this.add(crime);
		checkBoxList.add(crime);

		JCheckBox documentary = new JCheckBox("Documentary");
		this.add(documentary);
		checkBoxList.add(documentary);

		JCheckBox family = new JCheckBox("Family");
		this.add(family);
		checkBoxList.add(family);

		JCheckBox fantasy = new JCheckBox("Fantasy");
		this.add(fantasy);
		checkBoxList.add(fantasy);

		JCheckBox others = new JCheckBox("Others");
		this.add(others);
		checkBoxList.add(others);

		drama = new JCheckBox("Drama");
		this.add(drama);
		checkBoxList.add(drama);

		romance = new JCheckBox("Romance");
		this.add(romance);
		checkBoxList.add(romance);

		// tamamButon : JButton
		saveButton = new JButton("SAVE");
		this.add(saveButton);

		cancelButton = new JButton("CANCEL");
		this.add(cancelButton);
		// TEMEL PENCERE ÝSLEVLERÝ
				this.setTitle("Add Interface");
				this.setLayout(new FlowLayout());
				this.setBounds(150, 150, 280, 360);
				this.setVisible(true);
				// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		
				
			  
				
		
		// Save Button

	/*saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int checkBoxNumber = 0;
				for (JCheckBox i : checkBoxList) {
					if (i.isSelected())
						checkBoxNumber++;
				}

				if (checkBoxNumber > 3)
					JOptionPane.showMessageDialog(null,
							"You can choose only three types!");
				else {
					String[] typeArray = new String[3];
					int arrayCounter = 0;
					for (JCheckBox i : checkBoxList) {
						if (i.isSelected()) {
							typeArray[arrayCounter] = i.getText();
							arrayCounter++;
						}
					}

					//nameBox.getText().isEmpty()||
					if (nameBox.getText().isEmpty()||path==null) // path not empty
						JOptionPane.showMessageDialog(null, "Fill out * parts");
					else {
						isim = nameBox.getText();
						String sehir = countryBox.getText();
						String yonetmen = directorNameBox.getText();
						int yearSelected = (Integer) combo.getSelectedItem();
						DbDataAdd DbAdd = new DbDataAdd();
						DbAdd.DataAdd(isim, sehir,yearSelected, yonetmen, path,
								typeArray[0], typeArray[1], typeArray[2]);
						hide();
					}
				}
			}

		});*/

		/*cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hide();
			}
		});*/

	}
	

	
	public JTextField getNameBox() {
		return nameBox;
	}

	public void setNameBox(JTextField nameBox) {
		this.nameBox = nameBox;
	}

	public JLabel getCountry() {
		return country;
	}

	public void setCountry(JLabel country) {
		this.country = country;
	}

	public JTextField getCountryBox() {
		return countryBox;
	}

	public void setCountryBox(JTextField countryBox) {
		this.countryBox = countryBox;
	}

	public JLabel getDirectorName() {
		return directorName;
	}

	public void setDirectorName(JLabel directorName) {
		this.directorName = directorName;
	}

	public JTextField getDirectorNameBox() {
		return directorNameBox;
	}

	public void setDirectorNameBox(JTextField directorNameBox) {
		this.directorNameBox = directorNameBox;
	}

	public JLabel getYear() {
		return year;
	}

	public void setYear(JLabel year) {
		this.year = year;
	}

	

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public JButton getSaveButton() {
		return saveButton;
	}

	public void setSaveButton(JButton saveButton) {
		this.saveButton = saveButton;
		
	}

	public JButton getCancelButton() {
		return cancelButton;
	}

	public void setCancelButton(JButton cancelButton) {
		this.cancelButton = cancelButton;
	}
	


	

	public static void main(String[] args) {
		//new AddGUI();
		//AddGUIController ad=new AddGUIController();
		 
	
		
	}
	


	public List<JCheckBox> checkboxnumbercounter()
	   { 
		
		int checkBoxNumber = 0;
		for (JCheckBox i : checkBoxList) {
			if (i.isSelected())
				checkBoxNumber++;
		}
		return checkBoxList;
	   }

}
