package Trie;

public class LongestWordWithAllPrefix{
  public static class Node{
    Node [] children = new Node[26];
    boolean eow = false;
    public Node(){
      for(int i = 0 i<26;i++){
        children[i] = null;
      }
    }
  }
  public static void insert(String word){
    
  }
}
