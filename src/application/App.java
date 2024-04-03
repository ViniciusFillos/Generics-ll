package application;

import entities.Product;
import services.CalculationService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        File path = new File("Files\\input.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] product = line.split(",");
                list.add(new Product(product[0],Double.parseDouble(product[1])));
                line = br.readLine();
            }
            Product x = CalculationService.max(list);
            System.out.println("Most Expensive:");
            System.out.println(x);
        } catch (IOException e) {
            System.out.println("ERROR: "+e.getMessage());
        }
    }
}
