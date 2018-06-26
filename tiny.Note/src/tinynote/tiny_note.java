package tinynote;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tiny_note {
	private static JTextField txtBlapplapplxyz;

	public static void main(String[] args) {
		JFrame tinyNote = new JFrame();
		tinyNote.setResizable(false);
		tinyNote.setTitle("the.tinyNote");
		tinyNote.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tinyNote.setAlwaysOnTop(true);
		tinyNote.getContentPane().setLayout(null);
		tinyNote.setSize(200, 200);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(0, 28, 200, 132);
		tinyNote.getContentPane().add(scrollPane);
		
		JEditorPane dtrpnTinynote = new JEditorPane();
		scrollPane.setViewportView(dtrpnTinynote);
		dtrpnTinynote.setText("tinyNote");
		
		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dtrpnTinynote.setText("About tiny note. \n\ntinyNote was made with \nWindowBuilder, a plugin for eclipse that builds a gui for you.");
			}
		});
		btnAbout.setBounds(0, 0, 63, 29);
		tinyNote.getContentPane().add(btnAbout);
		
		JButton btnGrab = new JButton("Clear");
		btnGrab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				dtrpnTinynote.setText("");
			}
		});
		btnGrab.setBounds(62, 0, 76, 29);
		tinyNote.getContentPane().add(btnGrab);
		
		JButton btnMore = new JButton("Log");
		btnMore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dtrpnTinynote.setText("tinyNote update log!\n\nv0.0.2/a----------------\n- Added button\nfunctionality\n\nv0.0.1/a----------------\n- Added a JEditorPane inside of a JScrollPane");
			}
		});
		btnMore.setBounds(137, 0, 63, 29);
		tinyNote.getContentPane().add(btnMore);
		
		JLabel lblClosedalpha = new JLabel("v.0.0.2\\a");
		lblClosedalpha.setBounds(137, 162, 63, 16);
		tinyNote.getContentPane().add(lblClosedalpha);
		
		txtBlapplapplxyz = new JTextField();
		txtBlapplapplxyz.setBackground(SystemColor.window);
		txtBlapplapplxyz.setEditable(false);
		txtBlapplapplxyz.setText("blapplappl.xyz");
		txtBlapplapplxyz.setBounds(0, 156, 134, 22);
		tinyNote.getContentPane().add(txtBlapplapplxyz);
		txtBlapplapplxyz.setColumns(10);
		
		tinyNote.setVisible(true);
	}
}
