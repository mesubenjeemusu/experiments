package com.DataStructures;

import java.util.Queue;

public class BinaryTree
{
	protected NodeDouble root;

	public BinaryTree()
	{
		this(null);
	}
	
	public BinaryTree(NodeDouble root)
	{
		this.root = root;
	}
	
	public boolean isEmpty()
	{
		return root == null;
	}
	
	public void insert(int data)
	{
		// Special case for empty tree
		if (isEmpty())
		{
			root = new NodeDouble(data);
			return;
		}
		
		// Create new bfsQueue and initialize with root
		Queue<NodeDouble> bfsQueue = new java.util.LinkedList<NodeDouble>();
		bfsQueue.add(root);
		while(!bfsQueue.isEmpty())
		{
			//insertRecursiveBFS(bfsQueue.remove(), data);
			NodeDouble curNode = bfsQueue.remove();
			
			if (curNode.left == null)
			{
				curNode.left = new NodeDouble(data);
				return;
			}
			
			if (curNode.right == null)
			{
				// This is the node to insert at
				curNode.right = new NodeDouble(data);
				return;
			}
			
			bfsQueue.add(curNode.left);
			bfsQueue.add(curNode.right);
		}
	}

	public void print(TraversalType type)
	{
		switch(type)
		{
		case PREORDER:
			System.out.println("Pre-Order Print");
			printPreOrder(root);
			System.out.println();
			break;
		case POSTORDER:
			System.out.println("Post-Order Print");
			printPostOrder(root);
			System.out.println();
			break;
		case INORDER:
			System.out.println("In-Order Print");
			printInOrder(root);
			System.out.println();
			break;
		case BYLEVEL:
			System.out.println("Print Level-By-Level");
			printByLevel(root);
			System.out.println();
			break;
		default:
			// error
			break;
		}
	}
	
	// Pre-Order Print: current node (root) -> left tree -> right tree
	private void printPreOrder(NodeDouble root)
	{
		if (root == null)
			return;
		
		
		System.out.printf("%d, ", root.data);
		printPreOrder(root.left);
		printPreOrder(root.right);
	}
	
	// Post-Order Print: left tree -> right tree -> current node (root) 
	private void printPostOrder(NodeDouble root)
	{
		if (root == null)
			return;
		
		printPostOrder(root.left);
		printPostOrder(root.right);
		System.out.printf("%d, ", root.data);
	}

	// In-Order Print: left tree -> current node (root) -> right tree
	private void printInOrder(NodeDouble root)
	{
		if (root == null)
			return;
		
		printInOrder(root.left);
		System.out.printf("%d, ", root.data);
		printInOrder(root.right);
	}
	
	// Print nodes level-by-level from left to right
	private void printByLevel(NodeDouble root)
	{
		
	}
}
