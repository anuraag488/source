package p000;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class on4 {

    /* JADX INFO: renamed from: e */
    public static final mn4 f26914e = new mn4();

    /* JADX INFO: renamed from: a */
    public final double f26915a;

    /* JADX INFO: renamed from: b */
    public final double f26916b;

    /* JADX INFO: renamed from: c */
    public final rv1 f26917c;

    /* JADX INFO: renamed from: d */
    public final HashMap f26918d = new HashMap();

    public on4(double d, double d2, rv1 rv1Var) {
        this.f26915a = d;
        this.f26916b = d2;
        this.f26917c = rv1Var;
    }

    /* JADX INFO: renamed from: a */
    public final rv1 m9191a(double d) {
        if (d == 99.0d) {
            double d2 = this.f26915a;
            if (d2 >= 105.0d && d2 < 125.0d) {
                return new rv1(m9192b(99));
            }
        }
        return new rv1(AbstractC1356y5.m12899H(this.f26915a, this.f26916b, d));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0076  */
    /* JADX INFO: renamed from: b */
    public final int m9192b(int i) {
        Integer numValueOf;
        Integer numValueOf2 = Integer.valueOf(i);
        HashMap map = this.f26918d;
        Integer num = (Integer) map.get(numValueOf2);
        if (num != null) {
            return num.intValue();
        }
        if (i == 99) {
            double d = this.f26915a;
            if (d < 105.0d || d >= 125.0d) {
                int iM12899H = AbstractC1356y5.m12899H(this.f26915a, this.f26916b, i);
                qs5.m10120y(iM12899H);
                sc6.m10642N(iM12899H);
                numValueOf = Integer.valueOf(iM12899H);
            } else {
                int iM9192b = m9192b(98);
                int iM9192b2 = m9192b(100);
                numValueOf = Integer.valueOf((qq2.m10010E(((iM9192b & 255) + (iM9192b2 & 255)) / 2.0f) & 255) | ((qq2.m10010E((((iM9192b >>> 16) & 255) + ((iM9192b2 >>> 16) & 255)) / 2.0f) & 255) << 16) | (-16777216) | ((qq2.m10010E((((iM9192b >>> 8) & 255) + ((iM9192b2 >>> 8) & 255)) / 2.0f) & 255) << 8));
            }
        } else {
            int iM12899H2 = AbstractC1356y5.m12899H(this.f26915a, this.f26916b, i);
            qs5.m10120y(iM12899H2);
            sc6.m10642N(iM12899H2);
            numValueOf = Integer.valueOf(iM12899H2);
        }
        map.put(Integer.valueOf(i), numValueOf);
        return numValueOf.intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on4)) {
            return false;
        }
        on4 on4Var = (on4) obj;
        return Double.compare(this.f26915a, on4Var.f26915a) == 0 && Double.compare(this.f26916b, on4Var.f26916b) == 0 && this.f26917c.equals(on4Var.f26917c);
    }

    public final int hashCode() {
        return ((Double.hashCode(this.f26916b) + (Double.hashCode(this.f26915a) * 31)) * 31) + this.f26917c.f29660a;
    }

    public final String toString() {
        return "TonalPalette(hue=" + this.f26915a + ", chroma=" + this.f26916b + ", keyColor=" + this.f26917c + ")";
    }
}
