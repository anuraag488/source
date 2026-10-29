package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vx4 implements jf2 {

    /* JADX INFO: renamed from: a */
    public hk4 f32911a;

    /* JADX INFO: renamed from: b */
    public int f32912b;

    /* JADX INFO: renamed from: c */
    public uo4 f32913c;

    /* JADX INFO: renamed from: d */
    public wp1 f32914d;

    @Override // p000.jf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo6529e(zq2 zq2Var, sq2 sq2Var, long j) {
        db3 db3VarMo5826e = sq2Var.mo5826e(kl0.m7532b(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(db3VarMo5826e.f16900b, kl0.m7538h(j));
        int i = db3VarMo5826e.f16899a;
        C0005a4 c0005a4 = new C0005a4((byte) 5);
        c0005a4.f88c = this;
        c0005a4.f89d = db3VarMo5826e;
        c0005a4.f87b = iMin;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(i, iMin, w71.f33134a, c0005a4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vx4) {
            vx4 vx4Var = (vx4) obj;
            if (this.f32911a == vx4Var.f32911a && this.f32912b == vx4Var.f32912b && this.f32913c.equals(vx4Var.f32913c) && z62.m13387o(this.f32914d, vx4Var.f32914d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f32914d.hashCode() + ((this.f32913c.hashCode() + zi4.m13609i(this.f32912b, this.f32911a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f32911a + ", cursorOffset=" + this.f32912b + ", transformedText=" + this.f32913c + ", textLayoutResultProvider=" + this.f32914d + ")";
    }
}
