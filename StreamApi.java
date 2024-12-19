import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamApi {
    

    public static void main(String[] args) {
        

        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(1,4,2,6,7);
        
        // External Iteration Foreach
        for (Integer integer : list) {
            System.out.println(integer);
        }

        // Internal Iteration ForEach
        list.forEach(i -> System.out.println(i));
        

        List<String> names = new ArrayList<>();
        names = Arrays.asList("Yamuna","Ganga","Kaveri","Narmada");

        // Overrried Consumer INerface method
        Consumer<String> cs = new Consumer<>(){
            public void accept(String s){
                System.out.println(s);
            }
        };
        names.forEach(cs);

        // Easiest way for above (no need to addd this new keyword / overriding)
        Consumer<String> cs1 = (String s) -> System.out.println(s);
        names.forEach(cs1);

        // Instead of using above anonymouse class you can declare class and implement Consumer
        OverridingClass oc = new OverridingClass();
        names.forEach(oc);


        // Either
        List<Integer> rollNos = Arrays.asList(21,41,49,21,90);
        Consumer<Integer> rollNo = roll -> System.out.println("ROll no : " + roll);
        rollNos.forEach(rollNo);
         
        // OR 
        rollNos.forEach(i -> System.out.println(i));
    }
}


class OverridingClass implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.print(s+" ");
    }

}