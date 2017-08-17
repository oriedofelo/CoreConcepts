package ke.co.learning.datastructures;

public class StackInheritance<T> extends List<T> {

	public StackInheritance() {
		super("stack");
	}

	// add object to stack
	public void push(T object) {
		insertAtFront(object);
	}

	// remove object from stack
	public T pop() throws EmptyListException {
		return removeFromFront();
	}

}
