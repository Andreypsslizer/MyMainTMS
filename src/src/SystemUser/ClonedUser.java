package SystemUser;

public class ClonedUser implements Cloneable{
    private String name;
    private int age;
    private String email;

    public Object clone(SystemUser user, int n) throws CloneNotSupportedException {
        ClonedUser cloned = new ClonedUser();
        if (n == 1) {
            cloned.name = this.name;
            cloned.age = this.age;
            cloned.email = this.email;
            return super.clone();
        } else {
            cloned.name = this.name;
        }
        return cloned;
    }
}
