package main.inheritance;

public class MangoTree extends TreeBase{
    MangoTree(String base) {
        super(base);
    }

    public void treeType(){
        System.out.println("base tree type");
    }
}
