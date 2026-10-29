package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class zx1 implements ja4 {

    /* JADX INFO: renamed from: a */
    public final kn1 f36440a;

    /* JADX INFO: renamed from: b */
    public boolean f36441b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fy1 f36442c;

    public zx1(fy1 fy1Var) {
        this.f36442c = fy1Var;
        this.f36440a = new kn1(fy1Var.f19411c.mo3025c());
    }

    /* JADX INFO: renamed from: a */
    public final void m13833a() {
        fy1 fy1Var = this.f36442c;
        byte b = fy1Var.f19413e;
        if (b == 6) {
            return;
        }
        if (b != 5) {
            throw new IllegalStateException("state: " + ((int) fy1Var.f19413e));
        }
        kn1 kn1Var = this.f36440a;
        ym4 ym4Var = kn1Var.f23258e;
        kn1Var.f23258e = ym4.f35333d;
        ym4Var.mo7561a();
        ym4Var.mo7562b();
        fy1Var.f19413e = (byte) 6;
    }

    @Override // p000.ja4
    /* JADX INFO: renamed from: c */
    public final ym4 mo3025c() {
        return this.f36440a;
    }

    @Override // p000.ja4
    /* JADX INFO: renamed from: w */
    public long mo3038w(w30 w30Var, long j) throws IOException {
        fy1 fy1Var = this.f36442c;
        try {
            return fy1Var.f19411c.mo3038w(w30Var, j);
        } catch (IOException e) {
            fy1Var.f19410b.m6423c0();
            m13833a();
            throw e;
        }
    }
}
