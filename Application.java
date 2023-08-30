/**
* Class Description
*
* @author aross-sermons
* @author njohnson3
* @version 1.0
* CS215; Lab #0.2
* Fall 2023
*/

public class Application {
	public static void main(String[] args) {
		System.out.println("Instantiating new LinkedList myList with 2 nodes. \nNode1 = 1, Node2 = 2");
		
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData(1);
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData(2);
		myList.addNode(aNode);
		
		System.out.println("\nPrinting the data of each node in myList...");
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.data);
			tempnode=tempnode.nextNode;
		} while (tempnode!=null);
		
		System.out.println("\nInstantiating new GenericLinkedList gList with 3 GenericNodes. \nNode1 = \"Andrew\", Node2 = 19, Node3 = true");
		
		GenericLinkedList<GenericNode> gList = new GenericLinkedList<GenericNode>();
		GenericNode<String> gStringNode = new GenericNode<String>();
		gStringNode.setData("Andrew");
		gList.addGenericNode(gStringNode);
		GenericNode<Integer> gIntegerNode = new GenericNode<Integer>();
		gIntegerNode.setData(19);
		gList.addGenericNode(gIntegerNode);
		GenericNode<Boolean> gBooleanNode = new GenericNode<Boolean>();
		gBooleanNode.setData(true);
		gList.addGenericNode(gBooleanNode);
		
		System.out.println("\nPrinting the data of each node in gList...");
		
		GenericNode<?> tempGenericNode = gList.getList();
		do 
		{
			System.out.println(tempGenericNode.data);
			tempGenericNode=tempGenericNode.nextGenericNode;
		} while (tempGenericNode!=null);
	}
}
