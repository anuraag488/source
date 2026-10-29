package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class oq4 extends q62 {

    /* JADX INFO: renamed from: c */
    public final Callable f26965c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ pq4 f26966d;

    public oq4(pq4 pq4Var, Callable callable) {
        this.f26966d = pq4Var;
        callable.getClass();
        this.f26965c = callable;
    }

    @Override // p000.q62
    /* JADX INFO: renamed from: a */
    public final void mo9238a(Throwable th) {
        this.f26966d.m6987n(th);
    }

    @Override // p000.q62
    /* JADX INFO: renamed from: b */
    public final void mo9239b(Object obj) {
        this.f26966d.m6986m(obj);
    }

    @Override // p000.q62
    /* JADX INFO: renamed from: d */
    public final boolean mo9240d() {
        return this.f26966d.isDone();
    }

    @Override // p000.q62
    /* JADX INFO: renamed from: e */
    public final Object mo9241e() {
        return this.f26965c.call();
    }

    @Override // p000.q62
    /* JADX INFO: renamed from: f */
    public final String mo9242f() {
        return this.f26965c.toString();
    }
}
