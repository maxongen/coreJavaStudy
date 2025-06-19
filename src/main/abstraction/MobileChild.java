package main.abstraction;

public class MobileChild {

    public static void main(String[] args) {
        MobileParent ref=new SamsungClass();
        ref.printModel();
        ref=new IphoneClass();
        ref.printModel();

    }
}
