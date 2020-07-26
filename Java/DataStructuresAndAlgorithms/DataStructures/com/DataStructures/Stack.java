package com.DataStructures;

public class Stack {

	public Stack() {
		list = new LinkedList();
	}
	
	public Boolean IsEmpty()
	{
		return list.IsEmpty();
	}
	
	public void Push(int value)
	{
		list.Prepend(value);
	}
	
	public int Top()
	{
		return list.HeadData();
	}
	
	public int Pop()
	{
		return list.RemoveAt(0);
	}
	
	public void Print()
	{
		list.Print();
	}
	
	private LinkedList list;
}
