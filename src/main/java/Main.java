import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame;
        JTextField firstNameField, lastNameField;
        JLabel firstNameLabel , lastNameLabel;
        JButton submitButton, sampleButton;

        Container container;

        frame = new JFrame();

        firstNameLabel = new JLabel("First Name: ");
        lastNameLabel = new JLabel("Last Name: ");
        firstNameField = new JTextField(20);
        lastNameField = new JTextField(20);
        submitButton = new JButton("Save");

        submitButton.setFont(new Font("Arial",Font.PLAIN,5));

        sampleButton = new JButton("Sample");

        container = frame.getContentPane();

        container.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.gridx = 0;
        constraints.gridy = 0;

        container.add(firstNameLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        container.add(firstNameField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        container.add(lastNameLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        container.add(lastNameField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 0;
        container.add(firstNameLabel, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.LINE_START;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        container.add(submitButton, constraints);

        constraints.gridx = 3;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 3;
        constraints.fill = GridBagConstraints.BOTH;

        container.add(sampleButton, constraints);

        frame.setVisible(true);
        frame.pack();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        System.out.println("Hello world");
    }
}
