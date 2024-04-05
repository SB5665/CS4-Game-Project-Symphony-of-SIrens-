/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Shawn
 */
public class HomingBullet extends Bullet {
    private Entity target;

    public HomingBullet(int positionX, int positionY, double damage, int speed, boolean isPlayerBullet, Entity target) {
        super("Homing Bullet", positionX, positionY, damage, speed, isPlayerBullet);
        this.target = target;
    }

    @Override
    public void move() {
        // Move the bullet towards the target entity
        if (target != null) {
            // Calculate direction towards the target
            int deltaX = target.positionX - positionX;
            int deltaY = target.positionY - positionY;
            // Normalize the direction vector
            double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
            double normalizedDeltaX = deltaX / distance;
            double normalizedDeltaY = deltaY / distance;
            // Move the bullet towards the target
            positionX += normalizedDeltaX * speed;
            positionY += normalizedDeltaY * speed;
        }
    }
}
