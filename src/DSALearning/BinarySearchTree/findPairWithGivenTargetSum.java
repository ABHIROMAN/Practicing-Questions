package DSALearning.BinarySearchTree;

import java.util.*;
public class findPairWithGivenTargetSum {

    static class Node {
        int data;
        Node left, right;

    }
    static Node newNode(int data) {

        Node ptr = new Node();
        ptr.data = data;
        ptr.left = null;
        ptr.right = null;
        return ptr;
    }

    static Node insert(Node root, int data) {

        if(root == null) root = newNode(data);
        else if(root.data > data) root.left = insert(root.left, data);
        else if(root.data < data) root.right = insert(root.right, data);
        return root;
    }

    static boolean findPairWithSum(Node root, int sum, HashSet<Integer> set) {

        if(root == null) return false;

        if(findPairWithSum(root.left, sum, set)) return true;

        if(set.contains(sum - root.data)) {
            System.out.println("Pair is found at " + (sum - root.data) + "," + root.data);
            return true;
        }
        else set.add(root.data);
        return findPairWithSum(root.right, sum, set);
    }

    static void findPair(Node root, int sum) {
        HashSet<Integer> set = new HashSet<Integer>();
        if(!findPairWithSum(root, sum, set))
            System.out.println("Pair not exist");
    }

    public static void main(String[] args) {

        Node root = null;
        root = insert(root, 50);
        insert(root, 20);
        insert(root, 60);
        insert(root, 10);
        insert(root, 40);
        insert(root, 30);
        insert(root, 45);
        insert(root, 25);
        insert(root, 35);

        int sum = 80;
        findPair(root, sum);
    }
}