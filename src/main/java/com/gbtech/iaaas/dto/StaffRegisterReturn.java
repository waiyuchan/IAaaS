package com.gbtech.iaaas.dto;

public class StaffRegisterReturn {

    private Integer id;
    private String username;
    private String name;
    private String engName;
    private String institution;

    public StaffRegisterReturn(Integer id, String username, String name, String engName,
            String institution) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.engName = engName;
        this.institution = institution;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }
}
