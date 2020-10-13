package com.bridgelabs.bsthashtable.tester;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabs.bsthashtable.model.*;

public class BSTTest {

	@Test
	public void givenElements_WhenCreatedBST_ShouldBePresentInBST() {
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
		assertEquals(Integer.valueOf(13), Integer.valueOf(bst.size(root)));
	}

	@Test
	public void givenElement_WhenPresentInBST_ShouldReturnTrue() {
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
		assertTrue(bst.search(root, 95));
	}

}
