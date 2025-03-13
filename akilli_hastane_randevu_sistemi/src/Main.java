import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HospitalManagementSystem system = new HospitalManagementSystem();

        Hasta hasta = new Hasta("Ayşe", "Yılmaz", 12345, "ayse@example.com", "555123456", 1, "Alerji");
        Doktor doktor = new Doktor("Mehmet", "Demir", 67890, "mehmet@example.com", "555678901", 101, "Kardiyoloji", Arrays.asList("10:00", "11:00", "12:00"));
        Admin admin = new Admin("Ali", "Kaya", 13579, "ali@example.com", "555135790", 201, "Tüm yetkiler");

        system.addUser(hasta);
        system.addUser(doktor);
        system.addUser(admin);

        System.out.println(system.getUserInfo(12345).getInfo()); // Hasta bilgilerini yazdırır
        System.out.println(system.getAllUsers().get(1).getInfo()); // Doktor bilgilerini yazdırır

        doktor.scheduleAppointment(hasta, "10:00");
    }
}