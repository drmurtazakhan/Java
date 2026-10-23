import ccj.*;

public class EmplFile extends GraphicsApplet
{  public void run()
   {  String filename = readString
         ("Please enter the data file name: ");
      TextInputStream in = new TextInputStream(filename);
      int n = in.readInt();
      in.readLine();
      
      Employee[] staff = new Employee[n];
      int i;
      for (i = 0; i < n; i++)
         staff[i] = readEmployee(in);

      Employee highestPaid = staff[0];
      for (i = 1; i < staff.length; i++)
         if (staff[i].getSalary() > highestPaid.getSalary())
            highestPaid = staff[i];

      setCoord(0, highestPaid.getSalary(), staff.length, 0);
      for (i = 0; i < staff.length; i++)
      {  Line bar = new Line(new Point(i, 0),
            new Point(i, staff[i].getSalary()));
         bar.draw();
         Message title = new Message(bar.getEnd(),
            staff[i].getName());
         title.draw();
      }
   }

   Employee readEmployee(TextInputStream in)
   {  String name = in.readLine();
      double salary = in.readDouble();
      in.readLine();
      return new Employee(name, salary);
   }
}
