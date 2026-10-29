package p000;

/* JADX INFO: loaded from: classes.dex */
public final class vj1 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f32665t;

    /* JADX INFO: renamed from: u */
    public int f32666u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C0806jp f32667v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj1(C0806jp c0806jp, wm0 wm0Var) {
        super(wm0Var);
        this.f32667v = c0806jp;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f32665t = obj;
        this.f32666u |= Integer.MIN_VALUE;
        return this.f32667v.emit(null, this);
    }
}
