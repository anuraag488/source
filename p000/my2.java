package p000;

/* JADX INFO: loaded from: classes.dex */
public final class my2 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f25293t;

    /* JADX INFO: renamed from: u */
    public int f25294u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C0806jp f25295v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my2(C0806jp c0806jp, wm0 wm0Var) {
        super(wm0Var);
        this.f25295v = c0806jp;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f25293t = obj;
        this.f25294u |= Integer.MIN_VALUE;
        return this.f25295v.emit(null, this);
    }
}
