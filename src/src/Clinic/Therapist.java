package Clinic;

public class Therapist extends Doctor{
    @Override
    public void treat() {
        System.out.println("Thinking about treatment plan");
    }

    public Doctor appointDoc(int code) {
        Doctor doctor;
        switch (code) {
            case 1 : doctor = new Surgeon();
                break;
            case 2 : doctor = new Dentist();
                break;
            default: doctor = new Therapist();
        }
        return doctor;
    }
}
