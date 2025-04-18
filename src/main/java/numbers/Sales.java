package numbers;

public class Sales {
    public static double discount(int price, int percentage){
        double deduct = (percentage/100.0) * price;
        double finalPrice = price - deduct;
        return finalPrice;
    }

    public static void main(String[] args) {
    int price = 300;
    int percentage = 25;

    System.out.println(discount(price, percentage));
}
    }
  
