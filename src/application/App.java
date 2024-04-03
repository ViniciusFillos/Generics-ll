package application;

import services.CalculationService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        File path = new File("Files\\input.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                list.add(Integer.parseInt(line));
                line = br.readLine();
            }
            Integer x = CalculationService.max(list);
            System.out.println("MAX:");
            System.out.println(x);
        } catch (IOException e) {
            System.out.println("ERROR: "+e.getMessage());
        }
    }
}
