package services;

import entities.Product;

import java.util.List;

public class CalculationService {

    public static Product max(List<Product> list) {
        if(list.isEmpty()) {
            throw new IllegalStateException("List cannot be empty");
        }
        Product max = list.get(0);
        for (Product item : list) {
            if(item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
