/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Shawn
 */
public class SpeedPotion extends Item implements Pickupable {
    private int speedBonus;

    public SpeedPotion(int positionX, int positionY) {
        super(positionX, positionY, "Speed Potion");
        this.speedBonus = speedBonus;
    }

    @Override
    public void pickup(Player player) {
        player.setSpeed(player.getSpeed() + speedBonus);
        System.out.println("Player picked up a speed potion and gained " + speedBonus + " speed.");
    }
}
