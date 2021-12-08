public class LearnMethod {
    public static void main (String[] args) {

        int a = 5;
        int b = 8;
        String z = sum(a, b);
        IBIO.output(z);
    }

    static String sum(int x, int y) {
        int z = x+y;
        String s = "This is the sum of " + x + " and " + y + "=" + z;
       return s;
    }

}
