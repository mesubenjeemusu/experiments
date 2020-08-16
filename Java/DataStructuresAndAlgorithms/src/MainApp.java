import com.DataStructures.*;

public class MainApp {

	public static void main(String[] args) {

		// Linked List
		System.out.println("Create new LinkedList\n");
		LinkedList list = new LinkedList();
		
		if (list.IsEmpty())
			System.out.println("List is empty initially");
		
		list.Append(10);
		list.Prepend(5);
		list.Append(10);
		list.Append(15);
		list.Append(25);

		list.Print();
		
		list.Remove(10);
		
		list.Print();
		
		System.out.printf("Remove (Out of Range - Value Expected: -1): %d\n", list.RemoveAt(4));
		System.out.printf("Remove (Index 3 - Value Expected: 25): %d\n", list.RemoveAt(3));
		
		list.Print();
		
		// Doubly Linked List
		System.out.println("\nCreate new DoublyLinkedList\n");
		DoublyLinkedList doubleList = new DoublyLinkedList();
		
		if (doubleList.IsEmpty())
			System.out.println("List is empty initially");
		
		doubleList.Append(10);
		doubleList.Prepend(5);
		doubleList.Append(10);
		doubleList.Append(15);
		doubleList.Append(30);
		doubleList.Append(25);
		doubleList.Append(5);
		
		doubleList.Remove(10);
		System.out.printf("Remove (Out of Range - Value Expected: -1): %d\n", list.RemoveAt(5));
		System.out.printf("Remove (Index 3 - Value Expected: 30): %d\n", doubleList.RemoveAt(3));

		doubleList.Print();
		doubleList.PrintReverse();
		
		// Stack
		System.out.println("\nCreate new Stack\n");
		Stack stack = new Stack();
		
		if (stack.IsEmpty())
			System.out.println("Stack is empty initially");
		
		stack.Push(5);
		stack.Push(4);
		stack.Push(3);
		stack.Push(2);
		stack.Push(1);
		
		stack.Print();
		
		System.out.printf("Top: %d\n", stack.Top());
		System.out.printf("Popped value: %d\n", stack.Pop());
		System.out.printf("Top: %d\n", stack.Top());
		
		stack.Print();
	}

}
