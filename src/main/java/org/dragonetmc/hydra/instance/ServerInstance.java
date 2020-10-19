package org.dragonetmc.hydra.instance;

import com.google.gson.JsonElement;

public interface ServerInstance extends Instance {

    String getAddress();

    String getUrl();

    JsonElement getInfo(String key);
}
