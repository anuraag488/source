package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lm4 {

    /* JADX INFO: renamed from: a */
    public int f24173a;

    /* JADX INFO: renamed from: b */
    public mt2 f24174b;

    /* JADX INFO: renamed from: c */
    public yp1 f24175c;

    /* JADX INFO: renamed from: d */
    public lm4 f24176d;

    /* JADX INFO: renamed from: e */
    public long f24177e;

    /* JADX INFO: renamed from: f */
    public long f24178f;

    /* JADX INFO: renamed from: g */
    public long f24179g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ mm4 f24180h;

    /* JADX INFO: renamed from: a */
    public final void m8037a(long j, long j2, long j3, long j4, float[] fArr) {
        mm3 mm3Var;
        mt2 mt2Var = this.f24174b;
        long j5 = this.f24180h.f25037f;
        e13 e13VarM10650V = sc6.m10650V(mt2Var, 2);
        wf2 wf2VarM10652X = sc6.m10652X(mt2Var);
        boolean zM12257K = wf2VarM10652X.m12257K();
        C0940nb c0940nb = wf2VarM10652X.f33299G;
        if (!zM12257K) {
            mm3Var = null;
        } else if (((e13) c0940nb.f25608e) != e13VarM10650V) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L);
            long j6 = e13VarM10650V.f16901c;
            e13 e13Var = (e13) c0940nb.f25608e;
            e13Var.getClass();
            long jM12827F0 = y42.m12827F0(e13Var.mo4006V(e13VarM10650V, jFloatToRawIntBits, true));
            mm3Var = new mm3(jM12827F0, (((long) (((int) (jM12827F0 & 4294967295L)) + ((int) (j6 & 4294967295L)))) & 4294967295L) | (((long) (((int) (jM12827F0 >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, fArr, mt2Var);
        } else {
            mm3Var = new mm3(j, j2, j3, j4, j5, fArr, mt2Var);
        }
        if (mm3Var == null) {
            return;
        }
        this.f24175c.invoke(mm3Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m8038b() {
        mm4 mm4Var = this.f24180h;
        lv2 lv2Var = mm4Var.f25032a;
        int i = this.f24173a;
        lm4 lm4Var = (lm4) lv2Var.m8120g(i);
        if (lm4Var != null) {
            if (lm4Var == this) {
                lm4 lm4Var2 = this.f24176d;
                this.f24176d = null;
                if (lm4Var2 != null) {
                    int iM8117d = lv2Var.m8117d(i);
                    Object[] objArr = lv2Var.f24667c;
                    Object obj = objArr[iM8117d];
                    lv2Var.f24666b[iM8117d] = i;
                    objArr[iM8117d] = lm4Var2;
                    return;
                }
                wf2 wf2VarM10652X = sc6.m10652X(this.f24174b.f25195a);
                if (wf2VarM10652X.m12256J()) {
                    ll3 rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(wf2VarM10652X)).getRectManager();
                    rectManager.getClass();
                    if (wf2VarM10652X.f33317g != -4) {
                        C0795je c0795je = rectManager.f24128c;
                        int iM8029d = rectManager.m8029d(wf2VarM10652X);
                        long[] jArr = (long[]) c0795je.f22194c;
                        int i2 = iM8029d + 2;
                        jArr[i2] = jArr[i2] & 8070450532247928831L;
                        return;
                    }
                    return;
                }
                return;
            }
            int iM8117d2 = lv2Var.m8117d(i);
            Object[] objArr2 = lv2Var.f24667c;
            Object obj2 = objArr2[iM8117d2];
            lv2Var.f24666b[iM8117d2] = i;
            objArr2[iM8117d2] = lm4Var;
            while (true) {
                lm4 lm4Var3 = lm4Var.f24176d;
                if (lm4Var3 == null) {
                    break;
                }
                if (lm4Var3 == this) {
                    lm4Var.f24176d = this.f24176d;
                    this.f24176d = null;
                    return;
                }
                lm4Var = lm4Var3;
            }
        }
        lm4 lm4Var4 = mm4Var.f25033b;
        if (lm4Var4 == this) {
            mm4Var.f25033b = lm4Var4.f24176d;
            this.f24176d = null;
            return;
        }
        lm4 lm4Var5 = lm4Var4 != null ? lm4Var4.f24176d : null;
        while (true) {
            lm4 lm4Var6 = lm4Var4;
            lm4Var4 = lm4Var5;
            if (lm4Var4 == null) {
                return;
            }
            if (lm4Var4 == this) {
                if (lm4Var6 != null) {
                    lm4Var6.f24176d = lm4Var4.f24176d;
                }
                this.f24176d = null;
                return;
            }
            lm4Var5 = lm4Var4.f24176d;
        }
    }
}
