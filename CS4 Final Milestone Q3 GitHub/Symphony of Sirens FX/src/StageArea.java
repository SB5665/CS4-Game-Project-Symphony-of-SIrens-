/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Shawn
 */
import java.util.ArrayList;
import java.util.List;

public class StageArea {
    private int stageWidth;
    private int stageHeight;
    private List<Enemy> stageEnemies;
    private List<Bullet> stageBullets;
    private List<Item> stageItems;
    private List<Obstacle> stageObstacles;

    public StageArea(int stageWidth, int stageHeight) {
        this.stageWidth = stageWidth;
        this.stageHeight = stageHeight;
        this.stageEnemies = new ArrayList<>();
        this.stageBullets = new ArrayList<>();
        this.stageItems = new ArrayList<>();
        this.stageObstacles = new ArrayList<>();
    }

    public void spawnEnemy(Enemy enemy) {
        stageEnemies.add(enemy);
    }

    public void spawnItem(Item item) {
        stageItems.add(item);
    }

    public void despawnItem(Item item) {
        stageItems.remove(item);
    }

    public void despawnBullet(Bullet bullet) {
        stageBullets.remove(bullet);
    }

    public void checkCollisions() {
        // Check bullet collisions with stage boundaries
        for (Bullet bullet : stageBullets) {
            if (isOutOfBounds(bullet.getPositionX(), bullet.getPositionY())) {
                despawnBullet(bullet);
            }
        }
        // Check player collisions with stage boundaries
        // To be implemented
    }

    private boolean isOutOfBounds(int x, int y) {
        return x < 0 || x >= stageWidth || y < 0 || y >= stageHeight;
    }

    public int getStageWidth() {
        return stageWidth;
    }

    public void setStageWidth(int stageWidth) {
        this.stageWidth = stageWidth;
    }

    public int getStageHeight() {
        return stageHeight;
    }

    public void setStageHeight(int stageHeight) {
        this.stageHeight = stageHeight;
    }

    public List<Enemy> getStageEnemies() {
        return stageEnemies;
    }

    public void setStageEnemies(List<Enemy> stageEnemies) {
        this.stageEnemies = stageEnemies;
    }

    public List<Bullet> getStageBullets() {
        return stageBullets;
    }

    public void setStageBullets(List<Bullet> stageBullets) {
        this.stageBullets = stageBullets;
    }

    public List<Item> getStageItems() {
        return stageItems;
    }

    public void setStageItems(List<Item> stageItems) {
        this.stageItems = stageItems;
    }

    public List<Obstacle> getStageObstacles() {
        return stageObstacles;
    }

    public void setStageObstacles(List<Obstacle> stageObstacles) {
        this.stageObstacles = stageObstacles;
    }
}
