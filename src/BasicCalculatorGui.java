import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Double.parseDouble;
import static java.lang.Long.parseLong;

public class
BasicCalculatorGui extends JFrame implements ActionListener
{
    JTextField display;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bc, ba, bs, bm, bd, bt,b;

    BasicCalculatorGui()
    {
        display=new JTextField();
        display.setBounds(50,50,379,75);
        display.setBackground(Color.LIGHT_GRAY);
        display.setEditable(false);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font("Arial", Font.PLAIN, 60));


        b1=new JButton("1");
        b1.setBounds(50,135,80,80);
        b1.addActionListener(this);

        b2=new JButton("2");
        b2.setBounds(150,135,80,80);
        b2.addActionListener(this);

        b3=new JButton("3");
        b3.setBounds(250,135,80,80);
        b3.addActionListener(this);

        b4=new JButton("4");
        b4.setBounds(50,235,80,80);
        b4.addActionListener(this);

        b5=new JButton("5");
        b5.setBounds(150,235,80,80);
        b5.addActionListener(this);

        b6=new JButton("6");
        b6.setBounds(250,235,80,80);
        b6.addActionListener(this);

        b7=new JButton("7");
        b7.setBounds(50,335,80,80);
        b7.addActionListener(this);

        b8=new JButton("8");
        b8.setBounds(150,335,80,80);
        b8.addActionListener(this);

        b9=new JButton("9");
        b9.setBounds(250,335,80,80);
        b9.addActionListener(this);

        ba=new JButton("+");
        ba.setBounds(350,135,80,80);
        ba.addActionListener(this);

        bs=new JButton("-");
        bs.setBounds(350,235,80,80);
        bs.addActionListener(this);

        bm=new JButton("X");
        bm.setBounds(350,335,80,80);
        bm.addActionListener(this);

        bd=new JButton("/");
        bd.setBounds(350,435,80,80);
        bd.addActionListener(this);

        b0=new JButton("0");
        b0.setBounds(50,435,80,80);
        b0.addActionListener(this);

        bt=new JButton("=");
        bt.setBounds(50,520,380,50);
        bt.addActionListener(this);

        bc=new JButton("C");
        bc.setBounds(250,435,80,80);
        bc.addActionListener(this);

        b=new JButton(".");
        b.setBounds(150,435,80,80);
        b.addActionListener(this);


        add(b0);
        add(b7);
        add(b8);
        add(b9);
        add(b);
        add(b4);
        add(b5);
        add(b6);
        add(b1);
        add(b2);
        add(b3);

        add(ba);
        add(bs);
        add(bm);
        add(bd);

        add(bt);
        add(bc);


        add(display);
        setSize(500,650);
        setLayout(null);
        setVisible(true);
    }
    double a;
    String op="";
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
            String ex=display.getText();
            ex+=".";
            display.setText(ex);
        }
        if(e.getSource()==b1)
        {
            String ex=display.getText();
            ex+="1";
            display.setText(ex);
        }
        if(e.getSource()==b2)
        {
            String ex=display.getText();
            ex+="2";
            display.setText(ex);
        }
        if(e.getSource()==b3)
        {
            String ex=display.getText();
            ex+="3";
            display.setText(ex);
        }
        if(e.getSource()==b4)
        {
            String ex=display.getText();
            ex+="4";
            display.setText(ex);
        }
        if(e.getSource()==b5)
        {
            String ex=display.getText();
            ex+="5";
            display.setText(ex);
        }
        if(e.getSource()==b6)
        {
            String ex=display.getText();
            ex+="6";
            display.setText(ex);
        }
        if(e.getSource()==b7)
        {
            String ex=display.getText();
            ex+="7";
            display.setText(ex);
        }
        if(e.getSource()==b8)
        {
            String ex=display.getText();
            ex+="8";
            display.setText(ex);
        }
        if(e.getSource()==b9)
        {
            String ex=display.getText();
            ex+="9";
            display.setText(ex);
        }
        if(e.getSource()==b0)
        {
            String ex=display.getText();
            ex+="0";
            display.setText(ex);
        }
        if(e.getSource()==bc)
        {
            String ex=display.getText();
            int b=ex.length();
            if(b!=0)
            {
                String s=ex.substring(0,b-1);
                display.setText(s);
            }
        }
        if(e.getSource()==ba)
        {
            op="+";
            a= Double.parseDouble(display.getText());
            display.setText("");
        }

        if(e.getSource()==bs)
        {
            op="-";
            a= Double.parseDouble(display.getText());
            display.setText("");
        }

        if(e.getSource()==bm)
        {
            op="*";
            a= Double.parseDouble(display.getText());
            display.setText("");
        }

        if(e.getSource()==bd)
        {
            op="/";
            a= Double.parseDouble(display.getText());
            display.setText("");
        }

        if(e.getSource()==bt)
        {
            switch (op)
            {
                case "+" : // Rounds to 2 decimal places
                {
                    display.setText(String.valueOf(a+ Double.parseDouble(display.getText())));break;
                }
                case "-" :  {
                    display.setText(String.valueOf(a- Double.parseDouble(display.getText())));break;
                }
                case "*" : {
                    display.setText(String.valueOf(a* Double.parseDouble(display.getText())));break;
                }
                case "/" :  {
                    display.setText(String.valueOf(a/ Double.parseDouble(display.getText())));break;
                }
                default:
                   break;
            }
            a=0;
            op="";
        }
    }
    public static void main(String[] args)
    {
        new BasicCalculatorGui();
    }
}