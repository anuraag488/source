package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hx1 implements jf2 {

    /* JADX INFO: renamed from: a */
    public hk4 f20907a;

    /* JADX INFO: renamed from: b */
    public int f20908b;

    /* JADX INFO: renamed from: c */
    public uo4 f20909c;

    /* JADX INFO: renamed from: d */
    public wp1 f20910d;

    @Override // p000.jf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo6529e(zq2 zq2Var, sq2 sq2Var, long j) {
        long j2;
        if (sq2Var.mo5824Z(kl0.m7538h(j)) < kl0.m7539i(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = kl0.m7532b(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        db3 db3VarMo5826e = sq2Var.mo5826e(j);
        int iMin = Math.min(db3VarMo5826e.f16899a, kl0.m7539i(j2));
        int i = db3VarMo5826e.f16900b;
        uy0 uy0Var = new uy0((byte) 1);
        uy0Var.f32249c = this;
        uy0Var.f32250d = zq2Var;
        uy0Var.f32251e = db3VarMo5826e;
        uy0Var.f32248b = iMin;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(iMin, i, w71.f33134a, uy0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hx1) {
            hx1 hx1Var = (hx1) obj;
            if (this.f20907a == hx1Var.f20907a && this.f20908b == hx1Var.f20908b && this.f20909c.equals(hx1Var.f20909c) && z62.m13387o(this.f20910d, hx1Var.f20910d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f20910d.hashCode() + ((this.f20909c.hashCode() + zi4.m13609i(this.f20908b, this.f20907a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f20907a + ", cursorOffset=" + this.f20908b + ", transformedText=" + this.f20909c + ", textLayoutResultProvider=" + this.f20910d + ")";
    }
}
