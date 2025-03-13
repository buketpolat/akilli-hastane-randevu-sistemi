public class Person {
    private String name;
    private String surname;
    private int idNumber;
    private String email;
    private String phoneNumber;

    public Person(String name, String surname, int idNumber, String email, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getter ve setter metotları
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getInfo() {
        return "Ad: " + name + ", Soyad: " + surname + ", ID: " + idNumber + ", E-posta: " + email + ", Telefon: " + phoneNumber;
    }
}