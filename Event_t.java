/*
 * �¼��������
 */

package com.bj.event;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Event_t extends JFrame implements ActionListener{
	//����һ��panel
	Panel mp=null;
	JButton jb1=null;
	JButton jb2=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Event_t e=new Event_t();
	}
	public Event_t(){
		mp=new Panel();
		jb1=new JButton("��ɫ");
		jb2=new JButton("��ɫ");
		
		this.add(jb1,BorderLayout.NORTH);
		
		this.add(mp);
		this.add(jb2,BorderLayout.SOUTH);
		
		Cat cat=new Cat();
		
		
		
		//ע���¼�
		jb1.addActionListener(cat);
		jb1.setActionCommand("aa");
		jb1.addActionListener(this);
		//ָ��action����
		jb1.setActionCommand("JB1_Event");
		
		jb2.addActionListener(this);
		jb2.setActionCommand("JB2_Event");
		
		this.setSize(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
				
	}
	@Override
	//���¼�������
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
			System.out.println("èèҲ֪�����º�ɫ��ť��");
		}else if(e.getActionCommand().equals("bb")){
			System.out.println("èèҲ֪�����º�ɫ��ť��");
		}
		System.out.println("èè��");
	}
	
}





//class Mypanel extends JPanel{
//	public void paint(Graphics g){
//		
//	}
//}
