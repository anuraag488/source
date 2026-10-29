package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: nz */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0964nz {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ cf0 f26206a;

    /* JADX INFO: renamed from: a */
    public void m8899a(f00 f00Var) {
        this.f26206a.m4989U(f00Var);
    }

    /* JADX INFO: renamed from: b */
    public void m8900b(f00 f00Var, String str) {
        cf0 cf0Var = this.f26206a;
        tl0 tl0Var = new tl0();
        tl0Var.f31219a = f00Var;
        tl0Var.f31220b = str;
        VarHandle.storeStoreFence();
        cf0Var.m4989U(tl0Var);
    }
}
