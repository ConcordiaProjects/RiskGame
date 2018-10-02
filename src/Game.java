import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;


public class Game extends JFrame {

    public Game() {

        initUI();
    }

    private void initUI() {

        JButton quitButton = new JButton("Quit");

        quitButton.addActionListener((ActionEvent event) -> {
            System.exit(0);
        });

        createLayout(quitButton);

        setTitle("Quit button");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent... arg) {

        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(arg[0]));

        gl.setVerticalGroup(gl.createSequentialGroup().addComponent(arg[0]));
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Game risk = new Game();
            risk.setVisible(true);
        });
    }
}