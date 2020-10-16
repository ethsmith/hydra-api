package org.dragonetmc.hydra.teleport;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.List;

public interface Teleport {

    String getId();

    void setId(String id);

    Location getLocation();

    void setLocation(Location location);

    void teleport(List<Player> players);
}
