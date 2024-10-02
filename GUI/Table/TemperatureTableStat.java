import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.table.*;

import java.util.ArrayList;
import java.util.List;

public class TemperatureTableStat extends JFrame {

    private static final int WIDTH = 300;
    private static final int HEIGHT = 250;

    private static final int NoOfDigits = 10;

    //headers for the table
    String[] columns = new String[]{
        "Day", "Tempeature"
    };

    //data for the table in a 2d array
    static Object[][] data = new Object[][]{
        {"Sunday", 36.5},
        {"Monday", 32.4},
        {"Tuesday", 34.8},
        {"Wednesday", 33.9},
        {"Thursday", 37.2},
        {"Friday", 34.6},
        {"Saturday", 35.3},};

    JTable tempTable, tempTableSorted;
    DefaultTableModel tempTableModel;

    private static double minTemp, maxTemp, avgTemp;

    public static void main(String[] args) {
        TemperatureTableStat gui = new TemperatureTableStat();
        gui.setVisible(true);
    }

    public TemperatureTableStat() {
        super("Temperatue Table");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        JLabel minLbl = new JLabel("Minimum");
        JLabel maxLbl = new JLabel("Maximum");
        JLabel avgLbl = new JLabel("Average");

        JTextField minTxtFld = new JTextField(NoOfDigits);
        minTxtFld.setEditable(false);
        JTextField maxTxtFld = new JTextField(NoOfDigits);
        maxTxtFld.setEditable(false);
        JTextField avgTxtFld = new JTextField(NoOfDigits);
        avgTxtFld.setEditable(false);

        JPanel statPanel = new JPanel();
        statPanel.setLayout(new GridLayout(3, 2));

        statPanel.add(minLbl);
        statPanel.add(minTxtFld);
        statPanel.add(maxLbl);
        statPanel.add(maxTxtFld);
        statPanel.add(avgLbl);
        statPanel.add(avgTxtFld);
        statPanel.setBackground(Color.YELLOW);
        add(statPanel, BorderLayout.SOUTH);

        tempTable = new JTable(data, columns);
        processTable();

        JScrollPane jsp = new JScrollPane(tempTable);
        add(jsp, BorderLayout.CENTER);

        minTxtFld.setText("" + minTemp);
        maxTxtFld.setText("" + maxTemp);
        avgTxtFld.setText("" + avgTemp);

    }

    public void processTable() {

        tempTableModel = new DefaultTableModel(data, columns);

        tempTableSorted = new JTable(tempTableModel);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tempTableSorted.getModel());
        tempTableSorted.setRowSorter(sorter);

        List<RowSorter.SortKey> sortKeys = new ArrayList<>(tempTableSorted.getRowCount());
        sortKeys.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);

        double sumTemp = 0;
        for (int row = 0; row < tempTableSorted.getRowCount(); row++) {
            String day = tempTableSorted.getValueAt(row, 0).toString();
            double temp = (double) tempTableSorted.getValueAt(row, 1);

            sumTemp = sumTemp + temp;
            System.out.println(temp);
        }
        avgTemp = sumTemp / tempTableSorted.getRowCount();
        minTemp = (double) tempTableSorted.getValueAt(0, 1);
        maxTemp = (double) tempTableSorted.getValueAt(tempTableSorted.getRowCount() - 1, 1);

    }

}
