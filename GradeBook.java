package Simple_programs;
import java.util.Scanner;

public class GradeBook {

    // 2D array to store grades
    private double[][] g1;

    // constructor to set size of array
    public GradeBook(int s, int e) {
        g1 = new double[s][e];
    }

    // method to input grades
    public void setGrades() {
        Scanner s1 = new Scanner(System.in);

        for (int i = 0; i < g1.length; i++) {
            System.out.println("Enter grades for student " + (i + 1));

            for (int j = 0; j < g1[i].length; j++) {
                System.out.print("Exam " + (j + 1) + ": ");
                g1[i][j] = s1.nextDouble();
            }
        }
    }

    // find minimum grade
    public double getMin() {
        double g2 = g1[0][0];

        for (int i = 0; i < g1.length; i++) {
            for (int j = 0; j < g1[i].length; j++) {
                if (g1[i][j] < g2) {
                    g2 = g1[i][j];
                }
            }
        }
        return g2;
    }
    // find maximum grade
    public double getMax() {
        double g2 = g1[0][0];

        for (int i = 0; i < g1.length; i++) {
            for (int j = 0; j < g1[i].length; j++) {
                if (g1[i][j] > g2) {
                    g2 = g1[i][j];
                }
            }}
        return g2; }
    // average of a student
    public double getAvg(int sIndex) {
        double g2 = 0;
        for (int j = 0; j < g1[sIndex].length; j++) {
            g2 += g1[sIndex][j];
        }
        return g2 / g1[sIndex].length;}
    public static void main(String[] args) {//main function
        Scanner s1 = new Scanner(System.in);//defining scanner
        System.out.print("Number of students: ");
        int s = s1.nextInt();
        System.out.print("Number of exams: ");
        int e = s1.nextInt();
        GradeBook g = new GradeBook(s, e);//sending constructor value
        g.setGrades();//setting grades
        System.out.println("Lowest grade: " + g.getMin());
        System.out.println("Highest grade: " + g.getMax());
        for (int i = 0; i < s; i++) {
            System.out.println("Average of student " + (i + 1) + ": " + g.getAvg(i));
        }
    }
}
