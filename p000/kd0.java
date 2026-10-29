package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kd0 extends ym0 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f23071t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ ld0 f23072u;

    /* JADX INFO: renamed from: v */
    public int f23073v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd0(ld0 ld0Var, wm0 wm0Var) {
        super(wm0Var);
        this.f23072u = ld0Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f23071t = obj;
        this.f23073v |= Integer.MIN_VALUE;
        return this.f23072u.emit(null, this);
    }
}
