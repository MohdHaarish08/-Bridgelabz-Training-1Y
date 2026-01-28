import java.util.Scanner;

public class FriendsInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age and height: ");
        int ageA = sc.nextInt();
        int heightA = sc.nextInt();

        System.out.print("Enter Akbar's age and height: ");
        int ageB = sc.nextInt();
        int heightB = sc.nextInt();

        System.out.print("Enter Anthony's age and height: ");
        int ageC = sc.nextInt();
        int heightC = sc.nextInt();

        int youngestAge = Math.min(ageA, Math.min(ageB, ageC));
        int tallestHeight = Math.max(heightA, Math.max(heightB, heightC));

        System.out.println("Youngest age is " + youngestAge);
        System.out.println("Tallest height is " + tallestHeight);
    }
}
