package ch06;

public class Ex6_1_3 {
	
	public static void main(String[] args) {
		// ��ü�� ������ ���
		// 1. ��ü�� ����
		// Ŭ������ ������;
		// ������ = new Ŭ������(); 
		
		class Tv{
			String color;
			boolean power;
			int channel;
			
			void power() {power = !power;}
			void channelUp() {channel++;}
			void channelDown() {channel--;}
		
		}
		Tv t; // Tv Ŭ���� Ÿ���� �������� t �� ����
	
		t = new Tv(); // Tv�ν��Ͻ��� ������ ��, ������ Tv�ν��Ͻ��� �ּҸ� t�� ����
		
		t.channel = 7; // Tv�ν��Ͻ��� ������� channel�� ���� 7�� �Ѵ�.
		
		t.channelDown(); // Tv�ν��Ͻ��� �޼��� channelDown()�� ȣ���Ѵ�.
		
		System.out.println("����ä���� " + t.channel + "�Դϴ�."); 
		//6�� �����µ� �� 6�̳ĸ� ���� ������ channel�� 7�ε� ���� channeldown�޼���� ä���� �ϳ� ���ȱ� ������ 6�� ���� 
		
	}
}
