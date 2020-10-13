package com.bridgelabs.bsthashtable.model;

import java.util.HashMap;

public class MyHashTable<K, V> {
	private MyLinkedList<K, V> linkedList;

	public MyHashTable() {
		linkedList = new MyLinkedList<K, V>();
	}

	public V get(K key) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) linkedList.getNode(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public void put(K key, V value) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) linkedList.getNode(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<K, V>(key, value);
			linkedList.add(myMapNode);
		} else
			myMapNode.setValue(value);
	}

	HashMap<K, V> m = new HashMap<K, V>();

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(linkedList);
		return sb.toString();
	}
}
