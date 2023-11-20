package ru.open.config;


import org.aeonbits.owner.Config;


@Config.Sources("classpath:${host}.properties")
public interface WebConfig extends Config{
    @Key("baseUrl")
    @DefaultValue("https://open-broker.ru/invest/")
    String getBaseUrl();
    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();
    @Key("browserVersion")
    @DefaultValue("100.0")
    String getBrowserVersion();
    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();
    @Key("isRemote")
    @DefaultValue("false")
    boolean isRemote();
    @Key("remoteUrl")
    String getRemoteUrl();
}
