package diaryGUI;

import javax.swing.JFrame;

import newentry.diaryGUI.NewEntryGUI;
import table.diaryGUI.EntryDisplayer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MainFrame extends JFrame {

	private JButton newEntry = new JButton("New Entry");
	private JButton viewEntry = new JButton("View Past Entries");

	public MainFrame() {

		createUI();
	}

	private void createUI(){
		
		
		//frame
		setBounds(100, 100, 529, 313);
		getContentPane().setLayout(null);
		newEntry.setBounds(12, 28, 158, 71);
		getContentPane().add(newEntry);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Diary");
		
		//button
		newEntry.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				NewEntryGUI entry = new NewEntryGUI();
				entry.setVisible(true);
				
				
			}
		});
		viewEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EntryDisplayer table = new EntryDisplayer();
				table.setVisible(true);
			}
		});
		viewEntry.setBounds(12, 149, 158, 71);
		getContentPane().add(viewEntry);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(200, 252, 117, 25);
		getContentPane().add(btnExit);
	}
}
