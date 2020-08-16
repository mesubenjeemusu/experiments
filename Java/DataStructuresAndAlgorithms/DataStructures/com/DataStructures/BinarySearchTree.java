package com.DataStructures;

public class BinarySearchTree extends BinaryTree
{	
	@Override
	public void insert(int data)
	{
		insertRecursiveBST(data, root);
	}
	
	private void insertRecursiveBST(int data, NodeDouble root)
	{
		if (data < root.data)
		{
			if (root.left == null)
				root.left = new NodeDouble(data);
			else
				insertRecursiveBST(data, root.right);
		}
		else
		{
			if (root.right == null)
				root.right = new NodeDouble(data);
			else
				insertRecursiveBST(data, root.right);
		}
	}
}
