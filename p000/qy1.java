package p000;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qy1 implements ja4 {

    /* JADX INFO: renamed from: a */
    public ak3 f28875a;

    /* JADX INFO: renamed from: b */
    public int f28876b;

    /* JADX INFO: renamed from: c */
    public int f28877c;

    /* JADX INFO: renamed from: d */
    public int f28878d;

    /* JADX INFO: renamed from: e */
    public int f28879e;

    /* JADX INFO: renamed from: f */
    public int f28880f;

    @Override // p000.ja4
    /* JADX INFO: renamed from: c */
    public final ym4 mo3025c() {
        return this.f28875a.f14585a.mo3025c();
    }

    @Override // p000.ja4
    /* JADX INFO: renamed from: w */
    public final long mo3038w(w30 w30Var, long j) throws IOException {
        int i;
        int iM3029j;
        ak3 ak3Var = this.f28875a;
        do {
            int i2 = this.f28879e;
            if (i2 == 0) {
                ak3Var.m3037t(this.f28880f);
                this.f28880f = 0;
                if ((this.f28877c & 4) == 0) {
                    i = this.f28878d;
                    int iM13823r = zv4.m13823r(ak3Var);
                    this.f28879e = iM13823r;
                    this.f28876b = iM13823r;
                    int iM3026e = ak3Var.m3026e() & 255;
                    this.f28877c = ak3Var.m3026e() & 255;
                    Logger logger = ry1.f29727d;
                    if (logger.isLoggable(Level.FINE)) {
                        s50 s50Var = gy1.f20183a;
                        logger.fine(gy1.m6195a(true, this.f28878d, this.f28876b, iM3026e, this.f28877c));
                    }
                    iM3029j = ak3Var.m3029j() & Integer.MAX_VALUE;
                    this.f28878d = iM3029j;
                    if (iM3026e != 9) {
                        throw new IOException(iM3026e + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jMo3038w = ak3Var.mo3038w(w30Var, Math.min(j, i2));
                if (jMo3038w != -1) {
                    this.f28879e -= (int) jMo3038w;
                    return jMo3038w;
                }
            }
            return -1L;
        } while (iM3029j == i);
        wb1.m12191j("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
