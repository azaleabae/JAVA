package ch07;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex7_14_3 {

// �͸� Ŭ����(anonymous class)
	// �̸��� ���� ��ȸ�� Ŭ����. ���ǿ� ������ ���ÿ�
	
	// �⺻ ��ü ���������� 
	// MyClass myclass = new MyClass(); ����
	// �͸�Ŭ������ �̸��� ���� ������ �̸��� �� ��ȸ��
	
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {// Ŭ������ ���ǿ� ��ü ������ ���ÿ�
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
			}
		});
	}
		
}
