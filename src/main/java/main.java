import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Hospital Software:");

        // Initializing the Patient Health Data. These would be ideally imported form a database or another front end
        // Data for Patient A
        MRI PatAMRI = new MRI("https://martinh.netfirms.com/BIOE60010/mri2.jpg",
                4, LocalDate.of(2023,11, 19));
        BP PatABP = new BP(150, 80, "VST", LocalDate.of(2023,11,20));

        Patient PatientA = new Patient("Sebastian Compton", "https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg",
                31, PatAMRI, PatABP);

        // Data for Patient B
        MRI PatBMRI = new MRI("https://martinh.netfirms.com/BIOE60010/mri1.jpg",
                2, LocalDate.of(2023,9, 14));
        BP PatBBP = new BP(130, 70, "ST", LocalDate.of(2023,9,15));

        Patient PatientB = new Patient("Daphne Von Oram", "https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg",
                62, PatBMRI, PatBBP);

        // Creating a Patient Group:
        List<Patient> PatientList = new ArrayList<Patient>(); // The Patient List represents a collection of Patients
        PatientList.add(PatientA);
        PatientList.add(PatientB);

        PatientGroup wardA = new PatientGroup(PatientList);

        wardA.AdminDisplay();  // displays the ward data for the Admin
        int size = PatientList.size();


        // Making the SWING UI Thread Safe
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Doctor Panel");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setLayout(new GridLayout(size,1));

            // Iterating through the patient group and displaying the data
            for (int i = 0; i < size; i++){
                MedicalDisplayPanel panel1 = new MedicalDisplayPanel(PatientList.get(i));
                frame.add(panel1);
            }

            frame.setSize(800, 500);
            frame.setVisible(true);
        });



    }

}
