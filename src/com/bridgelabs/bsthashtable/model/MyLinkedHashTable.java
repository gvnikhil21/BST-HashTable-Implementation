package com.bridgelabs.bsthashtable.model;

import java.util.ArrayList;

public class MyLinkedHashTable<K, V> {
	private final int bucketSize;
	ArrayList<MyLinkedList<K, V>> myBucketArray;

	// Constructor
	public MyLinkedHashTable() {
		this.bucketSize = 10;
		this.myBucketArray = new ArrayList<>(bucketSize);
		for (int index = 0; index < bucketSize; index++) {
			this.myBucketArray.add(null);
		}
	}

	// returns element's value when given element's key
	public V get(K key) {
		int index = this.getBucketIndex(key);
		MyLinkedList<K, V> myLinkedList = this.myBucketArray.get(index);
		if (myLinkedList == null) {
			return null;
		} else {
			MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.getNode(key);
			return (myMapNode == null) ? null : myMapNode.getValue();
		}
	}

	// returns the index of element's key in hash-table bucket array
	private int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % bucketSize;
		return index;
	}

	// adds element of key-value pair to hash-table
	public void put(K key, V value) {
		int index = this.getBucketIndex(key);
		MyLinkedList<K, V> myLinkedList = this.myBucketArray.get(index);
		if (myLinkedList == null) {
			myLinkedList = new MyLinkedList<>();
			MyMapNode<K, V> myMapNode = new MyMapNode<>(key, value);
			myLinkedList.add(myMapNode);
			this.myBucketArray.set(index, myLinkedList);
		}
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.getNode(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<>(key, value);
			myLinkedList.add(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}

	// removes element from hash table
	public MyMapNode<K, V> remove(K key) {
		int index = this.getBucketIndex(key);
		MyLinkedList<K, V> myLinkedList = this.myBucketArray.get(index);
		if (myLinkedList == null) {
			return null;
		} else {
			MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.getNode(key);
			if (myMapNode == null) {
				return null;
			} else {
				myLinkedList.remove(myMapNode);
				return myMapNode;
			}
		}
	}

	@Override
	public String toString() {
		return "LinkedHashMap List {" + myBucketArray + "}";
	}

}
