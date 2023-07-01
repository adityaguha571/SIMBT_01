
import java.awt.*;
import java.awt.event.*;
class NewTest extends Frame implements ActionListener {
    Button[] b11 = new Button[9];
    Button b, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int i = 1;
    int x, y, w, h;
    NewTest() {
        x = 0;
        y = 100;
        w = 100;
        h = 100;
        setLayout(null);
        Font f = new Font("Times New Roman", Font.BOLD, 30);
        setFont(f);
        b1 = new Button("");
        b1.setSize(100, 100);
        b1.setLocation(100, 100);
        add(b1);
        b11[0] = b1;

        b2 = new Button("");
        b2.setSize(100, 100);
        b2.setLocation(200, 100);
        add(b2);
        b11[1] = b2;

        b3 = new Button("");
        b3.setSize(100, 100);
        b3.setLocation(300, 100);
        add(b3);
        b11[2] = b3;

        b4 = new Button("");
        b4.setSize(100, 100);
        b4.setLocation(100, 200);
        add(b4);
        b11[3] = b4;

        b5 = new Button("");
        b5.setSize(100, 100);
        b5.setLocation(200, 200);
        add(b5);
        b11[4] = b5;

        b6 = new Button("");
        b6.setSize(100, 100);
        b6.setLocation(300, 200);
        add(b6);
        b11[5] = b6;

        b7 = new Button("");
        b7.setSize(100, 100);
        b7.setLocation(100, 300);
        add(b7);
        b11[6] = b7;

        b8 = new Button("");
        b8.setSize(100, 100);
        b8.setLocation(200, 300);
        add(b8);
        b11[7] = b8;

        b9 = new Button("");
        b9.setSize(100, 100);
        b9.setLocation(300, 300);
        add(b9);
        b11[8] = b9;

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        setResizable(false);
    }

    public void actionPerformed(ActionEvent e) {
        b = (Button) e.getSource();
        b.setForeground(Color.blue);
        {
            if (i % 2 == 0) {
                b.setLabel("0");
                b.setForeground(Color.blue);

            } else {
                b.setLabel("X");
                b.setForeground(Color.red);

            }
        }
        i++;
        b.removeActionListener(this);

        if ((b1.getLabel().equals("X") && b2.getLabel().equals("X") && b3.getLabel().equals("X"))
                || (b4.getLabel().equals("X") && b5.getLabel().equals("X") && b6.getLabel().equals("X"))
                || (b7.getLabel().equals("X") && b8.getLabel().equals("X") && b9.getLabel().equals("X"))
                || (b1.getLabel().equals("X") && b4.getLabel().equals("X") && b7.getLabel().equals("X"))
                || (b2.getLabel().equals("X") && b5.getLabel().equals("X") && b8.getLabel().equals("X"))
                || (b3.getLabel().equals("X") && b6.getLabel().equals("X") && b9.getLabel().equals("X"))
                || (b1.getLabel().equals("X") && b5.getLabel().equals("X") && b9.getLabel().equals("X"))
                || (b3.getLabel().equals("X") && b5.getLabel().equals("X") && b7.getLabel().equals("X"))) {
            Label l2 = new Label("Winner X !!");
            l2.setForeground(Color.red);
            l2.setSize(400, 50);
            l2.setLocation(200, 450);
            add(l2);
            for (Button btn : b11) {
                btn.setEnabled(false);
            }
        }

        if ((b1.getLabel().equals("0") && b2.getLabel().equals("0") && b3.getLabel().equals("0"))
                || (b4.getLabel().equals("0") && b5.getLabel().equals("0") && b6.getLabel().equals("0"))
                || (b7.getLabel().equals("0") && b8.getLabel().equals("0") && b9.getLabel().equals("0"))
                || (b1.getLabel().equals("0") && b4.getLabel().equals("0") && b7.getLabel().equals("0"))
                || (b2.getLabel().equals("0") && b5.getLabel().equals("0") && b8.getLabel().equals("0"))
                || (b3.getLabel().equals("0") && b6.getLabel().equals("0") && b9.getLabel().equals("0"))
                || (b1.getLabel().equals("0") && b5.getLabel().equals("0") && b9.getLabel().equals("0"))
                || (b3.getLabel().equals("0") && b5.getLabel().equals("0") && b7.getLabel().equals("0"))) {
            Label l2 = new Label("Winner 0 !!");
            l2.setForeground(Color.blue);
            l2.setSize(400, 50);
            l2.setLocation(200, 450);
            add(l2);
            for (Button btn : b11) {
                btn.setEnabled(false);
            }
        }
    }
}

class TIC_TAC_TOE {

    public static void main(String[] args) {
        int x, y, w = 500, h = 540;
        NewTest f = new NewTest();
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();
        x = (d.width - w) / 2;
        y = (d.height - h) / 2;
        Image i = t.getImage("11.jpg");
        f.setIconImage(i);
        f.setVisible(true);
        f.setBounds(x, y, w, h);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}