/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Shawn
 */
public class SymphonyOfSirens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scenario 1
        // Create a player and an enemy
        Player player = new Player("Player", 100, 100, 100, 50, 10, 5, 20, 20);
        Enemy enemy = new Enemy("Enemy", 200, 200, 100, 0, 10, 3, 20, 20);

        // Enemy shoots a bullet at the player
        Bullet enemyBullet = new Bullet("Enemy Bullet", enemy.getPositionX(), enemy.getPositionY(), 10, 5, false);
        // Assume bullet travels towards player's position
        // Check if player has a deflect power-up
        if (playerHasDeflectPowerUp()) {
            // Deflect the bullet
            deflectBullet(enemyBullet);
        } else {
            // Bullet hits the player
            player.takeDamage(enemyBullet.getDamage());
        }

        // Player shoots back at the enemy
        Bullet playerBullet = new Bullet("Player Bullet", player.getPositionX(), player.getPositionY(), 20, 7, true);
        enemy.takeDamage(playerBullet.getDamage());
        player.gainExperience(10);
        player.addCurrency(5);
        // Check if player can upgrade

        // Scenario 2
        // Item spawned in the stage area
        Item item1 = new SpeedPotion(150, 150); // Speed potion increases player speed
        StageArea stage = new StageArea(500, 500);
        stage.spawnItem(item1);

        // Despawned item
        Item despawnedItem = new HealthPotion(250, 250); // Health potion despawned before player could reach
        stage.despawnItem(despawnedItem);

        // Player collects another item
        Item collectedItem = new DamageUpPotion(200, 200); // Increase player damage
        player.collectItem(collectedItem);

        // Scenario 3
        // Bullet shot by an enemy hits player
        Bullet enemyBullet2 = new Bullet("Enemy Bullet 2", enemy.getPositionX(), enemy.getPositionY(), 15, 5, false);
        // Assume bullet hits player's shield
        player.takeDamage(enemyBullet2.getDamage()); // Player's shield blocks most damage

        // Bullet goes out of bounds
        Bullet outOfBoundsBullet = new Bullet("OutOfBoundsBullet", 600, 600, 10, 5, true);
        stage.checkCollisions(); // Bullet is despawned since it's out of bounds
    }

    // Utility methods
    private static boolean playerHasDeflectPowerUp() {
        // Logic to check if player has deflect power-up
        return true;
    }

    private static void deflectBullet(Bullet bullet) {
        // Logic to deflect the bullet
    }
}
