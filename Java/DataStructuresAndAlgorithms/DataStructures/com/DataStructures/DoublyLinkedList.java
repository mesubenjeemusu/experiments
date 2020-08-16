package com.DataStructures;

public class DoublyLinkedList {

	private NodeDouble head;
	private NodeDouble tail;
	
	public DoublyLinkedList() {
		head = null;
		tail = null;
	}
	
	public Boolean IsEmpty()
	{
		return head == null && tail == null;
	}
	
	public void Append(int data)
	{
		if (IsEmpty())
		{
			// We're empty, add our first node
			head = new NodeDouble(data);
			tail = head;
			return;
		}
		
		tail.right = new NodeDouble(data);
		tail.right.left = tail;
		tail = tail.right;
	}
	
	public void Prepend(int data)
	{	
		if (IsEmpty())
		{
			// We're empty, add our first node
			head = new NodeDouble(data);
			tail = head;
			return;
		}
		
		NodeDouble newHead = new NodeDouble(data);
		newHead.right = head;
		head.left = newHead;
		head = newHead;
	}
	
	public void Remove(int data)
	{
		//Special case: Empty List
		if (IsEmpty())
			return;
		
		// Special case: one item
		if (tail == head)
		{
			if (head.data == data)
			{
				// data found, remove by nulling out head and tail
				head = null;
				tail = null;
			}
			return;
		}
		
		// Special case: data is in head
		if (head.data == data)
		{
			head = head.right;
			head.left = null;
		}
				
		// If not special, iterate list
		NodeDouble curNode = head;
		while (curNode.right != null)
		{
			if (curNode.right.data == data)
			{
				curNode.right = curNode.right.right;
				curNode.right.left = curNode;
				return;
			}
			
			curNode = curNode.right;
		}
	}
	
	public int RemoveAt(int index)
	{
		int data = -1; // Out of range value?
		
		// Nothing to remove
		if (IsEmpty())
		{
			// throw Error
			return data;
		}
		
		// Remove head
		if (index == 0)
		{
			data = head.data;
			head = head.right;
			head.left = null;
			return data;
		}
		
		// Iterate through list while our counter is
		// less than the index index or we've found our node
		int count = 1;
		NodeDouble curNode = head;
		while (count <= index && curNode.right != null)
		{
			if (count == index)
			{
				data = curNode.right.data;
				curNode.right = curNode.right.right;
				curNode.right.left = curNode;
				return data;
			}
			
			curNode = curNode.right;
			count++;
		}
		
		return data;
	}
	
	public int HeadData()
	{
		return head.data;
	}
	
	public int TailData()
	{
		return tail.data;
	}
	
	public void Print()
	{
		NodeDouble curNode = head;
		int index = 0;
		while (curNode != null)
		{
			String output = String.format("[(Index %d) - (Data: %d)", index, curNode.data);
			System.out.println(output);
			curNode = curNode.right;
			index++;
		}
	}
	
	public void PrintReverse()
	{
		NodeDouble curNode = tail;
		int index = 0;
		while (curNode != null)
		{
			String output = String.format("[(Index %d) - (Data: %d)", index, curNode.data);
			System.out.println(output);
			curNode = curNode.left;
			index++;
		}
	}

	
}
