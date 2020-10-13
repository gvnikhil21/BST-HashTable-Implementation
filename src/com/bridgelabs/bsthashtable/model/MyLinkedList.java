package com.bridgelabs.bsthashtable.model;

import com.bridgelabs.bsthashtable.provider.INode;

public class MyLinkedList<K, V> {
	private INode<K, V> head;
	private int size;

	// creates an empty list
	public MyLinkedList() {
	}

	// adds data to end of linked list
	public void add(INode<K, V> node) {
		INode<K, V> temp = node;
		if (head == null) {
			head = temp;
			size++;
			return;
		}
		INode<K, V> curr = head;
		while (curr.getNext() != null)
			curr = curr.getNext();
		curr.setNext(temp);
		size++;
	}

	// overloading remove method to remove element from linked-list when given node
	public INode<K, V> remove(INode<K, V> node) {
		checkNullPointerException(node);
		INode<K, V> curr = head;
		while (curr.getNext() != node && curr.getNext() != null)
			curr = curr.getNext();
		curr.setNext(node.getNext());
		size--;
		return node;
	}

	// checks for null
	public void checkNullPointerException(INode<K, V> node) {
		if (node == null)
			throw new NullPointerException("Can't perform operation on null");
	}

	// searches for a element in linked list
	public boolean search(K key) {
		if (getNode(key) != null)
			return true;
		return false;
	}

	// returns the first node having specified data
	public INode<K, V> getNode(K key) {
		INode<K, V> curr = head;
		while (curr != null) {
			if (curr.getKey().equals(key))
				return curr;
			curr = curr.getNext();
		}
		return null;
	}

	// returns the index of the first occurrence of the specified element
	public int indexOf(K key) {
		INode<K, V> curr = head;
		int index = 0;
		while (curr != null) {
			if (curr.getKey().equals(key))
				return index;
			curr = curr.getNext();
			index++;
		}
		return -1;
	}

	// returns size of the linked list
	public int size() {
		return size;
	}

	// checks whether linked-list is empty
	public boolean isEmpty() {
		return size == 0 ? true : false;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(head);
		return sb.toString();
	}
}
