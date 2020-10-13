package com.bridgelabs.bsthashtable.provider;

public interface INode<K, V> {
	public K getKey();

	public void setKey(K key);

	public INode<K, V> getNext();

	public void setNext(INode<K, V> node);

	public V getValue();

	public void setValue(V value);
}
