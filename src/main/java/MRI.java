import java.time.LocalDate;

public class MRI extends MedSys{
    // MRI Class for specific MRI tests;

    private String imgURL;
    private int magStrength;
    private LocalDate dateExam;

    public MRI(String imgURL, int magStrength, LocalDate dateExam){
        super(dateExam);
        this.imgURL = imgURL;
        this.magStrength = magStrength;
        this.dateExam = dateExam;
    }

    public String getPatImgURL(){
        return imgURL;
    }

    public int getMagStrength(){
        return magStrength;
    }

    public LocalDate getDateExam(){
        return dateExam;
    }
}
