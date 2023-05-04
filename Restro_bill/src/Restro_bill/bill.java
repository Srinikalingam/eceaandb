package Restro_bill;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bill {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
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
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Restro Bill");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(116, 11, 181, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblMenu.setBounds(22, 66, 181, 44);
		frame.getContentPane().add(lblMenu);
		
		JLabel lblQnty = new JLabel("Qnty");
		lblQnty.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblQnty.setBounds(22, 134, 181, 44);
		frame.getContentPane().add(lblQnty);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.BOLD, 20));
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Tea - Rs.10", "Coffee - Rs.30", "Maggiee - Rs. 50", "Ice-cream -  Rs.120"}));
		c1.setBounds(126, 66, 171, 44);
		frame.getContentPane().add(c1);
		
		t1 = new JTextField();
		t1.setBounds(131, 134, 166, 29);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("Order");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String item=(String) c1.getSelectedItem();
				String qnty=t1.getText();
				int q=Integer.parseInt(qnty);
				int bill=0;
				if(item.equals("Tea - Rs.10"))
				{
					bill=q*10;
					JOptionPane.showMessageDialog
					(btnNewButton, "hello \n Selected item: "+item+
							"\n Qnty: "+q+" \n your bill:"+bill);
				}
				else if(item.equals("Coffee - Rs.30"))
				{
					bill=q*30;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item:"+item+"\n Qnty: "+q+" \n your bill:"+bill);
				}
				else if(item.equals("Maggiee - Rs. 50"))
				{
					bill=q*50;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item:"+item+"\n Qnty: "+q+" \n your bill:"+bill);
				}
				else if(item.equals("Ice-cream -  Rs.120"))
				{
					bill=q*120;
					JOptionPane.showMessageDialog(btnNewButton, "hello \n Selected item:"+item+"\n Qnty: "+q+" \n your bill:"+bill);
				}
				
				
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(116, 204, 106, 46);
		frame.getContentPane().add(btnNewButton);
	}
}
