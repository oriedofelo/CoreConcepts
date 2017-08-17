package ke.co.learning.datastructures;

import java.util.Random;

public class TreeTest {
	public static void main(String[] args) {
		Tree<Integer> tree = new Tree<Integer>();
		int value;
		Random randomNumber = new Random();
		System.out.println("Inserting the following values: ");

		// insert 10 random integers from 0-99 in tree
		for (int i = 1; i <= 10; i++) {
			value = randomNumber.nextInt(100);
			System.out.printf("%d ", value);
			tree.insertNode(value);
		}

		System.out.println("\n\nPreorder traversal");
		tree.preorderTraversal();

		System.out.println("\n\nInorder traversal");
		tree.inorderTraversal();

		System.out.println("\n\nPostorder traversal");
		tree.postorderTraversal();
		System.out.println();
	}
}
