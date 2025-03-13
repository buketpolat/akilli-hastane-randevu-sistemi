import java.util.List;

public abstract class AppointmentSystem {
    public abstract void addUser(Person person);
    public abstract void removeUser(Person person);
    public abstract Person getUserInfo(int idNumber);
    public abstract List<Person> getAllUsers();
}