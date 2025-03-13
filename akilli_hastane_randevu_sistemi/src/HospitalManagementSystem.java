import java.util.ArrayList;
import java.util.List;

public class HospitalManagementSystem extends AppointmentSystem {
    private List<Person> users;

    public HospitalManagementSystem() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(Person person) {
        users.add(person);
    }

    @Override
    public void removeUser(Person person) {
        users.remove(person);
    }

    @Override
    public Person getUserInfo(int idNumber) {
        for (Person person : users) {
            if (person.getIdNumber() == idNumber) {
                return person;
            }
        }
        return null;
    }

    @Override
    public List<Person> getAllUsers() {
        return users;
    }
}