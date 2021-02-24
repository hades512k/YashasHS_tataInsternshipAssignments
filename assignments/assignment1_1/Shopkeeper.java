import java.util.Scanner;

class priceCalc{
    static float PRODUCTONE_PRICE = 22.50f;
    static float PRODUCTTWO_PRICE = 44.50f;
    static float PRODUCTTHREE_PRICE = 9.98f;

    static float returnPrice(int productNo,int quantiity){
        switch (productNo){
            case 1: return (PRODUCTONE_PRICE * quantiity);
            case 2: return (PRODUCTTWO_PRICE * quantiity);
            case 3: return (PRODUCTTHREE_PRICE * quantiity);

            default: return -1;
        }
    }
}

public class Shopkeeper {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter product Number");
        int productNo = input.nextInt();

        System.out.println("Enter quantity");
        int quantity = input.nextInt();

        float totalPrice = priceCalc.returnPrice(productNo,quantity);

        if(totalPrice == -1)
            System.out.println("Enter valid details");
        else
            System.out.println("Total price : "+ totalPrice);
    }
}
