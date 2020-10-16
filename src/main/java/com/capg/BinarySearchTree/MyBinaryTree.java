package com.capg.BinarySearchTree;

public class MyBinaryTree<k extends Comparable<k>> {
	private MyBinaryNode<k> root;

	public boolean add(k key) {
		this.root = addToBinaryTree(root, key);
		return true;
	}

	/**
	 * Adds node to binary tree recursively
	 */
	private MyBinaryNode<k> addToBinaryTree(MyBinaryNode<k> current, k key) {
		if (current == null) {
			return new MyBinaryNode<>(key);
		}
		int compareResult = key.compareTo(current.key);
		if (compareResult < 0)
			current.leftNode = addToBinaryTree(current.leftNode, key);
		else
			current.rightNode = addToBinaryTree(current.rightNode, key);
		return current;

	}

	public int size() {
		return getSize(root);
	}

	/**
	 * gets size of binary tree recursively 
	 */
	public int getSize(MyBinaryNode<k> current) {
		return (current == null) ? 0 : 1 + getSize(current.leftNode) + getSize(current.rightNode);
	}
}
