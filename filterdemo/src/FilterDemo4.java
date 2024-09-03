import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
     String productName;
    int productId;
     double productPrice;

    public Product(String productName, int productId, double productPrice) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "{" +
                "productName='" + productName + '\'' +
                ", productId=" + productId +
                ", productPrice=$" + productPrice +
                '}';
    }
}
public class FilterDemo4 {

    public static void main(String[] args) {
//        filter objects
        List<Product> productArrayList = new ArrayList<>();
        productArrayList.add(new Product("Toothpaste",123,3.65));
        productArrayList.add(new Product("Colgate",456,2.70));
        productArrayList.add(new Product("Nuggets",789,5.35));
        productArrayList.add(new Product("Jam",045,3.20));
        productArrayList.add(new Product("Pampers",368,15.65));
//        System.out.println(productArrayList);
//        System.out.println();
//        for (Product product:productArrayList) {
//            System.out.println(product);
//
//        }
//        product is the object
//        productArrayList.stream().filter(product->product.productPrice>5).collect(Collectors.toList());
        List<Product> newArrayList;
        newArrayList = productArrayList.stream().filter(product->product.productPrice>5).collect(Collectors.toList());
        System.out.println(newArrayList);
        productArrayList.stream().filter(product->product.productPrice>5).forEach(product-> System.out.println(product));
    }
}
