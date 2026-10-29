package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class oc0 {

    /* JADX INFO: renamed from: a */
    public static final float[] f26547a;

    /* JADX INFO: renamed from: b */
    public static final float[] f26548b;

    /* JADX INFO: renamed from: c */
    public static final so4 f26549c;

    /* JADX INFO: renamed from: d */
    public static final so4 f26550d;

    /* JADX INFO: renamed from: e */
    public static final qp3 f26551e;

    /* JADX INFO: renamed from: f */
    public static final qp3 f26552f;

    /* JADX INFO: renamed from: g */
    public static final qp3 f26553g;

    /* JADX INFO: renamed from: h */
    public static final qp3 f26554h;

    /* JADX INFO: renamed from: i */
    public static final qp3 f26555i;

    /* JADX INFO: renamed from: j */
    public static final qp3 f26556j;

    /* JADX INFO: renamed from: k */
    public static final qp3 f26557k;

    /* JADX INFO: renamed from: l */
    public static final qp3 f26558l;

    /* JADX INFO: renamed from: m */
    public static final qp3 f26559m;

    /* JADX INFO: renamed from: n */
    public static final qp3 f26560n;

    /* JADX INFO: renamed from: o */
    public static final qp3 f26561o;

    /* JADX INFO: renamed from: p */
    public static final qp3 f26562p;

    /* JADX INFO: renamed from: q */
    public static final qp3 f26563q;

    /* JADX INFO: renamed from: r */
    public static final qp3 f26564r;

    /* JADX INFO: renamed from: s */
    public static final te2 f26565s;

    /* JADX INFO: renamed from: t */
    public static final te2 f26566t;

    /* JADX INFO: renamed from: u */
    public static final qp3 f26567u;

    /* JADX INFO: renamed from: v */
    public static final qp3 f26568v;

    /* JADX INFO: renamed from: w */
    public static final qp3 f26569w;

    /* JADX INFO: renamed from: x */
    public static final i33 f26570x;

    /* JADX INFO: renamed from: y */
    public static final lc0[] f26571y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f26547a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f26548b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        so4 so4Var = new so4(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        so4 so4Var2 = new so4(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        so4 so4Var3 = new so4(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f26549c = so4Var3;
        so4 so4Var4 = new so4(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f26550d = so4Var4;
        uz4 uz4Var = ev0.f18501i;
        qp3 qp3Var = new qp3("sRGB IEC61966-2.1", fArr, uz4Var, so4Var, 0);
        f26551e = qp3Var;
        qp3 qp3Var2 = new qp3("sRGB IEC61966-2.1 (Linear)", fArr, uz4Var, 1.0d, 0.0f, 1.0f, 1);
        f26552f = qp3Var2;
        qp3 qp3Var3 = new qp3("scRGB-nl IEC 61966-2-2:2003", fArr, uz4Var, null, new C1077qn((byte) 14), new C1077qn((byte) 15), -0.799f, 2.399f, so4Var, 2);
        f26553g = qp3Var3;
        qp3 qp3Var4 = new qp3("scRGB IEC 61966-2-2:2003", fArr, uz4Var, 1.0d, -0.5f, 7.499f, 3);
        f26554h = qp3Var4;
        qp3 qp3Var5 = new qp3("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, uz4Var, new so4(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f26555i = qp3Var5;
        qp3 qp3Var6 = new qp3("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, uz4Var, new so4(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f26556j = qp3Var6;
        qp3 qp3Var7 = new qp3("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new uz4(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f26557k = qp3Var7;
        qp3 qp3Var8 = new qp3("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, uz4Var, so4Var, 7);
        f26558l = qp3Var8;
        double d = 0.2222222222222222d;
        double d2 = 0.081d;
        double d3 = 2.2222222222222223d;
        double d4 = 0.9099181073703367d;
        double d5 = 0.09008189262966333d;
        qp3 qp3Var9 = new qp3("NTSC (1953)", fArr2, ev0.f18498f, new so4(d3, d4, d5, d, d2), 8);
        f26559m = qp3Var9;
        qp3 qp3Var10 = new qp3("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, uz4Var, new so4(d3, d4, d5, d, d2), 9);
        f26560n = qp3Var10;
        qp3 qp3Var11 = new qp3("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, uz4Var, 2.2d, 0.0f, 1.0f, 10);
        f26561o = qp3Var11;
        qp3 qp3Var12 = new qp3("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, ev0.f18499g, new so4(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f26562p = qp3Var12;
        uz4 uz4Var2 = ev0.f18500h;
        qp3 qp3Var13 = new qp3("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, uz4Var2, 1.0d, -65504.0f, 65504.0f, 12);
        f26563q = qp3Var13;
        qp3 qp3Var14 = new qp3("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, uz4Var2, 1.0d, -65504.0f, 65504.0f, 13);
        f26564r = qp3Var14;
        te2 te2Var = new te2("Generic XYZ", 12884901889L, 14, (byte) 1);
        f26565s = te2Var;
        te2 te2Var2 = new te2("Generic L*a*b*", 12884901890L, 15, (byte) 0);
        f26566t = te2Var2;
        qp3 qp3Var15 = new qp3("None", fArr, uz4Var, so4Var2, 16);
        f26567u = qp3Var15;
        qp3 qp3Var16 = new qp3("Hybrid Log Gamma encoding", fArr3, uz4Var, null, new C1077qn((byte) 16), new C1077qn((byte) 17), 0.0f, 1.0f, so4Var3, 17);
        f26568v = qp3Var16;
        qp3 qp3Var17 = new qp3("Perceptual Quantizer encoding", fArr3, uz4Var, null, new C1077qn((byte) 18), new C1077qn((byte) 19), 0.0f, 1.0f, so4Var4, 18);
        f26569w = qp3Var17;
        i33 i33Var = new i33(19, 12884901890L, "Oklab");
        f26570x = i33Var;
        f26571y = new lc0[]{qp3Var, qp3Var2, qp3Var3, qp3Var4, qp3Var5, qp3Var6, qp3Var7, qp3Var8, qp3Var9, qp3Var10, qp3Var11, qp3Var12, qp3Var13, qp3Var14, te2Var, te2Var2, qp3Var15, qp3Var16, qp3Var17, i33Var};
    }

    /* JADX INFO: renamed from: a */
    public static double m9030a(so4 so4Var, double d) {
        double d2 = d < 0.0d ? -1.0d : 1.0d;
        double d3 = d * d2;
        double d4 = so4Var.f30446b;
        double d5 = so4Var.f30447c;
        double d6 = so4Var.f30448d;
        double d7 = so4Var.f30449e;
        double d8 = so4Var.f30450f;
        double d9 = d4 * d3;
        return (so4Var.f30451g + 1.0d) * d2 * (d9 <= 1.0d ? Math.pow(d9, d5) : Math.exp((d3 - d8) * d6) + d7);
    }

    /* JADX INFO: renamed from: b */
    public static double m9031b(so4 so4Var, double d) {
        double d2 = d < 0.0d ? -1.0d : 1.0d;
        double d3 = 1.0d / so4Var.f30446b;
        double d4 = 1.0d / so4Var.f30447c;
        double d5 = 1.0d / so4Var.f30448d;
        double d6 = so4Var.f30449e;
        double d7 = so4Var.f30450f;
        double d8 = (d * d2) / (so4Var.f30451g + 1.0d);
        return d2 * (d8 <= 1.0d ? Math.pow(d8, d4) * d3 : (Math.log(d8 - d6) * d5) + d7);
    }

    /* JADX INFO: renamed from: c */
    public static double m9032c(so4 so4Var, double d) {
        double d2 = d < 0.0d ? -1.0d : 1.0d;
        double d3 = d * d2;
        double d4 = so4Var.f30446b;
        double d5 = so4Var.f30448d;
        double dPow = (Math.pow(d3, d5) * so4Var.f30447c) + d4;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d3, d5) * so4Var.f30450f) + so4Var.f30449e), so4Var.f30451g) * d2;
    }

    /* JADX INFO: renamed from: d */
    public static double m9033d(so4 so4Var, double d) {
        double d2 = d < 0.0d ? -1.0d : 1.0d;
        double d3 = d * d2;
        double d4 = -so4Var.f30446b;
        double d5 = so4Var.f30449e;
        double d6 = 1.0d / so4Var.f30451g;
        return Math.pow(Math.max((Math.pow(d3, d6) * d5) + d4, 0.0d) / ((Math.pow(d3, d6) * (-so4Var.f30450f)) + so4Var.f30447c), 1.0d / so4Var.f30448d) * d2;
    }
}
