/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnway.components;

/**
 *
 * @author Ishara Deshan
 */
import javax.swing.*;
import java.awt.*;

public class CompoundIcon implements Icon {
    private final Icon icon;
    private final String title;
    private final int gap;
    private final Font font;
    private final Color color;

    public CompoundIcon(Icon icon, String title, int gap, Font font, Color color) {
        this.icon = icon;
        this.title = title;
        this.gap = gap;
        this.font = font;
        this.color = color;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        // Apply styles to the graphics context
        Font originalFont = g.getFont();
        Color originalColor = g.getColor();
        g.setFont(font);
        g.setColor(color);

        icon.paintIcon(c, g, x, y);

        // Calculate the position for the title
        FontMetrics fm = g.getFontMetrics();
        int titleWidth = fm.stringWidth(title);
        int titleHeight = fm.getHeight();
        int titleX = x + icon.getIconWidth() + gap;
        int titleY = y + (icon.getIconHeight() - titleHeight) / 2 + fm.getAscent();

        // Draw the title
        g.drawString(title, titleX, titleY);

        // Restore original font and color
        g.setFont(originalFont);
        g.setColor(originalColor);
    }

    @Override
    public int getIconWidth() {
        return icon.getIconWidth() + gap + getTitleWidth();
    }

    @Override
    public int getIconHeight() {
        return Math.max(icon.getIconHeight(), getTitleHeight());
    }

    private int getTitleWidth() {
        return SwingUtilities.computeStringWidth(new JLabel().getFontMetrics(font), title);
    }

    private int getTitleHeight() {
        return new JLabel().getFontMetrics(font).getHeight();
    }
}
