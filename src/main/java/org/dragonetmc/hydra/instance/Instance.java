package org.dragonetmc.hydra.instance;

public interface Instance {

    String getId();

    void setId(String id);

    boolean isClone();

    String getSourceId();

    String setSourceId();

    void create();

    void destroy();

    String getInfo(String key);
}
