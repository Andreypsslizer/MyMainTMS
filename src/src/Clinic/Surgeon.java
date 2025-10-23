package Clinic;

public class Surgeon extends Doctor{
    @Override
    public void treat() {
        System.out.println("I'm removing the appendix");
    }
}
