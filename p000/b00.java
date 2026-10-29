package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b00 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ int f14975t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ int f14976u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b00(int i, wm0 wm0Var) {
        super(2, wm0Var);
        this.f14976u = i;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        b00 b00Var = new b00(this.f14976u, wm0Var);
        b00Var.f14975t = ((Number) obj).intValue();
        return b00Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((b00) create((wm0) obj2, Integer.valueOf(((Number) obj).intValue()))).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        int i = this.f14975t;
        ap0 ap0Var = ap0.f14763a;
        k43.m7376J(obj);
        return Boolean.valueOf(i > this.f14976u);
    }
}
