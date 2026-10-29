package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n96 extends rl6 implements kp5 {

    /* JADX INFO: renamed from: L */
    public C0805jo f25580L;

    /* JADX INFO: renamed from: h */
    public C0805jo f25581h;

    /* JADX INFO: renamed from: i */
    public C0805jo f25582i;

    /* JADX INFO: renamed from: j */
    public C0805jo f25583j;

    /* JADX INFO: renamed from: k */
    public C0805jo f25584k;

    /* JADX INFO: renamed from: l */
    public C0805jo f25585l;

    /* JADX INFO: renamed from: m */
    public C0805jo f25586m;

    /* JADX INFO: renamed from: n */
    public uk3 f25587n;

    /* JADX INFO: renamed from: o */
    public bt5 f25588o;

    /* JADX INFO: renamed from: p */
    public C0805jo f25589p;

    /* JADX INFO: renamed from: q */
    public C0805jo f25590q;

    /* JADX INFO: renamed from: E */
    public static final C0805jo m8636E(n66 n66Var) {
        C0805jo c0805jo = new C0805jo(0);
        for (b76 b76Var : n66Var.m8560s()) {
            c0805jo.put(b76Var.m3506o(), b76Var.m3507p());
        }
        return c0805jo;
    }

    /* JADX INFO: renamed from: F */
    public static final vc6 m8637F(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return vc6.AD_STORAGE;
        }
        if (i2 == 2) {
            return vc6.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return vc6.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return vc6.AD_PERSONALIZATION;
    }

    /* JADX INFO: renamed from: A */
    public final void m8638A(String str) {
        C0805jo c0805jo = this.f25580L;
        C0805jo c0805jo2 = this.f25590q;
        C0805jo c0805jo3 = this.f25589p;
        C0805jo c0805jo4 = this.f25581h;
        m10368u();
        mo5038t();
        y42.m12851X(str);
        C0805jo c0805jo5 = this.f25585l;
        if (c0805jo5.get(str) == null) {
            ar5 ar5Var = this.f19870f.f28593c;
            qm6.m9925S(ar5Var);
            tt2 tt2VarM3163C0 = ar5Var.m3163C0(str);
            if (tt2VarM3163C0 != null) {
                l66 l66Var = (l66) m8641D(str, (byte[]) tt2VarM3163C0.f31428b).m13569g();
                m8639B(str, l66Var);
                c0805jo4.put(str, m8636E((n66) l66Var.m11056e()));
                c0805jo5.put(str, (n66) l66Var.m11056e());
                m8640C(str, (n66) l66Var.m11056e());
                c0805jo3.put(str, ((n66) l66Var.f31181b).m8567z());
                c0805jo2.put(str, (String) tt2VarM3163C0.f31429c);
                c0805jo.put(str, (String) tt2VarM3163C0.f31430d);
                return;
            }
            c0805jo4.put(str, null);
            this.f25583j.put(str, null);
            this.f25582i.put(str, null);
            this.f25584k.put(str, null);
            c0805jo5.put(str, null);
            c0805jo3.put(str, null);
            c0805jo2.put(str, null);
            c0805jo.put(str, null);
            this.f25586m.put(str, null);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m8639B(String str, l66 l66Var) {
        oa6 oa6Var = (oa6) this.f36084a;
        HashSet hashSet = new HashSet();
        C0805jo c0805jo = new C0805jo(0);
        C0805jo c0805jo2 = new C0805jo(0);
        C0805jo c0805jo3 = new C0805jo(0);
        Iterator it = Collections.unmodifiableList(((n66) l66Var.f31181b).m8566y()).iterator();
        while (it.hasNext()) {
            hashSet.add(((d66) it.next()).m4391o());
        }
        for (int i = 0; i < ((n66) l66Var.f31181b).m8561t(); i++) {
            g66 g66Var = (g66) ((n66) l66Var.f31181b).m8562u(i).m13569g();
            if (g66Var.m5907h().isEmpty()) {
                d76 d76Var = oa6Var.f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16838m.m12504a("EventConfig contained null event name");
            } else {
                String strM5907h = g66Var.m5907h();
                String strM6960c = iw5.m6960c(g66Var.m5907h(), vd6.f32543f, vd6.f32545h);
                if (!TextUtils.isEmpty(strM6960c)) {
                    g66Var.m11054c();
                    ((h66) g66Var.f31181b).m6243v(strM6960c);
                    l66Var.m11054c();
                    ((n66) l66Var.f31181b).m8553G(i, (h66) g66Var.m11056e());
                }
                if (((h66) g66Var.f31181b).m6237p() && ((h66) g66Var.f31181b).m6238q()) {
                    c0805jo.put(strM5907h, Boolean.TRUE);
                }
                if (((h66) g66Var.f31181b).m6239r() && ((h66) g66Var.f31181b).m6240s()) {
                    c0805jo2.put(g66Var.m5907h(), Boolean.TRUE);
                }
                if (((h66) g66Var.f31181b).m6241t()) {
                    if (((h66) g66Var.f31181b).m6242u() < 2 || ((h66) g66Var.f31181b).m6242u() > 65535) {
                        d76 d76Var2 = oa6Var.f26514f;
                        oa6.m9016l(d76Var2);
                        d76Var2.f16838m.m12506c("Invalid sampling rate. Event name, sample rate", g66Var.m5907h(), Integer.valueOf(((h66) g66Var.f31181b).m6242u()));
                    } else {
                        c0805jo3.put(g66Var.m5907h(), Integer.valueOf(((h66) g66Var.f31181b).m6242u()));
                    }
                }
            }
        }
        this.f25582i.put(str, hashSet);
        this.f25583j.put(str, c0805jo);
        this.f25584k.put(str, c0805jo2);
        this.f25586m.put(str, c0805jo3);
    }

    /* JADX INFO: renamed from: C */
    public final void m8640C(String str, n66 n66Var) {
        uk3 uk3Var = this.f25587n;
        oa6 oa6Var = (oa6) this.f36084a;
        if (n66Var.m8565x() == 0) {
            uk3Var.m3650e(str);
            return;
        }
        d76 d76Var = oa6Var.f26514f;
        oa6.m9016l(d76Var);
        d76Var.f16831L.m12505b(Integer.valueOf(n66Var.m8565x()), "EES programs found");
        byte b = 0;
        gc6 gc6Var = (gc6) n66Var.m8564w().get(0);
        try {
            pv5 pv5Var = new pv5();
            r36 r36Var = pv5Var.f28036a;
            g96 g96Var = new g96((byte) 2);
            g96Var.f19679b = this;
            g96Var.f19680c = str;
            VarHandle.storeStoreFence();
            ((yn5) r36Var.f28988d).f35372a.put("internal.remoteConfig", g96Var);
            g96 g96Var2 = new g96(b);
            g96Var2.f19679b = this;
            g96Var2.f19680c = str;
            VarHandle.storeStoreFence();
            ((yn5) r36Var.f28988d).f35372a.put("internal.appMetadata", g96Var2);
            tu5 tu5Var = new tu5((byte) 1);
            tu5Var.f31462b = this;
            VarHandle.storeStoreFence();
            ((yn5) r36Var.f28988d).f35372a.put("internal.logger", tu5Var);
            pv5Var.m9684b(gc6Var);
            uk3Var.m3649d(str, pv5Var);
            oa6.m9016l(d76Var);
            x66 x66Var = d76Var.f16831L;
            x66Var.m12506c("EES program loaded for appId, activities", str, Integer.valueOf(gc6Var.m5970p().m11029p()));
            for (xb6 xb6Var : gc6Var.m5970p().m11028o()) {
                oa6.m9016l(d76Var);
                x66Var.m12505b(xb6Var.m12648o(), "EES program activity");
            }
        } catch (xy5 unused) {
            d76 d76Var2 = oa6Var.f26514f;
            oa6.m9016l(d76Var2);
            d76Var2.f16835j.m12505b(str, "Failed to load EES program. appId");
        }
    }

    /* JADX INFO: renamed from: D */
    public final n66 m8641D(String str, byte[] bArr) {
        oa6 oa6Var = (oa6) this.f36084a;
        if (bArr == null) {
            return n66.m8548F();
        }
        try {
            n66 n66Var = (n66) ((l66) q76.m9777k0(n66.m8547E(), bArr)).m11056e();
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16831L.m12506c("Parsed config. version, gmp_app_id", n66Var.m8556o() ? Long.valueOf(n66Var.m8557p()) : null, n66Var.m8558q() ? n66Var.m8559r() : null);
            return n66Var;
        } catch (RuntimeException e) {
            d76 d76Var2 = oa6Var.f26514f;
            oa6.m9016l(d76Var2);
            d76Var2.f16838m.m12506c("Unable to merge remote config. appId", d76.m4401y(str), e);
            return n66.m8548F();
        } catch (qi6 e2) {
            d76 d76Var3 = oa6Var.f26514f;
            oa6.m9016l(d76Var3);
            d76Var3.f16838m.m12506c("Unable to merge remote config. appId", d76.m4401y(str), e2);
            return n66.m8548F();
        }
    }

    /* JADX INFO: renamed from: G */
    public final n66 m8642G(String str) {
        m10368u();
        mo5038t();
        y42.m12851X(str);
        m8638A(str);
        return (n66) this.f25585l.get(str);
    }

    /* JADX INFO: renamed from: H */
    public final String m8643H(String str) {
        mo5038t();
        m8638A(str);
        return (String) this.f25589p.get(str);
    }

    /* JADX INFO: renamed from: I */
    public final void m8644I(String str, byte[] bArr, String str2, String str3) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        l66 l66Var;
        byte[] bArrM5118a;
        int i;
        int i2;
        boolean z;
        m10368u();
        mo5038t();
        y42.m12851X(str);
        l66 l66Var2 = (l66) m8641D(str, bArr).m13569g();
        m8639B(str, l66Var2);
        m8640C(str, (n66) l66Var2.m11056e());
        n66 n66Var = (n66) l66Var2.m11056e();
        C0805jo c0805jo = this.f25585l;
        c0805jo.put(str, n66Var);
        this.f25589p.put(str, ((n66) l66Var2.f31181b).m8567z());
        this.f25590q.put(str, str2);
        this.f25580L.put(str, str3);
        this.f25581h.put(str, m8636E((n66) l66Var2.m11056e()));
        qm6 qm6Var = this.f19870f;
        ar5 ar5Var = qm6Var.f28593c;
        qm6.m9925S(ar5Var);
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((n66) l66Var2.f31181b).m8563v()));
        oa6 oa6Var = (oa6) ar5Var.f36084a;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            z36 z36Var = (z36) ((b46) arrayList.get(i3)).m13569g();
            C0805jo c0805jo2 = c0805jo;
            if (((b46) z36Var.f31181b).m3445u() != 0) {
                int i4 = 0;
                while (i4 < ((b46) z36Var.f31181b).m3445u()) {
                    c46 c46Var = (c46) ((b46) z36Var.f31181b).m3446v(i4).m13569g();
                    c46 c46Var2 = (c46) c46Var.clone();
                    qm6 qm6Var2 = qm6Var;
                    l66 l66Var3 = l66Var2;
                    String strM6960c = iw5.m6960c(((f46) c46Var.f31181b).m5512q(), vd6.f32543f, vd6.f32545h);
                    if (strM6960c != null) {
                        c46Var2.m11054c();
                        ((f46) c46Var2.f31181b).m5508B(strM6960c);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i5 = 0;
                    while (i5 < ((f46) c46Var.f31181b).m5514s()) {
                        j46 j46VarM5515t = ((f46) c46Var.f31181b).m5515t(i5);
                        boolean z2 = z;
                        c46 c46Var3 = c46Var;
                        String strM6960c2 = iw5.m6960c(j46VarM5515t.m7011v(), oh6.f26721O, oh6.f26722P);
                        if (strM6960c2 != null) {
                            i46 i46Var = (i46) j46VarM5515t.m13569g();
                            i46Var.m11054c();
                            ((j46) i46Var.f31181b).m7012x(strM6960c2);
                            j46 j46Var = (j46) i46Var.m11056e();
                            c46Var2.m11054c();
                            ((f46) c46Var2.f31181b).m5509C(i5, j46Var);
                            z = true;
                        } else {
                            z = z2;
                        }
                        i5++;
                        c46Var = c46Var3;
                    }
                    if (z) {
                        z36Var.m11054c();
                        ((b46) z36Var.f31181b).m3448x(i4, (f46) c46Var2.m11056e());
                        arrayList.set(i3, (b46) z36Var.m11056e());
                    }
                    i4++;
                    qm6Var = qm6Var2;
                    l66Var2 = l66Var3;
                }
            }
            l66 l66Var4 = l66Var2;
            qm6 qm6Var3 = qm6Var;
            if (((b46) z36Var.f31181b).m3442r() != 0) {
                for (int i6 = 0; i6 < ((b46) z36Var.f31181b).m3442r(); i6++) {
                    u46 u46VarM3443s = ((b46) z36Var.f31181b).m3443s(i6);
                    String strM6960c3 = iw5.m6960c(u46VarM3443s.m11241q(), gq6.f20049n, gq6.f20050o);
                    if (strM6960c3 != null) {
                        q46 q46Var = (q46) u46VarM3443s.m13569g();
                        q46Var.m11054c();
                        ((u46) q46Var.f31181b).m11247x(strM6960c3);
                        z36Var.m11054c();
                        ((b46) z36Var.f31181b).m3447w(i6, (u46) q46Var.m11056e());
                        arrayList.set(i3, (b46) z36Var.m11056e());
                    }
                }
            }
            i3++;
            c0805jo = c0805jo2;
            qm6Var = qm6Var3;
            l66Var2 = l66Var4;
        }
        l66 l66Var5 = l66Var2;
        C0805jo c0805jo3 = c0805jo;
        qm6 qm6Var4 = qm6Var;
        ar5Var.m10368u();
        ar5Var.mo5038t();
        y42.m12851X(str);
        SQLiteDatabase sQLiteDatabaseM3197l0 = ar5Var.m3197l0();
        sQLiteDatabaseM3197l0.beginTransaction();
        try {
            ar5Var.m10368u();
            ar5Var.mo5038t();
            y42.m12851X(str);
            SQLiteDatabase sQLiteDatabaseM3197l1 = ar5Var.m3197l0();
            sQLiteDatabaseM3197l1.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseM3197l1.delete("event_filters", "app_id=?", new String[]{str});
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                int i8 = i7 + 1;
                b46 b46Var = (b46) arrayList.get(i7);
                ar5Var.m10368u();
                ar5Var.mo5038t();
                y42.m12851X(str);
                y42.m12854a0(b46Var);
                if (b46Var.m3439o()) {
                    int iM3440p = b46Var.m3440p();
                    Iterator it = b46Var.m3444t().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator it2 = b46Var.m3441q().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    Iterator it3 = b46Var.m3444t().iterator();
                                    while (true) {
                                        boolean zHasNext = it3.hasNext();
                                        Iterator it4 = it3;
                                        String str4 = "filter_id";
                                        sQLiteDatabase = sQLiteDatabaseM3197l0;
                                        i = size;
                                        String str5 = "app_id";
                                        if (!zHasNext) {
                                            i2 = i8;
                                            Iterator it5 = b46Var.m3441q().iterator();
                                            while (it5.hasNext()) {
                                                u46 u46Var = (u46) it5.next();
                                                ar5Var.m10368u();
                                                ar5Var.mo5038t();
                                                y42.m12851X(str);
                                                y42.m12854a0(u46Var);
                                                if (u46Var.m11241q().isEmpty()) {
                                                    d76 d76Var = oa6Var.f26514f;
                                                    oa6.m9016l(d76Var);
                                                    d76Var.f16838m.m12507d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", d76.m4401y(str), Integer.valueOf(iM3440p), String.valueOf(u46Var.m11239o() ? Integer.valueOf(u46Var.m11240p()) : null));
                                                } else {
                                                    byte[] bArrM5118a2 = u46Var.m5118a();
                                                    Iterator it6 = it5;
                                                    ContentValues contentValues = new ContentValues();
                                                    contentValues.put(str5, str);
                                                    String str6 = str5;
                                                    contentValues.put("audience_id", Integer.valueOf(iM3440p));
                                                    contentValues.put(str4, u46Var.m11239o() ? Integer.valueOf(u46Var.m11240p()) : null);
                                                    String str7 = str4;
                                                    contentValues.put("property_name", u46Var.m11241q());
                                                    contentValues.put("session_scoped", u46Var.m11245u() ? Boolean.valueOf(u46Var.m11246v()) : null);
                                                    contentValues.put("data", bArrM5118a2);
                                                    try {
                                                        if (ar5Var.m3197l0().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                            d76 d76Var2 = oa6Var.f26514f;
                                                            oa6.m9016l(d76Var2);
                                                            d76Var2.f16835j.m12505b(d76.m4401y(str), "Failed to insert property filter (got -1). appId");
                                                        } else {
                                                            it5 = it6;
                                                            str5 = str6;
                                                            str4 = str7;
                                                        }
                                                    } catch (SQLiteException e) {
                                                        d76 d76Var3 = oa6Var.f26514f;
                                                        oa6.m9016l(d76Var3);
                                                        d76Var3.f16835j.m12506c("Error storing property filter. appId", d76.m4401y(str), e);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        try {
                                            f46 f46Var = (f46) it4.next();
                                            ar5Var.m10368u();
                                            ar5Var.mo5038t();
                                            y42.m12851X(str);
                                            y42.m12854a0(f46Var);
                                            if (f46Var.m5512q().isEmpty()) {
                                                d76 d76Var4 = oa6Var.f26514f;
                                                oa6.m9016l(d76Var4);
                                                d76Var4.f16838m.m12507d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", d76.m4401y(str), Integer.valueOf(iM3440p), String.valueOf(f46Var.m5510o() ? Integer.valueOf(f46Var.m5511p()) : null));
                                                i2 = i8;
                                            } else {
                                                b46 b46Var2 = b46Var;
                                                byte[] bArrM5118a3 = f46Var.m5118a();
                                                i2 = i8;
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("app_id", str);
                                                contentValues2.put("audience_id", Integer.valueOf(iM3440p));
                                                contentValues2.put("filter_id", f46Var.m5510o() ? Integer.valueOf(f46Var.m5511p()) : null);
                                                contentValues2.put("event_name", f46Var.m5512q());
                                                contentValues2.put("session_scoped", f46Var.m5520y() ? Boolean.valueOf(f46Var.m5521z()) : null);
                                                contentValues2.put("data", bArrM5118a3);
                                                try {
                                                    if (ar5Var.m3197l0().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                        d76 d76Var5 = oa6Var.f26514f;
                                                        oa6.m9016l(d76Var5);
                                                        d76Var5.f16835j.m12505b(d76.m4401y(str), "Failed to insert event filter (got -1). appId");
                                                    }
                                                    it3 = it4;
                                                    sQLiteDatabaseM3197l0 = sQLiteDatabase;
                                                    size = i;
                                                    b46Var = b46Var2;
                                                    i8 = i2;
                                                } catch (SQLiteException e2) {
                                                    d76 d76Var6 = oa6Var.f26514f;
                                                    oa6.m9016l(d76Var6);
                                                    d76Var6.f16835j.m12506c("Error storing event filter. appId", d76.m4401y(str), e2);
                                                }
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabase.endTransaction();
                                            throw th;
                                        }
                                        ar5Var.m10368u();
                                        ar5Var.mo5038t();
                                        y42.m12851X(str);
                                        SQLiteDatabase sQLiteDatabaseM3197l2 = ar5Var.m3197l0();
                                        sQLiteDatabaseM3197l2.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iM3440p)});
                                        sQLiteDatabaseM3197l2.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iM3440p)});
                                        break;
                                    }
                                    sQLiteDatabaseM3197l0 = sQLiteDatabase;
                                    size = i;
                                    i7 = i2;
                                    break;
                                }
                                if (!((u46) it2.next()).m11239o()) {
                                    d76 d76Var7 = oa6Var.f26514f;
                                    oa6.m9016l(d76Var7);
                                    d76Var7.f16838m.m12506c("Property filter with no ID. Audience definition ignored. appId, audienceId", d76.m4401y(str), Integer.valueOf(iM3440p));
                                }
                            }
                        } else if (!((f46) it.next()).m5510o()) {
                            d76 d76Var8 = oa6Var.f26514f;
                            oa6.m9016l(d76Var8);
                            d76Var8.f16838m.m12506c("Event filter with no ID. Audience definition ignored. appId, audienceId", d76.m4401y(str), Integer.valueOf(iM3440p));
                        }
                    }
                } else {
                    d76 d76Var9 = oa6Var.f26514f;
                    oa6.m9016l(d76Var9);
                    d76Var9.f16838m.m12505b(d76.m4401y(str), "Audience with no ID. appId");
                }
                i7 = i8;
            }
            sQLiteDatabase = sQLiteDatabaseM3197l0;
            ArrayList arrayList2 = new ArrayList();
            int size2 = arrayList.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj = arrayList.get(i9);
                i9++;
                b46 b46Var3 = (b46) obj;
                arrayList2.add(b46Var3.m3439o() ? Integer.valueOf(b46Var3.m3440p()) : null);
            }
            y42.m12851X(str);
            ar5Var.m10368u();
            ar5Var.mo5038t();
            SQLiteDatabase sQLiteDatabaseM3197l3 = ar5Var.m3197l0();
            try {
                long jM3178Q = ar5Var.m3178Q("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, oa6Var.f26512d.m9223C(str, e56.f17757U)));
                if (jM3178Q > iMax) {
                    ArrayList arrayList3 = new ArrayList();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList2.size()) {
                            String strJoin = TextUtils.join(",", arrayList3);
                            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb.append("(");
                            sb.append(strJoin);
                            sb.append(")");
                            String string = sb.toString();
                            StringBuilder sb2 = new StringBuilder(string.length() + 140);
                            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb2.append(string);
                            sb2.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseM3197l3.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i10);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i10++;
                    }
                }
            } catch (SQLiteException e3) {
                d76 d76Var10 = oa6Var.f26514f;
                oa6.m9016l(d76Var10);
                d76Var10.f16835j.m12506c("Database error querying filters. appId", d76.m4401y(str), e3);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                l66Var5.m11054c();
                l66Var = l66Var5;
                try {
                    ((n66) l66Var.f31181b).m8554H();
                    bArrM5118a = ((n66) l66Var.m11056e()).m5118a();
                } catch (RuntimeException e4) {
                    e = e4;
                    d76 d76Var11 = ((oa6) this.f36084a).f26514f;
                    oa6.m9016l(d76Var11);
                    d76Var11.f16838m.m12506c("Unable to serialize reduced-size config. Storing full config instead. appId", d76.m4401y(str), e);
                    bArrM5118a = bArr;
                }
            } catch (RuntimeException e5) {
                e = e5;
                l66Var = l66Var5;
            }
            ar5 ar5Var2 = qm6Var4.f28593c;
            qm6.m9925S(ar5Var2);
            oa6 oa6Var2 = (oa6) ar5Var2.f36084a;
            y42.m12851X(str);
            ar5Var2.mo5038t();
            ar5Var2.m10368u();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", bArrM5118a);
            contentValues3.put("config_last_modified_time", str2);
            contentValues3.put("e_tag", str3);
            try {
                if (ar5Var2.m3197l0().update("apps", contentValues3, "app_id = ?", new String[]{str}) == 0) {
                    d76 d76Var12 = oa6Var2.f26514f;
                    oa6.m9016l(d76Var12);
                    d76Var12.f16835j.m12505b(d76.m4401y(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e6) {
                d76 d76Var13 = oa6Var2.f26514f;
                oa6.m9016l(d76Var13);
                d76Var13.f16835j.m12506c("Error storing remote config. appId", d76.m4401y(str), e6);
            }
            l66Var.m11054c();
            ((n66) l66Var.f31181b).m8555I();
            c0805jo3.put(str, (n66) l66Var.m11056e());
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = sQLiteDatabaseM3197l0;
        }
    }

    /* JADX INFO: renamed from: J */
    public final boolean m8645J(String str, String str2) {
        Boolean bool;
        mo5038t();
        m8638A(str);
        if ("1".equals(mo7575a(str, "measurement.upload.blacklist_internal")) && dn6.m4569S(str2)) {
            return true;
        }
        if ("1".equals(mo7575a(str, "measurement.upload.blacklist_public")) && dn6.m4576t0(str2)) {
            return true;
        }
        Map map = (Map) this.f25583j.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: K */
    public final boolean m8646K(String str, String str2) {
        Boolean bool;
        mo5038t();
        m8638A(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f25584k.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: L */
    public final int m8647L(String str, String str2) {
        Integer num;
        mo5038t();
        m8638A(str);
        Map map = (Map) this.f25586m.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: M */
    public final boolean m8648M(String str) {
        mo5038t();
        m8638A(str);
        C0805jo c0805jo = this.f25582i;
        if (c0805jo.get(str) != null) {
            return ((Set) c0805jo.get(str)).contains("os_version") || ((Set) c0805jo.get(str)).contains("device_info");
        }
        return false;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m8649N(String str) {
        mo5038t();
        m8638A(str);
        C0805jo c0805jo = this.f25582i;
        return c0805jo.get(str) != null && ((Set) c0805jo.get(str)).contains("app_instance_id");
    }

    /* JADX INFO: renamed from: O */
    public final boolean m8650O(String str, vc6 vc6Var) {
        mo5038t();
        m8638A(str);
        a66 a66VarM8651P = m8651P(str);
        if (a66VarM8651P == null) {
            return false;
        }
        for (a56 a56Var : a66VarM8651P.m106o()) {
            if (vc6Var == m8637F(a56Var.m98o())) {
                return a56Var.m99p() == 2;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: P */
    public final a66 m8651P(String str) {
        mo5038t();
        m8638A(str);
        n66 n66VarM8642G = m8642G(str);
        if (n66VarM8642G == null || !n66VarM8642G.m8549A()) {
            return null;
        }
        return n66VarM8642G.m8550B();
    }

    @Override // p000.kp5
    /* JADX INFO: renamed from: a */
    public final String mo7575a(String str, String str2) {
        mo5038t();
        m8638A(str);
        Map map = (Map) this.f25581h.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public final rc6 m8652y(String str, vc6 vc6Var) {
        mo5038t();
        m8638A(str);
        a66 a66VarM8651P = m8651P(str);
        if (a66VarM8651P != null) {
            for (a56 a56Var : a66VarM8651P.m111t()) {
                if (m8637F(a56Var.m98o()) == vc6Var) {
                    int iM99p = a56Var.m99p() - 1;
                    if (iM99p == 1) {
                        return rc6.GRANTED;
                    }
                    if (iM99p != 2) {
                        break;
                    }
                    return rc6.DENIED;
                }
            }
        }
        return rc6.UNINITIALIZED;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m8653z(String str) {
        mo5038t();
        m8638A(str);
        a66 a66VarM8651P = m8651P(str);
        if (a66VarM8651P == null) {
            return false;
        }
        for (a56 a56Var : a66VarM8651P.m106o()) {
            if (a56Var.m98o() == 3 && a56Var.m100q() == 3) {
                return true;
            }
        }
        return false;
    }
}
