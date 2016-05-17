package newentry.diaryGUI;

import javax.swing.JFrame;

import fileserver.FileService;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;

import diary.diaryholder.DiaryHolder;

public class NewEntryGUI extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel Jdate = new JLabel("Date: ");
	private JTextField dateField = new JTextField();;
	private JTextArea textArea = new JTextArea();
	
	public NewEntryGUI() {
		createUI();
	}

	private void createUI(){
		
		setBounds(100, 100, 563, 441);
		getContentPane().setLayout(null);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save();
				dispose();
			}
		});
		btnSave.setBounds(12, 346, 150, 53);
		getContentPane().add(btnSave);		
		textArea.setBounds(12, 86, 523, 180);
		getContentPane().add(textArea);
	
		Jdate.setBounds(12, 12, 80, 13);
		getContentPane().add(Jdate);
		
		
		
		dateField.setBounds(22, 33, 127, 27);
		getContentPane().add(dateField);
		dateField.setColumns(10);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		cancelButton.setBounds(356, 346, 150, 53);
		getContentPane().add(cancelButton);
		
		
	}
	

	
	private void save(){
		String getTextArea = textArea.getText();
		String getDate = dateField.getText();
		DiaryHolder diary = new DiaryHolder(getDate, getTextArea);
		FileService.add(diary);
	}
}
