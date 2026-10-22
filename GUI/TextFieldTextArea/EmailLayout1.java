import javax.swing.*;import java.awt.*;
public class EmailLayout1 extends JFrame
{  private JPanel jp1 = new JPanel(); private JPanel jp2 = new JPanel();
   private JPanel jp3 = new JPanel(); private JPanel jp4 = new JPanel();
   private JPanel jp5 = new JPanel(); private JPanel jp6 = new JPanel();
   private JPanel jp7 = new JPanel();   
   private JButton composeButton = new JButton("Compose");
   private JButton sendButton = new JButton("Send");
   private JButton deleteButton = new JButton("Delete");
   private JButton inboxButton = new JButton("Inbox");
   private JButton outboxButton = new JButton("Outbox");
   private JButton trashboxButton = new JButton("Trash Box");
   private JButton addressbookButton = new JButton("Address Book");
   private JButton attachmentButton = new JButton("Add Attachment");
   private JButton signoutButton = new JButton("Signout");
   private JLabel toLabel = new JLabel("To");
   private JLabel fromLabel = new JLabel("From");
   private JTextField toField = new JTextField(20);
   private JTextField fromField = new JTextField(20);
   private JTextArea writeArea = new JTextArea(20,25);      
   public EmailLayout1()
   {  super("EmailLayout1");  setSize(500,500);
      Container cp = getContentPane();
      cp.setLayout(new BorderLayout());
      cp.add("South",jp1);
      cp.add("East",jp2);
      cp.add("North",jp3);
      cp.add("Center",jp4);
      jp4.setLayout(new BorderLayout());
      jp5.setLayout(new FlowLayout());
      jp7.setLayout(new FlowLayout());
      jp4.add("South",jp5);
      jp4.add("Center",jp6);
      jp4.add("North",jp7);
      
      jp1.setLayout(new FlowLayout());
      jp1.add(composeButton);  jp1.add(sendButton); jp1.add(deleteButton);
      
      jp2.setLayout(new GridLayout(3,1));
      jp2.add(inboxButton);  jp2.add(outboxButton);  jp2.add(trashboxButton);
      
      jp3.setLayout(new FlowLayout());
      jp3.add(addressbookButton);  jp3.add(attachmentButton);  jp3.add(signoutButton);
            
      jp5.add(toLabel);  jp5.add(toField);
	  jp6.add(writeArea);      
	  jp7.add(fromLabel);jp7.add(fromField);
      show();
   }  
   public static void main(String args [] ) {
          EmailLayout1 a= new EmailLayout1();
   }
}
