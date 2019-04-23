package com.velocity.test;

import java.io.Serializable;

public class Menu implements Serializable {
    private String menu_id;
    private String menu_nm;
    private String scn_mthd_cd;
    private String dist_fr_dt;
    private String menu_exps_prop_cd;
    private String svc_prop_cd;
    private String vas_svc_id;
    private String vas_id;
    private String vas_itm_id;
    private String call_typ_cd;
    private String call_url;
    private String dist_to_dt;
    private String lim_lvl_vn;
    private String gnb_typ_cd;

    public String getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(String menu_id) {
        this.menu_id = menu_id;
    }

    public String getMenu_nm() {
        return menu_nm;
    }

    public void setMenu_nm(String menu_nm) {
        this.menu_nm = menu_nm;
    }

    public String getScn_mthd_cd() {
        return scn_mthd_cd;
    }

    public void setScn_mthd_cd(String scn_mthd_cd) {
        this.scn_mthd_cd = scn_mthd_cd;
    }

    public String getDist_fr_dt() {
        return dist_fr_dt;
    }

    public void setDist_fr_dt(String dist_fr_dt) {
        this.dist_fr_dt = dist_fr_dt;
    }

    public String getMenu_exps_prop_cd() {
        return menu_exps_prop_cd;
    }

    public void setMenu_exps_prop_cd(String menu_exps_prop_cd) {
        this.menu_exps_prop_cd = menu_exps_prop_cd;
    }

    public String getSvc_prop_cd() {
        return svc_prop_cd;
    }

    public void setSvc_prop_cd(String svc_prop_cd) {
        this.svc_prop_cd = svc_prop_cd;
    }

    public String getVas_svc_id() {
        return vas_svc_id;
    }

    public void setVas_svc_id(String vas_svc_id) {
        this.vas_svc_id = vas_svc_id;
    }

    public String getVas_id() {
        return vas_id;
    }

    public void setVas_id(String vas_id) {
        this.vas_id = vas_id;
    }

    public String getVas_itm_id() {
        return vas_itm_id;
    }

    public void setVas_itm_id(String vas_itm_id) {
        this.vas_itm_id = vas_itm_id;
    }

    public String getCall_typ_cd() {
        return call_typ_cd;
    }

    public void setCall_typ_cd(String call_typ_cd) {
        this.call_typ_cd = call_typ_cd;
    }

    public String getCall_url() {
        return call_url;
    }

    public void setCall_url(String call_url) {
        this.call_url = call_url;
    }

    public String getDist_to_dt() {
        return dist_to_dt;
    }

    public void setDist_to_dt(String dist_to_dt) {
        this.dist_to_dt = dist_to_dt;
    }

    public String getLim_lvl_vn() {
        return lim_lvl_vn;
    }

    public void setLim_lvl_vn(String lim_lvl_vn) {
        this.lim_lvl_vn = lim_lvl_vn;
    }

    public String getGnb_typ_cd() {
        return gnb_typ_cd;
    }

    public void setGnb_typ_cd(String gnb_typ_cd) {
        this.gnb_typ_cd = gnb_typ_cd;
    }
}
