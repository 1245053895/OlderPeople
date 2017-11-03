package com.xh.po;

import java.util.Date;

public class User {
    private Integer userid;

    private String username;

    private String userpwd;

    private String usersex;

    private String userrealname;

    private String userphone;

    private Date userbirthday;

    private String useraddress;

    private String useremail;

    private Integer creditscore;

    private Date userinputdate;

    private Integer userzip;

    private Integer userlogincount;

    private Date userlogintime;

    private String userA;

    private String userB;

    private String userC;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex == null ? null : usersex.trim();
    }

    public String getUserrealname() {
        return userrealname;
    }

    public void setUserrealname(String userrealname) {
        this.userrealname = userrealname == null ? null : userrealname.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public Date getUserbirthday() {
        return userbirthday;
    }

    public void setUserbirthday(Date userbirthday) {
        this.userbirthday = userbirthday;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress == null ? null : useraddress.trim();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    public Integer getCreditscore() {
        return creditscore;
    }

    public void setCreditscore(Integer creditscore) {
        this.creditscore = creditscore;
    }

    public Date getUserinputdate() {
        return userinputdate;
    }

    public void setUserinputdate(Date userinputdate) {
        this.userinputdate = userinputdate;
    }

    public Integer getUserzip() {
        return userzip;
    }

    public void setUserzip(Integer userzip) {
        this.userzip = userzip;
    }

    public Integer getUserlogincount() {
        return userlogincount;
    }

    public void setUserlogincount(Integer userlogincount) {
        this.userlogincount = userlogincount;
    }

    public Date getUserlogintime() {
        return userlogintime;
    }

    public void setUserlogintime(Date userlogintime) {
        this.userlogintime = userlogintime;
    }

    public String getUserA() {
        return userA;
    }

    public void setUserA(String userA) {
        this.userA = userA == null ? null : userA.trim();
    }

    public String getUserB() {
        return userB;
    }

    public void setUserB(String userB) {
        this.userB = userB == null ? null : userB.trim();
    }

    public String getUserC() {
        return userC;
    }

    public void setUserC(String userC) {
        this.userC = userC == null ? null : userC.trim();
    }
}