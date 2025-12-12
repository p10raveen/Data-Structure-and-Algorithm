package tree;

public class Program2 {

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

        Program2 p1 = new Program2();
        p1.root = new Node(10);
        p1.root.left = new Node(20);
        p1.root.right = new Node(30);
        p1.root.left.left = new Node(40);
        p1.root.left.right = new Node(50);
        p1.root.right.left = new Node(60);
        System.out.println("Preorder");
        p1.preOrder(p1.root);
        System.out.println("\nDepth of Tree: "+p1.getDepth(p1.root));

    }

    private int getDepth(Node root) {
        if(root==null)
            return 0;
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);

        if(leftDepth>rightDepth)
            return leftDepth+1;
        else
            return rightDepth+1;
    }


}
