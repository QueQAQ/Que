import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();


    JLabel label_bg=new JLabel();
    JLabel label_plane=new JLabel();

    int x,y;

    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    label_plane.setBounds(x,y-=10, 128, 128);
                    myPanel.repaint();
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    label_plane.setBounds(x,y+=10,128,128);
                    myPanel.repaint();
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    label_plane.setBounds(x-=10,y,128,128);
                    myPanel.repaint();
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    label_plane.setBounds(x+=10,y,128,128);
                    myPanel.repaint();
                }

            }
        });



    }
    //显示窗体方法
    void go(){


        java.net.URL imgURL = App.class.getResource("img/plane.png");
        label_plane.setIcon(new ImageIcon(imgURL));
        label_plane.setBounds(0,0,128,128);
        myPanel.add(label_plane);


        java.net.URL imgURL2 = App.class.getResource("img/bg.jpg");
        label_bg.setIcon(new ImageIcon(imgURL2));
        label_bg.setBounds(0,0,512,720);
        myPanel.add(label_bg);


        JFrame frame = new JFrame("移动飞机");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        frame.setVisible(true);
        myPanel.setFocusable(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
