/**
* Class Description
*
* @author aross-sermons
* @author njohnson3
* @version 1.0
* CS215; Lab #
* Fall 2023
*/

class GenericNode<T> {
	T data;
	GenericNode<?> nextGenericNode;
	public GenericNode()
	{
		nextGenericNode=null;
		data=null;
	}
	public void setData(T data) {
		this.data=data;
	}
	public GenericNode<T> getGenericNode() {
		return this;
	}
	public void setNextGenericNode(GenericNode<?> nextGenericNode)
	{
		this.nextGenericNode=nextGenericNode;
	}
}
