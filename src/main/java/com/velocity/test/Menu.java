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

    public String getVas_id() {
        return vas_id;
    }

    public String getVas_itm_id() {
        return vas_itm_id;
    }

    public String getCall_typ_cd() {
        return call_typ_cd;
    }

    public String getCall_url() {
        return call_url;
    }

    public String getDist_to_dt() {
        return dist_to_dt;
    }

    public String getLim_lvl_vn() {
        return lim_lvl_vn;
    }

    public String getGnb_typ_cd() {
        return gnb_typ_cd;
    }

    public String getMenu_id() {
        return menu_id;
    }

    public String getMenu_nm() {
        return menu_nm;
    }

    public String getScn_mthd_cd() {
        return scn_mthd_cd;
    }

    public String getDist_fr_dt() {
        return dist_fr_dt;
    }

    public String getMenu_exps_prop_cd() {
        return menu_exps_prop_cd;
    }

    public String getSvc_prop_cd() {
        return svc_prop_cd;
    }

    public String getVas_svc_id() {
        return vas_svc_id;
    }
}
