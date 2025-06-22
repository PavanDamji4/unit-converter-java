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
            titlel = new JLabel("*** UNIT CONVERTER ***");
            cml = new JLabel("Centimeter (cm) : ");
            feetl = new JLabel("Feet (ft) : ");
            inchl = new JLabel("Inch (in) : ");
            meterl = new JLabel("Meter (m) : ");

            //TextFields
            cmt = new JTextField(10);
            feett = new JTextField(10);
            incht = new JTextField(10);
            metert = new JTextField(10);

            //Button
            convertbutton = new JButton("Convert");

            GBadd(titlel,1,1,1,1);
            GBadd(cml,1,3,1,1);
            GBadd(cmt,2,3,1,1);
            GBadd(feetl,1,5,1,1);
            GBadd(feett,2,5,1,1);
            GBadd(inchl, 1,7,1,1);
            GBadd(incht,2,7,1,1);
            GBadd(meterl,1,9,1,1);
            GBadd(metert,2,9,1,1);

        }

        public void GBadd(Component c ,int x, int y, int h,int w ){
            gbc.gridx = x;
            gbc.gridy = y;
            gbc.gridheight = h;
            gbc.gridwidth = w;

            add(c,gbc);
        }

    public static void main(String[] args) {
        Unit_Converter uc = new Unit_Converter("Unit Converter");
        uc.setVisible(true);
        uc.setSize(500,500);
    }
}
