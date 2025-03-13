public class Admin extends Person {
    private int adminId;
    private String hospitalManagementPermissions;

    public Admin(String name, String surname, int idNumber, String email, String phoneNumber, int adminId, String hospitalManagementPermissions) {
        super(name, surname, idNumber, email, phoneNumber);
        this.adminId = adminId;
        this.hospitalManagementPermissions = hospitalManagementPermissions;
    }

    // Getter ve setter metotları
    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getHospitalManagementPermissions() {
        return hospitalManagementPermissions;
    }

    public void setHospitalManagementPermissions(String hospitalManagementPermissions) {
        this.hospitalManagementPermissions = hospitalManagementPermissions;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Admin ID: " + adminId + ", Yetkiler: " + hospitalManagementPermissions;
    }
}