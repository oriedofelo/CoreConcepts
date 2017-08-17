package ke.co.learning.datastructures;

//class to represent one node in a list
public class ListNode<T> {

	// package access smembers; List can access these directly
	T data;// data for this node
	ListNode<T> nextNode; // reference to the next node in the list

	// constructor creates a list note that refers to object
	ListNode(T object) {
		this(object, null);
	}

	// constructor creates listnode that refers to the specified object
	// and to the next ListNode
	ListNode(T object, ListNode<T> node) {
		data = object;
		nextNode = node;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ListNode<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(ListNode<T> nextNode) {
		this.nextNode = nextNode;
	}

}
