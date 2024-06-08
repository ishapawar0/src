import java.util.Scanner;
public class Studentgradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of subject 1:");
        int s1 = sc.nextInt();

        System.out.println("Enter the marks of subject 2");
        int s2 = sc.nextInt();
        System.out.println("Enter the marks of subject 3:");
        int s3 = sc.nextInt();
        System.out.println("Enter the marks of subject 4:");
        int s4 = sc.nextInt();
        System.out.println("Enter the marks of subject 5:");
        int s5 = sc.nextInt();
        int totalMarks = s1 + s2 + s3 + s4 + s5;


        double Percentage = totalMarks / 5;

        int Grade;
        if (Percentage >= 90) {
            System.out.println("Grade:A");
            ;
        } else if (Percentage >= 80) {
            System.out.println("Grade:B");
        } else if (Percentage >= 70) {
            System.out.println("Grade:C");
        } else if (Percentage >= 60) {
            System.out.println("Grade:D");
        } else {
            System.out.println("Grade:E");
        }


        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + Percentage + "%");
    }
}


    

