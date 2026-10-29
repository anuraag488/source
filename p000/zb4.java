package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zb4 extends ym0 {

    /* JADX INFO: renamed from: A */
    public int f35920A;

    /* JADX INFO: renamed from: t */
    public ti1 f35921t;

    /* JADX INFO: renamed from: u */
    public cc4 f35922u;

    /* JADX INFO: renamed from: v */
    public t82 f35923v;

    /* JADX INFO: renamed from: w */
    public Object f35924w;

    /* JADX INFO: renamed from: x */
    public Object f35925x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f35926y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ ac4 f35927z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb4(ac4 ac4Var, wm0 wm0Var) {
        super(wm0Var);
        this.f35927z = ac4Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f35926y = obj;
        this.f35920A |= Integer.MIN_VALUE;
        this.f35927z.collect(null, this);
        return ap0.f14763a;
    }
}
