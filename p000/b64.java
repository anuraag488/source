package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b64 extends ym0 {

    /* JADX INFO: renamed from: t */
    public nl3 f15124t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f15125u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ d64 f15126v;

    /* JADX INFO: renamed from: w */
    public int f15127w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b64(d64 d64Var, ym0 ym0Var) {
        super(ym0Var);
        this.f15126v = d64Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f15125u = obj;
        this.f15127w |= Integer.MIN_VALUE;
        return this.f15126v.m4384a(null, 0.0f, this);
    }
}
