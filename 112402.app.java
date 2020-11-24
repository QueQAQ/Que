package pac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class app {
    JPanel myPanel=new JPanel();
    JTable Table=new JTable();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();

    public app() {

        textArea_A.setBounds(100,100,256,128);
        textArea_A.setBackground(Color.pink);
        myPanel.add(textArea_A);
        textArea_B.setBounds(100,300,256,128);
        textArea_B.setBackground(Color.CYAN);
        myPanel.add(textArea_B);

        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (textArea_A.getText().equals("大聪明") ){
                    textArea_B.setText("输入正确");
                }
                else {
                    textArea_B.setText("输入错误");
                }
            }
        });

    }


    //显示窗体
    void go(){
        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        myPanel.add(Table);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new app().go();
    }
}
