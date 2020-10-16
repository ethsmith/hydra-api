package org.dragonetmc.hydra.teleport;

import org.bukkit.Location;

public interface Teleport {

    String getId();

    void setId(String id);

    Location getLocation();

    void setLocation(Location location);

    void teleport();
}
