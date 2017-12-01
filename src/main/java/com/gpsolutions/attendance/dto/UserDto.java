package com.gpsolutions.attendance.dto;

public class UserDto {

    private String ldapId;
    private String username;

    public UserDto(String ldapId, String username) {
        this.ldapId = ldapId;
        this.username = username;
    }

    public String getLdapId() {
        return ldapId;
    }

    public void setLdapId(String ldapId) {
        this.ldapId = ldapId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
