package org.dragonetmc.hydra.obj;

public interface Objective {

    String getId();

    void setId(String id);

    boolean isComplete();

    void setComplete(boolean complete);

    void onComplete();

    void update(Object... update);
}
