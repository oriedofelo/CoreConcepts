package ke.co.learning.datastructures;

//class List definition
public class List<T> {

	private ListNode<T> firstNode;
	private ListNode<T> lastNode;
	private String name; // string like list used in printing

	// constructor creates emply list with "list" as the name
	public List() {
		this("list");
	}

	// constructor creates an empty list with a name
	public List(String listName) {
		name = listName;
		firstNode = lastNode = null;
	}

	// insert item at front of list
	public void insertAtFront(T insertItem) {
		if (isEmpty()) // firstNode and lastNode refer to the same object
			firstNode = lastNode = new ListNode<T>(insertItem);
		else // firstNode refers to new node
			firstNode = new ListNode<T>(insertItem, firstNode);
	} // end method insertAtFron

	// insert item at end of list
	public void insertAtBack(T insertItem) {
		if (isEmpty()) // firstNode and lastNode refer to same object
			firstNode = lastNode = new ListNode<T>(insertItem);
		else // lastNode's nextNode refers to new node
			lastNode = lastNode.nextNode = new ListNode<T>(insertItem);
	} // end method insertAtBack

	// remove first node from List
	public T removeFromFront() throws EmptyListException {
		if (isEmpty()) // throw exception if List is empty
			throw new EmptyListException(name);

		T removedItem = firstNode.data; // retrive data being removed

		// update references firstNode and lastNode
		if (firstNode == lastNode)
			firstNode = lastNode = null;
		else
			firstNode = firstNode.nextNode;
		return removedItem;// return removed node data
	}// end method removeFromFront

	// remove last node from list
	public T removeFromBack() throws EmptyListException {
		if (isEmpty()) // throw exception if List is empty
			throw new EmptyListException(name);
		T removedItem = lastNode.data; // retrieve data being removed

		// update references firstNode and lastNode
		if (firstNode == lastNode)
			firstNode = lastNode = null;
		else { // locate new lastNode
			ListNode<T> current = firstNode;

			// loop while current node does not refer to lastNode
			while (current.nextNode != lastNode)
				current = current.nextNode;

			lastNode = current; // current is new lastNode
			current.nextNode = null;
		}
		return removedItem;
	}

	public boolean isEmpty() {
		return firstNode == null;
	}

	// output list contents
	public void print() {
		if (isEmpty()) {
			System.out.printf("empty %s\n", name);
			return;
		}

		System.out.printf("The %s is:", name);
		ListNode<T> current = firstNode;

		// while not at the end of list, output current node's data
		while (current != null) {
			System.out.printf("%s ", current.data);
			current = current.nextNode;
		} // end while
		System.out.println("\n");
	}

}
