public class Student{
    String name;
    String major;
    double gpa;

    Student(String name, String major, double gpa){
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public boolean onHonors(){
        if(this.gpa > 3.5){
            return true;
        }else{
            return false;
        }
    }

}