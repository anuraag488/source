package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class it3 extends ym0 {

    /* JADX INFO: renamed from: t */
    public gx2 f21770t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f21771u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C1122rv f21772v;

    /* JADX INFO: renamed from: w */
    public int f21773w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it3(C1122rv c1122rv, ym0 ym0Var) {
        super(ym0Var);
        this.f21772v = c1122rv;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f21771u = obj;
        this.f21773w |= Integer.MIN_VALUE;
        return this.f21772v.m10463v(this);
    }
}
