package p000;

import java.lang.invoke.VarHandle;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ij6 {

    /* JADX INFO: renamed from: a */
    public pq3 f21499a;

    /* JADX INFO: renamed from: a */
    public static ij6 m6814a(tl6 tl6Var, tl6 tl6Var2) {
        ij6 ij6Var = new ij6();
        pq3 pq3Var = new pq3((byte) 17);
        pq3Var.f27896b = tl6Var;
        pq3Var.f27897c = tl6Var2;
        VarHandle.storeStoreFence();
        ij6Var.f21499a = pq3Var;
        VarHandle.storeStoreFence();
        return ij6Var;
    }

    /* JADX INFO: renamed from: b */
    public static void m6815b(ng6 ng6Var, pq3 pq3Var, Object obj, Object obj2) throws za0 {
        hh6.m6402b(ng6Var, (tl6) pq3Var.f27896b, 1, obj);
        hh6.m6402b(ng6Var, (tl6) pq3Var.f27897c, 2, obj2);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0129  */
    /* JADX WARN: Code duplicated, block: B:46:0x012f  */
    /* JADX WARN: Code duplicated, block: B:47:0x013f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0150  */
    /* JADX WARN: Code duplicated, block: B:49:0x0157  */
    /* JADX WARN: Code duplicated, block: B:51:0x015f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0163  */
    /* JADX WARN: Code duplicated, block: B:54:0x0170  */
    /* JADX WARN: Code duplicated, block: B:55:0x017d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0189  */
    /* JADX WARN: Code duplicated, block: B:58:0x018d  */
    /* JADX WARN: Code duplicated, block: B:60:0x019b  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:73:0x0204  */
    /* JADX WARN: Code duplicated, block: B:74:0x020b  */
    /* JADX INFO: renamed from: c */
    public static int m6816c(pq3 pq3Var, Object obj, Object obj2) {
        int iM8711a;
        int iMo3593d;
        int iM8713s;
        int i;
        int iM8713s2;
        int iMo3593d2;
        int iM8713s3;
        tl6 tl6Var = (tl6) pq3Var.f27896b;
        tl6 tl6Var2 = (tl6) pq3Var.f27897c;
        int i2 = hh6.f20588c;
        int iM8711a2 = 8;
        int iM8713s4 = ng6.m8713s(8);
        tl6 tl6Var3 = tl6.f31232d;
        if (tl6Var == tl6Var3) {
            Charset charset = ni6.f25875a;
            iM8713s4 += iM8713s4;
        }
        ul6 ul6Var = ul6.f31979a;
        switch (tl6Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iM8711a = 8;
                i = iM8711a + iM8713s4;
                iM8713s2 = ng6.m8713s(16);
                if (tl6Var2 == tl6Var3) {
                    Charset charset2 = ni6.f25875a;
                    iM8713s2 += iM8713s2;
                }
                switch (tl6Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 2:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 3:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 4:
                        iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM8711a2 = 1;
                        return iM8711a2 + iM8713s2 + i;
                    case 8:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                            iM8711a2 = iM8713s3 + iMo3593d2;
                        } else {
                            iM8711a2 = ng6.m8712b((String) obj2);
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 9:
                        iM8711a2 = ((zh6) ((ef6) obj2)).m13571i();
                        return iM8711a2 + iM8713s2 + i;
                    case 10:
                        iMo3593d2 = ((zh6) ((ef6) obj2)).m13571i();
                        iM8713s3 = ng6.m8713s(iMo3593d2);
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 11:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        } else {
                            iMo3593d2 = ((byte[]) obj2).length;
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        }
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 12:
                        iM8711a2 = ng6.m8713s(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 13:
                        if (obj2 instanceof fi6) {
                            iM8711a2 = ng6.m8711a(((fi6) obj2).mo4016f());
                        } else {
                            iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 16:
                        int iIntValue = ((Integer) obj2).intValue();
                        iM8711a2 = ng6.m8713s((iIntValue >> 31) ^ (iIntValue + iIntValue));
                        return iM8711a2 + iM8713s2 + i;
                    case 17:
                        long jLongValue = ((Long) obj2).longValue();
                        iM8711a2 = ng6.m8711a((jLongValue >> 63) ^ (jLongValue + jLongValue));
                        return iM8711a2 + iM8713s2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                iM8711a = 4;
                i = iM8711a + iM8713s4;
                iM8713s2 = ng6.m8713s(16);
                if (tl6Var2 == tl6Var3) {
                    Charset charset3 = ni6.f25875a;
                    iM8713s2 += iM8713s2;
                }
                switch (tl6Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 2:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 3:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 4:
                        iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM8711a2 = 1;
                        return iM8711a2 + iM8713s2 + i;
                    case 8:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                            iM8711a2 = iM8713s3 + iMo3593d2;
                        } else {
                            iM8711a2 = ng6.m8712b((String) obj2);
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 9:
                        iM8711a2 = ((zh6) ((ef6) obj2)).m13571i();
                        return iM8711a2 + iM8713s2 + i;
                    case 10:
                        iMo3593d2 = ((zh6) ((ef6) obj2)).m13571i();
                        iM8713s3 = ng6.m8713s(iMo3593d2);
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 11:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        } else {
                            iMo3593d2 = ((byte[]) obj2).length;
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        }
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 12:
                        iM8711a2 = ng6.m8713s(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 13:
                        if (obj2 instanceof fi6) {
                            iM8711a2 = ng6.m8711a(((fi6) obj2).mo4016f());
                        } else {
                            iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 16:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iM8711a2 = ng6.m8713s((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                        return iM8711a2 + iM8713s2 + i;
                    case 17:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iM8711a2 = ng6.m8711a((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                        return iM8711a2 + iM8713s2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 2:
                iM8711a = ng6.m8711a(((Long) obj).longValue());
                i = iM8711a + iM8713s4;
                iM8713s2 = ng6.m8713s(16);
                if (tl6Var2 == tl6Var3) {
                    Charset charset4 = ni6.f25875a;
                    iM8713s2 += iM8713s2;
                }
                switch (tl6Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 2:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 3:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 4:
                        iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM8711a2 = 1;
                        return iM8711a2 + iM8713s2 + i;
                    case 8:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                            iM8711a2 = iM8713s3 + iMo3593d2;
                        } else {
                            iM8711a2 = ng6.m8712b((String) obj2);
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 9:
                        iM8711a2 = ((zh6) ((ef6) obj2)).m13571i();
                        return iM8711a2 + iM8713s2 + i;
                    case 10:
                        iMo3593d2 = ((zh6) ((ef6) obj2)).m13571i();
                        iM8713s3 = ng6.m8713s(iMo3593d2);
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 11:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        } else {
                            iMo3593d2 = ((byte[]) obj2).length;
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        }
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 12:
                        iM8711a2 = ng6.m8713s(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 13:
                        if (obj2 instanceof fi6) {
                            iM8711a2 = ng6.m8711a(((fi6) obj2).mo4016f());
                        } else {
                            iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 16:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iM8711a2 = ng6.m8713s((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                        return iM8711a2 + iM8713s2 + i;
                    case 17:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iM8711a2 = ng6.m8711a((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                        return iM8711a2 + iM8713s2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 3:
                iM8711a = ng6.m8711a(((Long) obj).longValue());
                i = iM8711a + iM8713s4;
                iM8713s2 = ng6.m8713s(16);
                if (tl6Var2 == tl6Var3) {
                    Charset charset5 = ni6.f25875a;
                    iM8713s2 += iM8713s2;
                }
                switch (tl6Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 2:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 3:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 4:
                        iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM8711a2 = 1;
                        return iM8711a2 + iM8713s2 + i;
                    case 8:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                            iM8711a2 = iM8713s3 + iMo3593d2;
                        } else {
                            iM8711a2 = ng6.m8712b((String) obj2);
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 9:
                        iM8711a2 = ((zh6) ((ef6) obj2)).m13571i();
                        return iM8711a2 + iM8713s2 + i;
                    case 10:
                        iMo3593d2 = ((zh6) ((ef6) obj2)).m13571i();
                        iM8713s3 = ng6.m8713s(iMo3593d2);
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 11:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        } else {
                            iMo3593d2 = ((byte[]) obj2).length;
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        }
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 12:
                        iM8711a2 = ng6.m8713s(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 13:
                        if (obj2 instanceof fi6) {
                            iM8711a2 = ng6.m8711a(((fi6) obj2).mo4016f());
                        } else {
                            iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 16:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iM8711a2 = ng6.m8713s((iIntValue4 >> 31) ^ (iIntValue4 + iIntValue4));
                        return iM8711a2 + iM8713s2 + i;
                    case 17:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iM8711a2 = ng6.m8711a((jLongValue4 >> 63) ^ (jLongValue4 + jLongValue4));
                        return iM8711a2 + iM8713s2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 4:
                iM8711a = ng6.m8711a(((Integer) obj).intValue());
                i = iM8711a + iM8713s4;
                iM8713s2 = ng6.m8713s(16);
                if (tl6Var2 == tl6Var3) {
                    Charset charset6 = ni6.f25875a;
                    iM8713s2 += iM8713s2;
                }
                switch (tl6Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 2:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 3:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 4:
                        iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM8711a2 = 1;
                        return iM8711a2 + iM8713s2 + i;
                    case 8:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                            iM8711a2 = iM8713s3 + iMo3593d2;
                        } else {
                            iM8711a2 = ng6.m8712b((String) obj2);
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 9:
                        iM8711a2 = ((zh6) ((ef6) obj2)).m13571i();
                        return iM8711a2 + iM8713s2 + i;
                    case 10:
                        iMo3593d2 = ((zh6) ((ef6) obj2)).m13571i();
                        iM8713s3 = ng6.m8713s(iMo3593d2);
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 11:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        } else {
                            iMo3593d2 = ((byte[]) obj2).length;
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        }
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 12:
                        iM8711a2 = ng6.m8713s(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 13:
                        if (obj2 instanceof fi6) {
                            iM8711a2 = ng6.m8711a(((fi6) obj2).mo4016f());
                        } else {
                            iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 16:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iM8711a2 = ng6.m8713s((iIntValue5 >> 31) ^ (iIntValue5 + iIntValue5));
                        return iM8711a2 + iM8713s2 + i;
                    case 17:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iM8711a2 = ng6.m8711a((jLongValue5 >> 63) ^ (jLongValue5 + jLongValue5));
                        return iM8711a2 + iM8713s2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 5:
                ((Long) obj).getClass();
                iM8711a = 8;
                i = iM8711a + iM8713s4;
                iM8713s2 = ng6.m8713s(16);
                if (tl6Var2 == tl6Var3) {
                    Charset charset7 = ni6.f25875a;
                    iM8713s2 += iM8713s2;
                }
                switch (tl6Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 2:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 3:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 4:
                        iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM8711a2 = 1;
                        return iM8711a2 + iM8713s2 + i;
                    case 8:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                            iM8711a2 = iM8713s3 + iMo3593d2;
                        } else {
                            iM8711a2 = ng6.m8712b((String) obj2);
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 9:
                        iM8711a2 = ((zh6) ((ef6) obj2)).m13571i();
                        return iM8711a2 + iM8713s2 + i;
                    case 10:
                        iMo3593d2 = ((zh6) ((ef6) obj2)).m13571i();
                        iM8713s3 = ng6.m8713s(iMo3593d2);
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 11:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        } else {
                            iMo3593d2 = ((byte[]) obj2).length;
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        }
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 12:
                        iM8711a2 = ng6.m8713s(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 13:
                        if (obj2 instanceof fi6) {
                            iM8711a2 = ng6.m8711a(((fi6) obj2).mo4016f());
                        } else {
                            iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 16:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iM8711a2 = ng6.m8713s((iIntValue6 >> 31) ^ (iIntValue6 + iIntValue6));
                        return iM8711a2 + iM8713s2 + i;
                    case 17:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iM8711a2 = ng6.m8711a((jLongValue6 >> 63) ^ (jLongValue6 + jLongValue6));
                        return iM8711a2 + iM8713s2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 6:
                ((Integer) obj).getClass();
                iM8711a = 4;
                i = iM8711a + iM8713s4;
                iM8713s2 = ng6.m8713s(16);
                if (tl6Var2 == tl6Var3) {
                    Charset charset8 = ni6.f25875a;
                    iM8713s2 += iM8713s2;
                }
                switch (tl6Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 2:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 3:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 4:
                        iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM8711a2 = 1;
                        return iM8711a2 + iM8713s2 + i;
                    case 8:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                            iM8711a2 = iM8713s3 + iMo3593d2;
                        } else {
                            iM8711a2 = ng6.m8712b((String) obj2);
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 9:
                        iM8711a2 = ((zh6) ((ef6) obj2)).m13571i();
                        return iM8711a2 + iM8713s2 + i;
                    case 10:
                        iMo3593d2 = ((zh6) ((ef6) obj2)).m13571i();
                        iM8713s3 = ng6.m8713s(iMo3593d2);
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 11:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        } else {
                            iMo3593d2 = ((byte[]) obj2).length;
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        }
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 12:
                        iM8711a2 = ng6.m8713s(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 13:
                        if (obj2 instanceof fi6) {
                            iM8711a2 = ng6.m8711a(((fi6) obj2).mo4016f());
                        } else {
                            iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 16:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iM8711a2 = ng6.m8713s((iIntValue7 >> 31) ^ (iIntValue7 + iIntValue7));
                        return iM8711a2 + iM8713s2 + i;
                    case 17:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iM8711a2 = ng6.m8711a((jLongValue7 >> 63) ^ (jLongValue7 + jLongValue7));
                        return iM8711a2 + iM8713s2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 7:
                ((Boolean) obj).getClass();
                iM8711a = 1;
                i = iM8711a + iM8713s4;
                iM8713s2 = ng6.m8713s(16);
                if (tl6Var2 == tl6Var3) {
                    Charset charset9 = ni6.f25875a;
                    iM8713s2 += iM8713s2;
                }
                switch (tl6Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 2:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 3:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 4:
                        iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM8711a2 = 1;
                        return iM8711a2 + iM8713s2 + i;
                    case 8:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                            iM8711a2 = iM8713s3 + iMo3593d2;
                        } else {
                            iM8711a2 = ng6.m8712b((String) obj2);
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 9:
                        iM8711a2 = ((zh6) ((ef6) obj2)).m13571i();
                        return iM8711a2 + iM8713s2 + i;
                    case 10:
                        iMo3593d2 = ((zh6) ((ef6) obj2)).m13571i();
                        iM8713s3 = ng6.m8713s(iMo3593d2);
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 11:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        } else {
                            iMo3593d2 = ((byte[]) obj2).length;
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        }
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 12:
                        iM8711a2 = ng6.m8713s(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 13:
                        if (obj2 instanceof fi6) {
                            iM8711a2 = ng6.m8711a(((fi6) obj2).mo4016f());
                        } else {
                            iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 16:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iM8711a2 = ng6.m8713s((iIntValue8 >> 31) ^ (iIntValue8 + iIntValue8));
                        return iM8711a2 + iM8713s2 + i;
                    case 17:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iM8711a2 = ng6.m8711a((jLongValue8 >> 63) ^ (jLongValue8 + jLongValue8));
                        return iM8711a2 + iM8713s2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 8:
                if (obj instanceof ig6) {
                    iMo3593d = ((ig6) obj).mo3593d();
                    iM8713s = ng6.m8713s(iMo3593d);
                    iM8711a = iMo3593d + iM8713s;
                } else {
                    iM8711a = ng6.m8712b((String) obj);
                }
                i = iM8711a + iM8713s4;
                iM8713s2 = ng6.m8713s(16);
                if (tl6Var2 == tl6Var3) {
                    Charset charset10 = ni6.f25875a;
                    iM8713s2 += iM8713s2;
                }
                switch (tl6Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 2:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 3:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 4:
                        iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM8711a2 = 1;
                        return iM8711a2 + iM8713s2 + i;
                    case 8:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                            iM8711a2 = iM8713s3 + iMo3593d2;
                        } else {
                            iM8711a2 = ng6.m8712b((String) obj2);
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 9:
                        iM8711a2 = ((zh6) ((ef6) obj2)).m13571i();
                        return iM8711a2 + iM8713s2 + i;
                    case 10:
                        iMo3593d2 = ((zh6) ((ef6) obj2)).m13571i();
                        iM8713s3 = ng6.m8713s(iMo3593d2);
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 11:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        } else {
                            iMo3593d2 = ((byte[]) obj2).length;
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        }
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 12:
                        iM8711a2 = ng6.m8713s(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 13:
                        if (obj2 instanceof fi6) {
                            iM8711a2 = ng6.m8711a(((fi6) obj2).mo4016f());
                        } else {
                            iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 16:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iM8711a2 = ng6.m8713s((iIntValue9 >> 31) ^ (iIntValue9 + iIntValue9));
                        return iM8711a2 + iM8713s2 + i;
                    case 17:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iM8711a2 = ng6.m8711a((jLongValue9 >> 63) ^ (jLongValue9 + jLongValue9));
                        return iM8711a2 + iM8713s2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 9:
                iM8711a = ((zh6) ((ef6) obj)).m13571i();
                i = iM8711a + iM8713s4;
                iM8713s2 = ng6.m8713s(16);
                if (tl6Var2 == tl6Var3) {
                    Charset charset11 = ni6.f25875a;
                    iM8713s2 += iM8713s2;
                }
                switch (tl6Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 2:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 3:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 4:
                        iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM8711a2 = 1;
                        return iM8711a2 + iM8713s2 + i;
                    case 8:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                            iM8711a2 = iM8713s3 + iMo3593d2;
                        } else {
                            iM8711a2 = ng6.m8712b((String) obj2);
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 9:
                        iM8711a2 = ((zh6) ((ef6) obj2)).m13571i();
                        return iM8711a2 + iM8713s2 + i;
                    case 10:
                        iMo3593d2 = ((zh6) ((ef6) obj2)).m13571i();
                        iM8713s3 = ng6.m8713s(iMo3593d2);
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 11:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        } else {
                            iMo3593d2 = ((byte[]) obj2).length;
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        }
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 12:
                        iM8711a2 = ng6.m8713s(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 13:
                        if (obj2 instanceof fi6) {
                            iM8711a2 = ng6.m8711a(((fi6) obj2).mo4016f());
                        } else {
                            iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 16:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iM8711a2 = ng6.m8713s((iIntValue10 >> 31) ^ (iIntValue10 + iIntValue10));
                        return iM8711a2 + iM8713s2 + i;
                    case 17:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iM8711a2 = ng6.m8711a((jLongValue10 >> 63) ^ (jLongValue10 + jLongValue10));
                        return iM8711a2 + iM8713s2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 10:
                iMo3593d = ((zh6) ((ef6) obj)).m13571i();
                iM8713s = ng6.m8713s(iMo3593d);
                iM8711a = iMo3593d + iM8713s;
                i = iM8711a + iM8713s4;
                iM8713s2 = ng6.m8713s(16);
                if (tl6Var2 == tl6Var3) {
                    Charset charset12 = ni6.f25875a;
                    iM8713s2 += iM8713s2;
                }
                switch (tl6Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 2:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 3:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 4:
                        iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM8711a2 = 1;
                        return iM8711a2 + iM8713s2 + i;
                    case 8:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                            iM8711a2 = iM8713s3 + iMo3593d2;
                        } else {
                            iM8711a2 = ng6.m8712b((String) obj2);
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 9:
                        iM8711a2 = ((zh6) ((ef6) obj2)).m13571i();
                        return iM8711a2 + iM8713s2 + i;
                    case 10:
                        iMo3593d2 = ((zh6) ((ef6) obj2)).m13571i();
                        iM8713s3 = ng6.m8713s(iMo3593d2);
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 11:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        } else {
                            iMo3593d2 = ((byte[]) obj2).length;
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        }
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 12:
                        iM8711a2 = ng6.m8713s(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 13:
                        if (obj2 instanceof fi6) {
                            iM8711a2 = ng6.m8711a(((fi6) obj2).mo4016f());
                        } else {
                            iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 16:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iM8711a2 = ng6.m8713s((iIntValue11 >> 31) ^ (iIntValue11 + iIntValue11));
                        return iM8711a2 + iM8713s2 + i;
                    case 17:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iM8711a2 = ng6.m8711a((jLongValue11 >> 63) ^ (jLongValue11 + jLongValue11));
                        return iM8711a2 + iM8713s2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 11:
                if (obj instanceof ig6) {
                    iMo3593d = ((ig6) obj).mo3593d();
                    iM8713s = ng6.m8713s(iMo3593d);
                } else {
                    iMo3593d = ((byte[]) obj).length;
                    iM8713s = ng6.m8713s(iMo3593d);
                }
                iM8711a = iMo3593d + iM8713s;
                i = iM8711a + iM8713s4;
                iM8713s2 = ng6.m8713s(16);
                if (tl6Var2 == tl6Var3) {
                    Charset charset13 = ni6.f25875a;
                    iM8713s2 += iM8713s2;
                }
                switch (tl6Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 2:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 3:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 4:
                        iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM8711a2 = 1;
                        return iM8711a2 + iM8713s2 + i;
                    case 8:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                            iM8711a2 = iM8713s3 + iMo3593d2;
                        } else {
                            iM8711a2 = ng6.m8712b((String) obj2);
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 9:
                        iM8711a2 = ((zh6) ((ef6) obj2)).m13571i();
                        return iM8711a2 + iM8713s2 + i;
                    case 10:
                        iMo3593d2 = ((zh6) ((ef6) obj2)).m13571i();
                        iM8713s3 = ng6.m8713s(iMo3593d2);
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 11:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        } else {
                            iMo3593d2 = ((byte[]) obj2).length;
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        }
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 12:
                        iM8711a2 = ng6.m8713s(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 13:
                        if (obj2 instanceof fi6) {
                            iM8711a2 = ng6.m8711a(((fi6) obj2).mo4016f());
                        } else {
                            iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 16:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iM8711a2 = ng6.m8713s((iIntValue12 >> 31) ^ (iIntValue12 + iIntValue12));
                        return iM8711a2 + iM8713s2 + i;
                    case 17:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iM8711a2 = ng6.m8711a((jLongValue12 >> 63) ^ (jLongValue12 + jLongValue12));
                        return iM8711a2 + iM8713s2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 12:
                iM8711a = ng6.m8713s(((Integer) obj).intValue());
                i = iM8711a + iM8713s4;
                iM8713s2 = ng6.m8713s(16);
                if (tl6Var2 == tl6Var3) {
                    Charset charset14 = ni6.f25875a;
                    iM8713s2 += iM8713s2;
                }
                switch (tl6Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 2:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 3:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 4:
                        iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM8711a2 = 1;
                        return iM8711a2 + iM8713s2 + i;
                    case 8:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                            iM8711a2 = iM8713s3 + iMo3593d2;
                        } else {
                            iM8711a2 = ng6.m8712b((String) obj2);
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 9:
                        iM8711a2 = ((zh6) ((ef6) obj2)).m13571i();
                        return iM8711a2 + iM8713s2 + i;
                    case 10:
                        iMo3593d2 = ((zh6) ((ef6) obj2)).m13571i();
                        iM8713s3 = ng6.m8713s(iMo3593d2);
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 11:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        } else {
                            iMo3593d2 = ((byte[]) obj2).length;
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        }
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 12:
                        iM8711a2 = ng6.m8713s(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 13:
                        if (obj2 instanceof fi6) {
                            iM8711a2 = ng6.m8711a(((fi6) obj2).mo4016f());
                        } else {
                            iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 16:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iM8711a2 = ng6.m8713s((iIntValue13 >> 31) ^ (iIntValue13 + iIntValue13));
                        return iM8711a2 + iM8713s2 + i;
                    case 17:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iM8711a2 = ng6.m8711a((jLongValue13 >> 63) ^ (jLongValue13 + jLongValue13));
                        return iM8711a2 + iM8713s2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 13:
                iM8711a = obj instanceof fi6 ? ng6.m8711a(((fi6) obj).mo4016f()) : ng6.m8711a(((Integer) obj).intValue());
                i = iM8711a + iM8713s4;
                iM8713s2 = ng6.m8713s(16);
                if (tl6Var2 == tl6Var3) {
                    Charset charset15 = ni6.f25875a;
                    iM8713s2 += iM8713s2;
                }
                switch (tl6Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 2:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 3:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 4:
                        iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM8711a2 = 1;
                        return iM8711a2 + iM8713s2 + i;
                    case 8:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                            iM8711a2 = iM8713s3 + iMo3593d2;
                        } else {
                            iM8711a2 = ng6.m8712b((String) obj2);
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 9:
                        iM8711a2 = ((zh6) ((ef6) obj2)).m13571i();
                        return iM8711a2 + iM8713s2 + i;
                    case 10:
                        iMo3593d2 = ((zh6) ((ef6) obj2)).m13571i();
                        iM8713s3 = ng6.m8713s(iMo3593d2);
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 11:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        } else {
                            iMo3593d2 = ((byte[]) obj2).length;
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        }
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 12:
                        iM8711a2 = ng6.m8713s(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 13:
                        if (obj2 instanceof fi6) {
                            iM8711a2 = ng6.m8711a(((fi6) obj2).mo4016f());
                        } else {
                            iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 16:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iM8711a2 = ng6.m8713s((iIntValue14 >> 31) ^ (iIntValue14 + iIntValue14));
                        return iM8711a2 + iM8713s2 + i;
                    case 17:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iM8711a2 = ng6.m8711a((jLongValue14 >> 63) ^ (jLongValue14 + jLongValue14));
                        return iM8711a2 + iM8713s2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 14:
                ((Integer) obj).getClass();
                iM8711a = 4;
                i = iM8711a + iM8713s4;
                iM8713s2 = ng6.m8713s(16);
                if (tl6Var2 == tl6Var3) {
                    Charset charset16 = ni6.f25875a;
                    iM8713s2 += iM8713s2;
                }
                switch (tl6Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 2:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 3:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 4:
                        iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM8711a2 = 1;
                        return iM8711a2 + iM8713s2 + i;
                    case 8:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                            iM8711a2 = iM8713s3 + iMo3593d2;
                        } else {
                            iM8711a2 = ng6.m8712b((String) obj2);
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 9:
                        iM8711a2 = ((zh6) ((ef6) obj2)).m13571i();
                        return iM8711a2 + iM8713s2 + i;
                    case 10:
                        iMo3593d2 = ((zh6) ((ef6) obj2)).m13571i();
                        iM8713s3 = ng6.m8713s(iMo3593d2);
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 11:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        } else {
                            iMo3593d2 = ((byte[]) obj2).length;
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        }
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 12:
                        iM8711a2 = ng6.m8713s(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 13:
                        if (obj2 instanceof fi6) {
                            iM8711a2 = ng6.m8711a(((fi6) obj2).mo4016f());
                        } else {
                            iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 16:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iM8711a2 = ng6.m8713s((iIntValue15 >> 31) ^ (iIntValue15 + iIntValue15));
                        return iM8711a2 + iM8713s2 + i;
                    case 17:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iM8711a2 = ng6.m8711a((jLongValue15 >> 63) ^ (jLongValue15 + jLongValue15));
                        return iM8711a2 + iM8713s2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 15:
                ((Long) obj).getClass();
                iM8711a = 8;
                i = iM8711a + iM8713s4;
                iM8713s2 = ng6.m8713s(16);
                if (tl6Var2 == tl6Var3) {
                    Charset charset17 = ni6.f25875a;
                    iM8713s2 += iM8713s2;
                }
                switch (tl6Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 2:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 3:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 4:
                        iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM8711a2 = 1;
                        return iM8711a2 + iM8713s2 + i;
                    case 8:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                            iM8711a2 = iM8713s3 + iMo3593d2;
                        } else {
                            iM8711a2 = ng6.m8712b((String) obj2);
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 9:
                        iM8711a2 = ((zh6) ((ef6) obj2)).m13571i();
                        return iM8711a2 + iM8713s2 + i;
                    case 10:
                        iMo3593d2 = ((zh6) ((ef6) obj2)).m13571i();
                        iM8713s3 = ng6.m8713s(iMo3593d2);
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 11:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        } else {
                            iMo3593d2 = ((byte[]) obj2).length;
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        }
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 12:
                        iM8711a2 = ng6.m8713s(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 13:
                        if (obj2 instanceof fi6) {
                            iM8711a2 = ng6.m8711a(((fi6) obj2).mo4016f());
                        } else {
                            iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 16:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iM8711a2 = ng6.m8713s((iIntValue16 >> 31) ^ (iIntValue16 + iIntValue16));
                        return iM8711a2 + iM8713s2 + i;
                    case 17:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iM8711a2 = ng6.m8711a((jLongValue16 >> 63) ^ (jLongValue16 + jLongValue16));
                        return iM8711a2 + iM8713s2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 16:
                int iIntValue17 = ((Integer) obj).intValue();
                iM8711a = ng6.m8713s((iIntValue17 >> 31) ^ (iIntValue17 + iIntValue17));
                i = iM8711a + iM8713s4;
                iM8713s2 = ng6.m8713s(16);
                if (tl6Var2 == tl6Var3) {
                    Charset charset18 = ni6.f25875a;
                    iM8713s2 += iM8713s2;
                }
                switch (tl6Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 2:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 3:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 4:
                        iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM8711a2 = 1;
                        return iM8711a2 + iM8713s2 + i;
                    case 8:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                            iM8711a2 = iM8713s3 + iMo3593d2;
                        } else {
                            iM8711a2 = ng6.m8712b((String) obj2);
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 9:
                        iM8711a2 = ((zh6) ((ef6) obj2)).m13571i();
                        return iM8711a2 + iM8713s2 + i;
                    case 10:
                        iMo3593d2 = ((zh6) ((ef6) obj2)).m13571i();
                        iM8713s3 = ng6.m8713s(iMo3593d2);
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 11:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        } else {
                            iMo3593d2 = ((byte[]) obj2).length;
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        }
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 12:
                        iM8711a2 = ng6.m8713s(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 13:
                        if (obj2 instanceof fi6) {
                            iM8711a2 = ng6.m8711a(((fi6) obj2).mo4016f());
                        } else {
                            iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 16:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iM8711a2 = ng6.m8713s((iIntValue18 >> 31) ^ (iIntValue18 + iIntValue18));
                        return iM8711a2 + iM8713s2 + i;
                    case 17:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iM8711a2 = ng6.m8711a((jLongValue17 >> 63) ^ (jLongValue17 + jLongValue17));
                        return iM8711a2 + iM8713s2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 17:
                long jLongValue18 = ((Long) obj).longValue();
                iM8711a = ng6.m8711a((jLongValue18 >> 63) ^ (jLongValue18 + jLongValue18));
                i = iM8711a + iM8713s4;
                iM8713s2 = ng6.m8713s(16);
                if (tl6Var2 == tl6Var3) {
                    Charset charset19 = ni6.f25875a;
                    iM8713s2 += iM8713s2;
                }
                switch (tl6Var2.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 2:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 3:
                        iM8711a2 = ng6.m8711a(((Long) obj2).longValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 4:
                        iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 5:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 6:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 7:
                        ((Boolean) obj2).getClass();
                        iM8711a2 = 1;
                        return iM8711a2 + iM8713s2 + i;
                    case 8:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                            iM8711a2 = iM8713s3 + iMo3593d2;
                        } else {
                            iM8711a2 = ng6.m8712b((String) obj2);
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 9:
                        iM8711a2 = ((zh6) ((ef6) obj2)).m13571i();
                        return iM8711a2 + iM8713s2 + i;
                    case 10:
                        iMo3593d2 = ((zh6) ((ef6) obj2)).m13571i();
                        iM8713s3 = ng6.m8713s(iMo3593d2);
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 11:
                        if (obj2 instanceof ig6) {
                            iMo3593d2 = ((ig6) obj2).mo3593d();
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        } else {
                            iMo3593d2 = ((byte[]) obj2).length;
                            iM8713s3 = ng6.m8713s(iMo3593d2);
                        }
                        iM8711a2 = iM8713s3 + iMo3593d2;
                        return iM8711a2 + iM8713s2 + i;
                    case 12:
                        iM8711a2 = ng6.m8713s(((Integer) obj2).intValue());
                        return iM8711a2 + iM8713s2 + i;
                    case 13:
                        if (obj2 instanceof fi6) {
                            iM8711a2 = ng6.m8711a(((fi6) obj2).mo4016f());
                        } else {
                            iM8711a2 = ng6.m8711a(((Integer) obj2).intValue());
                        }
                        return iM8711a2 + iM8713s2 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM8711a2 = 4;
                        return iM8711a2 + iM8713s2 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM8711a2 + iM8713s2 + i;
                    case 16:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iM8711a2 = ng6.m8713s((iIntValue19 >> 31) ^ (iIntValue19 + iIntValue19));
                        return iM8711a2 + iM8713s2 + i;
                    case 17:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iM8711a2 = ng6.m8711a((jLongValue19 >> 63) ^ (jLongValue19 + jLongValue19));
                        return iM8711a2 + iM8713s2 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
