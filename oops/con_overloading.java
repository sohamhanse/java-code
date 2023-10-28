package oops;

public class con_overloading {
    public static void main(String arg[]) {
        person s1 = new person();
        person s2 = new person("soham");
        person s3 = new person(55);
    }
}

class person {
    String name;
    int rollno;

    person() {
        System.out.println(
                "it is an constructor with no parametr which exicute using line present at 5 becase if there is no parameter to s1 object ");
    }

    person(String name) {
        this.name = name;
        System.out.println(name); // over here parameter is string so s2 is exicuter because we pass string in s2
                                  // as per requarement we can call as many constructor as you want
    }

    person(int rollno) {
        this.rollno = rollno;
        System.out.println(rollno);
    }
}
