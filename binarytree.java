package CBCLASS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class binarytree {
    class Node {
        int val;
        Node left;
        Node ryt;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node root;

    public binarytree() {
        root = createtree();
    }

    Scanner sc = new Scanner(System.in);

    private Node createtree() {
        int item = sc.nextInt();
        Node nn = new Node(item);
        boolean hlc = sc.nextBoolean();
        if (hlc) {
            nn.left = createtree();
        }
        boolean hrc = sc.nextBoolean();
        if (hrc) {
            nn.ryt = createtree();
        }
        return nn;
    }

    public void display() {
        display(root);
    }

    public void display(Node node) {
        if (node == null) {
            return;
        }
        String s = "<--" + node.val + "-->";
        if (node.left != null) {
            s = node.left.val + s;

        }

        else {
            s = "." + s;
        }
        if (node.ryt != null) {
            s = s + node.ryt.val;

        } else {
            s = s + ".";
        }
        System.out.println(s);
        display(node.left);
        display(node.ryt);
    }

    public int max(Node nn) {
        if (nn == null) {

            return Integer.MIN_VALUE;
        }
        int maxl = max(nn.left);
        int maxr = max(nn.ryt);
        return Math.max(nn.val, Math.max(maxl, maxr));
    }

    public boolean find(int item) {
        return find(root, item);
    }

    public boolean find(Node nn, int item) {
        if (nn == null) {
            return false;
        }
        if (nn.val == item) {
            return true;
        }
        boolean left = find(nn.left, item);
        boolean ryt = find(nn.ryt, item);
        return left || ryt;
    }

    public int ht() {
        return ht(root);
    }

    private int ht(Node node) {
        if (node == null) {
            return -1;
        }
        int lh = ht(node.left);
        int rh = ht(node.ryt);
        return Math.max(lh, rh) + 1;
    }

    public void preorder() {
        preorder(this.root);
        System.out.println();
    }

    public void preorder(Node nn) {
        if (nn == null) {
            return;
        }
        System.out.print(nn.val + " ");
        preorder(nn.left);
        preorder(nn.ryt);
    }

    public void postorder() {
        postorder(this.root);
        System.out.println();

    }

    public void postorder(Node nn) {
        if (nn == null) {
            return;
        }
        postorder(nn.left);
        postorder(nn.ryt);
        System.out.print(nn.val + " ");
    }

    public void inorder() {
        inorderr(this.root);
        System.out.println();

    }

    public void inorderr(Node nn) {
        if (nn == null) {
            return;
        }
        inorderr(nn.left);
        System.out.print(nn.val + " ");
        inorderr(nn.ryt);

    }

    public void levelorder() {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node n = q.poll();
            System.out.print(n.val + " ");
            if (n.left != null) {
                q.add(n.left);
            }

            if (n.ryt != null) {
                q.add(n.ryt);

            }
        }

        System.out.println();
    }
}