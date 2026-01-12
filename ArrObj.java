package Array;
class Student{
    int roll;
    String name;
    int marks;
}

public class ArrObj {
    public static void main(String[] args) {
        Student st = new Student();
        st.roll = 1;
        st.name = "Ab";
        st.marks = 89;

        Student st1 = new Student();
        st1.roll = 2;
        st1.name = "cd";
        st1.marks = 95;

        Student st2 = new Student();
        st2.roll = 3;
        st2.name = "ef";
        st2.marks = 98;

        Student s[] = new Student[3];
        s[0] = st;
        s[1] = st1;
        s[2] = st2;

        for(int i = 0; i < s.length; i++){
            System.out.println(s[i].roll + " " + s[i].name + ": " + s[i].marks);
        }
    }
}
