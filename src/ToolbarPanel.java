import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolbarPanel extends JPanel {
    private JButton sayHello;
    private IntTextListener textListener;

    public ToolbarPanel(){
        //setBorder(BorderFactory.createEtchedBorder());
        setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.red, Color.red));

        setLayout(new FlowLayout(FlowLayout.CENTER));
        sayHello = new JButton("Hello");
        sayHello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textListener.submitText("Hello ...\n");
            }
        });

        add(sayHello);
    }

    public void setTextListener(IntTextListener textListener){
        this.textListener = textListener;
    }
}
