package com.bridgelabs.bsthashtable.tester;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabs.bsthashtable.model.MyHashTable;

public class MyHashTableTest {

	@Test
	public void givenSentence_WhenAddedToTable_ShouldReturnWordFrequency() {
		MyHashTable<String, Integer> myTable = new MyHashTable<String, Integer>();
		String message = "To be or not to be";
		String msgArray[] = message.toLowerCase().trim().split(" ");
		for (String str : msgArray) {
			Integer value = myTable.get(str);
			if (value == null)
				value = 1;
			else
				value += 1;
			myTable.put(str, value);
		}
		Integer frequency = myTable.get("to");
		assertEquals(Integer.valueOf(2), frequency);
	}
}
