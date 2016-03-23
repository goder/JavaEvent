/*
 * 事件处理机制
 */

package com.bj.event;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Event_t extends JFrame implements ActionListener{
	//定义一个panel
	Panel mp=null;
	JButton jb1=null;
	JButton jb2=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Event_t e=new Event_t();
	}
	public Event_t(){
		mp=new Panel();
		jb1=new JButton("黑色");
		jb2=new JButton("红色");
		
		this.add(jb1,BorderLayout.NORTH);
		
		this.add(mp);
		this.add(jb2,BorderLayout.SOUTH);
		
		Cat cat=new Cat();
		
		
		
		//注册事件
		jb1.addActionListener(cat);
		jb1.setActionCommand("aa");
		jb1.addActionListener(this);
		//指定action命令
		jb1.setActionCommand("JB1_Event");
		
		jb2.addActionListener(this);
		jb2.setActionCommand("JB2_Event");
		
		this.setSize(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
				
	}
	@Override
	//对事件处理方法
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("OK");
		if(e.getActionCommand()=="JB1_Event"){
			System.out.println("JB1");
			mp.setBackground(Color.black);
		}else if(e.getActionCommand()=="JB2_Event"){
			System.out.println("JB2");
			mp.setBackground(Color.red);
		}else{
			System.out.println("UnKnown event");
			
		}
	}

} 

class Cat implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("aa")){
			System.out.println("猫猫也知道按下黑色按钮！");
		}else if(e.getActionCommand().equals("bb")){
			System.out.println("猫猫也知道按下红色按钮！");
		}
		System.out.println("猫猫！");
	}
	
}





//class Mypanel extends JPanel{
//	public void paint(Graphics g){
//		
//	}
//}
