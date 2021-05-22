package ui;

import javax.swing.*;

public class FrameTeste extends JFrame {
    private JPanel rootPanel;
    private JButton novoContatoButton;
    private JButton removerContatoButton;
    private JTable table1;



    public FrameTeste() {

        frameInit();
        setContentPane(rootPanel);
        setSize(640, 480);
        setVisible(true);
    }
}
