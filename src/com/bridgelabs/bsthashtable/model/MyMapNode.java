package com.bridgelabs.bsthashtable.model;

import com.bridgelabs.bsthashtable.provider.INode;

public class MyMapNode<K, V> implements INode<K, V> {
	private K key;
	private V value;
	MyMapNode<K, V> next;

	// constructor for myMapNode
	public MyMapNode(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public V getValue() {
		return value;
	}

	@Override
	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public INode<K, V> getNext() {
		return next;
	}

	@Override
	public void setNext(INode<K, V> node) {
		this.next = (MyMapNode<K, V>) node;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{Key: " + key + " , " + "Value: " + value + "} ");
		if (next != null)
			sb.append(next);
		return sb.toString();
	}
}
