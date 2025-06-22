package main.encapsulation;

public class StudentData extends StudentInfo{

    public static void main(String[] args) {
        StudentInfo stdInfo=new StudentInfo();
        stdInfo.setName("maxongen");
        stdInfo.setClassName("jr.kg");
        stdInfo.setRollNo(14);
        stdInfo.setSchoolName("abc school");

        System.out.println("-----below are student info-----");
        System.out.println("Student Name : "+stdInfo.getName());
        System.out.println("Student ClassName : "+stdInfo.getClassName());
        System.out.println("Student RollNo : "+stdInfo.getRollNo());
        System.out.println("Student School Name : "+stdInfo.getSchoolName());
    }
}
