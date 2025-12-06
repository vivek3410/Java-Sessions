package ClassesConcept;

class Student {
    String lname;
    String fname;
    int rollNo;
    String gender;
    String mobile;

    static String ADM = "USC123";

    Student(String lname,String fname,int rollNo,String gender,String mobile){
        System.out.println("Constructor from Class Student");
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.rollNo = rollNo;
        this.mobile = mobile;
    }

    public static void print(){
        System.out.println("Another Instance method");
    }

    public void fullname(){
        System.out.println(fname + " " + lname);
    }


}

public class Main{
    public static void main(String args[]){
        Student std1 = new Student("Mamidi","Vivek",123,"Male","mobile");

        Student.print();

        System.out.println(Student.ADM);

        std1.fullname();

        Abc obj = new Abc();

        obj.print();

        First obj2 = new First();

        obj2.print("Vivek");

    }
}


