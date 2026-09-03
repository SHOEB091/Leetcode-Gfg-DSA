package Trees;

public class SearchInBST {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //logic to search the posiiton where we have to insert the new node
    public static Node insert(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(root.data > value){ //left sub tree
            root.left = insert(root.left, value);
        } else { //right subtree
            root.right = insert(root.right, value);
        }
        return root;
    }

    //This if for the to se the values in the sorted order
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    //Logic to search the position where we have to insert the new node
    public static boolean search(Node root , int key){
        if(root == null){
            return false;
        }
        if(root.data > key){
            return search(root.left, key);
        }
        else if(root.data == key){
            return true;
        }
        else if(root.data<key){
            return search(root.right,key);
        }
        return false;
    }//Tc O(H)

    public static void main(String[] args) {
        int values[]= {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0;i<values.length;i++){
            root = insert(root,values[i]);
        }
        inOrder(root);
        System.out.println();

        if(search(root, 14)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }

}
