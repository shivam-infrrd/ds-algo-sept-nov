package ds.tree;

public class PrintNodeAtK
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
        
        PrintNodeAtK printAtK = new PrintNodeAtK();
        printAtK.printNodeAtDistK( root, 2 );
    }
    
    public void printNodeAtDistK( Node root, int k) {
        
        if (root == null) 
            return;
        
        if (k==0) {
            System.out.print( root.data +" " );
        }
        
        printNodeAtDistK (root.left, k-1);
        printNodeAtDistK( root.right, k-1 ); 
    }
}
