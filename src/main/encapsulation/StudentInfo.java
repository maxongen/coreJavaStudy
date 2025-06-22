package main.encapsulation;

public class StudentInfo {

    private String name;
    private int rollNo;
    private String className;
    private String schoolName;


    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    public int getRollNo(){
        return rollNo;
    }

    public void setClassName(String className){
        this.className=className;
    }
    public String getClassName(){
        return className;
    }

    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }
    public String getSchoolName(){
        return schoolName;
    }

}
