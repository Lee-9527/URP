package org.llw.po;

public class URP_User {
    private Integer UserId;
    private String UserName;
    private Integer UserTell;
    private String Password;
    private String Department;
    private String CreateTime;
    private Integer Type;

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public Integer getUserTell() {
        return UserTell;
    }

    public void setUserTell(Integer userTell) {
        UserTell = userTell;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer type) {
        Type = type;
    }

    @Override
    public String toString() {
        return "URP_User{" +
                "UserId=" + UserId +
                ", UserName='" + UserName + '\'' +
                ", UserTell=" + UserTell +
                ", Password='" + Password + '\'' +
                ", Department='" + Department + '\'' +
                ", CreateTime='" + CreateTime + '\'' +
                ", Type=" + Type +
                '}';
    }

}
