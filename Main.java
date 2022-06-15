import javax.swing.plaf.synth.SynthSplitPaneUI;

class Main {
    public static void main(String[] args) {
        Tree drinks = new Tree("Drinks");
        Tree hot = new Tree("Hot");
        Tree cold = new Tree("Cold");
        Tree tea = new Tree("Tea");
        Tree coffee = new Tree("Coffee");
        Tree wine = new Tree("Wine");
        Tree beer = new Tree("Beer");
        drinks.addChild(hot);
        drinks.addChild(cold);
        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(wine);
        cold.addChild(beer);
        System.out.println(drinks.print(0));

    }
}