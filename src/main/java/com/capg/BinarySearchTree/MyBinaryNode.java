package com.capg.BinarySearchTree;

public class MyBinaryNode<k extends Comparable<k>> implements INode<k> {
	k key;
	MyBinaryNode<k> leftNode;
	MyBinaryNode<k> rightNode;

	public MyBinaryNode(k key) {
		this.key = key;
		this.leftNode = null;
		this.rightNode = null;
	}

	@Override
	public void setKey(k key) {
		this.key = key;
	}

	@Override
	public k getKey() {
		return key;
	}

}
