package main.accessModifiers.package2;

import main.accessModifiers.package1.DefaultAccessModifier;

public class DefaultAccessModifierImpl {

    void test(){
        DefaultAccessModifier dd=new DefaultAccessModifier();
//        though we created a class object of default access modifier, it will not allow to use class contents outside of package
//        dd.defaultMethod();
    }
}
