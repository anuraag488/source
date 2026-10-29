package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ew4 {

    /* JADX INFO: renamed from: a */
    public static final long f18546a = ji1.m7130a(0.0f, 0.0f);

    /* JADX INFO: renamed from: b */
    public static final float f18547b = 3.1415927f;

    /* JADX INFO: renamed from: a */
    public static final long m5413a(float f, float f2) {
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        if (fSqrt > 0.0f) {
            return ji1.m7130a(f / fSqrt, f2 / fSqrt);
        }
        C1077qn.m9987m("Required distance greater than zero");
        return 0L;
    }

    /* JADX INFO: renamed from: b */
    public static final float m5414b(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    /* JADX INFO: renamed from: c */
    public static final float m5415c(float f) {
        return ((f % 1.0f) + 1.0f) % 1.0f;
    }

    /* JADX INFO: renamed from: d */
    public static long m5416d(float f, float f2) {
        double d = f2;
        return se0.m10704S(se0.m10721f0(ji1.m7130a((float) Math.cos(d), (float) Math.sin(d)), f), f18546a);
    }
}
