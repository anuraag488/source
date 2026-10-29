package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zh1 {

    /* JADX INFO: renamed from: a */
    public float f36085a;

    /* JADX INFO: renamed from: b */
    public float f36086b;

    /* JADX INFO: renamed from: a */
    public final yh1 m13558a(float f) {
        double dM13559b = m13559b(f);
        double d = ai1.f14520a;
        double d2 = d - 1.0d;
        float fExp = (float) (Math.exp((d / d2) * dM13559b) * ((double) (this.f36085a * this.f36086b)));
        long jExp = (long) (Math.exp(dM13559b / d2) * 1000.0d);
        yh1 yh1Var = new yh1();
        yh1Var.f35222a = f;
        yh1Var.f35223b = fExp;
        yh1Var.f35224c = jExp;
        VarHandle.storeStoreFence();
        return yh1Var;
    }

    /* JADX INFO: renamed from: b */
    public final double m13559b(float f) {
        float[] fArr = AbstractC0488be.f15221a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.f36085a * this.f36086b)));
    }
}
