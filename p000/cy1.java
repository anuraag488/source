package p000;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cy1 extends zx1 {

    /* JADX INFO: renamed from: d */
    public long f16610d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ fy1 f16611e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy1(fy1 fy1Var, long j) {
        super(fy1Var);
        this.f16611e = fy1Var;
        this.f16610d = j;
        if (j == 0) {
            m13833a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM13824s;
        if (this.f36441b) {
            return;
        }
        if (this.f16610d != 0) {
            try {
                zM13824s = zv4.m13824s(this, 100);
            } catch (IOException unused) {
                zM13824s = false;
            }
            if (!zM13824s) {
                this.f16611e.f19410b.m6423c0();
                m13833a();
            }
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
        long j2 = this.f16610d;
        if (j2 == 0) {
            return -1L;
        }
        long jMo3038w = super.mo3038w(w30Var, Math.min(j2, j));
        if (jMo3038w == -1) {
            this.f16611e.f19410b.m6423c0();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m13833a();
            throw protocolException;
        }
        long j3 = this.f16610d - jMo3038w;
        this.f16610d = j3;
        if (j3 == 0) {
            m13833a();
        }
        return jMo3038w;
    }
}
