package tree;

public class Program4 {

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

        Program4 p1 = new Program4();
        p1.root = new Node(10);
        p1.root.left = new Node(20);
        p1.root.right = new Node(30);
        p1.root.left.left = new Node(40);
        p1.root.left.right = new Node(50);
        p1.root.right.left = new Node(60);
        System.out.println("Preorder");
        p1.preOrder(p1.root);

        System.out.println("Is Tree FullBT? "+p1.checkFullBT(p1.root));
    }

    private boolean checkFullBT(Node root) {
        if(root==null)
            return true;
        else if (root.left==null && root.right==null)
            return true;

        else if (root.left!=null && root.right!=null)
            return checkFullBT(root.left) && checkFullBT(root.right);

        return false;
    }


}
