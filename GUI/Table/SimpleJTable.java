// A test of the JTable class using default table models and a convenience 
// constructor.  Resizing and selection defaults are altered.
//
import java.awt.*;
import javax.swing.*;
import java.util.Date;
import java.io.File;

public class SimpleJTable extends JFrame {

  String titles[] = new String[] {
    "Directory?", "File Name", "Read?", "Write?", "Size", "Last Modified"
  };

  public SimpleJTable() {
    super("Simple JTable Test");
    setSize(300, 200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    File pwd = new File(".");
    Object[][] stats = getFileStats(pwd);

    JTable jt = new JTable(stats, titles);
    jt.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    jt.setColumnSelectionAllowed(true);

    JScrollPane jsp = new JScrollPane(jt);
    getContentPane().add(jsp, BorderLayout.CENTER);
  }

  public Object[][] getFileStats(File dir) {
    String files[] = dir.list();
    Object[][] results = new Object[files.length][titles.length];

    for (int i=0; i < files.length; i++) {
      File tmp = new File(files[i]);
      results[i][0] = new Boolean(tmp.isDirectory());
      results[i][1] = tmp.getName();
      results[i][2] = new Boolean(tmp.canRead());
      results[i][3] = new Boolean(tmp.canWrite());
      results[i][4] = new Long(tmp.length());
      results[i][5] = new Date(tmp.lastModified());
    }
    return results;
  }

  public static void main(String args[]) {
    SimpleJTable tf = new SimpleJTable();
    tf.setVisible(true);
  }
}

// GitHub repository of my Java Programs
// https://github.com/drmurtazakhan/Java/

// ResearchGate: http://www.researchgate.net/profile/Murtaza_Khan2/
// LinkedIn: https://www.linkedin.com/in/dr-murtaza-khan-3b368019
// Google Scholar: https://scholar.google.com/citations?user=n0JDQ0sAAAAJ
