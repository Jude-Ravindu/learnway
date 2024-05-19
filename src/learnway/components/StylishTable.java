package learnway.components;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.util.List;

public class StylishTable extends JPanel {

    private JTable table;
    private JScrollPane scroll;

    public StylishTable() {
        setLayout(new BorderLayout());

        // Initialize and set up the table
        table = new JTable(new DefaultTableModel(new Object[][]{},
                new String[]{"No", "Name", "Email", "Address", "Action"}) {
            boolean[] canEdit = new boolean[]{false, false, false, false, false};

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        table.setDefaultRenderer(Object.class, new TableGradientCell());
        table.setRowHeight(30);

        scroll = new JScrollPane(table);
        scroll.putClientProperty(FlatClientProperties.STYLE, "border:3,0,3,0,$Table.background,10,10");
        scroll.getVerticalScrollBar().putClientProperty(FlatClientProperties.STYLE, "hoverTrackColor:null");

        add(scroll, BorderLayout.CENTER);
        testData();
        table.setTransferHandler(new FileDropHandler());

        // Apply additional styles
        table.getTableHeader().putClientProperty(FlatClientProperties.STYLE, ""
                + "hoverBackground:null;"
                + "pressedBackground:null;"
                + "separatorColor:$TableHeader.background");
    }

    private void testData() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        model.addRow(new Object[]{1, "John Smith", "john.smith@example.com", "123 Main St, City"});
        model.addRow(new Object[]{2, "Sarah Jones", "sarah.jones@example.com", "456 Elm St, Town"});
        model.addRow(new Object[]{3, "David Brown", "david.b@example.com", "789 Oak St, Village"});
        model.addRow(new Object[]{4, "Lisa Davis", "lisa.d@example.com", "101 Pine St, Town"});
        model.addRow(new Object[]{5, "Mark Wilson", "mark.w@example.com", "555 Cedar St, City"});
        model.addRow(new Object[]{6, "Alice Johnson", "alice.j@example.com", "222 Elm St, Village"});
    }

    private class TableGradientCell extends DefaultTableCellRenderer {

        private final Color selectedColor = Color.decode("#2c2c2c");

        public TableGradientCell() {
            setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (isSelected) {
                com.setBackground(selectedColor);
            } else {
                com.setBackground(table.getBackground());
            }
            return com;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
        }
    }

    private class FileDropHandler extends TransferHandler {

        @Override
        public boolean canImport(TransferSupport support) {
            return support.isDataFlavorSupported(DataFlavor.javaFileListFlavor);
        }

        @Override
        public boolean importData(TransferSupport support) {
            if (!canImport(support)) {
                return false;
            }

            try {
                Transferable transferable = support.getTransferable();
                List<File> files = (List<File>) transferable.getTransferData(DataFlavor.javaFileListFlavor);
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                for (File file : files) {
                    model.addRow(new Object[]{model.getRowCount() + 1, file.getName(), file.getAbsolutePath()});
                }
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
        }
    }
 public static void main(String args[]) {
        FlatLaf.registerCustomDefaultsSource("raven.table");
        FlatMacLightLaf.setup();
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Stylish Table");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new StylishTable());
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
    // To test the StylishTable component

}
