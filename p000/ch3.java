package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ch3 implements yp1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ f32 f16021a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f16022b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ float f16023c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ float f16024d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ f32 f16025e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ f32 f16026f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ long f16027g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ pd4 f16028h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ long f16029i;

    @Override // p000.yp1
    public final Object invoke(Object obj) throws Throwable {
        float f;
        char c;
        long j;
        f32 f32Var = this.f16021a;
        boolean z = this.f16022b;
        float f2 = this.f16023c;
        float f3 = this.f16024d;
        f32 f32Var2 = this.f16025e;
        f32 f32Var3 = this.f16026f;
        long j2 = this.f16027g;
        pd4 pd4Var = this.f16028h;
        long j3 = this.f16029i;
        u31 u31Var = (u31) obj;
        float fFloatValue = ((Number) f32Var.f18708d.getValue()).floatValue() * 360.0f;
        if (z) {
            f = 360.0f;
            c = ' ';
            if (Float.intBitsToFloat((int) (u31Var.mo11227d() & 4294967295L)) <= Float.intBitsToFloat((int) (u31Var.mo11227d() >> 32))) {
                f2 += f3;
            }
        } else {
            f = 360.0f;
            c = ' ';
        }
        float fMo3572A0 = (f2 / ((float) (((double) u31Var.mo3572A0(Float.intBitsToFloat((int) (u31Var.mo11227d() >> c)))) * 3.141592653589793d))) * f;
        float fFloatValue2 = ((Number) f32Var3.f18708d.getValue()).floatValue() + ((Number) f32Var2.f18708d.getValue()).floatValue();
        long jMo11226a0 = u31Var.mo11226a0();
        jp0 jp0VarMo7035J = u31Var.mo7035J();
        long jM7219E = jp0VarMo7035J.m7219E();
        jp0VarMo7035J.m7248w().mo6253j();
        try {
            ((ar3) jp0VarMo7035J.f22481b).m3154x(jMo11226a0, fFloatValue2);
            j = jM7219E;
            try {
                eh3.m5128b(u31Var, Math.min(fFloatValue, fMo3572A0) + fFloatValue, (f - fFloatValue) - (Math.min(fFloatValue, fMo3572A0) * 2.0f), j2, pd4Var);
                eh3.m5128b(u31Var, 0.0f, fFloatValue, j3, pd4Var);
                d55.m4374s(jp0VarMo7035J, j);
                return ju4.f22634a;
            } catch (Throwable th) {
                th = th;
                d55.m4374s(jp0VarMo7035J, j);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j = jM7219E;
        }
    }
}
