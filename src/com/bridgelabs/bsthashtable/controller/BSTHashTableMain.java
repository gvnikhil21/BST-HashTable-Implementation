package com.bridgelabs.bsthashtable.controller;

import com.bridgelabs.bsthashtable.model.*;

public class BSTHashTableMain<E> {

	public static void main(String[] args) {
		performBSTOperation();
		performHashTableOperation();
	}

	// performs hashTable operations
	private static void performHashTableOperation() {
		MyLinkedHashTable<String, Integer> myTable = new MyLinkedHashTable<String, Integer>();
		String message = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String msgArray[] = message.toLowerCase().trim().split(" ");
		for (String str : msgArray) {
			Integer value = myTable.get(str);
			if (value == null)
				value = 1;
			else
				value += 1;
			myTable.put(str, value);
		}
		System.out.println("----Hash-Table----");
		System.out.println(myTable);
	}

	// performs BST operations
	public static void performBSTOperation() {
		BST<Integer> bst = new BST<Integer>();
		Node<Integer> root = null;
		root = bst.insert(root, 56);
		bst.insert(root, 30);
		bst.insert(root, 70);
		bst.insert(root, 22);
		bst.insert(root, 40);
		bst.insert(root, 60);
		bst.insert(root, 95);
		bst.insert(root, 11);
		bst.insert(root, 65);
		bst.insert(root, 3);
		bst.insert(root, 16);
		bst.insert(root, 63);
		bst.insert(root, 67);

		System.out.println("Elements in BST in inOrder fashion: ");
		printInOrderBST(root);
		System.out.println();
		System.out.println("No. of elements in BST: " + bst.size(root));

		boolean searchResult = bst.search(root, 95);
		if (searchResult)
			System.out.println("Element present in BST!");
		else
			System.out.println("Element not present!");
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
