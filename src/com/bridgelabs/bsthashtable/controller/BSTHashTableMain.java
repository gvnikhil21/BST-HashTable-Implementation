package com.bridgelabs.bsthashtable.controller;

import com.bridgelabs.bsthashtable.model.*;

public class BSTHashTableMain<E> {

	public static void main(String[] args) {
		performBSTOperation();
	}

	// performs BST operations
	public static void performBSTOperation() {
		BST<Integer> bst = new BST<Integer>();
		Node<Integer> root = null;
		root = bst.insert(root, 56);
		printInOrderBST(root);
		System.out.println();
		bst.insert(root, 30);
		printInOrderBST(root);
		System.out.println();
		bst.insert(root, 70);
		printInOrderBST(root);
		System.out.println();
	}

	// prints the elements in BST in in-order format
	public static <E> void printInOrderBST(Node<E> root) {
		if (root == null)
			return;
		printInOrderBST(root.left);
		System.out.print(root.data + " ");
		printInOrderBST(root.right);
	}
}
