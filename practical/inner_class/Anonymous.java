abstract class CL1 {
    public abstract void show1();
}

class CL2 {
    public void show2() {
        System.out.println("Inside CL2's show2 (without overriding)");
    }
}

class Outer {
    CL1 ob1 = new CL1() {
        public void show1() {
            System.out.println("Inside Outer: ob1: CL1's show1");
        }
    };

    CL2 ob2 = new CL2() {
        public void show2() {
            System.out.println("Inside Outer: ob2: CL2's show2");
        }
    };

    CL2 ob3 = new CL2() {
    };

    public void display() {

        CL1 ob4 = new CL1() {
            public void show1() {
                System.out.println("Inside Outer: display: ob4: CL1's show1");
            }
        };

        CL2 ob5 = new CL2() {
            public void show2() {
                System.out.println("Inside Outer: display: ob5: CL2's show2");
            }
        };

        ob4.show1();
        ob5.show2();
    }

}

public class Anonymous {
    public static void main(String[] arg) {
        Outer obj = new Outer();
        obj.ob1.show1();
        obj.ob2.show2();
        obj.ob3.show2();
        obj.display();
    }
}
