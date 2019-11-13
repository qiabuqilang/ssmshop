package com.ssmshop.pojo;

public class AdminWithBLOBs extends Admin {
    private String navList;

    private String todolist;

    public AdminWithBLOBs(Short adminId, String userName, String email, String password, String ecSalt, Integer addTime, Integer lastLogin, String lastIp, String langType, Short agencyId, Short suppliersId, Short roleId, String navList, String todolist) {
        super(adminId, userName, email, password, ecSalt, addTime, lastLogin, lastIp, langType, agencyId, suppliersId, roleId);
        this.navList = navList;
        this.todolist = todolist;
    }

    public AdminWithBLOBs() {
        super();
    }

    public String getNavList() {
        return navList;
    }

    public void setNavList(String navList) {
        this.navList = navList == null ? null : navList.trim();
    }

    public String getTodolist() {
        return todolist;
    }

    public void setTodolist(String todolist) {
        this.todolist = todolist == null ? null : todolist.trim();
    }
}