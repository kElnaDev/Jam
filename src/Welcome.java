import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome extends JFrame {

    Jam jam;

    private JPanel panel;
    private JLabel welcomeLabel;
    private JButton startButton;

    public Welcome() {
        this.setPreferredSize(new Dimension(400, 200));
        this.setMaximumSize(new Dimension(1000, 800));
        this.setMinimumSize(new Dimension(300, 100));
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jam.start();
            }
        });
    }

}
