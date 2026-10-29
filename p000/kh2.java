package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kh2 {

    /* JADX INFO: renamed from: a */
    public Object f23124a;

    /* JADX INFO: renamed from: b */
    public Object f23125b;

    /* JADX INFO: renamed from: c */
    public int f23126c;

    /* JADX INFO: renamed from: d */
    public pg0 f23127d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ lh2 f23128e;

    /* JADX INFO: renamed from: a */
    public final mq1 m7519a() {
        pg0 pg0Var = this.f23127d;
        if (pg0Var != null) {
            return pg0Var;
        }
        lh2 lh2Var = this.f23128e;
        er1 er1Var = new er1((byte) 3);
        er1Var.f18412b = lh2Var;
        er1Var.f18413c = this;
        VarHandle.storeStoreFence();
        pg0 pg0Var2 = new pg0(818252804, true, er1Var);
        this.f23127d = pg0Var2;
        return pg0Var2;
    }
}
