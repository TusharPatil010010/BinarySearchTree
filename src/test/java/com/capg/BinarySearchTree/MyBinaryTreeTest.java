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
	void whenAllNodesAdded_shouldReturn_itsSize() {
		MyBinaryTree<Integer> bstbinaryTree = new MyBinaryTree<>();
		bstbinaryTree.add(56);
		bstbinaryTree.add(30);
		bstbinaryTree.add(70);
		bstbinaryTree.add(22);
		bstbinaryTree.add(40);
		bstbinaryTree.add(11);
		bstbinaryTree.add(3);
		bstbinaryTree.add(16);
		bstbinaryTree.add(60);
		bstbinaryTree.add(95);
		bstbinaryTree.add(65);
		bstbinaryTree.add(63);
		bstbinaryTree.add(67);
		assertEquals(13, bstbinaryTree.size());
	}
}