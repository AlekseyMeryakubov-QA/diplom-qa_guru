package ru.open.config;

import org.aeonbits.owner.ConfigCache;
import org.aeonbits.owner.ConfigFactory;

public enum ConfigManager {
    Instance;

    public static final WebConfig webConfig =
            ConfigFactory.create(
                    WebConfig.class,
                    System.getProperties()
            );

    public WebConfig read() {
        return webConfig;
    }

    public static CredentialsConfig getAuthorization() {
        return ConfigCache.getOrCreate(CredentialsConfig.class);
    }
}