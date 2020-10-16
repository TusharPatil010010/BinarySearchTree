package com.capg.BinarySearchTree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyBinaryTreeTest {

	@Test
	void whenNoNodeAdded_shouldReturnZeroSize() {
		MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
		assertEquals(0, binaryTree.size());
	}

	@Test
	void whenOneNodeAdded_shouldReturnOneSize() {
		MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
		binaryTree.add(56);
		assertEquals(1, binaryTree.size());
	}

	@Test
	void whenTwoNodesAdded_shouldReturnTwoSize() {
		MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		assertEquals(2, binaryTree.size());
	}

	@Test
	void whenThreeNodesAdded_shouldReturnThreeSize() {
		MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		assertEquals(3, binaryTree.size());
	}
	
	@Test
	void whenAllNodesAdded_shouldReturnSize() {
		MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(40);
		binaryTree.add(11);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(60);
		binaryTree.add(95);
		binaryTree.add(65);
		binaryTree.add(63);
		binaryTree.add(67);
		assertEquals(13, binaryTree.size());
	}
}