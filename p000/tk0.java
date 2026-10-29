package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class tk0 {

    /* JADX INFO: renamed from: a */
    public final lc0 f31206a;

    /* JADX INFO: renamed from: b */
    public final lc0 f31207b;

    /* JADX INFO: renamed from: c */
    public final lc0 f31208c;

    /* JADX INFO: renamed from: d */
    public final float[] f31209d;

    /* JADX WARN: Illegal instructions before constructor call */
    public tk0(lc0 lc0Var, lc0 lc0Var2, int i) {
        lc0 lc0VarM13528m = sc6.m10630B(lc0Var.f23930b, 12884901888L) ? zc6.m13528m(lc0Var) : lc0Var;
        lc0 lc0VarM13528m2 = sc6.m10630B(lc0Var2.f23930b, 12884901888L) ? zc6.m13528m(lc0Var2) : lc0Var2;
        float[] fArrM11687a = ev0.f18502j;
        float[] fArr = null;
        if (i == 3) {
            boolean zM10630B = sc6.m10630B(lc0Var.f23930b, 12884901888L);
            boolean zM10630B2 = sc6.m10630B(lc0Var2.f23930b, 12884901888L);
            if ((!zM10630B || !zM10630B2) && (zM10630B || zM10630B2)) {
                uz4 uz4Var = ((qp3) (zM10630B ? lc0Var : lc0Var2)).f28661d;
                float[] fArrM11687a2 = zM10630B ? uz4Var.m11687a() : fArrM11687a;
                fArrM11687a = zM10630B2 ? uz4Var.m11687a() : fArrM11687a;
                fArr = new float[]{fArrM11687a2[0] / fArrM11687a[0], fArrM11687a2[1] / fArrM11687a[1], fArrM11687a2[2] / fArrM11687a[2]};
            }
        }
        this(lc0Var2, lc0VarM13528m, lc0VarM13528m2, fArr);
    }

    /* JADX INFO: renamed from: a */
    public long mo10350a(long j) {
        float fM9469h = pb0.m9469h(j);
        float fM9468g = pb0.m9468g(j);
        float fM9466e = pb0.m9466e(j);
        float fM9465d = pb0.m9465d(j);
        lc0 lc0Var = this.f31207b;
        long jMo7949d = lc0Var.mo7949d(fM9469h, fM9468g, fM9466e);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo7949d >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo7949d & 4294967295L));
        float fMo7950e = lc0Var.mo7950e(fM9469h, fM9468g, fM9466e);
        float[] fArr = this.f31209d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fMo7950e *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.f31208c.mo7951f(f, f2, fMo7950e, fM9465d, this.f31206a);
    }

    public tk0(lc0 lc0Var, lc0 lc0Var2, lc0 lc0Var3, float[] fArr) {
        this.f31206a = lc0Var;
        this.f31207b = lc0Var2;
        this.f31208c = lc0Var3;
        this.f31209d = fArr;
    }
}
