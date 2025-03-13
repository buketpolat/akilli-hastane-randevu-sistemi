import java.util.ArrayList;
import java.util.List;

public class Doktor extends Person {
    private int doctorId;
    private String specialization;
    private List<String> availableSlots;

    public Doktor(String name, String surname, int idNumber, String email, String phoneNumber, int doctorId, String specialization, List<String> availableSlots) {
        super(name, surname, idNumber, email, phoneNumber);
        this.doctorId = doctorId;
        this.specialization = specialization;
        // Arrays.asList() yerine ArrayList oluşturuyoruz
        this.availableSlots = new ArrayList<>(availableSlots);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Doktor ID: " + doctorId + ", Uzmanlık: " + specialization + ", Müsait Zamanlar: " + availableSlots;
    }

    public void scheduleAppointment(Hasta hasta, String slot) {
        if (availableSlots.contains(slot)) {
            availableSlots.remove(slot);
            System.out.println(hasta.getName() + " için " + slot + " tarihinde randevu oluşturuldu.");
        } else {
            System.out.println("Bu zaman dilimi müsait değil.");
        }
    }
}