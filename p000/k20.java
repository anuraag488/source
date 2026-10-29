package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k20 extends st2 {

    /* JADX INFO: renamed from: a */
    public final zo2 f22824a;

    /* JADX INFO: renamed from: b */
    public final ry2 f22825b;

    /* JADX INFO: renamed from: c */
    public final mq1 f22826c;

    public k20(zo2 zo2Var, ry2 ry2Var, mq1 mq1Var) {
        this.f22824a = zo2Var;
        this.f22825b = ry2Var;
        this.f22826c = mq1Var;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        m20 m20Var = new m20();
        m20Var.f24584o = this.f22824a;
        m20Var.f24585p = this.f22825b;
        m20Var.f24586q = this.f22826c;
        m20Var.f24587r = true;
        n20 n20Var = new n20();
        n20Var.f25397b = 9205357640488583168L;
        n20Var.f25398c = 9205357640488583168L;
        n20Var.f25400e = 9205357640488583168L;
        n20Var.f25401f = 9205357640488583168L;
        n20Var.f25402g = k43.m7398w(null);
        n20Var.f25404i = 0L;
        VarHandle.storeStoreFence();
        m20Var.f24588s = n20Var;
        VarHandle.storeStoreFence();
        return m20Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k20)) {
            return false;
        }
        k20 k20Var = (k20) obj;
        return z62.m13387o(k20Var.f22824a, this.f22824a) && z62.m13387o(k20Var.f22825b, this.f22825b) && k20Var.f22826c == this.f22826c;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        m20 m20Var = (m20) mt2Var;
        m20Var.f24584o = this.f22824a;
        m20Var.f24585p = this.f22825b;
        m20Var.f24586q = this.f22826c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f22826c.hashCode() + ((this.f22825b.hashCode() + (this.f22824a.hashCode() * 31)) * 31)) * 31);
    }
}
