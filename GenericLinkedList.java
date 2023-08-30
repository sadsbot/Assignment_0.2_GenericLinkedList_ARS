/**
* Class Description
*
* @author aross-sermons
* @version 1.0
* CS215; Lab #0.2
* Fall 2023
*/

public class GenericLinkedList<T> {
	GenericNode<?> head;
	int length;
	GenericNode<?> tail;
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
	public GenericNode<?> getList()
	{
		return head;
	}
	public void addGenericNode(GenericNode<?> aGenericNode)
	{
		if (isEmpty() ) {
			head = aGenericNode;
			tail=head;
			return;
		}
		tail.nextGenericNode=aGenericNode;
		tail=(GenericNode<?>) tail.nextGenericNode;
		tail.nextGenericNode=null;
		length++;
			
	}

}
