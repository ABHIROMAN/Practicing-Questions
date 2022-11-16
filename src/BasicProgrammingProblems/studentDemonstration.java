package BasicProgrammingProblems;
import java.util.*;

interface Registrable {
    public abstract String register() ;
}

class Department {
    String name;

    public Department(String n) {
        name = n;
    }
    private class DeptEnquiry implements Registrable {
        int reqseats;
        int avlseats;
        public DeptEnquiry(int s) {
            reqseats = s;
            avlseats = 5;
        }
        public String register() {
            if(avlseats < reqseats) return "cannot register";
            else {
                avlseats = avlseats-reqseats;
                return "Registered successfully"+avlseats;
            }
        }
    }
    public Registrable enrollRequest(int n) {
        Registrable obj = new Registrable() {
            @Override
            public String register() {
                return super.toString();
            }
        };
//        obj.register();
        return obj;
    }

}
public class studentDemonstration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Department d1 = new Department("DCSE");
        Registrable r1 = d1.enrollRequest(sc.nextInt());
        System.out.println(r1.register());
    }
}
