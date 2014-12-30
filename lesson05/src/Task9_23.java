public class Task9_23 {
    public static void main(String[] args) {
        if (args.length == 3) {
            System.out.println(args[0].substring(Integer.parseInt(args[1]) - 1, Integer.parseInt(args[2])));
        }
    }
}
