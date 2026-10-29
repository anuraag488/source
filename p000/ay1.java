package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ay1 implements f74 {

    /* JADX INFO: renamed from: a */
    public kn1 f14940a;

    /* JADX INFO: renamed from: b */
    public boolean f14941b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ fy1 f14942c;

    @Override // p000.f74
    /* JADX INFO: renamed from: c */
    public final ym4 mo3367c() {
        return this.f14940a;
    }

    @Override // p000.f74, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f14941b) {
            return;
        }
        this.f14941b = true;
        this.f14942c.f19412d.mo6998F("0\r\n\r\n");
        kn1 kn1Var = this.f14940a;
        ym4 ym4Var = kn1Var.f23258e;
        kn1Var.f23258e = ym4.f35333d;
        ym4Var.mo7561a();
        ym4Var.mo7562b();
        this.f14942c.f19413e = (byte) 3;
    }

    @Override // p000.f74
    /* JADX INFO: renamed from: d */
    public final void mo3368d(w30 w30Var, long j) {
        j40 j40Var = this.f14942c.f19412d;
        if (this.f14941b) {
            C1077qn.m9989o("closed");
        } else {
            if (j == 0) {
                return;
            }
            j40Var.mo6999f(j);
            j40Var.mo6998F("\r\n");
            j40Var.mo3368d(w30Var, j);
            j40Var.mo6998F("\r\n");
        }
    }

    @Override // p000.f74, java.io.Flushable
    public final synchronized void flush() {
        if (this.f14941b) {
            return;
        }
        this.f14942c.f19412d.flush();
    }
}
