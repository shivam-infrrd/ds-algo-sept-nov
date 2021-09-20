package ds.tree;

public class TreeTraversal
{
    
    public static void main(String args[]) {
        
        Node root = new Node( 10 );
        root.left = new Node (20);
        root.right = new Node (30);
        
        root.left.left = new Node(8);
        root.left.right = new Node (7);
        
        root.left.right.left  = new Node (9);
        root.left.right.right = new Node (15);
        
        root.right.right = new Node( 6);
        
        TreeTraversal treeTraversal = new TreeTraversal();
        treeTraversal.inOrder( root );
        System.out.println(  );
        treeTraversal.preOrder( root );
        System.out.println(  );
        treeTraversal.postOrder( root );
        System.out.println(  );
        
    }
    
    public void inOrder (Node root) {
        
        if (root != null) {
            
            inOrder( root.left );
            System.out.print( root.data +" ");
            inOrder( root.right );
        }
    }
    
    public void preOrder (Node root) {
        
        if (root != null) {
            

            System.out.print( root.data +" ");
            preOrder( root.left );
            preOrder( root.right );
            
        }
    }
    
    public void postOrder (Node root) {
        
        if (root != null) {
            
            postOrder( root.left );
            postOrder( root.right );

            System.out.print( root.data +" ");
        }
    }
}