package com.ssmshop.pojo;

public class PromOrder {
    private Long id;

    private String name;

    private Integer type;

    private Float money;

    private String expression;

    private Integer startTime;

    private Integer endTime;

    private Byte isClose;

    private String group;

    private String description;

    public PromOrder(Long id, String name, Integer type, Float money, String expression, Integer startTime, Integer endTime, Byte isClose, String group, String description) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.money = money;
        this.expression = expression;
        this.startTime = startTime;
        this.endTime = endTime;
        this.isClose = isClose;
        this.group = group;
        this.description = description;
    }

    public PromOrder() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression == null ? null : expression.trim();
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Byte getIsClose() {
        return isClose;
    }

    public void setIsClose(Byte isClose) {
        this.isClose = isClose;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group == null ? null : group.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}