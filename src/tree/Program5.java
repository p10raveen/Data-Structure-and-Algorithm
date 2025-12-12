package tree;

public class Program5 {

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

        Program5 p1 = new Program5();
        p1.root = new Node(10);
        p1.root.left = new Node(20);
        p1.root.right = new Node(30);
        p1.root.left.left = new Node(40);
        p1.root.left.right = new Node(50);
        p1.root.right.left = new Node(60);

        System.out.println("Preorder");
        p1.preOrder(p1.root);

        System.out.println("Is Tree completeBT? "+p1.checkCBT(p1.root,0,6));
    }

    private boolean checkCBT(Node root, int index, int count) {

        if(root==null)
            return true;

        if(index>=count)
            return false;

        return checkCBT(root.left,(2*index)+1,6) && checkCBT(root.right,(2*index)+2,6);

    }


}
