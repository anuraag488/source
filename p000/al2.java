package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class al2 {

    /* JADX INFO: renamed from: b */
    public static final float f14609b;

    /* JADX INFO: renamed from: c */
    public static final float f14610c;

    /* JADX INFO: renamed from: d */
    public static final float f14611d;

    /* JADX INFO: renamed from: a */
    public float f14612a;

    static {
        m3043a(0.0f);
        m3043a(0.5f);
        f14609b = 0.5f;
        m3043a(-1.0f);
        f14610c = -1.0f;
        m3043a(1.0f);
        f14611d = 1.0f;
    }

    /* JADX INFO: renamed from: a */
    public static void m3043a(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            r32.m10187b("topRatio should be in [0..1] range or -1");
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m3044b(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == f14609b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == f14610c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == f14611d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ")";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof al2) && Float.compare(this.f14612a, ((al2) obj).f14612a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14612a);
    }

    public final String toString() {
        return m3044b(this.f14612a);
    }
}
