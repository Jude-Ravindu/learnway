package learnway.view.login;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.event.ActionEvent;
import javax.swing.*;
import learnway.util.GlobalVar;
import learnway.view.Main;
import net.miginfocom.swing.MigLayout;

public class Login extends JPanel {

    private final JFrame parentFrame;
    private JComboBox<String> userTypeComboBox;

    public Login(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        init();
    }

    private void init() {
        setLayout(new MigLayout("fill,insets 20", "[center]", "[center]"));
        txtUsername = new JTextField();
        txtPassword = new JPasswordField();
        cmdLogin = new JButton("Login");

        // Initialize the JComboBox with user types
        userTypeComboBox = new JComboBox<>(new String[]{"Owner", "Admin", "Academic","Instructor"});
        userTypeComboBox.setSelectedIndex(0); // Select the first user type by default
        
        JPanel panel = new JPanel(new MigLayout("wrap,fillx,insets 35 45 30 45", "fill,350:380"));
        panel.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:20;"
                + "[light]background:darken(@background,3%);"
                + "[dark]background:lighten(@background,3%)");

        txtPassword.putClientProperty(FlatClientProperties.STYLE, ""
                + "showRevealButton:true");
        cmdLogin.putClientProperty(FlatClientProperties.STYLE, ""
                + "[light]background:darken(@background,10%);"
                + "[dark]background:lighten(@background,10%);"
                + "borderWidth:0;"
                + "focusWidth:0;"
                + "innerFocusWidth:0");

        txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your username or email");
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your password");

        JLabel lbTitle = new JLabel("Welcome back!");
        JLabel description = new JLabel("Please sign in to access your account");
        lbTitle.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:bold +20");
        description.putClientProperty(FlatClientProperties.STYLE, ""
                + "[light]foreground:lighten(@foreground,30%);"
                + "[dark]foreground:darken(@foreground,30%)");

        panel.add(lbTitle);
        panel.add(description);
        panel.add(new JLabel("Email"), "gapy 8");
        panel.add(txtUsername);
        panel.add(new JLabel("Password"), "gapy 8");
        panel.add(txtPassword);
        panel.add(cmdLogin, "gapy 10");


        // Add the JComboBox to the panel
        panel.add(new JLabel("User Type"), "gapy 8");
        panel.add(userTypeComboBox);
        
        

        add(panel);
        cmdLogin.addActionListener((ActionEvent e) -> {
            loginAction();
        });
    }

    private void loginAction() {
        // Get the selected user type
       
        GlobalVar.userType = (String) userTypeComboBox.getSelectedItem();
        GlobalVar.userEmail = "abc@gmail.com";
        Main dashboard = new Main(parentFrame);
        dashboard.setVisible(true);
        parentFrame.dispose();

//        String username = this.txtUsername.getText();
//        String password = String.valueOf(this.txtPassword.getPassword());
//        if (username.isEmpty()) {
//            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_RIGHT, "Please enter your Username !!!");
//        } else if (password.isEmpty()) {
//            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_RIGHT, "Please enter your Password !!!");
//        } else {
//            try {
//                DbConnection dbConnection = DbConnection.getInstance();
//                String query = "SELECT * FROM user "
//                        + "INNER JOIN user_type ON user.user_type_id = user_type.user_type_id "
//                        + "INNER JOIN status ON user.status_st_id = status.st_id "
//                        + "WHERE nic=? AND password=? AND status_name= 'Active'";
//                ResultSet resultSet = dbConnection.executeQuery(query, new Object[]{username, password});
//                
//                if (resultSet.next()) {
//                    GlobalVar.userEmail= resultSet.getString(useremail);
//                    GlobalVar.userType= resultSet.getString(userType);
//                    String userType = resultSet.getString("user_type_name");
//                    Main dashboard = new Main(userType);
//                    dashboard.setVisible(true);
//                    parentFrame.dispose();
//                } else {
//                    Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_RIGHT, "Invalid Details !!!");
//                }
//             } catch (ClassNotFoundException | SQLException e) {
//                e.printStackTrace();
//            }
//        }
    }

    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton cmdLogin;
}
