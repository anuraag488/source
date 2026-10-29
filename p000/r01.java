package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class r01 extends mt2 implements s31 {

    /* JADX INFO: renamed from: o */
    public jh2 f28923o;

    @Override // p000.mt2
    /* JADX INFO: renamed from: G0 */
    public final void mo26G0() {
        this.f28923o.f22281j = this;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: H0 */
    public final void mo27H0() {
        jh2 jh2Var = this.f28923o;
        jh2Var.m7126d();
        jh2Var.f22273b = null;
        jh2Var.f22274c = -1;
    }

    @Override // p000.s31
    /* JADX INFO: renamed from: S */
    public final void mo3550S(yf2 yf2Var) {
        j70 j70Var = yf2Var.f35194a;
        ArrayList arrayList = this.f28923o.f22280i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            fh2 fh2Var = (fh2) arrayList.get(i);
            bu1 bu1Var = fh2Var.f18996o;
            if (bu1Var != null) {
                long j = fh2Var.f18994m;
                long j2 = bu1Var.f15627t;
                float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
                float f2 = ((int) (j & 4294967295L)) - ((int) (4294967295L & j2));
                ((ar3) j70Var.f22064b.f22481b).m3130A(f, f2);
                try {
                    dt0.m4724z(yf2Var, bu1Var);
                    ((ar3) j70Var.f22064b.f22481b).m3130A(-f, -f2);
                } catch (Throwable th) {
                    ((ar3) j70Var.f22064b.f22481b).m3130A(-f, -f2);
                    throw th;
                }
            }
        }
        yf2Var.m13113a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r01) && z62.m13387o(this.f28923o, ((r01) obj).f28923o);
    }

    public final int hashCode() {
        return this.f28923o.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f28923o + ")";
    }
}
