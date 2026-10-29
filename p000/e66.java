package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.ext.SdkExtensions;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e66 extends q56 {

    /* JADX INFO: renamed from: L */
    public String f17846L;

    /* JADX INFO: renamed from: M */
    public String f17847M;

    /* JADX INFO: renamed from: N */
    public long f17848N;

    /* JADX INFO: renamed from: O */
    public String f17849O;

    /* JADX INFO: renamed from: g */
    public String f17850g;

    /* JADX INFO: renamed from: h */
    public String f17851h;

    /* JADX INFO: renamed from: i */
    public int f17852i;

    /* JADX INFO: renamed from: j */
    public String f17853j;

    /* JADX INFO: renamed from: k */
    public String f17854k;

    /* JADX INFO: renamed from: l */
    public long f17855l;

    /* JADX INFO: renamed from: m */
    public long f17856m;

    /* JADX INFO: renamed from: n */
    public long f17857n;

    /* JADX INFO: renamed from: o */
    public List f17858o;

    /* JADX INFO: renamed from: p */
    public String f17859p;

    /* JADX INFO: renamed from: q */
    public int f17860q;

    /* JADX INFO: renamed from: A */
    public final String m4936A() {
        m9741u();
        y42.m12854a0(this.f17850g);
        return this.f17850g;
    }

    /* JADX INFO: renamed from: B */
    public final String m4937B() {
        mo5038t();
        m9741u();
        y42.m12854a0(this.f17846L);
        return this.f17846L;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x026b A[Catch: NameNotFoundException -> 0x0273, TRY_LEAVE, TryCatch #6 {NameNotFoundException -> 0x0273, blocks: (B:99:0x0265, B:101:0x026b), top: B:134:0x0265 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x026e A[PHI: r3 r38
  0x026e: PHI (r3v15 int) = (r3v14 int), (r3v16 int) binds: [B:105:0x0273, B:100:0x0269] A[DONT_GENERATE, DONT_INLINE]
  0x026e: PHI (r38v2 boolean) = (r38v1 boolean), (r38v4 boolean) binds: [B:105:0x0273, B:100:0x0269] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:111:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:112:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:115:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:121:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x025c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0108  */
    /* JADX WARN: Code duplicated, block: B:37:0x010d  */
    /* JADX WARN: Code duplicated, block: B:39:0x011d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0134  */
    /* JADX WARN: Code duplicated, block: B:44:0x0138  */
    /* JADX WARN: Code duplicated, block: B:57:0x018a  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:79:0x0209  */
    /* JADX WARN: Code duplicated, block: B:88:0x022e  */
    /* JADX WARN: Code duplicated, block: B:92:0x023b  */
    /* JADX WARN: Code duplicated, block: B:93:0x023d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0256  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: y */
    public final cp6 m4938y(String str) {
        String str2;
        long j;
        boolean z;
        long j2;
        boolean zM9018a;
        boolean z2;
        String str3;
        Class<?> clsLoadClass;
        Object objInvoke;
        long jM8623a;
        long jMin;
        Boolean boolM9227G;
        boolean z3;
        boolean z4;
        String strM4610m0;
        String str4;
        Boolean boolM9227G2;
        boolean zBooleanValue;
        oa6 oa6Var;
        String strM4936A;
        boolean z5;
        int i;
        int i2;
        long j3;
        ApplicationInfo applicationInfoM12997a;
        d56 d56Var;
        int extensionVersion;
        mo5038t();
        String strM4936A2 = m4936A();
        String strM4937B = m4937B();
        m9741u();
        String str5 = this.f17851h;
        m9741u();
        long j4 = this.f17852i;
        m9741u();
        y42.m12854a0(this.f17853j);
        String str6 = this.f17853j;
        oa6 oa6Var2 = (oa6) this.f36084a;
        op5 op5Var = oa6Var2.f26512d;
        d76 d76Var = oa6Var2.f26514f;
        op5 op5Var2 = oa6Var2.f26512d;
        Context context = oa6Var2.f26509a;
        dn6 dn6Var = oa6Var2.f26517i;
        s86 s86Var = oa6Var2.f26513e;
        op5Var.m9235z();
        m9741u();
        mo5038t();
        long j5 = this.f17855l;
        long jM4594P = 0;
        if (j5 == 0) {
            oa6.m9014j(dn6Var);
            oa6 oa6Var3 = (oa6) dn6Var.f36084a;
            String packageName = context.getPackageName();
            dn6Var.mo5038t();
            y42.m12851X(packageName);
            PackageManager packageManager = context.getPackageManager();
            z = false;
            MessageDigest messageDigestM4565L = dn6.m4565L();
            long jM4566M = -1;
            if (messageDigestM4565L == null) {
                d76 d76Var2 = oa6Var3.f26514f;
                oa6.m9016l(d76Var2);
                d76Var2.f16835j.m12504a("Could not get MD5 instance");
                str2 = str5;
                j = j4;
            } else {
                if (packageManager != null) {
                    try {
                        if (dn6Var.m4599X(context, packageName)) {
                            str2 = str5;
                            j = j4;
                            jM4566M = 0;
                        } else {
                            str2 = str5;
                            try {
                                j = j4;
                                try {
                                    Signature[] signatureArr = r35.m10189a(context).m12998b(64, oa6Var3.f26509a.getPackageName()).signatures;
                                    if (signatureArr == null || signatureArr.length <= 0) {
                                        d76 d76Var3 = oa6Var3.f26514f;
                                        oa6.m9016l(d76Var3);
                                        d76Var3.f16838m.m12504a("Could not get signatures");
                                    } else {
                                        jM4566M = dn6.m4566M(messageDigestM4565L.digest(signatureArr[0].toByteArray()));
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    e = e;
                                    d76 d76Var4 = oa6Var3.f26514f;
                                    oa6.m9016l(d76Var4);
                                    d76Var4.f16835j.m12505b(e, "Package name not found");
                                    j2 = 0;
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                e = e2;
                                j = j4;
                                d76 d76Var5 = oa6Var3.f26514f;
                                oa6.m9016l(d76Var5);
                                d76Var5.f16835j.m12505b(e, "Package name not found");
                                j2 = 0;
                                this.f17855l = j2;
                                zM9018a = oa6Var2.m9018a();
                                oa6.m9014j(s86Var);
                                boolean z6 = !s86Var.f29977P;
                                mo5038t();
                                if (oa6Var2.m9018a()) {
                                    if (op5Var2.m9225E(null, e56.f17732H0)) {
                                        oa6.m9016l(d76Var);
                                        d76Var.f16831L.m12504a("Disabled IID for tests.");
                                        z2 = zM9018a;
                                        str3 = null;
                                    } else {
                                        try {
                                            clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                                            if (clsLoadClass == null) {
                                                z2 = zM9018a;
                                            } else {
                                                z2 = zM9018a;
                                                try {
                                                    Object[] objArr = {context};
                                                    str3 = null;
                                                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, objArr);
                                                    if (objInvoke != null) {
                                                        try {
                                                            str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                                        } catch (Exception unused) {
                                                            oa6.m9016l(d76Var);
                                                            d76Var.f16840o.m12504a("Failed to retrieve Firebase Instance Id");
                                                            str3 = null;
                                                        }
                                                    }
                                                } catch (Exception unused2) {
                                                    oa6.m9016l(d76Var);
                                                    d76Var.f16839n.m12504a("Failed to obtain Firebase Analytics instance");
                                                }
                                            }
                                        } catch (ClassNotFoundException unused3) {
                                        }
                                        str3 = null;
                                    }
                                } else {
                                    z2 = zM9018a;
                                    str3 = null;
                                }
                                oa6.m9014j(s86Var);
                                jM8623a = s86Var.f29988j.m8623a();
                                long j6 = j2;
                                jMin = oa6Var2.f26508D;
                                if (jM8623a != 0) {
                                    jMin = Math.min(jMin, jM8623a);
                                }
                                m9741u();
                                int i3 = this.f17860q;
                                boolM9227G = op5Var2.m9227G("google_analytics_adid_collection_enabled");
                                if (boolM9227G != null) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                oa6.m9014j(s86Var);
                                s86Var.mo5038t();
                                long j7 = jMin;
                                boolean z7 = s86Var.m10560y().getBoolean("deferred_analytics_collection", z);
                                if (op5Var2.m9230J("google_analytics_default_allow_ad_personalization_signals", true) != rc6.GRANTED) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                long j8 = this.f17856m;
                                Boolean boolValueOf = Boolean.valueOf(z4);
                                List list = this.f17858o;
                                String strM12659g = s86Var.m10556B().m12659g();
                                strM4610m0 = this.f17859p;
                                if (strM4610m0 == null) {
                                    oa6.m9014j(dn6Var);
                                    strM4610m0 = dn6Var.m4610m0();
                                    this.f17859p = strM4610m0;
                                }
                                String str7 = strM4610m0;
                                if (s86Var.m10556B().m12660i(vc6.ANALYTICS_STORAGE)) {
                                    mo5038t();
                                    if (this.f17848N != 0) {
                                        oa6Var2.f26519k.getClass();
                                        long jCurrentTimeMillis = System.currentTimeMillis() - this.f17848N;
                                        if (this.f17847M != null) {
                                            m4939z();
                                        }
                                    }
                                    if (this.f17847M == null) {
                                        m4939z();
                                    }
                                    str4 = this.f17847M;
                                } else {
                                    str4 = null;
                                }
                                boolM9227G2 = op5Var2.m9227G("google_analytics_sgtm_upload_enabled");
                                if (boolM9227G2 == null) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = boolM9227G2.booleanValue();
                                }
                                oa6.m9014j(dn6Var);
                                oa6Var = (oa6) dn6Var.f36084a;
                                strM4936A = m4936A();
                                String str8 = str4;
                                if (oa6Var.f26509a.getPackageManager() == null) {
                                    z5 = zBooleanValue;
                                    j3 = 0;
                                } else {
                                    try {
                                        z5 = zBooleanValue;
                                        i = 0;
                                        try {
                                            applicationInfoM12997a = r35.m10189a(oa6Var.f26509a).m12997a(0, strM4936A);
                                            if (applicationInfoM12997a != null) {
                                                i2 = applicationInfoM12997a.targetSdkVersion;
                                            } else {
                                                i2 = i;
                                            }
                                        } catch (PackageManager.NameNotFoundException unused4) {
                                            d76 d76Var6 = oa6Var.f26514f;
                                            oa6.m9016l(d76Var6);
                                            d76Var6.f16841p.m12505b(strM4936A, "PackageManager failed to find running app: app_id");
                                        }
                                    } catch (PackageManager.NameNotFoundException unused5) {
                                        z5 = zBooleanValue;
                                        i = 0;
                                    }
                                    j3 = i2;
                                }
                                oa6.m9014j(s86Var);
                                int i4 = s86Var.m10556B().f34161b;
                                oa6.m9014j(s86Var);
                                s86Var.mo5038t();
                                long j9 = j3;
                                String str9 = mr5.m8386b(s86Var.m10560y().getString("dma_consent_settings", null)).f25172b;
                                ho6.m6466a();
                                d56Var = e56.f17750Q0;
                                if (op5Var2.m9225E(null, d56Var)) {
                                    oa6.m9014j(dn6Var);
                                    if (SdkExtensions.getExtensionVersion(30) > 3) {
                                        extensionVersion = SdkExtensions.getExtensionVersion(1000000);
                                    } else {
                                        extensionVersion = 0;
                                    }
                                } else {
                                    extensionVersion = 0;
                                }
                                ho6.m6466a();
                                if (op5Var2.m9225E(null, d56Var)) {
                                    oa6.m9014j(dn6Var);
                                    jM4594P = dn6Var.m4594P();
                                }
                                String str10 = op5Var2.f26943g;
                                String strValueOf = String.valueOf(xc6.m12656h(op5Var2.m9230J("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j10 = oa6Var2.f26508D;
                                oa6.m9013i(oa6Var2.f26529u);
                                return new cp6(strM4936A2, strM4937B, str2, j, str6, 130000L, j6, str, z2, z6, str3, j7, i3, z3, z7, boolValueOf, j8, list, strM12659g, str7, str8, z5, j9, i4, str9, extensionVersion, jM4594P, str10, strValueOf, j10, sk5.m10841g(oa6Var2.f26529u.m13552z()));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        e = e3;
                        str2 = str5;
                    }
                } else {
                    str2 = str5;
                    j = j4;
                }
                j2 = 0;
                this.f17855l = j2;
            }
            j2 = jM4566M;
            this.f17855l = j2;
        } else {
            str2 = str5;
            j = j4;
            z = false;
            j2 = j5;
        }
        zM9018a = oa6Var2.m9018a();
        oa6.m9014j(s86Var);
        boolean z8 = !s86Var.f29977P;
        mo5038t();
        if (oa6Var2.m9018a()) {
            z2 = zM9018a;
            str3 = null;
        } else {
            if (op5Var2.m9225E(null, e56.f17732H0)) {
                oa6.m9016l(d76Var);
                d76Var.f16831L.m12504a("Disabled IID for tests.");
                z2 = zM9018a;
                str3 = null;
            } else {
                clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (clsLoadClass == null) {
                    z2 = zM9018a;
                } else {
                    z2 = zM9018a;
                    Object[] objArr2 = {context};
                    str3 = null;
                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, objArr2);
                    if (objInvoke != null) {
                        str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                    }
                }
                str3 = null;
            }
        }
        oa6.m9014j(s86Var);
        jM8623a = s86Var.f29988j.m8623a();
        long j11 = j2;
        jMin = oa6Var2.f26508D;
        if (jM8623a != 0) {
            jMin = Math.min(jMin, jM8623a);
        }
        m9741u();
        int i5 = this.f17860q;
        boolM9227G = op5Var2.m9227G("google_analytics_adid_collection_enabled");
        if (boolM9227G != null || boolM9227G.booleanValue()) {
            z3 = true;
        } else {
            z3 = z;
        }
        oa6.m9014j(s86Var);
        s86Var.mo5038t();
        long j12 = jMin;
        boolean z9 = s86Var.m10560y().getBoolean("deferred_analytics_collection", z);
        if (op5Var2.m9230J("google_analytics_default_allow_ad_personalization_signals", true) != rc6.GRANTED) {
            z4 = true;
        } else {
            z4 = false;
        }
        long j13 = this.f17856m;
        Boolean boolValueOf2 = Boolean.valueOf(z4);
        List list2 = this.f17858o;
        String strM12659g2 = s86Var.m10556B().m12659g();
        strM4610m0 = this.f17859p;
        if (strM4610m0 == null) {
            oa6.m9014j(dn6Var);
            strM4610m0 = dn6Var.m4610m0();
            this.f17859p = strM4610m0;
        }
        String str11 = strM4610m0;
        if (s86Var.m10556B().m12660i(vc6.ANALYTICS_STORAGE)) {
            str4 = null;
        } else {
            mo5038t();
            if (this.f17848N != 0) {
                oa6Var2.f26519k.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f17848N;
                if (this.f17847M != null && jCurrentTimeMillis2 > 86400000 && this.f17849O == null) {
                    m4939z();
                }
            }
            if (this.f17847M == null) {
                m4939z();
            }
            str4 = this.f17847M;
        }
        boolM9227G2 = op5Var2.m9227G("google_analytics_sgtm_upload_enabled");
        if (boolM9227G2 == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = boolM9227G2.booleanValue();
        }
        oa6.m9014j(dn6Var);
        oa6Var = (oa6) dn6Var.f36084a;
        strM4936A = m4936A();
        String str12 = str4;
        if (oa6Var.f26509a.getPackageManager() == null) {
            z5 = zBooleanValue;
            j3 = 0;
        } else {
            z5 = zBooleanValue;
            i = 0;
            applicationInfoM12997a = r35.m10189a(oa6Var.f26509a).m12997a(0, strM4936A);
            if (applicationInfoM12997a != null) {
                i2 = applicationInfoM12997a.targetSdkVersion;
            } else {
                i2 = i;
            }
            j3 = i2;
        }
        oa6.m9014j(s86Var);
        int i6 = s86Var.m10556B().f34161b;
        oa6.m9014j(s86Var);
        s86Var.mo5038t();
        long j14 = j3;
        String str13 = mr5.m8386b(s86Var.m10560y().getString("dma_consent_settings", null)).f25172b;
        ho6.m6466a();
        d56Var = e56.f17750Q0;
        if (op5Var2.m9225E(null, d56Var)) {
            oa6.m9014j(dn6Var);
            if (SdkExtensions.getExtensionVersion(30) > 3) {
                extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            } else {
                extensionVersion = 0;
            }
        } else {
            extensionVersion = 0;
        }
        ho6.m6466a();
        if (op5Var2.m9225E(null, d56Var)) {
            oa6.m9014j(dn6Var);
            jM4594P = dn6Var.m4594P();
        }
        String str14 = op5Var2.f26943g;
        String strValueOf2 = String.valueOf(xc6.m12656h(op5Var2.m9230J("google_analytics_default_allow_ad_personalization_signals", true)));
        long j15 = oa6Var2.f26508D;
        oa6.m9013i(oa6Var2.f26529u);
        return new cp6(strM4936A2, strM4937B, str2, j, str6, 130000L, j11, str, z2, z8, str3, j12, i5, z3, z9, boolValueOf2, j13, list2, strM12659g2, str11, str12, z5, j14, i6, str13, extensionVersion, jM4594P, str14, strValueOf2, j15, sk5.m10841g(oa6Var2.f26529u.m13552z()));
    }

    /* JADX INFO: renamed from: z */
    public final void m4939z() {
        String str;
        mo5038t();
        oa6 oa6Var = (oa6) this.f36084a;
        s86 s86Var = oa6Var.f26513e;
        d76 d76Var = oa6Var.f26514f;
        oa6.m9014j(s86Var);
        if (s86Var.m10556B().m12660i(vc6.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            dn6 dn6Var = oa6Var.f26517i;
            oa6.m9014j(dn6Var);
            dn6Var.m4614s0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            oa6.m9016l(d76Var);
            d76Var.f16842q.m12504a("Analytics Storage consent is not granted");
            str = null;
        }
        oa6.m9016l(d76Var);
        d76Var.f16842q.m12504a("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.f17847M = str;
        oa6Var.f26519k.getClass();
        this.f17848N = System.currentTimeMillis();
    }
}
