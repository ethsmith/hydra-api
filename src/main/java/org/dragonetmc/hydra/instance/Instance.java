package org.dragonetmc.hydra.instance;

public interface Instance {

    String getId();

    void setId(String id);

    void create();

    void destroy();

    String getInfo(String key);
}
