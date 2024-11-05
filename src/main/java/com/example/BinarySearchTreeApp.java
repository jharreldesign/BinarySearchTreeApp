package com.example;

import java.util.Scanner;

public class BinarySearchTreeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        int[] initialValues = {1, 2, 3, 4, 5, 6, 7};

        while (true) {
            System.out.println("Menu:");
            System.out.println("1) Create a binary search tree");
            System.out.println("2) Add a node");
            System.out.println("3) Delete a node");
            System.out.println("4) Print nodes by InOrder");
            System.out.println("5) Print nodes by PreOrder");
            System.out.println("6) Print nodes by PostOrder");
            System.out.println("7) Exit program");
            System.out.print("Select an option: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    bst.createBalancedTree(initialValues);
                    System.out.println("Binary search tree created with initial values.");
                    break;
                case 2:
                    System.out.print("Enter a value to add: ");
                    int valueToAdd = scanner.nextInt();
                    bst.insert(valueToAdd);
                    System.out.println("Node added: " + valueToAdd);
                    break;
                case 3:
                    System.out.print("Enter a value to delete: ");
                    int valueToDelete = scanner.nextInt();
                    bst.delete(valueToDelete);
                    System.out.println("Node deleted: " + valueToDelete);
                    break;
                case 4:
                    System.out.println("InOrder traversal:");
                    bst.inorder();
                    break;
                case 5:
                    System.out.println("PreOrder traversal:");
                    bst.preorder();
                    break;
                case 6:
                    System.out.println("PostOrder traversal:");
                    bst.postorder();
                    break;
                case 7:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please select again.");
            }
        }
    }
}
