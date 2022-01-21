import java.io.Serializable;
public class Contact implements Serializable {
    private String name;
    private int month;
    private int day;

    public Contact(String name, int month, int day) {
        this.name = name;
        this.month = month;
        this.day = day;
    }

    public String toString(){
        return name + "\tMonth: " + month + "\tDay: " + day;
    }
}
