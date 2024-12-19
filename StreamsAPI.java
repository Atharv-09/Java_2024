import java.util.*;
import java.util.stream.*;

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class StreamsAPI {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        List<Float> productPriceList = new ArrayList<Float>();  
        for(Product product: productsList){  
              
            // filtering data of list  
            if(product.price<30000){  
                productPriceList.add(product.price);    // adding price to a productPriceList  
            }  
        }  
        System.out.println(productPriceList);   // displaying data  

        List<Float> sortedL = productsList.stream()
                    .filter(prod -> prod.price > 27000)
                    .map(p -> p.price)
                    .collect(Collectors.toList());
        System.out.println(sortedL);


        new StreamCheck().method();
    }  
}  


class StreamCheck {


    /*Stream<Integer> lStream = list.stream();
     * Stream<Integer> filtered = lStream.filter(i -> i%2!=0);
     * Stream<Integer> doubled = filtered.map(i -> i*2);
     * Stream<Integer> sortedData = doubled.sorted();
        sortedData.forEach(x -> System.out.println(x));

        OR

        list.stream().filter(i -> i%2!=0).map(i->i*2).sorted().forEach(x -> System.out.println(x));
     */
    void method(){

        List<Integer> list = Arrays.asList(5,2,1,7,3);

        // list.forEach( val -> System.out.println(val));
        // Put into stream
        Stream<Integer> lStream = list.stream();
       
        // we can operate the stream only once , once iterated we cannot iterator over or perform operation over it again
        // System.out.println(lStream.count());
        // filter the odd values only
        Stream<Integer> filtered = lStream.filter(i -> i%2!=0);
        // double the filtered or Odd values
        Stream<Integer> doubled = filtered.map(i -> i*2);
        // sort the doubled values
        Stream<Integer> sortedData = doubled.sorted();
        // print the sorted data
        sortedData.forEach(x -> System.out.println(x));

        // above we did list.stream() .filter() .forEach

        // list.stream().filter(i -> i%2!=0).map(i->i*2).sorted().forEach(x -> System.out.println(x));
    }
}