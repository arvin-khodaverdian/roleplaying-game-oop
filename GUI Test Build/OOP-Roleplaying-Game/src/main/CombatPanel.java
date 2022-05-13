package main;

import javax.swing.*;

import attack.Attack;
import character.Enemy;
import net.miginfocom.swing.*;
import character.Player;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class CombatPanel extends JPanel implements ActionListener {
    public CombatPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        JLabel label1 = new JLabel();
        JLabel label4 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JButton button4 = new JButton();
        JButton button5 = new JButton();

        Player a = new Player(100, 100,100 );
        Enemy b = new Enemy(100, 100, 100);
        //======== this ========
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
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("Cement Vagho");
        add(label1, "cell 5 0");

        //---- label4 ----
        label4.setText("Health:"+a.getHealth()+"/100     "+"Stamina:"+a.getStamina()+"/100");
        add(label4, "cell 1 2 9 2");

        //---- label2 ----
        label2.setText("Enemy");
        add(label2, "cell 5 4");

        //---- label3 ----
        label3.setText("Health:"+b.getHealth()+"/100     "+"Stamina:"+b.getStamina()+"/100");
        add(label3, "cell 1 6 9 2");

        //---- button1 ----

        ArrayList<Attack> attacksArr = a.getAttacks();

        button1.setText(attacksArr.get(0).getName());
        add(button1, "cell 1 9");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                attacksArr.get(0).attackEnemy(a, b);
                System.out.println(attacksArr.get(0).getName()+" was used!");
                a.setStamina(a.getStamina()-20);
                attacksArr.remove(0);
                attacksArr.add(a.setAttack());
                button1.setText(attacksArr.get(0).getName());
                label3.setText("Health:"+b.getHealth()+"/100     "+"Stamina:"+b.getStamina()+"/100");
                label4.setText("Health:"+a.getHealth()+"/100     "+"Stamina:"+a.getStamina()+"/100");
                healthCheck(a.getHealth());
                healthCheck(b.getHealth());
                if(a.getHealth()<50){
                    a.setHealth(a.getHealth()-5);
                }
                else{
                    a.setHealth(a.getHealth()-10);
                }
            }
        });

        //---- button2 ----
        button2.setText(attacksArr.get(1).getName());
        add(button2, "cell 3 9");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                attacksArr.get(1).attackEnemy(a, b);
                System.out.println(attacksArr.get(1).getName()+" was used!");
                a.setStamina(a.getStamina()-20);
                attacksArr.remove(1);
                attacksArr.add(a.setAttack());
                button2.setText(attacksArr.get(1).getName());
                label3.setText("Health:"+b.getHealth()+"/100     "+"Stamina:"+b.getStamina()+"/100");
                label4.setText("Health:"+a.getHealth()+"/100     "+"Stamina:"+a.getStamina()+"/100");
                healthCheck(a.getHealth());
                healthCheck(b.getHealth());
                if(a.getHealth()<50){
                    a.setHealth(a.getHealth()-5);
                }
                else{
                    a.setHealth(a.getHealth()-10);
                }
            }
        });

        //---- button3 ----
        button3.setText(attacksArr.get(2).getName());
        add(button3, "cell 5 9");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                attacksArr.get(2).attackEnemy(a, b);
                System.out.println(attacksArr.get(2).getName()+" was used!");
                a.setStamina(a.getStamina()-20);
                attacksArr.remove(2);
                attacksArr.add(a.setAttack());
                button3.setText(attacksArr.get(2).getName());
                label3.setText("Health:"+b.getHealth()+"/100     "+"Stamina:"+b.getStamina()+"/100");
                label4.setText("Health:"+a.getHealth()+"/100     "+"Stamina:"+a.getStamina()+"/100");
                healthCheck(a.getHealth());
                healthCheck(b.getHealth());
                if(a.getHealth()<50){
                    a.setHealth(a.getHealth()-5);
                }
                else{
                    a.setHealth(a.getHealth()-10);
                }

            }
        });

        //---- button4 ----
        button4.setText(attacksArr.get(3).getName());
        add(button4, "cell 7 9");
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                attacksArr.get(3).attackEnemy(a, b);
                System.out.println(attacksArr.get(3).getName()+" was used!");
                a.setStamina(a.getStamina()-20);
                attacksArr.remove(3);
                attacksArr.add(a.setAttack());
                button4.setText(attacksArr.get(3).getName());
                label3.setText("Health:"+b.getHealth()+"/100     "+"Stamina:"+b.getStamina()+"/100");
                label4.setText("Health:"+a.getHealth()+"/100     "+"Stamina:"+a.getStamina()+"/100");
                healthCheck(a.getHealth());
                healthCheck(b.getHealth());
                if(a.getHealth()<50){
                    a.setHealth(a.getHealth()-5);
                }
                else{
                    a.setHealth(a.getHealth()-10);
                }
            }
        });

        //---- button5 ----
        button5.setText("Rest");
        add(button5, "cell 9 9");

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                attacksArr.get(4).attackEnemy(a, b);
                System.out.println("I have healed!");
                a.setStamina(a.getStamina()+30);
                label3.setText("Health:"+b.getHealth()+"/100     "+"Stamina:"+b.getStamina()+"/100");
                label4.setText("Health:"+a.getHealth()+"/100     "+"Stamina:"+a.getStamina()+"/100");
                healthCheck(b.getHealth());
                if(a.getHealth()<50){
                    a.setHealth(a.getHealth()-5);
                }
                else{
                    a.setHealth(a.getHealth()-10);
                }
            }
        });
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables


    public void healthCheck(int s){
        if(s<=0){
            System.exit(0);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }


    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
