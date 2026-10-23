public class AllThreads {

  public static void main(String[] args) {

    ThreadGroup top = Thread.currentThread().getThreadGroup();
    while(true) {
      if (top.getParent() != null) top = top.getParent();
      else break;
    }
    Thread[] theThreads = new Thread[top.activeCount()];
    top.enumerate(theThreads);//Copies into the specified array 
    						//every active thread in this thread group and its subgroups
    for (int i = 0; i < theThreads.length; i++) {
      System.out.println(theThreads[i]);
    }

  }

}

