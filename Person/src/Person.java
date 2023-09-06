import java.util.Calendar;

public class Person {

    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    int YOB;

    public Person(String ID, String firstName, String lastName, String title, int YOB) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public String formalName() {
        return title + " " + firstName + " " + lastName;
    }

    public String getAge() {
        Calendar currentDate = Calendar.getInstance();
        int currentYear = currentDate.get(Calendar.YEAR);
        int age = currentYear - YOB;
        return String.valueOf(age);
    }

    public String getAge(int year) {
        int age = year - YOB;
        return String.valueOf(age);
    }

    public String toCSVDataRecord() {
        return ID + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
    }

    @Override
   public String toString() {
        return "Person{" +  "ID='" + ID + '\'' +
              ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
              ", title='" + title + '\'' +
              ", YOB=" + YOB +
              '}';
   }
}
