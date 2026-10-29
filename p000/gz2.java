package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gz2 {

    /* JADX INFO: renamed from: a */
    public final hz2 f20211a;

    /* JADX INFO: renamed from: b */
    public final List f20212b;

    /* JADX INFO: renamed from: c */
    public final List f20213c;

    /* JADX INFO: renamed from: d */
    public final int f20214d;

    /* JADX INFO: renamed from: e */
    public sl2 f20215e;

    public gz2(hz2 hz2Var, List list, List list2, int i) {
        this.f20211a = hz2Var;
        this.f20212b = list;
        this.f20213c = list2;
        this.f20214d = i;
    }

    /* JADX INFO: renamed from: a */
    public final List m6197a() {
        sl2 sl2Var = this.f20215e;
        if (sl2Var != null) {
            return sl2Var;
        }
        sl2 sl2VarM7680G = kx5.m7680G();
        sl2VarM7680G.addAll(this.f20212b);
        hz2 hz2Var = this.f20211a;
        if (hz2Var != null) {
            sl2VarM7680G.add(hz2Var);
        }
        sl2VarM7680G.addAll(this.f20213c);
        sl2 sl2VarM7740w = kx5.m7740w(sl2VarM7680G);
        this.f20215e = sl2VarM7740w;
        return sl2VarM7740w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gz2.class != obj.getClass()) {
            return false;
        }
        gz2 gz2Var = (gz2) obj;
        return this.f20214d == gz2Var.f20214d && m6197a().equals(gz2Var.m6197a());
    }

    public final int hashCode() {
        return m6197a().hashCode() + (this.f20214d * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f20214d + ", mergedHistory=" + m6197a() + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public gz2() {
        v71 v71Var = v71.f32439a;
        this(null, v71Var, v71Var, -1);
    }
}
