public class AddTwoBinaryNumber_002 {

    public static void main(String[] args)
    {

    AddTwoBinaryNumber_002 add =new AddTwoBinaryNumber_002();
    add.AddBinaryNumber();

    }

    public void AddBinaryNumber()
    {

        String b1 = Integer.toBinaryString(10);
        String b2 = Integer.toBinaryString(11);
        String sum = b1 + b2;
        System.out.println(sum);

    }
}

