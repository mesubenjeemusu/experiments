package com.DataStructures;

import java.util.*;

public class NodeMany {

	public NodeMany(int data) {
		this.data = data;
		this.children = new ArrayList<NodeMany>();
	}
	
	int data;
	ArrayList<NodeMany> children;
}
