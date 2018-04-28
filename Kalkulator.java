package Kalkulator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Kalkulator extends JFrame {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea textArea = new JTextArea(2, 10);
	

	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();

	JButton przycisk1 = new JButton("1");
	JButton przycisk3 = new JButton("3");
	JButton przycisk4 = new JButton("4");
	JButton przycisk5 = new JButton("5");
	JButton przycisk6 = new JButton("6");
	JButton przycisk7 = new JButton("7");
	JButton przycisk8 = new JButton("8");
	JButton przycisk9 = new JButton("9");
	JButton przycisk2 = new JButton("2");
	JButton przycisk0 = new JButton("0");

	JButton przyciskPlus = new JButton("+");
	JButton przyciskMinus = new JButton("-");
	JButton przyciskRownosci = new JButton("=");
	JButton przyciskPomnoz = new JButton("*");
	JButton przyciskPodziel = new JButton("/");
	JButton przyciskUsun = new JButton("C");
	JButton przyciskKropka = new JButton(".");

	double liczba1, liczba2, wynik;
	int mnozenie = 0, dzielenie = 0, dodawanie = 0, odejmowanie = 0;

	public static void main(String[] args) {
		new Kalkulator();
	}

	public Kalkulator() {

		
		frame.add(panel);
		panel.setBackground(Color.YELLOW);

		Border border = BorderFactory.createLineBorder(Color.GREEN, 4);
		panel.setBorder(border);

		panel.add(textArea);
		textArea.setBackground(Color.WHITE);
		Border tBorder = BorderFactory.createLineBorder(Color.BLUE, 3);
		textArea.setBorder(tBorder);
		textArea.setForeground(Color.BLACK);
		textArea.setPreferredSize(new Dimension(2, 10));
		textArea.setEditable(false);
		textArea.setLineWrap(true);

		Font font = new Font("TimesNewRoman", Font.BOLD, 33);
		textArea.setFont(font);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(350, 450);

		setLayout(new GridLayout(4, 4));
		panel.setPreferredSize(new Dimension(100, 100));
		setTitle("Kalkulator");

		przycisk1.setPreferredSize(new Dimension(100, 42));
		przycisk2.setPreferredSize(new Dimension(100, 42));
		przycisk3.setPreferredSize(new Dimension(100, 42));
		przycisk4.setPreferredSize(new Dimension(100, 42));
		przycisk5.setPreferredSize(new Dimension(100, 42));
		przycisk6.setPreferredSize(new Dimension(100, 42));
		przycisk7.setPreferredSize(new Dimension(100, 42));
		przycisk8.setPreferredSize(new Dimension(100, 42));
		przycisk9.setPreferredSize(new Dimension(100, 42));
		przycisk0.setPreferredSize(new Dimension(100, 42));
		przyciskPlus.setPreferredSize(new Dimension(100, 42));
		przyciskMinus.setPreferredSize(new Dimension(100, 42));
		przyciskPomnoz.setPreferredSize(new Dimension(100, 42));
		przyciskPodziel.setPreferredSize(new Dimension(100, 42));
		przyciskRownosci.setPreferredSize(new Dimension(205, 42));
		przyciskUsun.setPreferredSize(new Dimension(100, 42));
		przyciskKropka.setPreferredSize(new Dimension(100, 42));

		panel.add(przycisk8);
		panel.add(przycisk9);
		panel.add(przyciskUsun);
		panel.add(przycisk6);
		panel.add(przycisk7);
		panel.add(przyciskPodziel);
		panel.add(przycisk4);
		panel.add(przycisk5);
		panel.add(przyciskPomnoz);
		panel.add(przycisk2);
		panel.add(przycisk3);
		panel.add(przyciskMinus);
		panel.add(przycisk0);
		panel.add(przycisk1);
		panel.add(przyciskPlus);
		panel.add(przyciskKropka);
		panel.add(przyciskRownosci);

		pack();
		frame.setVisible(true);
		panel.setVisible(true);

		

		przyciskPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				liczba1 = liczba();
				textArea.setText("");

				mnozenie = 0;
				dodawanie = 1;
				dzielenie = 0;
				odejmowanie = 0;
			}
		});

		przyciskMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				liczba1 = liczba();
				textArea.setText("");

				mnozenie = 0;
				dodawanie = 0;
				dzielenie = 0;
				odejmowanie = 1;
			}
		});

		przyciskPomnoz.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				liczba1 = liczba();
				textArea.setText("");

				mnozenie = 1;
				dodawanie = 0;
				dzielenie = 0;
				odejmowanie = 0;
			}
		});

		przyciskPodziel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				liczba1 = liczba();
				textArea.setText("");

				mnozenie = 0;
				dodawanie = 0;
				dzielenie = 1;
				odejmowanie = 0;
			}
		});

		przyciskUsun.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				liczba1 = 0;
				liczba2 = 0;
				textArea.setText("");

			}
		});

		przyciskKropka.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				textArea.append(".");
			}
		});

		przyciskRownosci.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				liczba2 = liczba();
				

				if (dodawanie > 0) {
					wynik = liczba1 + liczba2;
					textArea.setText(Double.toString(wynik));
				}
				else if (odejmowanie > 0) {
					wynik = liczba1 - liczba2;
					textArea.setText(Double.toString(wynik));
				}
				else if (mnozenie > 0) {
					wynik = liczba1 * liczba2;
					textArea.setText(Double.toString(wynik));
				}
				else if (dzielenie > 0) {
					wynik = liczba1 / liczba2;
					textArea.setText(Double.toString(wynik));

				}
			}
		});

		przycisk1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("1");
			}
		});

		przycisk2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("2");
			}
		});
		przycisk3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("3");
			}
		});
		przycisk4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("4");
			}
		});
		przycisk5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("5");
			}
		});
		przycisk6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("6");
			}
		});
		przycisk7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("7");
			}
		});
		przycisk8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("8");
			}
		});

		przycisk9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("9");
			}
		});
		przycisk0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("0");
			}
		});

	}

	public double liczba() {
		double liczba1;
		String s;
		s = textArea.getText();
		liczba1 = Double.valueOf(s);
		return liczba1;
	}
}