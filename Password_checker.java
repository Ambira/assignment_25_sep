import java.util.Scanner;
public class Password_checker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Password = "Powerslave";


        int totalTries = 5;
        int remaining_tries = totalTries;


        for (int try_count = 1; try_count <= totalTries; try_count++) {
            System.out.print("Enter the password (Attempt " + try_count + "/" + totalTries + "): ");
            String entered_Password = sc.nextLine();

            if (entered_Password.equals(Password)) {
                System.out.println("***** Welcome **** to the system I think");
                break;
            } else {
                remaining_tries--;
                if (remaining_tries > 0) {
                    System.out.println("Incorrect password.Hint a song of Iron Madien. You have " + remaining_tries + " remaining tries.");
                } else {
                    System.out.println("Wrong password. All your tries are over. Bye.");
                }
            }
        }

    }
}


