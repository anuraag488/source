package p000;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wk6 {

    /* JADX INFO: renamed from: a */
    public final HashMap f33455a;

    public wk6(Map map) {
        HashMap map2 = new HashMap();
        this.f33455a = map2;
        map2.putAll(map);
    }

    /* JADX INFO: renamed from: a */
    public final String m12319a() {
        StringBuilder sb = new StringBuilder();
        em3 em3Var = zk6.f36163a;
        int i = em3Var.f18261d;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) em3Var.get(i2);
            HashMap map = this.f33455a;
            if (map.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) map.get(str));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m12320b() {
        d56 d56Var = e56.f17768Z0;
        boolean zBooleanValue = ((Boolean) d56Var.m4379a(null)).booleanValue();
        HashMap map = this.f33455a;
        if (!zBooleanValue ? !(!"1".equals(map.get("GoogleConsent")) || !"1".equals(map.get("gdprApplies")) || !"1".equals(map.get("EnableAdvertiserConsentMode"))) : !(!"1".equals(map.get("gdprApplies")) || !"1".equals(map.get("EnableAdvertiserConsentMode")))) {
            if (!((Boolean) d56Var.m4379a(null)).booleanValue()) {
                return m12322d();
            }
            if (map.get("Version") == null) {
                return m12322d();
            }
            if (m12323e() >= 0) {
                Bundle bundle = new Bundle();
                bundle.putString("ad_storage", true != Objects.equals(map.get("AuthorizePurpose1"), "1") ? "denied" : "granted");
                bundle.putString("ad_personalization", (Objects.equals(map.get("AuthorizePurpose3"), "1") && Objects.equals(map.get("AuthorizePurpose4"), "1")) ? "granted" : "denied");
                if (m12323e() >= 4) {
                    bundle.putString("ad_user_data", (Objects.equals(map.get("AuthorizePurpose1"), "1") && Objects.equals(map.get("AuthorizePurpose7"), "1")) ? "granted" : "denied");
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    /* JADX INFO: renamed from: c */
    public final String m12321c() {
        HashMap map = this.f33455a;
        StringBuilder sb = new StringBuilder("1");
        int i = -1;
        try {
            String str = (String) map.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i < 0 || i > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i >> 6));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i & 63));
        }
        int iM12323e = m12323e();
        if (iM12323e < 0 || iM12323e > 63) {
            sb.append("0");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iM12323e));
        }
        int i2 = true != "1".equals(map.get("gdprApplies")) ? 0 : 2;
        int i3 = i2 | 4;
        if ("1".equals(map.get("EnableAdvertiserConsentMode"))) {
            i3 = i2 | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i3));
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public final Bundle m12322d() {
        int iM12323e;
        HashMap map = this.f33455a;
        if ("1".equals(map.get("GoogleConsent")) && (iM12323e = m12323e()) >= 0) {
            String str = (String) map.get("PurposeConsents");
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                String str2 = "denied";
                if (str.length() > 0) {
                    bundle.putString("ad_storage", str.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str.length() > 3) {
                    bundle.putString("ad_personalization", (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str.length() > 6 && iM12323e >= 4) {
                    if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                        str2 = "granted";
                    }
                    bundle.putString("ad_user_data", str2);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    /* JADX INFO: renamed from: e */
    public final int m12323e() {
        try {
            String str = (String) this.f33455a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wk6) {
            return m12319a().equalsIgnoreCase(((wk6) obj).m12319a());
        }
        return false;
    }

    public final int hashCode() {
        return m12319a().hashCode();
    }

    public final String toString() {
        return m12319a();
    }
}
