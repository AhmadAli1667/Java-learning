public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 544521;
        s1.batch = 2025;
        s1.name = "Ali Saqib";
        s1.cgpa = 4.0;
    }
}

class Student{
   String name;
   int id;
   double cgpa;
   int batch;

}