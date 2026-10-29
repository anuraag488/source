package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: zn */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1411zn {

    /* JADX INFO: renamed from: a */
    public int f36190a;

    /* JADX INFO: renamed from: b */
    public long f36191b;

    /* JADX INFO: renamed from: c */
    public Object f36192c;

    /* JADX INFO: renamed from: d */
    public int f36193d;

    public C1411zn(bk1 bk1Var, long j, int i, int i2) {
        this.f36192c = bk1Var;
        this.f36191b = j;
        this.f36190a = i;
        this.f36193d = i2;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m13641c(int i, int i2, byte b, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + b + String.valueOf(i).length());
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0038  */
    /* JADX INFO: renamed from: a */
    public xj1 m13642a(yj1 yj1Var, boolean z, int i, int i2, int i3, int i4) {
        xj1 xj1Var;
        sq2 sq2Var;
        j52 j52Var;
        db3 db3Var;
        if (yj1Var.f35264b) {
            bk1 bk1Var = (bk1) this.f36192c;
            int iOrdinal = bk1Var.f15348a.ordinal();
            boolean z2 = true;
            if (iOrdinal == 0 || iOrdinal == 1) {
                xj1Var = null;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    C0670g.m5864c();
                    return null;
                }
                if (z) {
                    sq2Var = bk1Var.f15349b;
                    j52Var = bk1Var.f15353f;
                    db3Var = bk1Var.f15350c;
                } else {
                    sq2Var = (i < -1 || i2 < 0) ? null : bk1Var.f15351d;
                    j52Var = bk1Var.f15354g;
                    db3Var = bk1Var.f15352e;
                }
                if (sq2Var == null) {
                    xj1Var = null;
                } else {
                    long j = j52Var.f22027a;
                    xj1Var = new xj1();
                    xj1Var.f34317a = sq2Var;
                    xj1Var.f34318b = db3Var;
                    xj1Var.f34319c = j;
                    xj1Var.f34320d = true;
                    VarHandle.storeStoreFence();
                }
            }
            if (xj1Var != null) {
                if (i < 0 || (i4 != 0 && (i3 - ((int) (xj1Var.f34319c >> 32)) < 0 || i4 >= Integer.MAX_VALUE))) {
                    z2 = false;
                }
                xj1Var.f34320d = z2;
                return xj1Var;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if ((((int) (r24 & 4294967295L)) - ((int) (r19 & 4294967295L))) < 0) goto L13;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yj1 m13643b(boolean z, int i, long j, j52 j52Var, int i2, int i3, int i4, boolean z2, boolean z3) {
        long j2;
        int i5 = this.f36190a;
        int i6 = this.f36193d;
        long j3 = this.f36191b;
        bk1 bk1Var = (bk1) this.f36192c;
        int i7 = i3 + i4;
        if (j52Var == null) {
            return new yj1(true, true);
        }
        long j4 = j52Var.f22027a;
        if (bk1Var.f15348a != zj1.f36146a) {
            if (i2 < Integer.MAX_VALUE) {
                j2 = j4;
            }
            return new yj1(true, true);
        }
        j2 = j4;
        if (i != 0 && (i >= Integer.MAX_VALUE || ((int) (j >> 32)) - ((int) (j2 >> 32)) < 0)) {
            return z2 ? new yj1(true, true) : new yj1(true, m13643b(z, 0, j52.m7022b(kl0.m7539i(j3), (((int) (j & 4294967295L)) - i6) - i4), j52.m7021a(j52.m7022b(((int) (j2 >> 32)) - i5, (int) (j2 & 4294967295L))), i2 + 1, i7, 0, true, false).f35264b);
        }
        int i8 = (int) (j2 & 4294967295L);
        int iMax = Math.max(i4, i8) + i3;
        j52 j52VarM3611a = z3 ? null : bk1Var.m3611a(i2, iMax, z);
        if (j52VarM3611a != null) {
            long j5 = j52VarM3611a.f22027a;
            if (i + 1 >= Integer.MAX_VALUE || ((((int) (j >> 32)) - ((int) (j2 >> 32))) - i5) - ((int) (j5 >> 32)) < 0) {
                if (z3) {
                    return new yj1(true, true);
                }
                boolean z4 = m13643b(false, 0, j52.m7022b(kl0.m7539i(j3), (((int) (j & 4294967295L)) - i6) - Math.max(i4, i8)), j52VarM3611a, i2 + 1, iMax, 0, true, true).f35264b;
                return new yj1(z4, z4);
            }
        }
        return new yj1(false, false);
    }
}
