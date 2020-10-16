package org.dragonetmc.hydra.instance;

import org.bukkit.Location;
import org.bukkit.World;

public interface WorldInstance extends Instance {

    World getWorld();

    Location getSpawn();

    void setSpawn(Location location);
}
