package learnway.view;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import learnway.applicaton.AppInitializer;
import learnway.swing.LogoutListener;
import learnway.swing.MenuEvent;
import learnway.util.GlobalVar;
import learnway.view.academic.AcademicDashboardOverview;
import learnway.view.academic.AttendanceMarking;
import learnway.view.academic.AttendanceOverview;
import learnway.view.academic.AttendanceView;
import learnway.view.shared.ExamsScheduleView;
import learnway.view.academic.MonthlyClassPayments;
import learnway.view.shared.QuickLinks;
import learnway.view.academic.StudentEnrollement;
import learnway.view.academic.StudentUpdate;
import learnway.view.academic.StudentsOverview;
import learnway.view.academic.SubjectOverview;
import learnway.view.admin.AcademicAddNew;
import learnway.view.admin.AcademicDetails;
import learnway.view.admin.AcademicOverview;
import learnway.view.admin.AcademicUpdate;
import learnway.view.admin.AdminDashboardOverview;
import learnway.view.admin.SalariesOverview;
import learnway.view.instructor.InstructorDashboardOverview;
import learnway.view.login.FormsManager;
import learnway.view.login.Login;
import learnway.view.owner.AdminRegistration;
import learnway.view.owner.AdminUpdate;
import learnway.view.owner.OwnerDashboardOverview;
import learnway.view.owner.StaffOverview;
import learnway.view.shared.ClassOverview;
import learnway.view.shared.ClassScheduleOverview;
import raven.toast.Notifications;

/**
 *
 * @author macintosh
 */
public class Main extends JFrame implements LogoutListener {

    private final JFrame parentFrame;

    public Main(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        String userType = GlobalVar.userType;
        System.out.println(userType);
        initComponents();
        if (userType.equals("Academic")) {
            showForm(new AcademicDashboardOverview());
        } else if (userType.equals("Admin")) {
            showForm(new AdminDashboardOverview());
        } else if (userType.equals("Instructor")) {
            showForm(new InstructorDashboardOverview());
        } else if (userType.equals("Owner")) {
            showForm(new OwnerDashboardOverview());
        }
        this.setExtendedState(6);
        menu1.setEvent(new MenuEvent() {
            @Override
            public void selected(int index, int subIndex, String userType) {
                if (userType.equals("Academic")) {
                    if (index == 0) {
                        showForm(new AcademicDashboardOverview());
                    } else if (index == 1 && subIndex == 1) {
                        showForm(new StudentEnrollement());
                    } else if (index == 1 && subIndex == 2) {  // not working
                        showForm(new StudentsOverview());
                    } else if (index == 1 && subIndex == 3) {
                        showForm(new StudentUpdate());          // not working
                    } else if (index == 1 && subIndex == 4) {
                        showForm(new MonthlyClassPayments());
                    } else if (index == 2) {
                        showForm(new QuickLinks());
                    } else if (index == 3) {

                    } else if (index == 4) {
                        showForm(new SubjectOverview());
                    } else if (index == 5) {
                        showForm(new ClassOverview());
                    } else if (index == 6) {
                        showForm(new ClassScheduleOverview());
                    } else if (index == 7) {
                        showForm(new ExamsScheduleView());
                    } else if (index == 8 && subIndex == 1) {
                        showForm(new AttendanceOverview());
                    } else if (index == 8 && subIndex == 2) {
                        showForm(new AttendanceMarking());
                    } else if (index == 8 && subIndex == 3) {
                        showForm(new AttendanceView());
                    } else if (index == 9 && subIndex == 1) {

                    } else if (index == 9 && subIndex == 2) {

                    } else if (index == 9 && subIndex == 3) {

                    } else if (index == 9 && subIndex == 4) {

                    } else if (index == 9 && subIndex == 5) {

                    } else if (index == 9 && subIndex == 6) {

                    } else if (index == 9 && subIndex == 7) {

                    } else if (index == 9 && subIndex == 8) {

                    } else if (index == 9 && subIndex == 9) {

                    }
                } else if (userType.equals("Admin")) {
                    if (index == 0) {
                        showForm(new AdminDashboardOverview());
                    } else if (index == 1 && subIndex == 1) {

                    } else if (index == 1 && subIndex == 2) {

                    } else if (index == 1 && subIndex == 3) {

                    } else if (index == 1 && subIndex == 4) {

                    } else if (index == 2 && subIndex == 1) {
                        showForm(new AcademicAddNew(Main.this));
                    } else if (index == 2 && subIndex == 2) {
                        showForm(new AcademicOverview(Main.this));
                    } else if (index == 2 && subIndex == 3) {
                        showForm(new AcademicUpdate());
                    } else if (index == 2 && subIndex == 4) {
                        showForm(new AcademicDetails());
                    } else if (index == 3) {
                        showForm(new SubjectOverview());
                    } else if (index == 4) {
                        showForm(new ClassOverview());
                    } else if (index == 5) {
                        showForm(new ClassScheduleOverview());
                    } else if (index == 6) {
                        showForm(new ExamsScheduleView());
                    } else if (index == 7) {
                        showForm(new SalariesOverview());
                    } else if (index == 8) {
                        showForm(new QuickLinks());
                    }
                } else if (userType.equals("Instructor")) {
                    if (index == 0) {
                        showForm(new InstructorDashboardOverview());
                    } else if (index == 1) {
                        showForm(new ClassScheduleOverview());
                    } else if (index == 2) {
                        showForm(new ExamsScheduleView());
                    } else if (index == 3) {
                        showForm(new QuickLinks());
                    }
                } else if (userType.equals("Owner")) {
                    if (index == 0) {
                        showForm(new OwnerDashboardOverview());
                    } else if (index == 1 && subIndex == 1) {
                        showForm(new AdminRegistration());
                    } else if (index == 1 && subIndex == 2) {
                        showForm(new AdminUpdate());
                    } else if (index == 2) {
                        showForm(new StaffOverview());
                    } else if (index == 3) {
                        showForm(new ClassScheduleOverview());
                    } else if (index == 4) {
                        showForm(new QuickLinks());
                    }
                }

            }
        });
    }

