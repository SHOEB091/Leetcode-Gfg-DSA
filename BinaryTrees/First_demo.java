package BinaryTrees;

/*
A Tree is a non-linear data structure where:

Data is stored in nodes

Nodes are connected by edges

One node is the root

Every node (except root) has one parent
*/

/*
*-A Binary Tree is a tree in which:

*-Each node has at most 2 children

*-Left child

*-Right child
*/
/*
*-Structure 

        A
       / \
      B   C
     / \   \
    D   E   F
*/

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


// Types of Binary Trees 
// Full Binary tree -> Every node has either 0 or 2 children
/*
        1
       / \
      2   3
     / \
    4   5

*/

// Perfect Binary tree -> All internal nodes have 2 children and all leaf nodes are at the same level
/*
         1
       /  \
      2    3
     / \  / \
    4  5 6  7
*/
// Height = h

//Total nodes = 2^(h+1) - 1

//Leaf nodes = 2^h

// Complete Binary tree -> All levels are completely filled except possibly the last level and the last level has all keys as left as possible
/*
        1
       / \
      2   3
     / \  /
    4  5 6

*/


//BFS Pseudocode
/*
    breadthFirstSearch(root)
        if(root!=null)
           queue = createQueue()
           enqueue(queue, root)
           while(!isEmpty(queue))
                node = dequeue(queue)
                process(node)
                if(node.left != null) enqueue(queue,node.left)
                if(node.right != null) enqueue(queue,node.right)
*/



public class First_demo {
    // Binary Tree is a data structure in which each node has at most two children, referred to as the left child and the right child.
}
