/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Shawn
 */
public class HealthPotion extends Item implements Pickupable {
    private int healthBonus;

    public HealthPotion(int positionX, int positionY) {
        super(positionX, positionY, "Health Potion");
        this.healthBonus = healthBonus;
    }

    @Override
    public void pickup(Player player) {
        player.setHealth(player.getHealth() + healthBonus);
        System.out.println("Player picked up a health potion and gained " + healthBonus + " health.");
    }
}
