package com.ssmshop.pojo;

public class Plugin {
    private String code;

    private String name;

    private String version;

    private String author;

    private String desc;

    private Byte status;

    private String type;

    private String icon;

    private Byte scene;

    public Plugin(String code, String name, String version, String author, String desc, Byte status, String type, String icon, Byte scene) {
        this.code = code;
        this.name = name;
        this.version = version;
        this.author = author;
        this.desc = desc;
        this.status = status;
        this.type = type;
        this.icon = icon;
        this.scene = scene;
    }

    public Plugin() {
        super();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Byte getScene() {
        return scene;
    }

    public void setScene(Byte scene) {
        this.scene = scene;
    }
}