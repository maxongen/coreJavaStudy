package main.accessModifiers.package2;

import main.accessModifiers.package1.ProtectedAccessModifier;

public class ProtectedAccessModifierImpl extends ProtectedAccessModifier{
    public static void main(String[] args) {
        ProtectedAccessModifierImpl tt=new ProtectedAccessModifierImpl();
        tt.testProtected();
    }

//    until and unless we make this class as subclass of protected, it will not access methods and variables
//    protected access modifiers can be accessed either subclass or the same package
    public void testProtected(){
        proVal="accessed protected value";
        System.out.println("update value : "+proVal);
        printProVal();
    }
}
