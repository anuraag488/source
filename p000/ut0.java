package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ut0 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f32151t;

    /* JADX INFO: renamed from: u */
    public int f32152u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C0806jp f32153v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut0(C0806jp c0806jp, wm0 wm0Var) {
        super(wm0Var);
        this.f32153v = c0806jp;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f32151t = obj;
        this.f32152u |= Integer.MIN_VALUE;
        return this.f32153v.emit(null, this);
    }
}
