/*
 * 功能：事件监听事例：演示鼠标、鼠标移动、键盘按键、窗口事件监听，注册，结果
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
	//定义
	MyPanels mp=null;
	
	public static void main(String [] agrs){
		EventPractice ep=new EventPractice();
	}
	//构造函数
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
//让MyPanels知道鼠标消息，进行监听
//1、知道点击位置2、知道按键信息
//3、知道鼠标移动、拖拽   4、窗口操作
class MyPanels extends JPanel implements MouseListener,KeyListener,MouseMotionListener,WindowListener{
	
	public void paint(Graphics g){
		super.paint(g);
	}
	//鼠标点击
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标点击：X="+e.getX()+"  Y="+e.getY());
	}
	//鼠标按下
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标按下：");
	}
	//鼠标抬起
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标抬起：");
	}
	//鼠标进入一个面板时
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标进入面板：");
	}
	//鼠标退出
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标退出：");
	}
	//按键具体键（仅仅输入字符、数字例如w s p 会被调用，其他例如F1 Delete..不会触发方法）
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("按键具体键："+e.getKeyChar());
	}
	//按键按下
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("按键按下："+e.getKeyChar());
	}
	//按键抬起
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("按键抬起："+e.getKeyChar());
	}
	//鼠标拖拽
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标拖拽");
	}
	//鼠标移动
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标移动：X="+e.getX()+"  Y="+e.getY());
	}
	//打开窗口
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("打开窗口");
	}
	//窗口正关闭
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("窗口正关闭");
	}
	//窗口关闭
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("窗口关闭");
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