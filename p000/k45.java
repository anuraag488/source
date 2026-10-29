package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k45 implements ob0 {

    /* JADX INFO: renamed from: a */
    public float f22886a;

    /* JADX INFO: renamed from: b */
    public float f22887b;

    /* JADX INFO: renamed from: c */
    public float f22888c;

    /* JADX INFO: renamed from: d */
    public float f22889d;

    /* JADX INFO: renamed from: e */
    public l45 f22890e;

    static {
        l45 l45Var = m45.f24646a;
    }

    @Override // p000.ob0
    /* JADX INFO: renamed from: a */
    public final tu1 mo5727a() {
        return m7400b(kj3.f23170a).mo5727a();
    }

    /* JADX INFO: renamed from: b */
    public final fj3 m7400b(ij3 ij3Var) {
        char c;
        char c2;
        k45 k45VarM7833a = this;
        float f = k45VarM7833a.f22889d;
        l45 l45VarM7606g = ks5.m7606g(ij3Var.mo5130f());
        float[] fArr = el0.f18197a;
        float[] fArr2 = el0.f18198b;
        tz4 tz4Var = l45VarM7606g.f23787a;
        tz4 tz4Var2 = k45VarM7833a.f22890e.f23787a;
        if (z62.m13387o(tz4Var, tz4Var2)) {
            c = 7;
            c2 = 6;
        } else {
            qk5 qk5Var = tz4Var2.f31569b;
            qk5 qk5Var2 = tz4Var.f31569b;
            float f2 = qk5Var.f28547a;
            c = 7;
            float f3 = qk5Var.f28549c;
            c2 = 6;
            float[] fArrM5346V = ev0.m5346V((f2 * f3) / qk5Var.f28548b, f3, qk5Var.m9896a(), fArr);
            float f4 = qk5Var2.f28547a;
            float f5 = qk5Var2.f28549c;
            float[] fArrM5346V2 = ev0.m5346V((f4 * f5) / qk5Var2.f28548b, f5, qk5Var2.m9896a(), fArr);
            float[] fArrM5347W = ev0.m5347W(fArrM5346V2[0] / fArrM5346V[0], fArrM5346V2[1] / fArrM5346V[1], fArrM5346V2[2] / fArrM5346V[2], fArr2);
            float[] fArr3 = {ev0.m5348X(0, 0, fArrM5347W, fArr), ev0.m5348X(1, 0, fArrM5347W, fArr), ev0.m5348X(2, 0, fArrM5347W, fArr), ev0.m5348X(0, 1, fArrM5347W, fArr), ev0.m5348X(1, 1, fArrM5347W, fArr), ev0.m5348X(2, 1, fArrM5347W, fArr), ev0.m5348X(0, 2, fArrM5347W, fArr), ev0.m5348X(1, 2, fArrM5347W, fArr), ev0.m5348X(2, 2, fArrM5347W, fArr)};
            float f6 = k45VarM7833a.f22886a;
            float f7 = k45VarM7833a.f22887b;
            float f8 = k45VarM7833a.f22888c;
            k45VarM7833a = l45VarM7606g.m7833a((fArr3[2] * f8) + (fArr3[1] * f7) + (fArr3[0] * f6), (fArr3[5] * f8) + (fArr3[4] * f7) + (fArr3[3] * f6), (fArr3[8] * f8) + (fArr3[7] * f7) + (fArr3[6] * f6), f);
        }
        float f9 = k45VarM7833a.f22886a;
        float f10 = k45VarM7833a.f22887b;
        float f11 = k45VarM7833a.f22888c;
        hj3 hj3VarMo5132j = ij3Var.mo5132j();
        float[] fArrMo5133l = ij3Var.mo5133l();
        return ij3Var.mo5129e(hj3VarMo5132j.mo6009j((fArrMo5133l[2] * f11) + (fArrMo5133l[1] * f10) + (fArrMo5133l[0] * f9)), hj3VarMo5132j.mo6009j((fArrMo5133l[5] * f11) + (fArrMo5133l[4] * f10) + (fArrMo5133l[3] * f9)), hj3VarMo5132j.mo6009j((fArrMo5133l[8] * f11) + (fArrMo5133l[c] * f10) + (fArrMo5133l[c2] * f9)), f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k45)) {
            return false;
        }
        k45 k45Var = (k45) obj;
        return Float.compare(this.f22886a, k45Var.f22886a) == 0 && Float.compare(this.f22887b, k45Var.f22887b) == 0 && Float.compare(this.f22888c, k45Var.f22888c) == 0 && Float.compare(this.f22889d, k45Var.f22889d) == 0 && this.f22890e.equals(k45Var.f22890e);
    }

    public final int hashCode() {
        return this.f22890e.f23787a.hashCode() + c75.m3874f(this.f22889d, c75.m3874f(this.f22888c, c75.m3874f(this.f22887b, Float.hashCode(this.f22886a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "XYZ(x=" + this.f22886a + ", y=" + this.f22887b + ", z=" + this.f22888c + ", alpha=" + this.f22889d + ", space=" + this.f22890e + ')';
    }
}
