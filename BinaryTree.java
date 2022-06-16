import javax.swing.event.SwingPropertyChangeSupport;

public class BinaryTree {
    BinaryNode root;
    public BinaryTree() {
        this.root = null;
    }
    void InOrder(BinaryNode node) {
        if(node == null) {
            return;
        }
        
        InOrder(node.left);
        System.out.print(node.value + " ");
        InOrder(node.right);
    }
    

}

