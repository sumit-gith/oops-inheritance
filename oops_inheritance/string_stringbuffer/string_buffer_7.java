import java.util.Scanner;

public class string_buffer_7 {
    static String removeX(String str) {
        if (str.charAt(0) == 'x' && str.charAt(str.length()-1) == 'x')
            return str.substring(1, str.length()-1);
        else
            return str;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scan.nextLine();

        System.out.println(removeX(str));
    }
}
