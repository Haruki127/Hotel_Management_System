package form;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;


public final class ff {
    private static BufferedImage bi;

    public static void main(String[] args){
        try {
            loadImage();

            SwingUtilities.invokeLater(new Runnable(){
                @Override
                public void run() {
                    createAndShowGUI();             
                }
            });
        } catch (IOException e) {
            // handle exception
        }
    }

    private static void loadImage() throws IOException{
        bi = ImageIO.read(ff.class.getResource("../resources/login.png"));
    }

    private static void createAndShowGUI(){
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JLabel label = new JLabel();
        label.setIcon(new ImageIcon(bi));

        frame.getContentPane().add(label);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}