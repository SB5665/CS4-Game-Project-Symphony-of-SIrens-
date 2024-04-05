/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Shawn
 */
public class Bullet {
    protected String name;
    protected int positionX;
    protected int positionY;
    protected double damage;
    protected int speed;
    protected boolean isPlayerBullet;

    public Bullet(String name, int positionX, int positionY, double damage, int speed, boolean isPlayerBullet) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.damage = damage;
        this.speed = speed;
        this.isPlayerBullet = isPlayerBullet;
    }

    public void move() {
        // Move the bullet in a straight path
        positionY -= speed;
    }

    public void hitEntity(Entity entity) {
        // Check if the bullet can harm the entity based on its type (player or not)
        if (isPlayerBullet != (entity instanceof Player)) {
            // If the bullet can harm the entity, apply damage
            entity.takeDamage(damage);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isPlayerBullet() {
        return isPlayerBullet;
    }

    public void setPlayerBullet(boolean playerBullet) {
        isPlayerBullet = playerBullet;
    }
}
