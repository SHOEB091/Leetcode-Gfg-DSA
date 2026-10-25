package Trees;

public class PostOrderTraversal {
    // 1. Definition of a Tree Node
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            // Initially, a newly created node has no children
            this.left = null;
            this.right = null;
        }
    }

    // 2. Helper class to construct and traverse the tree
    public static class BinaryTree {
        // Tracks the current position in the input array across recursive calls
        static int index = -1;

        /**
         * Builds a binary tree from a preorder sequence.
         * Sequence follows: [Root, Left Subtree, Right Subtree]
         * -1 denotes a null node.
         */
        public static Node buildTree(int[] nodes) {
            index++;

            // Safety check: prevent ArrayIndexOutOfBoundsException
            if (index >= nodes.length) {
                return null;
            }

            // Base Case: If the current value is -1, there is no node here
            if (nodes[index] == -1) {
                return null;
            }

            // Step 1: Create the root node for the current subtree
            Node newNode = new Node(nodes[index]);

            // Step 2: Recursively build the left subtree
            newNode.left = buildTree(nodes);

            // Step 3: Recursively build the right subtree
            newNode.right = buildTree(nodes);

            // Return the constructed node back to its parent caller
            return newNode;
        }

        /**
         * Utility method to print tree in Preorder (Root -> Left -> Right)
         * to verify the tree was built accurately.
         */
        public static void postorderPrint(Node root){
            if(root==null){
                return;
            }
            postorderPrint(root.left);
            postorderPrint(root.right);
            System.out.println(root.data+" ");
        }
    }

    public static void main(String[] args) {
      
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        // Reset index to -1 before building in case buildTree is called multiple times
        BinaryTree.index = -1;

        Node root = BinaryTree.buildTree(nodes);

        System.out.println("Root node data: " + root.data);
        System.out.print("Inorder traversal of constructed tree: ");
        BinaryTree.postorderPrint(root);
        System.out.println();
    }



}
