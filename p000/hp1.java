package p000;

/* JADX INFO: loaded from: classes.dex */
public final class hp1 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f20764t;

    /* JADX INFO: renamed from: u */
    public int f20765u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ c11 f20766v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp1(c11 c11Var, wm0 wm0Var) {
        super(wm0Var);
        this.f20766v = c11Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f20764t = obj;
        this.f20765u |= Integer.MIN_VALUE;
        return this.f20766v.emit(null, this);
    }
}
