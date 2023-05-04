package me.scriptydude.explodingchicken.events

import org.bukkit.event.entity.*
import  org.bukkit.event.*

import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.Bukkit
import org.bukkit.entity.EntityType


class DeathEvent(val plugin: JavaPlugin) : Listener {
    init {
        Bukkit.getPluginManager().registerEvents(this, plugin)
    }

    @EventHandler
    fun OnChickenDeath(event: EntityDeathEvent){
        val  ent = event.entity
        if (ent.type == EntityType.CHICKEN){
            ent.location.world.createExplosion(ent.location, 2.5f, false)
        }
    }
}