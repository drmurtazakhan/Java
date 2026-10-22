import java.applet.*;
import java.awt.*;

public class DukeImages extends Applet 
    implements Runnable {
    String[] imagesToFetch;
    Image[] fetchedImages;
    int fetched;    // number of fetched images.
    Thread fetcherThread;

    // Applet State Methods
    public void init() {
        int i = 0;

        while (getParameter("duke"+i) != null) {
            i++;
        }
        imagesToFetch = new String[i];
        fetchedImages = new Image[i];

        if (i > 0) {
            fetcherThread = new Thread(this);
            fetcherThread.start();
        }
        for (i=0; i<imagesToFetch.length; i++) {
            imagesToFetch[i] = 
                getParameter("duke"+i);
        }
        resize(200, imagesToFetch.length * 70);
    }

    public void destroy() {
        fetcherThread = null;
    }

    // Paint Methods
    public void paint(Graphics g) {
        int w = getSize().width;
        int h = getSize().height;
        FontMetrics fm = g.getFontMetrics();
        int y = 0;

        for (int i=0; i<imagesToFetch.length; i++) {
            if (i < fetched) {
                g.drawImage(fetchedImages[i], 0, y, 50, 50, this);
            }
            g.drawString(imagesToFetch[i], 60, y + fm.getAscent());
            y += 70;
        }
    }

    public void run() {
        while (Thread.currentThread() == fetcherThread 
                    && fetched < imagesToFetch.length) {
            try {
                fetchedImages[fetched]= getImage(
                    getDocumentBase(), imagesToFetch[fetched]);
                while (!prepareImage(fetchedImages[fetched], this)) {
                    Thread.sleep(2000);
                }
                fetched++;
                if (isActive()) {
                    repaint();
                }
            } catch (InterruptedException e) {
            }
        }
    }
}
