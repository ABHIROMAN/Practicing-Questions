package DSALearning.binaryTree;

import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }
}

//Generic type declaration

//class Node<T> {
//    T data;
//    Node left, right;
//
//    public Node(T data) {
//        this.data = data;
//    }
//}
public class binaryTreeBasics {

    Scanner sc;
    Node root;

    public binaryTreeBasics() {
        sc = new Scanner(System.in);
    }

    // Creates a Binary Tree and returns the root node
    Node createBinaryTree() {
//        System.out.println("Enter node data");
        int data = sc.nextInt();

        if(data == -1) return null;

        Node node = new Node(data);

        System.out.println("Enter " +  data + "'s left data");
        node.left = createBinaryTree();

        System.out.println("Enter " + data + "'s right data");
        node.right = createBinaryTree();

        return node;
    }

    void inOrderTraversal(Node root) {

        if(root == null) return;
        inOrderTraversal(root.left); //LEFT
        System.out.println(root.data); //NODE
        inOrderTraversal(root.right); //RIGHT
    }

    void preOrderTraversal(Node root) {

        if(root == null) return;
        System.out.println(root.data); //NODE
        preOrderTraversal(root.left); //LEFT
        preOrderTraversal(root.right); //RIGHT
    }

    void postOrderTraversal(Node root) {

        if(root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.data);
    }

    int heightOfBinaryTree(Node root) {

        if(root == null) return 0;

        int lh = heightOfBinaryTree(root.left);
        int rh = heightOfBinaryTree(root.right);

        return Math.max(lh, rh) + 1;
    }

    void printNodesAtKDistance(Node root, int k) {

        if(root == null) return;
        if(k == 0) {
            System.out.println(root.data);
            return;
        }
        printNodesAtKDistance(root.left, k - 1);
        printNodesAtKDistance(root.right, k - 1);
    }

    public static void main(String[] args) {

        binaryTreeBasics bTree = new binaryTreeBasics();

        Node root = bTree.createBinaryTree();

        bTree.inOrderTraversal(root);
    }

}
