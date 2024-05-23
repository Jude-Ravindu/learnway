package learnway.swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import learnway.util.GlobalVar;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author macintosh
 */
public class Menu extends JComponent {

    public MenuEvent getEvent() {
        return event;
    }

    public void setEvent(MenuEvent event) {
        this.event = event;
    }

    private MenuEvent event;
    private MigLayout layout;
    private String userType;
    private String[][] menuItems;

    public Menu() {
        userType = GlobalVar.userType;
        this.menuItems = getMenuItemsForUserType();
        init();
    }

    private String[][] getMenuItemsForUserType() {
        if ("Admin".equals(userType)) {
            return AdminmenuItems;
        } else if ("Owner".equals(userType)) {
            return OwnermenuItems;

        } else if ("Instructor".equals(userType)) {
            return InstructormenuItems;
        } else {
            return AcademicmenuItems;
        }
    }

    private String[][] OwnermenuItems = new String[][]{
        {"Dashboard"},
        {"Admin Management", "Admin Registration", "Admin Update"},
        {"Staff"},
        {"Class Shedule"},
        {"Quick Links"},
        {"Reports", "Monthly Income & Profit", "Monthly Instructors Salary", "Monthly Admin Salary", "Class payments", "Other 1", "Other 2", "Other 3", "Other 4", "Other 5"},    };

    private String[][] AdminmenuItems = new String[][]{
        {"Dashboard"},
        {"Instructor Management", "Add New Instructor", "Instructor Overview", "Update Instructor", "Instructor Details"},
        {"Academic Management", "Add New Academic", "Academic Overview", "Academic Update", "Academic Details"},
        {"Subject Management"},
        {"Class Management"},
        {"Class Schedule"},
        {"Exam Management"},
        {"Salary Management"},
        {"Quick Links"},
        {"Reports", "Monthly Instructors Salary", "Class payments", "Student Enrollment Report", "Instructor Feedback", "Student Payment Invoice", "Other 1", "Other 2"}
    };

    private String[][] InstructormenuItems = new String[][]{
        {"Dashboard"},
        {"Class Schedule"},
        {"Exam Management"},
        {"Quick Links"},
        {"Reports", "Other 1", "Other 2", "Other 3", "Other 4", "Other 5"},
    };

    private String[][] AcademicmenuItems = new String[][]{
        {"Dashboard"},
        {"Student Management", "Registration & Enrollment", "View Student","Student Update","Monthly Class Payment"},
        {"Quick Links"},
        {"Student Payment History"},
        {"Subject Management"},
        {"Class Management"},
        {"Class Schedule"},
        {"Exam Management"},
        {"Students  Attendance", "Attendance Overview", "Mark Student Attandance","Attendance View"},
        {"Reports", "Monthly Income & Profit", "Monthly Instructors Salary", "Monthly Admin Salary", "Class payments", "Other 1", "Other 2", "Other 3", "Other 4", "Other 5"},};

    public void init() {
        layout = new MigLayout("wrap 1, fillx, gapy 0, inset 2", "fill");
        setLayout(layout);
        setOpaque(false);
        // init Menu Item
        for (int i = 0; i < menuItems.length; i++) {
            addMenu(menuItems[i][0], i);
        }
    }

    private Icon getIcon(int index) {
        if (userType.equals("Owner")) {
            URL url = getClass().getResource("/learnway/resources/icon/uiBtnIcons/owner/" + index + ".png");
            if (url != null) {
                return new ImageIcon(url);
            } else {
                return null;
            }
        } else if (userType.equals("Admin")) {
            URL url = getClass().getResource("/learnway/resources/icon/uiBtnIcons/admin/" + index + ".png");
            if (url != null) {
                return new ImageIcon(url);
            } else {
                return null;
            }
        } else if (userType.equals("Instructor")) {
            URL url = getClass().getResource("/learnway/resources/icon/uiBtnIcons/instructor/" + index + ".png");
            if (url != null) {
                return new ImageIcon(url);
            } else {
                return null;
            }
        } else {
            URL url = getClass().getResource("/learnway/resources/icon/uiBtnIcons/academic/" + index + ".png");
            if (url != null) {
                return new ImageIcon(url);
            } else {
                return null;
            }
        }

    }


    private void addMenu(String menuName, int index) {
        int length = menuItems[index].length;
        MenuItem item = new MenuItem(menuName, index, length > 1);
        Icon icon = getIcon(index);
        if (icon != null) {
            item.setIcon(icon);
        }
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (length > 1) {
                    if (!item.isSelected()) {
                        item.setSelected(true);
                        addSubMenu(item, index, length, getComponentZOrder(item));
                    } else {
                        //  Hide menu
                        hideMenu(item, index);
                        item.setSelected(false);
                    }
                } else {
                    if (event != null) {
                        event.selected(index, 0, userType);
                    }
                }
            }
        });
        add(item);
        revalidate();
        repaint();
    }

    private void addSubMenu(MenuItem item, int index, int length, int indexZorder) {
        JPanel panel = new JPanel(new MigLayout("wrap 1, fillx, inset 0, gapy 0", "fill"));
        panel.setName(index + "");
        panel.setBackground(new Color(18, 90, 110));
        for (int i = 1; i < length; i++) {
            MenuItem subItem = new MenuItem(menuItems[index][i], i, false);
            subItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    if (event != null) {
                        event.selected(index, subItem.getIndex(), userType);
                    }
                }
            });
            subItem.initSubMenu(i, length);
            panel.add(subItem);
        }
        add(panel, "h 0!", indexZorder + 1);
        revalidate();
        repaint();
        MenuAnimation.showMenu(panel, item, layout, true);
    }

    private void hideMenu(MenuItem item, int index) {
        for (Component com : getComponents()) {
            if (com instanceof JPanel && com.getName() != null && com.getName().equals(index + "")) {
                com.setName(null);
                MenuAnimation.showMenu(com, item, layout, false);
                break;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
//        g2.setColor(new Color(21, 110, 71));
         g2.setPaint(new GradientPaint(0, 0, new Color(28, 94, 117), 0, getHeight(), new Color(19, 110, 134)));
        g2.fill(new Rectangle2D.Double(0, 0, getWidth(), getHeight()));
        super.paintComponent(grphcs);
    }


}
