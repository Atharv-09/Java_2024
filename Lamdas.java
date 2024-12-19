interface Printable {
    void print();
}

class Cat implements Printable {
    public void print(){
        System.out.println("MEOW");
    }
}
class Dog implements Printable {
    public void print(){
        System.out.println("BhoBhoww");
    }
}


public class Lamdas {
    public static void main(String[] args) {
        
        Cat cat = new Cat();
        // cat.print();
        Dog dog = new Dog();
        printVoice(dog);
        // here as we passing the class obj then on that object particular method is called
        // But instead Lambda allows us to give body (print body) to that printable parameter.

        // Instead of impleemting the intierface in cat class and giving body to that print method and then calling method on that object

        printVoice(() -> System.out.println("MEOW")); // meow
        
        // OR // USE

        Printable printObj = () -> System.out.println("Goat");
        printVoice(printObj);

        // OR
        Printable pr = () -> System.out.println("Hell");
        pr.print();
    }

    static void printVoice(Printable voice){
        voice.print();
    }
}
