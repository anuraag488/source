package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f04 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f18640t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ g04 f18641u;

    /* JADX INFO: renamed from: v */
    public int f18642v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f04(g04 g04Var, ym0 ym0Var) {
        super(ym0Var);
        this.f18641u = g04Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f18640t = obj;
        this.f18642v |= Integer.MIN_VALUE;
        return this.f18641u.m5876e(this);
    }
}
