package ds.tree;

public class MaximumOfBinaryTree
{
    
    public static void main (String args[]) {
        
        Node root = new Node( 10 );
        root.left = new Node( 20 );
        root.right = new Node( 30 );

        root.left.left = new Node( 40 );
        root.left.right = new Node( 50 );

        root.right.left = new Node( 60 );
        root.right.right = new Node( 70 );
        
        MaximumOfBinaryTree maximumOfBTree = new MaximumOfBinaryTree();
        System.out.println( maximumOfBTree.findMaximum( root ));
    }
    
    public int findMaximum ( Node root) {
        
        if (root == null)
            return Integer.MIN_VALUE;
        
        return Math.max( root.data, Math.max( findMaximum( root.left ), findMaximum( root.right ) ) );
    }
}
