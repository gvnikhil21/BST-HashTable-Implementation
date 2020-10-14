package com.bridgelabs.bsthashtable.tester;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabs.bsthashtable.model.MyLinkedHashTable;
import com.bridgelabs.bsthashtable.model.MyMapNode;

public class MyLinkedHashTableTest {

	@Test
	public void givenSentence_WhenAddedToTable_ShouldReturnWordFrequency() {
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
		Integer frequency = myTable.get("paranoid");
		assertEquals(Integer.valueOf(3), frequency);
	}

	@Test
	public void givenSentence_WhenWordRemovedFromPhrase_ShouldReturnNull() {
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
		MyMapNode<String, Integer> myMapNode = myTable.remove("avoidable");
		assertEquals("avoidable", myMapNode.getKey());
		Integer frequency = myTable.get("avoidable");
		assertEquals(null, frequency);
	}

}
