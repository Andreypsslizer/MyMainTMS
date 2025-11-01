package Employee;

public class Director implements Employee{
    @Override
    public void sayJobTitle() {
        System.out.println("I'm " + this.getClass().getSimpleName());
    }
}
