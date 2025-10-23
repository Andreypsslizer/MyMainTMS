package Animal;

public class Rabbit extends Animal{
    @Override
    public void voice() {
        System.out.println("tiu tiu");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("grass")) {
            System.out.println("I like to eat grass");
        } else {
            System.out.println(":(");
        }
    }
}
