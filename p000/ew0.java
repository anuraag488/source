package p000;

import android.content.Context;
import java.lang.invoke.VarHandle;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ew0 implements xv1, yv1 {

    /* JADX INFO: renamed from: a */
    public qg2 f18532a;

    /* JADX INFO: renamed from: b */
    public Context f18533b;

    /* JADX INFO: renamed from: c */
    public bi3 f18534c;

    /* JADX INFO: renamed from: d */
    public Set f18535d;

    /* JADX INFO: renamed from: e */
    public Executor f18536e;

    /* JADX INFO: renamed from: a */
    public final nr6 m5408a() {
        if (!lb5.m7908Q(this.f18533b)) {
            return y62.m12936B("");
        }
        Executor executor = this.f18536e;
        dw0 dw0Var = new dw0((byte) 0);
        dw0Var.f17454b = this;
        VarHandle.storeStoreFence();
        return y62.m12991r(dw0Var, executor);
    }

    /* JADX INFO: renamed from: b */
    public final void m5409b() {
        if (this.f18535d.size() <= 0) {
            y62.m12936B(null);
            return;
        }
        if (!lb5.m7908Q(this.f18533b)) {
            y62.m12936B(null);
            return;
        }
        Executor executor = this.f18536e;
        dw0 dw0Var = new dw0((byte) 1);
        dw0Var.f17454b = this;
        VarHandle.storeStoreFence();
        y62.m12991r(dw0Var, executor);
    }
}
