package rikkei;

public class MainStudent {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "Chinh");
        Student s2 = new Student(222, "Toan");
        Student s3 = new Student(333, "Dung");
        s1.disPlay();
        s2.disPlay();
        s3.disPlay();
    }

}
