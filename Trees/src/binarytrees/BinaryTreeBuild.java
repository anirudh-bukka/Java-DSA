package binarytrees;

import java.util.*;

public class BinaryTreeBuild {

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int ptr = -1;
        public static Node buildTree(int[] nodes) {
            ptr++;
            if(nodes[ptr] == -1)
                return null;
                // create new node by indexing from nodes array.
            Node newNode = new Node(nodes[ptr]);
                // make and join the left and right sub trees with the node
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorderTraversal(Node root) {
            if(root == null)
                return;

            System.out.println(root.value + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

        public static void inorderTraversal(Node root) {
            if(root == null)
                return;

            inorderTraversal(root.left);
            System.out.println(root.value + " ");
            inorderTraversal(root.right);
        }

        public static void postorderTraversal(Node root) {
            if(root == null)
                return;

            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.println(root.value + " ");
        }

        public static void levelOrderTraversal(Node root) {
            if(root == null)
                return;

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()) {
                Node currentNode = q.remove();
                if(currentNode == null) {
                    System.out.println();
                    if(q.isEmpty())
                        break;
                    else
                        q.add(null);
                } else {
                    System.out.print(currentNode.value + " ");
                    if(currentNode.left != null)
                        q.add(currentNode.left);
                    if(currentNode.right != null)
                        q.add(currentNode.right);
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 3, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("----");
        System.out.println(root.value);
        tree.preorderTraversal(root);
        System.out.println("----");
        tree.levelOrderTraversal(root);
    }
}
