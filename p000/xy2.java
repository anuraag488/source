package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xy2 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ C0910mi f34714A;

    /* JADX INFO: renamed from: t */
    public boolean f34715t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ wf4 f34716u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ float f34717v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ float f34718w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f34719x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ zx2 f34720y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ b33 f34721z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy2(wf4 wf4Var, float f, float f2, float f3, zx2 zx2Var, b33 b33Var, C0910mi c0910mi, wm0 wm0Var) {
        super(2, wm0Var);
        this.f34716u = wf4Var;
        this.f34717v = f;
        this.f34718w = f2;
        this.f34719x = f3;
        this.f34720y = zx2Var;
        this.f34721z = b33Var;
        this.f34714A = c0910mi;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        return new xy2(this.f34716u, this.f34717v, this.f34718w, this.f34719x, this.f34720y, this.f34721z, this.f34714A, wm0Var);
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((xy2) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f34715t;
        if (!z) {
            k43.m7376J(obj);
            wf4 wf4Var = this.f34716u;
            wf4 wf4Var2 = wf4.f33340b;
            float f = this.f34717v;
            l73 l73Var = wf4Var == wf4Var2 ? new l73(new Float(f), new Float(this.f34718w)) : new l73(new Float(this.f34719x), new Float(f));
            float fFloatValue = ((Number) l73Var.f23833a).floatValue();
            float fFloatValue2 = ((Number) l73Var.f23834b).floatValue();
            yx2 yx2Var = this.f34720y.f36443a;
            yx2 yx2Var2 = yx2.f35586c;
            b33 b33Var = this.f34721z;
            if (yx2Var == yx2Var2) {
                float fM13880o = zy5.m13880o(Float.intBitsToFloat((int) (b33Var.f15059a >> 32)), fFloatValue);
                float fM13880o2 = zy5.m13880o(Float.intBitsToFloat((int) (b33Var.f15059a & 4294967295L)), fFloatValue2);
                jFloatToRawIntBits = Float.floatToRawIntBits(fM13880o);
                iFloatToRawIntBits = Float.floatToRawIntBits(fM13880o2);
            } else {
                float fM13880o3 = zy5.m13880o(Float.intBitsToFloat((int) (b33Var.f15059a >> 32)), fFloatValue2);
                float fM13880o4 = zy5.m13880o(Float.intBitsToFloat((int) (b33Var.f15059a & 4294967295L)), fFloatValue);
                jFloatToRawIntBits = Float.floatToRawIntBits(fM13880o3);
                iFloatToRawIntBits = Float.floatToRawIntBits(fM13880o4);
            }
            b33 b33VarM3423a = b33.m3423a((jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L));
            db4 db4VarM10014I = qq2.m10014I(0.45f, 400.0f, null, 4);
            this.f34715t = true;
            if (C0910mi.m8325a(this.f34714A, b33VarM3423a, db4VarM10014I, null, this, 12) == ap0Var) {
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
