package ds.tree;

public class HeightOfBTree
{
    
    public static void main (String args[]) {
        
        Node root = new Node( 10 );
        root.left = new Node (20);
        root.right = new Node (30);
        
        root.left.left = new Node(8);
        root.left.right = new Node (7);
        
        root.left.right.left  = new Node (9);
        root.left.right.right = new Node (15);
        
        root.right.right = new Node( 6);
        
        HeightOfBTree heightBTree =  new HeightOfBTree();
        
        System.out.println(heightBTree.height (root));
        
    }
    
    public int height (Node root) {
        
        if (root == null )
            return 0;
        
        return 1 + Math.max( height(root.left), height(root.right) );
    }
}
