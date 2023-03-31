import java.util.Scanner;
public class product {
    int pcode;
    String pname;
    int price;

    public product() {
	Scanner scanner = new Scanner(System.in);

        System.out.println("input product code:");
        this.pcode = scanner.nextInt();

        System.out.println("input product name:");
        this.pname = scanner.next();

        System.out.println("input product prize:");
        this.price = scanner.nextInt();

    }

    public static void main(String[] args) {
        product p1 = new product();
        product p2 = new product();
        product p3 = new product();

        product lowestPriceProduct = p1;
        if (p2.price < lowestPriceProduct.price) {
            lowestPriceProduct = p2;
        }
        if (p3.price < lowestPriceProduct.price) {
            lowestPriceProduct = p3;
        }

        System.out.println("Product with the lowest price:");
        System.out.println("Product code: " + lowestPriceProduct.pcode);
        System.out.println("Product name: " + lowestPriceProduct.pname);
        System.out.println("Product price: " + lowestPriceProduct.price);
    }
}
