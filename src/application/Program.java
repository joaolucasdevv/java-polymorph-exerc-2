package application;

import application.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            System.out.println("Product #" + i + "data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char resp = sc.next().charAt(0);
            switch (resp) {
                case 'c':
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    Product product = new Product(name, price);
                    products.add(product);
            }
        }


        sc.close();
    }

}
