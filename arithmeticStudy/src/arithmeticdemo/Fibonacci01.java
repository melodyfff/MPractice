package arithmeticdemo;

public class Fibonacci01 {

	/**
	 * @��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ� С���ӳ����������º�ÿ��������һ�����ӣ� �������Ӷ�������
	 * ��ÿ���µ���������Ϊ���٣� ��������� ���ӵĹ���Ϊ����1,1,2,3,5,8,13,21....
	 */
	public static final int MONTH = 10;

	public static void main(String[] args) {
		long f1 = 1L; // ǰһ����
		long f2 = 1L; // ��һ����
		long f; // ��ת
		long sum = 0; // ����
		for (int i = 3; i <= MONTH; i++) {
			f = f2;
			f2 = f1 + f2;
			f1 = f;
			sum = sum + f2;
			System.out.println("��" + i + "�������Ӷ���Ϊ��" + f2);

		}

	}

}
