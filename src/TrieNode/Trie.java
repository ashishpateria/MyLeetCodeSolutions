package TrieNode;

public class Trie {

	TrieNode root;
	
	public void insertIntoTrie(String contacts[]){
		root=new TrieNode();
		int n=contacts.length;
		for(int i=0;i<n;i++){
			insert(contacts[i]);
			
		}
	}
	public void insert(String s ){
		int len=s.length();
		TrieNode itr=root;
		for(int i=0;i<len;i++){
			TrieNode nextNode=itr.child.get(s.charAt(i));		
			if(nextNode==null){
				nextNode=new TrieNode();
				itr.child.put(s.charAt(i), nextNode);
				
			}
			itr=nextNode;
			if(i==len-1){
				itr.isLast=true;
				
			}	
		}
	}

	public void displayContacts(String str){
	
		TrieNode prevNode=root;
		
		String prefix="";
		 
		int len=str.length();
		int i;
		for(i=0;i<len;i++){
			prefix+=str.charAt(i);
			char lastChar =prefix.charAt(i);
			TrieNode curNode =prevNode.child.get(lastChar);
			if(curNode ==null){
				System.out.println("No Results Found for ");
				
			}
			
		}
	}

	public static void main(String[] args) {
		
	}

}
