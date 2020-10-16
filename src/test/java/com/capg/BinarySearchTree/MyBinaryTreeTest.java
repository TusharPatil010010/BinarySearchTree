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
		MyBinaryTree<Integer> bst = new MyBinaryTree<>();
		bst.add(56);
		assertEquals(1, bst.size());
	}

	@Test
	void whenTwoNodesAdded_shouldReturnTwoSize() {
		MyBinaryTree<Integer> bst = new MyBinaryTree<>();
		bst.add(56);
		bst.add(30);
		assertEquals(2, bst.size());
	}

	@Test
	void whenThreeNodesAdded_shouldReturnThreeSize() {
		MyBinaryTree<Integer> bst = new MyBinaryTree<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		assertEquals(3, bst.size());
	}
}