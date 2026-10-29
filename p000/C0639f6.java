package p000;

import android.os.Bundle;
import com.google.android.libraries.ads.mobile.sdk.internal.util.AndroidBundleTypeAdapterFactory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: renamed from: f6 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0639f6 {

    /* JADX INFO: renamed from: a */
    @s24("Adapter")
    private final String f18775a;

    /* JADX INFO: renamed from: b */
    @s24("Latency")
    private final long f18776b;

    /* JADX INFO: renamed from: c */
    @s24("Error")
    private final sr2 f18777c;

    /* JADX INFO: renamed from: d */
    @s24("Credentials")
    private final Bundle f18778d;

    /* JADX INFO: renamed from: e */
    @s24("Ad Source Name")
    private final String f18779e;

    /* JADX INFO: renamed from: f */
    @s24("Ad Source ID")
    private final String f18780f;

    /* JADX INFO: renamed from: g */
    @s24("Ad Source Instance Name")
    private final String f18781g;

    /* JADX INFO: renamed from: h */
    @s24("Ad Source Instance ID")
    private final String f18782h;

    public C0639f6(String str, long j, sr2 sr2Var, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f18775a = str;
        this.f18776b = j;
        this.f18777c = sr2Var;
        this.f18778d = bundle;
        this.f18779e = str2;
        this.f18780f = str3;
        this.f18781g = str4;
        this.f18782h = str5;
    }

    /* JADX INFO: renamed from: a */
    public final sr2 m5584a() {
        return this.f18777c;
    }

    /* JADX INFO: renamed from: b */
    public final String m5585b() {
        return this.f18775a;
    }

    /* JADX INFO: renamed from: c */
    public final Bundle m5586c() {
        return this.f18778d;
    }

    /* JADX INFO: renamed from: d */
    public final String m5587d() {
        return this.f18780f;
    }

    /* JADX INFO: renamed from: e */
    public final String m5588e() {
        return this.f18782h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0639f6)) {
            return false;
        }
        C0639f6 c0639f6 = (C0639f6) obj;
        return z62.m13387o(this.f18775a, c0639f6.f18775a) && this.f18776b == c0639f6.f18776b && z62.m13387o(this.f18777c, c0639f6.f18777c) && z62.m13387o(this.f18778d, c0639f6.f18778d) && z62.m13387o(this.f18779e, c0639f6.f18779e) && z62.m13387o(this.f18780f, c0639f6.f18780f) && z62.m13387o(this.f18781g, c0639f6.f18781g) && z62.m13387o(this.f18782h, c0639f6.f18782h);
    }

    /* JADX INFO: renamed from: f */
    public final String m5589f() {
        return this.f18781g;
    }

    /* JADX INFO: renamed from: g */
    public final long m5590g() {
        return this.f18776b;
    }

    /* JADX INFO: renamed from: h */
    public final String m5591h() {
        return this.f18779e;
    }

    public final int hashCode() {
        int iM13612l = zi4.m13612l(this.f18775a.hashCode() * 31, this.f18776b, 31);
        sr2 sr2Var = this.f18777c;
        return this.f18782h.hashCode() + kx5.m7712i(kx5.m7712i(kx5.m7712i((this.f18778d.hashCode() + ((iM13612l + (sr2Var == null ? 0 : sr2Var.hashCode())) * 31)) * 31, this.f18779e), this.f18780f), this.f18781g);
    }

    public final String toString() {
        qb1 qb1Var = qb1.f28357c;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        gn1 gn1Var = ou1.f27107i;
        int i = ou1.f27109k;
        int i2 = ou1.f27110l;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayList.add(new AndroidBundleTypeAdapterFactory());
        gn1 gn1Var2 = gn1.f19971e;
        Objects.requireNonNull(gn1Var2);
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z = jb4.f22154a;
        HashMap map2 = new HashMap(map);
        new ArrayList(arrayList);
        new ArrayList(arrayList2);
        return new ou1(qb1Var, 1, map2, true, gn1Var2, arrayList3, i, i2, new ArrayList(arrayDeque)).m9275h(this);
    }
}
