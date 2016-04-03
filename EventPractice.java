/*
 * ���ܣ��¼�������������ʾ��ꡢ����ƶ������̰����������¼�������ע�ᣬ���
 */
package com.bj.event;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class EventPractice extends JFrame {
	//����
	MyPanels mp=null;
	
	public static void main(String [] agrs){
		EventPractice ep=new EventPractice();
	}
	//���캯��
	public EventPractice(){
		mp=new MyPanels();
		this.add(mp);
		this.addMouseListener(mp);
		this.addKeyListener(mp);
		this.addMouseMotionListener(mp);
		this.addWindowListener(mp);
		this.setSize(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	
	}
}
//��MyPanels֪�������Ϣ�����м���
//1��֪�����λ��2��֪��������Ϣ
//3��֪������ƶ�����ק   4�����ڲ���
class MyPanels extends JPanel implements MouseListener,KeyListener,MouseMotionListener,WindowListener{
	
	public void paint(Graphics g){
		super.paint(g);
	}
	//�����
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�������X="+e.getX()+"  Y="+e.getY());
	}
	//��갴��
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("��갴�£�");
	}
	//���̧��
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���̧��");
	}
	//������һ�����ʱ
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("��������壺");
	}
	//����˳�
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("����˳���");
	}
	//��������������������ַ�����������w s p �ᱻ���ã���������F1 Delete..���ᴥ��������
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�����������"+e.getKeyChar());
	}
	//��������
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�������£�"+e.getKeyChar());
	}
	//����̧��
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("����̧��"+e.getKeyChar());
	}
	//�����ק
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�����ק");
	}
	//����ƶ�
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("����ƶ���X="+e.getX()+"  Y="+e.getY());
	}
	//�򿪴���
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�򿪴���");
	}
	//�������ر�
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�������ر�");
	}
	//���ڹر�
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���ڹر�");
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}