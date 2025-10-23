package Clinic;

public class Patient {
    private final int treatmentPlan;
    private Doctor doctor;

    public Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public void assignTreatment() {
        Therapist plan = new Therapist();
        doctor = plan.appointDoc(treatmentPlan);
        doctor.treat();
    }
}
