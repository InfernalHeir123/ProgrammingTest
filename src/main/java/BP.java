import java.time.LocalDate;

public class BP extends MedSys{
    // Class for Blood pressure evaluation

    private int SPressure;
    private int DPressure;
    private String VST;
    private LocalDate dateExam;

    public BP(int SPressure, int DPressure, String VST, LocalDate dateExam){
        super(dateExam);
        this.SPressure = SPressure;
        this.DPressure = DPressure;
        this.VST = VST;
        this.dateExam = dateExam;
    }

    public int getSPressure(){
        return SPressure;
    }

    public int getDPressure(){
        return DPressure;
    }

    public String getVST(){
        return VST;
    }

    public LocalDate getDateExam(){
        return dateExam;
    }
}
