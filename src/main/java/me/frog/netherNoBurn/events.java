package me.frog.netherNoBurn;

import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBurnEvent;

public class events implements Listener {

    @EventHandler
    public void onBurn(BlockBurnEvent event){
        Block block = event.getBlock();

        World world = event.getBlock().getWorld();
        // Only in the Nether
        if (world.getEnvironment() != World.Environment.NETHER) return;

        Material type = block.getType();

        if (
                Tag.LOGS.isTagged(type) ||
                        Tag.PLANKS.isTagged(type) ||
                        Tag.WOODEN_SLABS.isTagged(type) ||
                        Tag.WOODEN_STAIRS.isTagged(type) ||
                        Tag.WOODEN_FENCES.isTagged(type) ||
                        Tag.WOODEN_DOORS.isTagged(type) ||
                        Tag.WOODEN_TRAPDOORS.isTagged(type) ||
                        Tag.WOODEN_PRESSURE_PLATES.isTagged(type) ||
                        Tag.WOODEN_BUTTONS.isTagged(type)
        ) {
            event.setCancelled(true);
        }
    }
}