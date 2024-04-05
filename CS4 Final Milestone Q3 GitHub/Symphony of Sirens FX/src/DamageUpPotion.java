/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Shawn
 */
public class DamageUpPotion extends Item implements Pickupable {
    private double damageBonus;

    public DamageUpPotion(int positionX, int positionY) {
        super(positionX, positionY, "Damage Up Potion");
        this.damageBonus = damageBonus;
    }

    @Override
    public void pickup(Player player) {
        player.setDamage(player.getDamage() + damageBonus);
        System.out.println("Player picked up a damage up potion and gained " + damageBonus + " damage.");
    }
}
