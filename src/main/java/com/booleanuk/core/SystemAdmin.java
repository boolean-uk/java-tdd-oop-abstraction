package com.booleanuk.core;

public class SystemAdmin {
    System1 system1 = new System1();
    public boolean enableAccount(String email) {
        if(system1.getUsers().containsKey(email))
            if(!system1.getUsers().get(email).getIsEnabled()) {
                system1.getUsers().get(email).setIsEnabled(true);
                return true;
            }
        return false;
    }
}
