package p000;

/* JADX INFO: renamed from: kb */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0829kb extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f23033t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0940nb f23034u;

    /* JADX INFO: renamed from: v */
    public int f23035v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0829kb(C0940nb c0940nb, ym0 ym0Var) {
        super(ym0Var);
        this.f23034u = c0940nb;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f23033t = obj;
        this.f23035v |= Integer.MIN_VALUE;
        return this.f23034u.m8668c(null, null, null, this);
    }
}
