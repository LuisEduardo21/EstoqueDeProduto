package Aplication;
import Entidade.Product;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {

    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Entre com o produto ");
        System.out.print("nome: ");
        product.name = sc.nextLine();
        System.out.print("preço: ");
        product.price = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: "+product);

        System.out.println();
        System.out.print("Entre com o numeros de produtos em estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Update data: "+product);

        System.out.println();
        System.out.print("Entre com o numeros de produtos removidos do estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Update data: "+product);

        sc.close();
    }
}

