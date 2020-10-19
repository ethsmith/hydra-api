package org.dragonetmc.hydra.instance;

public interface Instance {

    String getId();

    void setId(String id);

    boolean isClone();

    String getSourceId();

    void setSourceId(String source);

    Instance getSource();

    void setSource(Instance source);

    void create();

    void destroy();
}
