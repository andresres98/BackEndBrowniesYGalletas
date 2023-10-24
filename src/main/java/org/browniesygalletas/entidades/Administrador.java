package org.browniesygalletas.entidades;

import java.util.Objects;

public class Administrador extends ServiceUtill{
    private String adminUser;
    private String passwordAdminUser;

    public Administrador(String adminUser, String passwordAdminUser) {
        this.adminUser = adminUser;
        this.passwordAdminUser = passwordAdminUser;
    }

    public String getadminUser() {
        return adminUser;
    }

    public void setadminUser(String adminUser) {
        this.adminUser = adminUser;
    }

    public String getPasswordAdminUser() {
        return passwordAdminUser;
    }

    public void setPasswordAdminUser(String passwordAdminUser) {
        this.passwordAdminUser = passwordAdminUser;
    }

    public boolean logginAdmin(String adminUser, String passwordAdminUser ){
        if (adminUser.equals(this.adminUser) && passwordAdminUser.equals(this.passwordAdminUser)){
            System.out.println("El loggin ha sido exitoso");
            return true;
        }
        else {
            return false;
        }
    }


}
