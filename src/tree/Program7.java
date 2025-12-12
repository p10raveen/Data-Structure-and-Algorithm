package tree;

public class Program7 {

    Node root;

    void inOrder(Node root)
    {
        if(root!=null)
        {
            inOrder(root.left);
            System.out.print(root.data+"\t");
            inOrder(root.right);
        }
    }

    Node insertNode(Node root, int value)
    {
        if(root==null)
        {
            root = new Node(value);
        }
        if (value<root.data)
        {
            root.left = insertNode(root.left,value);
        }
        else if (value>root.data)
        {
            root.right = insertNode(root.right,value);
        }
        return root;
    }

    Node deleteNode(Node root, int value)
    {
        if(root==null)
        {
            return root;
        }
        if (value<root.data)
        {
            root.left = deleteNode(root.left,value);
        }
        else if (value>root.data)
        {
            root.right = deleteNode(root.right,value);
        }
        else
        {
            // single child Node
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;

            // two child node
            root.data = getValue(root.right);
            root.right = deleteNode(root.right,root.data);
        }
        return root;
    }

    private int getValue(Node node) {
        int val = node.data;
        while (node.left!=null)
        {
            val = node.left.data;
            node = node.left;
        }
        return val;
    }

    public static void main(String[] args) {
        Program7 p1 = new Program7();
        p1.root = p1.insertNode(p1.root,8);
        p1.root = p1.insertNode(p1.root,3);
        p1.root = p1.insertNode(p1.root,1);
        p1.root = p1.insertNode(p1.root,10);
        p1.root = p1.insertNode(p1.root,4);
        p1.root = p1.insertNode(p1.root,14);
        p1.root = p1.insertNode(p1.root,6);
        p1.root = p1.insertNode(p1.root,7);
        p1.inOrder(p1.root);
        p1.deleteNode(p1.root,3);
        System.out.println();
        p1.inOrder(p1.root);
    }


}
