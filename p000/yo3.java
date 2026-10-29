package p000;

import android.os.Bundle;
import com.google.android.libraries.ads.mobile.sdk.internal.util.AndroidBundleTypeAdapterFactory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yo3 {

    /* JADX INFO: renamed from: a */
    @s24("Mediation Adapter Class Name")
    private final String f35424a;

    /* JADX INFO: renamed from: b */
    @s24("Response ID")
    private final String f35425b;

    /* JADX INFO: renamed from: c */
    @s24("Response Extras")
    private final Bundle f35426c;

    /* JADX INFO: renamed from: d */
    @s24("Loaded Ad Source Response Info")
    private final C0639f6 f35427d;

    /* JADX INFO: renamed from: e */
    @s24("Ad Source Responses")
    private final List<C0639f6> f35428e;

    public yo3(String str, String str2, Bundle bundle, C0639f6 c0639f6, List list) {
        this.f35424a = str;
        this.f35425b = str2;
        this.f35426c = bundle;
        this.f35427d = c0639f6;
        this.f35428e = list;
    }

    /* JADX INFO: renamed from: a */
    public final List m13205a() {
        return this.f35428e;
    }

    /* JADX INFO: renamed from: b */
    public final String m13206b() {
        return this.f35424a;
    }

    /* JADX INFO: renamed from: c */
    public final String m13207c() {
        return this.f35425b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yo3)) {
            return false;
        }
        yo3 yo3Var = (yo3) obj;
        return z62.m13387o(this.f35424a, yo3Var.f35424a) && z62.m13387o(this.f35425b, yo3Var.f35425b) && z62.m13387o(this.f35426c, yo3Var.f35426c) && z62.m13387o(this.f35427d, yo3Var.f35427d) && z62.m13387o(this.f35428e, yo3Var.f35428e);
    }

    public final int hashCode() {
        String str = this.f35424a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f35425b;
        int iHashCode2 = (this.f35426c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        C0639f6 c0639f6 = this.f35427d;
        return this.f35428e.hashCode() + ((iHashCode2 + (c0639f6 != null ? c0639f6.hashCode() : 0)) * 31);
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
