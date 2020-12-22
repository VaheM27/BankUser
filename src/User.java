import java.util.Objects;

public class User {

    private String name;
    private String sName;
    private String idNumber;


    public User(String name, String sName, String idNumber) {
        this.name = name;
        this.sName = sName;
        this.idNumber = idNumber;

    }

    public User() {

    }

    public void setName(String name ) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }


    @Override
    public String toString() {
        return "User{" +
                "name: '" + name + '\'' +
                ", sName: '" + sName + '\'' +
                ", passportNumber: '" + idNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getName().equals(user.getName()) &&
                getsName().equals(user.getsName()) &&
                getIdNumber().equals(user.getIdNumber());

    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getsName(), getIdNumber());
    }
}