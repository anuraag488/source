package p000;

import com.google.android.libraries.ads.mobile.sdk.internal.util.AndroidBundleTypeAdapterFactory;
import java.lang.invoke.VarHandle;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mm2 extends qs5 {

    /* JADX INFO: renamed from: l */
    @s24("Code")
    private final lm2 f25022l;

    /* JADX INFO: renamed from: m */
    @s24("Message")
    private final String f25023m;

    /* JADX INFO: renamed from: n */
    @s24("Response Info")
    private final yo3 f25024n;

    public mm2(lm2 lm2Var, String str, yo3 yo3Var) {
        this.f25022l = lm2Var;
        this.f25023m = str;
        this.f25024n = yo3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2)) {
            return false;
        }
        mm2 mm2Var = (mm2) obj;
        return this.f25022l == mm2Var.f25022l && z62.m13387o(this.f25023m, mm2Var.f25023m) && z62.m13387o(this.f25024n, mm2Var.f25024n);
    }

    public final int hashCode() {
        int iM7712i = kx5.m7712i(this.f25022l.hashCode() * 31, this.f25023m);
        yo3 yo3Var = this.f25024n;
        return iM7712i + (yo3Var == null ? 0 : yo3Var.hashCode());
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
        km2 km2Var = new km2();
        cs4 cs4Var = new cs4(lm2.class);
        boolean z = cs4Var.f16430b == cs4Var.f16429a;
        sp4 sp4Var = new sp4();
        sp4Var.f30475c = km2Var;
        sp4Var.f30473a = cs4Var;
        sp4Var.f30474b = z;
        VarHandle.storeStoreFence();
        arrayList.add(sp4Var);
        gn1 gn1Var2 = gn1.f19971e;
        Objects.requireNonNull(gn1Var2);
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z2 = jb4.f22154a;
        HashMap map2 = new HashMap(map);
        new ArrayList(arrayList);
        new ArrayList(arrayList2);
        return new ou1(qb1Var, 1, map2, true, gn1Var2, arrayList3, i, i2, new ArrayList(arrayDeque)).m9275h(this);
    }
}
