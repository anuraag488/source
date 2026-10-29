package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class s21 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f29828t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ v21 f29829u;

    /* JADX INFO: renamed from: v */
    public int f29830v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s21(v21 v21Var, ym0 ym0Var) {
        super(ym0Var);
        this.f29829u = v21Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f29828t = obj;
        this.f29830v |= Integer.MIN_VALUE;
        return this.f29829u.m11700Z0(this);
    }
}
