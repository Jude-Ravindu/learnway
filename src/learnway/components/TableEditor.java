package learnway.components;
import learnway.components.*;

import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableEditor {

//    private final JScrollPane scroller;
//    private final JTable table;
//
//    public TableEditor(JScrollPane scroller, JTable table) {
//        this.scroller = scroller;
//        this.table = table;
//    }

    public static void setTableStyle(JScrollPane scroller, JTable table) {
        table.setDefaultRenderer(Object.class, new TableGradientCell());
        table.getTableHeader().putClientProperty(FlatClientProperties.STYLE, ""
                + "hoverBackground:null;"
                + "pressedBackground:null;"
                + "separatorColor:$TableHeader.background");
        scroller.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:3,0,3,0,$Table.background,10,10");
        scroller.getVerticalScrollBar().putClientProperty(FlatClientProperties.STYLE, ""
                + "hoverTrackColor:null");
    }
}
