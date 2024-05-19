package learnway.applicaton;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import learnway.view.admin.login.FormsManager;
import learnway.view.admin.login.Login;
import raven.toast.Notifications;

import javax.swing.*;
import java.awt.*;

public class AppInitializer extends JFrame {

    public AppInitializer() {
        init();
    }

    private void init() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(1200, 700));
        setLocationRelativeTo(null);
        setContentPane(new Login(this));
        Notifications.getInstance().setJFrame(this);
        FormsManager.getInstance().initApplication(this);
    }

    public static void main(String[] args) {
        FlatRobotoFont.install();
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatLaf.registerCustomDefaultsSource("learnway.themes");
        FlatMacLightLaf.setup();
        EventQueue.invokeLater(() -> new AppInitializer().setVisible(true));
    }
}