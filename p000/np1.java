package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class np1 extends ym0 {

    /* JADX INFO: renamed from: t */
    public ip1 f26010t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f26011u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ pp1 f26012v;

    /* JADX INFO: renamed from: w */
    public int f26013w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np1(pp1 pp1Var, ym0 ym0Var) {
        super(ym0Var);
        this.f26012v = pp1Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f26011u = obj;
        this.f26013w |= Integer.MIN_VALUE;
        return this.f26012v.m9597d(null, this);
    }
}
