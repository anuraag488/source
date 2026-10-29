package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sk0 extends tk0 {

    /* JADX INFO: renamed from: e */
    public qp3 f30349e;

    /* JADX INFO: renamed from: f */
    public qp3 f30350f;

    /* JADX INFO: renamed from: g */
    public float[] f30351g;

    @Override // p000.tk0
    /* JADX INFO: renamed from: a */
    public final long mo10350a(long j) {
        float fM9469h = pb0.m9469h(j);
        float fM9468g = pb0.m9468g(j);
        float fM9466e = pb0.m9466e(j);
        float fM9465d = pb0.m9465d(j);
        qp3 qp3Var = this.f30349e;
        float fMo7356e = (float) qp3Var.f28673p.mo7356e(fM9469h);
        mp3 mp3Var = qp3Var.f28673p;
        float fMo7356e2 = (float) mp3Var.mo7356e(fM9468g);
        float fMo7356e3 = (float) mp3Var.mo7356e(fM9466e);
        float[] fArr = this.f30351g;
        float f = (fArr[6] * fMo7356e3) + (fArr[3] * fMo7356e2) + (fArr[0] * fMo7356e);
        float f2 = (fArr[7] * fMo7356e3) + (fArr[4] * fMo7356e2) + (fArr[1] * fMo7356e);
        float f3 = (fArr[8] * fMo7356e3) + (fArr[5] * fMo7356e2) + (fArr[2] * fMo7356e);
        qp3 qp3Var2 = this.f30350f;
        float fMo7356e4 = (float) qp3Var2.f28670m.mo7356e(f);
        mp3 mp3Var2 = qp3Var2.f28670m;
        return zy5.m13867c(fMo7356e4, (float) mp3Var2.mo7356e(f2), (float) mp3Var2.mo7356e(f3), fM9465d, qp3Var2);
    }
}
