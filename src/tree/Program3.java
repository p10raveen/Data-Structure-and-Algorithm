package tree;

public class Program3 {

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

        Program3 p1 = new Program3();
        p1.root = new Node(10);
        p1.root.left = new Node(20);
        p1.root.right = new Node(30);
        p1.root.left.left = new Node(40);
        p1.root.left.right = new Node(50);
        p1.root.right.left = new Node(60);
        System.out.println("Preorder");
        p1.preOrder(p1.root);
        p1.countNodes(p1.root);
        System.out.println("Total nodes: "+count);
    }

    static int count=0;
   public void countNodes(Node root) {
        if(root!=null)
        {
            count++;
            countNodes(root.left);
            countNodes(root.right);
        }
    }


}
