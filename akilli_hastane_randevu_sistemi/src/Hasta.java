public class Hasta extends Person {
    private int patientId;
    private String medicalHistory;

    public Hasta(String name, String surname, int idNumber, String email, String phoneNumber, int patientId, String medicalHistory) {
        super(name, surname, idNumber, email, phoneNumber);
        this.patientId = patientId;
        this.medicalHistory = medicalHistory;
    }

    // Getter ve setter metotları
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Hasta ID: " + patientId + ", Tıbbi Geçmiş: " + medicalHistory;
    }
}