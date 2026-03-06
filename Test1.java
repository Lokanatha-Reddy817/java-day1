class student{
    int Rollno;
    String name;
    int Marks;
}
public class Test1 {
public static void main(String[] args) {
    student stu = new student();
    stu.Rollno = 1;
    stu.name = "nani";
    stu.Marks = 100;
    student stu1 = new student();
    stu1.Rollno = 1;
    stu1.name = "kishore";
    stu1.Marks = 100;
    student stu2 = new student();
    stu2.Rollno = 1;
    stu2.name = "damu";
    stu2.Marks = 100;
    student students[] = new student[3];
    students[0] = stu;
    students[1] = stu1;
    students[2] = stu2;
    for (int i = 0; i < students.length; i++) {
        System.out.println(students[i].name + ":" + students[i].Marks);
    }
}
}

