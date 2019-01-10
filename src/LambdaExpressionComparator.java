import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Product{
    int id;
    String name;
    float price;

    public Product(int id, String name, float price){
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}


public class LambdaExpressionComparator {
    public static void main(String args[]){
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1, "Mac", 2000f));
        productList.add(new Product(3, "PC", 500f));
        productList.add(new Product(5, "Laptop", 900f));

        productList.forEach(
                (n) -> System.out.println(n.id)
        );

    }
}
