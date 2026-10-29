package p000;

/* JADX INFO: renamed from: ce */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0524ce extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f15965t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0572de f15966u;

    /* JADX INFO: renamed from: v */
    public int f15967v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0524ce(C0572de c0572de, ym0 ym0Var) {
        super(ym0Var);
        this.f15966u = c0572de;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f15965t = obj;
        this.f15967v |= Integer.MIN_VALUE;
        return this.f15966u.m4488a(null, this);
    }
}
