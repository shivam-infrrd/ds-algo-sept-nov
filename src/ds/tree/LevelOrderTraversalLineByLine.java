package ds.tree;

import java.util.LinkedList;
import java.util.Queue;


public class LevelOrderTraversalLineByLine
{

    public static void main( String args[] )
    {

        Node root = new Node( 10 );
        root.left = new Node( 20 );
        root.right = new Node( 30 );

        root.left.left = new Node( 40 );
        root.left.right = new Node( 50 );

        root.right.left = new Node( 60 );
        root.right.right = new Node( 70 );        

        LevelOrderTraversalLineByLine lOrderLineByLine = new LevelOrderTraversalLineByLine();
        lOrderLineByLine.printLevelOrderTraversal( root );
        
    }


    public void printLevelOrderTraversal( Node root )
    {

        if ( root == null ) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add( root );

        while ( !queue.isEmpty() ) {

            int count = queue.size();
            for (int i=0;i<count;i++) {
             
                Node peekNode = queue.poll();
                System.out.print( peekNode.data + " " );

                if ( peekNode.left != null ) {

                    queue.add( peekNode.left );
                }

                if ( peekNode.right != null ) {
                    queue.add( peekNode.right );
                }
            }
            
            System.out.println(  );
        }

    }
}
