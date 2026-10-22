package Trees;

public class HeightOfBinaryTree {
    // 1. Definition of the tree node
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // 2. Recursive function to find maximum depth / height
    public static int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return 1 + Math.max(lh, rh);
    }

    // 3. Driver code to construct the tree and run the function
    public static void main(String[] args) {
        /* Constructing the following binary tree:
                 1
                / \
               2   3
              / \
             4   5
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int height = maxDepth(root);
        System.out.println("Maximum depth (height) of the binary tree is: " + height);
    }
}
