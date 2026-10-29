package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kw2 {

    /* JADX INFO: renamed from: a */
    public float f23558a = 0.0f;

    /* JADX INFO: renamed from: b */
    public float f23559b = 0.0f;

    /* JADX INFO: renamed from: c */
    public float f23560c = 0.0f;

    /* JADX INFO: renamed from: d */
    public float f23561d = 0.0f;

    /* JADX INFO: renamed from: a */
    public final void m7640a(float f, float f2, float f3, float f4) {
        this.f23558a = Math.max(f, this.f23558a);
        this.f23559b = Math.max(f2, this.f23559b);
        this.f23560c = Math.min(f3, this.f23560c);
        this.f23561d = Math.min(f4, this.f23561d);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7641b() {
        return (this.f23558a >= this.f23560c) | (this.f23559b >= this.f23561d);
    }

    /* JADX INFO: renamed from: c */
    public final void m7642c(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.f23558a += fIntBitsToFloat;
        this.f23559b += fIntBitsToFloat2;
        this.f23560c += fIntBitsToFloat;
        this.f23561d += fIntBitsToFloat2;
    }

    public final String toString() {
        String strM3803H = c20.m3803H(this.f23558a);
        String strM3803H2 = c20.m3803H(this.f23559b);
        return c75.m3882n(zi4.m13625y("MutableRect(", strM3803H, ", ", strM3803H2, ", "), c20.m3803H(this.f23560c), ", ", c20.m3803H(this.f23561d), ")");
    }
}
