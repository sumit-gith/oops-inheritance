import java.util.Scanner;

public class string_buffer_6 {
    static String shortLongShort(String str1, String str2) {
        if(str1.length() < str2.length())
            return str1 + str2 + str1;
        else
            return str2 + str1 + str2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the 1st string: ");
        String a = scan.nextLine();
        System.out.print("Enter the 2nd string: ");
        String b = scan.nextLine();

        System.out.println(shortLongShort(a, b));
    }

}
