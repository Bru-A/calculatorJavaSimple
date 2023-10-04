import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener
{
    JLabel l1;
    JTextField t1, t2;
    JButton b1,b2,b3,b4;

    Main()
    {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        l1 = new JLabel("5422 - Calculadora");
        l1.setBounds(60,10,300,30);
        add(l1);

        t1 = new JTextField(60);
        t2 = new JTextField(60);
        b1 = new JButton("+");
        b2 = new JButton("-");
        b3 = new JButton("x");
        b4 = new JButton("/");

        t1.setBounds(100,60,120,30); // aonde o t1 vai ficar
        t2.setBounds(100,100,120,30);
        b1.setBounds(250,60,80,30);
        b2.setBounds(250,100,80,30);
        b3.setBounds(350,60,80,30);
        b4.setBounds(350,100,80,30);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(t1);
        add(t2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == b1)
        {
            try
            {
                double num1 = Double.parseDouble((t1.getText()));
                double num2 = Double.parseDouble((t2.getText()));
                double resultado = num1 + num2;
                JOptionPane.showMessageDialog(this, "Resultado: "+resultado);
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(this, "Insira números válidos");
            }
        }
        else if (e.getSource() == b2)
        {
            try
            {
                double num1 = Double.parseDouble((t1.getText()));
                double num2 = Double.parseDouble((t2.getText()));
                double resultado = num1 - num2;
                JOptionPane.showMessageDialog(this, "Resultado: "+resultado);
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(this, "Insira números válidos");
            }
        }
        else if (e.getSource() == b3)
        {
            try
            {
                double num1 = Double.parseDouble((t1.getText()));
                double num2 = Double.parseDouble((t2.getText()));
                double resultado = num1 * num2;
                JOptionPane.showMessageDialog(this, "Resultado: "+resultado);
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(this, "Insira números válidos");
            }
        }
        else if (e.getSource() == b4)
        {
            try
            {
                double num1 = Double.parseDouble((t1.getText()));
                double num2 = Double.parseDouble((t2.getText()));
                double resultado = num1 /num2;
                JOptionPane.showMessageDialog(this, "Resultado: "+resultado);
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(this, "Insira números válidos");
            }
        }

    }
}

class classeCalc
{
    public static void main(String[] args)
    {
        Main c = new Main();
        c.setBounds(400,200,500,200);//dimensao da janela
        c.setVisible(true);
    }
}