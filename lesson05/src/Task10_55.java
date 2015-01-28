public class Task10_55 {
    public static void main(String[] args) {
        Assert.assertEquals("1100001",converter(97, 2));
        Assert.assertEquals("141",converter(97, 8));
        Assert.assertEquals("E",converter(14, 16));
        Assert.assertEquals("181",converter(385, 16));
        Assert.assertEquals("1024",converter(4132, 16));
        Assert.assertEquals("3FD",converter(1021, 16));
    }

    static String converter(int num, int div){
        if (num<div){
            if (div==16 && num>=10){
                char c = (char) (55 + num);
                return c + "";
            }else {
                return "" + num%div;
            }
        }
        int rest = num%div;
        if (div == 16 && rest>=10){
            char c = (char) (55 + rest);
            return "" + converter(num/div, div) + c;
        }
        return "" + converter(num/div, div) + num%div;
    }
}
