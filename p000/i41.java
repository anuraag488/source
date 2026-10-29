package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i41 implements Comparable {

    /* JADX INFO: renamed from: b */
    public static final r50 f21117b = new r50(5);

    /* JADX INFO: renamed from: c */
    public static final long f21118c = as4.m3265x(4611686018427387903L);

    /* JADX INFO: renamed from: d */
    public static final long f21119d = as4.m3265x(-4611686018427387903L);

    /* JADX INFO: renamed from: e */
    public static final long f21120e = 9223372036854759646L;

    /* JADX INFO: renamed from: a */
    public long f21121a;

    /* JADX INFO: renamed from: a */
    public static final long m6642a(long j, long j2) {
        long j3 = j2 / 1000000;
        long jM3252k = as4.m3252k(j, j3);
        if (-4611686018426L > jM3252k || jM3252k >= 4611686018427L) {
            return as4.m3265x(jM3252k);
        }
        return as4.m3267z((jM3252k * 1000000) + (j2 - (j3 * 1000000)));
    }

    /* JADX INFO: renamed from: b */
    public static final void m6643b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strM6347m0 = hd4.m6347m0(i3, String.valueOf(i2));
            int i4 = -1;
            int length = strM6347m0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strM6347m0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strM6347m0, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strM6347m0, 0, i6);
            }
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ i41 m6644c(long j) {
        i41 i41Var = new i41();
        i41Var.f21121a = j;
        VarHandle.storeStoreFence();
        return i41Var;
    }

    /* JADX INFO: renamed from: d */
    public static int m6645d(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return z62.m13394v(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m6646e(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: f */
    public static final long m6647f(long j) {
        return ((((int) j) & 1) != 1 || m6649h(j)) ? m6655n(j, m41.MILLISECONDS) : j >> 1;
    }

    /* JADX INFO: renamed from: g */
    public static final int m6648g(long j) {
        if (m6649h(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m6649h(long j) {
        return j == f21118c || j == f21119d;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m6650i(long j) {
        return j > 0;
    }

    /* JADX INFO: renamed from: j */
    public static final long m6651j(long j, long j2) {
        return m6652k(j, m6657p(j2));
    }

    /* JADX INFO: renamed from: k */
    public static final long m6652k(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? m6642a(j >> 1, j2 >> 1) : m6642a(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            return (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? as4.m3265x(j3 / 1000000) : as4.m3267z(j3);
        }
        long jM3252k = as4.m3252k(j >> 1, j2 >> 1);
        if (jM3252k != 9223372036854759646L) {
            return (jM3252k == 4611686018427387903L || jM3252k == -4611686018427387903L) ? as4.m3265x(jM3252k) : as4.m3266y(jM3252k);
        }
        C1077qn.m9987m("Summing infinite durations of different signs yields an undefined result.");
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
    
        if ((java.lang.Integer.signum(r20) * java.lang.Long.signum(r6)) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
    
        if ((java.lang.Integer.signum(r20) * java.lang.Long.signum(r6)) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c5, code lost:
    
        return p000.i41.f21118c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c8, code lost:
    
        return p000.i41.f21119d;
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m6653l(int i, long j) {
        if (m6649h(j)) {
            if (i != 0) {
                return i > 0 ? j : m6657p(j);
            }
            C1077qn.m9987m("Multiplying infinite duration by zero yields an undefined result.");
            return 0L;
        }
        if (i == 0) {
            return 0L;
        }
        long j2 = j >> 1;
        long j3 = i;
        long j4 = j2 * j3;
        if ((((int) j) & 1) == 0) {
            if (-2147483647L <= j2 && j2 < 2147483648L) {
                return as4.m3267z(j4);
            }
            if (j4 / j3 == j2) {
                return (-4611686018426999999L > j4 || j4 >= 4611686018427000000L) ? as4.m3265x(j4 / 1000000) : as4.m3267z(j4);
            }
            long j5 = j2 / 1000000;
            long j6 = j5 * j3;
            long j7 = (((j2 - (j5 * 1000000)) * j3) / 1000000) + j6;
            if (j6 / j3 == j5 && (j7 ^ j6) >= 0) {
                return as4.m3265x(sc6.m10677r(j7, new mo2(-4611686018427387903L, 4611686018427387903L)));
            }
        } else if (j4 / j3 == j2) {
            return as4.m3265x(sc6.m10677r(j4, new mo2(-4611686018427387903L, 4611686018427387903L)));
        }
    }

    /* JADX INFO: renamed from: m */
    public static final long m6654m(long j, double d) {
        double dM6621p;
        int iM10009D = qq2.m10009D(d);
        if (iM10009D == d) {
            return m6653l(iM10009D, j);
        }
        int i = ((int) j) & 1;
        m41 m41Var = i == 0 ? m41.NANOSECONDS : m41.MILLISECONDS;
        if (j == f21118c) {
            dM6621p = Double.POSITIVE_INFINITY;
        } else if (j == f21119d) {
            dM6621p = Double.NEGATIVE_INFINITY;
        } else {
            dM6621p = i25.m6621p(j >> 1, i == 0 ? m41.NANOSECONDS : m41.MILLISECONDS, m41Var);
        }
        return as4.m3237P(dM6621p * d, m41Var);
    }

    /* JADX INFO: renamed from: n */
    public static final long m6655n(long j, m41 m41Var) {
        if (j == f21118c) {
            return Long.MAX_VALUE;
        }
        if (j == f21119d) {
            return Long.MIN_VALUE;
        }
        return m41Var.f24636a.convert(j >> 1, ((((int) j) & 1) == 0 ? m41.NANOSECONDS : m41.MILLISECONDS).f24636a);
    }

    /* JADX INFO: renamed from: o */
    public static String m6656o(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == f21118c) {
            return "Infinity";
        }
        if (j == f21119d) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j < 0) {
            j = m6657p(j);
        }
        long jM6655n = m6655n(j, m41.DAYS);
        int iM6655n = m6649h(j) ? 0 : (int) (m6655n(j, m41.HOURS) % 24);
        int iM6655n2 = m6649h(j) ? 0 : (int) (m6655n(j, m41.MINUTES) % 60);
        int iM6655n3 = m6649h(j) ? 0 : (int) (m6655n(j, m41.SECONDS) % 60);
        int iM6648g = m6648g(j);
        boolean z2 = jM6655n != 0;
        boolean z3 = iM6655n != 0;
        boolean z4 = iM6655n2 != 0;
        boolean z5 = (iM6655n3 == 0 && iM6648g == 0) ? false : true;
        if (z2) {
            sb.append(jM6655n);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM6655n);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iM6655n2);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iM6655n3 != 0 || z2 || z3 || z4) {
                m6643b(sb, iM6655n3, iM6648g, 9, "s", false);
            } else if (iM6648g >= 1000000) {
                m6643b(sb, iM6648g / 1000000, iM6648g % 1000000, 6, "ms", false);
            } else if (iM6648g >= 1000) {
                m6643b(sb, iM6648g / 1000, iM6648g % 1000, 3, "us", false);
            } else {
                sb.append(iM6648g);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    public static final long m6657p(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i = k41.f22856a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m6645d(this.f21121a, ((i41) obj).f21121a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i41) && this.f21121a == ((i41) obj).f21121a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21121a);
    }

    public final String toString() {
        return m6656o(this.f21121a);
    }
}
