package javaprogrammes;

import java.util.Scanner;
/* Rewrite the student mark sheet programme (From java-homework-week3
programmes) using if else and while loop.
* */
/* Write a java program to input student Name, roll No, and three subjects Math, Science and English marks
 (marks is between 0 to 100 and if it is out of range print error message “Invalid Input,
 Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 %> = 60 A, %> = 50 B, %> = 35 C
 And print Mark Sheet in following format
 _______________________________
 || | Mark Sheet | |
 _______________________________
 | | Name : Jay | | Roll No : 08 |
 |_______________________________|
 | Subjects : Marks | |
 _______________________________|
 | Math : 98 |
 | Science : 90 |
 | English : 85 |
 |_______________________________|
 | Total : 273 |
 |_______________________________|
 | Percentage : 91.0 |
 | Result : Pass |
 | Grade : A+ |
 |_______________________________|
* */
public class Programme_2_StudentMarkSheet {

    public static void main(String[] args) {
        calculate();
    }
    public static void calculate() {

        String result, grade = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String name = scanner.next();
        System.out.println("Enter Roll No: ");
        int rollno = scanner.nextInt();

        System.out.println("Enter marks for Maths: ");
        int maths = scanner.nextInt();
        while (maths > 100 || maths < 0) {
            System.out.println("Invalid Input, Maths marks should be between 0 to 100");
            maths = scanner.nextInt();
        }
        System.out.println("Enter marks for Science");
        int science = scanner.nextInt();
        while (science > 100 || science < 0) {
            System.out.println("Invalid Input, Science marks should be between 0 to 100");
            science = scanner.nextInt();
        }
        System.out.println("Enter marks for English");
        int english = scanner.nextInt();
        while (english > 100 || english < 0) {
            System.out.println("Invalid Input, English marks should be between 0 to 100");
            english = scanner.nextInt();
        }
        double total = maths + science + english;
        System.out.println("Total marks for Maths + Science + English is: " + total);

        double percentage = total / 300 * 100;
        System.out.println("Percentage of all three subject is: " + percentage);

        if (percentage >= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        System.out.println(result);
        if (percentage >= 35) {
            grade = "A+";
            System.out.println("Grade" + grade);
        } else if (percentage >= 60 && percentage < 80) {
            grade = "A";
            System.out.println("Grade" + grade);
        } else if (percentage >= 50 && percentage < 60) {
            grade = "B";
            System.out.println("Grade" + grade);
        } else if (percentage >= 35 && percentage < 50) {
            grade = "C";
            System.out.println("Grade" + grade);
        } else {
            grade = "";
        }
        scanner.close();

        System.out.println("____________________________________");
        System.out.println("|            Mark  Sheet           |");
        System.out.println("|__________________________________|");
        System.out.println("| Name  :     " + name + "         |");
        System.out.println("| Roll No  :  " + rollno + "       |");
        System.out.println("|__________________________________|");
        System.out.println("| Subjects  :     Marks            |");
        System.out.println("|__________________________________|");
        System.out.println("| Maths    : " + maths + "         |");
        System.out.println("| Science  : " + science + "       |");
        System.out.println("| English  : " + english + "       |");
        System.out.println("|__________________________________|");
        System.out.println("| Total    : " + total + "         |");
        System.out.println("|__________________________________|");
        System.out.println("| Percentage  : " + percentage + " |");
        System.out.println("| Result  : " + result + "         |");
        System.out.println("| Grade  : " + grade + "           |");
        System.out.println("|__________________________________|");


    }
}
