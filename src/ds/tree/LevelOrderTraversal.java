package ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal
{   

    public static void main (String args []) {
        
        Node root = new Node( 10 );
        root.left = new Node (20);
        root.right = new Node (30);
        
        root.left.left = new Node(8);
        root.left.right = new Node (7);
        
        root.left.right.left  = new Node (9);
        root.left.right.right = new Node (15);
        
        root.right.right = new Node( 6);
     
        LevelOrderTraversal ltraversal = new LevelOrderTraversal();
        ltraversal.printLevelOrderTraversal (root);
    }
    
    public void printLevelOrderTraversal (Node root) {
        
        if (root == null) {
            return;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.add( root );
        
        while (!queue.isEmpty()) {
            
            Node peekNode = queue.poll();
            System.out.print( peekNode.data +" " );
            
            if (peekNode.left != null) {
                
                queue.add( peekNode.left );
            }
            
            if (peekNode.right != null) {
                queue.add( peekNode.right );
            }
        }
        
    }
}