package hash;

import java.util.HashSet;

/**
 * û��дhashCode������д��equals�����������2������3���ڴ��ַ�����
 * hashcode��֪���Ƿ���ͬһ����
 * @author vov
 *
 */
public class hashTest03 {

	public static void main(String[] args) {
		   HashSet<Point3> hs3 = new HashSet<Point3>();
		   Point3 p31 = new Point3(3, 3);
		   Point3 p32 = new Point3(3, 3);
		   Point3 p33 = new Point3(3, 5);
		   hs3.add(p31);
		   hs3.add(p32);
		   hs3.add(p33);
		   System.out.println(hs3.size());

	}

}
