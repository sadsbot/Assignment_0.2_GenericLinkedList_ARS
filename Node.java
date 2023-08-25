
/**
 * @author njohnson3
 *
 */
class Node {
	int data;
	Node nextNode;
	public Node()
	{
		nextNode=null;
		data=0;
	}
	public void setData(int data) {
		this.data=data;
	}
	public Node getNode() {
		return this;
	}
	public void setNextNode(Node nextNode)
	{
		this.nextNode=nextNode;
	}
}

