package com.bridgelabs.bsthashtable.model;

public class BST<E extends Comparable<E>> {

	public BST() {
	}

	// inserts data in the BST
	public Node<E> insert(Node<E> root, E data) {
		if (root == null)
			return new Node<E>(data);
		if (data.compareTo(root.data) < 0)
			root.left = insert(root.left, data);
		else if (data.compareTo(root.data) > 0)
			root.right = insert(root.right, data);
		return root;
	}

	// searches for a data in the BST
	public boolean search(Node<E> root, E data) {
		if (root == null)
			return false;
		if (data.compareTo(root.data) == 0)
			return true;
		if (data.compareTo(root.data) < 0)
			return search(root.left, data);
		else
			return search(root.right, data);
	}

	// returns the size of the BST
	public int size(Node<E> root) {
		return (root == null) ? 0 : 1 + size(root.left) + size(root.right);
	}
}
