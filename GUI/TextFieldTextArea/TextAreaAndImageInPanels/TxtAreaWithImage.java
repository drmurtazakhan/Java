import java.io.*;
import java.util.*;
import javax.imageio.*;
import javax.imageio.stream.*;
import javax.imageio.metadata.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;


public class TxtAreaWithImage extends JFrame implements ActionListener {

    private static final int FW = 500;
    private static final int FH = 300;
    public static final int LINES = 15;
    public static final int CHAR_PER_LINE = 30;

    private int counter = 0;

    private String uniName[] = {
        "Umm Al-Qura University (UQU) (Arabic: ????? ?? ?????? Jami?at ?Umm Al-Qura) is a large public Islamic university in Mecca, Saudi Arabia. The university was established as the College of Sharia (Islamic Law) in 1949 before being joined by new colleges and renamed as Umm Al-Qura by royal decree in 1981. UQU started primarily as an Islamic university offering degrees in Islamic Law and Arabic language studies. It now offers more courses in such diverse subjects as Technology Management, Business Management, Islamic Economics, Marketing, Engineering, Technology, Medicine, Education, Architecture, as well various Applied, Social and Engineering Sciences. The medium of instruction in most UQU academic programs is English, with exceptions like College of Sharia, College of Arabic Languages, College of Islamic Economics and Finance, as courses on Islamic studies and Arabic language are taught in Arabic. University offers degrees of Bachelor of Science, Master of Science, and Doctor of Philosophy. The grading system is the standard 0 to 4.0 scale. ",
        "King Abdulaziz University (KAU) (Arabic: ????? ????? ??? ???????) is a public university in Jeddah, Saudi Arabia. Established initially in 1967 as a private university by a group of businessmen. In 1974, King Abdulaziz University was converted to a public university . In 2016, it was ranked the #1 Arab university by Times Higher Education. King Abdulaziz University (KAU) (Arabic: ????? ????? ??? ???????) is a public university in Jeddah, Saudi Arabia. Established initially in 1967 as a private university by a group of businessmen. In 1974, King Abdulaziz University was converted to a public university . In 2016, it was ranked the #1 Arab university by Times Higher Education. Between 2004 and 2014, King Abdulaziz University enacted a program to attract the international community and has welcomed nearly 150 researches or various disciplines. The university has developed international research partners, including in Morocco where it has developed a joint lunar research program with the Astronomic Observatory of Oukaïmeden. The university has 13 different research centers, predominantly in the fields of medicine (medical genomes and osteoperosis), environment and energy, climate change, and desalination.",
        "King Fahd University of Petroleum and Minerals (KFUPM or UPM) (Arabic: ????? ????? ??? ??????? ? ????????, Jami?at al-Malik Fahd li-l-Bitrul wa-l-Ma?adin – short: Arabic: ????? ???????? Jami?at al-Bitrul) is a public university in Dhahran, Saudi Arabia. Among Saudi universities, its science, engineering, and business/management programs are the most highly regarded in the country as well as in the whole region.",
        "King Saud University (KSU, Arabic: ????? ????? ?????) is a public university in Riyadh, Saudi Arabia, founded in 1957 by King Saud bin Abdulaziz as Riyadh University, as the first university in the Kingdom of Saudi Arabia. The university was created to meet the shortage of skilled workers in Saudi Arabia. It was renamed King Saud University in 1982. The student body of KSU today consists of 40,000 male and female students.",
        "Jazan University is a public research university based in the city of Jazan. Founded in 2006. It is one of the largest public, nonprofit institutions of higher education in the Kingdom of Saudi Arabia. Jazan University has a main central campus that rests by the Red Sea on the southwest coast of Saudi Arabia and also has satellite campuses in Sabya, Abu Arish, Farasan, Ad-darb, Samtah, Al-Daer and Al-Ardah. Jazan University offers a broad range of academic departments, an extensive research enterprise and a number of community outreach and public service programs. It is particularly well known for its medical school, dental school, school of business, its social sciences and humanities programs, as well as its biomedical teaching and research capabilities."
         };

