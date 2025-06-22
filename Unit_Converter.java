import javax.swing.*;
import java.awt.*;

public class Unit_Converter extends JFrame {
        JLabel cml,feetl,inchl,meterl,titlel;
        JTextField cmt,feett,incht,metert;
        JButton convertbutton;
        GridBagConstraints gbc= new GridBagConstraints();

        Unit_Converter(String title)
        {
            super(title);
            setLayout(new GridBagLayout());

            //Labels
            titlel = new JLabel("*** UNIT CONVERTER ***")
            cml = new JLabel("Centimeter (cm) : ");
            feetl = new JLabel("Feet (ft) : ");
            inchl = new JLabel("Inch (in) : ");
            meterl = new JLabel("Meter (m) : ");

            //TextFields
            cmt = new JTextField(20);
            feett = new JTextField(20);
            incht = new JTextField(20);
            metert = new JTextField(20);

            //Button
            convertbutton = new JButton("Convert");

            GBadd(titlel,1,1,0,0);
            GBadd(cml,1,3,0,0);
            GBadd(cmt,2,3,0,0);
            GBadd(feetl,1,5,0,0);

        }

        public void GBadd(Component c ,int x, int y, int h,int w ){
            gbc.gridx = x;
            gbc.gridy = y;
            gbc.gridheight = h;
            gbc.gridwidth = w;

            add(c,gbc);
        }

}
