import java.time.LocalDate;
import java.util.Date;

public class MedSys {
    // A MedSys class can accept more variables like results, and name which can then be displayed on the console or swing panel.
    // This is a parent class and properties can be inherited by other classes for easy of construction
    private String sysName;
    private LocalDate dateExam;
    private String result;

    public MedSys(LocalDate dateExam){
        this.dateExam = dateExam;
    }
}
