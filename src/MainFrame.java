import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{

    private JButton btnSayHello;
    private TextPanel textPanel;
    private ToolbarPanel toolbarPanel;
    private NaviPanel naviPanel;

    public MainFrame(){
        super("SwingBeispielApp");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        textPanel = new TextPanel();
        toolbarPanel = new ToolbarPanel();
        naviPanel = new NaviPanel();

        toolbarPanel.setTextListener(new IntTextListener() {
            @Override
            public void submitText(String text) {
                textPanel.append(text);
            }
        });

        add(toolbarPanel, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
        add(naviPanel, BorderLayout.WEST);

        setVisible(true);
    }

}

