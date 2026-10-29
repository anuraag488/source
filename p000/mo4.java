package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mo4 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f25084t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ no4 f25085u;

    /* JADX INFO: renamed from: v */
    public int f25086v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo4(no4 no4Var, ym0 ym0Var) {
        super(ym0Var);
        this.f25085u = no4Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f25084t = obj;
        this.f25086v |= Integer.MIN_VALUE;
        return this.f25085u.m8804c(null, null, this);
    }
}
