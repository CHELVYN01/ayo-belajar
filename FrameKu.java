//soal 1 membuat suatu frame
package MODUL3.latihan1;

import javax.swing.JFrame;

public class FrameKu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ini Frame Pertamaku");
     
        int tinggi = 300;
        int lebar = 500;
        
        frame.setBounds(100, 100, lebar, tinggi);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    
}
   