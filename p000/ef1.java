package p000;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ef1 extends ym0 {

    /* JADX INFO: renamed from: t */
    public qu0 f18043t;

    /* JADX INFO: renamed from: u */
    public gx2 f18044u;

    /* JADX INFO: renamed from: v */
    public File f18045v;

    /* JADX INFO: renamed from: w */
    public sf1 f18046w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f18047x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ ff1 f18048y;

    /* JADX INFO: renamed from: z */
    public int f18049z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef1(ff1 ff1Var, ym0 ym0Var) {
        super(ym0Var);
        this.f18048y = ff1Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f18047x = obj;
        this.f18049z |= Integer.MIN_VALUE;
        return this.f18048y.m5700b(null, this);
    }
}
