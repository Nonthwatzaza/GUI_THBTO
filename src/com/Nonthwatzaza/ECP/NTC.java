package com.Nonthwatzaza.ECP;


/*


1 THB = 39.11 KRW
1 THB = 0.033 USD
1 THB = 0.0000039 BTC




 */
import  java.awt.*;
import  javax.swing.*;
import java.awt.event.*;
public class NTC extends JFrame  {
    //object zone
    private double THBC;
    private JTextField THB;
    private JTextField OUTT;
    private JButton KRW;
    private JButton USD;
    private JButton BTC;
    public NTC() {
        super("THB Covert by Nonthwat zaza");
        setBounds(0,0,550,240);
        JPanel panel = new JPanel(); // panel

        JLabel THBLabel = new JLabel();
        THBLabel.setFont(new Font("Courier",Font.BOLD,12));
        THBLabel.setText("THB");
        THB = new JTextField(10);
        panel.add(THBLabel);
        panel.add(THB);


        JLabel OUTTLabel = new JLabel();
        OUTTLabel.setFont(new Font("Courier",Font.BOLD,12));
        OUTTLabel.setText("=");
        OUTT = new JTextField(30);
        panel.add(OUTTLabel);
        panel.add(OUTT);
        OUTT.setEditable(false);




        add(panel,BorderLayout.CENTER);


        JPanel buttonPanel = new JPanel();
        KRW = new JButton(" KRW");
         USD = new JButton(" USD");
        BTC = new JButton(" BTC");
        buttonPanel.add(KRW);
        buttonPanel.add(USD);
        buttonPanel.add(BTC);
        add(buttonPanel, BorderLayout.SOUTH);


        KRW.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double TH =  Double.valueOf(THB.getText()); // get from Input
                double KRWF;
            KRWF=TH*39.11;
                OUTT.setText(KRWF+"");
        }
        });

        USD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double TH =  Double.valueOf(THB.getText()); // get from Input
                double USDF;
                USDF=TH*0.033;
                OUTT.setText(USDF+"");
            }
        });
        BTC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double TH =  Double.valueOf(THB.getText()); // get from Input
                double BTCF;
                BTCF=TH*0.0000039;
                OUTT.setText(BTCF+"");
            }
        });
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {

        com.Nonthwatzaza.ECP.NTC frame = new NTC();

    }
}
