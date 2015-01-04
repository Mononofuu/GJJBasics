public class Task10_55 {
    public static void main(String[] args) {
        converter(97, 2);
        System.out.println();
        converter(97, 8);
        System.out.println();
        converter(161, 16);


    }

    static void converter(int num, int div) {
        if (num >= div) {
            converter(num / div, div);
//            if (div==16 & num%div>9){
            System.out.print(num % div);
        } else {
            if (div == 16) {
                switch (num % div) {
                    case 10:
                        System.out.print("A");
                        break;
                    case 11:
                        System.out.print("B");
                        break;
                    case 12:
                        System.out.print("C");
                        break;
                    case 13:
                        System.out.print("D");
                        break;
                    case 14:
                        System.out.print("E");
                        break;
                    case 15:
                        System.out.print("F");
                        break;
                }
            } else {
                System.out.print(num % div);
            }
        }
    }
}
