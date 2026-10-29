package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class xl2 implements g24 {

    /* JADX INFO: renamed from: a */
    public final g24 f34386a;

    public xl2(g24 g24Var) {
        this.f34386a = g24Var;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: a */
    public final int mo4430a(String str) {
        Integer numM9044Y = od4.m9044Y(str);
        if (numM9044Y == null) {
            return -3;
        }
        if (numM9044Y.intValue() < 0) {
            numM9044Y = null;
        }
        if (numM9044Y != null) {
            return numM9044Y.intValue();
        }
        return -3;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: c */
    public final zc6 mo4431c() {
        return rd4.f29189k;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: d */
    public final int mo4432d() {
        return 1;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: e */
    public final String mo4433e(int i) {
        ks5.m7598E(i, mo3641b());
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl2)) {
            return false;
        }
        xl2 xl2Var = (xl2) obj;
        return this.f34386a.equals(xl2Var.f34386a) && z62.m13387o(mo3641b(), xl2Var.mo3641b());
    }

    public final int hashCode() {
        return mo3641b().hashCode() + (this.f34386a.hashCode() * 31);
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: i */
    public final List mo4435i(int i) {
        ks5.m7598E(i, mo3641b());
        return v71.f32439a;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: j */
    public final g24 mo4436j(int i) {
        ks5.m7598E(i, mo3641b());
        return this.f34386a;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: k */
    public final boolean mo4437k(int i) {
        ks5.m7598E(i, mo3641b());
        return false;
    }

    public final String toString() {
        return mo3641b() + '(' + this.f34386a + ')';
    }
}
