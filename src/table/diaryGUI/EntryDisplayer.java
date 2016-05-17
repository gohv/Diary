package table.diaryGUI;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.opencsv.CSVReader;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntryDisplayer extends JFrame {

	private static final long serialVersionUID = 1L;

	public EntryDisplayer() {
		try {
			createUI();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void createUI() throws FileNotFoundException {
		try {
			CSVReader reader = new CSVReader(new FileReader("file/Diary.csv"));
			List<String[]> myEntries = reader.readAll();
			String[] colNames = { "Date", "Entry" };
			DefaultTableModel tableModel = new DefaultTableModel(colNames, myEntries.size() - 1);
			int rowcount = tableModel.getRowCount();
			for (int x = 0; x < rowcount + 1; x++) {
				int columnnumber = 0;

				if (x > 0) {
					for (String thiscellvalue : (String[]) myEntries.get(x)) {
						tableModel.setValueAt(thiscellvalue, x - 1, columnnumber);
						columnnumber++;
					}
				}

			}
			JTable table = new JTable(tableModel);
			setBounds(50, 50, 800, 300);
			JScrollPane scrollPane = new JScrollPane(table);
			scrollPane.setBounds(12, 13, 577, 246);
			getContentPane().add(scrollPane);
			getContentPane().setLayout(null);

			JButton btnClose = new JButton("Close");
			btnClose.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnClose.setBounds(239, 263, 117, 25);
			getContentPane().add(btnClose);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}