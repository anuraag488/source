package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cu4 extends of4 implements oq1 {

    /* JADX INFO: renamed from: t */
    public boolean f16496t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Throwable f16497u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ long f16498v;

    @Override // p000.oq1
    /* JADX INFO: renamed from: g */
    public final Object mo183g(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        cu4 cu4Var = new cu4(4, (wm0) obj4);
        cu4Var.f16497u = (Throwable) obj2;
        cu4Var.f16498v = jLongValue;
        return cu4Var.invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f16496t;
        if (!z) {
            k43.m7376J(obj);
            Throwable th = this.f16497u;
            long j = this.f16498v;
            wn2.m12326e().m12330d(du4.f17414a, "Cannot check for unfinished work", th);
            long jMin = Math.min(j * 30000, du4.f17415b);
            this.f16496t = true;
            if (d24.m4317r(jMin, this) == ap0Var) {
                return ap0Var;
            }
        } else {
            if (!z) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj);
        }
        return Boolean.TRUE;
    }
}
