package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class b14 {

    /* JADX INFO: renamed from: a */
    public static final C0530ck f15024a = new C0530ck(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b */
    public static final sq4 f15025b = sw4.m10941a(new fv3(27), new fv3(28));

    /* JADX INFO: renamed from: c */
    public static final long f15026c;

    /* JADX INFO: renamed from: d */
    public static final db4 f15027d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        f15026c = jFloatToRawIntBits;
        f15027d = new db4(b33.m3423a(jFloatToRawIntBits));
    }
}
