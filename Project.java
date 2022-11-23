import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.plaf.LabelUI;

public class Project{
    public static void main(String[] args) {
    

        JPanel panel = new JPanel();
        
        JFrame frame = new JFrame("Hello's");

        ImageIcon image = new ImageIcon("Icon.png");
        frame.setIconImage(image.getImage());
        

        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.add(panel);
       

        panel.setLayout(null);
        
        //Usertext
        JLabel userlabel = new JLabel("Username");
        userlabel.setBounds(10, 20, 80, 25);
        panel.add(userlabel);
        JTextField  userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

          //Password Field
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);
        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);
       
    
        //login Section
        JButton button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        panel.add(button);

         


        JLabel sucess = new JLabel("");
        sucess.setBounds(10, 110, 300, 25);
        panel.add(sucess);

        //Register Section
        JButton button2 = new JButton("Register");
        button2.setBounds(100, 80, 100, 25);
        panel.add(button2);

        
       

    }
  }