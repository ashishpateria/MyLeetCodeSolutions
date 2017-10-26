package TrieNode;

import java.util.HashMap;

public class TrieNode {
	HashMap<Character,TrieNode> child;
	boolean isLast;
	public TrieNode() {
		child=new HashMap<Character,TrieNode>();
		for(char i='a';i<='z';i++){
			child.put(i, null);
			
		}
		isLast=false;
	}

	
}
