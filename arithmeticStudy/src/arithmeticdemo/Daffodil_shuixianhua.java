package arithmeticdemo;

class daffodil {
	private static int a;// ��λ
	private static int b;// ʮλ
	private static int c;// ��λ

	public void mehod1() {

		for (int i = 100; i <= 999; i++) {
			a = i / 100;
			b = (i / 10) % 10;
			c = i % 10;
			if (i == a * a * a + b * b * b + c * c * c) {
				System.out.println(a + " " + b + " " + c + "=" + i);
			}
		}
	}
}

public class Daffodil_shuixianhua {

	public static void main(String[] args) {
		daffodil a = new daffodil();
		a.mehod1();

	}

}
