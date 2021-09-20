package ds.tree;

/**
 * Given Inorder and preorder traversal you haev to construct binary tree of it
 * @author shivamkumar
 *
 */
public class ConstructBTreeFromInOrderAndPreOrder
{
    
    int preOrderIndex = 0;
    public static void main (String args[]) {
        
        int[] in = {40, 20, 60, 50, 70, 10, 80, 100, 30};
        int[] pr = {10, 20, 40, 50, 60, 70, 30, 80, 100};
        
        ConstructBTreeFromInOrderAndPreOrder consTree = new ConstructBTreeFromInOrderAndPreOrder();
        LevelOrderTraversalLineByLine traverseLineByLine = new LevelOrderTraversalLineByLine();
        
        Node root = consTree.constructTree( in, pr, 0, in.length-1 );
        
        traverseLineByLine.printLevelOrderTraversal( root );
    }
    
    private Node constructTree ( int[] in, int[] pr, int st, int en) {
        
        if (st > en)
                return null;
        
        Node root = new Node (pr[preOrderIndex++]);
        
        int inIndex = 0;
        for (int i=st;i<=en;i++ ) {
            if (in[i] == root.data) {
                inIndex = i;
                break;
            }
        }
        
        root.left = constructTree( in, pr, st, inIndex-1 );
        root.right = constructTree( in, pr, inIndex+1, en );
        
        return root;
    }
}
