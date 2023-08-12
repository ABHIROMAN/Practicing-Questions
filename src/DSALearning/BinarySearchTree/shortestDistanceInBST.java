package DSALearning.BinarySearchTree;

public class shortestDistanceInBST {

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

    static int distance(Node root, int a) {
        if(root == null || root.data == a) return 0;
        if(a < root.data) return 1 + distance(root.left, a);
        return 1 + distance(root.right, a);
    }

    static int findDist(Node root, int a, int b) {

        if(root == null) return 0;

        if(a < root.data && b < root.data) {
            return findDist(root.left, a, b);
        }
        if(a > root.data && b > root.data) {
            return findDist(root.right, a, b);
        }

        return distance(root, a) + distance(root, b);
    }

    static int finalDistance(Node root, int a, int b) {

        int temp = 0;
        if(a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        return findDist(root, a, b);
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

        System.out.println(finalDistance(root, 10, 45));

    }
}
