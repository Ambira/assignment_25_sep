import java.util.Scanner;
public class Result_generator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of marks: ");
            int number_of_Marks = sc.nextInt();
            int total_Marks = 0;

            for (int i = 1; i <= number_of_Marks; i++) {
                System.out.print("Enter marks " + i + " ");
                int mark = sc.nextInt();


                total_Marks = number_of_Marks + mark;
            }

            double averageMarks = (double) total_Marks / number_of_Marks;

            System.out.println("Your Total Marks is : " + total_Marks);
            System.out.println("Your Average Marks is: " + averageMarks);


        }
    }

