import javax.swing.event.SwingPropertyChangeSupport;

public class BinaryTree {
    BinaryNode root;
    public BinaryTree() {
        this.root = null;
    }
    void preOrder(BinaryNode node) {
        if(node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    

}

