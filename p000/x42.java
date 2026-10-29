package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x42 implements Comparable, Serializable {

    /* JADX INFO: renamed from: c */
    public static final x42 f33977c = new x42(0, -31557014167219200L);

    /* JADX INFO: renamed from: d */
    public static final x42 f33978d = new x42(999999999, 31556889864403199L);

    /* JADX INFO: renamed from: a */
    public final long f33979a;

    /* JADX INFO: renamed from: b */
    public final int f33980b;

    public x42(int i, long j) {
        this.f33979a = j;
        this.f33980b = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            C1077qn.m9987m("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        x42 x42Var = (x42) obj;
        int iM13394v = z62.m13394v(this.f33979a, x42Var.f33979a);
        return iM13394v != 0 ? iM13394v : z62.m13393u(this.f33980b, x42Var.f33980b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x42)) {
            return false;
        }
        x42 x42Var = (x42) obj;
        return this.f33979a == x42Var.f33979a && this.f33980b == x42Var.f33980b;
    }

    public final int hashCode() {
        return (this.f33980b * 51) + Long.hashCode(this.f33979a);
    }

    public final String toString() {
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j2 = this.f33979a;
        long j3 = j2 / 86400;
        if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
            j3--;
        }
        long j4 = j2 % 86400;
        int i = (int) (j4 + (86400 & (((j4 ^ 86400) & ((-j4) | j4)) >> 63)));
        long j5 = 719468 + j3;
        if (j5 < 0) {
            long j6 = ((j3 + 719469) / 146097) - 1;
            j = j6 * 400;
            j5 += (-j6) * 146097;
        } else {
            j = 0;
        }
        long j7 = ((400 * j5) + 591) / 146097;
        long j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        if (j8 < 0) {
            j7--;
            j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        }
        int i2 = (int) j8;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i6 = (int) (j7 + j + ((long) (i3 / 10)));
        int i7 = i / 3600;
        int i8 = i - (i7 * 3600);
        int i9 = i8 / 60;
        int i10 = i8 - (i9 * 60);
        int i11 = 0;
        if (Math.abs(i6) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i6 >= 0) {
                sb2.append(i6 + 10000);
                sb2.deleteCharAt(0);
            } else {
                sb2.append(i6 - 10000);
                sb2.deleteCharAt(1);
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i6 >= 10000) {
                sb.append('+');
            }
            sb.append(i6);
        }
        sb.append('-');
        y42.m12862k0(sb, sb, i4);
        sb.append('-');
        y42.m12862k0(sb, sb, i5);
        sb.append('T');
        y42.m12862k0(sb, sb, i7);
        sb.append(':');
        y42.m12862k0(sb, sb, i9);
        sb.append(':');
        y42.m12862k0(sb, sb, i10);
        int i12 = this.f33980b;
        if (i12 != 0) {
            sb.append('.');
            while (true) {
                iArr = y42.f34863e;
                int i13 = i11 + 1;
                if (i12 % iArr[i13] != 0) {
                    break;
                }
                i11 = i13;
            }
            int i14 = i11 - (i11 % 3);
            sb.append(String.valueOf((i12 / iArr[i14]) + iArr[9 - i14]).substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }
}
