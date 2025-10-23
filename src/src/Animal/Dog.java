package Animal;

public class Dog extends Animal{
    @Override
    public void voice() {
        System.out.println("aff aff");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("bones")) {
            System.out.println("I like to eat bones");
        } else {
            System.out.println(":(");
        }
    }
}
