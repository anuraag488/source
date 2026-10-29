package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xa1 {

    /* JADX INFO: renamed from: a */
    public bi3 f34096a;

    /* JADX INFO: renamed from: a */
    public final void m12641a(d34 d34Var) {
        kp4 kp4Var = (kp4) this.f34096a.get();
        j81 j81VarM7046a = j81.m7046a("json");
        nm0 nm0Var = new nm0((byte) 29);
        VarHandle.storeStoreFence();
        ((lp4) kp4Var).m8072a("FIREBASE_APPQUALITY_SESSION", j81VarM7046a, nm0Var).m10464w(new C1417zt(d34Var, ag3.f14485a), new ds3((byte) 22));
    }
}
