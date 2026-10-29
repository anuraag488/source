package p000;

import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uy1 extends C1116rp {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ vy1 f32252n;

    public uy1(vy1 vy1Var) {
        this.f32252n = vy1Var;
    }

    @Override // p000.C1116rp
    /* JADX INFO: renamed from: j */
    public final void mo4413j() {
        this.f32252n.m12023e(9);
        oy1 oy1Var = this.f32252n.f32933b;
        synchronized (oy1Var) {
            long j = oy1Var.f27220n;
            long j2 = oy1Var.f27219m;
            if (j < j2) {
                return;
            }
            oy1Var.f27219m = j2 + 1;
            oy1Var.f27221o = System.nanoTime() + 1000000000;
            oy1Var.f27214h.m9124c(new my1(zi4.m13623w(new StringBuilder(), oy1Var.f27209c, " ping"), oy1Var, (byte) 0), 0L);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m11682k() {
        if (m10385i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
