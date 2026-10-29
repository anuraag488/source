package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mx4 {

    /* JADX INFO: renamed from: a */
    public final dp2 f25284a;

    public mx4() {
        dp2 dp2Var = new dp2();
        kx4 kx4Var = kx4.f23586a;
        dp2Var.f17255b = new lx4();
        dp2Var.f17256c = new lx4();
        VarHandle.storeStoreFence();
        this.f25284a = dp2Var;
    }

    /* JADX INFO: renamed from: a */
    public final long m8426a(long j) {
        dp2 dp2Var = this.f25284a;
        dp2Var.getClass();
        if (jx4.m7332c(j) <= 0.0f || jx4.m7333d(j) <= 0.0f) {
            q32.m9721c("maximumVelocity should be a positive value. You specified=".concat(jx4.m7337h(j)));
        }
        return qs5.m10097b(((lx4) dp2Var.f17255b).m8147c(jx4.m7332c(j)), ((lx4) dp2Var.f17256c).m8147c(jx4.m7333d(j)));
    }
}
