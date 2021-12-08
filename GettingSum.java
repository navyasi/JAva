public class GettingSum {
    public static void main(String[]args){
        int sum = 0;
        int x = 0;
       do{
            x = IBIO.inputInt("Enter Number: ");
            if (x <= -1) break;
            sum = sum + x;

        } while (x > -1);
        IBIO.output(sum);
    }

}
