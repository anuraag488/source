package p000;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class fv5 {

    /* JADX INFO: renamed from: a */
    public static final x12 f19342a = x12.m12458s("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* JADX INFO: renamed from: b */
    public static final em3 f19343b;

    /* JADX INFO: renamed from: c */
    public static final em3 f19344c;

    /* JADX INFO: renamed from: d */
    public static final em3 f19345d;

    /* JADX INFO: renamed from: e */
    public static final em3 f19346e;

    /* JADX INFO: renamed from: f */
    public static final em3 f19347f;

    static {
        r12 r12Var = u12.f31590b;
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        se0.m10730k(7, objArr);
        f19343b = u12.m11199m(7, objArr);
        Object[] objArr2 = {"auto", "app", "am"};
        se0.m10730k(3, objArr2);
        f19344c = u12.m11199m(3, objArr2);
        f19345d = u12.m11201s("_r", "_dbg");
        q12 q12Var = new q12();
        y70.m13035o(4, "initialCapacity");
        q12Var.f28139a = new Object[4];
        q12Var.f28140b = 0;
        q12Var.m9698a(gq6.f20049n);
        q12Var.m9698a(gq6.f20050o);
        q12Var.f28141c = true;
        f19346e = u12.m11199m(q12Var.f28140b, q12Var.f28139a);
        f19347f = u12.m11201s("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5821a(String str, Bundle bundle) {
        if (!f19343b.contains(str)) {
            if (bundle == null) {
                return true;
            }
            em3 em3Var = f19345d;
            int i = em3Var.f18261d;
            int i2 = 0;
            while (i2 < i) {
                boolean zContainsKey = bundle.containsKey((String) em3Var.get(i2));
                i2++;
                if (zContainsKey) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m5822b(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!f19344c.contains(str) && bundle != null) {
            em3 em3Var = f19345d;
            int i = em3Var.f18261d;
            int i2 = 0;
            while (i2 < i) {
                boolean zContainsKey = bundle.containsKey((String) em3Var.get(i2));
                i2++;
                if (zContainsKey) {
                }
            }
            int iHashCode = str.hashCode();
            if (iHashCode != 101200) {
                if (iHashCode != 101230) {
                    if (iHashCode == 3142703 && str.equals("fiam")) {
                        bundle.putString("_cis", "fiam_integration");
                        return true;
                    }
                } else if (str.equals("fdl")) {
                    bundle.putString("_cis", "fdl_integration");
                    return true;
                }
            } else if (str.equals("fcm")) {
                bundle.putString("_cis", "fcm_integration");
                return true;
            }
        }
        return false;
    }
}
