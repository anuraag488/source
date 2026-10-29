package p000;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class zk6 {

    /* JADX INFO: renamed from: a */
    public static final em3 f36163a;

    static {
        r12 r12Var = u12.f31590b;
        Object[] objArr = new Object[24];
        objArr[0] = "Version";
        objArr[1] = "GoogleConsent";
        objArr[2] = "VendorConsent";
        objArr[3] = "VendorLegitimateInterest";
        objArr[4] = "gdprApplies";
        objArr[5] = "EnableAdvertiserConsentMode";
        objArr[6] = "PolicyVersion";
        objArr[7] = "PurposeConsents";
        objArr[8] = "PurposeOneTreatment";
        objArr[9] = "Purpose1";
        objArr[10] = "Purpose3";
        objArr[11] = "Purpose4";
        System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
        se0.m10730k(24, objArr);
        f36163a = u12.m11199m(24, objArr);
    }

    /* JADX INFO: renamed from: a */
    public static String m13629a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m13630b(ze6 ze6Var, jm3 jm3Var, jm3 jm3Var2, z12 z12Var, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        xk6 xk6Var;
        char c;
        int iM13631c = m13631c(ze6Var);
        if (iM13631c > 0 && (i2 != 1 || i != 1)) {
            cArr[iM13631c] = '2';
        }
        if (m13635g(ze6Var, jm3Var2) == cf6.f15984b) {
            c = '3';
        } else {
            if (ze6Var == ze6.f36024b && i3 == 1 && z12Var.f35700e.equals(str)) {
                if (iM13631c > 0 && cArr[iM13631c] != '2') {
                    cArr[iM13631c] = '1';
                }
                return true;
            }
            if (jm3Var.containsKey(ze6Var) && (xk6Var = (xk6) jm3Var.get(ze6Var)) != null) {
                int iOrdinal = xk6Var.ordinal();
                cf6 cf6Var = cf6.f15986d;
                if (iOrdinal != 0) {
                    cf6 cf6Var2 = cf6.f15985c;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return m13635g(ze6Var, jm3Var2) == cf6Var ? m13634f(ze6Var, cArr, str3, z2) : m13633e(ze6Var, cArr, str2, z);
                        }
                        if (iOrdinal == 3) {
                            return m13635g(ze6Var, jm3Var2) == cf6Var2 ? m13633e(ze6Var, cArr, str2, z) : m13634f(ze6Var, cArr, str3, z2);
                        }
                        c = '0';
                    } else if (m13635g(ze6Var, jm3Var2) != cf6Var2) {
                        return m13634f(ze6Var, cArr, str3, z2);
                    }
                } else if (m13635g(ze6Var, jm3Var2) != cf6Var) {
                    return m13633e(ze6Var, cArr, str2, z);
                }
                c = '8';
            } else {
                c = '0';
            }
        }
        if (iM13631c <= 0 || cArr[iM13631c] == '2') {
            return false;
        }
        cArr[iM13631c] = c;
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static final int m13631c(ze6 ze6Var) {
        if (ze6Var == ze6.f36024b) {
            return 1;
        }
        if (ze6Var == ze6.f36026d) {
            return 2;
        }
        if (ze6Var == ze6.f36027e) {
            return 3;
        }
        return ze6Var == ze6.f36028f ? 4 : -1;
    }

    /* JADX INFO: renamed from: d */
    public static final String m13632d(ze6 ze6Var, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < ze6Var.mo4016f()) ? "0" : String.valueOf(str.charAt(ze6Var.mo4016f() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= ze6Var.mo4016f()) {
            strValueOf = String.valueOf(str2.charAt(ze6Var.mo4016f() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m13633e(ze6 ze6Var, char[] cArr, String str, boolean z) {
        char c;
        int iM13631c = m13631c(ze6Var);
        if (!z) {
            c = '4';
        } else {
            if (str.length() >= ze6Var.mo4016f()) {
                char cCharAt = str.charAt(ze6Var.mo4016f() - 1);
                boolean z2 = cCharAt == '1';
                if (iM13631c > 0 && cArr[iM13631c] != '2') {
                    cArr[iM13631c] = cCharAt != '1' ? '6' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iM13631c > 0 && cArr[iM13631c] != '2') {
            cArr[iM13631c] = c;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m13634f(ze6 ze6Var, char[] cArr, String str, boolean z) {
        char c;
        int iM13631c = m13631c(ze6Var);
        if (!z) {
            c = '5';
        } else {
            if (str.length() >= ze6Var.mo4016f()) {
                char cCharAt = str.charAt(ze6Var.mo4016f() - 1);
                boolean z2 = cCharAt == '1';
                if (iM13631c > 0 && cArr[iM13631c] != '2') {
                    cArr[iM13631c] = cCharAt != '1' ? '7' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iM13631c > 0 && cArr[iM13631c] != '2') {
            cArr[iM13631c] = c;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static final cf6 m13635g(ze6 ze6Var, jm3 jm3Var) {
        Object obj = jm3Var.get(ze6Var);
        if (obj == null) {
            obj = cf6.f15987e;
        }
        return (cf6) obj;
    }
}
