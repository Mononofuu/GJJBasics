public class Task9_17 {
    public static void main(String[] args) {
        if (args.length == 1) {
            System.out.println(args[0].toLowerCase().charAt(0) == args[0].charAt(args[0].length() - 1));
        }
    }
}
