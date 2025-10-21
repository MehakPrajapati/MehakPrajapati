package CBCLASS;

public class binarysearchtree {
    class Node {
        int val;
        Node left;
        Node ryt;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node root;

    public Node binarysearchtree(int[] i, int j) {
        return null;
    }

    private Node createtree(int[] in, int i, int j) {
        if (i > j) {
            return null;
        }
        int mid = (i + j) / 2;
        Node nn = new Node(in(mid));
        nn.left = createtree(in, i, mid - 1);
        nn.ryt = createtree(in, mid + 1, j);
        return nn;
    }

    private int in(int mid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'in'");
    }

    public int max(Node nn) {
        if (root == null) {
            return Integer.MIN_VALUE;

        }
        int r = max(nn.ryt);
        return Math.max(r, root.val);
    }
}
