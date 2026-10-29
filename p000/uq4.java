package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class uq4 {
    /* JADX INFO: renamed from: a */
    public final tq4 m11626a() {
        if (this instanceof tq4) {
            return (tq4) this;
        }
        tq4 tq4Var = new tq4();
        tq4Var.f31339a = this;
        VarHandle.storeStoreFence();
        return tq4Var;
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo166b(kb2 kb2Var);

    /* JADX INFO: renamed from: c */
    public abstract void mo167c(yb2 yb2Var, Object obj);
}
