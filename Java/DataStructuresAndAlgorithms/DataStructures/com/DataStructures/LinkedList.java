package com.DataStructures;

public class LinkedList {

	public LinkedList() {
		head = null;
	}
	
	public Boolean IsEmpty()
	{
		return head == null;
	}
	
	public void Append(int data)
	{
		if (IsEmpty())
		{
			// We're empty, add our first node
			head = new NodeSingle(data);
			return;
		}

		NodeSingle curNode = head;
		while (curNode != null)
		{
			// When we reach the end of the list,
			// create a new node with provided data
			if (curNode.next == null)
			{
				curNode.next = new NodeSingle(data);
				return;
			}
			
			curNode = curNode.next;
		}	
	}
	
	public void Prepend(int data)
	{	
		NodeSingle newHead = new NodeSingle(data);
		newHead.next = head;
		head = newHead;
	}
	
	public void Remove(int data)
	{
		// Nothing to remove
		if (IsEmpty())
			return;
		
		// Remove head
		if (head.data == data)
		{
			head = head.next;
			return;
		}
		
		NodeSingle curNode = head;
		while (curNode.next != null)
		{
			if (curNode.next.data == data)
			{
				curNode.next = curNode.next.next;
				return;
			}
			
			curNode = curNode.next;
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
			head = head.next;
			return data;
		}
		
		// Iterate through list while our counter is
		// less than the index index or we've found our node
		int count = 1;
		NodeSingle curNode = head;
		while (count <= index && curNode.next != null)
		{
			if (count == index)
			{
				data = curNode.next.data;
				curNode.next = curNode.next.next;
				return data;
			}
			
			curNode = curNode.next;
			count++;
		}
		
		return data;
	}
	
	public int HeadData()
	{
		return head.data;
	}
	
	public void Print()
	{
		NodeSingle curNode = head;
		int index = 0;
		while (curNode != null)
		{
			String output = String.format("[(Index %d) - (Data: %d)", index, curNode.data);
			System.out.println(output);
			curNode = curNode.next;
			index++;
		}
	}

	private NodeSingle head;
}
