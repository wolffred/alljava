public class Main{
    public static void main (String [] args){
        Animal [] animal = {
                new Cow(),
                new Dog(),
                new Bird()
        };

        for (int i = 0; i < animal.length; i++){
            animal[i].speak();
        }

    }
}