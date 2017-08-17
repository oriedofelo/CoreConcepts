package ke.co.learning.datastructures;

public class Tree<T extends Comparable<T>> {
	private TreeNode<T> root;

	public Tree() {
		root = null;
	}

	// insert a new node in the binary search tree
	public void insertNode(T insertValue) {
		if (root == null)
			root = new TreeNode<T>(insertValue);// create root node
		else
			root.insert(insertValue); // call insert method
	}

	// beging preorder traversal
	public void preorderTraversal() {
		preorderHelper(root);
	}

	// recursive method to perform preoder traversal
	private void preorderHelper(TreeNode<T> node) {
		if (node == null)
			return;
		System.out.printf("%s ", node.data); // output node data
		preorderHelper(node.leftNode); // traverse left subtree
		preorderHelper(node.rightNode); // traverse right subtree
	}

	public void inorderTraversal() {
		inorderHelper(root);
	}

	private void inorderHelper(TreeNode<T> node) {
		if (node == null)
			return;

		inorderHelper(node.leftNode); // traverse left subtree
		System.out.printf("%s ", node.data);
		inorderHelper(node.rightNode);
	}

	public void postorderTraversal() {
		postorderHelper(root);
	}

	private void postorderHelper(TreeNode<T> node) {
		if (node == null)
			return;
		postorderHelper(node.leftNode);
		postorderHelper(node.rightNode);
		System.out.printf("%s ", node.data); // output node data
	}
}
