package learnway.view.components;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author RAVEN
 */
public class TableGradientCell extends DefaultTableCellRenderer {

    private final Color selectedColor = Color.decode("#2c2c2c"); // Define light gray color for selection

    public TableGradientCell() {
        setOpaque(true); // Ensure the renderer is opaque to paint the background
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Set the background color to light gray if the cell is selected
        if (isSelected) {
            com.setBackground(selectedColor);
        } else {
            com.setBackground(table.getBackground()); // Default background for non-selected cells
        }

        return com;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        // Custom painting code is not necessary for plain color selection
        super.paintComponent(g);
    }
}