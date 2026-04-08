abstract class Marks {
    abstract double getPercentage();
}
class A extends Marks {
    double s1, s2, s3;
    A(double m1, double m2, double m3) {
        this.s1 = m1;
        this.s2 = m2;
        this.s3 = m3;
    }

    double getPercentage() {
        return (s1 + s2 + s3) / 3.0;
    }
}
class B extends Marks {
    double s1, s2, s3, s4;
    B(double m1, double m2, double m3, double m4) {
        this.s1 = m1;
        this.s2 = m2;
        this.s3 = m3;
        this.s4 = m4;
    }
    double getPercentage() {
        return (s1 + s2 + s3 + s4) / 4.0;
    }
}
public class Main {
    public static void main(String[] args) {
        A studentA = new A(85, 90, 78);
        B studentB = new B(80, 75, 92, 88);

        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}