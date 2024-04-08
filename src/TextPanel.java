import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {
    private JTextArea textArea;
    public TextPanel(){
        super();
        setLayout(new BorderLayout());
        textArea = new JTextArea();
        add(textArea, BorderLayout.CENTER);
    }

    public void append(String text){
        textArea.append(text);
    }
}
