/**
* Class Description
*
* @author aross-sermons
* @version 1.0
* CS215; Lab #
* Fall 2023
*/

public class Application {
	public static void main(String[] args) {
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData(1);
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData(2);
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.data);
			tempnode=tempnode.nextNode;
		} while (tempnode!=null);
	}
}
