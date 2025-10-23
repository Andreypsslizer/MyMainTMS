package Animal;

public class Tiger extends Animal{
    @Override
    public void voice() {
        System.out.println("arrr");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("steak")) {
            System.out.println("I like to eat steak");
        } else {
            System.out.println(":(");
        }
    }
}
