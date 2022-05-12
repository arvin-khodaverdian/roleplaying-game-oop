import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed May 11 09:13:36 AMT 2022
 */



/**
 * @author unknown
 */
public class CombatPanel extends JPanel {
    public CombatPanel() {
        initComponents();
    }

    private void initComponents() {
        label3 = new JLabel();
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        label4 = new JLabel();
        label2 = new JLabel();


        setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- label3 ----
        label3.setText("The Enemy");
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setBorder(LineBorder.createBlackLineBorder());
        add(label3, "cell 3 0 5 1");

        //---- label1 ----
        label1.setText("text");
        label1.setBorder(LineBorder.createBlackLineBorder());
        add(label1, "cell 2 2 7 2");

        //---- button1 ----
        button1.setText("Attack");
        add(button1, "cell 2 5");

        //---- button2 ----
        button2.setText("Rest");
        add(button2, "cell 8 5");

        //---- label4 ----
        label4.setText("You");
        label4.setHorizontalAlignment(SwingConstants.CENTER);
        label4.setBorder(LineBorder.createBlackLineBorder());
        add(label4, "cell 3 7 5 1");

        //---- label2 ----
        label2.setText("text");
        label2.setBorder(LineBorder.createBlackLineBorder());
        add(label2, "cell 2 8 7 2");
    }

    private JLabel label3;
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JLabel label4;
    private JLabel label2;
}
