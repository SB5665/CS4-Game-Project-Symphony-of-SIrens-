/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Shawn
 */
public class Entity {
    protected String name;
    protected int positionX;
    protected int positionY;
    protected double health;
    protected double shield;
    protected double damage;
    protected int speed;
    protected int width;
    protected int height;

    public Entity(String name, int positionX, int positionY, double health, double shield, double damage, int speed, int width, int height) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.health = health;
        this.shield = shield;
        this.damage = damage;
        this.speed = speed;
        this.width = width;
        this.height = height;
    }

    public void move(int deltaX, int deltaY) {
        positionX += deltaX;
        positionY += deltaY;
    }

    public void takeDamage(double damage) {
        double effectiveDamage = Math.max(0, damage - shield);
        health -= effectiveDamage;
        if (health < 0) {
            health = 0;
        }
    }

    // Getters and setters
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

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getShield() {
        return shield;
    }

    public void setShield(double shield) {
        this.shield = shield;
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

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
