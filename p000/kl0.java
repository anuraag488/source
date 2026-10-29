package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kl0 {

    /* JADX INFO: renamed from: a */
    public long f23210a;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ kl0 m7531a(long j) {
        kl0 kl0Var = new kl0();
        kl0Var.f23210a = j;
        VarHandle.storeStoreFence();
        return kl0Var;
    }

    /* JADX INFO: renamed from: b */
    public static long m7532b(long j, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = m7541k(j);
        }
        if ((i5 & 2) != 0) {
            i2 = m7539i(j);
        }
        if ((i5 & 4) != 0) {
            i3 = m7540j(j);
        }
        if ((i5 & 8) != 0) {
            i4 = m7538h(j);
        }
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            s32.m10514a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return ll0.m8016h(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m7533c(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m7534d(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m7535e(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m7536f(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m7537g(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1;
        int i3 = ((int) (j >> 2)) & i2;
        int i4 = ((int) (j >> 33)) & i2;
        return i3 == (i4 == 0 ? Integer.MAX_VALUE : i4 - 1);
    }

    /* JADX INFO: renamed from: h */
    public static final int m7538h(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    /* JADX INFO: renamed from: i */
    public static final int m7539i(long j) {
        int i = (int) (3 & j);
        int i2 = (int) (j >> 33);
        int i3 = i2 & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    /* JADX INFO: renamed from: j */
    public static final int m7540j(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    /* JADX INFO: renamed from: k */
    public static final int m7541k(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
    }

    /* JADX INFO: renamed from: l */
    public static String m7542l(long j) {
        int iM7539i = m7539i(j);
        String strValueOf = iM7539i == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM7539i);
        int iM7538h = m7538h(j);
        String strValueOf2 = iM7538h != Integer.MAX_VALUE ? String.valueOf(iM7538h) : "Infinity";
        return "Constraints(minWidth = " + m7541k(j) + ", maxWidth = " + strValueOf + ", minHeight = " + m7540j(j) + ", maxHeight = " + strValueOf2 + ")";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kl0) && this.f23210a == ((kl0) obj).f23210a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23210a);
    }

    public final String toString() {
        return m7542l(this.f23210a);
    }
}
