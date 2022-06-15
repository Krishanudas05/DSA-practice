import java.util.ArrayList;
public class Tree {
    String data;
        ArrayList<Tree> children;

        public Tree(String data) {
            this.data = data;
            this.children = new ArrayList<Tree>();
        }

        public void addChild(Tree node) {
            this.children.add(node);
        }
        public String print(int level) {
            String ret;
            ret = " ".repeat(level)+data+"\n";
            for(Tree node : this.children) {
                ret += node.print(level+1);
            }
            return ret;
        }
        
}
