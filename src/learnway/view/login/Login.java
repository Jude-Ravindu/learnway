package learnway.view.login;

import com.formdev.flatlaf.FlatClientProperties;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import com.lms.asserts.db.DbConnection;
import java.sql.SQLException;
import learnway.view.admin.dashboard.AdminDashboard;
import raven.toast.Notifications;

public class Login extends JPanel {

    private final JFrame parentFrame;

    public Login(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        init();
    }

    private void init() {
        setLayout(new MigLayout("fill,insets 20", "[center]", "[center]"));
        txtUsername = new JTextField();
        txtPassword = new JPasswordField();
        cmdLogin = new JButton("Login");
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

        add(panel);
        cmdLogin.addActionListener((ActionEvent e) -> {
            loginAction();
        });
    }

    private void loginAction() {

        String email = this.txtUsername.getText();
        String password = String.valueOf(this.txtPassword.getPassword());
        if (email.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Please enter your email !!!", "Warning", 2);
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_RIGHT, "Please enter your email !!!");

        } else if (!email.matches("^(?=.{1,64}@)[A-Za-z0-9\\+_-]+(\\.[A-Za-z0-9\\+_-]+)*@[^-][A-Za-z0-9\\+-]+(\\.[A-Za-z0-9\\+-]+)*(\\.[A-Za-z]{2,})$")) {
//            JOptionPane.showMessageDialog(this, "Invalid email !!!", "Warning", 2);
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_RIGHT, "Invalid email !!!");
        } else if (password.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Please enter your password !!!", "Warning", 2);
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_RIGHT, "Please enter your password !!!");
        } else {
            try {
                DbConnection dbConnection = DbConnection.getInstance();
                String query = "SELECT * FROM `admin`  WHERE `email`=? AND `password`=?";
                ResultSet resultSet = dbConnection.executeQuery(query, new Object[]{email, password});
                if (resultSet.next()) {
                    AdminDashboard dashboard = new AdminDashboard();
                    dashboard.setVisible(true);
                    parentFrame.dispose();
                } else {
//                    JOptionPane.showMessageDialog(this, "Invalid Details !!!", "Error", 0);
                    Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_RIGHT, "Invalid Details !!!");
                }
            } catch (ClassNotFoundException | SQLException var8) {
            }
        }
    }

    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton cmdLogin;
}
