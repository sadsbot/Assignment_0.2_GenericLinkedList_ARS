/**
* Class Description
*
* @author aross-sermons
* @version 1.0
* CS215; Lab #
* Fall 2023
*/

public class GenericLinkedList<T> {
	GenericNode<T> head;
	int length;
	GenericNode<T> tail;
	public GenericLinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}
	public GenericNode<T> getList()
	{
		return head;
	}
	public void addGenericNode(GenericNode<T> aGenericNode)
	{
		if (isEmpty() ) {
			head = aGenericNode;
			tail=head;
			return;
		}
		tail.nextGenericNode=aGenericNode;
		tail=(GenericNode<T>) tail.nextGenericNode;
		tail.nextGenericNode=null;
		length++;
			
	}

}
