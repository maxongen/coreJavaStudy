package main.polymorphism;

public class ChildCarClass extends PunchCar{

    public static void main(String[] args) {
        System.out.println("---------Static Polymorphism-------------");
        System.out.println("-------- calling overwritten methods-------------");
        overWriteMethod();
        overWriteMethod(10);
        overWriteMethod("test");

        System.out.println("---------Dynamic Polymorphism-------------");
        System.out.println("-------- calling overridden methods-------------");
        System.out.println("=============calling base class CarClass method================");
        CarClass car=new CarClass();
        car.carModel();
        System.out.println("================calling overridden method from class TataCar================");
        car=new TataCar();
        car.carModel();
        System.out.println("================calling overridden method from class PunchCar================");
        car=new PunchCar();
        car.carModel();
    }

    public static void overWriteMethod(){
        System.out.println("this is overwritten method1");
    }

    public static void overWriteMethod(int i){
        System.out.println("this is overwritten method with int param val : "+i);
    }
    public static void overWriteMethod(String str){
        System.out.println("this is overwritten method with String val : "+str);
    }
}
