/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Shawn
 */
public class StandardBullet extends Bullet {
    public StandardBullet(int positionX, int positionY, double damage, int speed, boolean isPlayerBullet) {
        super("Standard Bullet", positionX, positionY, damage, speed, isPlayerBullet);
    }
}