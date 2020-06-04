package com.zhangjian.责任链模式;

/**
 * @author zhangjian
 * @date 2018/7/13
 */
public class Builder {
    public String name;

    public String reason;

    public int days;

    public String groupLeaderInfo;

    public String managerInfo;

    public String departmentHeaderInfo;

    public String customInfo;

    public Builder() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getGroupLeaderInfo() {
        return groupLeaderInfo;
    }

    public void setGroupLeaderInfo(String groupLeaderInfo) {
        this.groupLeaderInfo = groupLeaderInfo;
    }

    public String getManagerInfo() {
        return managerInfo;
    }

    public void setManagerInfo(String managerInfo) {
        this.managerInfo = managerInfo;
    }

    public String getDepartmentHeaderInfo() {
        return departmentHeaderInfo;
    }

    public void setDepartmentHeaderInfo(String departmentHeaderInfo) {
        this.departmentHeaderInfo = departmentHeaderInfo;
    }

    public String getCustomInfo() {
        return customInfo;
    }

    public void setCustomInfo(String customInfo) {
        this.customInfo = customInfo;
    }

    public Builder newRequest(Leave leave) {
        this.name = leave.getName();
        this.days = leave.getDays();
        this.reason = leave.getReason();
        if (leave.getGroupLeaderInfo() != null && !leave.getGroupLeaderInfo().equals("")) {
            this.groupLeaderInfo = leave.getGroupLeaderInfo();
        }

        if (leave.getManagerInfo() != null && !leave.getManagerInfo().equals("")) {
            this.managerInfo = leave.getManagerInfo();
        }

        if (leave.getDepartmentHeaderInfo() != null
                && !leave.getDepartmentHeaderInfo().equals("")) {
            this.departmentHeaderInfo = leave.getDepartmentHeaderInfo();
        }

        if (leave.getCustomInfo() != null && !leave.getCustomInfo().equals("")) {
            this.customInfo = leave.getCustomInfo();
        }
        return this;
    }

    public Leave build() {
        return new Leave(this);
    }
}
