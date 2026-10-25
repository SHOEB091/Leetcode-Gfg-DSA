package Trees;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderBFS {
    
    public static class Node {
        int data;
        Node left;
        Node right;
        
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Used to traverse the array while building the tree
    static int index = -1;

    // The buildTree method is kept to easily generate a tree for testing
    public static Node buildTree(int nodes[]) {
        index++;
        if (nodes[index] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    public static void levelOrder(Node root) {
        if (root == null) return;
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            System.out.print(currentNode.data + " "); // Use print instead of println

            // enqueue left child
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            // enqueue right child
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }

    public static void main(String[] args) {
        // Preorder representation of the tree. (-1 represents a null node)
        //       1
        //      / \
        //     2   3
        //    / \   \
        //   4   5   6
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        
        // Build the tree
        Node root = buildTree(nodes);
        
        // Call the BFS method
        System.out.print("Level Order Traversal: ");
        levelOrder(root);
    }
}