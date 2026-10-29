package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class td0 extends q62 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud0 f31085c;

    /* JADX INFO: renamed from: d */
    public final y65 f31086d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ud0 f31087e;

    public td0(ud0 ud0Var, y65 y65Var) {
        this.f31087e = ud0Var;
        this.f31085c = ud0Var;
        this.f31086d = y65Var;
    }

    @Override // p000.q62
    /* JADX INFO: renamed from: a */
    public final void mo9238a(Throwable th) {
        ud0 ud0Var = this.f31085c;
        ud0Var.f31791p = null;
        if (th instanceof ExecutionException) {
            ud0Var.m6987n(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            ud0Var.cancel(false);
        } else {
            ud0Var.m6987n(th);
        }
    }

    @Override // p000.q62
    /* JADX INFO: renamed from: b */
    public final void mo9239b(Object obj) {
        this.f31085c.f31791p = null;
        this.f31087e.m6986m(obj);
    }

    @Override // p000.q62
    /* JADX INFO: renamed from: d */
    public final boolean mo9240d() {
        return this.f31085c.isDone();
    }

    @Override // p000.q62
    /* JADX INFO: renamed from: e */
    public final Object mo9241e() {
        return this.f31086d.call();
    }

    @Override // p000.q62
    /* JADX INFO: renamed from: f */
    public final String mo9242f() {
        return this.f31086d.toString();
    }
}
