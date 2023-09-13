import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frame;
	private JTextField tf;
	double first,second;
	String op;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("SCIENTIFIC CALCULATOR");
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.setBounds(100, 100, 296, 428);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl = new JLabel("SCIENTIFIC CALCULATOR");
		lbl.setBounds(10, 11, 261, 26);
		lbl.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		frame.getContentPane().add(lbl);
		
		tf = new JTextField();
		tf.setBounds(10, 48, 261, 33);
		frame.getContentPane().add(tf);
		tf.setColumns(10);
		
		final JButton btnclr = new JButton("C");
		btnclr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(null);
				
			}
		});
		btnclr.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnclr.setBounds(10, 134, 51, 41);
		frame.getContentPane().add(btnclr);
		
		final JButton btnsin = new JButton("sin");
		btnsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Math.sin(Double.parseDouble(tf.getText()) );
				tf.setText("");
				tf.setText(tf.getText()+a);
				
			}
		});
		btnsin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnsin.setBounds(10, 175, 85, 41);
		frame.getContentPane().add(btnsin);
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=tf.getText()+"7";
				tf.setText(num);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.setBounds(10, 216, 51, 41);
		frame.getContentPane().add(btn7);
		
		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=tf.getText()+"4";
				tf.setText(num);
				
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn4.setBounds(10, 257, 51, 41);
		frame.getContentPane().add(btn4);
		
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=tf.getText()+"1";
				tf.setText(num);
				
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.setBounds(10, 299, 51, 41);
		frame.getContentPane().add(btn1);
		
		final JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=tf.getText()+"00";
				tf.setText(num);
				
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn00.setBounds(10, 340, 51, 41);
		frame.getContentPane().add(btn00);
		
		final JButton btnlog = new JButton("log");
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Math.log(Double.parseDouble(tf.getText()) );
				tf.setText("");
				tf.setText(tf.getText()+a);
				
			}
		});
		btnlog.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnlog.setBounds(63, 134, 51, 41);
		frame.getContentPane().add(btnlog);
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=tf.getText()+"8";
				tf.setText(num);
				
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn8.setBounds(63, 216, 51, 41);
		frame.getContentPane().add(btn8);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=tf.getText()+"5";
				tf.setText(num);
				
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn5.setBounds(63, 257, 51, 41);
		frame.getContentPane().add(btn5);
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=tf.getText()+"2";
				tf.setText(num);
				
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.setBounds(63, 299, 51, 41);
		frame.getContentPane().add(btn2);
		
		final JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=tf.getText()+"0";
				tf.setText(num);
				
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn0.setBounds(63, 340, 51, 41);
		frame.getContentPane().add(btn0);
		
		final JButton btnexp = new JButton("e^x");
		btnexp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Math.exp(Double.parseDouble(tf.getText()) );
				tf.setText("");
				tf.setText(tf.getText()+a);
				
			}
		});
		btnexp.setFont(new Font("Trebuchet MS", Font.PLAIN, 10));
		btnexp.setBounds(115, 134, 51, 41);
		frame.getContentPane().add(btnexp);
		
		final JButton btncos = new JButton("cos");
		btncos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Math.cos(Double.parseDouble(tf.getText()) );
				tf.setText("");
				tf.setText(tf.getText()+a);
				
			}
		});
		btncos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btncos.setBounds(95, 175, 98, 41);
		frame.getContentPane().add(btncos);
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=tf.getText()+"9";
				tf.setText(num);
				
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn9.setBounds(115, 216, 51, 41);
		frame.getContentPane().add(btn9);
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=tf.getText()+"6";
				tf.setText(num);
				
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn6.setBounds(115, 257, 51, 41);
		frame.getContentPane().add(btn6);
		
		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=tf.getText()+"3";
				tf.setText(num);
				
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn3.setBounds(115, 299, 51, 41);
		frame.getContentPane().add(btn3);
		
		final JButton btnd = new JButton(".");
		btnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=tf.getText()+".";
				tf.setText(num);
				
			}
		});
		btnd.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnd.setBounds(115, 340, 51, 41);
		frame.getContentPane().add(btnd);
		
		final JButton btnr = new JButton("\u221A");
		btnr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Math.sqrt(Double.parseDouble(tf.getText()) );
				tf.setText("");
				tf.setText(tf.getText()+a);
				
			}
		});
		btnr.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnr.setBounds(168, 134, 51, 41);
		frame.getContentPane().add(btnr);
		
		final JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(tf.getText());
				op="+";
				tf.setText("");		
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnplus.setBounds(168, 216, 51, 41);
		frame.getContentPane().add(btnplus);
		
		final JButton btnmin = new JButton("-");
		btnmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(tf.getText());
				op="-";
				tf.setText("");		
			}
		});
		btnmin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnmin.setBounds(168, 257, 51, 41);
		frame.getContentPane().add(btnmin);
		
		final JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(tf.getText());
				op="*";
				tf.setText("");		
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnmul.setBounds(168, 299, 51, 41);
		frame.getContentPane().add(btnmul);
		
		final JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(tf.getText());
				op="/";
				tf.setText("");		
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 16));
		btndiv.setBounds(168, 340, 51, 41);
		frame.getContentPane().add(btndiv);
		
		final JButton btnfact = new JButton("!");
		btnfact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= (Double.parseDouble(tf.getText()) );
				double f=1;
				while(a>0) {
					f*=a;
					a--;
				}
				tf.setText("");
				tf.setText(tf.getText()+f);
				
			}
		});
		btnfact.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnfact.setBounds(221, 134, 51, 41);
		frame.getContentPane().add(btnfact);
		
		final JButton btntan = new JButton("tan");
		btntan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Math.tan(Double.parseDouble(tf.getText()) );
				tf.setText("");
				tf.setText(tf.getText()+a);
				
			}
		});
		btntan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btntan.setBounds(193, 175, 79, 41);
		frame.getContentPane().add(btntan);
		
		final JButton btnbs = new JButton("<-");
		btnbs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bs=null;
				StringBuilder str= new StringBuilder(tf.getText());
				str.deleteCharAt(tf.getText().length()-1);
				bs=str.toString();
				tf.setText(bs);
				
			}
		});
		btnbs.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnbs.setBounds(221, 216, 51, 41);
		frame.getContentPane().add(btnbs);
		
		final JButton btnmod = new JButton("%");
		btnmod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(tf.getText());
				op="%";
				tf.setText("");		
			}
		});
		btnmod.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnmod.setBounds(221, 257, 51, 41);
		frame.getContentPane().add(btnmod);
		
		final JButton btneql = new JButton("=");
		btneql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double res;
				second =(Double.parseDouble(tf.getText()) );
				if(op=="+") {
					res=first+second;
					tf.setText(""+res);
				}
				else if(op=="-") {
					res=first-second;
					tf.setText(""+res);
				}
				else if(op=="*") {
					res=first*second;
					tf.setText(""+res);
				}
				else if(op=="/") {
					res=first/second;
					tf.setText(""+res);
				}
				else if(op=="%") {
					res=first%second;
					tf.setText(""+res);
				}
				
			}
		});
		btneql.setFont(new Font("Tahoma", Font.BOLD, 16));
		btneql.setBounds(221, 299, 51, 82);
		frame.getContentPane().add(btneql);
		
		
		JRadioButton rdbtnon = new JRadioButton("on");
		rdbtnon.setSelected(true);
		rdbtnon.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				btn0.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btn00.setEnabled(true);
				btnd.setEnabled(true);
				btneql.setEnabled(true);
				btnplus.setEnabled(true);
				btnmin.setEnabled(true);
				btnmul.setEnabled(true);
				btnmod.setEnabled(true);
				btndiv.setEnabled(true);
				btnlog.setEnabled(true);
				btnexp.setEnabled(true);
				btnfact.setEnabled(true);
				btnr.setEnabled(true);
				btnbs.setEnabled(true);
				btnsin.setEnabled(true);
				btncos.setEnabled(true);
				btntan.setEnabled(true);
				btnclr.setEnabled(true);
			}
			
		});
		rdbtnon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnon.setBounds(6, 88, 55, 23);
		frame.getContentPane().add(rdbtnon);
		
		JRadioButton rdbtnOff = new JRadioButton("off");
		rdbtnOff.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				btn0.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btn00.setEnabled(false);
				btnd.setEnabled(false);
				btneql.setEnabled(false);
				btnplus.setEnabled(false);
				btnmin.setEnabled(false);
				btnmul.setEnabled(false);
				btnmod.setEnabled(false);
				btndiv.setEnabled(false);
				btnlog.setEnabled(false);
				btnexp.setEnabled(false);
				btnfact.setEnabled(false);
				btnr.setEnabled(false);
				btnbs.setEnabled(false);
				btnsin.setEnabled(false);
				btncos.setEnabled(false);
				btntan.setEnabled(false);
				btnclr.setEnabled(false);
				tf.setText(null);
				
				
			}
			
		});
		rdbtnOff.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnOff.setBounds(63, 88, 55, 23);
		frame.getContentPane().add(rdbtnOff);
		
		ButtonGroup bg= new ButtonGroup();
		bg.add(rdbtnOff);
		bg.add(rdbtnon);

     	
	}
}
