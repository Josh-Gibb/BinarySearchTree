/**
 * @author Josh Gibb
 * BSTDriver.tree
 * A project to test the Binary Search Tree algorithm
 */
public class BSTDriver {
    
    public static void main(String[] args){
        // Inserting nodes into the tree
        BSTTree intTree = new BSTTree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(17);
        
        
        // Displaying properties of the BST
        intTree.traverseInOrder();
        System.out.println();
       
        System.out.println("return value get(29) " + intTree.get(29));
        System.out.println("return value get(888) " + intTree.get(888));
        System.out.println("return value get(17) " + intTree.get(17));
        
        System.out.println("return value min(): " + intTree.min());
        System.out.println("return value max(): " + intTree.max());
        
        System.out.println();
        
        System.out.println("output for delete(30)");
        intTree.delete(30);
        System.out.println();
        intTree.traverseInOrder();
    }
}
