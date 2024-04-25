package lognpage.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollBar;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class metro {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metro window = new metro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public metro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METRO TICKETS BOOKING");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(107, 11, 215, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SCOURCE");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(55, 96, 77, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DESTNATION");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(55, 133, 112, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(50, 138, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(60, 168, 46, 0);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("TICKET NO");
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(60, 160, 77, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JSpinner jsp1 = new JSpinner();
		jsp1.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		jsp1.setBounds(235, 158, 87, 20);
		frame.getContentPane().add(jsp1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"JNTH", "KPHB", "BALANAGAR", "NIZAMPET"}));
		cb2.setBounds(235, 130, 87, 22);
		frame.getContentPane().add(cb2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"JNTH", "KPHB", "BALANAGAR", "NIZAMPET"}));
		cb1.setBounds(235, 94, 87, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_6 = new JLabel("NAME");
		lblNewLabel_6.setForeground(new Color(255, 0, 0));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(55, 65, 72, 20);
		frame.getContentPane().add(lblNewLabel_6);
		
		tb1 = new JTextField();
		tb1.setBounds(235, 67, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=tb1.getText();
				String s=(String) cb1.getSelectedItem();
				String d=(String) cb2.getSelectedItem();
				int nt=(int)jsp1.getValue();
				int bill=0;
				if(s.equals(d)) {
					JOptionPane.showMessageDialog(btnNewButton, "please check station");
				}
				else {
					bill=bill+nt*100;
					JOptionPane.showConfirmDialog(btnNewButton, "name :"+name+
							"\n source :"+s+"\n Destination : "+d+
							"\nNumber of tickets : "+nt+"\n Amount : "+bill+
							"\n🤙👊!!--HAPPY JOURNEY--!!🤙👊");
				}
		
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton.setBounds(211, 204, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(0, 18, -29, -40);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(0, 24, 38, 0);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\online\\Downloads\\venketsh gay.jpg"));
		lblNewLabel_9.setBounds(-462, -12, 896, 273);
		frame.getContentPane().add(lblNewLabel_9);
	}
}
