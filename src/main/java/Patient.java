public class Patient {
    private String patName;
    private String patURL;
    private int patAge;
    private MRI patMRI;
    private BP patBP;

    // Constructing Patient
    public Patient(String patName, String patURL, int patAge, MRI patMRI, BP patBP){
        this.patName = patName;
        this.patURL = patURL;
        this.patAge = patAge;
        this.patMRI = patMRI;
        this.patBP = patBP;
    }

    public String getPatName(){
        return patName;
    }

    public int getPatAge(){
        return patAge;
    }

    public String getPatURL(){
        return patURL;
    }

    public MRI getPatMRI(){
        return patMRI;
    }

    public BP getPatBP(){
        return patBP;
    }
}
