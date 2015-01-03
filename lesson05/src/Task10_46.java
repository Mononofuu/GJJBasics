public class Task10_46 {
    public static void main(String[] args) {
        Assert.assertEquals(16, getMember(2, 2, 4));
        Assert.assertEquals(14, getSumOfMembers(2, 2, 3));
    }

    static int getMember(int first, int dif, int n) {
        if (n == 1) return first;
        return getMember(first * dif, dif, n - 1);
    }

    static int getSumOfMembers(int first, int dif, int n) {
        if (n == 1) return first;
        return first + getSumOfMembers(first * dif, dif, n - 1);
    }
}