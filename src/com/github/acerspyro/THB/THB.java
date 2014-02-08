package com.github.acerspyro.THB;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.plugin.java.JavaPlugin;

public final class THB extends JavaPlugin {
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new PainListener(), this);
	}
	public void onDisable() {
		
	}
	
	public final class PainListener implements Listener {
    	@EventHandler
    	public void onPlayerHurt(EntityDamageEvent event) {
    		if (event.getEntityType() == EntityType.PLAYER | event.getEntityType() == EntityType.CHICKEN |
    				event.getEntityType() == EntityType.COW | event.getEntityType() == EntityType.HORSE |
    				event.getEntityType() == EntityType.OCELOT | event.getEntityType() == EntityType.PIG |
    				event.getEntityType() == EntityType.SHEEP | event.getEntityType() == EntityType.SPIDER |
    				event.getEntityType() == EntityType.SQUID | event.getEntityType() == EntityType.VILLAGER |
    				event.getEntityType() == EntityType.WITCH | event.getEntityType() == EntityType.WOLF |
    				event.getEntityType() == EntityType.ZOMBIE) {
    			
    			if (event.getCause() == DamageCause.BLOCK_EXPLOSION | event.getCause() == DamageCause.CONTACT |
    					event.getCause() == DamageCause.ENTITY_ATTACK | event.getCause() == DamageCause.ENTITY_EXPLOSION |
    					event.getCause() == DamageCause.FALL | event.getCause() == DamageCause.THORNS) {
    				event.getEntity().getWorld().playEffect(event.getEntity().getLocation().add(0, 0.5, 0), Effect.STEP_SOUND, Material.REDSTONE_BLOCK);
    			}
    			
    		}
    	}
    }
}
