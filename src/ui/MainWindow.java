package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame {

    private static final long serialVersionUID = 1L;
    private int width, height;

    public MainWindow(String title, int width, int height) {
        super(title);
        this.width = width;
        this.height = height;

        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(this.width, this.height);
        setResizable(false);
        setLocationRelativeTo(null);
        add(new JLabel(new ImageIcon("src/resources/back.jpeg")));

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(newGame());
        menuBar.add(mapEditor());
        menuBar.add(exit());
        setJMenuBar(menuBar);
        // pack(); // ignore sizing
        setVisible(true);
    }

    private JMenu newGame() {
        JMenu newGame = new JMenu("New Game");
        JMenuItem player2 = new JMenuItem("2 Players");
        JMenuItem player3 = new JMenuItem("3 Players");
        JMenuItem player4 = new JMenuItem("4 Players");
        newGame.add(player2);
        newGame.add(player3);
        newGame.add(player4);

        player2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println ("ActionListener.actionPerformed : 2 players");
            }
        });
        player3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println ("ActionListener.actionPerformed : 3 players");
            }
        });
        player4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println ("ActionListener.actionPerformed : 4 players");
            }
        });
        return newGame;
    }
    private JMenu mapEditor() {
        JMenu mapEditor = new JMenu("Map Editor");
        JMenuItem editor = new JMenuItem("Open map editor");
        mapEditor.add(editor);

        editor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println ("ActionListener.actionPerformed : Open map editor");
            }
        });
        return mapEditor;
    }
    private JMenu exit() {
        JMenu exit = new JMenu("Exit");
        JMenuItem quit = new JMenuItem(new ExitAction());
        exit.add(quit);
        return exit;
    }
    class ExitAction extends AbstractAction {
        private static final long serialVersionUID = 1L;
        ExitAction() {
            putValue(NAME, "Quit");
        }
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}