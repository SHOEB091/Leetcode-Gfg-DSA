package Trie;

public class StartsWithPrefix_04 {
    public static class Node{
        Node [] children = new Node[26];
        boolean eow = false;
        public Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String word){
        Node current = root;
        for(int i =0;i<word.length();i++){
            int index = word.charAt(i)-'a';
            if(current.children[index]==null){
                current.children[index]= new Node();
            }
            current = current.children[index];
        }
        current.eow = true;
    }
    public static boolean search(String key){
        Node current = root;
        for(int i =0;i<key.length();i++){
            int index = key.charAt(i)-'a';
            if(current.children[index]==null){
                return false;
            }
            current = current.children[index];
        }
        return true;
    }
    public static void main(String[] args) {
        String words [] = {"apple","app","mango","man","woman"};
        String prefix1 = "app";
        String prefix2 = "moon";

        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(search(prefix1));
        System.out.println(search(prefix2));
    }

}
