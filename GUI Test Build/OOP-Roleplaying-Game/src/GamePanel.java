import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JFrame;

public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 500;
    static final int SCREEN_HEIGHT = 500;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
    static final int DELAY = 75;
    int x = 0;
    int y = 0;
    char direction = 'N';
    boolean running = false;
    Timer timer;
    Random random;

    int encounterY, encounterX;

    GamePanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.green);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }

    public void startGame() {
        generateEncounter();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(running){
            move();
            collisionCheck();
            try {
                checkEncounter();
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
        repaint();
    }



    public void move(){
        switch(direction){
            case 'U':
                y = y - UNIT_SIZE;
                break;
            case 'D':
                y = y + UNIT_SIZE;
                break;
            case 'L':
                x = x - UNIT_SIZE;
                break;
            case 'R':
                x = x + UNIT_SIZE;
                break;
            case 'N':
                break;
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        // for drawing the grid.
        // we probably won't need this in the final revision of the code, but it's good to have it for now.
        if (running) {
            for (int i = 0; i < SCREEN_HEIGHT / UNIT_SIZE; i++) {
                g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
                g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE);
            }
        }
        g.setColor(Color.blue);
        g.fillOval(encounterX, encounterY, UNIT_SIZE, UNIT_SIZE);

        //this sets te color for the placeholder player, since we don't have a sprite yet
        g.setColor(Color.red);
        g.fillOval(x, y, UNIT_SIZE, UNIT_SIZE);
    }

    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            switch(e.getKeyCode()){
                case KeyEvent.VK_A:
                    direction = 'L';
                    break;
                case KeyEvent.VK_D:
                    direction = 'R';
                    break;
                case KeyEvent.VK_W:
                    direction = 'U';
                    break;
                case KeyEvent.VK_S:
                    direction = 'D';
                    break;
            }
        }
        public void keyReleased(KeyEvent e){
            switch(e.getKeyCode()){
                case KeyEvent.VK_A:
                case KeyEvent.VK_D:
                case KeyEvent.VK_W:
                case KeyEvent.VK_S:
                    direction = 'N';
                    break;
            }
        }
    }

    public void generateEncounter(){
        encounterX = random.nextInt(SCREEN_WIDTH/UNIT_SIZE)*UNIT_SIZE;
        encounterY = random.nextInt(SCREEN_HEIGHT/UNIT_SIZE)*UNIT_SIZE;
    }

    public void checkEncounter() throws InterruptedException {
        if ((x == encounterX) && (y == encounterY)) {
            new CombatFrame();
            boolean combatRunning = true;
            direction = 'N';
            generateEncounter();
            }
        }
    public void collisionCheck(){
        // checks if touches left border.
        if(x<0){
            x=0;
        }
        // checks if touches right border.
        if(x > SCREEN_WIDTH-UNIT_SIZE){
            x=SCREEN_WIDTH-UNIT_SIZE;
        }
        // checks if touches top border.
        if(y<0){
            y=0;
        }
        // checks if touches bottom border.
        if(y > SCREEN_HEIGHT-UNIT_SIZE){
            y=SCREEN_HEIGHT-UNIT_SIZE;
        }
    }
}