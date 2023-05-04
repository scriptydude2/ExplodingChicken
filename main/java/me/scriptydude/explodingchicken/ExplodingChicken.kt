package me.scriptydude.explodingchicken

import me.scriptydude.explodingchicken.events.DeathEvent
import org.bukkit.plugin.java.JavaPlugin

class ExplodingChicken : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        DeathEvent(this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
