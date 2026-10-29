package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pq4 extends ik1 implements RunnableFuture {

    /* JADX INFO: renamed from: h */
    public volatile oq4 f27898h;

    public pq4(Callable callable) {
        this.f27898h = new oq4(this, callable);
    }

    @Override // p000.AbstractC0782j1
    /* JADX INFO: renamed from: d */
    public final void mo3380d() {
        oq4 oq4Var;
        if (m6990q() && (oq4Var = this.f27898h) != null) {
            oq4Var.m9745c();
        }
        this.f27898h = null;
    }

    @Override // p000.AbstractC0782j1
    /* JADX INFO: renamed from: k */
    public final String mo3313k() {
        oq4 oq4Var = this.f27898h;
        if (oq4Var == null) {
            return super.mo3313k();
        }
        return "task=[" + oq4Var + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        oq4 oq4Var = this.f27898h;
        if (oq4Var != null) {
            oq4Var.run();
        }
        this.f27898h = null;
    }
}
