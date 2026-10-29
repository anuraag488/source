package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class kj3 {

    /* JADX INFO: renamed from: a */
    public static final jj3 f23170a;

    /* JADX INFO: renamed from: b */
    public static final jj3 f23171b;

    /* JADX INFO: renamed from: c */
    public static final jj3 f23172c;

    /* JADX INFO: renamed from: d */
    public static final jj3 f23173d;

    /* JADX INFO: renamed from: e */
    public static final jj3 f23174e;

    /* JADX INFO: renamed from: f */
    public static final jj3 f23175f;

    /* JADX INFO: renamed from: g */
    public static final jj3 f23176g;

    /* JADX INFO: renamed from: h */
    public static final jj3 f23177h;

    /* JADX INFO: renamed from: i */
    public static final jj3 f23178i;

    /* JADX INFO: renamed from: j */
    public static final jj3 f23179j;

    static {
        tz4 tz4Var = s02.f29787b;
        o85 o85Var = o85.f26455o;
        qk5 qk5Var = lj3.f24070a;
        qk5 qk5Var2 = lj3.f24071b;
        qk5 qk5Var3 = lj3.f24072c;
        f23170a = new jj3("sRGB", tz4Var, o85Var, qk5Var, qk5Var2, qk5Var3);
        ig1 ig1Var = ig1.f21362A;
        f23171b = new jj3("Linear sRGB", tz4Var, ig1Var, qk5Var, qk5Var2, qk5Var3);
        tz4 tz4Var2 = lj3.f24073d;
        f23172c = new jj3("ACES2065-1", tz4Var2, ig1Var, lj3.f24074e, lj3.f24075f, lj3.f24076g);
        C0744i c0744i = C0744i.f20960a;
        qk5 qk5Var4 = lj3.f24077h;
        qk5 qk5Var5 = lj3.f24078i;
        qk5 qk5Var6 = lj3.f24079j;
        lj3.m7992a("ACEScc", tz4Var2, c0744i, qk5Var4, qk5Var5, qk5Var6);
        lj3.m7992a("ACEScct", tz4Var2, C0780j.f21912a, qk5Var4, qk5Var5, qk5Var6);
        f23173d = new jj3("ACEScg", tz4Var2, ig1Var, qk5Var4, qk5Var5, qk5Var6);
        gj3 gj3Var = new gj3(2.19921875d);
        Double dValueOf = Double.valueOf(0.64d);
        Double dValueOf2 = Double.valueOf(0.33d);
        qk5 qk5Var7 = new qk5(dValueOf, dValueOf2);
        qk5 qk5Var8 = new qk5(Double.valueOf(0.21d), Double.valueOf(0.71d));
        Double dValueOf3 = Double.valueOf(0.15d);
        Double dValueOf4 = Double.valueOf(0.06d);
        f23174e = new jj3("Adobe RGB", tz4Var, gj3Var, qk5Var7, qk5Var8, new qk5(dValueOf3, dValueOf4));
        f23175f = new jj3("BT.2020", tz4Var, C1159sv.f30574a, new qk5(Double.valueOf(0.708d), Double.valueOf(0.292d)), new qk5(Double.valueOf(0.17d), Double.valueOf(0.797d)), new qk5(Double.valueOf(0.131d), Double.valueOf(0.046d)));
        f23176g = new jj3("BT.709", tz4Var, C1196tv.f31463a, new qk5(dValueOf, dValueOf2), new qk5(Double.valueOf(0.3d), Double.valueOf(0.6d)), new qk5(dValueOf3, dValueOf4));
        tz4 tz4Var3 = new tz4("DCI P3", new qk5(Double.valueOf(0.314d), Double.valueOf(0.351d)));
        gj3 gj3Var2 = new gj3(2.6d);
        Double dValueOf5 = Double.valueOf(0.68d);
        Double dValueOf6 = Double.valueOf(0.32d);
        qk5 qk5Var9 = new qk5(dValueOf5, dValueOf6);
        Double dValueOf7 = Double.valueOf(0.265d);
        Double dValueOf8 = Double.valueOf(0.69d);
        f23177h = new jj3("DCI P3", tz4Var3, gj3Var2, qk5Var9, new qk5(dValueOf7, dValueOf8), new qk5(dValueOf3, dValueOf4));
        f23178i = new jj3("Display P3", tz4Var, o85Var, new qk5(dValueOf5, dValueOf6), new qk5(dValueOf7, dValueOf8), new qk5(dValueOf3, dValueOf4));
        f23179j = new jj3("ROMM RGB", s02.f29786a, wv1.f33771n, new qk5(Double.valueOf(0.7347d), Double.valueOf(0.2653d)), new qk5(Double.valueOf(0.1596d), Double.valueOf(0.8404d)), new qk5(Double.valueOf(0.0366d), Double.valueOf(1.0E-4d)));
    }
}
