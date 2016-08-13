import java.io.File;
import java.io.FilenameFilter;

/**   
 * @Title: DirList.java 
 * @Package IO 
 * @Description: TODO ʵ��Ŀ¼�б���
 * @author xinchen
 * @date 2016��8��13�� ����3:02:08 
 * @version  
 */
public class DirList {

	public static void main(String[] args) {
		try{
			File path = new File(".");//��ȡ����Ŀ�����ļ���dir������
			String[] list;
			
			if(args.length == 0){
				list = path.list();
			}else{
				list = path.list(new DirFilter(args[0]));//�˴��ڲ���Ҫ�ĳɾ�̬����Ȼ�ᱨ��
			}
			for (int i = 0; i < list.length; i++) {
				System.out.println(list[i]); //ѭ������ļ���dir������
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	// �˴����д��class DirFilter implements FilenameFilter{}
	// ��̬������ֱ�ӵ��ö�̬�ڲ���ᱨ��������:
	// No enclosing instance of type DirList is accessible.
	// Must qualify the allocation with an enclosing i
	public static class DirFilter implements FilenameFilter{
		String afn;
		
		DirFilter(String afn){
			this.afn = afn;
		}
		
		@Override
		public boolean accept(File dir, String name) {
			String f = new File(name).getName();
			return f.indexOf(afn) != -1;
		}
		
	}

}
