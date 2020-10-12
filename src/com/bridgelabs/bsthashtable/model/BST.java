package com.bridgelabs.bsthashtable.model;

public class BST<E extends Comparable<E>> {

	public BST() {
	}

	public Node<E> insert(Node<E> root, E data) {
		if (root == null)
			return new Node<E>(data);
		if (data.compareTo(root.data) < 0)
			root.left = insert(root.left, data);
		else if (data.compareTo(root.data) > 0)
			root.right = insert(root.right, data);
		return root;
	}

	public int size(Node<E> root) {
		return (root == null) ? 0 : 1 + size(root.left) + size(root.right);
	}
}
