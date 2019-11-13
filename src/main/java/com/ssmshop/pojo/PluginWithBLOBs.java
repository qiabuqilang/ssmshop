package com.ssmshop.pojo;

public class PluginWithBLOBs extends Plugin {
    private String config;

    private String configValue;

    private String bankCode;

    public PluginWithBLOBs(String code, String name, String version, String author, String desc, Boolean status, String type, String icon, Boolean scene, String config, String configValue, String bankCode) {
        super(code, name, version, author, desc, status, type, icon, scene);
        this.config = config;
        this.configValue = configValue;
        this.bankCode = bankCode;
    }

    public PluginWithBLOBs() {
        super();
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config == null ? null : config.trim();
    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue == null ? null : configValue.trim();
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }
}