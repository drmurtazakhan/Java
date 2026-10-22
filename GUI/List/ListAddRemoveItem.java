// ListAddRemoveItem.java
// A variation on SimpleList.  This version modifies the selecion model used.
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListAddRemoveItem extends JPanel {

    String label[] = { "James Smith", "Jane Jones", "Imran Khan", "Larry Berry",
     "Fabio Tom", "Peter Jackson", "Susan Yu", "Yvonne well"  };    
     
    JList mainList,subList;
    
    DefaultListModel subListModel;

    
    JButton addB = new JButton("Add to course");
    JButton removeB = new JButton("Remove from course");
    JButton saveB = new JButton("Save the chnage");
    JButton closeB = new JButton("Close");
    
    JPanel buttonPanel = new JPanel();
    JPanel listPanel = new JPanel();

    public ListAddRemoveItem() {
        setLayout(new BorderLayout());
        subListModel = new DefaultListModel( );
        
        buttonPanel.setLayout(new GridLayout(4,1));
        buttonPanel.add(addB);
        buttonPanel.add(removeB);
        buttonPanel.add(saveB);
        buttonPanel.add(closeB);

        mainList = new JList(label);
        subList = new JList(subListModel);
        
                        
        
        JScrollPane mainListPane = new JScrollPane(mainList);
        JScrollPane subListPane = new JScrollPane(subList);
        
        listPanel.setLayout(new GridLayout(1,2));
        listPanel.add(mainListPane);
        listPanel.add(subListPane);
        
        add(listPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.WEST);


        DefaultListSelectionModel m = new DefaultListSelectionModel();
        m.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        m.setLeadAnchorNotificationEnabled(false);
        mainList.setSelectionModel(m);

        mainList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                //System.out.println(e.toString());
            }
        });
        
        addB.addActionListener(new AddButtonListener());
        removeB.addActionListener(new RemoveButtonListener());     

    }

    public static void main(String s[]) {
         JFrame frame = new JFrame("List Example");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new ListAddRemoveItem());
         frame.pack();
         frame.setVisible(true);
    }

    // An inner class to respond to clicks on the Add to course button
    class AddButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int selected[] = mainList.getSelectedIndices();
            
            for (int i=0; i < selected.length; i++) {
                String element=(String)mainList.getModel().getElementAt(selected[i]);
                System.out.println("Added: " + element);
                subListModel.addElement(element);
            }
        }
    }
    

    // An inner class to respond to clicks on the Remove course button
    class RemoveButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int selected[] = subList.getSelectedIndices();
            
            for (int i=0; i < selected.length; i++) {
                String element=(String)subListModel.getElementAt(selected[i]);
                System.out.println("Removed:  " + element);
                subListModel.remove(selected[i]);
            }
        }
    }
    
}
