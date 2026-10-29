package p000;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ue1 extends d12 {

    /* JADX INFO: renamed from: a */
    public p83 f31802a;

    /* JADX INFO: renamed from: b */
    public jf1 f31803b;

    /* JADX INFO: renamed from: c */
    public String f31804c;

    /* JADX INFO: renamed from: d */
    public Closeable f31805d;

    /* JADX INFO: renamed from: e */
    public boolean f31806e;

    /* JADX INFO: renamed from: f */
    public ak3 f31807f;

    @Override // p000.d12, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f31806e = true;
            ak3 ak3Var = this.f31807f;
            if (ak3Var != null) {
                AbstractC0707h.m6198a(ak3Var);
            }
            Closeable closeable = this.f31805d;
            if (closeable != null) {
                AbstractC0707h.m6198a(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.d12
    /* JADX INFO: renamed from: j */
    public final synchronized k40 mo4278j() {
        if (this.f31806e) {
            throw new IllegalStateException("closed");
        }
        ak3 ak3Var = this.f31807f;
        if (ak3Var != null) {
            return ak3Var;
        }
        ak3 ak3Var2 = new ak3(this.f31803b.mo3781u(this.f31802a));
        this.f31807f = ak3Var2;
        return ak3Var2;
    }
}
