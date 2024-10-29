/**
 * @author Josh Gibb
 * TreeNode.java
 * A class creating a TreeNode object
 */
public class TreeNode {
    // Declaring all variables
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;
    
    // Constructor
    public TreeNode(int data){
        this.data = data;
        leftChild = null;
        rightChild = null;
    }
    // Accessor for the data variable 
    public int getData() {
        return data;
    }
    // Mutator for the data variable
    public void setData(int data) {
        this.data = data;
    }
    // Accessor for the nodes left child
    public TreeNode getLeftChild() {
        return leftChild;
    }
    // Mutator for the nodes left child
    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }
    // Accessor for the nodes left child
    public TreeNode getRightChild() {
        return rightChild;
    }
    // Mutator for the nodes left child
    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
    // toString which displays the data of the node
    public String toString(){
        return "Data = " + data;
    }
    
    // Recursive method to insert a new node into the tree
    public void insert(int value){
        TreeNode insert = new TreeNode(value);
        // If value is less than Data, go to left child
        if(value < data){
            if(leftChild == null){
                setLeftChild(insert);
            } else{
                leftChild.insert(value);
            }
        // If data is larger than Data, go to right child
        } else{
            if(rightChild == null){
                setRightChild(insert);
            } else{
                rightChild.insert(value);
            }
        } 
    }
    
    // A recursive method returning the node with a specific value
    public TreeNode get(int value){
        if(data == value)
            return this;
        if(value < data){
           if(getLeftChild() == null)
               return null;
            return leftChild.get(value);
        } else{
            if(getRightChild() == null)
               return null;
            return rightChild.get(value);
        }
    }
    
    // A recursive method returning the maximum value, the most right node
    public int max(){
        if(getRightChild() != null)
            return rightChild.max();
        return data;
    }
    
    // A recursive method returning the minimum value, the most left node
    public int min(){
        if(getLeftChild() != null)
            return leftChild.min();
        return data;
    }
    
    // A recurive method displaying the tree in ascending order
    public void traverseInOrder(){
        if(leftChild != null)
            leftChild.traverseInOrder();
        System.out.print(data + ",");
        if(rightChild != null)
            rightChild.traverseInOrder();
    }
    
    // A recursive method displaying the tree in PreOrder
    public void traversePreOrder(){
        System.out.print(data + ",");
        if(leftChild != null)
            leftChild.traversePreOrder();
        if(rightChild!= null)
            rightChild.traversePreOrder();
    }
    // A recursive method displaying the tree in PostOrder
    public void traversePostOrder(){
        if(leftChild != null)
            leftChild.traversePostOrder();
        if(rightChild!= null)
            rightChild.traversePostOrder();
        System.out.print(data + ",");
    }
}
