import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame;
        JTextField firstNameField, lastNameField;
        JLabel firstNameLabel , lastNameLabel;
        JButton submitButton;

        Container container;

        frame = new JFrame();

        firstNameLabel = new JLabel("First Name: ");
        lastNameLabel = new JLabel("Last Name: ");
        firstNameField = new JTextField(20);
        lastNameField = new JTextField(20);
        submitButton = new JButton("Save");

        container = frame.getContentPane();

        container.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.gridx = 0;
        constraints.gridy = 0;
        container.add(firstNameLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        container.add(firstNameField, constraints);


        frame.setVisible(true);
        frame.pack();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        System.out.println("Hello world");
    }
}
