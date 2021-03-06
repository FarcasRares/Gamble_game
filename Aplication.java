package Gamble_Game;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Aplication extends JFrame {
	JFrame frame;
	JPanel p1;
	JButton Dice;
	JButton Start;
	JButton Quit;
	JButton Quit2;
	JButton close;
	TextArea chat;
	Random rand=new Random();
	JLabel Score;
	JLabel You;
	JLabel Opponent;
	int yo,op;
	JLabel YouCount;
	JLabel OpponentCount;
	JButton Restart;
	Aplication(String text)
	{
		frame=new JFrame (text);
		frame.setLayout(null);
		
		p1=new JPanel();
		p1.setBounds(0,0,700,400);
		p1.setVisible(false);
		p1.setLayout(null);
		p1.setBackground(new Color(120,130,255));
		frame.add(p1);
		
		Start=new JButton("Start");
		Start.setBounds(250,120,200,100);
		Start.setFont(new Font("Arial",Font.BOLD,22));
		Start.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Start.setVisible(false);
				Quit.setVisible(false);
				p1.setVisible(true);
				yo=0;
				op=0;
			}
			
		});
		frame.add(Start);
		
		Quit=new JButton("Quit");
		Quit.setBounds(20,300,80,50);
		Quit.setFont(new Font("Arial",Font.BOLD,14));
		Quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}			
		});
		frame.add(Quit);
		
		Quit2=new JButton("Quit");
		Quit2.setBounds(20,300,80,50);
		Quit2.setFont(new Font("Arial",Font.BOLD,14));
		Quit2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}			
		});
		p1.add(Quit2);
		
		close=new JButton("Close");
		close.setBounds(580,300,80,50);
		close.setFont(new Font("Arial",Font.BOLD,14));
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1.setVisible(false);
				Start.setVisible(true);
				Quit.setVisible(true);
			}
		});
		p1.add(close);
		
		chat=new TextArea();
		chat.setBounds(20,30,300,200);
		chat.setFont(new Font("Arial",Font.PLAIN,18));
		p1.add(chat);
		
		Dice=new JButton("DICE");
		Dice.setBounds(400,30,100,60);
		Dice.setFont(new Font("Arial",Font.BOLD,22));
		Dice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x;
				chat.setForeground(new Color(0,0,0));
				x=rand.nextInt(100-0)+0;
				chat.append("You dice "+x+" ! "+"\n");
				int y;
				y=rand.nextInt(100-0)+0;
				chat.append("Opponent dice "+y+" ! "+ "\n");
				if (x > y) {yo++;YouCount.setText(""+yo);OpponentCount.setText(""+op);}
				else {op++;OpponentCount.setText(""+op);YouCount.setText(""+yo);}
				if (yo==5) {
					    chat.setForeground(new Color(0,255,0));
						chat.append("Congratulation you win!"+"\n");
						op=0;
						yo=0;
				}
				else if (op==5) {
					chat.setForeground(new Color(255,0,0));
					chat.append("You lost ! :("+"\n");
					op=0;
					yo=0;
				}
				}
			
		});
		p1.add(Dice);
		
	
		
		Score=new JLabel("Score");
		Score.setBounds(420,100,100,60);
		Score.setFont(new Font("Arial",Font.BOLD,22));
		p1.add(Score);
		
		You=new JLabel("You : ");
		You.setBounds(400,130,100,60);
		You.setFont(new Font("Arial",Font.BOLD,22));
		p1.add(You);
		
		YouCount=new JLabel(" ");
		YouCount.setBounds(500,130,100,60);
		YouCount.setFont(new Font("Arial",Font.BOLD,22));
		p1.add(YouCount);
		
		Opponent=new JLabel("Opponent : ");
		Opponent.setBounds(340,160,200,60);
		Opponent.setFont(new Font("Arial",Font.BOLD,22));
		p1.add(Opponent);
		
		OpponentCount=new JLabel(" ");
		OpponentCount.setBounds(500,160,200,60);
		OpponentCount.setFont(new Font("Arial",Font.BOLD,22));
		p1.add(OpponentCount);
		
		Restart=new JButton("Restart");
		Restart.setBounds(450,300,100,50);
		Restart.setFont(new Font("Arial",Font.BOLD,14));
		Restart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		  yo=0;
		  op=0;
		  chat.setText(" ");
		  OpponentCount.setText("0");
		  YouCount.setText("0");
			}
			
		});
		p1.add(Restart);
		
		
		frame.setBounds(400,300,700,400);
		frame.getContentPane().setBackground(new Color(120,130,255));
		frame.setVisible(true);
	}

}
