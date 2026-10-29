package p000;

/* JADX INFO: renamed from: n2 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0931n2 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public boolean f25392t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ iy3 f25393u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ float f25394v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ float f25395w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0931n2(iy3 iy3Var, float f, float f2, wm0 wm0Var) {
        super(2, wm0Var);
        this.f25393u = iy3Var;
        this.f25394v = f;
        this.f25395w = f2;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        return new C0931n2(this.f25393u, this.f25394v, this.f25395w, wm0Var);
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((C0931n2) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f25392t;
        if (!z) {
            k43.m7376J(obj);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f25394v)) << 32) | (((long) Float.floatToRawIntBits(this.f25395w)) & 4294967295L);
            this.f25392t = true;
            if (dy3.m4798b(this.f25393u.f21891R, jFloatToRawIntBits, this) == ap0Var) {
                return ap0Var;
            }
        } else {
            if (!z) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj);
        }
        return ju4.f22634a;
    }
}
