package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ll0 {
    /* JADX INFO: renamed from: a */
    public static final long m8009a(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            s32.m10514a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return m8016h(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m8010b(int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return m8009a(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public static final int m8011c(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    /* JADX INFO: renamed from: d */
    public static final long m8012d(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iM7541k = kl0.m7541k(j);
        int iM7539i = kl0.m7539i(j);
        if (i < iM7541k) {
            i = iM7541k;
        }
        if (i <= iM7539i) {
            iM7539i = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int iM7540j = kl0.m7540j(j);
        int iM7538h = kl0.m7538h(j);
        if (i2 < iM7540j) {
            i2 = iM7540j;
        }
        if (i2 <= iM7538h) {
            iM7538h = i2;
        }
        return (((long) iM7539i) << 32) | (((long) iM7538h) & 4294967295L);
    }

    /* JADX INFO: renamed from: e */
    public static final long m8013e(long j, long j2) {
        int iM7541k = kl0.m7541k(j);
        int iM7539i = kl0.m7539i(j);
        int iM7540j = kl0.m7540j(j);
        int iM7538h = kl0.m7538h(j);
        int iM7541k2 = kl0.m7541k(j2);
        if (iM7541k2 < iM7541k) {
            iM7541k2 = iM7541k;
        }
        if (iM7541k2 > iM7539i) {
            iM7541k2 = iM7539i;
        }
        int iM7539i2 = kl0.m7539i(j2);
        if (iM7539i2 >= iM7541k) {
            iM7541k = iM7539i2;
        }
        if (iM7541k <= iM7539i) {
            iM7539i = iM7541k;
        }
        int iM7540j2 = kl0.m7540j(j2);
        if (iM7540j2 < iM7540j) {
            iM7540j2 = iM7540j;
        }
        if (iM7540j2 > iM7538h) {
            iM7540j2 = iM7538h;
        }
        int iM7538h2 = kl0.m7538h(j2);
        if (iM7538h2 >= iM7540j) {
            iM7540j = iM7538h2;
        }
        if (iM7540j <= iM7538h) {
            iM7538h = iM7540j;
        }
        return m8009a(iM7541k2, iM7539i, iM7540j2, iM7538h);
    }

    /* JADX INFO: renamed from: f */
    public static final int m8014f(int i, long j) {
        int iM7540j = kl0.m7540j(j);
        int iM7538h = kl0.m7538h(j);
        if (i < iM7540j) {
            i = iM7540j;
        }
        return i > iM7538h ? iM7538h : i;
    }

    /* JADX INFO: renamed from: g */
    public static final int m8015g(int i, long j) {
        int iM7541k = kl0.m7541k(j);
        int iM7539i = kl0.m7539i(j);
        if (i < iM7541k) {
            i = iM7541k;
        }
        return i > iM7539i ? iM7539i : i;
    }

    /* JADX INFO: renamed from: h */
    public static final long m8016h(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int iM8011c = m8011c(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iM8011c2 = m8011c(i6);
        if (iM8011c + iM8011c2 > 31) {
            m8018j(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iM8011c2 - 13;
        return (((long) (i7 & (~(i7 >> 31)))) << 33) | ((long) ((i9 >> 1) + (i9 & 1))) | (((long) i) << 2) | (((long) i3) << (iM8011c2 + 2)) | (((long) (i8 & (~(i8 >> 31)))) << (iM8011c2 + 33));
    }

    /* JADX INFO: renamed from: i */
    public static final long m8017i(int i, long j, int i2) {
        int iM7541k = kl0.m7541k(j) + i;
        if (iM7541k < 0) {
            iM7541k = 0;
        }
        int iM7539i = kl0.m7539i(j);
        if (iM7539i != Integer.MAX_VALUE && (iM7539i = iM7539i + i) < 0) {
            iM7539i = 0;
        }
        int iM7540j = kl0.m7540j(j) + i2;
        if (iM7540j < 0) {
            iM7540j = 0;
        }
        int iM7538h = kl0.m7538h(j);
        return m8009a(iM7541k, iM7539i, iM7540j, (iM7538h == Integer.MAX_VALUE || (iM7538h = iM7538h + i2) >= 0) ? iM7538h : 0);
    }

    /* JADX INFO: renamed from: j */
    public static final void m8018j(int i, int i2) {
        throw new IllegalArgumentException(d55.m4367l("Can't represent a width of ", i, " and height of ", i2, " in Constraints"));
    }

    /* JADX INFO: renamed from: k */
    public static final Void m8019k(int i) {
        throw new IllegalArgumentException(c75.m3878j("Can't represent a size of ", i, " in Constraints"));
    }
}
