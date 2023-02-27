
public class StringReverseRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = scanner.nextLine();
        String reversedStr = reverse(str);
        System.out.println("Reversed string: " + reversedStr);
    }
