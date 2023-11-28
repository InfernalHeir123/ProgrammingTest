import java.time.LocalDate;
import java.util.Date;

public class MedSys {
    private String sysName;
    private LocalDate dateExam;
    private String result;

    public MedSys(LocalDate dateExam){
        this.dateExam = dateExam;
    }
}
