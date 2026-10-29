package p000;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: renamed from: mx */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0925mx {

    /* JADX INFO: renamed from: a */
    public final String f25267a;

    /* JADX INFO: renamed from: b */
    public final char[] f25268b;

    /* JADX INFO: renamed from: c */
    public final int f25269c;

    /* JADX INFO: renamed from: d */
    public final int f25270d;

    /* JADX INFO: renamed from: e */
    public final int f25271e;

    /* JADX INFO: renamed from: f */
    public final int f25272f;

    /* JADX INFO: renamed from: g */
    public final byte[] f25273g;

    /* JADX INFO: renamed from: h */
    public final boolean[] f25274h;

    /* JADX INFO: renamed from: i */
    public final boolean f25275i;

    public C0925mx(String str, char[] cArr, byte[] bArr, boolean z) {
        this.f25267a = str;
        cArr.getClass();
        this.f25268b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int iM5360j0 = ev0.m5360j0(length);
            this.f25270d = iM5360j0;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iM5360j0);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.f25271e = i;
            this.f25272f = iM5360j0 >> iNumberOfTrailingZeros;
            this.f25269c = cArr.length - 1;
            this.f25273g = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.f25272f; i2++) {
                int i3 = this.f25270d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[ev0.m5345U(i2 * 8, i3)] = true;
            }
            this.f25274h = zArr;
            this.f25275i = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m8425a(char c) throws C1050px {
        if (c > 127) {
            throw new C1050px("Unrecognized character: 0x" + Integer.toHexString(c));
        }
        byte b = this.f25273g[c];
        if (b != -1) {
            return b;
        }
        if (c > ' ' && c != 127) {
            throw new C1050px("Unrecognized character: " + c);
        }
        throw new C1050px("Unrecognized character: 0x" + Integer.toHexString(c));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0925mx)) {
            return false;
        }
        C0925mx c0925mx = (C0925mx) obj;
        return this.f25275i == c0925mx.f25275i && Arrays.equals(this.f25268b, c0925mx.f25268b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f25268b) + (this.f25275i ? 1231 : 1237);
    }

    public final String toString() {
        return this.f25267a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0925mx(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 128) {
                if (bArr[c] == -1) {
                    bArr[c] = (byte) i;
                } else {
                    C1077qn.m9987m(sc6.m10639K("Duplicate character: %s", Character.valueOf(c)));
                    throw null;
                }
            } else {
                C1077qn.m9987m(sc6.m10639K("Non-ASCII character: %s", Character.valueOf(c)));
                throw null;
            }
        }
        this(str, cArr, bArr, false);
    }
}
