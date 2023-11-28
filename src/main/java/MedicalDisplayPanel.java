import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class MedicalDisplayPanel extends JPanel {
    private Patient patient1;

    public MedicalDisplayPanel(Patient patient1) {


        this.patient1 = patient1;


        JPanel MedDisplay = new JPanel();
        // MedDisplay.setBorder(BorderFactory.createLineBorder(Color.black));

        MedDisplay.setLayout(new GridLayout(1,4,10,10));
        add(MedDisplay, BorderLayout.NORTH);

        JLabel label = new JLabel();
        URL imageURL=null;
        try {
            imageURL = new URL(patient1.getPatURL());
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon = new ImageIcon(imageURL);
        label.setIcon(thisImageIcon);
        add(label);

        JLabel patNameAgeField = new JLabel("<html> Name: " + patient1.getPatName() + "<br/>" + "Age: " + patient1.getPatAge() + "</html>");
        add(patNameAgeField);


        JLabel brainIMG = new JLabel();
        URL imageURL1 = null;
        try {
            imageURL1 = new URL(patient1.getPatMRI().getPatImgURL());
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        ImageIcon thisImageIcon1 = new ImageIcon(imageURL1);
        brainIMG.setIcon(thisImageIcon1);
        add(brainIMG);

        JLabel patBP = new JLabel("<html> Blood Pressure: <br/> " + String.valueOf(patient1.getPatBP().getSPressure()) +
                " over " + String.valueOf(patient1.getPatBP().getDPressure()) + "</html>");
        add(patBP);
    }
}
