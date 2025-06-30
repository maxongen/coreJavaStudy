package main.accessModifiers.package2;

import main.accessModifiers.package1.DefaultAccessModifier;
import main.accessModifiers.package1.PublicAccessModifier;

public class PublicAccessModifierImpl {
//public access modifier can be accessed from anywhere
//    if its static it accesses by class name directly otherwise we need to create an object of class

    public static void main(String[] args) {
        PublicAccessModifier tt=new PublicAccessModifier();
        System.out.println("public access variable - nationality : "+tt.nationality);
        tt.districtName();
        System.out.println("static public var State : "+PublicAccessModifier.state);

    }



}
