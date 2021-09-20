package ds.tree;

public class LeftView
{
    
    int maxLevel = 0;
    public static void main (String args[]) {
        

        Node root = new Node( 10 );
        root.left = new Node (20);
        root.right = new Node (30);
        
        root.left.left = new Node(8);
        root.left.right = new Node (7);
        
        root.right.left  = new Node (9);
        root.right.right = new Node (15);
        root.right.right.right = new  Node (6);
        
        LeftView leftView = new LeftView();
        leftView.printLeftView( root, 1 );
        
    }
    
    private void printLeftView( Node root, int level )
    {
        if (root == null)
            return;
        
        if (maxLevel < level) {
            maxLevel = level;
            System.out.println( root.data + " " );
        }
        
        printLeftView( root.left, level +1  );
        printLeftView( root.right, level +1  );
        
    }
    
    
}
