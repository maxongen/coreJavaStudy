package main.inheritance;

public class AppleTree extends MangoTree{
    AppleTree(String base) {
        super(base);
    }

    public void treeType(){
        System.out.println("Apple Tree Type");
    }
}
