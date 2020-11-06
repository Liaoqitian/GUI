import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login_GUI {
    private JPanel panel;
    private JFrame frame;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton button;
    private JLabel responseText;

    public login_GUI() {
        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener (new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                responseText.setText("");
                String userName = userText.getText();
                String password = passwordText.getText();
                if (userName.equals("Liaoqt") && password.equals("123456")) {
                    responseText.setText("Login Successful!");
                } else responseText.setText("Username or password incorrect!");
            }
        });
        panel.add(button);

        responseText = new JLabel("");
        responseText.setBounds(10, 110, 300, 25);
        panel.add(responseText);
        frame.setVisible(true);

    }
    // beginner's book
    public static void main (String args[]) {
        new login_GUI();
    }
}
