public class DigitizeNumbers {

    public static int[] digitize(long n) {
        String[] ints = new StringBuilder(Long.toString(n)).reverse().toString().split("");
        int[] numsToArray = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            numsToArray[i] = Integer.parseInt(ints[i]);
        }
        return numsToArray;
    }
}
