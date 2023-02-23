import javax.swing.*;
import java.awt.*;

public class tomie {
    JFrame frame = new JFrame();
    ImageIcon bg = new ImageIcon("tomie.jpg");
    JButton btn = new JButton("Login");
    

    public tomie (){
        Image img = bg.getImage();
        bg = new ImageIcon(img.getScaledInstance(500, 800, Image.SCALE_SMOOTH));
        frame.setSize(500,800);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        JLabel lblBack = new JLabel(bg);
        lblBack.setLayout(new FlowLayout());
        lblBack.setBounds(0, 0, 500, 800);
        
        btn.setBounds(100, 100, 100, 100);
        lblBack.add(btn);


        frame.add(lblBack);

        frame.setVisible(true);
    }

    public static void main(String [] args) {
        tomie GUI = new tomie();
    }


    
}
