package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class op5 extends zh0 {

    /* JADX INFO: renamed from: f */
    public Boolean f26942f;

    /* JADX INFO: renamed from: g */
    public String f26943g;

    /* JADX INFO: renamed from: h */
    public kp5 f26944h;

    /* JADX INFO: renamed from: i */
    public Boolean f26945i;

    /* JADX INFO: renamed from: A */
    public final String m9221A(String str, d56 d56Var) {
        return TextUtils.isEmpty(str) ? (String) d56Var.m4379a(null) : (String) d56Var.m4379a(this.f26944h.mo7575a(str, d56Var.f16794a));
    }

    /* JADX INFO: renamed from: B */
    public final long m9222B(String str, d56 d56Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) d56Var.m4379a(null)).longValue();
        }
        String strMo7575a = this.f26944h.mo7575a(str, d56Var.f16794a);
        if (TextUtils.isEmpty(strMo7575a)) {
            return ((Long) d56Var.m4379a(null)).longValue();
        }
        try {
            return ((Long) d56Var.m4379a(Long.valueOf(Long.parseLong(strMo7575a)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) d56Var.m4379a(null)).longValue();
        }
    }

    /* JADX INFO: renamed from: C */
    public final int m9223C(String str, d56 d56Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) d56Var.m4379a(null)).intValue();
        }
        String strMo7575a = this.f26944h.mo7575a(str, d56Var.f16794a);
        if (TextUtils.isEmpty(strMo7575a)) {
            return ((Integer) d56Var.m4379a(null)).intValue();
        }
        try {
            return ((Integer) d56Var.m4379a(Integer.valueOf(Integer.parseInt(strMo7575a)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) d56Var.m4379a(null)).intValue();
        }
    }

    /* JADX INFO: renamed from: D */
    public final double m9224D(String str, d56 d56Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) d56Var.m4379a(null)).doubleValue();
        }
        String strMo7575a = this.f26944h.mo7575a(str, d56Var.f16794a);
        if (TextUtils.isEmpty(strMo7575a)) {
            return ((Double) d56Var.m4379a(null)).doubleValue();
        }
        try {
            return ((Double) d56Var.m4379a(Double.valueOf(Double.parseDouble(strMo7575a)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) d56Var.m4379a(null)).doubleValue();
        }
    }

    /* JADX INFO: renamed from: E */
    public final boolean m9225E(String str, d56 d56Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) d56Var.m4379a(null)).booleanValue();
        }
        String strMo7575a = this.f26944h.mo7575a(str, d56Var.f16794a);
        return TextUtils.isEmpty(strMo7575a) ? ((Boolean) d56Var.m4379a(null)).booleanValue() : ((Boolean) d56Var.m4379a(Boolean.valueOf("1".equals(strMo7575a)))).booleanValue();
    }

    /* JADX INFO: renamed from: F */
    public final Bundle m9226F() {
        oa6 oa6Var = (oa6) this.f36084a;
        try {
            Context context = oa6Var.f26509a;
            Context context2 = oa6Var.f26509a;
            d76 d76Var = oa6Var.f26514f;
            if (context.getPackageManager() == null) {
                oa6.m9016l(d76Var);
                d76Var.f16835j.m12504a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoM12997a = r35.m10189a(context2).m12997a(128, context2.getPackageName());
            if (applicationInfoM12997a != null) {
                return applicationInfoM12997a.metaData;
            }
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12504a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            d76 d76Var2 = oa6Var.f26514f;
            oa6.m9016l(d76Var2);
            d76Var2.f16835j.m12505b(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    /* JADX INFO: renamed from: G */
    public final Boolean m9227G(String str) {
        y42.m12851X(str);
        Bundle bundleM9226F = m9226F();
        if (bundleM9226F != null) {
            if (bundleM9226F.containsKey(str)) {
                return Boolean.valueOf(bundleM9226F.getBoolean(str));
            }
            return null;
        }
        d76 d76Var = ((oa6) this.f36084a).f26514f;
        oa6.m9016l(d76Var);
        d76Var.f16835j.m12504a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m9228H() {
        ((oa6) this.f36084a).getClass();
        Boolean boolM9227G = m9227G("firebase_analytics_collection_deactivated");
        return boolM9227G != null && boolM9227G.booleanValue();
    }

    /* JADX INFO: renamed from: I */
    public final boolean m9229I() {
        Boolean boolM9227G = m9227G("google_analytics_automatic_screen_reporting_enabled");
        return boolM9227G == null || boolM9227G.booleanValue();
    }

    /* JADX INFO: renamed from: J */
    public final rc6 m9230J(String str, boolean z) {
        Object obj;
        y42.m12851X(str);
        oa6 oa6Var = (oa6) this.f36084a;
        Bundle bundleM9226F = m9226F();
        if (bundleM9226F == null) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12504a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleM9226F.get(str);
        }
        rc6 rc6Var = rc6.UNINITIALIZED;
        if (obj == null) {
            return rc6Var;
        }
        if (Boolean.TRUE.equals(obj)) {
            return rc6.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return rc6.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return rc6.POLICY;
        }
        d76 d76Var2 = oa6Var.f26514f;
        oa6.m9016l(d76Var2);
        d76Var2.f16838m.m12505b(str, "Invalid manifest metadata for");
        return rc6Var;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m9231u(String str) {
        return "1".equals(this.f26944h.mo7575a(str, "gaia_collection_enabled"));
    }

    /* JADX INFO: renamed from: v */
    public final boolean m9232v(String str) {
        return "1".equals(this.f26944h.mo7575a(str, "measurement.event_sampling_enabled"));
    }

    /* JADX INFO: renamed from: x */
    public final boolean m9233x() {
        Boolean boolM9227G = this.f26942f;
        if (boolM9227G == null) {
            boolM9227G = m9227G("app_measurement_lite");
            this.f26942f = boolM9227G;
            if (boolM9227G == null) {
                boolM9227G = Boolean.FALSE;
                this.f26942f = boolM9227G;
            }
        }
        return boolM9227G.booleanValue() || !((oa6) this.f36084a).f26510b;
    }

    /* JADX INFO: renamed from: y */
    public final String m9234y(String str) {
        oa6 oa6Var = (oa6) this.f36084a;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            y42.m12854a0(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12505b(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            d76 d76Var2 = oa6Var.f26514f;
            oa6.m9016l(d76Var2);
            d76Var2.f16835j.m12505b(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            d76 d76Var3 = oa6Var.f26514f;
            oa6.m9016l(d76Var3);
            d76Var3.f16835j.m12505b(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            d76 d76Var4 = oa6Var.f26514f;
            oa6.m9016l(d76Var4);
            d76Var4.f16835j.m12505b(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m9235z() {
        ((oa6) this.f36084a).getClass();
    }
}
