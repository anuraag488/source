package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ka4 extends d12 {

    /* JADX INFO: renamed from: a */
    public final zc6 f23028a;

    /* JADX INFO: renamed from: b */
    public boolean f23029b;

    /* JADX INFO: renamed from: c */
    public k40 f23030c;

    public ka4(k40 k40Var, zc6 zc6Var) {
        this.f23028a = zc6Var;
        this.f23030c = k40Var;
    }

    @Override // p000.d12, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f23029b = true;
        k40 k40Var = this.f23030c;
        if (k40Var != null) {
            AbstractC0707h.m6198a(k40Var);
        }
    }

    @Override // p000.d12
    /* JADX INFO: renamed from: g */
    public final zc6 mo4277g() {
        return this.f23028a;
    }

    @Override // p000.d12
    /* JADX INFO: renamed from: j */
    public final synchronized k40 mo4278j() {
        if (this.f23029b) {
            throw new IllegalStateException("closed");
        }
        k40 k40Var = this.f23030c;
        if (k40Var != null) {
            return k40Var;
        }
        ak3 ak3Var = new ak3(jf1.f22209a.mo3781u(null));
        this.f23030c = ak3Var;
        return ak3Var;
    }
}
