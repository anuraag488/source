package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lx4 {

    /* JADX INFO: renamed from: a */
    public final boolean f24445a;

    /* JADX INFO: renamed from: b */
    public final kx4 f24446b;

    /* JADX INFO: renamed from: c */
    public final int f24447c;

    /* JADX INFO: renamed from: d */
    public final jt0[] f24448d;

    /* JADX INFO: renamed from: e */
    public int f24449e;

    /* JADX INFO: renamed from: f */
    public final float[] f24450f;

    /* JADX INFO: renamed from: g */
    public final float[] f24451g;

    /* JADX INFO: renamed from: h */
    public final float[] f24452h;

    public lx4(boolean z, kx4 kx4Var) {
        int i;
        this.f24445a = z;
        this.f24446b = kx4Var;
        if (z && kx4Var.equals(kx4.f23586a)) {
            C1077qn.m9989o("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int iOrdinal = kx4Var.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                C0670g.m5864c();
                throw null;
            }
            i = 2;
        }
        this.f24447c = i;
        this.f24448d = new jt0[20];
        this.f24450f = new float[20];
        this.f24451g = new float[20];
        this.f24452h = new float[3];
    }

    /* JADX INFO: renamed from: a */
    public final void m8145a(long j, float f) {
        int i = (this.f24449e + 1) % 20;
        this.f24449e = i;
        jt0[] jt0VarArr = this.f24448d;
        jt0 jt0Var = jt0VarArr[i];
        if (jt0Var != null) {
            jt0Var.f22600a = j;
            jt0Var.f22601b = f;
        } else {
            jt0 jt0Var2 = new jt0();
            jt0Var2.f22600a = j;
            jt0Var2.f22601b = f;
            jt0VarArr[i] = jt0Var2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m8146b() {
        boolean z;
        kx4 kx4Var;
        float[] fArr;
        int i;
        float[] fArr2;
        int i2;
        float f;
        float f2;
        float fSignum;
        int i3 = this.f24449e;
        jt0[] jt0VarArr = this.f24448d;
        jt0 jt0Var = jt0VarArr[i3];
        if (jt0Var == null) {
            return 0.0f;
        }
        int i4 = 0;
        jt0 jt0Var2 = jt0Var;
        do {
            jt0 jt0Var3 = jt0VarArr[i3];
            z = this.f24445a;
            kx4Var = this.f24446b;
            float[] fArr3 = this.f24450f;
            fArr = this.f24451g;
            if (jt0Var3 == null) {
                i = i4;
                fArr2 = fArr3;
                i2 = 1;
                f = 0.0f;
            } else {
                long j = jt0Var.f22600a;
                i = i4;
                f = 0.0f;
                long j2 = jt0Var3.f22600a;
                float f3 = j - j2;
                fArr2 = fArr3;
                i2 = 1;
                float fAbs = Math.abs(j2 - jt0Var2.f22600a);
                jt0Var2 = (kx4Var == kx4.f23586a || z) ? jt0Var3 : jt0Var;
                if (f3 <= 100.0f && fAbs <= 40.0f) {
                    fArr2[i] = jt0Var3.f22601b;
                    fArr[i] = -f3;
                    if (i3 == 0) {
                        i3 = 20;
                    }
                    i3--;
                    i4 = i + 1;
                }
            }
            i4 = i;
            break;
        } while (i4 < 20);
        if (i4 < this.f24447c) {
            return f;
        }
        int iOrdinal = kx4Var.ordinal();
        if (iOrdinal == 0) {
            try {
                float[] fArr4 = this.f24452h;
                AbstractC1356y5.m12897F(fArr, fArr2, i4, fArr4);
                f2 = fArr4[1];
            } catch (IllegalArgumentException unused) {
                f2 = f;
            }
            fSignum = f2;
        } else {
            if (iOrdinal != i2) {
                C0670g.m5864c();
                return f;
            }
            int i5 = i4 - i2;
            float f4 = fArr[i5];
            int i6 = i5;
            float f5 = f;
            while (i6 > 0) {
                int i7 = i6 - 1;
                float f6 = fArr[i7];
                if (f4 != f6) {
                    float f7 = (z ? -fArr2[i7] : fArr2[i6] - fArr2[i7]) / (f4 - f6);
                    float fAbs2 = (Math.abs(f7) * (f7 - (Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2.0f))))) + f5;
                    if (i6 == i5) {
                        fAbs2 *= 0.5f;
                    }
                    f5 = fAbs2;
                }
                i6--;
                f4 = f6;
            }
            fSignum = Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2.0f));
        }
        return fSignum * 1000.0f;
    }

    /* JADX INFO: renamed from: c */
    public final float m8147c(float f) {
        if (f <= 0.0f) {
            q32.m9721c("maximumVelocity should be a positive value. You specified=" + f);
        }
        float fM8146b = m8146b();
        if (fM8146b == 0.0f || Float.isNaN(fM8146b)) {
            return 0.0f;
        }
        if (fM8146b <= 0.0f) {
            float f2 = -f;
            if (fM8146b < f2) {
                return f2;
            }
        } else if (fM8146b > f) {
            return f;
        }
        return fM8146b;
    }

    public /* synthetic */ lx4() {
        this(false, kx4.f23586a);
    }

    public lx4(boolean z) {
        this(z, kx4.f23587b);
    }
}
