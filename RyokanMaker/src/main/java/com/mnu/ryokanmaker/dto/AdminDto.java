package com.mnu.ryokanmaker.dto;

/**
 * ADMIN 테이블 매핑 DTO
 * PK : adminIdx
 */
public class AdminDto {

    private Integer adminIdx;
    private String adminId;
    private String adminPassword;
    private String adminName;
    private String adminMail;
    private String adminLoc;
    private String ryokanName;
    private Integer ryokanLevel;

    public AdminDto() {
    }

    public AdminDto(Integer adminIdx, String adminId, String adminPassword, String adminName,
                     String adminMail, String adminLoc, String ryokanName, Integer ryokanLevel) {
        this.adminIdx = adminIdx;
        this.adminId = adminId;
        this.adminPassword = adminPassword;
        this.adminName = adminName;
        this.adminMail = adminMail;
        this.adminLoc = adminLoc;
        this.ryokanName = ryokanName;
        this.ryokanLevel = ryokanLevel;
    }

    public Integer getAdminIdx() { return adminIdx; }
    public void setAdminIdx(Integer adminIdx) { this.adminIdx = adminIdx; }

    public String getAdminId() { return adminId; }
    public void setAdminId(String adminId) { this.adminId = adminId; }

    public String getAdminPassword() { return adminPassword; }
    public void setAdminPassword(String adminPassword) { this.adminPassword = adminPassword; }

    public String getAdminName() { return adminName; }
    public void setAdminName(String adminName) { this.adminName = adminName; }

    public String getAdminMail() { return adminMail; }
    public void setAdminMail(String adminMail) { this.adminMail = adminMail; }

    public String getAdminLoc() { return adminLoc; }
    public void setAdminLoc(String adminLoc) { this.adminLoc = adminLoc; }

    public String getRyokanName() { return ryokanName; }
    public void setRyokanName(String ryokanName) { this.ryokanName = ryokanName; }

    public Integer getRyokanLevel() { return ryokanLevel; }
    public void setRyokanLevel(Integer ryokanLevel) { this.ryokanLevel = ryokanLevel; }
}
