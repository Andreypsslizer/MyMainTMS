package Employee;

public class Accountant implements Employee {
    @Override
    public void sayJobTitle() {
        System.out.println("I'm " + this.getClass().getSimpleName());
    }
}
