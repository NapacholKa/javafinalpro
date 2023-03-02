package finalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class Waffle4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Waffle4 frame = new Waffle4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Waffle4() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\D4bby\\Downloads\\0d1e70fd160476a3f78496be79e0813e.png"));
		setTitle("Waffle Nanoom");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(254, 251, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSmall = new JLabel("Medium");
		lblSmall.setForeground(new Color(255, 132, 72));
		lblSmall.setFont(new Font("Yu Mincho", Font.BOLD, 60));
		lblSmall.setBackground(new Color(255, 132, 72));
		lblSmall.setBounds(315, 24, 257, 117);
		contentPane.add(lblSmall);
		
		JRadioButton medium_Origin = new JRadioButton("Original");
		medium_Origin.setHorizontalAlignment(SwingConstants.CENTER);
		medium_Origin.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		medium_Origin.setBackground(new Color(254, 251, 205));
		medium_Origin.setForeground(new Color(255, 132, 72));
		medium_Origin.setBounds(301, 141, 149, 40);
		contentPane.add(medium_Origin);
		
		JRadioButton medium_Choc = new JRadioButton("Chocolate");
		medium_Choc.setHorizontalAlignment(SwingConstants.CENTER);
		medium_Choc.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		medium_Choc.setBackground(new Color(254, 251, 205));
		medium_Choc.setForeground(new Color(255, 132, 72));
		medium_Choc.setBounds(548, 188, 210, 93);
		contentPane.add(medium_Choc);
		
		JRadioButton medium_Strawberry = new JRadioButton("Strawberry");
		medium_Strawberry.setHorizontalAlignment(SwingConstants.CENTER);
		medium_Strawberry.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		medium_Strawberry.setBackground(new Color(254, 251, 205));
		medium_Strawberry.setForeground(new Color(255, 132, 72));
		medium_Strawberry.setBounds(295, 202, 202, 65);
		contentPane.add(medium_Strawberry);
		
		JRadioButton medium_Green = new JRadioButton("Green Tea");
		medium_Green.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		medium_Green.setHorizontalAlignment(SwingConstants.CENTER);
		medium_Green.setBackground(new Color(254, 251, 205));
		medium_Green.setForeground(new Color(255, 132, 72));
		medium_Green.setBounds(551, 133, 202, 57);
		contentPane.add(medium_Green);
		
		ButtonGroup group = new ButtonGroup();
		group.add(medium_Origin);
		group.add(medium_Choc);
		group.add(medium_Strawberry);
		group.add(medium_Green);
		
		JLabel lblFlour = new JLabel("Flour :");
		lblFlour.setForeground(new Color(255, 132, 72));
		lblFlour.setFont(new Font("Yu Mincho", Font.BOLD, 32));
		lblFlour.setBackground(new Color(255, 132, 72));
		lblFlour.setBounds(137, 128, 119, 65);
		contentPane.add(lblFlour);
		
		JLabel lblTopping = new JLabel("Topping :");
		lblTopping.setForeground(new Color(255, 132, 72));
		lblTopping.setFont(new Font("Yu Mincho", Font.BOLD, 32));
		lblTopping.setBackground(new Color(255, 132, 72));
		lblTopping.setBounds(91, 297, 163, 54);
		contentPane.add(lblTopping);
		
		JComboBox<String> medium_Topping1 = new JComboBox<String>();
		medium_Topping1.setFont(new Font("Yu Mincho", Font.BOLD, 26));
		medium_Topping1.addItem("-");
		medium_Topping1.addItem("Corn");
		medium_Topping1.addItem("Crab strick");
		medium_Topping1.addItem("Currant");
		medium_Topping1.addItem("Foytong");
		medium_Topping1.addItem("Pumpkin");
		medium_Topping1.addItem("Coconut");
		medium_Topping1.addItem("Taro");
		medium_Topping1.addItem("Purple Sweet Potato");
		medium_Topping1.addItem("Banana");
		medium_Topping1.addItem("Chocolate chip");
		medium_Topping1.addItem("Ham");
		medium_Topping1.addItem("Cheddar Cheese");
		medium_Topping1.addItem("Strawberryy Yam");
		//medium_Topping1.setModel(new DefaultComboBoxModel(new String[] {"-", "Corn", "Crab strick", "Currant", "Foytong", "Pumpkin", "Coconut", "Taro", "Purple Sweet Potato", "Banana", "Chocolate chip", "Ham", "Cheddar Cheese", "Strawberryy Yam"}));
		medium_Topping1.setToolTipText("");
		medium_Topping1.setBounds(264, 310, 330, 30);
		contentPane.add(medium_Topping1);
		
		JLabel lblTopping_2 = new JLabel("Topping :");
		lblTopping_2.setForeground(new Color(255, 132, 72));
		lblTopping_2.setFont(new Font("Yu Mincho", Font.BOLD, 32));
		lblTopping_2.setBackground(new Color(255, 132, 72));
		lblTopping_2.setBounds(91, 351, 163, 54);
		contentPane.add(lblTopping_2);
		
		JComboBox<String> medium_Topping2 = new JComboBox<String>();
		medium_Topping2.addItem("-");
		medium_Topping2.addItem("Corn");
		medium_Topping2.addItem("Crab strick");
		medium_Topping2.addItem("Currant");
		medium_Topping2.addItem("Foytong");
		medium_Topping2.addItem("Pumpkin");
		medium_Topping2.addItem("Coconut");
		medium_Topping2.addItem("Taro");
		medium_Topping2.addItem("Purple Sweet Potato");
		medium_Topping2.addItem("Banana");
		medium_Topping2.addItem("Chocolate chip");
		medium_Topping2.addItem("Ham");
		medium_Topping2.addItem("Cheddar Cheese");
		medium_Topping2.addItem("Strawberryy Yam");
		//medium_Topping2.setModel(new DefaultComboBoxModel(new String[] {"-", "Corn", "Crab strick", "Currant", "Foytong", "Pumpkin", "Coconut", "Taro", "Purple Sweet Potato", "Banana", "Chocolate chip", "Ham", "Cheddar Cheese", "Strawberryy Yam"}));
		medium_Topping2.setToolTipText("");
		medium_Topping2.setFont(new Font("Yu Mincho", Font.BOLD, 26));
		medium_Topping2.setBounds(264, 364, 330, 30);
		contentPane.add(medium_Topping2);
		
		JLabel lblNewLabel = new JLabel("Waffle Nanoom");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setForeground(new Color(255, 132, 72));
		lblNewLabel.setFont(new Font("Yu Mincho", Font.BOLD, 18));
		lblNewLabel.setBounds(85, 586, 163, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\D4bby\\OneDrive\\เดสก์ท็อป\\photo gui\\0d1e70fd160476a3f78496be79e0813e-65x75.png"));
		lblNewLabel_1.setBounds(10, 551, 65, 75);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblTopping_1 = new JLabel("Topping :");
		lblTopping_1.setForeground(new Color(255, 132, 72));
		lblTopping_1.setFont(new Font("Yu Mincho", Font.BOLD, 32));
		lblTopping_1.setBackground(new Color(255, 132, 72));
		lblTopping_1.setBounds(91, 415, 163, 54);
		contentPane.add(lblTopping_1);
		
		JComboBox<String> medium_Topping3 = new JComboBox<String>();
		medium_Topping3.addItem("-");
		medium_Topping3.addItem("Corn");
		medium_Topping3.addItem("Crab strick");
		medium_Topping3.addItem("Currant");
		medium_Topping3.addItem("Foytong");
		medium_Topping3.addItem("Pumpkin");
		medium_Topping3.addItem("Coconut");
		medium_Topping3.addItem("Taro");
		medium_Topping3.addItem("Purple Sweet Potato");
		medium_Topping3.addItem("Banana");
		medium_Topping3.addItem("Chocolate chip");
		medium_Topping3.addItem("Ham");
		medium_Topping3.addItem("Cheddar Cheese");
		medium_Topping3.addItem("Strawberryy Yam");
		//medium_Topping3.setModel(new DefaultComboBoxModel(new String[] {"-", "Corn", "Crab strick", "Currant", "Foytong", "Pumpkin", "Coconut", "Taro", "Purple Sweet Potato", "Banana", "Chocolate chip", "Ham", "Cheddar Cheese", "Strawberryy Yam"}));
		medium_Topping3.setToolTipText("");
		medium_Topping3.setFont(new Font("Yu Mincho", Font.BOLD, 26));
		medium_Topping3.setBounds(264, 428, 330, 30);
		contentPane.add(medium_Topping3);
		
		
		JLabel lblPer = new JLabel("10 ฿ per topping");
		lblPer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPer.setForeground(new Color(255, 132, 72));
		lblPer.setFont(new Font("Yu Mincho", Font.BOLD, 16));
		lblPer.setBackground(new Color(255, 132, 72));
		lblPer.setBounds(315, 468, 257, 54);
		contentPane.add(lblPer);
		
		JButton medium_Next = new JButton("Next");
		medium_Next.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				Waffledis dis = new Waffledis();
				dis.show();
                dispose();
			}
		});
		medium_Next.setVerticalAlignment(SwingConstants.BOTTOM);
		medium_Next.setForeground(new Color(255, 132, 72));
		medium_Next.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		medium_Next.setBackground(Color.WHITE);
		medium_Next.setBounds(418, 574, 194, 52);
		contentPane.add(medium_Next);
		
		JButton medium_Back = new JButton("Back");
		medium_Back.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				Waffle2 back = new Waffle2 ();
				back.show();
				dispose();
			}
		});
		medium_Back.setVerticalAlignment(SwingConstants.BOTTOM);
		medium_Back.setForeground(new Color(255, 132, 72));
		medium_Back.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		medium_Back.setBackground(Color.WHITE);
		medium_Back.setBounds(648, 574, 194, 52);
		contentPane.add(medium_Back);
		
		JButton Code = new JButton("Code");
		Code.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				Waffledis dis = new Waffledis();
				dis.show();
                dispose();
			}
		});
		Code.setVerticalAlignment(SwingConstants.BOTTOM);
		Code.setForeground(new Color(255, 132, 72));
		Code.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		Code.setBackground(Color.WHITE);
		Code.setBounds(648, 489, 194, 52);
		contentPane.add(Code);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\TNI107\\—Pngtree—bunny rabbit icon_3568157 (1).png"));
		lblNewLabel_2.setBounds(220, 569, 102, 81);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\TNI107\\chinese-mandarin-1 (1) (1).png"));
		lblNewLabel_3.setBounds(235, 130, 54, 51);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\TNI107\\วิตามินซี-สตรอเบอร์รี่ (1) (1).png"));
		lblNewLabel_4.setBounds(220, 200, 69, 65);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\TNI107\\iStock_000016088140_Small-600x387_(1)-transformed.png"));
		lblNewLabel_5.setBounds(752, 200, 90, 65);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\TNI107\\ชาเขียวมัทฉะ-300x180_(1)-transformed.png"));
		lblNewLabel_6.setBounds(752, 128, 90, 57);
		contentPane.add(lblNewLabel_6);
	}
}