package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h32 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ float f20308t;

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        h32 h32Var = new h32(2, wm0Var);
        h32Var.f20308t = ((Number) obj).floatValue();
        return h32Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((h32) create((wm0) obj2, Float.valueOf(((Number) obj).floatValue()))).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        ap0 ap0Var = ap0.f14763a;
        k43.m7376J(obj);
        return Boolean.valueOf(this.f20308t > 0.0f);
    }
}
