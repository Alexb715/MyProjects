import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formtest {
    private JPanel simpleCalculator;
    private JPanel topPanel;
    private JLabel numlabel;
    private JTextField numField;
    private JLabel numLabel2;
    private JTextField numfield2;
    private JTextField resultField;
    private JLabel resultLabel;
    private JPanel bottomPanel;
    private JButton ADDButton;
    private JButton SUBTRACTButton;
    private JButton CLEARButton;

    public Formtest() {
        ADDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double result = Double.parseDouble(numField.getText()) + Double.parseDouble(numfield2.getText());
                resultField.setText(result + "");
            }
        });
        SUBTRACTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double result = Double.parseDouble(numField.getText()) - Double.parseDouble(numfield2.getText());
                resultField.setText(result + "");

            }

        });
        CLEARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numField.setText("");
                numfield2.setText("");
                resultField.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formtest");
        frame.setContentPane(new Formtest().simpleCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
