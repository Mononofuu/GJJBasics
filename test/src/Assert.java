public class Assert {
    static void assertEquals(String expected, String result) {
        if (expected.equals(result)) {
            System.out.printf("[PASSED] Expected: %s, actual: %s\n", expected, result);
        } else {
            System.out.printf("[FAILED] Expected: %s, actual: %s\n", expected, result);
        }
    }

    static void assertEquals(char expected, char result) {
        if (expected == result) {
            System.out.printf("[PASSED] Expected: %s, actual: %s\n", expected, result);
        } else {
            System.out.printf("[FAILED] Expected: %s, actual: %s\n", expected, result);
        }
    }

    static void assertEquals(Boolean expected, Boolean result) {
        if (expected.equals(result)) {
            System.out.printf("[PASSED] Expected: %s, actual: %s\n", expected, result);
        } else {
            System.out.printf("[FAILED] Expected: %s, actual: %s\n", expected, result);
        }
    }

    public static void assertEquals(int expected, int result) {
        if (expected == result) {
            System.out.printf("[PASSED] Expected: %s, actual: %s\n", expected, result);
        } else {
            System.out.printf("[FAILED] Expected: %s, actual: %s\n", expected, result);
        }
    }

    public static void assertEquals(String expected, int[] array) {
        String result = "";
        for (int i : array) result += i;
        if (expected.equals(result)) {
            System.out.printf("[PASSED] Expected: %s, actual: %s\n", expected, result);
        } else {
            System.out.printf("[FAILED] Expected: %s, actual: %s\n", expected, result);
        }
    }
}
