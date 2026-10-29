package p000;

import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tp4 extends n24 {

    /* JADX INFO: renamed from: a */
    public final km2 f31309a;

    /* JADX INFO: renamed from: b */
    public final ou1 f31310b;

    /* JADX INFO: renamed from: c */
    public final cs4 f31311c;

    /* JADX INFO: renamed from: d */
    public final vq4 f31312d;

    /* JADX INFO: renamed from: e */
    public final boolean f31313e;

    /* JADX INFO: renamed from: f */
    public volatile uq4 f31314f;

    public tp4(km2 km2Var, ou1 ou1Var, cs4 cs4Var, vq4 vq4Var, boolean z) {
        this.f31309a = km2Var;
        this.f31310b = ou1Var;
        this.f31311c = cs4Var;
        this.f31312d = vq4Var;
        this.f31313e = z;
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) {
        uq4 uq4VarM9272e = this.f31314f;
        if (uq4VarM9272e == null) {
            uq4VarM9272e = this.f31310b.m9272e(this.f31312d, this.f31311c);
            this.f31314f = uq4VarM9272e;
        }
        return uq4VarM9272e.mo166b(kb2Var);
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) throws IOException {
        if (this.f31309a == null) {
            uq4 uq4VarM9272e = this.f31314f;
            if (uq4VarM9272e == null) {
                uq4VarM9272e = this.f31310b.m9272e(this.f31312d, this.f31311c);
                this.f31314f = uq4VarM9272e;
            }
            uq4VarM9272e.mo167c(yb2Var, obj);
            return;
        }
        if (this.f31313e && obj == null) {
            yb2Var.mo12211t();
            return;
        }
        Type type = this.f31311c.f16430b;
        lm2 lm2Var = (lm2) obj;
        String str = lm2Var.name() + " (" + ((int) lm2Var.f24170a) + ")";
        gb2 gb2Var = new gb2();
        gb2Var.f19705a = str;
        VarHandle.storeStoreFence();
        ga2 ga2Var = zr4.f36319z;
        ga2Var.getClass();
        ga2Var.mo167c(gb2Var, yb2Var);
    }

    @Override // p000.n24
    /* JADX INFO: renamed from: d */
    public final uq4 mo8484d() {
        if (this.f31309a != null) {
            return this;
        }
        uq4 uq4Var = this.f31314f;
        if (uq4Var != null) {
            return uq4Var;
        }
        uq4 uq4VarM9272e = this.f31310b.m9272e(this.f31312d, this.f31311c);
        this.f31314f = uq4VarM9272e;
        return uq4VarM9272e;
    }
}
