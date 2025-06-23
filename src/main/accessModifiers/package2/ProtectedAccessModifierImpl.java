package main.accessModifiers.package2;

import main.accessModifiers.package1.ProtectedAccessModifier;

public class PublicAccessModifierImpl extends  ProtectedAccessModifier{
    public static void main(String[] args) {
//        until and unless we extend this with ProtectedAccessModifier class
        ProtectedAccessModifier test=new ProtectedAccessModifier();
        printProVal();
    }
}
