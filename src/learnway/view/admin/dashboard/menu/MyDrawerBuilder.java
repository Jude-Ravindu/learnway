package learnway.view.admin.dashboard.menu;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import learnway.components.CompoundIcon;
import raven.drawer.component.DrawerPanel;
import raven.drawer.component.SimpleDrawerBuilder;
import raven.drawer.component.footer.SimpleFooterData;
import raven.drawer.component.header.SimpleHeaderData;
import raven.drawer.component.header.SimpleHeaderStyle;
import raven.drawer.component.menu.MenuAction;
import raven.drawer.component.menu.SimpleMenuOption;
import raven.drawer.component.menu.SimpleMenuStyle;
import raven.drawer.component.menu.data.Item;
import raven.drawer.component.menu.data.MenuItem;
import learnway.view.admin.dashboard.forms.DashboardForm;
import learnway.view.admin.dashboard.forms.InboxForm;

/**
 *
 * @author Raven
 */
public class MyDrawerBuilder extends SimpleDrawerBuilder {

    private final ThemesChange themesChange;

    public MyDrawerBuilder() {
        themesChange = new ThemesChange();
    }

    @Override
    public Component getFooter() {
        return themesChange;
    }

@Override
public SimpleHeaderData getSimpleHeaderData() {
    // Load the icon
    ImageIcon icon = new ImageIcon(getClass().getResource("/learnway/resources/menu/learnWay.png"));
    // Define font and color for the title
    Font titleFont = new Font("Arial", Font.BOLD, 30);
    Color titleColor = Color.WHITE;
    // Create a compound icon with the icon and title
    Icon compoundIcon = new CompoundIcon(icon, "LearnWay", 5, titleFont, titleColor); // 5 is the gap between icon and title

    return new SimpleHeaderData()
            .setIcon(compoundIcon) // Set the compound icon
            .setHeaderStyle(new SimpleHeaderStyle() {
                @Override
                public void styleTitle(JLabel label) {
                    Font font = label.getFont();
                    label.setFont(font.deriveFont(font.BOLD, 30f));
                    label.setForeground(Color.WHITE);
                }
            });
}



    @Override
    public SimpleFooterData getSimpleFooterData() {
        return new SimpleFooterData();
    }

    @Override
    public SimpleMenuOption getSimpleMenuOption() {

        MenuItem items[] = new MenuItem[]{
            new Item.Label("MAIN"),
            new Item("Dashboard", "dashboard.svg"),

                new Item.Label("ADMIN"),
                new Item("Manage Admins", "admin.svg")
                        .subMenu("Admin Overview")
                        .subMenu("Admin Details")
                        .subMenu("Add New Admin"),

                new Item.Label("INSTRUCTOR"),
                new Item("Manage Instructor", "instructor.svg")
                        .subMenu("Instructor Overview")
                        .subMenu("Instructor Details")
                        .subMenu("Add New Instructor"),

                new Item.Label("STUDENT"),
                new Item("Manage Student", "student.svg")
                        .subMenu("Student Overview")
                        .subMenu("Student Details")
                        .subMenu("Add New Student"),

                new Item.Label("CLASS"),
                new Item("Manage Class", "class.svg")
                        .subMenu("Class Overview")
                        .subMenu("Class Details")
                        .subMenu("Add New Class"),

                new Item.Label("SUBJECT"),
                new Item("Manage Subject", "subject.svg")
                        .subMenu("Subject Overview")
                        .subMenu("Subject Details")
                        .subMenu("Add New Subject"),

//            new Item("Email", "email.svg")
//            .subMenu("Inbox")
//            .subMenu("Read")
//            .subMenu(
//            new Item("Group Read")
//            .subMenu("Read 1")
//            .subMenu("Read 2")
//            .subMenu(
//            new Item("Group Item")
//            .subMenu("Item 1")
//            .subMenu("Item 2")
//            .subMenu("Item 3")
//            .subMenu("Item 4")
//            .subMenu("Item 5")
//            .subMenu("Item 6")
//            )
//            .subMenu("Read 3")
//            .subMenu("Read 4")
//            .subMenu("Read 5")
//            )
//            .subMenu("Compost"),
//            new Item("Chat", "chat.svg"),
//            new Item("Calendar", "calendar.svg"),
//            new Item.Label("COMPONENT"),
//            new Item("Advanced UI", "ui.svg")
//            .subMenu("Cropper")
//            .subMenu("Owl Carousel")
//            .subMenu("Sweet Alert"),
//            new Item("Forms", "forms.svg")
//            .subMenu("Basic Elements")
//            .subMenu("Advanced Elements")
//            .subMenu("SEditors")
//            .subMenu("Wizard"),
//            new Item.Label("OTHER"),
//            new Item("Charts", "chart.svg")
//            .subMenu("Apex")
//            .subMenu("Flot")
//            .subMenu("Sparkline"),
//            new Item("Icons", "icon.svg")
//            .subMenu("Feather Icons")
//            .subMenu("Flag Icons")
//            .subMenu("Mdi Icons"),
//            new Item("Special Pages", "page.svg")
//            .subMenu("Blank page")
//            .subMenu("Faq")
//            .subMenu("Invoice")
//            .subMenu("Profile")
//            .subMenu("Pricing")
//            .subMenu("Timeline")
        };

        SimpleMenuOption simpleMenuOption = new SimpleMenuOption() {
            @Override
            public Icon buildMenuIcon(String path, float scale) {
                FlatSVGIcon icon = new FlatSVGIcon(path, scale);
                FlatSVGIcon.ColorFilter colorFilter = new FlatSVGIcon.ColorFilter();
                colorFilter.add(Color.decode("#969696"), Color.decode("#FAFAFA"), Color.decode("#969696"));
                icon.setColorFilter(colorFilter);
                return icon;
            }
        };

        simpleMenuOption.setMenuStyle(new SimpleMenuStyle() {
            @Override
            public void styleMenuItem(JButton menu, int[] index) {
                menu.putClientProperty(FlatClientProperties.STYLE, ""
                        + "[light]foreground:#FAFAFA;"
                        + "arc:10");
            }

            @Override
            public void styleMenu(JComponent component) {
                component.putClientProperty(FlatClientProperties.STYLE, ""
                        + "background:$Drawer.background");
            }

            @Override
            public void styleLabel(JLabel label) {
                label.putClientProperty(FlatClientProperties.STYLE, ""
                        + "[light]foreground:darken(#FAFAFA,15%);"
                        + "[dark]foreground:darken($Label.foreground,30%)");
            }
        });
        simpleMenuOption.addMenuEvent((MenuAction action, int[] index) -> {
            if (index.length == 1) {
                if (index[0] == 0) {
                    FormManager.showForm(new DashboardForm());
                }
            } else if (index.length == 2) {
                if (index[0] == 1) {
                    if (index[1] == 0) {
                        FormManager.showForm(new InboxForm());
                    } else if (index[1] == 1) {
//                        FormManager.showForm(new ViewAttendance());
                    }
                }
            }
        });

        simpleMenuOption.setMenus(items)
                .setBaseIconPath("learnway/resources/menu")
                .setIconScale(0.45f);
        return simpleMenuOption;
    }

    @Override
    public void build(DrawerPanel drawerPanel) {
        drawerPanel.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Drawer.background");
    }

    @Override
    public int getDrawerWidth() {
        return 270;
    }
}
