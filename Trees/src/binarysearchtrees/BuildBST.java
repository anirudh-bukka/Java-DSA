package binarysearchtrees;

import java.util.*;

public class BuildBST {

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

    public static Node insert(Node root, int value) {
        if(root == null) {
            root = new Node(value);
            return root;
        }

        if(root.value > value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static void preorderTraversal(Node root) {
        if(root == null) {
            return;
        }

        System.out.print(root.value + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void inorderTraversal(Node root) {
        if(root == null) {
            return;
        }

        inorderTraversal(root.left);
        System.out.print(root.value + " ");
        inorderTraversal(root.right);
    }

    public static void postorderTraversal(Node root) {
        if(root == null) {
            return;
        }

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.value + " ");
    }

//    public static void display(Node root) {
//
//    }

    public static boolean isPresent(Node root, int key) {
        if(root == null) {
            return false;
        }

        if(root.value == key)
            return true;
        else if(root.value > key)
            return isPresent(root.left, key);
        else
            return isPresent(root.right, key);
    }

    public static Node delete(Node root, int value) {
        if(root.value > value) {
            root.left = delete(root.left, value);
        } else if(root.value < value) {
            root.right = delete(root.right, value);
        } else {
            if(root.left == null && root.right == null) {
                return null;
            }
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;

            Node IS = inorderSuccessor(root.right);
            root.value = IS.value;
            root.right = delete(root.right, IS.value);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while(root.left != null)
            root = root.left;
        return root;
    }

    public static void main(String[] args) {
        int[] ar = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for(int i = 0; i < ar.length; i++) {
            root = insert(root, ar[i]);
        }

        System.out.print("Preorder Traversal: ");
        preorderTraversal(root);
        System.out.println();
        System.out.print("Inorder Traversal: ");
        inorderTraversal(root);
        System.out.println();
        System.out.print("Postorder Traversal: ");
        postorderTraversal(root);
        System.out.println("---------------");
        System.out.println(isPresent(root, 2));
    }
}
