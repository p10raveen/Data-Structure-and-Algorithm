package tree;

public class Program1 {

    Node root;

    void preOrder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+"\t");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {

        Program1 p1 = new Program1();
        p1.root = new Node(10);
        p1.root.left = new Node(20);
        p1.root.right = new Node(30);
        p1.root.left.left = new Node(40);
        p1.root.left.right = new Node(50);
        p1.root.right.left = new Node(60);
        System.out.println("Preorder");
        p1.preOrder(p1.root);
        System.out.println("\nInorder");
        p1.inOrder(p1.root);
        System.out.println("\nPostorder");
        p1.postOrder(p1.root);
    }

    private void postOrder(Node root) {
        if(root!=null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+"\t");
        }
    }

    private void inOrder(Node root) {
        if(root!=null)
        {
            inOrder(root.left);
            System.out.print(root.data+"\t");
            inOrder(root.right);
        }
    }
}
