import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Unit_Converter extends JFrame implements ActionListener {
        JLabel cml,feetl,inchl,meterl,titlel;
        JTextField cmt,feett,incht,metert;
        JButton b1,b2,b3,b4,clearbtn,exitbtn;
        GridBagConstraints gbc= new GridBagConstraints();

        Unit_Converter(String title)
        {
            super(title);
            setLayout(new GridBagLayout());

//            setFont(new Font("Arial", Font.BOLD,12));

            //Labels
            titlel = new JLabel(" UNIT CONVERTER ");
            titlel.setFont((new Font("Arial", Font.BOLD,25)));


            cml = new JLabel("Centimeter (cm) : ");
            feetl = new JLabel("Feet (ft) : ");
            inchl = new JLabel("Inch (in) : ");
            meterl = new JLabel("Meter (m) : ");

            JLabel[] labels = { cml, feetl, inchl, meterl };
            for (JLabel label : labels) {
                label.setFont(new Font("SansSerif", Font.BOLD, 16));
            }


            //TextFields
            cmt = new JTextField(10);
            feett = new JTextField(10);
            incht = new JTextField(10);
            metert = new JTextField(10);

            //Button
            b1 = new JButton("Convert");
            b2 = new JButton("Convert");
            b3 = new JButton("Convert");
            b4 = new JButton("Convert");
            clearbtn = new JButton("Clear");
            exitbtn = new JButton("Exit");

            GBadd(titlel,1,1,1,3);
            GBadd(cml,1,3,1,1);
            GBadd(cmt,2,3,1,1);
            GBadd(b1,3,3,1,1);
            GBadd(feetl,1,5,1,1);
            GBadd(feett,2,5,1,1);
            GBadd(b2,3,5,1,1);
            GBadd(inchl, 1,7,1,1);
            GBadd(incht,2,7,1,1);
            GBadd(b3,3,7,1,1);
            GBadd(meterl,1,9,1,1);
            GBadd(metert,2,9,1,1);
            GBadd(b4,3,9,1,1);
            GBadd(clearbtn,1,11,1,2);
            GBadd(exitbtn,2,11,1,2);

            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            clearbtn.addActionListener(this);
            exitbtn.addActionListener(this);

        }

        public void GBadd(Component c ,int x, int y, int h,int w ){
            gbc.gridx = x;
            gbc.gridy = y;
            gbc.gridheight = h;
            gbc.gridwidth = w;
            gbc.ipady = 10;
            gbc.ipadx = 10;
            gbc.insets = new Insets(8, 12, 8, 12);

            add(c,gbc);
        }

        public void actionPerformed(ActionEvent e){

            if (e.getSource()==b1){

                Double intcm = Double.parseDouble(cmt.getText());
                Double intfeet = intcm / 30.48f;
                Double intinch = intcm / 2.54f;
                Double intmeter = intcm / 100f;

                incht.setText(String.format("%.2f", intinch));
                feett.setText(String.format("%.2f", intfeet));
                metert.setText(String.format("%.2f", intmeter));

            } else if(e.getSource()==b2){

                double feet = Double.parseDouble(feett.getText());

                double cm = feet * 30.48;
                double inch = feet * 12;
                double meter = feet * 0.3048;

                cmt.setText(String.format("%.2f", cm));
                incht.setText(String.format("%.2f", inch));
                metert.setText(String.format("%.2f", meter));

            } else if (e.getSource()==b3) {
                double inch = Double.parseDouble(incht.getText());

                double cm = inch * 2.54;
                double feet = inch / 12.0;
                double meter = inch * 0.0254;

                cmt.setText(String.format("%.2f", cm));
                feett.setText(String.format("%.2f", feet));
                metert.setText(String.format("%.2f", meter));

            }
            else if(e.getSource()==b4) {
                double meter = Double.parseDouble(metert.getText());

                double cm = meter * 100;
                double feet = meter / 0.3048;
                double inch = meter * 39.3701;

                cmt.setText(String.format("%.2f", cm));
                feett.setText(String.format("%.2f", feet));
                incht.setText(String.format("%.2f", inch));

            }
            else if (e.getSource()==clearbtn){

                cmt.setText(" ");
                incht.setText("");
                feett.setText("");
                metert.setText("");
            }
            else if (e.getSource()==exitbtn) {
                System.exit(0);

            }

        }

    public static void main(String[] args) {
        Unit_Converter uc = new Unit_Converter("Unit Converter");
        uc.setVisible(true);
        uc.setSize(500,500);
        uc.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
