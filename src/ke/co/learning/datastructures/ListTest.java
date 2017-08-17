package ke.co.learning.datastructures;

public class ListTest {
	public static void main(String[] args) {
		List<Integer> list = new List<Integer>();// create a list

		// insert integers in list
		list.insertAtFront(-1);
		list.print();
		list.insertAtFront(0);
		list.print();
		list.insertAtBack(1);
		list.print();
		list.insertAtBack(5);
		list.print();

		// remove objects from list; print after each removal
		try {
			int removedItem = list.removeFromFront();
			System.out.printf("\n%d removed \n", removedItem);
			list.print();

			removedItem = list.removeFromFront();
			System.out.printf("\n%d removed\n", removedItem);
			list.print();

			removedItem = list.removeFromBack();
			System.out.printf("\n%d removed\n", removedItem);
			list.print();
		} catch (EmptyListException emptyListException) {
			emptyListException.printStackTrace();
		}
	}
}
