package learnway.components;

import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.JPanel;
/**
 *
 * @author chath
 */
public class SimpleForm extends JPanel {

    public SimpleForm() {
        init();
    }

    private void init() {
        
        putClientProperty(FlatClientProperties.STYLE, ""
                + "border:5,5,5,5;"
                + "background:null");
    }

    public void formInitAndOpen() {

    }

    public void formOpen() {

    }

    public void formRefresh() {

    }

    public boolean formClose() {
        return true;
    }
}

