package multiThread;

public class PrintThread2 extends Thread{
	public void run() {
		try {
			while(true) {
				System.out.println("������");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}