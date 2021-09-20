package ds.tree;

public class CheckForBalancedTree
{
    
    public static void main(String args[]) {
        
        
        Node root = new Node( 18 );
        root.left = new Node (4);
        root.right = new Node (20);
        
        
        root.right.left = new Node (13);
        root.right.right = new Node (70);
        
        CheckForBalancedTree checkForBalance = new CheckForBalancedTree();
        System.out.println( checkForBalance.checkIfBalance (root));
        
    }

    private boolean checkIfBalance( Node root )
    {
        
        if (root == null)
                return true;
        
        
        if (Math.abs( height(root.left) - height(root.right) ) <2 && checkIfBalance( root.left ) && checkIfBalance( root.right ))
            return true;
        
        return false;
    }
    
    private int height (Node root) {
        
        if (root == null)
            return 0;
        
        return  1+  Integer.max( height(root.left), height(root.right ));
    }
}
