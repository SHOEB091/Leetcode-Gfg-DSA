package Trees;

public class DeleteNode {
    //Cases
    // No Child (Leaf Node)
    // One Child
    // Two Children
    //----------------------------------------------
    // Case 1 No Child Leaf Node
    //Delete Node and return Null to parent
    //----------------------------------------------
    //Case 2 One Child
    // Delete Node & replace with child node
    //----------------------------------------------
    // Case 3 Two Children
    // Replace value with inorder successor
    // Delete the node for inorder successor
    //BST --> left most in Right Subtree
    // Inroder successor always has 0 or 1 child
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data= data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node delete(Node root , int value){
        if(root==null){
            return null;
        }
        //Targeting the node 
        if(root.data>value){
            root.left = delete(root.left,value);
        }
        else if(root.data < value){
            root.right = delete(root.right,value);
        } else { // root.data == val
            //case 1 leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            //case 2 
            if(root.left == null){
                return root.right;
            }else if(root .right ==null){
                return root.left;
            }

            //case 3 first we have tp find inorder successor leftmost node in a right subtree
            Node inorderSuccess = inorderSuccessor(root.right); // do condition hoti hai ya to predecessor le lo ya to seccuessor le lo left ya right aur agar right liya hai toh us right ka sabse chote element hi successor me aaiyega left most element
            root.data = inorderSuccess.data;
            root.right = delete(root.right,inorderSuccess.data);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root){
        while(root.left!= null){
            root = root.left;
        }
        return root;
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

    // values [] = 5,1,3,4,2,7
    public static void main(String[] args) {
        int values [] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0;i<values.length;i++){
            root = insert(root,values[i]);
        }
        inOrder(root);
        System.out.println();

        delete(root,4);
        inOrder(root);
    }
}

/*
In this diagram, the instructor is explaining Case 3 (deleting a node with two children) on a tree where the in-order successor itself has a child.

The instructor uses decimals (5.5 and 5.7) to insert values strictly between 5 and 6 to demonstrate this exact edge case.

Step-by-Step Breakdown
1. Target Node to Delete: 5 (The Root)

Node 5 has two children (left child 3, right child 12).

Because it has two children, it cannot simply be removed. It must be replaced by its in-order successor (the smallest value strictly greater than 5).

2. Finding the In-Order Successor
To find the successor:

Step into the right subtree: go to node 12.

Go as far left as possible:

From 12, move left to 6.

From 6, move left to 5.5.

Node 5.5 has no left child, so 5.5 is the in-order successor.

3. Replacing the Value

The value 5.5 is copied into the target root node (indicated by the red curved arrow pointing from 5.5 up to 5).

The root's value is now 5.5.

4. The "Complex" Part: Deleting the Successor (5.5)
Now, the original node 5.5 must be deleted from the right subtree:

Can an in-order successor ever have a left child?
No. If it had a left child, that left child would be smaller, meaning we hadn't reached the leftmost node yet.

Can an in-order successor have a right child?
Yes. In this diagram, 5.5 has a right child: 5.7 (5.5<5.7<6).

Because 5.5 has exactly one child (5.7), deleting it reduces to Case 2 (Node with 1 Child):

Node 5.5 is removed (crossed out on the board).

Its parent (node 6) adopts its right child (5.7) as its new left child:

Plaintext
root.left = delete(root.left, successor.data);
6.left now points directly to 5.7
Final Tree State Around That Subtree
Plaintext
         5.5  <-- (old root 5 replaced by successor 5.5)
       /     \
     3        12
   /   \     /  \
  1     4   6    13
           / \     \
        5.7   7     14

*/