    private static final String[] fileNames = {"uqu.jpg", "kau.jpg", "kfupm.jpg", "ksu.jpg","jazanu.jpg"};
    private JLabel imgLabel[] = new JLabel[fileNames.length];
    
    private String buttonLabel[] = {"FIRST", "PREVIOUS", "NEXT", "LAST"};
    private JButton buttons[] = new JButton[buttonLabel.length];
    

    private JTextArea txtArea;
    JPanel imagePanel;    
    ImageIcon imgIcon;

    public static void main(String[] args) {
        TxtAreaWithImage gui = new TxtAreaWithImage();
        gui.setVisible(true);
    }

    public TxtAreaWithImage() {
        super("Text Area and Image in Panels");
        setSize(FW, FH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel textPanel = new JPanel();
        textPanel.setBackground(Color.GREEN);

        txtArea = new JTextArea(LINES, CHAR_PER_LINE);
        txtArea.setBackground(Color.WHITE);
        txtArea.setEditable(false);
        
        Font font1 = new Font("SansSerif", Font.PLAIN, 20);
        txtArea.setFont(font1);
        txtArea.setLineWrap(true);
        		
        txtArea.setText(uniName[0] + "");

        JScrollPane scrolledText = new JScrollPane(txtArea);
        scrolledText.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        textPanel.add(scrolledText);

        imagePanel = new JPanel();
        imagePanel.setLayout(new FlowLayout());
        imagePanel.setBackground(Color.YELLOW);
       
        for (int i = 0; i < fileNames.length; i++) {        	
            imgIcon = new ImageIcon(fileNames[i]);
            imgLabel[i] = new JLabel(imgIcon);
            imgLabel[i].setVisible(false);
            imagePanel.add(imgLabel[i]);
        }
        imgLabel[0].setVisible(true); // by default

        JPanel buttonPanel = new JPanel();        
        buttonPanel.setBackground(Color.PINK);
        buttonPanel.setLayout(new FlowLayout());

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(buttonLabel[i]);
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }

        JPanel bigPanel = new JPanel();
        //bigPanel.setLayout(new GridLayout(1, 2));
        bigPanel.setLayout(new FlowLayout());

        bigPanel.add(imagePanel);
        bigPanel.add(textPanel);

        add(bigPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        pack();

    }

    public void actionPerformed(ActionEvent ae) {

        // action for FIRST button   
        if (ae.getSource() == buttons[0]) {
            counter = 0;
            txtArea.setText(uniName[counter] + "");
            // setVisible false to all the label then set true to one later
            setLabelsFalse();
            imgLabel[counter].setVisible(true);
        }

        // action for PREVIOUS button
        if (ae.getSource() == buttons[1]) {
            if (counter > 0 && counter < uniName.length) {
                counter = counter - 1;
                txtArea.setText(uniName[counter] + "");
                // setVisible false to all the label then set true to one later  
                setLabelsFalse();
                imgLabel[counter].setVisible(true);
            }
        }

        // action for NEXT button
        if (ae.getSource() == buttons[2]) {
            if (counter >= 0 && counter < uniName.length - 1) {
                counter = counter + 1;
                txtArea.setText(uniName[counter] + "");
                // setVisible false to all the label then set true to one later
                setLabelsFalse();
                imgLabel[counter].setVisible(true);
            }
        }

        // action for LAST button
        if (ae.getSource() == buttons[3]) {
            counter = uniName.length - 1;
            txtArea.setText(uniName[counter] + "");
            // setVisible false to all the label then set true to one later
            setLabelsFalse();
            imgLabel[counter].setVisible(true);
        }

    }

    public void setLabelsFalse() {

        for (int i = 0; i < imgLabel.length; i++) {
            imgLabel[i].setVisible(false);
        }

    }

}
