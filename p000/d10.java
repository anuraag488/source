package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d10 implements yp1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f16692a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ga4 f16693b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ long f16694c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ float f16695d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ float f16696e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ long f16697f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ long f16698g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ pd4 f16699h;

    @Override // p000.yp1
    public final Object invoke(Object obj) throws Throwable {
        long j;
        boolean z = this.f16692a;
        ga4 ga4Var = this.f16693b;
        long j2 = this.f16694c;
        float f = this.f16695d;
        float f2 = this.f16696e;
        long j3 = this.f16697f;
        long j4 = this.f16698g;
        pd4 pd4Var = this.f16699h;
        yf2 yf2Var = (yf2) obj;
        yf2Var.m13113a();
        j70 j70Var = yf2Var.f35194a;
        if (z) {
            u31.m11220d0(yf2Var, ga4Var, 0L, 0L, j2, null, 246);
        } else if (Float.intBitsToFloat((int) (j2 >> 32)) < f) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j70Var.mo11227d() >> 32)) - f2;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j70Var.mo11227d() & 4294967295L)) - f2;
            jp0 jp0Var = j70Var.f22064b;
            long jM7219E = jp0Var.m7219E();
            jp0Var.m7248w().mo6253j();
            try {
                ((jp0) ((ar3) jp0Var.f22481b).f14813b).m7248w().mo6248d(f2, f2, fIntBitsToFloat, fIntBitsToFloat2, 0);
                j = jM7219E;
                try {
                    u31.m11220d0(yf2Var, ga4Var, 0L, 0L, j2, null, 246);
                    d55.m4374s(jp0Var, j);
                } catch (Throwable th) {
                    th = th;
                    d55.m4374s(jp0Var, j);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                j = jM7219E;
            }
        } else {
            u31.m11220d0(yf2Var, ga4Var, j3, j4, k43.m7370D(j2, f), pd4Var, 208);
        }
        return ju4.f22634a;
    }
}
