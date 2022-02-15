package ch07;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex7_14_3 {

// 익명 클래스(anonymous class)
	// 이름이 없는 일회용 클래스. 정의와 생성을 동시에
	
	// 기본 객체 생성형식은 
	// MyClass myclass = new MyClass(); 지만
	// 익명클래스는 이름이 없고 조상의 이름을 씀 일회용
	
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {// 클래스의 정의와 객체 생성을 동시에
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
			}
		});
	}
		
}
