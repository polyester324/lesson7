package homework.task1;

public class Main {
    public static void main(String[] args) {
        Patient patient_1 = new Patient(1);
        Patient patient_2 = new Patient(2);
        Patient patient_3 = new Patient(3);
        Therapist therapist = new Therapist();
        therapist.appointDoctor(patient_1);
        therapist.appointDoctor(patient_2);
        therapist.appointDoctor(patient_3);
    }
}
