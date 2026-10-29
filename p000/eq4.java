package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class eq4 extends ym0 {

    /* JADX INFO: renamed from: t */
    public fq4 f18375t;

    /* JADX INFO: renamed from: u */
    public int[] f18376u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f18377v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ fq4 f18378w;

    /* JADX INFO: renamed from: x */
    public int f18379x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq4(fq4 fq4Var, wm0 wm0Var) {
        super(wm0Var);
        this.f18378w = fq4Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f18377v = obj;
        this.f18379x |= Integer.MIN_VALUE;
        return this.f18378w.emit(null, this);
    }
}
