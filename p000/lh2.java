package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lh2 {

    /* JADX INFO: renamed from: a */
    public gu3 f24032a;

    /* JADX INFO: renamed from: b */
    public C0725hh f24033b;

    /* JADX INFO: renamed from: c */
    public lw2 f24034c;

    /* JADX INFO: renamed from: a */
    public final mq1 m7969a(int i, Object obj, Object obj2) {
        lw2 lw2Var = this.f24034c;
        kh2 kh2Var = (kh2) lw2Var.m8132g(obj);
        if (kh2Var != null && kh2Var.f23126c == i && z62.m13387o(kh2Var.f23125b, obj2)) {
            return kh2Var.m7519a();
        }
        kh2 kh2Var2 = new kh2();
        kh2Var2.f23128e = this;
        kh2Var2.f23124a = obj;
        kh2Var2.f23125b = obj2;
        kh2Var2.f23126c = i;
        VarHandle.storeStoreFence();
        lw2Var.m8138m(obj, kh2Var2);
        return kh2Var2.m7519a();
    }

    /* JADX INFO: renamed from: b */
    public final Object m7970b(Object obj) {
        if (obj == null) {
            return null;
        }
        kh2 kh2Var = (kh2) this.f24034c.m8132g(obj);
        if (kh2Var != null) {
            return kh2Var.f23125b;
        }
        hi2 hi2Var = (hi2) this.f24033b.invoke();
        int iM7080e = hi2Var.f20600d.m7080e(obj);
        if (iM7080e != -1) {
            return hi2Var.m6408b(iM7080e);
        }
        return null;
    }
}
