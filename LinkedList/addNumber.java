package LinkedList;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class addNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a dummy node to simplify the result list construction
        ListNode dummyNode = new ListNode(-1);
        int carry = 0; // Initialize carry to 0
        ListNode t1 = l1; // Pointer to traverse the first list
        ListNode t2 = l2; // Pointer to traverse the second list
        ListNode current = dummyNode; // Pointer to construct the result list

        // Loop until both lists are fully traversed
        while (t1 != null || t2 != null) {
            int sum = carry; // Start with the carry from the previous iteration

            // Add the value from the first list if available
            if (t1 != null) {
                sum += t1.val;
                t1 = t1.next; // Move to the next node in the first list
            }

            // Add the value from the second list if available
            if (t2 != null) {
                sum += t2.val;
                t2 = t2.next; // Move to the next node in the second list
            }

            // Create a new node with the digit value (sum % 10)
            ListNode newNode = new ListNode(sum % 10);
            carry = sum / 10; // Update the carry for the next iteration
            current.next = newNode; // Link the new node to the result list
            current = current.next; // Move to the next node in the result list
        }

        // If there is a remaining carry, add a new node for it
        if (carry > 0) {
            ListNode newNode = new ListNode(carry);
            current.next = newNode;
        }

        // Return the next node of the dummy node as the head of the result list
        return dummyNode.next;
    }

    // Helper method to print the linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    // Helper method to create a linked list from an array
    public static ListNode createList(int[] nums) {
        ListNode dummyNode = new ListNode(-1);
        ListNode current = dummyNode;
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        // Create two linked lists
        int[] nums1 = {3, 5};
        int[] nums2 = {4, 5, 9,9};

        ListNode l1 = createList(nums1);
        ListNode l2 = createList(nums2);

        // Print the input lists
        System.out.print("List 1: ");
        printList(l1);
        System.out.print("List 2: ");
        printList(l2);

        // Add the two numbers
        addNumber solution = new addNumber();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result list
        System.out.print("Result: ");
        printList(result);
    }
}