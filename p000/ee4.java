package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ee4 {

    /* JADX INFO: renamed from: a */
    public final he4 f18032a;

    /* JADX INFO: renamed from: b */
    public jg2 f18033b;

    /* JADX INFO: renamed from: c */
    public final be4 f18034c;

    /* JADX INFO: renamed from: d */
    public final be4 f18035d;

    /* JADX INFO: renamed from: e */
    public final be4 f18036e;

    public ee4(he4 he4Var) {
        this.f18032a = he4Var;
        be4 be4Var = new be4((byte) 0);
        be4Var.f15226b = this;
        VarHandle.storeStoreFence();
        this.f18034c = be4Var;
        be4 be4Var2 = new be4((byte) 1);
        be4Var2.f15226b = this;
        VarHandle.storeStoreFence();
        this.f18035d = be4Var2;
        be4 be4Var3 = new be4((byte) 2);
        be4Var3.f15226b = this;
        VarHandle.storeStoreFence();
        this.f18036e = be4Var3;
    }

    /* JADX INFO: renamed from: a */
    public final jg2 m5105a() {
        jg2 jg2Var = this.f18033b;
        if (jg2Var != null) {
            return jg2Var;
        }
        C1077qn.m9987m("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
