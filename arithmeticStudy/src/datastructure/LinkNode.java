package datastructure;

/**
 * @author vov
 * ��������
 */
public class LinkNode {
   private int data;
   private LinkNode link;
   
/**
 * @param initialData ���洢����������
 * @param initialLink �¸���������
 */
   
public LinkNode(int initialData,LinkNode initialLink){
	   this.data = initialData;
	   this.link = initialLink;
   }

public int getData() {
	return data;
  }

public void setData(int data) {
	this.data = data;
  }

public LinkNode getLink() {
	return link;
  }  

public void setLink(LinkNode link) {
	this.link = link;
  }
}
