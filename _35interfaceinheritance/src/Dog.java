public class Dog implements Animal{

    @Override
    public void speak() {
        System.out.println("Bark");
    }

    @Override
    public void eat() {
        System.out.println("eat meat");
    }
}
