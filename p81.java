class User{
    String uName;
    int id;
    String email;
    void displayUser(){
        System.out.println("Details are  :"+id+" "+uName+" "+email);
    }

}
class Student extends User{

}
class Trainer extends User{

}

public class p81 {
    public static void main(String[] args) {
        Student s1=new Student();
        Trainer t1=new Trainer();

        s1.uName="Harsha";
        s1.id=101;
        s1.email="XYZ@gmail.com";


        t1.uName="Manoj";
        s1.uName="GP";
//        s1.displayUser();
//        t1.displayUser();
        User u1=new User();
////        t1.displayUser();
        u1.displayUser();
    }
}
