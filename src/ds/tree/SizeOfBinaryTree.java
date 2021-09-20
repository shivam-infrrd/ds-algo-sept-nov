package ds.tree;

public class SizeOfBinaryTree
{
    
    public static void main (String args[]) {
        
        Node root = new Node( 10 );
        root.left = new Node (20);
        root.right = new Node (30);
        
        root.left.left = new Node(8);
        root.left.right = new Node (7);
        
        root.right.left  = new Node (9);
        root.right.right = new Node (15);
        
        SizeOfBinaryTree sizeOfBTree = new SizeOfBinaryTree();
        System.out.println( sizeOfBTree.getSize( root ));
        
    }
    
    private int getSize (Node root) {
        
        if (root == null)
            return 0;
        
        return 1 + getSize( root.left ) + getSize( root.right );
        
    }
}