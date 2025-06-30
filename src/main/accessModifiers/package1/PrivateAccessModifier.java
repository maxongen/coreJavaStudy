package main.accessModifiers.package1;

public class PrivateAccessModifier {
    private String priVar="private variable";

    private void printPriVar(){
        System.out.println("private variable cannot be accessed outside "+priVar);
    }
}
