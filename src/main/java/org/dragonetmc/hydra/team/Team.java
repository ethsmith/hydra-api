package org.dragonetmc.hydra.team;

import org.bukkit.entity.Player;

import java.util.Set;

public interface Team {

    String getName();

    void setName(String name);

    void join(Player player);

    void leave(Player player);

    void getPlayer(Player player);

    int getSize();

    Set<Player> getPlayers();
}
