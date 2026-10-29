package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ey1 extends zx1 {

    /* JADX INFO: renamed from: d */
    public boolean f18569d;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f36441b) {
            return;
        }
        if (!this.f18569d) {
            m13833a();
        }
        this.f36441b = true;
    }

    @Override // p000.zx1, p000.ja4
    /* JADX INFO: renamed from: w */
    public final long mo3038w(w30 w30Var, long j) throws IOException {
        if (j < 0) {
            C1077qn.m9988n(zi4.m13619s("byteCount < 0: ", j));
            return 0L;
        }
        if (this.f36441b) {
            C1077qn.m9989o("closed");
            return 0L;
        }
        if (this.f18569d) {
            return -1L;
        }
        long jMo3038w = super.mo3038w(w30Var, j);
        if (jMo3038w != -1) {
            return jMo3038w;
        }
        this.f18569d = true;
        m13833a();
        return -1L;
    }
}
