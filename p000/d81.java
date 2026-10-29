package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d81 implements AutoCloseable {

    /* JADX INFO: renamed from: c */
    public static final d81 f16851c;

    /* JADX INFO: renamed from: d */
    public static hg3 f16852d;

    /* JADX INFO: renamed from: e */
    public static final c81 f16853e;

    /* JADX INFO: renamed from: a */
    public Object f16854a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f16855b;

    static {
        e81 e81Var = e81.f17875a;
        d81 d81Var = new d81();
        d81Var.f16854a = new Object();
        VarHandle.storeStoreFence();
        f16851c = d81Var;
        y71 y71Var = new y71(d81Var, -1, "Empty Process");
        y71Var.f34992h = d81Var;
        VarHandle.storeStoreFence();
        f16852d = y71Var;
        f16853e = new c81(-1L, -1L, "Empty Thread", y71Var);
        ke0.f23081a.incrementAndGet();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        e81.f17875a.close();
    }
}
