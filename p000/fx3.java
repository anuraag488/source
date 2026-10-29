package p000;

/* JADX INFO: loaded from: classes.dex */
public final class fx3 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f19377t;

    /* JADX INFO: renamed from: u */
    public int f19378u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ gx3 f19379v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx3(gx3 gx3Var, wm0 wm0Var) {
        super(wm0Var);
        this.f19379v = gx3Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f19377t = obj;
        this.f19378u |= Integer.MIN_VALUE;
        return this.f19379v.emit(null, this);
    }
}
