package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ListModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import Model.*;
import View.AddGUI;

public class AddGUIController  {

	 AddGUI a=new AddGUI();

public AddGUIController() {
	// TODO Auto-generated constructor stub
	
	
     a.getCancelButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.hide();
			}
		});
     a.getSaveButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int checkBoxNumber = 0;
				
				final List<JCheckBox> checkBoxList2 = new ArrayList<JCheckBox>(a.checkboxnumbercounter());

				for (JCheckBox i : checkBoxList2) {
					if (i.isSelected())
						checkBoxNumber++;
				}

				if (checkBoxNumber > 3)
					JOptionPane.showMessageDialog(null,
							"You can choose only three types!");
				else {
					String[] typeArray1 = new String[3];
					int arrayCounter = 0;
					for (JCheckBox i : checkBoxList2) {
						if (i.isSelected()) {
							typeArray1[arrayCounter] = i.getText();
							arrayCounter++;
						}
					}

					
					if (a.getNameBox().getText().isEmpty()||a.getPath()==null) // path not empty
						JOptionPane.showMessageDialog(null, "Fill out * parts");
					else {
						
						
						String isim;
						
						isim= a.getNameBox().getText();
						
						String sehir = a.getCountryBox().getText();
						String yonetmen = a.getDirectorNameBox().getText();
						
						
					int yearSelected = (Integer) a.combo.getSelectedItem();
						//int yearSelected=1905;
						DbDataAdd DbAdd = new DbDataAdd();
						DbAdd.DataAdd(isim, sehir,yearSelected, yonetmen, a.getPath(),
								typeArray1[0], typeArray1[1], typeArray1[2]);
						
					}
				}
			}

			

		});
	
}
 private void add(JComboBox combo) {
	// TODO Auto-generated method stub
	
}
public static void main(String[] args){
	
 }


}





	