    @Override
    public void onLogout() {
        System.out.println("onLogout clicked");
        // 1. Logout Logic
        // ... (same as before) ...

        // 2. Close Current Form (Main.java)
        JFrame newFrame = new JFrame();
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.setSize(new Dimension(1200, 700));
        newFrame.setLocationRelativeTo(null);
        newFrame.setContentPane(new Login(newFrame));
        Notifications.getInstance().setJFrame(newFrame);

        // Make the new JFrame visible
        newFrame.setVisible(true);

        // Close the current form
        this.dispose();
    }

    public JPanel getBody() {
        return body;
    }

    public void showForm(Component com) {
        body.removeAll();
        body.add(com);
        body.repaint();
        body.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scrollPaneWin111 = new raven.scroll.win11.ScrollPaneWin11();

        header1 = new learnway.components.Header();
        header1.setLogoutListener(this); // Add this line
        menu1 = new learnway.swing.Menu();
        body = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        scrollPaneWin111.setBackground(new java.awt.Color(21, 94, 117));
        scrollPaneWin111.setBorder(null);
        scrollPaneWin111.setViewportView(menu1);

        header1.setBackground(new java.awt.Color(19, 110, 139));

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new javax.swing.OverlayLayout(body));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(scrollPaneWin111, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE))
            .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

//        FlatRobotoFont.install();
//        FlatLaf.registerCustomDefaultsSource("learnway.themes");
//        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 14));
//        FlatMacLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private learnway.components.Header header1;
    private javax.swing.JPanel jPanel1;
    private learnway.swing.Menu menu1;
    private raven.scroll.win11.ScrollPaneWin11 scrollPaneWin111;
    // End of variables declaration//GEN-END:variables
}
