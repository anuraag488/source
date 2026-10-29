package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tz3 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f31565t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ yz3 f31566u;

    /* JADX INFO: renamed from: v */
    public int f31567v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz3(yz3 yz3Var, ym0 ym0Var) {
        super(ym0Var);
        this.f31566u = yz3Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f31565t = obj;
        this.f31567v |= Integer.MIN_VALUE;
        return this.f31566u.m13284z(this);
    }
}
