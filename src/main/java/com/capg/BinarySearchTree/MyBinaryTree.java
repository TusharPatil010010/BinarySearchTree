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
	
	public boolean search(k key) {
		return searchBST(root, key);
	}

	/**
	 *  searches node recursively
	 */
	public boolean searchBST(MyBinaryNode<k> current, k key) {
		if (current == null) {
			return false;
		}
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return true;
		else if (compareResult < 0)
			return searchBST(current.leftNode, key);
		else
			return searchBST(current.rightNode, key);
	}
}
