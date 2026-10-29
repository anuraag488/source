package p000;

/* JADX INFO: loaded from: classes.dex */
public final class tt0 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f31404t;

    /* JADX INFO: renamed from: u */
    public int f31405u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ vt0 f31406v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt0(vt0 vt0Var, wm0 wm0Var) {
        super(wm0Var);
        this.f31406v = vt0Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f31404t = obj;
        this.f31405u |= Integer.MIN_VALUE;
        return this.f31406v.collect(null, this);
    }
}
