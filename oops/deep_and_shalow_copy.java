package oops;

public class deep_and_shalow_copy {
    public static void main(String arg[]) {
        student s1 = new student();
        s1.name = "soham";
        s1.passaword = "abcd";
        s1.rollno = 55;
        s1.mark[0] = 100;
        s1.mark[1] = 90;
        s1.mark[2] = 80;

        student s2 = new student(s1);
        s2.passaword = "xyz";
        s1.mark[0] = 55;
        for (int i = 0; i < s2.mark.length; i++) {
            System.out.println(s2.mark[i]);
        }

    }

}

class student {

    String name;
    int rollno;
    String passaword;
    int mark[] = new int[3];

    student() {
    }
    // shalow copy
    // over here " this.mark = s1.mark; " pointing to same array which created in s1
    // constructor it just taking reference but in deep we create other array from
    // same name

    // student (student s1){
    // System.out.println(this.name = s1.name);
    // System.out.println(this.rollno = s1.rollno);
    // this.mark = s1.mark;
    // }

    // deep copy
    // over in this we creted our own array so if changes occure in s1 class still
    // it will not affect to s2 class
    student(student s1) {
        System.out.println(this.name = s1.name);
        System.out.println(this.rollno = s1.rollno);
        for (int i = 0; i < s1.mark.length; i++) {
            this.mark[i] = s1.mark[i];
        }
    }

    student(String name) {
        this.name = name;
        System.out.println(name);
    }

    student(int rollno) {
        this.rollno = rollno;
        System.out.println(rollno);
    }
}
