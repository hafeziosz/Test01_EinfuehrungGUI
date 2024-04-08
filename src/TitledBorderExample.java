import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class TitledBorderExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TitledBorder Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Erstelle ein TitledBorder
        TitledBorder titledBorder = BorderFactory.createTitledBorder("My Titled Border");

        // Erstelle einen LineBorder und setze seine Farbe
        LineBorder lineBorder = new LineBorder(Color.RED);

        // Kombiniere den TitledBorder mit dem LineBorder
        CompoundBorder compoundBorder = BorderFactory.createCompoundBorder(lineBorder, titledBorder);

        // Setze den kombinierten Border für das Panel
        panel.setBorder(compoundBorder);

        JLabel label = new JLabel("TitledBorder Example");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label, BorderLayout.CENTER);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}