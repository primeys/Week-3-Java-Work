import java.util.*;

public class SwapTwoNumber_001 {

    //Main Method

public  static void main (String[] args)
{
    SwapTwoNumber_001 Stn = new SwapTwoNumber_001();
    Stn.TwoNumberSwap();

}

public void TwoNumberSwap()
{
int a, b ;
    //System.out.println("Enter a and b");

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the value of a ");
    a = scanner.nextInt();

    System.out.println("Enter the value of b ");
    b = scanner.nextInt();

    System.out.println( "You enter numbers\na = "+a+"\nb = "+b);

    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println( "After Swapping the numbers\na = "+a+"\nb = "+b);

}


}
