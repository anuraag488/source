package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class df1 extends ym0 {

    /* JADX INFO: renamed from: t */
    public bf1 f17006t;

    /* JADX INFO: renamed from: u */
    public boolean f17007u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f17008v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ ff1 f17009w;

    /* JADX INFO: renamed from: x */
    public int f17010x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df1(ff1 ff1Var, ym0 ym0Var) {
        super(ym0Var);
        this.f17009w = ff1Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f17008v = obj;
        this.f17010x |= Integer.MIN_VALUE;
        return this.f17009w.m5699a(null, this);
    }
}
