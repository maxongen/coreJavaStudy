package main.accessModifiers.package1;

public class DefaultAccessModifierImpl1 {

    void test(){
//        default access modifier can be accessed within the same package
        DefaultAccessModifier dd=new DefaultAccessModifier();
        dd.defaultMethod();
    }
}
