package p000;

import ads_mobile_sdk.C0033as;
import ads_mobile_sdk.j40;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gg5 extends zh0 {
    /* JADX INFO: renamed from: u */
    public static wa2 m6001u(String str, j40 j40Var) {
        wa2 wa2Var = new wa2();
        wa2Var.m12183w("bk", str);
        wa2Var.m12183w("sk", str);
        wa2Var.m12181u(Integer.valueOf(j40Var.f5546a), "type");
        return wa2Var;
    }

    /* JADX INFO: renamed from: v */
    public final String m6002v() {
        o92 o92Var = new o92();
        j40 j40Var = j40.f5542b;
        wa2 wa2Var = new wa2();
        wa2Var.m12183w("consent_key", "gad_has_consent_for_cookies");
        wa2Var.m12183w("consent_value_match", "0");
        wa2Var.m12181u(1, "consent_value_type");
        o92Var.m9006t(wa2Var);
        wa2 wa2Var2 = new wa2();
        wa2Var2.m12183w("consent_key", "IABTCF_gdprApplies");
        wa2Var2.m12183w("consent_value_match", "1");
        wa2Var2.m12181u(1, "consent_value_type");
        o92Var.m9006t(wa2Var2);
        return (String) m13553a("gads:full_consent_check_map", o92Var.toString(), C0033as.a$13);
    }

    /* JADX INFO: renamed from: x */
    public final String m6003x() {
        o92 o92Var = new o92();
        j40 j40Var = j40.f5542b;
        o92Var.m9006t(m6001u("IABTCF_AddtlConsent", j40Var));
        o92Var.m9006t(m6001u("IABConsent_CMPPresent", j40.f5544d));
        j40 j40Var2 = j40.f5543c;
        o92Var.m9006t(m6001u("IABTCF_CmpSdkID", j40Var2));
        o92Var.m9006t(m6001u("IABConsent_ConsentString", j40Var));
        o92Var.m9006t(m6001u("IABTCF_gdprApplies", j40Var2));
        o92Var.m9006t(m6001u("IABGPP_HDR_GppString", j40Var));
        o92Var.m9006t(m6001u("IABGPP_GppSID", j40Var));
        o92Var.m9006t(m6001u("gad_has_consent_for_cookies", j40Var2));
        o92Var.m9006t(m6001u("IABConsent_ParsedPurposeConsents", j40Var));
        o92Var.m9006t(m6001u("personalized_ad_status", j40Var));
        o92Var.m9006t(m6001u("IABTCF_PolicyVersion", j40Var2));
        o92Var.m9006t(m6001u("IABUSPrivacy_String", j40Var));
        o92Var.m9006t(m6001u("IABTCF_PurposeConsents", j40Var));
        o92Var.m9006t(m6001u("gad_rdp", j40Var2));
        o92Var.m9006t(m6001u("IABConsent_SubjectToGDPR", j40Var));
        o92Var.m9006t(m6001u("IABTCF_TCString", j40Var));
        o92Var.m9006t(m6001u("IABConsent_ParsedVendorConsents", j40Var));
        o92Var.m9006t(m6001u("UMP_eids", j40Var));
        return (String) m13553a("gads:sp:json_string", o92Var.toString(), C0033as.a$13);
    }
}
