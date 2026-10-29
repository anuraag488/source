package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rv1 {

    /* JADX INFO: renamed from: e */
    public static final qv1 f29659e = new qv1();

    /* JADX INFO: renamed from: a */
    public final int f29660a;

    /* JADX INFO: renamed from: b */
    public final double f29661b;

    /* JADX INFO: renamed from: c */
    public final double f29662c;

    /* JADX INFO: renamed from: d */
    public final double f29663d;

    public rv1(int i) {
        this.f29660a = i;
        r60 r60VarM10120y = qs5.m10120y(i);
        this.f29661b = r60VarM10120y.f29040a;
        this.f29662c = r60VarM10120y.f29041b;
        this.f29663d = sc6.m10642N(i);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10468a() {
        double d = this.f29661b;
        return d >= 170.0d && d < 207.0d;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10469b() {
        double d = this.f29661b;
        return d >= 105.0d && d < 125.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rv1) && this.f29660a == ((rv1) obj).f29660a;
    }

    public final int hashCode() {
        return this.f29660a;
    }

    public final String toString() {
        return c75.m3878j("Hct(argb=", this.f29660a, ")");
    }
}
