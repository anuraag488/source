package p000;

import java.util.List;

/* JADX INFO: renamed from: wo */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1301wo extends ym0 {

    /* JADX INFO: renamed from: t */
    public List f33528t;

    /* JADX INFO: renamed from: u */
    public vt1 f33529u;

    /* JADX INFO: renamed from: v */
    public int f33530v;

    /* JADX INFO: renamed from: w */
    public int f33531w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f33532x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1375yo f33533y;

    /* JADX INFO: renamed from: z */
    public int f33534z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1301wo(C1375yo c1375yo, ym0 ym0Var) {
        super(ym0Var);
        this.f33533y = c1375yo;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f33532x = obj;
        this.f33534z |= Integer.MIN_VALUE;
        return this.f33533y.m13186a(this);
    }
}
