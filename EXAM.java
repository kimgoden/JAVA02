package project03;

import java.util.Scanner;

public class anser1 {
	public static void main(String[] args) {		
		//01.1���� 100������ ���� ����� ������.

				int sum =0;
				for(int i =0;i<=100;i++ ) {
					sum +=i;
				}
				System.out.println(sum);
				System.out.println("-----------------------------------------");
				
		//02.1���� 100������ ���� ���ϵ� �հ��� 1000�� 
		//�Ѿ�Ÿ� ������ �ߴ��ϰ� �׶��� �հ踦 ����� ������.
		    sum =0;
		for(int i =0;i<=100;i++ ) {
			sum +=i;
			if(sum>1000) {
				break;
			}
		}
		System.out.println(sum);
		System.out.println("-----------------------------------------");
		
		
		//03.�α��� ����� �����ϼ���.
	    //����� ���̵� : ��green'
	    //����� ��й�ȣ: ��123456

       Scanner scan = new Scanner(System.in);
		
		//�̸� ����� Id,password
		String id = "green";
		String password = "123456";
		
		System.out.println("�α��� ���α׷�");
		System.out.print("���̵� : ");
		String userId = scan.nextLine();
		System.out.print("��й�ȣ : ");
		String userPassword = scan.nextLine();
		
//		System.out.println("�Է��� ���̵� : "+userId);
//		System.out.println("�Է��� ��й�ȣ : "+userPassword);
		
		// �α��� ó�� ���α׷��� ����� ���ô�.
		// ���̵� Ʋ�� ��� "���̵� �������� �ʽ��ϴ�."
		// ��й�ȣ�� Ʋ�� ��� "�߸��� ��й�ȣ�Դϴ�."
		// ���̵�,��й�ȣ�� ��ġ�ϴ� ��� "�α��� ����"

		/*
		 * �Էµ� ���̵��ϰ� ����� ���̵��ϰ� ��ġ�Ѵٸ�{
		 * 	   �Էµ� ��й�ȣ�ϰ� ����� ��й�ȣ�ϰ� ��ġ�Ѵٸ�{
		 * 			=>  �α��� ����
		 *    }�Էµ� ��й�ȣ�ϰ� ����� ��й�ȣ�ϰ� ��ġ���� �ʴ´ٸ�{
		 * 			=>  �߸��� ��й�ȣ
		 *    }
		 * }�Էµ� ���̵��ϰ� ����� ���̵��ϰ� ��ġ���� �ʴ´ٸ�{
		 *    => ���̵� �������� �ʽ��ϴ�.
		 * }
		 */
		
		if(id.equals(userId)){
			if(userPassword.equals(password)) {
				System.out.print("");
			}else {
				System.out.println("�߸��� ��й�ȣ");
			}
		}else {
			System.out.println("���̵� �������� �ʽ��ϴ�.");
		}
		
		if((id.equals(userId)) && (userPassword.equals(password))) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����");
		}
		
		System.out.println("-----------------------------------------");
		
		//04. ������ ¦������ ����ϼ���.
		for(int i=2;i<=9;i++) {
			
			if(i%2==0) {
				System.out.println(i+"��");
				for(int j =1;j<=9;j++) {
					System.out.println(i+"x"+j+"="+(i*j));
				}
			}
		}
		//05.���������� ����
		// ���� ���� ���߿� �ϳ��� �Է��ϸ� ��ǻ�Ͱ� ������ ������������ ���ؼ� ��,��,�и� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		int computer =(int)(Math.random()*3+1);
		int me = 0;
		
		while(true) {
			System.out.println("1.���� 2.���� 3.�� �����ϼ���.");
			me =sc.nextInt();
			if(me>=4) {
				System.out.println("���ڸ� �Է��ϼ���.");
			}
			else break;
		}
		System.out.println("��ǻ�Ͱ� ���� : " + computer);
		if(computer==me) {
			System.out.println("��");
		}
		else if(computer==1 && me==2){
			System.out.println("��");
		}
		else if(computer==2 && me==3) { System.out.println("��");
		}
		else if(computer==3 && me==1) { System.out.println("��");
		}
		else System.out.println("��");

		
		
		
	}

}

