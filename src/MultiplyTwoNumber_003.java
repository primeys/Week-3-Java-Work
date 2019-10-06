public class MultiplyTwoNumber_003 {
    // Main Method
    public static void main(String[] args) {
        // Call Instance Method via Object creation
        MultiplyTwoNumber_003 mtn = new MultiplyTwoNumber_003();
        mtn.MultiplyTwoBinaryNumber();
    }

    // Instance Method
    public void MultiplyTwoBinaryNumber( ) {

        long a1 = 10, a2 = 11;
        long d = 0;
        long b, c =1;

        while (a2 != 0)
        {
            b = (a2 % 10);
            if (b ==1){
                a1 = a1 *c;
            } else
                {
                    a1 = a2 * c;
                }
                a2 = a2/10;
                c =10;
        }
      //  System.out.println(" a1 x a2 is = " + d+ "\n ");
    }
}