package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z53 implements bi3 {

    /* JADX INFO: renamed from: c */
    public static final xd2 f35757c = new xd2(19);

    /* JADX INFO: renamed from: d */
    public static final jg0 f35758d = new jg0(5);

    /* JADX INFO: renamed from: a */
    public gx0 f35759a;

    /* JADX INFO: renamed from: b */
    public volatile bi3 f35760b;

    public z53(xd2 xd2Var, bi3 bi3Var) {
        this.f35759a = xd2Var;
        this.f35760b = bi3Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m13340a(gx0 gx0Var) {
        bi3 bi3Var;
        bi3 bi3Var2;
        bi3 bi3Var3 = this.f35760b;
        jg0 jg0Var = f35758d;
        if (bi3Var3 != jg0Var) {
            gx0Var.mo6188c(bi3Var3);
            return;
        }
        synchronized (this) {
            bi3Var = this.f35760b;
            if (bi3Var != jg0Var) {
                bi3Var2 = bi3Var;
            } else {
                gx0 gx0Var2 = this.f35759a;
                C1163sz c1163sz = new C1163sz((byte) 10);
                c1163sz.f30676b = gx0Var2;
                c1163sz.f30677c = gx0Var;
                VarHandle.storeStoreFence();
                this.f35759a = c1163sz;
                bi3Var2 = null;
            }
        }
        if (bi3Var2 != null) {
            gx0Var.mo6188c(bi3Var);
        }
    }

    @Override // p000.bi3
    public final Object get() {
        return this.f35760b.get();
    }
}
