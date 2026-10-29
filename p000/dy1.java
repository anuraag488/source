package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dy1 implements f74 {

    /* JADX INFO: renamed from: a */
    public kn1 f17489a;

    /* JADX INFO: renamed from: b */
    public boolean f17490b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ fy1 f17491c;

    @Override // p000.f74
    /* JADX INFO: renamed from: c */
    public final ym4 mo3367c() {
        return this.f17489a;
    }

    @Override // p000.f74, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        fy1 fy1Var = this.f17491c;
        if (this.f17490b) {
            return;
        }
        this.f17490b = true;
        kn1 kn1Var = this.f17489a;
        ym4 ym4Var = kn1Var.f23258e;
        kn1Var.f23258e = ym4.f35333d;
        ym4Var.mo7561a();
        ym4Var.mo7562b();
        fy1Var.f19413e = (byte) 3;
    }

    @Override // p000.f74
    /* JADX INFO: renamed from: d */
    public final void mo3368d(w30 w30Var, long j) {
        if (this.f17490b) {
            C1077qn.m9989o("closed");
        } else {
            zv4.m13807b(w30Var.f33056b, 0L, j);
            this.f17491c.f19412d.mo3368d(w30Var, j);
        }
    }

    @Override // p000.f74, java.io.Flushable
    public final void flush() {
        if (this.f17490b) {
            return;
        }
        this.f17491c.f19412d.flush();
    }
}
