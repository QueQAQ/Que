import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_bg=new JLabel();

    JLabel label_score=new JLabel();
    int score,score1,score2,score3;

    //构造方法
    public App() {

        myPanel.add(label_score);
        myPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getX()<700 && e.getY()<850){
                    score1=1;
                    score=score1+score2+score3;
                    label_score.setText(String.valueOf(score));
                }
            }
        });


    }
    //显示窗体方法
    void go(){
        java.net.URL imgURL = App.class.getResource("img/bg.jpg");
        label_bg.setIcon(new ImageIcon(imgURL));
        label_bg.setBounds(0,0,1000,800);


        label_score.setText("得分：0");
        label_score.setBounds(20,20,200,60);

        myPanel.add(label_bg);

        JFrame frame = new JFrame("海绵宝宝找茬游戏");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,1000,800);
        //frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new App().go();
    }
}
