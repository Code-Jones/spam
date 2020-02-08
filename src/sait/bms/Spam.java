package sait.bms;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Spam {

    public Spam() throws IOException {

        ArrayList<String> aList = new ArrayList<>();

        aList.add("https://i.pinimg.com/originals/27/d3/cf/27d3cf88a626932621de61e0f024df59.png");
        aList.add("https://tr4.cbsistatic.com/hub/i/r/2016/05/27/3ff5cec0-28b6-4a20-a799-94fafdb1cd15/resize/1200x900/fc6fcf0ef0c810a911134bc1cdc1913a/cannot-quit.jpg");
        aList.add("https://tr4.cbsistatic.com/hub/i/2016/05/26/68d5ecdb-5041-45de-8016-4aa337b56bb4/win-xp-bliss-of-death.jpg");
        aList.add("https://tr1.cbsistatic.com/hub/i/2016/05/26/1d82af32-867f-4b4b-872a-96bebd85a100/windows-1-error.jpg%22");
        aList.add("https://tr4.cbsistatic.com/hub/i/2016/05/26/83fc6e2e-1b14-4e90-aad1-a2da45472702/sad-mac.jpg");
        aList.add("https://tr2.cbsistatic.com/hub/i/2016/05/27/2fdfc5da-f459-470a-906c-43ccb39f46c5/6299025.jpg");
        aList.add("https://tr2.cbsistatic.com/hub/i/2016/05/27/f4f6b5f4-d079-4e1e-a675-7d4151d00eb2/atari-st.jpg");
        aList.add("https://tr3.cbsistatic.com/hub/i/2016/05/27/7fb46851-2ae2-4076-88a1-90f0e1f8634a/not-ready-reading.jpg");
        aList.add("https://static.makeuseof.com/wp-content/uploads/2016/11/01-IE-See-Information.png");
        aList.add("https://static.makeuseof.com/wp-content/uploads/2016/11/02-Windows-Problem-Reporting-Error.jpg");


        Random random = new Random();

        BufferedImage img = ImageIO.read(new URL(
                aList.get(random.nextInt(aList.size()))));
        ImageIcon icon = new ImageIcon(img);
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(1500, 1500);
        JLabel lbl = new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.pack();
        frame.setLocation(random.nextInt(999), random.nextInt(999));
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
}


