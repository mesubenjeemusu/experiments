package com.DataStructures;

public class BinarySearchTree extends BinaryTree
{	
	public BinarySearchTree()
	{
		
	}
	
	public BinarySearchTree(int [] array)
	{
		this(array, false);
	}
	
	public BinarySearchTree(int [] array, boolean isSorted)
	{
		if (isSorted)
		{
			createBSTFromSortedArray(array);
		}
		else
		{
			createBSTFromArray(array);
		}
	}
	
	private void createBSTFromArray(int [] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			insert(array[i]);
		}
	}
	
	private void createBSTFromSortedArray(int [] array)
	{
		createBSTFromSortedArrayRecursive(array, 0, array.length - 1);
	}
	
	private void createBSTFromSortedArrayRecursive(int [] array, int low, int high)
	{
		if (high == low)
		{
			insert(array[high]);
			return;
		}
		
		int median = low + ((high - low) / 2);
		insert(array[median]);
		
		if (median != low)
			createBSTFromSortedArrayRecursive(array, low, median - 1);
		
		if (median != high)
			createBSTFromSortedArrayRecursive(array, median + 1, high);
	}
	
	@Override
	public void insert(int data)
	{
		// Special case for empty tree
		if (isEmpty())
		{
			root = new NodeDouble(data);
			return;
		}
		
		insertRecursiveBST(data, root);
	}
	
	private void insertRecursiveBST(int data, NodeDouble root)
	{
		if (data < root.data)
		{
			if (root.left == null)
				root.left = new NodeDouble(data);
			else
				insertRecursiveBST(data, root.left);
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
