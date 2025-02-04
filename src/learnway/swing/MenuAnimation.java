package learnway.swing;

import java.awt.Component;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;

/**
 *
 * @author macintosh
 */
public class MenuAnimation {
    public static void showMenu(Component component, MenuItem item, MigLayout layout, boolean show) {
        int height = component.getPreferredSize().height;
        Animator animator = new Animator(300, new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                float f = show ? fraction : 1f - fraction;

                layout.setComponentConstraints(component, "h " + height * f + "!");
                component.revalidate();
            }

//            @Override
//            public void begin() {
//
//            }
//
//            @Override
//            public void end() {
//
//            }
//
//            @Override
//            public void repeat() {
//
//            }
        });

        animator.setResolution(0);
        animator.setAcceleration(.5f);
        animator.setDeceleration(.5f);
        animator.start();

    }
}
