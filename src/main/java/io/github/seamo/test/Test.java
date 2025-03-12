package io.github.seamo.test;

import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.projectiles.ProjectileSource;

import java.util.Random;

public final class Test extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }


    @EventHandler
    public void eggevent(PlayerEggThrowEvent event) {
        Player player = event.getPlayer();
        Location loc = event.getEgg().getLocation();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            double offsetX = (random.nextDouble() - 0.5) * 20; // Random offset between -1 and 1
            double offsetY = (random.nextDouble() - 0.5) * 20;
            double offsetZ = (random.nextDouble() - 0.5) * 20;
            Location spawnLocation = loc.clone().add(offsetX, offsetY, offsetZ);
            player.getWorld().spawn(spawnLocation, Chicken.class);
        }
    }

    @EventHandler
    public void onSnowballHit(ProjectileHitEvent event) {
        if (event.getEntity() instanceof Snowball) {
            Snowball snowball = (Snowball) event.getEntity();
            if (snowball.getShooter() instanceof Player) {
                Player player = (Player) snowball.getShooter();
                Location loc = snowball.getLocation();
                for (int i = 0; i < 1000; i++) {
                    double offsetX = (Math.random() - 0.5) * 20;
                    double offsetY = (Math.random() - 0.5) * 20;
                    double offsetZ = (Math.random() - 0.5) * 20;
                    Location spawnLocation = loc.clone().add(offsetX, offsetY, offsetZ);
                    Snowman snowman = player.getWorld().spawn(spawnLocation, Snowman.class);
                }
            }
        }
    }

    @EventHandler
    public void onWindChargeHit(ProjectileHitEvent seamo) {
        if (seamo.getEntity() instanceof WindCharge) {
            WindCharge windCharge = (WindCharge) seamo.getEntity();
            if (windCharge.getShooter() instanceof Player) {
                Player player = (Player) windCharge.getShooter();
                Location loc = windCharge.getLocation();
                for (int i = 0; i < 1000; i++) {
                    double offsetX = (Math.random() - 0.5) * 20;
                    double offsetY = (Math.random() - 0.5) * 20;
                    double offsetZ = (Math.random() - 0.5) * 20;
                    Location spawnLocation = loc.clone().add(offsetX, offsetY, offsetZ);
                    Breeze breeze = player.getWorld().spawn(spawnLocation, Breeze.class);

                }
            }
        }
    }
    @EventHandler
    public void onArrowHit(ProjectileHitEvent event) {
        if (event.getEntity() instanceof Arrow) {
            Arrow arrow = (Arrow) event.getEntity();
            if (arrow.getShooter() instanceof Player) {
                Player player = (Player) arrow.getShooter();
                Location loc = arrow.getLocation();
                for (int i = 0; i < 1000; i++) {
                    double offsetX = (Math.random() - 0.5) * 20;
                    double offsetY = (Math.random() - 0.5) * 20;
                    double offsetZ = (Math.random() - 0.5) * 20;
                    Location spawnLocation = loc.clone().add(offsetX, offsetY, offsetZ);
                    Skeleton skeleton = player.getWorld().spawn(spawnLocation, Skeleton.class);
                }
            }
        }
    }
    @EventHandler
    public void onEnderPearlhit(ProjectileHitEvent event) {
        if (event.getEntity() instanceof EnderPearl) {
            EnderPearl enderPearl = (EnderPearl) event.getEntity();
            if (enderPearl.getShooter() instanceof Player) {
                Player player = (Player) enderPearl.getShooter();
                Location loc = enderPearl.getLocation();
                for (int i = 0; i < 1000; i++) {
                    double offsetX = (Math.random() - 0.5) * 20;
                    double offsetY = (Math.random() - 0.5) * 20;
                    double offsetZ = (Math.random() - 0.5) * 20;
                    Location spawnLocation = loc.clone().add(offsetX, offsetY, offsetZ);
                    Enderman enderman = player.getWorld().spawn(spawnLocation, Enderman.class);
                }
            }
        }
    }
    @EventHandler
    public void onFireworkhit(ProjectileHitEvent event) {
        if (event.getEntity() instanceof Firework) {
            Firework firework = (Firework) event.getEntity();
            if (firework.getShooter() instanceof Player) {
                Player player = (Player) firework.getShooter();
                Location loc = firework.getLocation();
                for (int i = 0; i < 100; i++) {
                    double offsetX = (Math.random() - 0.5) * 20;
                    double offsetY = (Math.random() - 0.5) * 20;
                    double offsetZ = (Math.random() - 0.5) * 20;
                    Location spawnLocation = loc.clone().add(offsetX, offsetY, offsetZ);
                    Creeper creeper = player.getWorld().spawn(spawnLocation, Creeper.class);
                }
            }
        }
    }
}