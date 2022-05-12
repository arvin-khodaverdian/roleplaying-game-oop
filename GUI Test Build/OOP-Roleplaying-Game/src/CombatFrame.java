import javax.swing.*;

public class CombatFrame extends JFrame {
    CombatFrame(){

        this.add(new CombatPanel());
        this.setTitle("Combat Frame");
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}