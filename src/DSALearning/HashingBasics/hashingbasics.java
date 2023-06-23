package DSALearning.HashingBasics;

import java.util.HashMap;
import java.util.HashSet;

public class hashingbasics {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("one", "I");
        map.put("two", "II");

        System.out.println(map);

        HashSet<Integer> set = new HashSet<>();
        set.add(34);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(3);

        System.out.println(set);

        HashSet<Student> rollCall = new HashSet<>();
        Student s1 = new Student(1, "Abhi");
        Student s2 = new Student(4, "Raman");
        Student s3 = new Student(5, "Rakesh");

        rollCall.add(s1);
        rollCall.add(s2);
        rollCall.add(s3);

        System.out.println(rollCall);

        Student s4 = new Student(1, "Abhishek");
        rollCall.add(s4);
        System.out.println(rollCall);

    }
}

class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String toString() {
        return "[" + rollNo + " , " +name+"]";
    }

    public int hashCode() {
        return rollNo;
    }

    public boolean equals(Object obj) {
        Student that = (Student)obj;
        if(this.rollNo == that.rollNo) {
            return true;
        }
        return false;
    }
}