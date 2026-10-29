package p000;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mg6 extends q56 {

    /* JADX INFO: renamed from: L */
    public boolean f24888L;

    /* JADX INFO: renamed from: M */
    public xc6 f24889M;

    /* JADX INFO: renamed from: N */
    public AtomicLong f24890N;

    /* JADX INFO: renamed from: O */
    public long f24891O;

    /* JADX INFO: renamed from: P */
    public y86 f24892P;

    /* JADX INFO: renamed from: Q */
    public boolean f24893Q;

    /* JADX INFO: renamed from: R */
    public nd6 f24894R;

    /* JADX INFO: renamed from: S */
    public fg6 f24895S;

    /* JADX INFO: renamed from: T */
    public nd6 f24896T;

    /* JADX INFO: renamed from: U */
    public rr5 f24897U;

    /* JADX INFO: renamed from: g */
    public zs5 f24898g;

    /* JADX INFO: renamed from: h */
    public dd6 f24899h;

    /* JADX INFO: renamed from: i */
    public CopyOnWriteArraySet f24900i;

    /* JADX INFO: renamed from: j */
    public boolean f24901j;

    /* JADX INFO: renamed from: k */
    public AtomicReference f24902k;

    /* JADX INFO: renamed from: l */
    public Object f24903l;

    /* JADX INFO: renamed from: m */
    public boolean f24904m;

    /* JADX INFO: renamed from: n */
    public int f24905n;

    /* JADX INFO: renamed from: o */
    public nd6 f24906o;

    /* JADX INFO: renamed from: p */
    public nd6 f24907p;

    /* JADX INFO: renamed from: q */
    public PriorityQueue f24908q;

    /* JADX INFO: renamed from: A */
    public final void m8300A() {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        wk6 wk6Var;
        wk6 wk6Var2;
        mg6 mg6Var;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C0795je c0795je;
        ru4 it;
        cf6 cf6Var;
        jm3 jm3VarM7078c;
        mo5038t();
        oa6 oa6Var = (oa6) this.f36084a;
        d76 d76Var = oa6Var.f26514f;
        ia5 ia5Var = oa6Var.f26519k;
        oa6.m9016l(d76Var);
        d76Var.f16842q.m12504a("Handle tcf update.");
        s86 s86Var = oa6Var.f26513e;
        oa6.m9014j(s86Var);
        SharedPreferences sharedPreferencesM10561z = s86Var.m10561z();
        HashMap map = new HashMap();
        d56 d56Var = e56.f17768Z0;
        int i10 = 2;
        int i11 = 1;
        if (((Boolean) d56Var.m4379a(null)).booleanValue()) {
            em3 em3Var = zk6.f36163a;
            ze6 ze6Var = ze6.f36024b;
            xk6 xk6Var = xk6.f34370a;
            Map.Entry entry = Map.entry(ze6Var, xk6Var);
            ze6 ze6Var2 = ze6.f36025c;
            xk6 xk6Var2 = xk6.f34371b;
            Map.Entry entry2 = Map.entry(ze6Var2, xk6Var2);
            ze6 ze6Var3 = ze6.f36026d;
            Map.Entry entry3 = Map.entry(ze6Var3, xk6Var);
            ze6 ze6Var4 = ze6.f36027e;
            Map.Entry entry4 = Map.entry(ze6Var4, xk6Var);
            ze6 ze6Var5 = ze6.f36028f;
            List listAsList = Arrays.asList(entry, entry2, entry3, entry4, Map.entry(ze6Var5, xk6Var2), Map.entry(ze6.f36029g, xk6Var2), Map.entry(ze6.f36030h, xk6Var2));
            C0795je c0795je2 = new C0795je(listAsList instanceof Collection ? listAsList.size() : 4);
            c0795je2.m7083h(listAsList);
            jm3 jm3VarM7078c2 = c0795je2.m7078c();
            int i12 = x12.f33911c;
            z12 z12Var = new z12("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesM10561z.contains("IABTCF_TCString");
            try {
                i5 = sharedPreferencesM10561z.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused) {
                i5 = -1;
            }
            try {
                try {
                    try {
                        try {
                            i6 = sharedPreferencesM10561z.getInt("IABTCF_PolicyVersion", -1);
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                cf6Var = cf6.f15987e;
                                if (!zHasNext) {
                                    break;
                                }
                                ze6 ze6Var6 = (ze6) it.next();
                                int iMo4016f = ze6Var6.mo4016f();
                                ru4 ru4Var = it;
                                jm3 jm3Var = jm3VarM7078c2;
                                StringBuilder sb = new StringBuilder(String.valueOf(iMo4016f).length() + 28);
                                sb.append("IABTCF_PublisherRestrictions");
                                sb.append(iMo4016f);
                                String strM13629a = zk6.m13629a(sharedPreferencesM10561z, sb.toString());
                                if (!TextUtils.isEmpty(strM13629a) && strM13629a.length() >= 755) {
                                    int iDigit = Character.digit(strM13629a.charAt(754), 10);
                                    cf6 cf6Var2 = cf6.f15984b;
                                    if (iDigit < 0 || iDigit > cf6.values().length || iDigit == 0) {
                                        cf6Var = cf6Var2;
                                    } else if (iDigit == i11) {
                                        cf6Var = cf6.f15985c;
                                    } else if (iDigit == i10) {
                                        cf6Var = cf6.f15986d;
                                    }
                                }
                                c0795je.m7082g(ze6Var6, cf6Var);
                                it = ru4Var;
                                jm3VarM7078c2 = jm3Var;
                                i10 = 2;
                                i11 = 1;
                            }
                        } catch (ClassCastException unused2) {
                            i6 = -1;
                        }
                        i8 = sharedPreferencesM10561z.getInt("IABTCF_PurposeOneTreatment", -1);
                    } catch (ClassCastException unused3) {
                        i8 = -1;
                    }
                    i7 = sharedPreferencesM10561z.getInt("IABTCF_gdprApplies", -1);
                } catch (ClassCastException unused4) {
                    i7 = -1;
                }
                i9 = sharedPreferencesM10561z.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused5) {
                i9 = -1;
            }
            int i13 = i6;
            String strM13629a2 = zk6.m13629a(sharedPreferencesM10561z, "IABTCF_PublisherCC");
            int i14 = i5;
            c0795je = new C0795je(4);
            hm3 hm3Var = (hm3) jm3VarM7078c2.f22429f;
            if (hm3Var == null) {
                hm3 hm3Var2 = new hm3(jm3VarM7078c2, new im3(jm3VarM7078c2.f22426c, 0, jm3VarM7078c2.f22427d));
                jm3VarM7078c2.f22429f = hm3Var2;
                hm3Var = hm3Var2;
            }
            it = hm3Var.iterator();
            jm3 jm3Var2 = jm3VarM7078c2;
            jm3 jm3VarM7078c3 = c0795je.m7078c();
            String strM13629a3 = zk6.m13629a(sharedPreferencesM10561z, "IABTCF_PurposeConsents");
            String strM13629a4 = zk6.m13629a(sharedPreferencesM10561z, "IABTCF_VendorConsents");
            boolean z = !TextUtils.isEmpty(strM13629a4) && strM13629a4.length() >= 755 && strM13629a4.charAt(754) == '1';
            String strM13629a5 = zk6.m13629a(sharedPreferencesM10561z, "IABTCF_PurposeLegitimateInterests");
            String strM13629a6 = zk6.m13629a(sharedPreferencesM10561z, "IABTCF_VendorLegitimateInterests");
            boolean z2 = !TextUtils.isEmpty(strM13629a6) && strM13629a6.length() >= 755 && strM13629a6.charAt(754) == '1';
            cArr[0] = '2';
            if (!((Boolean) e56.f17771a1.m4379a(null)).booleanValue() || zContains) {
                cf6 cf6Var3 = (cf6) jm3VarM7078c3.get(ze6Var);
                cf6 cf6Var4 = (cf6) jm3VarM7078c3.get(ze6Var3);
                cf6 cf6Var5 = (cf6) jm3VarM7078c3.get(ze6Var4);
                cf6 cf6Var6 = (cf6) jm3VarM7078c3.get(ze6Var5);
                C0795je c0795je3 = new C0795je(4);
                c0795je3.m7082g("Version", "2");
                boolean z3 = z;
                c0795je3.m7082g("VendorConsent", true != z ? "0" : "1");
                boolean z4 = z2;
                c0795je3.m7082g("VendorLegitimateInterest", true != z2 ? "0" : "1");
                c0795je3.m7082g("gdprApplies", i7 != 1 ? "0" : "1");
                int i15 = i9;
                c0795je3.m7082g("EnableAdvertiserConsentMode", i15 != 1 ? "0" : "1");
                c0795je3.m7082g("PolicyVersion", String.valueOf(i13));
                c0795je3.m7082g("CmpSdkID", String.valueOf(i14));
                int i16 = i8;
                c0795je3.m7082g("PurposeOneTreatment", i16 != 1 ? "0" : "1");
                c0795je3.m7082g("PublisherCC", strM13629a2);
                c0795je3.m7082g("PublisherRestrictions1", String.valueOf(cf6Var3 != null ? cf6Var3.mo4016f() : cf6Var.mo4016f()));
                c0795je3.m7082g("PublisherRestrictions3", String.valueOf(cf6Var4 != null ? cf6Var4.mo4016f() : cf6Var.mo4016f()));
                c0795je3.m7082g("PublisherRestrictions4", String.valueOf(cf6Var5 != null ? cf6Var5.mo4016f() : cf6Var.mo4016f()));
                c0795je3.m7082g("PublisherRestrictions7", String.valueOf(cf6Var6 != null ? cf6Var6.mo4016f() : cf6Var.mo4016f()));
                c0795je3.m7083h(jm3.m7185a(4, new Object[]{"Purpose1", zk6.m13632d(ze6Var, strM13629a3, strM13629a5), "Purpose3", zk6.m13632d(ze6Var3, strM13629a3, strM13629a5), "Purpose4", zk6.m13632d(ze6Var4, strM13629a3, strM13629a5), "Purpose7", zk6.m13632d(ze6Var5, strM13629a3, strM13629a5)}, null).m7187b());
                int i17 = i7;
                c0795je3.m7083h(jm3.m7185a(5, new Object[]{"AuthorizePurpose1", true != zk6.m13630b(ze6Var, jm3Var2, jm3VarM7078c3, z12Var, cArr, i15, i17, i16, strM13629a2, strM13629a3, strM13629a5, z3, z4) ? "0" : "1", "AuthorizePurpose3", true != zk6.m13630b(ze6Var3, jm3Var2, jm3VarM7078c3, z12Var, cArr, i15, i17, i16, strM13629a2, strM13629a3, strM13629a5, z3, z4) ? "0" : "1", "AuthorizePurpose4", true != zk6.m13630b(ze6Var4, jm3Var2, jm3VarM7078c3, z12Var, cArr, i15, i17, i16, strM13629a2, strM13629a3, strM13629a5, z3, z4) ? "0" : "1", "AuthorizePurpose7", true != zk6.m13630b(ze6Var5, jm3Var2, jm3VarM7078c3, z12Var, cArr, i15, i17, i16, strM13629a2, strM13629a3, strM13629a5, z3, z4) ? "0" : "1", "PurposeDiagnostics", new String(cArr)}, null).m7187b());
                jm3VarM7078c = c0795je3.m7078c();
            } else {
                jm3VarM7078c = jm3.f22422h;
            }
            wk6Var = new wk6(jm3VarM7078c);
            str = "";
        } else {
            String strM13629a7 = zk6.m13629a(sharedPreferencesM10561z, "IABTCF_VendorConsents");
            str = "";
            if (!str.equals(strM13629a7) && strM13629a7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strM13629a7.charAt(754)));
            }
            try {
                i = sharedPreferencesM10561z.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused6) {
                i = -1;
            }
            if (i != -1) {
                map.put("gdprApplies", String.valueOf(i));
            }
            try {
                i2 = sharedPreferencesM10561z.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused7) {
                i2 = -1;
            }
            if (i2 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(i2));
            }
            try {
                i3 = sharedPreferencesM10561z.getInt("IABTCF_PolicyVersion", -1);
            } catch (ClassCastException unused8) {
                i3 = -1;
            }
            if (i3 != -1) {
                map.put("PolicyVersion", String.valueOf(i3));
            }
            String strM13629a8 = zk6.m13629a(sharedPreferencesM10561z, "IABTCF_PurposeConsents");
            if (!str.equals(strM13629a8)) {
                map.put("PurposeConsents", strM13629a8);
            }
            try {
                i4 = sharedPreferencesM10561z.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused9) {
                i4 = -1;
            }
            if (i4 != -1) {
                map.put("CmpSdkID", String.valueOf(i4));
            }
            wk6Var = new wk6(map);
        }
        oa6.m9016l(d76Var);
        x66 x66Var = d76Var.f16831L;
        x66Var.m12505b(wk6Var, "Tcf preferences read");
        if (!oa6Var.f26512d.m9225E(null, d56Var)) {
            if (s86Var.m10557C(wk6Var)) {
                Bundle bundleM12320b = wk6Var.m12320b();
                oa6.m9016l(d76Var);
                x66Var.m12505b(bundleM12320b, "Consent generated from Tcf");
                if (bundleM12320b != Bundle.EMPTY) {
                    ia5Var.getClass();
                    m8314O(bundleM12320b, -30, System.currentTimeMillis());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", wk6Var.m12321c());
                m8301B("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        s86Var.mo5038t();
        String string = s86Var.m10560y().getString("stored_tcf_param", str);
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            wk6Var2 = new wk6(map2);
        } else {
            for (String str2 : string.split(";")) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length >= 2 && zk6.f36163a.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            wk6Var2 = new wk6(map2);
        }
        if (s86Var.m10557C(wk6Var)) {
            Bundle bundleM12320b2 = wk6Var.m12320b();
            oa6.m9016l(d76Var);
            x66Var.m12505b(bundleM12320b2, "Consent generated from Tcf");
            if (bundleM12320b2 != Bundle.EMPTY) {
                ia5Var.getClass();
                mg6Var = this;
                mg6Var.m8314O(bundleM12320b2, -30, System.currentTimeMillis());
            } else {
                mg6Var = this;
            }
            Bundle bundle2 = new Bundle();
            HashMap map3 = wk6Var2.f33455a;
            String str3 = (map3.isEmpty() || ((String) map3.get("Version")) != null) ? "0" : "1";
            Bundle bundleM12320b3 = wk6Var.m12320b();
            Bundle bundleM12320b4 = wk6Var2.m12320b();
            bundle2.putString("_tcfm", str3.concat((bundleM12320b3.size() == bundleM12320b4.size() && Objects.equals(bundleM12320b3.getString("ad_storage"), bundleM12320b4.getString("ad_storage")) && Objects.equals(bundleM12320b3.getString("ad_personalization"), bundleM12320b4.getString("ad_personalization")) && Objects.equals(bundleM12320b3.getString("ad_user_data"), bundleM12320b4.getString("ad_user_data"))) ? "0" : "1"));
            String str4 = (String) wk6Var.f33455a.get("PurposeDiagnostics");
            if (TextUtils.isEmpty(str4)) {
                str4 = "200000";
            }
            bundle2.putString("_tcfd2", str4);
            bundle2.putString("_tcfd", wk6Var.m12321c());
            mg6Var.m8301B("auto", "_tcf", bundle2);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m8301B(String str, String str2, Bundle bundle) {
        mo5038t();
        ((oa6) this.f36084a).f26519k.getClass();
        m8302C(str, str2, bundle, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: C */
    public final void m8302C(String str, String str2, Bundle bundle, long j) {
        mo5038t();
        boolean z = true;
        if (this.f24899h != null && !dn6.m4569S(str2)) {
            z = false;
        }
        m8303D(str, str2, j, bundle, true, z, true);
    }

    /* JADX INFO: renamed from: D */
    public final void m8303D(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        boolean z4;
        s86 s86Var;
        boolean z5;
        uh6 uh6Var;
        long j2;
        boolean zM6280a;
        long j3;
        mg6 mg6Var;
        d76 d76Var;
        long j4;
        int i;
        boolean zM8202B;
        Bundle[] bundleArr;
        String str3 = str;
        rr5 rr5Var = this.f24897U;
        y42.m12851X(str3);
        y42.m12854a0(bundle);
        mo5038t();
        m9741u();
        oa6 oa6Var = (oa6) this.f36084a;
        boolean zM9018a = oa6Var.m9018a();
        vk6 vk6Var = oa6Var.f26516h;
        op5 op5Var = oa6Var.f26512d;
        Context context = oa6Var.f26509a;
        dn6 dn6Var = oa6Var.f26517i;
        d76 d76Var2 = oa6Var.f26514f;
        if (!zM9018a) {
            oa6.m9016l(d76Var2);
            d76Var2.f16842q.m12504a("Event not sent since app measurement is disabled");
            return;
        }
        List list = oa6Var.m9029p().f17858o;
        if (list != null && !list.contains(str2)) {
            oa6.m9016l(d76Var2);
            d76Var2.f16842q.m12506c("Dropping non-safelisted event. event name, origin", str2, str3);
            return;
        }
        if (!this.f24901j) {
            this.f24901j = true;
            try {
                try {
                    (!oa6Var.f26510b ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e) {
                    oa6.m9016l(d76Var2);
                    d76Var2.f16838m.m12505b(e, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                oa6.m9016l(d76Var2);
                d76Var2.f16841p.m12504a("Tag Manager is not found and thus will not be used");
            }
        }
        p66 p66Var = oa6Var.f26518j;
        s86 s86Var2 = oa6Var.f26513e;
        ia5 ia5Var = oa6Var.f26519k;
        if (!op5Var.m9225E(null, e56.f17789g1) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            ia5Var.getClass();
            z4 = true;
            m8306G(System.currentTimeMillis(), string, "auto", "_lgclid");
        } else {
            z4 = true;
        }
        if (!z || dn6.f17222n[0].equals(str2)) {
            s86Var = s86Var2;
        } else {
            oa6.m9014j(dn6Var);
            oa6.m9014j(s86Var2);
            s86Var = s86Var2;
            dn6Var.m4587F(bundle, s86Var.f29984W.m10190a());
        }
        if (!z3 && !"_iap".equals(str2)) {
            oa6.m9014j(dn6Var);
            int i2 = 2;
            if (dn6Var.m4617v0("event", str2)) {
                if (dn6Var.m4619x0("event", vd6.f32543f, vd6.f32544g, str2)) {
                    op5 op5Var2 = ((oa6) dn6Var.f36084a).f26512d;
                    if (dn6Var.m4621y0("event", 40, str2)) {
                        i2 = 0;
                    }
                } else {
                    i2 = 13;
                }
            }
            if (i2 != 0) {
                oa6.m9016l(d76Var2);
                d76Var2.f16837l.m12505b(p66Var.m9366a(str2), "Invalid public event name. Event will not be logged (FE)");
                oa6.m9014j(dn6Var);
                dn6.m4564K(rr5Var, null, i2, "_ev", dn6.m4577z(str2, z4, 40), str2 != null ? str2.length() : 0);
                return;
            }
        }
        uh6 uh6Var2 = oa6Var.f26520l;
        oa6.m9015k(uh6Var2);
        eh6 eh6VarM11553A = uh6Var2.m11553A(false);
        if (eh6VarM11553A != null && !bundle.containsKey("_sc")) {
            eh6VarM11553A.f18108d = z4;
        }
        if (!z || z3) {
            z4 = false;
        }
        dn6.m4574l0(eh6VarM11553A, bundle, z4);
        boolean zEquals = "am".equals(str3);
        boolean zM4569S = dn6.m4569S(str2);
        if (z) {
            z5 = zEquals;
            if (this.f24899h != null && !zM4569S) {
                if (!z5) {
                    oa6.m9016l(d76Var2);
                    d76Var2.f16842q.m12506c("Passing event to registered event handler (FE)", p66Var.m9366a(str2), p66Var.m9370e(bundle));
                    y42.m12854a0(this.f24899h);
                    pq3 pq3Var = (pq3) this.f24899h;
                    pq3Var.getClass();
                    try {
                        ((az5) pq3Var.f27896b).mo3375c(str3, str2, bundle, j);
                        return;
                    } catch (RemoteException e2) {
                        oa6 oa6Var2 = ((AppMeasurementDynamiteService) pq3Var.f27897c).f16259a;
                        if (oa6Var2 != null) {
                            d76 d76Var3 = oa6Var2.f26514f;
                            oa6.m9016l(d76Var3);
                            d76Var3.f16838m.m12505b(e2, "Event interceptor threw exception");
                            return;
                        }
                        return;
                    }
                }
                z5 = true;
            }
        } else {
            z5 = zEquals;
        }
        if (oa6Var.m9025h()) {
            oa6.m9014j(dn6Var);
            oa6 oa6Var3 = (oa6) dn6Var.f36084a;
            int iM4622z0 = dn6Var.m4622z0(str2);
            if (iM4622z0 != 0) {
                oa6.m9016l(d76Var2);
                d76Var2.f16837l.m12505b(p66Var.m9366a(str2), "Invalid event name. Event will not be logged (FE)");
                String strM4577z = dn6.m4577z(str2, true, 40);
                int length = str2 != null ? str2.length() : 0;
                oa6.m9014j(dn6Var);
                dn6.m4564K(rr5Var, null, iM4622z0, "_ev", strM4577z, length);
                return;
            }
            Bundle bundleM4582C = dn6Var.m4582C(str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z3);
            y42.m12854a0(bundleM4582C);
            oa6.m9015k(uh6Var2);
            String str4 = "_o";
            if (uh6Var2.m11553A(false) == null || !"_ae".equals(str2)) {
                uh6Var = uh6Var2;
                j2 = 0;
            } else {
                oa6.m9015k(vk6Var);
                dx4 dx4Var = vk6Var.f32709j;
                ((oa6) ((vk6) dx4Var.f17485d).f36084a).f26519k.getClass();
                j2 = 0;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                uh6Var = uh6Var2;
                long j5 = jElapsedRealtime - dx4Var.f17483b;
                dx4Var.f17483b = jElapsedRealtime;
                if (j5 > 0) {
                    dn6Var.m4602b0(bundleM4582C, j5);
                }
            }
            if (!"auto".equals(str3) && "_ssr".equals(str2)) {
                String string2 = bundleM4582C.getString("_ffr");
                int i3 = gd4.f19749a;
                if (string2 == null || string2.trim().isEmpty()) {
                    string2 = null;
                } else if (string2 != null) {
                    string2 = string2.trim();
                }
                s86 s86Var3 = oa6Var3.f26513e;
                oa6.m9014j(s86Var3);
                if (Objects.equals(string2, s86Var3.f29981T.m10506c())) {
                    d76 d76Var4 = oa6Var3.f26514f;
                    oa6.m9016l(d76Var4);
                    d76Var4.f16842q.m12504a("Not logging duplicate session_start_with_rollout event");
                    return;
                } else {
                    s86 s86Var4 = oa6Var3.f26513e;
                    oa6.m9014j(s86Var4);
                    s86Var4.f29981T.m10507d(string2);
                }
            } else if ("_ae".equals(str2)) {
                s86 s86Var5 = oa6Var3.f26513e;
                oa6.m9014j(s86Var5);
                String strM10506c = s86Var5.f29981T.m10506c();
                if (!TextUtils.isEmpty(strM10506c)) {
                    bundleM4582C.putString("_ffr", strM10506c);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleM4582C);
            if (op5Var.m9225E(null, e56.f17758U0)) {
                oa6.m9015k(vk6Var);
                vk6Var.mo5038t();
                zM6280a = vk6Var.f32707h;
            } else {
                oa6.m9014j(s86Var);
                zM6280a = s86Var.f29978Q.m6280a();
            }
            oa6.m9014j(s86Var);
            if (s86Var.f29975N.m8623a() <= j2) {
                j3 = j;
                mg6Var = this;
                d76Var = d76Var2;
                j4 = j2;
                i = 0;
            } else if (s86Var.m10559E(j) && zM6280a) {
                oa6.m9016l(d76Var2);
                d76Var2.f16831L.m12504a("Current session is expired, remove the session number, ID, and engagement time");
                ia5Var.getClass();
                d76Var = d76Var2;
                i = 0;
                j3 = j;
                m8306G(System.currentTimeMillis(), null, "auto", "_sid");
                m8306G(System.currentTimeMillis(), null, "auto", "_sno");
                m8306G(System.currentTimeMillis(), null, "auto", "_se");
                mg6Var = this;
                j4 = j2;
                s86Var.f29976O.m8624b(j4);
            } else {
                d76Var = d76Var2;
                j3 = j;
                j4 = j2;
                i = 0;
                mg6Var = this;
            }
            if (bundleM4582C.getLong("extend_session", j4) == 1) {
                oa6.m9016l(d76Var);
                d76Var.f16831L.m12504a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                oa6.m9015k(vk6Var);
                vk6Var.f32708i.m10417g(j3);
            }
            ArrayList arrayList2 = new ArrayList(bundleM4582C.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i4 = i; i4 < size; i4++) {
                String str5 = (String) arrayList2.get(i4);
                if (str5 != null) {
                    oa6.m9014j(dn6Var);
                    Object obj = bundleM4582C.get(str5);
                    if (obj instanceof Bundle) {
                        Bundle[] bundleArr2 = new Bundle[1];
                        bundleArr2[i] = (Bundle) obj;
                        bundleArr = bundleArr2;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleM4582C.putParcelableArray(str5, bundleArr);
                    }
                }
            }
            int i5 = i;
            while (i5 < arrayList.size()) {
                Bundle bundleM4597V = (Bundle) arrayList.get(i5);
                String str6 = i5 != 0 ? "_ep" : str2;
                String str7 = str4;
                bundleM4597V.putString(str7, str3);
                if (z2) {
                    bundleM4597V = dn6Var.m4597V(bundleM4597V);
                }
                String str8 = str3;
                Bundle bundle2 = bundleM4597V;
                ys5 ys5Var = new ys5(str6, new os5(bundleM4597V), str8, j3);
                oj6 oj6VarM9027n = oa6Var.m9027n();
                oj6VarM9027n.getClass();
                oj6VarM9027n.mo5038t();
                oj6VarM9027n.m9741u();
                oj6VarM9027n.m9138H();
                m66 m66VarM9026m = ((oa6) oj6VarM9027n.f36084a).m9026m();
                m66VarM9026m.getClass();
                Parcel parcelObtain = Parcel.obtain();
                qo5.m9996b(ys5Var, parcelObtain, i);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                if (bArrMarshall.length > 131072) {
                    d76 d76Var5 = ((oa6) m66VarM9026m.f36084a).f26514f;
                    oa6.m9016l(d76Var5);
                    d76Var5.f16836k.m12504a("Event is too long for local database. Sending event directly to service");
                    zM8202B = false;
                } else {
                    zM8202B = m66VarM9026m.m8202B(0, bArrMarshall);
                }
                byte b = 1;
                cp6 cp6VarM9142L = oj6VarM9027n.m9142L(true);
                di6 di6Var = new di6(b);
                di6Var.f17089b = cp6VarM9142L;
                di6Var.f17090c = zM8202B;
                di6Var.f17092e = ys5Var;
                di6Var.f17091d = oj6VarM9027n;
                VarHandle.storeStoreFence();
                oj6VarM9027n.m9140J(di6Var);
                if (!z5) {
                    Iterator it = mg6Var.f24900i.iterator();
                    while (it.hasNext()) {
                        ((gd6) it.next()).mo5973a(str, str2, new Bundle(bundle2), j);
                    }
                }
                i5++;
                str3 = str;
                j3 = j;
                str4 = str7;
                i = 0;
            }
            oa6.m9015k(uh6Var);
            if (uh6Var.m11553A(false) == null || !"_ae".equals(str2)) {
                return;
            }
            oa6.m9015k(vk6Var);
            ia5Var.getClass();
            vk6Var.f32709j.m4793e(true, true, SystemClock.elapsedRealtime());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX INFO: renamed from: E */
    public final void m8304E(String str, String str2, Object obj, boolean z, long j) {
        int iM4579A0;
        int length;
        rr5 rr5Var = this.f24897U;
        oa6 oa6Var = (oa6) this.f36084a;
        if (z) {
            dn6 dn6Var = oa6Var.f26517i;
            oa6.m9014j(dn6Var);
            iM4579A0 = dn6Var.m4579A0(str2);
        } else {
            dn6 dn6Var2 = oa6Var.f26517i;
            oa6.m9014j(dn6Var2);
            if (!dn6Var2.m4617v0("user property", str2)) {
                iM4579A0 = 6;
            } else if (dn6Var2.m4619x0("user property", gq6.f20049n, null, str2)) {
                op5 op5Var = ((oa6) dn6Var2.f36084a).f26512d;
                if (dn6Var2.m4621y0("user property", 24, str2)) {
                    iM4579A0 = 0;
                } else {
                    iM4579A0 = 6;
                }
            } else {
                iM4579A0 = 15;
            }
        }
        if (iM4579A0 != 0) {
            oa6.m9014j(oa6Var.f26517i);
            String strM4577z = dn6.m4577z(str2, true, 24);
            length = str2 != null ? str2.length() : 0;
            oa6.m9014j(oa6Var.f26517i);
            dn6.m4564K(rr5Var, null, iM4579A0, "_ev", strM4577z, length);
            return;
        }
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        if (obj == null) {
            m8305F(j, null, str3, str2);
            return;
        }
        dn6 dn6Var3 = oa6Var.f26517i;
        dn6 dn6Var4 = oa6Var.f26517i;
        oa6.m9014j(dn6Var3);
        int iM4590H = dn6Var3.m4590H(obj, str2);
        if (iM4590H != 0) {
            oa6.m9014j(dn6Var4);
            String strM4577z2 = dn6.m4577z(str2, true, 24);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            oa6.m9014j(dn6Var4);
            dn6.m4564K(rr5Var, null, iM4590H, "_ev", strM4577z2, length);
            return;
        }
        oa6.m9014j(dn6Var4);
        Object objM4591I = dn6Var4.m4591I(obj, str2);
        if (objM4591I != null) {
            m8305F(j, objM4591I, str3, str2);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m8305F(long j, Object obj, String str, String str2) {
        ea6 ea6Var = ((oa6) this.f36084a).f26515g;
        oa6.m9016l(ea6Var);
        ya6 ya6Var = new ya6((byte) 1);
        ya6Var.f35075b = str;
        ya6Var.f35076c = str2;
        ya6Var.f35078e = obj;
        ya6Var.f35077d = j;
        ya6Var.f35079f = this;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(ya6Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    /* JADX INFO: renamed from: G */
    public final void m8306G(long j, Object obj, String str, String str2) {
        boolean zM8202B;
        oa6 oa6Var = (oa6) this.f36084a;
        y42.m12851X(str);
        y42.m12851X(str2);
        mo5038t();
        m9741u();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    long j2 = true != "false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    Long lValueOf = Long.valueOf(j2);
                    s86 s86Var = oa6Var.f26513e;
                    oa6.m9014j(s86Var);
                    s86Var.f29995q.m10507d(j2 == 1 ? "true" : "false");
                    obj = lValueOf;
                } else if (obj == null) {
                    s86 s86Var2 = oa6Var.f26513e;
                    oa6.m9014j(s86Var2);
                    s86Var2.f29995q.m10507d("unset");
                }
                str2 = "_npa";
            } else if (obj == null) {
                s86 s86Var3 = oa6Var.f26513e;
                oa6.m9014j(s86Var3);
                s86Var3.f29995q.m10507d("unset");
                str2 = "_npa";
            }
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16831L.m12506c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
        }
        Object obj2 = obj;
        String str4 = str2;
        if (!oa6Var.m9018a()) {
            d76 d76Var2 = oa6Var.f26514f;
            oa6.m9016l(d76Var2);
            d76Var2.f16831L.m12504a("User property not set since app measurement is disabled");
            return;
        }
        if (oa6Var.m9025h()) {
            xm6 xm6Var = new xm6(j, obj2, str4, str);
            oj6 oj6VarM9027n = oa6Var.m9027n();
            oj6VarM9027n.mo5038t();
            oj6VarM9027n.m9741u();
            oj6VarM9027n.m9138H();
            m66 m66VarM9026m = ((oa6) oj6VarM9027n.f36084a).m9026m();
            m66VarM9026m.getClass();
            Parcel parcelObtain = Parcel.obtain();
            qo5.m9997c(xm6Var, parcelObtain);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            byte b = 0;
            if (bArrMarshall.length > 131072) {
                d76 d76Var3 = ((oa6) m66VarM9026m.f36084a).f26514f;
                oa6.m9016l(d76Var3);
                d76Var3.f16836k.m12504a("User property too long for local database. Sending directly to service");
                zM8202B = false;
            } else {
                zM8202B = m66VarM9026m.m8202B(1, bArrMarshall);
            }
            cp6 cp6VarM9142L = oj6VarM9027n.m9142L(true);
            di6 di6Var = new di6(b);
            di6Var.f17089b = cp6VarM9142L;
            di6Var.f17090c = zM8202B;
            di6Var.f17092e = xm6Var;
            di6Var.f17091d = oj6VarM9027n;
            VarHandle.storeStoreFence();
            oj6VarM9027n.m9140J(di6Var);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m8307H() {
        mo5038t();
        m9741u();
        oa6 oa6Var = (oa6) this.f36084a;
        if (oa6Var.m9025h()) {
            op5 op5Var = oa6Var.f26512d;
            ((oa6) op5Var.f36084a).getClass();
            Boolean boolM9227G = op5Var.m9227G("google_analytics_deferred_deep_link_enabled");
            if (boolM9227G != null && boolM9227G.booleanValue()) {
                d76 d76Var = oa6Var.f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16842q.m12504a("Deferred Deep Link feature enabled.");
                ea6 ea6Var = oa6Var.f26515g;
                oa6.m9016l(ea6Var);
                ld6 ld6Var = new ld6((byte) 2);
                ld6Var.f23966b = this;
                VarHandle.storeStoreFence();
                ea6Var.m5033D(ld6Var);
            }
            oj6 oj6VarM9027n = oa6Var.m9027n();
            oj6VarM9027n.mo5038t();
            oj6VarM9027n.m9741u();
            cp6 cp6VarM9142L = oj6VarM9027n.m9142L(true);
            oj6VarM9027n.m9138H();
            oa6 oa6Var2 = (oa6) oj6VarM9027n.f36084a;
            oa6Var2.f26512d.m9225E(null, e56.f17777c1);
            oa6Var2.m9026m().m8202B(3, new byte[0]);
            hi6 hi6Var = new hi6((byte) 0);
            hi6Var.f20613b = cp6VarM9142L;
            hi6Var.f20614c = oj6VarM9027n;
            VarHandle.storeStoreFence();
            oj6VarM9027n.m9140J(hi6Var);
            this.f24893Q = false;
            s86 s86Var = oa6Var.f26513e;
            oa6.m9014j(s86Var);
            s86Var.mo5038t();
            String string = s86Var.m10560y().getString("previous_os_version", null);
            ((oa6) s86Var.f36084a).m9028o().m7955v();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = s86Var.m10560y().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            oa6Var.m9028o().m7955v();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            m8301B("auto", "_ou", bundle);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m8308I(Bundle bundle, long j) {
        oa6 oa6Var = (oa6) this.f36084a;
        y42.m12854a0(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16838m.m12504a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        qu5.m10127c(bundle2, "app_id", String.class, null);
        qu5.m10127c(bundle2, "origin", String.class, null);
        qu5.m10127c(bundle2, "name", String.class, null);
        qu5.m10127c(bundle2, "value", Object.class, null);
        qu5.m10127c(bundle2, "trigger_event_name", String.class, null);
        qu5.m10127c(bundle2, "trigger_timeout", Long.class, 0L);
        qu5.m10127c(bundle2, "timed_out_event_name", String.class, null);
        qu5.m10127c(bundle2, "timed_out_event_params", Bundle.class, null);
        qu5.m10127c(bundle2, "triggered_event_name", String.class, null);
        qu5.m10127c(bundle2, "triggered_event_params", Bundle.class, null);
        qu5.m10127c(bundle2, "time_to_live", Long.class, 0L);
        qu5.m10127c(bundle2, "expired_event_name", String.class, null);
        qu5.m10127c(bundle2, "expired_event_params", Bundle.class, null);
        y42.m12851X(bundle2.getString("name"));
        y42.m12851X(bundle2.getString("origin"));
        y42.m12854a0(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        dn6 dn6Var = oa6Var.f26517i;
        p66 p66Var = oa6Var.f26518j;
        d76 d76Var2 = oa6Var.f26514f;
        oa6.m9014j(dn6Var);
        if (dn6Var.m4579A0(string) != 0) {
            oa6.m9016l(d76Var2);
            d76Var2.f16835j.m12505b(p66Var.m9368c(string), "Invalid conditional user property name");
            return;
        }
        oa6.m9014j(dn6Var);
        if (dn6Var.m4590H(obj, string) != 0) {
            oa6.m9016l(d76Var2);
            d76Var2.f16835j.m12506c("Invalid conditional user property value", p66Var.m9368c(string), obj);
            return;
        }
        Object objM4591I = dn6Var.m4591I(obj, string);
        if (objM4591I == null) {
            oa6.m9016l(d76Var2);
            d76Var2.f16835j.m12506c("Unable to normalize conditional user property value", p66Var.m9368c(string), obj);
            return;
        }
        qu5.m10126b(bundle2, objM4591I);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            oa6.m9016l(d76Var2);
            d76Var2.f16835j.m12506c("Invalid conditional user property timeout", p66Var.m9368c(string), Long.valueOf(j2));
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            oa6.m9016l(d76Var2);
            d76Var2.f16835j.m12506c("Invalid conditional user property time to live", p66Var.m9368c(string), Long.valueOf(j3));
            return;
        }
        ea6 ea6Var = oa6Var.f26515g;
        oa6.m9016l(ea6Var);
        se6 se6Var = new se6((byte) 0);
        se6Var.f30221c = bundle2;
        se6Var.f30220b = this;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(se6Var);
    }

    /* JADX INFO: renamed from: J */
    public final void m8309J(String str, String str2, Bundle bundle) {
        oa6 oa6Var = (oa6) this.f36084a;
        oa6Var.f26519k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        y42.m12851X(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        ea6 ea6Var = oa6Var.f26515g;
        oa6.m9016l(ea6Var);
        ar1 ar1Var = new ar1((byte) 21);
        ar1Var.f14798b = bundle2;
        ar1Var.f14799c = this;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(ar1Var);
    }

    /* JADX INFO: renamed from: K */
    public final void m8310K(xc6 xc6Var, long j, boolean z) {
        int i = xc6Var.f34161b;
        mo5038t();
        m9741u();
        oa6 oa6Var = (oa6) this.f36084a;
        s86 s86Var = oa6Var.f26513e;
        d76 d76Var = oa6Var.f26514f;
        oa6.m9014j(s86Var);
        xc6 xc6VarM10556B = s86Var.m10556B();
        if (j <= this.f24891O && xc6.m12657l(xc6VarM10556B.f34161b, i)) {
            oa6.m9016l(d76Var);
            d76Var.f16841p.m12505b(xc6Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        s86 s86Var2 = oa6Var.f26513e;
        oa6.m9014j(s86Var2);
        s86Var2.mo5038t();
        if (!xc6.m12657l(i, s86Var2.m10560y().getInt("consent_source", 100))) {
            oa6.m9016l(d76Var);
            d76Var.f16841p.m12505b(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = s86Var2.m10560y().edit();
        editorEdit.putString("consent_settings", xc6Var.m12659g());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        oa6.m9016l(d76Var);
        d76Var.f16831L.m12505b(xc6Var, "Setting storage consent(FE)");
        this.f24891O = j;
        if (oa6Var.m9027n().m9136F()) {
            oj6 oj6VarM9027n = oa6Var.m9027n();
            oj6VarM9027n.mo5038t();
            oj6VarM9027n.m9741u();
            hj6 hj6Var = new hj6((byte) 2);
            hj6Var.f20631b = oj6VarM9027n;
            VarHandle.storeStoreFence();
            oj6VarM9027n.m9140J(hj6Var);
        } else {
            oa6Var.m9027n().m9144N();
        }
        if (z) {
            oa6Var.m9027n().m9147y(new AtomicReference());
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m8311L(Boolean bool, boolean z) {
        mo5038t();
        m9741u();
        oa6 oa6Var = (oa6) this.f36084a;
        d76 d76Var = oa6Var.f26514f;
        oa6.m9016l(d76Var);
        d76Var.f16842q.m12505b(bool, "Setting app measurement enabled (FE)");
        s86 s86Var = oa6Var.f26513e;
        oa6.m9014j(s86Var);
        s86Var.mo5038t();
        SharedPreferences.Editor editorEdit = s86Var.m10560y().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z) {
            s86Var.mo5038t();
            SharedPreferences.Editor editorEdit2 = s86Var.m10560y().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        ea6 ea6Var = oa6Var.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        if (oa6Var.f26534z || !(bool == null || bool.booleanValue())) {
            m8312M();
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m8312M() {
        mo5038t();
        oa6 oa6Var = (oa6) this.f36084a;
        s86 s86Var = oa6Var.f26513e;
        d76 d76Var = oa6Var.f26514f;
        ia5 ia5Var = oa6Var.f26519k;
        oa6.m9014j(s86Var);
        String strM10506c = s86Var.f29995q.m10506c();
        byte b = 1;
        if (strM10506c != null) {
            if ("unset".equals(strM10506c)) {
                ia5Var.getClass();
                m8306G(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strM10506c) ? 0L : 1L);
                ia5Var.getClass();
                m8306G(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!oa6Var.m9018a() || !this.f24893Q) {
            oa6.m9016l(d76Var);
            d76Var.f16842q.m12504a("Updating Scion state (FE)");
            oj6 oj6VarM9027n = oa6Var.m9027n();
            oj6VarM9027n.mo5038t();
            oj6VarM9027n.m9741u();
            cp6 cp6VarM9142L = oj6VarM9027n.m9142L(true);
            ei6 ei6Var = new ei6((byte) 2);
            ei6Var.f18126b = cp6VarM9142L;
            ei6Var.f18127c = oj6VarM9027n;
            VarHandle.storeStoreFence();
            oj6VarM9027n.m9140J(ei6Var);
            return;
        }
        oa6.m9016l(d76Var);
        d76Var.f16842q.m12504a("Recording app launch after enabling measurement for the first time (FE)");
        m8307H();
        vk6 vk6Var = oa6Var.f26516h;
        oa6.m9015k(vk6Var);
        vk6Var.f32708i.mo3680f();
        ea6 ea6Var = oa6Var.f26515g;
        oa6.m9016l(ea6Var);
        ld6 ld6Var = new ld6(b);
        ld6Var.f23966b = this;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(ld6Var);
    }

    /* JADX INFO: renamed from: N */
    public final void m8313N() {
        oa6 oa6Var = (oa6) this.f36084a;
        if (!(oa6Var.f26509a.getApplicationContext() instanceof Application) || this.f24898g == null) {
            return;
        }
        ((Application) oa6Var.f26509a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f24898g);
    }

    /* JADX INFO: renamed from: O */
    public final void m8314O(Bundle bundle, int i, long j) {
        Boolean bool;
        String string;
        rc6 rc6Var;
        Boolean bool2;
        oa6 oa6Var = (oa6) this.f36084a;
        m9741u();
        xc6 xc6Var = xc6.f34159c;
        vc6[] vc6VarArr = tc6.STORAGE.f31080a;
        int length = vc6VarArr.length;
        int i2 = 0;
        while (true) {
            bool = null;
            if (i2 >= length) {
                string = null;
                break;
            }
            String str = vc6VarArr[i2].f32527a;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    bool2 = Boolean.TRUE;
                } else {
                    bool2 = string.equals("denied") ? Boolean.FALSE : null;
                }
                if (bool2 == null) {
                    break;
                }
            }
            i2++;
        }
        if (string != null) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16840o.m12505b(string, "Ignoring invalid consent setting");
            d76 d76Var2 = oa6Var.f26514f;
            oa6.m9016l(d76Var2);
            d76Var2.f16840o.m12504a("Valid consent values are 'granted', 'denied'");
        }
        ea6 ea6Var = oa6Var.f26515g;
        oa6.m9016l(ea6Var);
        boolean zM5030A = ea6Var.m5030A();
        xc6 xc6VarM12652b = xc6.m12652b(i, bundle);
        Iterator it = xc6VarM12652b.f34160a.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            rc6Var = rc6.UNINITIALIZED;
            if (!zHasNext) {
                break;
            } else if (((rc6) it.next()) != rc6Var) {
                m8316Q(xc6VarM12652b, zM5030A);
                break;
            }
        }
        mr5 mr5VarM8387c = mr5.m8387c(i, bundle);
        Iterator it2 = mr5VarM8387c.f25175e.values().iterator();
        while (it2.hasNext()) {
            if (((rc6) it2.next()) != rc6Var) {
                m8315P(mr5VarM8387c, zM5030A);
                break;
            }
        }
        if (bundle != null) {
            int iOrdinal = xc6.m12654d(bundle.getString("ad_personalization")).ordinal();
            if (iOrdinal == 2) {
                bool = Boolean.FALSE;
            } else if (iOrdinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str2 = i == -30 ? "tcf" : "app";
            if (zM5030A) {
                m8306G(j, bool.toString(), str2, "allow_personalized_ads");
            } else {
                m8304E(str2, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m8315P(mr5 mr5Var, boolean z) {
        oz5 oz5Var = new oz5((byte) 24);
        oz5Var.f27249b = mr5Var;
        oz5Var.f27250c = this;
        VarHandle.storeStoreFence();
        if (z) {
            mo5038t();
            oz5Var.run();
        } else {
            ea6 ea6Var = ((oa6) this.f36084a).f26515g;
            oa6.m9016l(ea6Var);
            ea6Var.m5033D(oz5Var);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m8316Q(xc6 xc6Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        m9741u();
        int i = xc6Var.f34161b;
        if (i != -10) {
            rc6 rc6Var = (rc6) xc6Var.f34160a.get(vc6.AD_STORAGE);
            if (rc6Var == null) {
                rc6Var = rc6.UNINITIALIZED;
            }
            rc6 rc6Var2 = rc6.UNINITIALIZED;
            if (rc6Var == rc6Var2) {
                rc6 rc6Var3 = (rc6) xc6Var.f34160a.get(vc6.ANALYTICS_STORAGE);
                if (rc6Var3 == null) {
                    rc6Var3 = rc6Var2;
                }
                if (rc6Var3 == rc6Var2) {
                    d76 d76Var = ((oa6) this.f36084a).f26514f;
                    oa6.m9016l(d76Var);
                    d76Var.f16840o.m12504a("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.f24903l) {
            try {
                if (xc6.m12657l(i, this.f24889M.f34161b)) {
                    xc6 xc6Var2 = this.f24889M;
                    EnumMap enumMap = xc6Var.f34160a;
                    vc6[] vc6VarArr = (vc6[]) enumMap.keySet().toArray(new vc6[0]);
                    int length = vc6VarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z2 = false;
                            break;
                        }
                        vc6 vc6Var = vc6VarArr[i2];
                        rc6 rc6Var4 = (rc6) enumMap.get(vc6Var);
                        rc6 rc6Var5 = (rc6) xc6Var2.f34160a.get(vc6Var);
                        rc6 rc6Var6 = rc6.DENIED;
                        if (rc6Var4 == rc6Var6 && rc6Var5 != rc6Var6) {
                            z2 = true;
                            break;
                        }
                        i2++;
                    }
                    vc6 vc6Var2 = vc6.ANALYTICS_STORAGE;
                    z3 = xc6Var.m12660i(vc6Var2) && !this.f24889M.m12660i(vc6Var2);
                    xc6Var = xc6Var.m12662k(this.f24889M);
                    this.f24889M = xc6Var;
                    z4 = true;
                } else {
                    z2 = false;
                    z3 = false;
                    z4 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z4) {
            d76 d76Var2 = ((oa6) this.f36084a).f26514f;
            oa6.m9016l(d76Var2);
            d76Var2.f16841p.m12505b(xc6Var, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.f24890N.getAndIncrement();
        if (z2) {
            this.f24902k.set(null);
            jf6 jf6Var = new jf6((byte) 0);
            jf6Var.f22223b = xc6Var;
            jf6Var.f22224c = andIncrement;
            jf6Var.f22225d = z3;
            jf6Var.f22226e = this;
            VarHandle.storeStoreFence();
            if (z) {
                mo5038t();
                jf6Var.run();
                return;
            } else {
                ea6 ea6Var = ((oa6) this.f36084a).f26515g;
                oa6.m9016l(ea6Var);
                ea6Var.m5035F(jf6Var);
                return;
            }
        }
        jf6 jf6Var2 = new jf6((byte) 1);
        jf6Var2.f22223b = xc6Var;
        jf6Var2.f22224c = andIncrement;
        jf6Var2.f22225d = z3;
        jf6Var2.f22226e = this;
        VarHandle.storeStoreFence();
        if (z) {
            mo5038t();
            jf6Var2.run();
        } else if (i == 30 || i == -10) {
            ea6 ea6Var2 = ((oa6) this.f36084a).f26515g;
            oa6.m9016l(ea6Var2);
            ea6Var2.m5035F(jf6Var2);
        } else {
            ea6 ea6Var3 = ((oa6) this.f36084a).f26515g;
            oa6.m9016l(ea6Var3);
            ea6Var3.m5033D(jf6Var2);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m8317R() {
        ho6.m6466a();
        oa6 oa6Var = (oa6) this.f36084a;
        op5 op5Var = oa6Var.f26512d;
        ea6 ea6Var = oa6Var.f26515g;
        d76 d76Var = oa6Var.f26514f;
        if (op5Var.m9225E(null, e56.f17750Q0)) {
            oa6.m9016l(ea6Var);
            if (ea6Var.m5030A()) {
                oa6.m9016l(d76Var);
                d76Var.f16835j.m12504a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (yj5.m13150b()) {
                oa6.m9016l(d76Var);
                d76Var.f16835j.m12504a("Cannot get trigger URIs from main thread");
                return;
            }
            m9741u();
            oa6.m9016l(d76Var);
            d76Var.f16831L.m12504a("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            oa6.m9016l(ea6Var);
            oe6 oe6Var = new oe6((byte) 3);
            oe6Var.f26660c = this;
            oe6Var.f26659b = atomicReference;
            VarHandle.storeStoreFence();
            ea6Var.m5034E(atomicReference, 10000L, "get trigger URIs", oe6Var);
            List list = (List) atomicReference.get();
            if (list == null) {
                oa6.m9016l(d76Var);
                d76Var.f16837l.m12504a("Timed out waiting for get trigger URIs");
                return;
            }
            oa6.m9016l(ea6Var);
            ar1 ar1Var = new ar1((byte) 23);
            ar1Var.f14798b = this;
            ar1Var.f14799c = list;
            VarHandle.storeStoreFence();
            ea6Var.m5033D(ar1Var);
        }
    }

    /* JADX INFO: renamed from: U */
    public final PriorityQueue m8318U() {
        PriorityQueue priorityQueue = this.f24908q;
        if (priorityQueue != null) {
            return priorityQueue;
        }
        PriorityQueue priorityQueue2 = new PriorityQueue(Comparator.comparing(cg6.f16008a, m75.f24720b));
        this.f24908q = priorityQueue2;
        return priorityQueue2;
    }

    /* JADX INFO: renamed from: W */
    public final void m8319W() {
        cl6 cl6Var;
        mo5038t();
        this.f24888L = false;
        if (m8318U().isEmpty() || this.f24904m || (cl6Var = (cl6) m8318U().poll()) == null) {
            return;
        }
        oa6 oa6Var = (oa6) this.f36084a;
        dn6 dn6Var = oa6Var.f26517i;
        oa6.m9014j(dn6Var);
        fr2 fr2VarM4593O = dn6Var.m4593O();
        if (fr2VarM4593O != null) {
            this.f24904m = true;
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            x66 x66Var = d76Var.f16831L;
            String str = cl6Var.f16114d;
            x66Var.m12505b(str, "Registering trigger URI");
            zl2 zl2VarM5793e = fr2VarM4593O.m5793e(Uri.parse(str));
            if (zl2VarM5793e == null) {
                this.f24904m = false;
                m8318U().add(cl6Var);
                return;
            }
            bu3 bu3Var = new bu3((byte) 4);
            bu3Var.f15636b = this;
            VarHandle.storeStoreFence();
            pq3 pq3Var = new pq3((byte) 15);
            pq3Var.f27896b = cl6Var;
            pq3Var.f27897c = this;
            VarHandle.storeStoreFence();
            qs5.m10100e(zl2VarM5793e, pq3Var, bu3Var);
        }
    }

    @Override // p000.q56
    /* JADX INFO: renamed from: x */
    public final boolean mo8203x() {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final void m8320y(xc6 xc6Var) {
        mo5038t();
        boolean z = (xc6Var.m12660i(vc6.ANALYTICS_STORAGE) && xc6Var.m12660i(vc6.AD_STORAGE)) || ((oa6) this.f36084a).m9027n().m9135E();
        oa6 oa6Var = (oa6) this.f36084a;
        ea6 ea6Var = oa6Var.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        if (z != oa6Var.f26534z) {
            ea6 ea6Var2 = oa6Var.f26515g;
            oa6.m9016l(ea6Var2);
            ea6Var2.mo5038t();
            oa6Var.f26534z = z;
            s86 s86Var = ((oa6) this.f36084a).f26513e;
            oa6.m9014j(s86Var);
            s86Var.mo5038t();
            Boolean boolValueOf = s86Var.m10560y().contains("measurement_enabled_from_api") ? Boolean.valueOf(s86Var.m10560y().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                m8311L(Boolean.valueOf(z), false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r0 > 500) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        if (r1 > 500) goto L32;
     */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8321z(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!Objects.equals(str2, "screen_view")) {
            boolean z3 = true;
            if (z2 && this.f24899h != null && !dn6.m4569S(str2)) {
                z3 = false;
            }
            if (str == null) {
                str = "app";
            }
            Bundle bundle3 = new Bundle(bundle2);
            for (String str3 : bundle3.keySet()) {
                Object obj = bundle3.get(str3);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str3, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i = 0; i < parcelableArr.length; i++) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            ea6 ea6Var = ((oa6) this.f36084a).f26515g;
            oa6.m9016l(ea6Var);
            ke6 ke6Var = new ke6();
            ke6Var.f23086a = str;
            ke6Var.f23087b = str2;
            ke6Var.f23088c = j;
            ke6Var.f23089d = bundle3;
            ke6Var.f23090e = z2;
            ke6Var.f23091f = z3;
            ke6Var.f23092g = z;
            ke6Var.f23093h = this;
            VarHandle.storeStoreFence();
            ea6Var.m5033D(ke6Var);
            return;
        }
        uh6 uh6Var = ((oa6) this.f36084a).f26520l;
        oa6.m9015k(uh6Var);
        synchronized (uh6Var.f31889p) {
            try {
                if (!uh6Var.f31888o) {
                    d76 d76Var = ((oa6) uh6Var.f36084a).f26514f;
                    oa6.m9016l(d76Var);
                    d76Var.f16840o.m12504a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle2.getString("screen_name");
                if (string != null) {
                    if (string.length() > 0) {
                        int length = string.length();
                        ((oa6) uh6Var.f36084a).f26512d.getClass();
                    }
                    d76 d76Var2 = ((oa6) uh6Var.f36084a).f26514f;
                    oa6.m9016l(d76Var2);
                    d76Var2.f16840o.m12505b(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                    return;
                }
                String string2 = bundle2.getString("screen_class");
                if (string2 != null) {
                    if (string2.length() > 0) {
                        int length2 = string2.length();
                        ((oa6) uh6Var.f36084a).f26512d.getClass();
                    }
                    d76 d76Var3 = ((oa6) uh6Var.f36084a).f26514f;
                    oa6.m9016l(d76Var3);
                    d76Var3.f16840o.m12505b(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                    return;
                }
                if (string2 == null) {
                    pz5 pz5Var = uh6Var.f31884k;
                    string2 = pz5Var != null ? uh6Var.m11554B(pz5Var.f28110e) : "Activity";
                }
                String str4 = string2;
                eh6 eh6Var = uh6Var.f31880g;
                if (uh6Var.f31885l && eh6Var != null) {
                    uh6Var.f31885l = false;
                    boolean zEquals = Objects.equals(eh6Var.f18106b, str4);
                    boolean zEquals2 = Objects.equals(eh6Var.f18105a, string);
                    if (zEquals && zEquals2) {
                        d76 d76Var4 = ((oa6) uh6Var.f36084a).f26514f;
                        oa6.m9016l(d76Var4);
                        d76Var4.f16840o.m12504a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                oa6 oa6Var = (oa6) uh6Var.f36084a;
                d76 d76Var5 = oa6Var.f26514f;
                oa6.m9016l(d76Var5);
                d76Var5.f16831L.m12506c("Logging screen view with name, class", string == null ? "null" : string, str4);
                eh6 eh6Var2 = uh6Var.f31880g == null ? uh6Var.f31881h : uh6Var.f31880g;
                dn6 dn6Var = oa6Var.f26517i;
                oa6.m9014j(dn6Var);
                eh6 eh6Var3 = new eh6(string, str4, dn6Var.m4613r0(), true, j);
                uh6Var.f31880g = eh6Var3;
                uh6Var.f31881h = eh6Var2;
                uh6Var.f31886m = eh6Var3;
                oa6Var.f26519k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ea6 ea6Var2 = oa6Var.f26515g;
                oa6.m9016l(ea6Var2);
                ya6 ya6Var = new ya6((byte) 2);
                ya6Var.f35075b = bundle2;
                ya6Var.f35076c = eh6Var3;
                ya6Var.f35078e = eh6Var2;
                ya6Var.f35077d = jElapsedRealtime;
                ya6Var.f35079f = uh6Var;
                VarHandle.storeStoreFence();
                ea6Var2.m5033D(ya6Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
