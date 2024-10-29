/**
 * @author Josh Gibb
 * BSTTree.java
 * A class with implementing all the algorithms for a functioning BST
 */
public class BSTTree {
    private TreeNode root;
    
    // Inserting a new node into the tree
    public void insert(int value){
        if(root == null){
            root = new TreeNode(value);
        } else{
            root.insert(value);
        }
    }
    
    // Getting the value of the current root
    public int getVal(){
        return root.getData();
    }
    
    // Gets the Sub-Tree with a root with a specific value
    public TreeNode get(int value){
        if(root != null)
            return root.get(value);;
        return null;
    }
    
    // Returns the minimum node in the tree
    public int min(){
        if(root == null)
            return Integer.MIN_VALUE;
        return root.min();
    }
    
    // Returns the largest node in the tree
    public int max(){
        if(root == null)
            return Integer.MAX_VALUE;
        return root.max();
    }
    
    // Displays the tree in ascending order
    public void traverseInOrder(){
        if(root != null){
            root.traverseInOrder();
            /*System.out.println();
            root.traversePostOrder();
            System.out.println();
            root.traversePreOrder();*/
        }
    }
    
    // Removes a node
    public void delete(int value){
        root = delete(root, value);
    }
    
    // A recursive function that locates and removes a desired node 
    private TreeNode delete(TreeNode subtreeRoot, int value){
        // End case: Unable to find node
        if(subtreeRoot == null){
            System.out.println("Failed to find the node");
            return subtreeRoot;
        }
        // If the value is less than the subroot, go to the left and recall the method
        if(value < subtreeRoot.getData()){
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        // If the value is greater than the subroot, go to the right and recall the method     
        } else if(value > subtreeRoot.getData()){
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        }
        // If the value is the same as the root
        else{
            // If the subroot does not have a left root, use the right root to replace the node
            if(subtreeRoot.getLeftChild() == null){
                System.out.println("case 1 and 2 parent " + subtreeRoot + " RightChild " + subtreeRoot.getRightChild());
                return subtreeRoot.getRightChild();
            // If the subroot does not have a right root, use the left root to replace the node
            } else if(subtreeRoot.getRightChild() == null){
                System.out.println("case 1 and 2 parent " + subtreeRoot + " LeftChild " + subtreeRoot.getLeftChild());
                return subtreeRoot.getLeftChild();
            // Get the minimum node from the right subtree to replace the node
            } else{
                System.out.println("Node with two to be deleted " + subtreeRoot);
                System.out.println("Case 3: Replacement node " + subtreeRoot.getRightChild().min());
                
                subtreeRoot.setData(subtreeRoot.getRightChild().min());
                System.out.println("Delete min value in subtree");
                
                subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
            }
        }
        System.out.print("Original Node " + subtreeRoot + " ");
        return subtreeRoot;
    }
    
}
