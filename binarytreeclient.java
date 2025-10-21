package CBCLASS;

public class binarytreeclient {
    public static void main(String[] args) {

        binarytree bt = new binarytree();
        bt.display();
        System.out.println("Preorder:");
        bt.preorder();

        System.out.println("Postorder:");
        bt.postorder();

        System.out.println("Inorder:");
        bt.inorder();
        System.out.println("levelorder: ");
        bt.levelorder();
    }
}
