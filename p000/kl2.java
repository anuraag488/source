package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kl2 implements g24 {

    /* JADX INFO: renamed from: a */
    public g24 f23212a;

    /* JADX INFO: renamed from: b */
    public g24 f23213b;

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
    /* JADX INFO: renamed from: b */
    public final String mo3641b() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: c */
    public final zc6 mo4431c() {
        return rd4.f29190l;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: d */
    public final int mo4432d() {
        return 2;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: e */
    public final String mo4433e(int i) {
        ks5.m7598E(i, "kotlin.collections.LinkedHashMap");
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl2)) {
            return false;
        }
        kl2 kl2Var = (kl2) obj;
        return this.f23212a.equals(kl2Var.f23212a) && this.f23213b.equals(kl2Var.f23213b);
    }

    public final int hashCode() {
        return this.f23213b.hashCode() + ((this.f23212a.hashCode() + 710441009) * 31);
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: i */
    public final List mo4435i(int i) {
        ks5.m7598E(i, "kotlin.collections.LinkedHashMap");
        return v71.f32439a;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: j */
    public final g24 mo4436j(int i) {
        ks5.m7598E(i, "kotlin.collections.LinkedHashMap");
        int i2 = i % 2;
        if (i2 == 0) {
            return this.f23212a;
        }
        if (i2 == 1) {
            return this.f23213b;
        }
        C1077qn.m9989o("Unreached");
        return null;
    }

    @Override // p000.g24
    /* JADX INFO: renamed from: k */
    public final boolean mo4437k(int i) {
        ks5.m7598E(i, "kotlin.collections.LinkedHashMap");
        return false;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f23212a + ", " + this.f23213b + ')';
    }
}
