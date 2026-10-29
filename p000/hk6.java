package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hk6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public long f20665a;

    /* JADX INFO: renamed from: b */
    public long f20666b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ yg3 f20667c;

    @Override // java.lang.Runnable
    public final void run() {
        ea6 ea6Var = ((oa6) ((vk6) this.f20667c.f35216c).f36084a).f26515g;
        oa6.m9016l(ea6Var);
        fk6 fk6Var = new fk6((byte) 0);
        fk6Var.f19064b = this;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(fk6Var);
    }
}
