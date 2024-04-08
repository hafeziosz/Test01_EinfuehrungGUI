import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class NaviPanel extends JPanel {
    public NaviPanel(){
       Dimension dim = getPreferredSize();
       dim.width = 150;
       setPreferredSize(dim);

        TitledBorder innerborder = BorderFactory.createTitledBorder("Add Users");
        Border outerBorder = BorderFactory.createEmptyBorder(10,10,10,10);

        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerborder));


    }
}
