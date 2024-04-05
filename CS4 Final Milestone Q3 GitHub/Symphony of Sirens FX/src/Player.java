/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Shawn
 */
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Player extends Entity {
    private int experience;
    private int level;
    private int currency;

    public Player(String name, int positionX, int positionY, double health, double shield, double damage, int speed, int width, int height) {
        super(name, positionX, positionY, health, shield, damage, speed, width, height);
        this.experience = 0;
        this.level = 1;
        this.currency = 0;
    }

    public void control(int keyCode) {
        int deltaX = 0, deltaY = 0;
        // Handle movement
        switch (keyCode) {
            case KeyEvent.VK_UP:
            case KeyEvent.VK_W:
                deltaY = -speed;
                break;
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_S:
                deltaY = speed;
                break;
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_A:
                deltaX = -speed;
                break;
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_D:
                deltaX = speed;
                break;
        }
        move(deltaX, deltaY);
    }

    public void shoot() {
        // To be implemented
    }

    public void gainExperience(int exp) {
        experience += exp;
        // Check for level up
        if (experience >= expReqForNextLevel()) {
            levelUp();
        }
    }

    private int expReqForNextLevel() {
        return level * 100; 
    }

    private void levelUp() {
        // To be added
        level++;
    }

    public void collectItem(Item item) {
        // Apply item effects based on its type
        if (item instanceof Pickupable) {
            ((Pickupable) item).pickup(this);
        }
    }

    public void addCurrency(int amount) {
        currency += amount;
    }

    public void useCurrency(int amount) {
        currency -= amount;
        if (currency < 0) {
            currency = 0;
        }
    }
}
