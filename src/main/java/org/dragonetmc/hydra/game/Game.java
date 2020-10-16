package org.dragonetmc.hydra.game;

import org.bukkit.entity.Player;
import org.dragonetmc.hydra.instance.Instance;
import org.dragonetmc.hydra.obj.Objective;
import org.dragonetmc.hydra.team.Team;

import java.util.Set;

public interface Game {

    Instance getInstanceType();

    void setInstanceType(Instance type);

    void init();

    void start();

    void finish();

    void join(Player player);

    void leave(Player player);

    void cancel();

    String getId();

    Set<Team> getTeams();

    Set<Objective> getObjectives();
}
