package main.inheritance;

public class ChildTree extends AppleTree{
    ChildTree(String base) {
        super(base);
    }

    public void test(){
        super.treeType();
    }
    public static void main(String[] args) {
        ChildTree childTree=new ChildTree("Child Tree");
        childTree.test();

        AppleTree appleTree=new AppleTree("apple tree");
        appleTree.treeType();

        MangoTree mangoTree=new MangoTree("mango tree");
        mangoTree.treeType();
    }
}
