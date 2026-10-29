package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n44 extends st2 {

    /* JADX INFO: renamed from: a */
    public float f25444a;

    /* JADX INFO: renamed from: b */
    public p44 f25445b;

    /* JADX INFO: renamed from: c */
    public boolean f25446c;

    /* JADX INFO: renamed from: d */
    public long f25447d;

    /* JADX INFO: renamed from: e */
    public long f25448e;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        o04 o04Var = new o04((byte) 3);
        o04Var.f26271b = this;
        VarHandle.storeStoreFence();
        return new q00(o04Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n44)) {
            return false;
        }
        n44 n44Var = (n44) obj;
        if (!p11.m9352c(this.f25444a, n44Var.f25444a) || !z62.m13387o(this.f25445b, n44Var.f25445b) || this.f25446c != n44Var.f25446c) {
            return false;
        }
        long j = this.f25447d;
        long j2 = n44Var.f25447d;
        int i = pb0.f27502i;
        return ws4.m12408a(j, j2) && ws4.m12408a(this.f25448e, n44Var.f25448e);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        e13 e13Var;
        q00 q00Var = (q00) mt2Var;
        o04 o04Var = new o04((byte) 3);
        o04Var.f26271b = this;
        VarHandle.storeStoreFence();
        q00Var.f28116o = o04Var;
        if (q00Var.f25195a.f25208n && (e13Var = sc6.m10650V(q00Var, 2).f17628x) != null) {
            e13Var.m4897z1(o04Var, true);
        }
    }

    public final int hashCode() {
        int iM13611k = zi4.m13611k((this.f25445b.hashCode() + (Float.hashCode(this.f25444a) * 31)) * 31, 31, this.f25446c);
        long j = this.f25447d;
        int i = pb0.f27502i;
        return Long.hashCode(this.f25448e) + zi4.m13612l(iM13611k, j, 31);
    }

    public final String toString() {
        String strM9353d = p11.m9353d(this.f25444a);
        p44 p44Var = this.f25445b;
        boolean z = this.f25446c;
        String strM9470i = pb0.m9470i(this.f25447d);
        String strM9470i2 = pb0.m9470i(this.f25448e);
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append(strM9353d);
        sb.append(", shape=");
        sb.append(p44Var);
        sb.append(", clip=");
        sb.append(z);
        sb.append(", ambientColor=");
        sb.append(strM9470i);
        sb.append(", spotColor=");
        return zi4.m13623w(sb, strM9470i2, ")");
    }
}
