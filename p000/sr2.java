package p000;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sr2 extends qs5 {

    /* JADX INFO: renamed from: l */
    @s24("Code")
    private final int f30526l;

    /* JADX INFO: renamed from: m */
    @s24("Message")
    private final String f30527m;

    /* JADX INFO: renamed from: n */
    @s24("Domain")
    private final String f30528n;

    public sr2(String str, int i, String str2) {
        this.f30526l = i;
        this.f30527m = str;
        this.f30528n = str2;
    }

    /* JADX INFO: renamed from: U */
    public final Integer m10907U() {
        return Integer.valueOf(this.f30526l);
    }

    /* JADX INFO: renamed from: V */
    public final String m10908V() {
        return this.f30528n;
    }

    /* JADX INFO: renamed from: W */
    public final String m10909W() {
        return this.f30527m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr2)) {
            return false;
        }
        sr2 sr2Var = (sr2) obj;
        return this.f30526l == sr2Var.f30526l && z62.m13387o(this.f30527m, sr2Var.f30527m) && z62.m13387o(this.f30528n, sr2Var.f30528n);
    }

    public final int hashCode() {
        return this.f30528n.hashCode() + kx5.m7712i(Integer.hashCode(this.f30526l) * 31, this.f30527m);
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
