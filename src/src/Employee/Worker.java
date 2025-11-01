package Employee;

public class Worker implements Employee{
    @Override
    public void sayJobTitle() {
        System.out.println("I'm " + this.getClass().getSimpleName());
    }
}
