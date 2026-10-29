package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import org.chromium.net.NetError;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class mz3 {

    /* JADX INFO: renamed from: a */
    public static final kj0 f25344a = as4.m3262u(new nu3(4));

    /* JADX INFO: renamed from: b */
    public static final long f25345b = zy5.m13870e(4294948388L);

    /* JADX INFO: renamed from: a */
    public static final void m8459a(nt2 nt2Var, oz3 oz3Var, boolean z, mq1 mq1Var, pg0 pg0Var, mi0 mi0Var, int i) {
        oz3 oz3Var2;
        boolean z2;
        mq1 mq1Var2;
        nt2 nt2Var2;
        pg0 pg0Var2 = y70.f34985p;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1512468425);
        int i2 = i | 1576342;
        byte b = 1;
        if (ir1Var.m6871T(i2 & 1, (599187 & i2) != 599186)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                oz3 oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
                mq1Var2 = AbstractC1356y5.f34882e;
                nt2Var2 = kt2.f23428a;
                z2 = true;
                oz3Var2 = oz3VarM10799H;
            } else {
                ir1Var.m6874W();
                nt2Var2 = nt2Var;
                oz3Var2 = oz3Var;
                z2 = z;
                mq1Var2 = mq1Var;
            }
            ir1Var.m6913s();
            C0897m5 c0897m5 = new C0897m5(b);
            c0897m5.f24664b = pg0Var;
            VarHandle.storeStoreFence();
            m8463e(nt2Var2, oz3Var2, z2, rz2.m10510c(vd6.m11834R(416265045, c0897m5, ir1Var), ir1Var), null, null, pg0Var2, null, mq1Var2, null, ir1Var, 102236550, 688);
            nt2Var = nt2Var2;
        } else {
            ir1Var.m6874W();
            oz3Var2 = oz3Var;
            z2 = z;
            mq1Var2 = mq1Var;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            d02 d02Var = new d02(b);
            d02Var.f16681b = nt2Var;
            d02Var.f16683d = oz3Var2;
            d02Var.f16682c = z2;
            d02Var.f16684e = mq1Var2;
            d02Var.f16685f = pg0Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = d02Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m8460b(nt2 nt2Var, oz3 oz3Var, boolean z, nv2 nv2Var, mq1 mq1Var, mq1 mq1Var2, nq1 nq1Var, nq1 nq1Var2, mi0 mi0Var, int i, int i2) {
        nt2 nt2Var2;
        int i3;
        oz3 oz3Var2;
        mq1 mq1Var3;
        mq1 mq1Var4;
        nq1 nq1Var3;
        boolean z2;
        nv2 nv2Var2;
        nt2 nt2Var3;
        oz3 oz3Var3;
        mq1 mq1Var5;
        int i4;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1710373362);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            nt2Var2 = nt2Var;
        } else if ((i & 6) == 0) {
            nt2Var2 = nt2Var;
            i3 = (ir1Var.m6890g(nt2Var2) ? 4 : 2) | i;
        } else {
            nt2Var2 = nt2Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                oz3Var2 = oz3Var;
                int i6 = ir1Var.m6890g(oz3Var2) ? 32 : 16;
                i3 |= i6;
            } else {
                oz3Var2 = oz3Var;
            }
            i3 |= i6;
        } else {
            oz3Var2 = oz3Var;
        }
        int i7 = 224640 | i3;
        int i8 = i2 & 64;
        if (i8 != 0) {
            i7 = 1797504 | i3;
            mq1Var3 = mq1Var;
        } else {
            mq1Var3 = mq1Var;
            if ((i & 1572864) == 0) {
                i7 |= ir1Var.m6894i(mq1Var3) ? 1048576 : 524288;
            }
        }
        int i9 = i2 & 128;
        if (i9 != 0) {
            i7 |= 12582912;
            mq1Var4 = mq1Var2;
        } else {
            mq1Var4 = mq1Var2;
            if ((12582912 & i) == 0) {
                i7 |= ir1Var.m6894i(mq1Var4) ? 8388608 : 4194304;
            }
        }
        int i10 = i2 & 256;
        if (i10 != 0) {
            i7 |= 100663296;
            nq1Var3 = nq1Var;
        } else {
            nq1Var3 = nq1Var;
            if ((100663296 & i) == 0) {
                i7 |= ir1Var.m6894i(nq1Var3) ? 67108864 : 33554432;
            }
        }
        if ((805306368 & i) == 0) {
            i7 |= ir1Var.m6894i(nq1Var2) ? 536870912 : 268435456;
        }
        int i11 = i7;
        if (ir1Var.m6871T(i11 & 1, (i11 & 306783379) != 306783378)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                nt2 nt2Var4 = i5 != 0 ? kt2.f23428a : nt2Var2;
                if ((i2 & 2) != 0) {
                    oz3 oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
                    i11 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                    oz3Var2 = oz3VarM10799H;
                }
                Object objM6869O = ir1Var.m6869O();
                if (objM6869O == ki0.f23136a) {
                    objM6869O = sj3.m10810f();
                    ir1Var.m6905n0(objM6869O);
                }
                nv2 nv2Var3 = (nv2) objM6869O;
                if (i8 != 0) {
                    mq1Var3 = null;
                }
                if (i9 != 0) {
                    mq1Var4 = null;
                }
                if (i10 != 0) {
                    nq1Var3 = null;
                }
                nv2Var2 = nv2Var3;
                oz3Var3 = oz3Var2;
                mq1Var5 = mq1Var4;
                i4 = i11;
                z2 = true;
                nt2Var3 = nt2Var4;
            } else {
                ir1Var.m6874W();
                if ((i2 & 2) != 0) {
                    i11 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
                z2 = z;
                nv2Var2 = nv2Var;
                nt2Var3 = nt2Var2;
                oz3Var3 = oz3Var2;
                mq1Var5 = mq1Var4;
                i4 = i11;
            }
            mq1 mq1Var6 = mq1Var3;
            ir1Var.m6913s();
            ri1 ri1Var = new ri1((byte) 6);
            ri1Var.f29309c = mq1Var6;
            ri1Var.f29310d = mq1Var5;
            ri1Var.f29311e = nq1Var2;
            ri1Var.f29312f = oz3Var3;
            ri1Var.f29308b = nq1Var3;
            VarHandle.storeStoreFence();
            m8461c(nt2Var3, oz3Var3, z2, null, null, nv2Var2, vd6.m11834R(440592317, ri1Var, ir1Var), ir1Var, 1572864 | (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (i4 & 458752), 0);
            ir1Var = ir1Var;
            oz3Var2 = oz3Var3;
            mq1Var3 = mq1Var6;
            mq1Var4 = mq1Var5;
        } else {
            ir1Var.m6874W();
            z2 = z;
            nv2Var2 = nv2Var;
            nt2Var3 = nt2Var2;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            iz3 iz3Var = new iz3();
            iz3Var.f21901a = nt2Var3;
            iz3Var.f21902b = oz3Var2;
            iz3Var.f21903c = z2;
            iz3Var.f21904d = nv2Var2;
            iz3Var.f21905e = mq1Var3;
            iz3Var.f21906f = mq1Var4;
            iz3Var.f21907g = nq1Var3;
            iz3Var.f21908h = nq1Var2;
            iz3Var.f21909i = i;
            iz3Var.f21910j = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = iz3Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01df  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00df  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x012b  */
    /* JADX WARN: Code duplicated, block: B:91:0x013c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0147  */
    /* JADX WARN: Code duplicated, block: B:94:0x014a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0189 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x018b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final void m8461c(nt2 nt2Var, oz3 oz3Var, boolean z, wp1 wp1Var, wp1 wp1Var2, nv2 nv2Var, pg0 pg0Var, mi0 mi0Var, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        wp1 wp1Var3;
        int i5;
        int i6;
        nv2 nv2Var2;
        int i7;
        int i8;
        boolean z3;
        yk3 yk3VarM6916v;
        int i9;
        i50 i50Var;
        wp1 wp1Var4;
        wp1 wp1Var5;
        boolean z4;
        Object objM6869O;
        nv2 nv2Var3;
        boolean z5;
        float f;
        xb4 xb4VarM8766b;
        boolean zM6890g;
        Object obj;
        int i10;
        int i11;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-472953142);
        if ((i & 6) == 0) {
            i3 = (ir1Var.m6890g(nt2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ir1Var.m6890g(oz3Var) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= ir1Var.m6892h(z2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (ir1Var.m6894i(wp1Var)) {
                    i11 = 2048;
                } else {
                    i11 = 1024;
                }
                i3 |= i11;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    wp1Var3 = wp1Var2;
                    if (ir1Var.m6894i(wp1Var3)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        nv2Var2 = nv2Var;
                        if (ir1Var.m6890g(nv2Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((1572864 & i) == 0) {
                        if (ir1Var.m6894i(pg0Var)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i3 |= i10;
                    }
                    i8 = i3;
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (ir1Var.m6871T(i8 & 1, z3)) {
                        ir1Var.m6876Y();
                        i9 = i & 1;
                        i50Var = ki0.f23136a;
                        if (i9 != 0 || ir1Var.m6856B()) {
                            if (i12 != 0) {
                                z2 = true;
                            }
                            if (i4 != 0) {
                                wp1Var4 = null;
                            } else {
                                wp1Var4 = wp1Var3;
                            }
                            if (i6 != 0) {
                                objM6869O = ir1Var.m6869O();
                                if (objM6869O == i50Var) {
                                    objM6869O = sj3.m10810f();
                                    ir1Var.m6905n0(objM6869O);
                                }
                                nv2Var3 = (nv2) objM6869O;
                                boolean z6 = z2;
                                wp1Var5 = wp1Var4;
                                z4 = z6;
                            } else {
                                boolean z7 = z2;
                                wp1Var5 = wp1Var4;
                                z4 = z7;
                            }
                            ir1Var.m6913s();
                            long j = oz3Var.f27244a.f34722a;
                            nc4 nc4Var = pq2.f27894b;
                            xb4 xb4VarM4941a = e74.m4941a(j, ((lq2) ir1Var.m6898k(nc4Var)).f24280d.mo7286c(), ir1Var, 0);
                            z5 = z4;
                            xb4 xb4VarM4941a2 = e74.m4941a(oz3Var.f27244a.f34723b, ((lq2) ir1Var.m6898k(nc4Var)).f24280d.mo7286c(), ir1Var, 0);
                            if (wp1Var5 != null) {
                                ir1Var.m6885d0(2041275179);
                                qq2.m10018b(nv2Var3, ir1Var, (i8 >> 15) & 14);
                                ir1Var.m6912r(false);
                            } else {
                                ir1Var.m6885d0(2041318424);
                                ir1Var.m6912r(false);
                            }
                            if (z5) {
                                f = 1.0f;
                            } else {
                                f = 0.38f;
                            }
                            xb4VarM8766b = AbstractC0947ni.m8766b(f, ((lq2) ir1Var.m6898k(nc4Var)).f24280d.mo7286c(), ir1Var);
                            long j2 = ((pb0) xb4VarM4941a.getValue()).f27503a;
                            long j3 = ((pb0) xb4VarM4941a2.getValue()).f27503a;
                            nt2 nt2VarM5648F = AbstractC0647fd.m5648F(n74.m8573a(nt2Var, Float.NaN, 42.0f), oz3Var.f27246c.f26222a);
                            zM6890g = ir1Var.m6890g(xb4VarM8766b);
                            Object objM6869O2 = ir1Var.m6869O();
                            obj = objM6869O2;
                            if (zM6890g || objM6869O2 == i50Var) {
                                C0676g5 c0676g5 = new C0676g5((byte) 7);
                                c0676g5.f19614b = xb4VarM8766b;
                                VarHandle.storeStoreFence();
                                ir1Var.m6905n0(c0676g5);
                                obj = c0676g5;
                            }
                            nt2 nt2VarM10693F = se0.m10693F(nt2VarM5648F, (yp1) obj);
                            p44 p44Var = oz3Var.f27245b;
                            f02 f02Var = new f02((byte) 1);
                            f02Var.f18631b = wp1Var;
                            f02Var.f18634e = wp1Var5;
                            f02Var.f18635f = oz3Var;
                            f02Var.f18636g = nv2Var3;
                            f02Var.f18632c = z5;
                            f02Var.f18633d = pg0Var;
                            VarHandle.storeStoreFence();
                            kf4.m7511a(nt2VarM10693F, p44Var, j2, j3, 0.0f, vd6.m11834R(-384411099, f02Var, ir1Var), ir1Var, 12582912, 112);
                            wp1Var3 = wp1Var5;
                            nv2Var2 = nv2Var3;
                            z2 = z5;
                        } else {
                            ir1Var.m6874W();
                            z4 = z2;
                            wp1Var5 = wp1Var3;
                        }
                        nv2Var3 = nv2Var2;
                        ir1Var.m6913s();
                        long j4 = oz3Var.f27244a.f34722a;
                        nc4 nc4Var2 = pq2.f27894b;
                        xb4 xb4VarM4941a3 = e74.m4941a(j4, ((lq2) ir1Var.m6898k(nc4Var2)).f24280d.mo7286c(), ir1Var, 0);
                        z5 = z4;
                        xb4 xb4VarM4941a4 = e74.m4941a(oz3Var.f27244a.f34723b, ((lq2) ir1Var.m6898k(nc4Var2)).f24280d.mo7286c(), ir1Var, 0);
                        if (wp1Var5 != null) {
                            ir1Var.m6885d0(2041275179);
                            qq2.m10018b(nv2Var3, ir1Var, (i8 >> 15) & 14);
                            ir1Var.m6912r(false);
                        } else {
                            ir1Var.m6885d0(2041318424);
                            ir1Var.m6912r(false);
                        }
                        if (z5) {
                            f = 1.0f;
                        } else {
                            f = 0.38f;
                        }
                        xb4VarM8766b = AbstractC0947ni.m8766b(f, ((lq2) ir1Var.m6898k(nc4Var2)).f24280d.mo7286c(), ir1Var);
                        long j5 = ((pb0) xb4VarM4941a3.getValue()).f27503a;
                        long j6 = ((pb0) xb4VarM4941a4.getValue()).f27503a;
                        nt2 nt2VarM5648F2 = AbstractC0647fd.m5648F(n74.m8573a(nt2Var, Float.NaN, 42.0f), oz3Var.f27246c.f26222a);
                        zM6890g = ir1Var.m6890g(xb4VarM8766b);
                        Object objM6869O3 = ir1Var.m6869O();
                        obj = objM6869O3;
                        if (zM6890g) {
                            C0676g5 c0676g6 = new C0676g5((byte) 7);
                            c0676g6.f19614b = xb4VarM8766b;
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(c0676g6);
                            obj = c0676g6;
                        } else {
                            C0676g5 c0676g7 = new C0676g5((byte) 7);
                            c0676g7.f19614b = xb4VarM8766b;
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(c0676g7);
                            obj = c0676g7;
                        }
                        nt2 nt2VarM10693F2 = se0.m10693F(nt2VarM5648F2, (yp1) obj);
                        p44 p44Var2 = oz3Var.f27245b;
                        f02 f02Var2 = new f02((byte) 1);
                        f02Var2.f18631b = wp1Var;
                        f02Var2.f18634e = wp1Var5;
                        f02Var2.f18635f = oz3Var;
                        f02Var2.f18636g = nv2Var3;
                        f02Var2.f18632c = z5;
                        f02Var2.f18633d = pg0Var;
                        VarHandle.storeStoreFence();
                        kf4.m7511a(nt2VarM10693F2, p44Var2, j5, j6, 0.0f, vd6.m11834R(-384411099, f02Var2, ir1Var), ir1Var, 12582912, 112);
                        wp1Var3 = wp1Var5;
                        nv2Var2 = nv2Var3;
                        z2 = z5;
                    } else {
                        ir1Var.m6874W();
                    }
                    yk3VarM6916v = ir1Var.m6916v();
                    if (yk3VarM6916v != null) {
                        hz3 hz3Var = new hz3();
                        hz3Var.f20951a = nt2Var;
                        hz3Var.f20952b = oz3Var;
                        hz3Var.f20953c = z2;
                        hz3Var.f20954d = wp1Var;
                        hz3Var.f20955e = wp1Var3;
                        hz3Var.f20956f = nv2Var2;
                        hz3Var.f20957g = pg0Var;
                        hz3Var.f20958h = i;
                        hz3Var.f20959i = i2;
                        VarHandle.storeStoreFence();
                        yk3VarM6916v.f35300d = hz3Var;
                    }
                }
                i3 |= 196608;
                nv2Var2 = nv2Var;
                if ((1572864 & i) == 0) {
                    if (ir1Var.m6894i(pg0Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                i8 = i3;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (ir1Var.m6871T(i8 & 1, z3)) {
                    ir1Var.m6876Y();
                    i9 = i & 1;
                    i50Var = ki0.f23136a;
                    if (i9 != 0) {
                        if (i12 != 0) {
                            z2 = true;
                        }
                        if (i4 != 0) {
                            wp1Var4 = null;
                        } else {
                            wp1Var4 = wp1Var3;
                        }
                        if (i6 != 0) {
                            objM6869O = ir1Var.m6869O();
                            if (objM6869O == i50Var) {
                                objM6869O = sj3.m10810f();
                                ir1Var.m6905n0(objM6869O);
                            }
                            nv2Var3 = (nv2) objM6869O;
                            boolean z8 = z2;
                            wp1Var5 = wp1Var4;
                            z4 = z8;
                        } else {
                            boolean z9 = z2;
                            wp1Var5 = wp1Var4;
                            z4 = z9;
                            nv2Var3 = nv2Var2;
                        }
                    } else {
                        if (i12 != 0) {
                            z2 = true;
                        }
                        if (i4 != 0) {
                            wp1Var4 = null;
                        } else {
                            wp1Var4 = wp1Var3;
                        }
                        if (i6 != 0) {
                            objM6869O = ir1Var.m6869O();
                            if (objM6869O == i50Var) {
                                objM6869O = sj3.m10810f();
                                ir1Var.m6905n0(objM6869O);
                            }
                            nv2Var3 = (nv2) objM6869O;
                            boolean z10 = z2;
                            wp1Var5 = wp1Var4;
                            z4 = z10;
                        } else {
                            boolean z11 = z2;
                            wp1Var5 = wp1Var4;
                            z4 = z11;
                            nv2Var3 = nv2Var2;
                        }
                    }
                    ir1Var.m6913s();
                    long j7 = oz3Var.f27244a.f34722a;
                    nc4 nc4Var3 = pq2.f27894b;
                    xb4 xb4VarM4941a5 = e74.m4941a(j7, ((lq2) ir1Var.m6898k(nc4Var3)).f24280d.mo7286c(), ir1Var, 0);
                    z5 = z4;
                    xb4 xb4VarM4941a6 = e74.m4941a(oz3Var.f27244a.f34723b, ((lq2) ir1Var.m6898k(nc4Var3)).f24280d.mo7286c(), ir1Var, 0);
                    if (wp1Var5 != null) {
                        ir1Var.m6885d0(2041275179);
                        qq2.m10018b(nv2Var3, ir1Var, (i8 >> 15) & 14);
                        ir1Var.m6912r(false);
                    } else {
                        ir1Var.m6885d0(2041318424);
                        ir1Var.m6912r(false);
                    }
                    if (z5) {
                        f = 1.0f;
                    } else {
                        f = 0.38f;
                    }
                    xb4VarM8766b = AbstractC0947ni.m8766b(f, ((lq2) ir1Var.m6898k(nc4Var3)).f24280d.mo7286c(), ir1Var);
                    long j8 = ((pb0) xb4VarM4941a5.getValue()).f27503a;
                    long j9 = ((pb0) xb4VarM4941a6.getValue()).f27503a;
                    nt2 nt2VarM5648F3 = AbstractC0647fd.m5648F(n74.m8573a(nt2Var, Float.NaN, 42.0f), oz3Var.f27246c.f26222a);
                    zM6890g = ir1Var.m6890g(xb4VarM8766b);
                    Object objM6869O4 = ir1Var.m6869O();
                    obj = objM6869O4;
                    if (zM6890g) {
                        C0676g5 c0676g8 = new C0676g5((byte) 7);
                        c0676g8.f19614b = xb4VarM8766b;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(c0676g8);
                        obj = c0676g8;
                    } else {
                        C0676g5 c0676g9 = new C0676g5((byte) 7);
                        c0676g9.f19614b = xb4VarM8766b;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(c0676g9);
                        obj = c0676g9;
                    }
                    nt2 nt2VarM10693F3 = se0.m10693F(nt2VarM5648F3, (yp1) obj);
                    p44 p44Var3 = oz3Var.f27245b;
                    f02 f02Var3 = new f02((byte) 1);
                    f02Var3.f18631b = wp1Var;
                    f02Var3.f18634e = wp1Var5;
                    f02Var3.f18635f = oz3Var;
                    f02Var3.f18636g = nv2Var3;
                    f02Var3.f18632c = z5;
                    f02Var3.f18633d = pg0Var;
                    VarHandle.storeStoreFence();
                    kf4.m7511a(nt2VarM10693F3, p44Var3, j8, j9, 0.0f, vd6.m11834R(-384411099, f02Var3, ir1Var), ir1Var, 12582912, 112);
                    wp1Var3 = wp1Var5;
                    nv2Var2 = nv2Var3;
                    z2 = z5;
                } else {
                    ir1Var.m6874W();
                }
                yk3VarM6916v = ir1Var.m6916v();
                if (yk3VarM6916v != null) {
                    hz3 hz3Var2 = new hz3();
                    hz3Var2.f20951a = nt2Var;
                    hz3Var2.f20952b = oz3Var;
                    hz3Var2.f20953c = z2;
                    hz3Var2.f20954d = wp1Var;
                    hz3Var2.f20955e = wp1Var3;
                    hz3Var2.f20956f = nv2Var2;
                    hz3Var2.f20957g = pg0Var;
                    hz3Var2.f20958h = i;
                    hz3Var2.f20959i = i2;
                    VarHandle.storeStoreFence();
                    yk3VarM6916v.f35300d = hz3Var2;
                }
            }
            i3 |= 24576;
            wp1Var3 = wp1Var2;
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    nv2Var2 = nv2Var;
                    if (ir1Var.m6890g(nv2Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if (ir1Var.m6894i(pg0Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                i8 = i3;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (ir1Var.m6871T(i8 & 1, z3)) {
                    ir1Var.m6876Y();
                    i9 = i & 1;
                    i50Var = ki0.f23136a;
                    if (i9 != 0) {
                        if (i12 != 0) {
                            z2 = true;
                        }
                        if (i4 != 0) {
                            wp1Var4 = null;
                        } else {
                            wp1Var4 = wp1Var3;
                        }
                        if (i6 != 0) {
                            objM6869O = ir1Var.m6869O();
                            if (objM6869O == i50Var) {
                                objM6869O = sj3.m10810f();
                                ir1Var.m6905n0(objM6869O);
                            }
                            nv2Var3 = (nv2) objM6869O;
                            boolean z12 = z2;
                            wp1Var5 = wp1Var4;
                            z4 = z12;
                        } else {
                            boolean z13 = z2;
                            wp1Var5 = wp1Var4;
                            z4 = z13;
                            nv2Var3 = nv2Var2;
                        }
                    } else {
                        if (i12 != 0) {
                            z2 = true;
                        }
                        if (i4 != 0) {
                            wp1Var4 = null;
                        } else {
                            wp1Var4 = wp1Var3;
                        }
                        if (i6 != 0) {
                            objM6869O = ir1Var.m6869O();
                            if (objM6869O == i50Var) {
                                objM6869O = sj3.m10810f();
                                ir1Var.m6905n0(objM6869O);
                            }
                            nv2Var3 = (nv2) objM6869O;
                            boolean z14 = z2;
                            wp1Var5 = wp1Var4;
                            z4 = z14;
                        } else {
                            boolean z15 = z2;
                            wp1Var5 = wp1Var4;
                            z4 = z15;
                            nv2Var3 = nv2Var2;
                        }
                    }
                    ir1Var.m6913s();
                    long j10 = oz3Var.f27244a.f34722a;
                    nc4 nc4Var4 = pq2.f27894b;
                    xb4 xb4VarM4941a7 = e74.m4941a(j10, ((lq2) ir1Var.m6898k(nc4Var4)).f24280d.mo7286c(), ir1Var, 0);
                    z5 = z4;
                    xb4 xb4VarM4941a8 = e74.m4941a(oz3Var.f27244a.f34723b, ((lq2) ir1Var.m6898k(nc4Var4)).f24280d.mo7286c(), ir1Var, 0);
                    if (wp1Var5 != null) {
                        ir1Var.m6885d0(2041275179);
                        qq2.m10018b(nv2Var3, ir1Var, (i8 >> 15) & 14);
                        ir1Var.m6912r(false);
                    } else {
                        ir1Var.m6885d0(2041318424);
                        ir1Var.m6912r(false);
                    }
                    if (z5) {
                        f = 1.0f;
                    } else {
                        f = 0.38f;
                    }
                    xb4VarM8766b = AbstractC0947ni.m8766b(f, ((lq2) ir1Var.m6898k(nc4Var4)).f24280d.mo7286c(), ir1Var);
                    long j11 = ((pb0) xb4VarM4941a7.getValue()).f27503a;
                    long j12 = ((pb0) xb4VarM4941a8.getValue()).f27503a;
                    nt2 nt2VarM5648F4 = AbstractC0647fd.m5648F(n74.m8573a(nt2Var, Float.NaN, 42.0f), oz3Var.f27246c.f26222a);
                    zM6890g = ir1Var.m6890g(xb4VarM8766b);
                    Object objM6869O5 = ir1Var.m6869O();
                    obj = objM6869O5;
                    if (zM6890g) {
                        C0676g5 c0676g10 = new C0676g5((byte) 7);
                        c0676g10.f19614b = xb4VarM8766b;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(c0676g10);
                        obj = c0676g10;
                    } else {
                        C0676g5 c0676g11 = new C0676g5((byte) 7);
                        c0676g11.f19614b = xb4VarM8766b;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(c0676g11);
                        obj = c0676g11;
                    }
                    nt2 nt2VarM10693F4 = se0.m10693F(nt2VarM5648F4, (yp1) obj);
                    p44 p44Var4 = oz3Var.f27245b;
                    f02 f02Var4 = new f02((byte) 1);
                    f02Var4.f18631b = wp1Var;
                    f02Var4.f18634e = wp1Var5;
                    f02Var4.f18635f = oz3Var;
                    f02Var4.f18636g = nv2Var3;
                    f02Var4.f18632c = z5;
                    f02Var4.f18633d = pg0Var;
                    VarHandle.storeStoreFence();
                    kf4.m7511a(nt2VarM10693F4, p44Var4, j11, j12, 0.0f, vd6.m11834R(-384411099, f02Var4, ir1Var), ir1Var, 12582912, 112);
                    wp1Var3 = wp1Var5;
                    nv2Var2 = nv2Var3;
                    z2 = z5;
                } else {
                    ir1Var.m6874W();
                }
                yk3VarM6916v = ir1Var.m6916v();
                if (yk3VarM6916v != null) {
                    hz3 hz3Var3 = new hz3();
                    hz3Var3.f20951a = nt2Var;
                    hz3Var3.f20952b = oz3Var;
                    hz3Var3.f20953c = z2;
                    hz3Var3.f20954d = wp1Var;
                    hz3Var3.f20955e = wp1Var3;
                    hz3Var3.f20956f = nv2Var2;
                    hz3Var3.f20957g = pg0Var;
                    hz3Var3.f20958h = i;
                    hz3Var3.f20959i = i2;
                    VarHandle.storeStoreFence();
                    yk3VarM6916v.f35300d = hz3Var3;
                }
            }
            i3 |= 196608;
            nv2Var2 = nv2Var;
            if ((1572864 & i) == 0) {
                if (ir1Var.m6894i(pg0Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            i8 = i3;
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ir1Var.m6871T(i8 & 1, z3)) {
                ir1Var.m6876Y();
                i9 = i & 1;
                i50Var = ki0.f23136a;
                if (i9 != 0) {
                    if (i12 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        wp1Var4 = null;
                    } else {
                        wp1Var4 = wp1Var3;
                    }
                    if (i6 != 0) {
                        objM6869O = ir1Var.m6869O();
                        if (objM6869O == i50Var) {
                            objM6869O = sj3.m10810f();
                            ir1Var.m6905n0(objM6869O);
                        }
                        nv2Var3 = (nv2) objM6869O;
                        boolean z16 = z2;
                        wp1Var5 = wp1Var4;
                        z4 = z16;
                    } else {
                        boolean z17 = z2;
                        wp1Var5 = wp1Var4;
                        z4 = z17;
                        nv2Var3 = nv2Var2;
                    }
                } else {
                    if (i12 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        wp1Var4 = null;
                    } else {
                        wp1Var4 = wp1Var3;
                    }
                    if (i6 != 0) {
                        objM6869O = ir1Var.m6869O();
                        if (objM6869O == i50Var) {
                            objM6869O = sj3.m10810f();
                            ir1Var.m6905n0(objM6869O);
                        }
                        nv2Var3 = (nv2) objM6869O;
                        boolean z18 = z2;
                        wp1Var5 = wp1Var4;
                        z4 = z18;
                    } else {
                        boolean z19 = z2;
                        wp1Var5 = wp1Var4;
                        z4 = z19;
                        nv2Var3 = nv2Var2;
                    }
                }
                ir1Var.m6913s();
                long j13 = oz3Var.f27244a.f34722a;
                nc4 nc4Var5 = pq2.f27894b;
                xb4 xb4VarM4941a9 = e74.m4941a(j13, ((lq2) ir1Var.m6898k(nc4Var5)).f24280d.mo7286c(), ir1Var, 0);
                z5 = z4;
                xb4 xb4VarM4941a10 = e74.m4941a(oz3Var.f27244a.f34723b, ((lq2) ir1Var.m6898k(nc4Var5)).f24280d.mo7286c(), ir1Var, 0);
                if (wp1Var5 != null) {
                    ir1Var.m6885d0(2041275179);
                    qq2.m10018b(nv2Var3, ir1Var, (i8 >> 15) & 14);
                    ir1Var.m6912r(false);
                } else {
                    ir1Var.m6885d0(2041318424);
                    ir1Var.m6912r(false);
                }
                if (z5) {
                    f = 1.0f;
                } else {
                    f = 0.38f;
                }
                xb4VarM8766b = AbstractC0947ni.m8766b(f, ((lq2) ir1Var.m6898k(nc4Var5)).f24280d.mo7286c(), ir1Var);
                long j14 = ((pb0) xb4VarM4941a9.getValue()).f27503a;
                long j15 = ((pb0) xb4VarM4941a10.getValue()).f27503a;
                nt2 nt2VarM5648F5 = AbstractC0647fd.m5648F(n74.m8573a(nt2Var, Float.NaN, 42.0f), oz3Var.f27246c.f26222a);
                zM6890g = ir1Var.m6890g(xb4VarM8766b);
                Object objM6869O6 = ir1Var.m6869O();
                obj = objM6869O6;
                if (zM6890g) {
                    C0676g5 c0676g12 = new C0676g5((byte) 7);
                    c0676g12.f19614b = xb4VarM8766b;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0676g12);
                    obj = c0676g12;
                } else {
                    C0676g5 c0676g13 = new C0676g5((byte) 7);
                    c0676g13.f19614b = xb4VarM8766b;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0676g13);
                    obj = c0676g13;
                }
                nt2 nt2VarM10693F5 = se0.m10693F(nt2VarM5648F5, (yp1) obj);
                p44 p44Var5 = oz3Var.f27245b;
                f02 f02Var5 = new f02((byte) 1);
                f02Var5.f18631b = wp1Var;
                f02Var5.f18634e = wp1Var5;
                f02Var5.f18635f = oz3Var;
                f02Var5.f18636g = nv2Var3;
                f02Var5.f18632c = z5;
                f02Var5.f18633d = pg0Var;
                VarHandle.storeStoreFence();
                kf4.m7511a(nt2VarM10693F5, p44Var5, j14, j15, 0.0f, vd6.m11834R(-384411099, f02Var5, ir1Var), ir1Var, 12582912, 112);
                wp1Var3 = wp1Var5;
                nv2Var2 = nv2Var3;
                z2 = z5;
            } else {
                ir1Var.m6874W();
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                hz3 hz3Var4 = new hz3();
                hz3Var4.f20951a = nt2Var;
                hz3Var4.f20952b = oz3Var;
                hz3Var4.f20953c = z2;
                hz3Var4.f20954d = wp1Var;
                hz3Var4.f20955e = wp1Var3;
                hz3Var4.f20956f = nv2Var2;
                hz3Var4.f20957g = pg0Var;
                hz3Var4.f20958h = i;
                hz3Var4.f20959i = i2;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = hz3Var4;
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if (ir1Var.m6894i(wp1Var)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i3 |= i11;
        }
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                wp1Var3 = wp1Var2;
                if (ir1Var.m6894i(wp1Var3)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    nv2Var2 = nv2Var;
                    if (ir1Var.m6890g(nv2Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if (ir1Var.m6894i(pg0Var)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i3 |= i10;
                }
                i8 = i3;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (ir1Var.m6871T(i8 & 1, z3)) {
                    ir1Var.m6876Y();
                    i9 = i & 1;
                    i50Var = ki0.f23136a;
                    if (i9 != 0) {
                        if (i12 != 0) {
                            z2 = true;
                        }
                        if (i4 != 0) {
                            wp1Var4 = null;
                        } else {
                            wp1Var4 = wp1Var3;
                        }
                        if (i6 != 0) {
                            objM6869O = ir1Var.m6869O();
                            if (objM6869O == i50Var) {
                                objM6869O = sj3.m10810f();
                                ir1Var.m6905n0(objM6869O);
                            }
                            nv2Var3 = (nv2) objM6869O;
                            boolean z110 = z2;
                            wp1Var5 = wp1Var4;
                            z4 = z110;
                        } else {
                            boolean z111 = z2;
                            wp1Var5 = wp1Var4;
                            z4 = z111;
                            nv2Var3 = nv2Var2;
                        }
                    } else {
                        if (i12 != 0) {
                            z2 = true;
                        }
                        if (i4 != 0) {
                            wp1Var4 = null;
                        } else {
                            wp1Var4 = wp1Var3;
                        }
                        if (i6 != 0) {
                            objM6869O = ir1Var.m6869O();
                            if (objM6869O == i50Var) {
                                objM6869O = sj3.m10810f();
                                ir1Var.m6905n0(objM6869O);
                            }
                            nv2Var3 = (nv2) objM6869O;
                            boolean z112 = z2;
                            wp1Var5 = wp1Var4;
                            z4 = z112;
                        } else {
                            boolean z113 = z2;
                            wp1Var5 = wp1Var4;
                            z4 = z113;
                            nv2Var3 = nv2Var2;
                        }
                    }
                    ir1Var.m6913s();
                    long j16 = oz3Var.f27244a.f34722a;
                    nc4 nc4Var6 = pq2.f27894b;
                    xb4 xb4VarM4941a11 = e74.m4941a(j16, ((lq2) ir1Var.m6898k(nc4Var6)).f24280d.mo7286c(), ir1Var, 0);
                    z5 = z4;
                    xb4 xb4VarM4941a12 = e74.m4941a(oz3Var.f27244a.f34723b, ((lq2) ir1Var.m6898k(nc4Var6)).f24280d.mo7286c(), ir1Var, 0);
                    if (wp1Var5 != null) {
                        ir1Var.m6885d0(2041275179);
                        qq2.m10018b(nv2Var3, ir1Var, (i8 >> 15) & 14);
                        ir1Var.m6912r(false);
                    } else {
                        ir1Var.m6885d0(2041318424);
                        ir1Var.m6912r(false);
                    }
                    if (z5) {
                        f = 1.0f;
                    } else {
                        f = 0.38f;
                    }
                    xb4VarM8766b = AbstractC0947ni.m8766b(f, ((lq2) ir1Var.m6898k(nc4Var6)).f24280d.mo7286c(), ir1Var);
                    long j17 = ((pb0) xb4VarM4941a11.getValue()).f27503a;
                    long j18 = ((pb0) xb4VarM4941a12.getValue()).f27503a;
                    nt2 nt2VarM5648F6 = AbstractC0647fd.m5648F(n74.m8573a(nt2Var, Float.NaN, 42.0f), oz3Var.f27246c.f26222a);
                    zM6890g = ir1Var.m6890g(xb4VarM8766b);
                    Object objM6869O7 = ir1Var.m6869O();
                    obj = objM6869O7;
                    if (zM6890g) {
                        C0676g5 c0676g14 = new C0676g5((byte) 7);
                        c0676g14.f19614b = xb4VarM8766b;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(c0676g14);
                        obj = c0676g14;
                    } else {
                        C0676g5 c0676g15 = new C0676g5((byte) 7);
                        c0676g15.f19614b = xb4VarM8766b;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(c0676g15);
                        obj = c0676g15;
                    }
                    nt2 nt2VarM10693F6 = se0.m10693F(nt2VarM5648F6, (yp1) obj);
                    p44 p44Var6 = oz3Var.f27245b;
                    f02 f02Var6 = new f02((byte) 1);
                    f02Var6.f18631b = wp1Var;
                    f02Var6.f18634e = wp1Var5;
                    f02Var6.f18635f = oz3Var;
                    f02Var6.f18636g = nv2Var3;
                    f02Var6.f18632c = z5;
                    f02Var6.f18633d = pg0Var;
                    VarHandle.storeStoreFence();
                    kf4.m7511a(nt2VarM10693F6, p44Var6, j17, j18, 0.0f, vd6.m11834R(-384411099, f02Var6, ir1Var), ir1Var, 12582912, 112);
                    wp1Var3 = wp1Var5;
                    nv2Var2 = nv2Var3;
                    z2 = z5;
                } else {
                    ir1Var.m6874W();
                }
                yk3VarM6916v = ir1Var.m6916v();
                if (yk3VarM6916v != null) {
                    hz3 hz3Var5 = new hz3();
                    hz3Var5.f20951a = nt2Var;
                    hz3Var5.f20952b = oz3Var;
                    hz3Var5.f20953c = z2;
                    hz3Var5.f20954d = wp1Var;
                    hz3Var5.f20955e = wp1Var3;
                    hz3Var5.f20956f = nv2Var2;
                    hz3Var5.f20957g = pg0Var;
                    hz3Var5.f20958h = i;
                    hz3Var5.f20959i = i2;
                    VarHandle.storeStoreFence();
                    yk3VarM6916v.f35300d = hz3Var5;
                }
            }
            i3 |= 196608;
            nv2Var2 = nv2Var;
            if ((1572864 & i) == 0) {
                if (ir1Var.m6894i(pg0Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            i8 = i3;
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ir1Var.m6871T(i8 & 1, z3)) {
                ir1Var.m6876Y();
                i9 = i & 1;
                i50Var = ki0.f23136a;
                if (i9 != 0) {
                    if (i12 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        wp1Var4 = null;
                    } else {
                        wp1Var4 = wp1Var3;
                    }
                    if (i6 != 0) {
                        objM6869O = ir1Var.m6869O();
                        if (objM6869O == i50Var) {
                            objM6869O = sj3.m10810f();
                            ir1Var.m6905n0(objM6869O);
                        }
                        nv2Var3 = (nv2) objM6869O;
                        boolean z114 = z2;
                        wp1Var5 = wp1Var4;
                        z4 = z114;
                    } else {
                        boolean z115 = z2;
                        wp1Var5 = wp1Var4;
                        z4 = z115;
                        nv2Var3 = nv2Var2;
                    }
                } else {
                    if (i12 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        wp1Var4 = null;
                    } else {
                        wp1Var4 = wp1Var3;
                    }
                    if (i6 != 0) {
                        objM6869O = ir1Var.m6869O();
                        if (objM6869O == i50Var) {
                            objM6869O = sj3.m10810f();
                            ir1Var.m6905n0(objM6869O);
                        }
                        nv2Var3 = (nv2) objM6869O;
                        boolean z116 = z2;
                        wp1Var5 = wp1Var4;
                        z4 = z116;
                    } else {
                        boolean z117 = z2;
                        wp1Var5 = wp1Var4;
                        z4 = z117;
                        nv2Var3 = nv2Var2;
                    }
                }
                ir1Var.m6913s();
                long j19 = oz3Var.f27244a.f34722a;
                nc4 nc4Var7 = pq2.f27894b;
                xb4 xb4VarM4941a13 = e74.m4941a(j19, ((lq2) ir1Var.m6898k(nc4Var7)).f24280d.mo7286c(), ir1Var, 0);
                z5 = z4;
                xb4 xb4VarM4941a14 = e74.m4941a(oz3Var.f27244a.f34723b, ((lq2) ir1Var.m6898k(nc4Var7)).f24280d.mo7286c(), ir1Var, 0);
                if (wp1Var5 != null) {
                    ir1Var.m6885d0(2041275179);
                    qq2.m10018b(nv2Var3, ir1Var, (i8 >> 15) & 14);
                    ir1Var.m6912r(false);
                } else {
                    ir1Var.m6885d0(2041318424);
                    ir1Var.m6912r(false);
                }
                if (z5) {
                    f = 1.0f;
                } else {
                    f = 0.38f;
                }
                xb4VarM8766b = AbstractC0947ni.m8766b(f, ((lq2) ir1Var.m6898k(nc4Var7)).f24280d.mo7286c(), ir1Var);
                long j110 = ((pb0) xb4VarM4941a13.getValue()).f27503a;
                long j111 = ((pb0) xb4VarM4941a14.getValue()).f27503a;
                nt2 nt2VarM5648F7 = AbstractC0647fd.m5648F(n74.m8573a(nt2Var, Float.NaN, 42.0f), oz3Var.f27246c.f26222a);
                zM6890g = ir1Var.m6890g(xb4VarM8766b);
                Object objM6869O8 = ir1Var.m6869O();
                obj = objM6869O8;
                if (zM6890g) {
                    C0676g5 c0676g16 = new C0676g5((byte) 7);
                    c0676g16.f19614b = xb4VarM8766b;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0676g16);
                    obj = c0676g16;
                } else {
                    C0676g5 c0676g17 = new C0676g5((byte) 7);
                    c0676g17.f19614b = xb4VarM8766b;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0676g17);
                    obj = c0676g17;
                }
                nt2 nt2VarM10693F7 = se0.m10693F(nt2VarM5648F7, (yp1) obj);
                p44 p44Var7 = oz3Var.f27245b;
                f02 f02Var7 = new f02((byte) 1);
                f02Var7.f18631b = wp1Var;
                f02Var7.f18634e = wp1Var5;
                f02Var7.f18635f = oz3Var;
                f02Var7.f18636g = nv2Var3;
                f02Var7.f18632c = z5;
                f02Var7.f18633d = pg0Var;
                VarHandle.storeStoreFence();
                kf4.m7511a(nt2VarM10693F7, p44Var7, j110, j111, 0.0f, vd6.m11834R(-384411099, f02Var7, ir1Var), ir1Var, 12582912, 112);
                wp1Var3 = wp1Var5;
                nv2Var2 = nv2Var3;
                z2 = z5;
            } else {
                ir1Var.m6874W();
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                hz3 hz3Var6 = new hz3();
                hz3Var6.f20951a = nt2Var;
                hz3Var6.f20952b = oz3Var;
                hz3Var6.f20953c = z2;
                hz3Var6.f20954d = wp1Var;
                hz3Var6.f20955e = wp1Var3;
                hz3Var6.f20956f = nv2Var2;
                hz3Var6.f20957g = pg0Var;
                hz3Var6.f20958h = i;
                hz3Var6.f20959i = i2;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = hz3Var6;
            }
        }
        i3 |= 24576;
        wp1Var3 = wp1Var2;
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                nv2Var2 = nv2Var;
                if (ir1Var.m6890g(nv2Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                if (ir1Var.m6894i(pg0Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            i8 = i3;
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ir1Var.m6871T(i8 & 1, z3)) {
                ir1Var.m6876Y();
                i9 = i & 1;
                i50Var = ki0.f23136a;
                if (i9 != 0) {
                    if (i12 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        wp1Var4 = null;
                    } else {
                        wp1Var4 = wp1Var3;
                    }
                    if (i6 != 0) {
                        objM6869O = ir1Var.m6869O();
                        if (objM6869O == i50Var) {
                            objM6869O = sj3.m10810f();
                            ir1Var.m6905n0(objM6869O);
                        }
                        nv2Var3 = (nv2) objM6869O;
                        boolean z118 = z2;
                        wp1Var5 = wp1Var4;
                        z4 = z118;
                    } else {
                        boolean z119 = z2;
                        wp1Var5 = wp1Var4;
                        z4 = z119;
                        nv2Var3 = nv2Var2;
                    }
                } else {
                    if (i12 != 0) {
                        z2 = true;
                    }
                    if (i4 != 0) {
                        wp1Var4 = null;
                    } else {
                        wp1Var4 = wp1Var3;
                    }
                    if (i6 != 0) {
                        objM6869O = ir1Var.m6869O();
                        if (objM6869O == i50Var) {
                            objM6869O = sj3.m10810f();
                            ir1Var.m6905n0(objM6869O);
                        }
                        nv2Var3 = (nv2) objM6869O;
                        boolean z1110 = z2;
                        wp1Var5 = wp1Var4;
                        z4 = z1110;
                    } else {
                        boolean z1111 = z2;
                        wp1Var5 = wp1Var4;
                        z4 = z1111;
                        nv2Var3 = nv2Var2;
                    }
                }
                ir1Var.m6913s();
                long j112 = oz3Var.f27244a.f34722a;
                nc4 nc4Var8 = pq2.f27894b;
                xb4 xb4VarM4941a15 = e74.m4941a(j112, ((lq2) ir1Var.m6898k(nc4Var8)).f24280d.mo7286c(), ir1Var, 0);
                z5 = z4;
                xb4 xb4VarM4941a16 = e74.m4941a(oz3Var.f27244a.f34723b, ((lq2) ir1Var.m6898k(nc4Var8)).f24280d.mo7286c(), ir1Var, 0);
                if (wp1Var5 != null) {
                    ir1Var.m6885d0(2041275179);
                    qq2.m10018b(nv2Var3, ir1Var, (i8 >> 15) & 14);
                    ir1Var.m6912r(false);
                } else {
                    ir1Var.m6885d0(2041318424);
                    ir1Var.m6912r(false);
                }
                if (z5) {
                    f = 1.0f;
                } else {
                    f = 0.38f;
                }
                xb4VarM8766b = AbstractC0947ni.m8766b(f, ((lq2) ir1Var.m6898k(nc4Var8)).f24280d.mo7286c(), ir1Var);
                long j113 = ((pb0) xb4VarM4941a15.getValue()).f27503a;
                long j114 = ((pb0) xb4VarM4941a16.getValue()).f27503a;
                nt2 nt2VarM5648F8 = AbstractC0647fd.m5648F(n74.m8573a(nt2Var, Float.NaN, 42.0f), oz3Var.f27246c.f26222a);
                zM6890g = ir1Var.m6890g(xb4VarM8766b);
                Object objM6869O9 = ir1Var.m6869O();
                obj = objM6869O9;
                if (zM6890g) {
                    C0676g5 c0676g18 = new C0676g5((byte) 7);
                    c0676g18.f19614b = xb4VarM8766b;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0676g18);
                    obj = c0676g18;
                } else {
                    C0676g5 c0676g19 = new C0676g5((byte) 7);
                    c0676g19.f19614b = xb4VarM8766b;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0676g19);
                    obj = c0676g19;
                }
                nt2 nt2VarM10693F8 = se0.m10693F(nt2VarM5648F8, (yp1) obj);
                p44 p44Var8 = oz3Var.f27245b;
                f02 f02Var8 = new f02((byte) 1);
                f02Var8.f18631b = wp1Var;
                f02Var8.f18634e = wp1Var5;
                f02Var8.f18635f = oz3Var;
                f02Var8.f18636g = nv2Var3;
                f02Var8.f18632c = z5;
                f02Var8.f18633d = pg0Var;
                VarHandle.storeStoreFence();
                kf4.m7511a(nt2VarM10693F8, p44Var8, j113, j114, 0.0f, vd6.m11834R(-384411099, f02Var8, ir1Var), ir1Var, 12582912, 112);
                wp1Var3 = wp1Var5;
                nv2Var2 = nv2Var3;
                z2 = z5;
            } else {
                ir1Var.m6874W();
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                hz3 hz3Var7 = new hz3();
                hz3Var7.f20951a = nt2Var;
                hz3Var7.f20952b = oz3Var;
                hz3Var7.f20953c = z2;
                hz3Var7.f20954d = wp1Var;
                hz3Var7.f20955e = wp1Var3;
                hz3Var7.f20956f = nv2Var2;
                hz3Var7.f20957g = pg0Var;
                hz3Var7.f20958h = i;
                hz3Var7.f20959i = i2;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = hz3Var7;
            }
        }
        i3 |= 196608;
        nv2Var2 = nv2Var;
        if ((1572864 & i) == 0) {
            if (ir1Var.m6894i(pg0Var)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        i8 = i3;
        if ((599187 & i3) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (ir1Var.m6871T(i8 & 1, z3)) {
            ir1Var.m6876Y();
            i9 = i & 1;
            i50Var = ki0.f23136a;
            if (i9 != 0) {
                if (i12 != 0) {
                    z2 = true;
                }
                if (i4 != 0) {
                    wp1Var4 = null;
                } else {
                    wp1Var4 = wp1Var3;
                }
                if (i6 != 0) {
                    objM6869O = ir1Var.m6869O();
                    if (objM6869O == i50Var) {
                        objM6869O = sj3.m10810f();
                        ir1Var.m6905n0(objM6869O);
                    }
                    nv2Var3 = (nv2) objM6869O;
                    boolean z1112 = z2;
                    wp1Var5 = wp1Var4;
                    z4 = z1112;
                } else {
                    boolean z1113 = z2;
                    wp1Var5 = wp1Var4;
                    z4 = z1113;
                    nv2Var3 = nv2Var2;
                }
            } else {
                if (i12 != 0) {
                    z2 = true;
                }
                if (i4 != 0) {
                    wp1Var4 = null;
                } else {
                    wp1Var4 = wp1Var3;
                }
                if (i6 != 0) {
                    objM6869O = ir1Var.m6869O();
                    if (objM6869O == i50Var) {
                        objM6869O = sj3.m10810f();
                        ir1Var.m6905n0(objM6869O);
                    }
                    nv2Var3 = (nv2) objM6869O;
                    boolean z1114 = z2;
                    wp1Var5 = wp1Var4;
                    z4 = z1114;
                } else {
                    boolean z1115 = z2;
                    wp1Var5 = wp1Var4;
                    z4 = z1115;
                    nv2Var3 = nv2Var2;
                }
            }
            ir1Var.m6913s();
            long j115 = oz3Var.f27244a.f34722a;
            nc4 nc4Var9 = pq2.f27894b;
            xb4 xb4VarM4941a17 = e74.m4941a(j115, ((lq2) ir1Var.m6898k(nc4Var9)).f24280d.mo7286c(), ir1Var, 0);
            z5 = z4;
            xb4 xb4VarM4941a18 = e74.m4941a(oz3Var.f27244a.f34723b, ((lq2) ir1Var.m6898k(nc4Var9)).f24280d.mo7286c(), ir1Var, 0);
            if (wp1Var5 != null) {
                ir1Var.m6885d0(2041275179);
                qq2.m10018b(nv2Var3, ir1Var, (i8 >> 15) & 14);
                ir1Var.m6912r(false);
            } else {
                ir1Var.m6885d0(2041318424);
                ir1Var.m6912r(false);
            }
            if (z5) {
                f = 1.0f;
            } else {
                f = 0.38f;
            }
            xb4VarM8766b = AbstractC0947ni.m8766b(f, ((lq2) ir1Var.m6898k(nc4Var9)).f24280d.mo7286c(), ir1Var);
            long j116 = ((pb0) xb4VarM4941a17.getValue()).f27503a;
            long j117 = ((pb0) xb4VarM4941a18.getValue()).f27503a;
            nt2 nt2VarM5648F9 = AbstractC0647fd.m5648F(n74.m8573a(nt2Var, Float.NaN, 42.0f), oz3Var.f27246c.f26222a);
            zM6890g = ir1Var.m6890g(xb4VarM8766b);
            Object objM6869O10 = ir1Var.m6869O();
            obj = objM6869O10;
            if (zM6890g) {
                C0676g5 c0676g110 = new C0676g5((byte) 7);
                c0676g110.f19614b = xb4VarM8766b;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0676g110);
                obj = c0676g110;
            } else {
                C0676g5 c0676g111 = new C0676g5((byte) 7);
                c0676g111.f19614b = xb4VarM8766b;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0676g111);
                obj = c0676g111;
            }
            nt2 nt2VarM10693F9 = se0.m10693F(nt2VarM5648F9, (yp1) obj);
            p44 p44Var9 = oz3Var.f27245b;
            f02 f02Var9 = new f02((byte) 1);
            f02Var9.f18631b = wp1Var;
            f02Var9.f18634e = wp1Var5;
            f02Var9.f18635f = oz3Var;
            f02Var9.f18636g = nv2Var3;
            f02Var9.f18632c = z5;
            f02Var9.f18633d = pg0Var;
            VarHandle.storeStoreFence();
            kf4.m7511a(nt2VarM10693F9, p44Var9, j116, j117, 0.0f, vd6.m11834R(-384411099, f02Var9, ir1Var), ir1Var, 12582912, 112);
            wp1Var3 = wp1Var5;
            nv2Var2 = nv2Var3;
            z2 = z5;
        } else {
            ir1Var.m6874W();
        }
        yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            hz3 hz3Var8 = new hz3();
            hz3Var8.f20951a = nt2Var;
            hz3Var8.f20952b = oz3Var;
            hz3Var8.f20953c = z2;
            hz3Var8.f20954d = wp1Var;
            hz3Var8.f20955e = wp1Var3;
            hz3Var8.f20956f = nv2Var2;
            hz3Var8.f20957g = pg0Var;
            hz3Var8.f20958h = i;
            hz3Var8.f20959i = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = hz3Var8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static final void m8462d(nt2 nt2Var, boolean z, mq1 mq1Var, mi0 mi0Var, int i, int i2) {
        int i3;
        boolean z2;
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1456012677);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = i | (ir1Var.m6890g(nt2Var) ? 4 : 2);
        }
        int i5 = i3 | 48;
        byte b = 1;
        if (ir1Var.m6871T(i5 & 1, (i5 & 147) != 146)) {
            if (i4 != 0) {
                nt2Var = kt2.f23428a;
            }
            nt2 nt2Var2 = nt2Var;
            nc4 nc4Var = pq2.f27894b;
            xb4 xb4VarM8766b = AbstractC0947ni.m8766b(1.0f, ((lq2) ir1Var.m6898k(nc4Var)).f24280d.mo7286c(), ir1Var);
            nt2 nt2VarM5653K = AbstractC0647fd.m5653K(nt2Var2, 38.0f, ((yy3) ir1Var.m6898k(f25344a)).f35636d ? 16.0f : 10.0f, 0.0f, 10.0f, 4);
            boolean zM6890g = ir1Var.m6890g(xb4VarM8766b);
            Object objM6869O = ir1Var.m6869O();
            if (zM6890g || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                C0676g5 c0676g5 = new C0676g5((byte) 8);
                c0676g5.f19614b = xb4VarM8766b;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0676g5);
                obj = c0676g5;
            }
            obj = objM6869O;
            nt2 nt2VarM10693F = se0.m10693F(nt2VarM5653K, (yp1) obj);
            xq2 xq2VarM9704c = q20.m9704c(ig1.f21381e, false);
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM10693F);
            bi0.f15310ap.getClass();
            if (ir1Var.f21685a == null) {
                dt0.m4682E();
                throw null;
            }
            ir1Var.m6893h0();
            if (ir1Var.f21682S) {
                ir1Var.m6900l(wf2.f33290T);
            } else {
                ir1Var.m6911q0();
            }
            C0006a5.m53I(ir1Var, ia5.f21216g, xq2VarM9704c);
            C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
            C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
            C0006a5.m50F(ir1Var);
            C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
            k43.m7380b(((lq2) ir1Var.m6898k(nc4Var)).f24277a.f16940a, ((lq2) ir1Var.m6898k(nc4Var)).f24278b.f22582m, mq1Var, ir1Var, 384);
            ir1Var.m6912r(true);
            z2 = true;
            nt2Var = nt2Var2;
        } else {
            ir1Var.m6874W();
            z2 = z;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0687gg c0687gg = new C0687gg(b);
            c0687gg.f19774b = nt2Var;
            c0687gg.f19775c = z2;
            c0687gg.f19777e = mq1Var;
            c0687gg.f19776d = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0687gg;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x012d  */
    /* JADX WARN: Code duplicated, block: B:108:0x013c  */
    /* JADX WARN: Code duplicated, block: B:109:0x013f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0148  */
    /* JADX WARN: Code duplicated, block: B:114:0x0152  */
    /* JADX WARN: Code duplicated, block: B:124:0x0176 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0178  */
    /* JADX WARN: Code duplicated, block: B:126:0x017d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0183  */
    /* JADX WARN: Code duplicated, block: B:130:0x0191  */
    /* JADX WARN: Code duplicated, block: B:133:0x0195  */
    /* JADX WARN: Code duplicated, block: B:136:0x019a  */
    /* JADX WARN: Code duplicated, block: B:138:0x019d  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:149:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:150:0x01be  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:158:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:160:0x0262  */
    /* JADX WARN: Code duplicated, block: B:163:0x0275  */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0108  */
    /* JADX WARN: Code duplicated, block: B:92:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0115  */
    /* JADX WARN: Code duplicated, block: B:98:0x0119  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final void m8463e(nt2 nt2Var, oz3 oz3Var, boolean z, wp1 wp1Var, wp1 wp1Var2, nv2 nv2Var, mq1 mq1Var, mq1 mq1Var2, mq1 mq1Var3, mq1 mq1Var4, mi0 mi0Var, int i, int i2) {
        nt2 nt2Var2;
        int i3;
        oz3 oz3Var2;
        boolean z2;
        wp1 wp1Var3;
        wp1 wp1Var4;
        nv2 nv2Var2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        mq1 mq1Var5;
        mq1 mq1Var6;
        nt2 nt2Var3;
        boolean z4;
        mq1 mq1Var7;
        yk3 yk3VarM6916v;
        nt2 nt2Var4;
        oz3 oz3VarM10799H;
        nv2 nv2Var3;
        mq1 mq1Var8;
        mq1 mq1Var9;
        wp1 wp1Var5;
        mq1 mq1Var10;
        oz3 oz3Var3;
        int i9;
        nt2 nt2Var5;
        boolean z5;
        Object objM6869O;
        int i10;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-615790231);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            nt2Var2 = nt2Var;
        } else if ((i & 6) == 0) {
            nt2Var2 = nt2Var;
            i3 = (ir1Var.m6890g(nt2Var2) ? 4 : 2) | i;
        } else {
            nt2Var2 = nt2Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                oz3Var2 = oz3Var;
                int i12 = ir1Var.m6890g(oz3Var2) ? 32 : 16;
                i3 |= i12;
            } else {
                oz3Var2 = oz3Var;
            }
            i3 |= i12;
        } else {
            oz3Var2 = oz3Var;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 384) == 0) {
                i3 |= ir1Var.m6892h(z2) ? 256 : 128;
            }
        }
        int i14 = i2 & 8;
        if (i14 != 0) {
            i3 |= 3072;
            wp1Var3 = wp1Var;
        } else {
            wp1Var3 = wp1Var;
            if ((i & 3072) == 0) {
                i3 |= ir1Var.m6894i(wp1Var3) ? 2048 : 1024;
            }
        }
        int i15 = i2 & 16;
        if (i15 != 0) {
            i3 |= 24576;
            wp1Var4 = wp1Var2;
        } else {
            wp1Var4 = wp1Var2;
            if ((i & 24576) == 0) {
                i3 |= ir1Var.m6894i(wp1Var4) ? 16384 : 8192;
            }
        }
        int i16 = i2 & 32;
        if (i16 == 0) {
            if ((196608 & i) == 0) {
                nv2Var2 = nv2Var;
                i3 |= ir1Var.m6890g(nv2Var2) ? 131072 : 65536;
            }
            if ((i & 1572864) == 0) {
                if (ir1Var.m6894i(mq1Var)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i3 |= i10;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                if ((i & 12582912) == 0) {
                    if (ir1Var.m6894i(mq1Var2)) {
                        i5 = 8388608;
                    } else {
                        i5 = 4194304;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 256;
                if (i6 != 0) {
                    if ((i & 100663296) == 0) {
                        if (ir1Var.m6894i(mq1Var3)) {
                            i7 = 67108864;
                        } else {
                            i7 = 33554432;
                        }
                        i3 |= i7;
                    }
                    if ((i & 805306368) != 0) {
                        i3 |= ((i2 & 512) == 0 || !ir1Var.m6894i(mq1Var4)) ? 268435456 : 536870912;
                    }
                    i8 = i3;
                    if ((i8 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (ir1Var.m6871T(i8 & 1, z3)) {
                        ir1Var.m6876Y();
                        if ((i & 1) != 0 || ir1Var.m6856B()) {
                            if (i11 != 0) {
                                nt2Var4 = kt2.f23428a;
                            } else {
                                nt2Var4 = nt2Var2;
                            }
                            if ((i2 & 2) != 0) {
                                oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
                                i8 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                            } else {
                                oz3VarM10799H = oz3Var2;
                            }
                            boolean z6 = i13 == 0 ? z2 : true;
                            if (i14 != 0) {
                                wp1Var3 = null;
                            }
                            if (i15 != 0) {
                                wp1Var4 = null;
                            }
                            if (i16 != 0) {
                                objM6869O = ir1Var.m6869O();
                                if (objM6869O == ki0.f23136a) {
                                    objM6869O = sj3.m10810f();
                                    ir1Var.m6905n0(objM6869O);
                                }
                                nv2Var3 = (nv2) objM6869O;
                            } else {
                                nv2Var3 = nv2Var;
                            }
                            if (i4 != 0) {
                                mq1Var8 = null;
                            } else {
                                mq1Var8 = mq1Var2;
                            }
                            if (i6 != 0) {
                                mq1Var9 = null;
                            } else {
                                mq1Var9 = mq1Var3;
                            }
                            if ((i2 & 512) != 0) {
                                mq1Var10 = wp1Var3 != null ? AbstractC1356y5.f34881d : null;
                                i8 &= -1879048193;
                                wp1Var5 = wp1Var4;
                            } else {
                                wp1Var5 = wp1Var4;
                                mq1Var10 = mq1Var4;
                            }
                            oz3Var3 = oz3VarM10799H;
                            mq1Var5 = mq1Var9;
                            i9 = i8;
                            nt2Var5 = nt2Var4;
                            nv2Var2 = nv2Var3;
                            z5 = z6;
                        } else {
                            ir1Var.m6874W();
                            if ((i2 & 2) != 0) {
                                i8 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                            }
                            if ((i2 & 512) != 0) {
                                i8 &= -1879048193;
                            }
                            mq1Var5 = mq1Var3;
                            nt2Var5 = nt2Var2;
                            oz3Var3 = oz3Var2;
                            z5 = z2;
                            wp1Var5 = wp1Var4;
                            i9 = i8;
                            mq1Var8 = mq1Var2;
                            mq1Var10 = mq1Var4;
                        }
                        ir1Var.m6913s();
                        nz3 nz3Var = oz3Var3.f27246c;
                        e73 e73Var = nz3Var.f26223b;
                        nt2 nt2Var6 = nt2Var5;
                        nc4 nc4Var = ij0.f21479n;
                        boolean z7 = z5;
                        oz3 oz3Var4 = new oz3(oz3Var3.f27244a, oz3Var3.f27245b, new nz3(nz3Var.f26222a, AbstractC0647fd.m5670h(AbstractC0647fd.m5681t(e73Var, (df2) ir1Var.m6898k(nc4Var)), AbstractC0647fd.m5680s(oz3Var3.f27246c.f26223b, (df2) ir1Var.m6898k(nc4Var)), 10), nz3Var.f26224c));
                        ri1 ri1Var = new ri1((byte) 5);
                        ri1Var.f29309c = mq1Var5;
                        ri1Var.f29310d = oz3Var3;
                        ri1Var.f29311e = mq1Var10;
                        ri1Var.f29312f = mq1Var;
                        ri1Var.f29308b = mq1Var8;
                        VarHandle.storeStoreFence();
                        mq1 mq1Var11 = mq1Var10;
                        wp1 wp1Var6 = wp1Var3;
                        nt2Var3 = nt2Var6;
                        z4 = z7;
                        m8461c(nt2Var3, oz3Var4, z4, wp1Var6, wp1Var5, nv2Var2, vd6.m11834R(-2109303462, ri1Var, ir1Var), ir1Var, (i9 & 14) | 1572864 | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (i9 & 458752), 0);
                        wp1Var3 = wp1Var6;
                        ir1Var = ir1Var;
                        mq1Var7 = mq1Var8;
                        mq1Var6 = mq1Var11;
                        wp1Var4 = wp1Var5;
                        oz3Var2 = oz3Var3;
                    } else {
                        ir1Var.m6874W();
                        nv2Var2 = nv2Var;
                        mq1Var5 = mq1Var3;
                        mq1Var6 = mq1Var4;
                        nt2Var3 = nt2Var2;
                        z4 = z2;
                        mq1Var7 = mq1Var2;
                    }
                    yk3VarM6916v = ir1Var.m6916v();
                    if (yk3VarM6916v != null) {
                        fz3 fz3Var = new fz3();
                        fz3Var.f19438a = nt2Var3;
                        fz3Var.f19439b = oz3Var2;
                        fz3Var.f19440c = z4;
                        fz3Var.f19441d = wp1Var3;
                        fz3Var.f19442e = wp1Var4;
                        fz3Var.f19443f = nv2Var2;
                        fz3Var.f19444g = mq1Var;
                        fz3Var.f19445h = mq1Var7;
                        fz3Var.f19446i = mq1Var5;
                        fz3Var.f19447j = mq1Var6;
                        fz3Var.f19448k = i;
                        fz3Var.f19449l = i2;
                        VarHandle.storeStoreFence();
                        yk3VarM6916v.f35300d = fz3Var;
                    }
                }
                i3 |= 100663296;
                if ((i & 805306368) != 0) {
                    i3 |= ((i2 & 512) == 0 || !ir1Var.m6894i(mq1Var4)) ? 268435456 : 536870912;
                }
                i8 = i3;
                if ((i8 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (ir1Var.m6871T(i8 & 1, z3)) {
                    ir1Var.m6876Y();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            nt2Var4 = kt2.f23428a;
                        } else {
                            nt2Var4 = nt2Var2;
                        }
                        if ((i2 & 2) != 0) {
                            oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
                            i8 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        } else {
                            oz3VarM10799H = oz3Var2;
                        }
                        if (i13 == 0) {
                        }
                        if (i14 != 0) {
                            wp1Var3 = null;
                        }
                        if (i15 != 0) {
                            wp1Var4 = null;
                        }
                        if (i16 != 0) {
                            objM6869O = ir1Var.m6869O();
                            if (objM6869O == ki0.f23136a) {
                                objM6869O = sj3.m10810f();
                                ir1Var.m6905n0(objM6869O);
                            }
                            nv2Var3 = (nv2) objM6869O;
                        } else {
                            nv2Var3 = nv2Var;
                        }
                        if (i4 != 0) {
                            mq1Var8 = null;
                        } else {
                            mq1Var8 = mq1Var2;
                        }
                        if (i6 != 0) {
                            mq1Var9 = null;
                        } else {
                            mq1Var9 = mq1Var3;
                        }
                        if ((i2 & 512) != 0) {
                            if (wp1Var3 != null) {
                            }
                            i8 &= -1879048193;
                            wp1Var5 = wp1Var4;
                        } else {
                            wp1Var5 = wp1Var4;
                            mq1Var10 = mq1Var4;
                        }
                        oz3Var3 = oz3VarM10799H;
                        mq1Var5 = mq1Var9;
                        i9 = i8;
                        nt2Var5 = nt2Var4;
                        nv2Var2 = nv2Var3;
                        z5 = z6;
                    } else {
                        if (i11 != 0) {
                            nt2Var4 = kt2.f23428a;
                        } else {
                            nt2Var4 = nt2Var2;
                        }
                        if ((i2 & 2) != 0) {
                            oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
                            i8 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        } else {
                            oz3VarM10799H = oz3Var2;
                        }
                        if (i13 == 0) {
                        }
                        if (i14 != 0) {
                            wp1Var3 = null;
                        }
                        if (i15 != 0) {
                            wp1Var4 = null;
                        }
                        if (i16 != 0) {
                            objM6869O = ir1Var.m6869O();
                            if (objM6869O == ki0.f23136a) {
                                objM6869O = sj3.m10810f();
                                ir1Var.m6905n0(objM6869O);
                            }
                            nv2Var3 = (nv2) objM6869O;
                        } else {
                            nv2Var3 = nv2Var;
                        }
                        if (i4 != 0) {
                            mq1Var8 = null;
                        } else {
                            mq1Var8 = mq1Var2;
                        }
                        if (i6 != 0) {
                            mq1Var9 = null;
                        } else {
                            mq1Var9 = mq1Var3;
                        }
                        if ((i2 & 512) != 0) {
                            if (wp1Var3 != null) {
                            }
                            i8 &= -1879048193;
                            wp1Var5 = wp1Var4;
                        } else {
                            wp1Var5 = wp1Var4;
                            mq1Var10 = mq1Var4;
                        }
                        oz3Var3 = oz3VarM10799H;
                        mq1Var5 = mq1Var9;
                        i9 = i8;
                        nt2Var5 = nt2Var4;
                        nv2Var2 = nv2Var3;
                        z5 = z6;
                    }
                    ir1Var.m6913s();
                    nz3 nz3Var2 = oz3Var3.f27246c;
                    e73 e73Var2 = nz3Var2.f26223b;
                    nt2 nt2Var7 = nt2Var5;
                    nc4 nc4Var2 = ij0.f21479n;
                    boolean z8 = z5;
                    oz3 oz3Var5 = new oz3(oz3Var3.f27244a, oz3Var3.f27245b, new nz3(nz3Var2.f26222a, AbstractC0647fd.m5670h(AbstractC0647fd.m5681t(e73Var2, (df2) ir1Var.m6898k(nc4Var2)), AbstractC0647fd.m5680s(oz3Var3.f27246c.f26223b, (df2) ir1Var.m6898k(nc4Var2)), 10), nz3Var2.f26224c));
                    ri1 ri1Var2 = new ri1((byte) 5);
                    ri1Var2.f29309c = mq1Var5;
                    ri1Var2.f29310d = oz3Var3;
                    ri1Var2.f29311e = mq1Var10;
                    ri1Var2.f29312f = mq1Var;
                    ri1Var2.f29308b = mq1Var8;
                    VarHandle.storeStoreFence();
                    mq1 mq1Var12 = mq1Var10;
                    wp1 wp1Var7 = wp1Var3;
                    nt2Var3 = nt2Var7;
                    z4 = z8;
                    m8461c(nt2Var3, oz3Var5, z4, wp1Var7, wp1Var5, nv2Var2, vd6.m11834R(-2109303462, ri1Var2, ir1Var), ir1Var, (i9 & 14) | 1572864 | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (i9 & 458752), 0);
                    wp1Var3 = wp1Var7;
                    ir1Var = ir1Var;
                    mq1Var7 = mq1Var8;
                    mq1Var6 = mq1Var12;
                    wp1Var4 = wp1Var5;
                    oz3Var2 = oz3Var3;
                } else {
                    ir1Var.m6874W();
                    nv2Var2 = nv2Var;
                    mq1Var5 = mq1Var3;
                    mq1Var6 = mq1Var4;
                    nt2Var3 = nt2Var2;
                    z4 = z2;
                    mq1Var7 = mq1Var2;
                }
                yk3VarM6916v = ir1Var.m6916v();
                if (yk3VarM6916v != null) {
                    fz3 fz3Var2 = new fz3();
                    fz3Var2.f19438a = nt2Var3;
                    fz3Var2.f19439b = oz3Var2;
                    fz3Var2.f19440c = z4;
                    fz3Var2.f19441d = wp1Var3;
                    fz3Var2.f19442e = wp1Var4;
                    fz3Var2.f19443f = nv2Var2;
                    fz3Var2.f19444g = mq1Var;
                    fz3Var2.f19445h = mq1Var7;
                    fz3Var2.f19446i = mq1Var5;
                    fz3Var2.f19447j = mq1Var6;
                    fz3Var2.f19448k = i;
                    fz3Var2.f19449l = i2;
                    VarHandle.storeStoreFence();
                    yk3VarM6916v.f35300d = fz3Var2;
                }
            }
            i3 |= 12582912;
            i6 = i2 & 256;
            if (i6 != 0) {
                if ((i & 100663296) == 0) {
                    if (ir1Var.m6894i(mq1Var3)) {
                        i7 = 67108864;
                    } else {
                        i7 = 33554432;
                    }
                    i3 |= i7;
                }
                if ((i & 805306368) != 0) {
                    i3 |= ((i2 & 512) == 0 || !ir1Var.m6894i(mq1Var4)) ? 268435456 : 536870912;
                }
                i8 = i3;
                if ((i8 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (ir1Var.m6871T(i8 & 1, z3)) {
                    ir1Var.m6876Y();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            nt2Var4 = kt2.f23428a;
                        } else {
                            nt2Var4 = nt2Var2;
                        }
                        if ((i2 & 2) != 0) {
                            oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
                            i8 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        } else {
                            oz3VarM10799H = oz3Var2;
                        }
                        if (i13 == 0) {
                        }
                        if (i14 != 0) {
                            wp1Var3 = null;
                        }
                        if (i15 != 0) {
                            wp1Var4 = null;
                        }
                        if (i16 != 0) {
                            objM6869O = ir1Var.m6869O();
                            if (objM6869O == ki0.f23136a) {
                                objM6869O = sj3.m10810f();
                                ir1Var.m6905n0(objM6869O);
                            }
                            nv2Var3 = (nv2) objM6869O;
                        } else {
                            nv2Var3 = nv2Var;
                        }
                        if (i4 != 0) {
                            mq1Var8 = null;
                        } else {
                            mq1Var8 = mq1Var2;
                        }
                        if (i6 != 0) {
                            mq1Var9 = null;
                        } else {
                            mq1Var9 = mq1Var3;
                        }
                        if ((i2 & 512) != 0) {
                            if (wp1Var3 != null) {
                            }
                            i8 &= -1879048193;
                            wp1Var5 = wp1Var4;
                        } else {
                            wp1Var5 = wp1Var4;
                            mq1Var10 = mq1Var4;
                        }
                        oz3Var3 = oz3VarM10799H;
                        mq1Var5 = mq1Var9;
                        i9 = i8;
                        nt2Var5 = nt2Var4;
                        nv2Var2 = nv2Var3;
                        z5 = z6;
                    } else {
                        if (i11 != 0) {
                            nt2Var4 = kt2.f23428a;
                        } else {
                            nt2Var4 = nt2Var2;
                        }
                        if ((i2 & 2) != 0) {
                            oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
                            i8 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        } else {
                            oz3VarM10799H = oz3Var2;
                        }
                        if (i13 == 0) {
                        }
                        if (i14 != 0) {
                            wp1Var3 = null;
                        }
                        if (i15 != 0) {
                            wp1Var4 = null;
                        }
                        if (i16 != 0) {
                            objM6869O = ir1Var.m6869O();
                            if (objM6869O == ki0.f23136a) {
                                objM6869O = sj3.m10810f();
                                ir1Var.m6905n0(objM6869O);
                            }
                            nv2Var3 = (nv2) objM6869O;
                        } else {
                            nv2Var3 = nv2Var;
                        }
                        if (i4 != 0) {
                            mq1Var8 = null;
                        } else {
                            mq1Var8 = mq1Var2;
                        }
                        if (i6 != 0) {
                            mq1Var9 = null;
                        } else {
                            mq1Var9 = mq1Var3;
                        }
                        if ((i2 & 512) != 0) {
                            if (wp1Var3 != null) {
                            }
                            i8 &= -1879048193;
                            wp1Var5 = wp1Var4;
                        } else {
                            wp1Var5 = wp1Var4;
                            mq1Var10 = mq1Var4;
                        }
                        oz3Var3 = oz3VarM10799H;
                        mq1Var5 = mq1Var9;
                        i9 = i8;
                        nt2Var5 = nt2Var4;
                        nv2Var2 = nv2Var3;
                        z5 = z6;
                    }
                    ir1Var.m6913s();
                    nz3 nz3Var3 = oz3Var3.f27246c;
                    e73 e73Var3 = nz3Var3.f26223b;
                    nt2 nt2Var8 = nt2Var5;
                    nc4 nc4Var3 = ij0.f21479n;
                    boolean z9 = z5;
                    oz3 oz3Var6 = new oz3(oz3Var3.f27244a, oz3Var3.f27245b, new nz3(nz3Var3.f26222a, AbstractC0647fd.m5670h(AbstractC0647fd.m5681t(e73Var3, (df2) ir1Var.m6898k(nc4Var3)), AbstractC0647fd.m5680s(oz3Var3.f27246c.f26223b, (df2) ir1Var.m6898k(nc4Var3)), 10), nz3Var3.f26224c));
                    ri1 ri1Var3 = new ri1((byte) 5);
                    ri1Var3.f29309c = mq1Var5;
                    ri1Var3.f29310d = oz3Var3;
                    ri1Var3.f29311e = mq1Var10;
                    ri1Var3.f29312f = mq1Var;
                    ri1Var3.f29308b = mq1Var8;
                    VarHandle.storeStoreFence();
                    mq1 mq1Var13 = mq1Var10;
                    wp1 wp1Var8 = wp1Var3;
                    nt2Var3 = nt2Var8;
                    z4 = z9;
                    m8461c(nt2Var3, oz3Var6, z4, wp1Var8, wp1Var5, nv2Var2, vd6.m11834R(-2109303462, ri1Var3, ir1Var), ir1Var, (i9 & 14) | 1572864 | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (i9 & 458752), 0);
                    wp1Var3 = wp1Var8;
                    ir1Var = ir1Var;
                    mq1Var7 = mq1Var8;
                    mq1Var6 = mq1Var13;
                    wp1Var4 = wp1Var5;
                    oz3Var2 = oz3Var3;
                } else {
                    ir1Var.m6874W();
                    nv2Var2 = nv2Var;
                    mq1Var5 = mq1Var3;
                    mq1Var6 = mq1Var4;
                    nt2Var3 = nt2Var2;
                    z4 = z2;
                    mq1Var7 = mq1Var2;
                }
                yk3VarM6916v = ir1Var.m6916v();
                if (yk3VarM6916v != null) {
                    fz3 fz3Var3 = new fz3();
                    fz3Var3.f19438a = nt2Var3;
                    fz3Var3.f19439b = oz3Var2;
                    fz3Var3.f19440c = z4;
                    fz3Var3.f19441d = wp1Var3;
                    fz3Var3.f19442e = wp1Var4;
                    fz3Var3.f19443f = nv2Var2;
                    fz3Var3.f19444g = mq1Var;
                    fz3Var3.f19445h = mq1Var7;
                    fz3Var3.f19446i = mq1Var5;
                    fz3Var3.f19447j = mq1Var6;
                    fz3Var3.f19448k = i;
                    fz3Var3.f19449l = i2;
                    VarHandle.storeStoreFence();
                    yk3VarM6916v.f35300d = fz3Var3;
                }
            }
            i3 |= 100663296;
            if ((i & 805306368) != 0) {
                i3 |= ((i2 & 512) == 0 || !ir1Var.m6894i(mq1Var4)) ? 268435456 : 536870912;
            }
            i8 = i3;
            if ((i8 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ir1Var.m6871T(i8 & 1, z3)) {
                ir1Var.m6876Y();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        nt2Var4 = kt2.f23428a;
                    } else {
                        nt2Var4 = nt2Var2;
                    }
                    if ((i2 & 2) != 0) {
                        oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
                        i8 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                    } else {
                        oz3VarM10799H = oz3Var2;
                    }
                    if (i13 == 0) {
                    }
                    if (i14 != 0) {
                        wp1Var3 = null;
                    }
                    if (i15 != 0) {
                        wp1Var4 = null;
                    }
                    if (i16 != 0) {
                        objM6869O = ir1Var.m6869O();
                        if (objM6869O == ki0.f23136a) {
                            objM6869O = sj3.m10810f();
                            ir1Var.m6905n0(objM6869O);
                        }
                        nv2Var3 = (nv2) objM6869O;
                    } else {
                        nv2Var3 = nv2Var;
                    }
                    if (i4 != 0) {
                        mq1Var8 = null;
                    } else {
                        mq1Var8 = mq1Var2;
                    }
                    if (i6 != 0) {
                        mq1Var9 = null;
                    } else {
                        mq1Var9 = mq1Var3;
                    }
                    if ((i2 & 512) != 0) {
                        if (wp1Var3 != null) {
                        }
                        i8 &= -1879048193;
                        wp1Var5 = wp1Var4;
                    } else {
                        wp1Var5 = wp1Var4;
                        mq1Var10 = mq1Var4;
                    }
                    oz3Var3 = oz3VarM10799H;
                    mq1Var5 = mq1Var9;
                    i9 = i8;
                    nt2Var5 = nt2Var4;
                    nv2Var2 = nv2Var3;
                    z5 = z6;
                } else {
                    if (i11 != 0) {
                        nt2Var4 = kt2.f23428a;
                    } else {
                        nt2Var4 = nt2Var2;
                    }
                    if ((i2 & 2) != 0) {
                        oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
                        i8 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                    } else {
                        oz3VarM10799H = oz3Var2;
                    }
                    if (i13 == 0) {
                    }
                    if (i14 != 0) {
                        wp1Var3 = null;
                    }
                    if (i15 != 0) {
                        wp1Var4 = null;
                    }
                    if (i16 != 0) {
                        objM6869O = ir1Var.m6869O();
                        if (objM6869O == ki0.f23136a) {
                            objM6869O = sj3.m10810f();
                            ir1Var.m6905n0(objM6869O);
                        }
                        nv2Var3 = (nv2) objM6869O;
                    } else {
                        nv2Var3 = nv2Var;
                    }
                    if (i4 != 0) {
                        mq1Var8 = null;
                    } else {
                        mq1Var8 = mq1Var2;
                    }
                    if (i6 != 0) {
                        mq1Var9 = null;
                    } else {
                        mq1Var9 = mq1Var3;
                    }
                    if ((i2 & 512) != 0) {
                        if (wp1Var3 != null) {
                        }
                        i8 &= -1879048193;
                        wp1Var5 = wp1Var4;
                    } else {
                        wp1Var5 = wp1Var4;
                        mq1Var10 = mq1Var4;
                    }
                    oz3Var3 = oz3VarM10799H;
                    mq1Var5 = mq1Var9;
                    i9 = i8;
                    nt2Var5 = nt2Var4;
                    nv2Var2 = nv2Var3;
                    z5 = z6;
                }
                ir1Var.m6913s();
                nz3 nz3Var4 = oz3Var3.f27246c;
                e73 e73Var4 = nz3Var4.f26223b;
                nt2 nt2Var9 = nt2Var5;
                nc4 nc4Var4 = ij0.f21479n;
                boolean z10 = z5;
                oz3 oz3Var7 = new oz3(oz3Var3.f27244a, oz3Var3.f27245b, new nz3(nz3Var4.f26222a, AbstractC0647fd.m5670h(AbstractC0647fd.m5681t(e73Var4, (df2) ir1Var.m6898k(nc4Var4)), AbstractC0647fd.m5680s(oz3Var3.f27246c.f26223b, (df2) ir1Var.m6898k(nc4Var4)), 10), nz3Var4.f26224c));
                ri1 ri1Var4 = new ri1((byte) 5);
                ri1Var4.f29309c = mq1Var5;
                ri1Var4.f29310d = oz3Var3;
                ri1Var4.f29311e = mq1Var10;
                ri1Var4.f29312f = mq1Var;
                ri1Var4.f29308b = mq1Var8;
                VarHandle.storeStoreFence();
                mq1 mq1Var14 = mq1Var10;
                wp1 wp1Var9 = wp1Var3;
                nt2Var3 = nt2Var9;
                z4 = z10;
                m8461c(nt2Var3, oz3Var7, z4, wp1Var9, wp1Var5, nv2Var2, vd6.m11834R(-2109303462, ri1Var4, ir1Var), ir1Var, (i9 & 14) | 1572864 | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (i9 & 458752), 0);
                wp1Var3 = wp1Var9;
                ir1Var = ir1Var;
                mq1Var7 = mq1Var8;
                mq1Var6 = mq1Var14;
                wp1Var4 = wp1Var5;
                oz3Var2 = oz3Var3;
            } else {
                ir1Var.m6874W();
                nv2Var2 = nv2Var;
                mq1Var5 = mq1Var3;
                mq1Var6 = mq1Var4;
                nt2Var3 = nt2Var2;
                z4 = z2;
                mq1Var7 = mq1Var2;
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                fz3 fz3Var4 = new fz3();
                fz3Var4.f19438a = nt2Var3;
                fz3Var4.f19439b = oz3Var2;
                fz3Var4.f19440c = z4;
                fz3Var4.f19441d = wp1Var3;
                fz3Var4.f19442e = wp1Var4;
                fz3Var4.f19443f = nv2Var2;
                fz3Var4.f19444g = mq1Var;
                fz3Var4.f19445h = mq1Var7;
                fz3Var4.f19446i = mq1Var5;
                fz3Var4.f19447j = mq1Var6;
                fz3Var4.f19448k = i;
                fz3Var4.f19449l = i2;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = fz3Var4;
            }
        }
        i3 |= 196608;
        nv2Var2 = nv2Var;
        if ((i & 1572864) == 0) {
            if (ir1Var.m6894i(mq1Var)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        i4 = i2 & 128;
        if (i4 != 0) {
            if ((i & 12582912) == 0) {
                if (ir1Var.m6894i(mq1Var2)) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i3 |= i5;
            }
            i6 = i2 & 256;
            if (i6 != 0) {
                if ((i & 100663296) == 0) {
                    if (ir1Var.m6894i(mq1Var3)) {
                        i7 = 67108864;
                    } else {
                        i7 = 33554432;
                    }
                    i3 |= i7;
                }
                if ((i & 805306368) != 0) {
                    i3 |= ((i2 & 512) == 0 || !ir1Var.m6894i(mq1Var4)) ? 268435456 : 536870912;
                }
                i8 = i3;
                if ((i8 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (ir1Var.m6871T(i8 & 1, z3)) {
                    ir1Var.m6876Y();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            nt2Var4 = kt2.f23428a;
                        } else {
                            nt2Var4 = nt2Var2;
                        }
                        if ((i2 & 2) != 0) {
                            oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
                            i8 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        } else {
                            oz3VarM10799H = oz3Var2;
                        }
                        if (i13 == 0) {
                        }
                        if (i14 != 0) {
                            wp1Var3 = null;
                        }
                        if (i15 != 0) {
                            wp1Var4 = null;
                        }
                        if (i16 != 0) {
                            objM6869O = ir1Var.m6869O();
                            if (objM6869O == ki0.f23136a) {
                                objM6869O = sj3.m10810f();
                                ir1Var.m6905n0(objM6869O);
                            }
                            nv2Var3 = (nv2) objM6869O;
                        } else {
                            nv2Var3 = nv2Var;
                        }
                        if (i4 != 0) {
                            mq1Var8 = null;
                        } else {
                            mq1Var8 = mq1Var2;
                        }
                        if (i6 != 0) {
                            mq1Var9 = null;
                        } else {
                            mq1Var9 = mq1Var3;
                        }
                        if ((i2 & 512) != 0) {
                            if (wp1Var3 != null) {
                            }
                            i8 &= -1879048193;
                            wp1Var5 = wp1Var4;
                        } else {
                            wp1Var5 = wp1Var4;
                            mq1Var10 = mq1Var4;
                        }
                        oz3Var3 = oz3VarM10799H;
                        mq1Var5 = mq1Var9;
                        i9 = i8;
                        nt2Var5 = nt2Var4;
                        nv2Var2 = nv2Var3;
                        z5 = z6;
                    } else {
                        if (i11 != 0) {
                            nt2Var4 = kt2.f23428a;
                        } else {
                            nt2Var4 = nt2Var2;
                        }
                        if ((i2 & 2) != 0) {
                            oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
                            i8 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        } else {
                            oz3VarM10799H = oz3Var2;
                        }
                        if (i13 == 0) {
                        }
                        if (i14 != 0) {
                            wp1Var3 = null;
                        }
                        if (i15 != 0) {
                            wp1Var4 = null;
                        }
                        if (i16 != 0) {
                            objM6869O = ir1Var.m6869O();
                            if (objM6869O == ki0.f23136a) {
                                objM6869O = sj3.m10810f();
                                ir1Var.m6905n0(objM6869O);
                            }
                            nv2Var3 = (nv2) objM6869O;
                        } else {
                            nv2Var3 = nv2Var;
                        }
                        if (i4 != 0) {
                            mq1Var8 = null;
                        } else {
                            mq1Var8 = mq1Var2;
                        }
                        if (i6 != 0) {
                            mq1Var9 = null;
                        } else {
                            mq1Var9 = mq1Var3;
                        }
                        if ((i2 & 512) != 0) {
                            if (wp1Var3 != null) {
                            }
                            i8 &= -1879048193;
                            wp1Var5 = wp1Var4;
                        } else {
                            wp1Var5 = wp1Var4;
                            mq1Var10 = mq1Var4;
                        }
                        oz3Var3 = oz3VarM10799H;
                        mq1Var5 = mq1Var9;
                        i9 = i8;
                        nt2Var5 = nt2Var4;
                        nv2Var2 = nv2Var3;
                        z5 = z6;
                    }
                    ir1Var.m6913s();
                    nz3 nz3Var5 = oz3Var3.f27246c;
                    e73 e73Var5 = nz3Var5.f26223b;
                    nt2 nt2Var10 = nt2Var5;
                    nc4 nc4Var5 = ij0.f21479n;
                    boolean z11 = z5;
                    oz3 oz3Var8 = new oz3(oz3Var3.f27244a, oz3Var3.f27245b, new nz3(nz3Var5.f26222a, AbstractC0647fd.m5670h(AbstractC0647fd.m5681t(e73Var5, (df2) ir1Var.m6898k(nc4Var5)), AbstractC0647fd.m5680s(oz3Var3.f27246c.f26223b, (df2) ir1Var.m6898k(nc4Var5)), 10), nz3Var5.f26224c));
                    ri1 ri1Var5 = new ri1((byte) 5);
                    ri1Var5.f29309c = mq1Var5;
                    ri1Var5.f29310d = oz3Var3;
                    ri1Var5.f29311e = mq1Var10;
                    ri1Var5.f29312f = mq1Var;
                    ri1Var5.f29308b = mq1Var8;
                    VarHandle.storeStoreFence();
                    mq1 mq1Var15 = mq1Var10;
                    wp1 wp1Var10 = wp1Var3;
                    nt2Var3 = nt2Var10;
                    z4 = z11;
                    m8461c(nt2Var3, oz3Var8, z4, wp1Var10, wp1Var5, nv2Var2, vd6.m11834R(-2109303462, ri1Var5, ir1Var), ir1Var, (i9 & 14) | 1572864 | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (i9 & 458752), 0);
                    wp1Var3 = wp1Var10;
                    ir1Var = ir1Var;
                    mq1Var7 = mq1Var8;
                    mq1Var6 = mq1Var15;
                    wp1Var4 = wp1Var5;
                    oz3Var2 = oz3Var3;
                } else {
                    ir1Var.m6874W();
                    nv2Var2 = nv2Var;
                    mq1Var5 = mq1Var3;
                    mq1Var6 = mq1Var4;
                    nt2Var3 = nt2Var2;
                    z4 = z2;
                    mq1Var7 = mq1Var2;
                }
                yk3VarM6916v = ir1Var.m6916v();
                if (yk3VarM6916v != null) {
                    fz3 fz3Var5 = new fz3();
                    fz3Var5.f19438a = nt2Var3;
                    fz3Var5.f19439b = oz3Var2;
                    fz3Var5.f19440c = z4;
                    fz3Var5.f19441d = wp1Var3;
                    fz3Var5.f19442e = wp1Var4;
                    fz3Var5.f19443f = nv2Var2;
                    fz3Var5.f19444g = mq1Var;
                    fz3Var5.f19445h = mq1Var7;
                    fz3Var5.f19446i = mq1Var5;
                    fz3Var5.f19447j = mq1Var6;
                    fz3Var5.f19448k = i;
                    fz3Var5.f19449l = i2;
                    VarHandle.storeStoreFence();
                    yk3VarM6916v.f35300d = fz3Var5;
                }
            }
            i3 |= 100663296;
            if ((i & 805306368) != 0) {
                i3 |= ((i2 & 512) == 0 || !ir1Var.m6894i(mq1Var4)) ? 268435456 : 536870912;
            }
            i8 = i3;
            if ((i8 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ir1Var.m6871T(i8 & 1, z3)) {
                ir1Var.m6876Y();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        nt2Var4 = kt2.f23428a;
                    } else {
                        nt2Var4 = nt2Var2;
                    }
                    if ((i2 & 2) != 0) {
                        oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
                        i8 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                    } else {
                        oz3VarM10799H = oz3Var2;
                    }
                    if (i13 == 0) {
                    }
                    if (i14 != 0) {
                        wp1Var3 = null;
                    }
                    if (i15 != 0) {
                        wp1Var4 = null;
                    }
                    if (i16 != 0) {
                        objM6869O = ir1Var.m6869O();
                        if (objM6869O == ki0.f23136a) {
                            objM6869O = sj3.m10810f();
                            ir1Var.m6905n0(objM6869O);
                        }
                        nv2Var3 = (nv2) objM6869O;
                    } else {
                        nv2Var3 = nv2Var;
                    }
                    if (i4 != 0) {
                        mq1Var8 = null;
                    } else {
                        mq1Var8 = mq1Var2;
                    }
                    if (i6 != 0) {
                        mq1Var9 = null;
                    } else {
                        mq1Var9 = mq1Var3;
                    }
                    if ((i2 & 512) != 0) {
                        if (wp1Var3 != null) {
                        }
                        i8 &= -1879048193;
                        wp1Var5 = wp1Var4;
                    } else {
                        wp1Var5 = wp1Var4;
                        mq1Var10 = mq1Var4;
                    }
                    oz3Var3 = oz3VarM10799H;
                    mq1Var5 = mq1Var9;
                    i9 = i8;
                    nt2Var5 = nt2Var4;
                    nv2Var2 = nv2Var3;
                    z5 = z6;
                } else {
                    if (i11 != 0) {
                        nt2Var4 = kt2.f23428a;
                    } else {
                        nt2Var4 = nt2Var2;
                    }
                    if ((i2 & 2) != 0) {
                        oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
                        i8 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                    } else {
                        oz3VarM10799H = oz3Var2;
                    }
                    if (i13 == 0) {
                    }
                    if (i14 != 0) {
                        wp1Var3 = null;
                    }
                    if (i15 != 0) {
                        wp1Var4 = null;
                    }
                    if (i16 != 0) {
                        objM6869O = ir1Var.m6869O();
                        if (objM6869O == ki0.f23136a) {
                            objM6869O = sj3.m10810f();
                            ir1Var.m6905n0(objM6869O);
                        }
                        nv2Var3 = (nv2) objM6869O;
                    } else {
                        nv2Var3 = nv2Var;
                    }
                    if (i4 != 0) {
                        mq1Var8 = null;
                    } else {
                        mq1Var8 = mq1Var2;
                    }
                    if (i6 != 0) {
                        mq1Var9 = null;
                    } else {
                        mq1Var9 = mq1Var3;
                    }
                    if ((i2 & 512) != 0) {
                        if (wp1Var3 != null) {
                        }
                        i8 &= -1879048193;
                        wp1Var5 = wp1Var4;
                    } else {
                        wp1Var5 = wp1Var4;
                        mq1Var10 = mq1Var4;
                    }
                    oz3Var3 = oz3VarM10799H;
                    mq1Var5 = mq1Var9;
                    i9 = i8;
                    nt2Var5 = nt2Var4;
                    nv2Var2 = nv2Var3;
                    z5 = z6;
                }
                ir1Var.m6913s();
                nz3 nz3Var6 = oz3Var3.f27246c;
                e73 e73Var6 = nz3Var6.f26223b;
                nt2 nt2Var11 = nt2Var5;
                nc4 nc4Var6 = ij0.f21479n;
                boolean z12 = z5;
                oz3 oz3Var9 = new oz3(oz3Var3.f27244a, oz3Var3.f27245b, new nz3(nz3Var6.f26222a, AbstractC0647fd.m5670h(AbstractC0647fd.m5681t(e73Var6, (df2) ir1Var.m6898k(nc4Var6)), AbstractC0647fd.m5680s(oz3Var3.f27246c.f26223b, (df2) ir1Var.m6898k(nc4Var6)), 10), nz3Var6.f26224c));
                ri1 ri1Var6 = new ri1((byte) 5);
                ri1Var6.f29309c = mq1Var5;
                ri1Var6.f29310d = oz3Var3;
                ri1Var6.f29311e = mq1Var10;
                ri1Var6.f29312f = mq1Var;
                ri1Var6.f29308b = mq1Var8;
                VarHandle.storeStoreFence();
                mq1 mq1Var16 = mq1Var10;
                wp1 wp1Var11 = wp1Var3;
                nt2Var3 = nt2Var11;
                z4 = z12;
                m8461c(nt2Var3, oz3Var9, z4, wp1Var11, wp1Var5, nv2Var2, vd6.m11834R(-2109303462, ri1Var6, ir1Var), ir1Var, (i9 & 14) | 1572864 | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (i9 & 458752), 0);
                wp1Var3 = wp1Var11;
                ir1Var = ir1Var;
                mq1Var7 = mq1Var8;
                mq1Var6 = mq1Var16;
                wp1Var4 = wp1Var5;
                oz3Var2 = oz3Var3;
            } else {
                ir1Var.m6874W();
                nv2Var2 = nv2Var;
                mq1Var5 = mq1Var3;
                mq1Var6 = mq1Var4;
                nt2Var3 = nt2Var2;
                z4 = z2;
                mq1Var7 = mq1Var2;
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                fz3 fz3Var6 = new fz3();
                fz3Var6.f19438a = nt2Var3;
                fz3Var6.f19439b = oz3Var2;
                fz3Var6.f19440c = z4;
                fz3Var6.f19441d = wp1Var3;
                fz3Var6.f19442e = wp1Var4;
                fz3Var6.f19443f = nv2Var2;
                fz3Var6.f19444g = mq1Var;
                fz3Var6.f19445h = mq1Var7;
                fz3Var6.f19446i = mq1Var5;
                fz3Var6.f19447j = mq1Var6;
                fz3Var6.f19448k = i;
                fz3Var6.f19449l = i2;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = fz3Var6;
            }
        }
        i3 |= 12582912;
        i6 = i2 & 256;
        if (i6 != 0) {
            if ((i & 100663296) == 0) {
                if (ir1Var.m6894i(mq1Var3)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i3 |= i7;
            }
            if ((i & 805306368) != 0) {
                i3 |= ((i2 & 512) == 0 || !ir1Var.m6894i(mq1Var4)) ? 268435456 : 536870912;
            }
            i8 = i3;
            if ((i8 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ir1Var.m6871T(i8 & 1, z3)) {
                ir1Var.m6876Y();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        nt2Var4 = kt2.f23428a;
                    } else {
                        nt2Var4 = nt2Var2;
                    }
                    if ((i2 & 2) != 0) {
                        oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
                        i8 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                    } else {
                        oz3VarM10799H = oz3Var2;
                    }
                    if (i13 == 0) {
                    }
                    if (i14 != 0) {
                        wp1Var3 = null;
                    }
                    if (i15 != 0) {
                        wp1Var4 = null;
                    }
                    if (i16 != 0) {
                        objM6869O = ir1Var.m6869O();
                        if (objM6869O == ki0.f23136a) {
                            objM6869O = sj3.m10810f();
                            ir1Var.m6905n0(objM6869O);
                        }
                        nv2Var3 = (nv2) objM6869O;
                    } else {
                        nv2Var3 = nv2Var;
                    }
                    if (i4 != 0) {
                        mq1Var8 = null;
                    } else {
                        mq1Var8 = mq1Var2;
                    }
                    if (i6 != 0) {
                        mq1Var9 = null;
                    } else {
                        mq1Var9 = mq1Var3;
                    }
                    if ((i2 & 512) != 0) {
                        if (wp1Var3 != null) {
                        }
                        i8 &= -1879048193;
                        wp1Var5 = wp1Var4;
                    } else {
                        wp1Var5 = wp1Var4;
                        mq1Var10 = mq1Var4;
                    }
                    oz3Var3 = oz3VarM10799H;
                    mq1Var5 = mq1Var9;
                    i9 = i8;
                    nt2Var5 = nt2Var4;
                    nv2Var2 = nv2Var3;
                    z5 = z6;
                } else {
                    if (i11 != 0) {
                        nt2Var4 = kt2.f23428a;
                    } else {
                        nt2Var4 = nt2Var2;
                    }
                    if ((i2 & 2) != 0) {
                        oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
                        i8 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                    } else {
                        oz3VarM10799H = oz3Var2;
                    }
                    if (i13 == 0) {
                    }
                    if (i14 != 0) {
                        wp1Var3 = null;
                    }
                    if (i15 != 0) {
                        wp1Var4 = null;
                    }
                    if (i16 != 0) {
                        objM6869O = ir1Var.m6869O();
                        if (objM6869O == ki0.f23136a) {
                            objM6869O = sj3.m10810f();
                            ir1Var.m6905n0(objM6869O);
                        }
                        nv2Var3 = (nv2) objM6869O;
                    } else {
                        nv2Var3 = nv2Var;
                    }
                    if (i4 != 0) {
                        mq1Var8 = null;
                    } else {
                        mq1Var8 = mq1Var2;
                    }
                    if (i6 != 0) {
                        mq1Var9 = null;
                    } else {
                        mq1Var9 = mq1Var3;
                    }
                    if ((i2 & 512) != 0) {
                        if (wp1Var3 != null) {
                        }
                        i8 &= -1879048193;
                        wp1Var5 = wp1Var4;
                    } else {
                        wp1Var5 = wp1Var4;
                        mq1Var10 = mq1Var4;
                    }
                    oz3Var3 = oz3VarM10799H;
                    mq1Var5 = mq1Var9;
                    i9 = i8;
                    nt2Var5 = nt2Var4;
                    nv2Var2 = nv2Var3;
                    z5 = z6;
                }
                ir1Var.m6913s();
                nz3 nz3Var7 = oz3Var3.f27246c;
                e73 e73Var7 = nz3Var7.f26223b;
                nt2 nt2Var12 = nt2Var5;
                nc4 nc4Var7 = ij0.f21479n;
                boolean z13 = z5;
                oz3 oz3Var10 = new oz3(oz3Var3.f27244a, oz3Var3.f27245b, new nz3(nz3Var7.f26222a, AbstractC0647fd.m5670h(AbstractC0647fd.m5681t(e73Var7, (df2) ir1Var.m6898k(nc4Var7)), AbstractC0647fd.m5680s(oz3Var3.f27246c.f26223b, (df2) ir1Var.m6898k(nc4Var7)), 10), nz3Var7.f26224c));
                ri1 ri1Var7 = new ri1((byte) 5);
                ri1Var7.f29309c = mq1Var5;
                ri1Var7.f29310d = oz3Var3;
                ri1Var7.f29311e = mq1Var10;
                ri1Var7.f29312f = mq1Var;
                ri1Var7.f29308b = mq1Var8;
                VarHandle.storeStoreFence();
                mq1 mq1Var17 = mq1Var10;
                wp1 wp1Var12 = wp1Var3;
                nt2Var3 = nt2Var12;
                z4 = z13;
                m8461c(nt2Var3, oz3Var10, z4, wp1Var12, wp1Var5, nv2Var2, vd6.m11834R(-2109303462, ri1Var7, ir1Var), ir1Var, (i9 & 14) | 1572864 | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (i9 & 458752), 0);
                wp1Var3 = wp1Var12;
                ir1Var = ir1Var;
                mq1Var7 = mq1Var8;
                mq1Var6 = mq1Var17;
                wp1Var4 = wp1Var5;
                oz3Var2 = oz3Var3;
            } else {
                ir1Var.m6874W();
                nv2Var2 = nv2Var;
                mq1Var5 = mq1Var3;
                mq1Var6 = mq1Var4;
                nt2Var3 = nt2Var2;
                z4 = z2;
                mq1Var7 = mq1Var2;
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                fz3 fz3Var7 = new fz3();
                fz3Var7.f19438a = nt2Var3;
                fz3Var7.f19439b = oz3Var2;
                fz3Var7.f19440c = z4;
                fz3Var7.f19441d = wp1Var3;
                fz3Var7.f19442e = wp1Var4;
                fz3Var7.f19443f = nv2Var2;
                fz3Var7.f19444g = mq1Var;
                fz3Var7.f19445h = mq1Var7;
                fz3Var7.f19446i = mq1Var5;
                fz3Var7.f19447j = mq1Var6;
                fz3Var7.f19448k = i;
                fz3Var7.f19449l = i2;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = fz3Var7;
            }
        }
        i3 |= 100663296;
        if ((i & 805306368) != 0) {
            i3 |= ((i2 & 512) == 0 || !ir1Var.m6894i(mq1Var4)) ? 268435456 : 536870912;
        }
        i8 = i3;
        if ((i8 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (ir1Var.m6871T(i8 & 1, z3)) {
            ir1Var.m6876Y();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    nt2Var4 = kt2.f23428a;
                } else {
                    nt2Var4 = nt2Var2;
                }
                if ((i2 & 2) != 0) {
                    oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
                    i8 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                } else {
                    oz3VarM10799H = oz3Var2;
                }
                if (i13 == 0) {
                }
                if (i14 != 0) {
                    wp1Var3 = null;
                }
                if (i15 != 0) {
                    wp1Var4 = null;
                }
                if (i16 != 0) {
                    objM6869O = ir1Var.m6869O();
                    if (objM6869O == ki0.f23136a) {
                        objM6869O = sj3.m10810f();
                        ir1Var.m6905n0(objM6869O);
                    }
                    nv2Var3 = (nv2) objM6869O;
                } else {
                    nv2Var3 = nv2Var;
                }
                if (i4 != 0) {
                    mq1Var8 = null;
                } else {
                    mq1Var8 = mq1Var2;
                }
                if (i6 != 0) {
                    mq1Var9 = null;
                } else {
                    mq1Var9 = mq1Var3;
                }
                if ((i2 & 512) != 0) {
                    if (wp1Var3 != null) {
                    }
                    i8 &= -1879048193;
                    wp1Var5 = wp1Var4;
                } else {
                    wp1Var5 = wp1Var4;
                    mq1Var10 = mq1Var4;
                }
                oz3Var3 = oz3VarM10799H;
                mq1Var5 = mq1Var9;
                i9 = i8;
                nt2Var5 = nt2Var4;
                nv2Var2 = nv2Var3;
                z5 = z6;
            } else {
                if (i11 != 0) {
                    nt2Var4 = kt2.f23428a;
                } else {
                    nt2Var4 = nt2Var2;
                }
                if ((i2 & 2) != 0) {
                    oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
                    i8 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                } else {
                    oz3VarM10799H = oz3Var2;
                }
                if (i13 == 0) {
                }
                if (i14 != 0) {
                    wp1Var3 = null;
                }
                if (i15 != 0) {
                    wp1Var4 = null;
                }
                if (i16 != 0) {
                    objM6869O = ir1Var.m6869O();
                    if (objM6869O == ki0.f23136a) {
                        objM6869O = sj3.m10810f();
                        ir1Var.m6905n0(objM6869O);
                    }
                    nv2Var3 = (nv2) objM6869O;
                } else {
                    nv2Var3 = nv2Var;
                }
                if (i4 != 0) {
                    mq1Var8 = null;
                } else {
                    mq1Var8 = mq1Var2;
                }
                if (i6 != 0) {
                    mq1Var9 = null;
                } else {
                    mq1Var9 = mq1Var3;
                }
                if ((i2 & 512) != 0) {
                    if (wp1Var3 != null) {
                    }
                    i8 &= -1879048193;
                    wp1Var5 = wp1Var4;
                } else {
                    wp1Var5 = wp1Var4;
                    mq1Var10 = mq1Var4;
                }
                oz3Var3 = oz3VarM10799H;
                mq1Var5 = mq1Var9;
                i9 = i8;
                nt2Var5 = nt2Var4;
                nv2Var2 = nv2Var3;
                z5 = z6;
            }
            ir1Var.m6913s();
            nz3 nz3Var8 = oz3Var3.f27246c;
            e73 e73Var8 = nz3Var8.f26223b;
            nt2 nt2Var13 = nt2Var5;
            nc4 nc4Var8 = ij0.f21479n;
            boolean z14 = z5;
            oz3 oz3Var11 = new oz3(oz3Var3.f27244a, oz3Var3.f27245b, new nz3(nz3Var8.f26222a, AbstractC0647fd.m5670h(AbstractC0647fd.m5681t(e73Var8, (df2) ir1Var.m6898k(nc4Var8)), AbstractC0647fd.m5680s(oz3Var3.f27246c.f26223b, (df2) ir1Var.m6898k(nc4Var8)), 10), nz3Var8.f26224c));
            ri1 ri1Var8 = new ri1((byte) 5);
            ri1Var8.f29309c = mq1Var5;
            ri1Var8.f29310d = oz3Var3;
            ri1Var8.f29311e = mq1Var10;
            ri1Var8.f29312f = mq1Var;
            ri1Var8.f29308b = mq1Var8;
            VarHandle.storeStoreFence();
            mq1 mq1Var18 = mq1Var10;
            wp1 wp1Var13 = wp1Var3;
            nt2Var3 = nt2Var13;
            z4 = z14;
            m8461c(nt2Var3, oz3Var11, z4, wp1Var13, wp1Var5, nv2Var2, vd6.m11834R(-2109303462, ri1Var8, ir1Var), ir1Var, (i9 & 14) | 1572864 | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (i9 & 458752), 0);
            wp1Var3 = wp1Var13;
            ir1Var = ir1Var;
            mq1Var7 = mq1Var8;
            mq1Var6 = mq1Var18;
            wp1Var4 = wp1Var5;
            oz3Var2 = oz3Var3;
        } else {
            ir1Var.m6874W();
            nv2Var2 = nv2Var;
            mq1Var5 = mq1Var3;
            mq1Var6 = mq1Var4;
            nt2Var3 = nt2Var2;
            z4 = z2;
            mq1Var7 = mq1Var2;
        }
        yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            fz3 fz3Var8 = new fz3();
            fz3Var8.f19438a = nt2Var3;
            fz3Var8.f19439b = oz3Var2;
            fz3Var8.f19440c = z4;
            fz3Var8.f19441d = wp1Var3;
            fz3Var8.f19442e = wp1Var4;
            fz3Var8.f19443f = nv2Var2;
            fz3Var8.f19444g = mq1Var;
            fz3Var8.f19445h = mq1Var7;
            fz3Var8.f19446i = mq1Var5;
            fz3Var8.f19447j = mq1Var6;
            fz3Var8.f19448k = i;
            fz3Var8.f19449l = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = fz3Var8;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m8464f(xk4 xk4Var, yp1 yp1Var, nt2 nt2Var, oz3 oz3Var, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1783892375);
        int i2 = i | (ir1Var.m6890g(xk4Var) ? 4 : 2) | (ir1Var.m6890g(nt2Var) ? 256 : 128) | 1024;
        if (ir1Var.m6871T(i2 & 1, (i2 & 1171) != 1170)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                oz3Var = sj3.m10799H(qn4.f28628e, null, sj3.m10792A(null, false, ir1Var, 207), ir1Var, 12582918, 62);
            } else {
                ir1Var.m6874W();
            }
            int i3 = i2 & (-7169);
            oz3 oz3Var2 = oz3Var;
            ir1Var.m6913s();
            m8467i(xk4Var, yp1Var, nt2Var, null, oz3Var2, AbstractC1356y5.f34883f, null, AbstractC1356y5.f34884g, ir1Var, (i3 & 14) | 12779568 | (i3 & 896), 72);
            ir1Var = ir1Var;
            oz3Var = oz3Var2;
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0613ei c0613ei = new C0613ei((byte) 9);
            c0613ei.f18114d = xk4Var;
            c0613ei.f18113c = yp1Var;
            c0613ei.f18112b = nt2Var;
            c0613ei.f18115e = oz3Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0613ei;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m8465g(float f, nt2 nt2Var, oz3 oz3Var, boolean z, ma0 ma0Var, yp1 yp1Var, yp1 yp1Var2, yp1 yp1Var3, mq1 mq1Var, nq1 nq1Var, mi0 mi0Var, int i) {
        nt2 nt2Var2;
        boolean z2;
        ma0 ma0Var2;
        yp1 yp1Var4;
        ma0 ma0VarM10645Q;
        yp1 yp1Var5;
        nt2 nt2Var3;
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1069772226);
        int i3 = i | (ir1Var.m6884d(f) ? 4 : 2) | 48 | (ir1Var.m6890g(oz3Var) ? 256 : 128) | 207872 | (ir1Var.m6894i(yp1Var) ? 1048576 : 524288) | (ir1Var.m6894i(yp1Var2) ? 8388608 : 4194304) | 33554432;
        byte b = 1;
        if (ir1Var.m6871T(i3 & 1, (306783379 & i3) != 306783378)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                ma0VarM10645Q = sc6.m10645Q(0.0f, 1.0f);
                yp1Var5 = ks5.f23400i;
                nt2Var3 = kt2.f23428a;
                i2 = i3 & (-234938369);
                z2 = true;
            } else {
                ir1Var.m6874W();
                nt2Var3 = nt2Var;
                ma0VarM10645Q = ma0Var;
                yp1Var5 = yp1Var3;
                i2 = i3 & (-234938369);
                z2 = z;
            }
            ir1Var.m6913s();
            Object objM6869O = ir1Var.m6869O();
            if (objM6869O == ki0.f23136a) {
                objM6869O = new z73(f);
                ir1Var.m6905n0(objM6869O);
            }
            r10 r10Var = new r10(b);
            r10Var.f28947d = nq1Var;
            r10Var.f28945b = f;
            r10Var.f28948e = ma0VarM10645Q;
            r10Var.f28949f = yp1Var;
            r10Var.f28950g = yp1Var2;
            r10Var.f28951h = yp1Var5;
            r10Var.f28946c = z2;
            r10Var.f28952i = (z73) objM6869O;
            VarHandle.storeStoreFence();
            nt2Var2 = nt2Var3;
            m8463e(nt2Var2, oz3Var, z2, null, null, null, null, vd6.m11834R(-1344554946, r10Var, ir1Var), mq1Var, null, ir1Var, ((i2 >> 3) & 112) | 114819462, 568);
            ma0Var2 = ma0VarM10645Q;
            yp1Var4 = yp1Var5;
        } else {
            ir1Var.m6874W();
            nt2Var2 = nt2Var;
            z2 = z;
            ma0Var2 = ma0Var;
            yp1Var4 = yp1Var3;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            az3 az3Var = new az3();
            az3Var.f14958a = f;
            az3Var.f14959b = nt2Var2;
            az3Var.f14960c = oz3Var;
            az3Var.f14961d = z2;
            az3Var.f14962e = ma0Var2;
            az3Var.f14963f = yp1Var;
            az3Var.f14964g = yp1Var2;
            az3Var.f14965h = yp1Var4;
            az3Var.f14966i = mq1Var;
            az3Var.f14967j = nq1Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = az3Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:77:0x0118  */
    /* JADX WARN: Code duplicated, block: B:78:0x011b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0122  */
    /* JADX WARN: Code duplicated, block: B:85:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x012e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0187  */
    /* JADX WARN: Code duplicated, block: B:91:0x019a  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static final void m8466h(boolean z, yp1 yp1Var, nt2 nt2Var, oz3 oz3Var, boolean z2, nv2 nv2Var, yf4 yf4Var, mq1 mq1Var, mq1 mq1Var2, mi0 mi0Var, int i, int i2) {
        int i3;
        boolean z3;
        int i4;
        int i5;
        int i6;
        mq1 mq1Var3;
        int i7;
        boolean z4;
        nt2 nt2Var2;
        oz3 oz3Var2;
        mq1 mq1Var4;
        boolean z5;
        nv2 nv2Var2;
        yf4 yf4Var2;
        yk3 yk3VarM6916v;
        int i8;
        i50 i50Var;
        i50 i50Var2;
        oz3 oz3VarM10799H;
        int i9;
        Object objM6869O;
        yf4 yf4Var3;
        yf4 yf4Var4;
        nv2 nv2Var3;
        nt2 nt2Var3;
        boolean z6;
        boolean z7;
        Object obj;
        int i10;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1039602806);
        if ((i & 6) == 0) {
            i3 = (ir1Var.m6892h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ir1Var.m6894i(yp1Var) ? 32 : 16;
        }
        int i11 = i3 | 384;
        if ((i & 3072) == 0) {
            i11 = i3 | 1408;
        }
        int i12 = i2 & 16;
        if (i12 == 0) {
            if ((i & 24576) == 0) {
                z3 = z2;
                i11 |= ir1Var.m6892h(z3) ? 16384 : 8192;
            }
            i4 = i11 | 196608;
            if ((12582912 & i) == 0) {
                if (ir1Var.m6894i(mq1Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i4 |= i10;
            }
            i5 = 100663296 | i4;
            i6 = i2 & 512;
            if (i6 != 0) {
                if ((i & 805306368) == 0) {
                    mq1Var3 = mq1Var2;
                    if (ir1Var.m6894i(mq1Var3)) {
                        i7 = 536870912;
                    } else {
                        i7 = 268435456;
                    }
                    i5 |= i7;
                }
                if ((306259091 & i5) != 306259090) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ir1Var.m6871T(i5 & 1, z4)) {
                    ir1Var.m6876Y();
                    i8 = i & 1;
                    i50Var = ki0.f23136a;
                    if (i8 != 0 || ir1Var.m6856B()) {
                        int i13 = i5;
                        i50Var2 = i50Var;
                        oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
                        i9 = i13 & (-7169);
                        if (i12 != 0) {
                            z3 = true;
                        }
                        objM6869O = ir1Var.m6869O();
                        if (objM6869O == i50Var2) {
                            objM6869O = sj3.m10810f();
                            ir1Var.m6905n0(objM6869O);
                        }
                        nv2 nv2Var4 = (nv2) objM6869O;
                        if ((i2 & 64) != 0) {
                            yf4Var3 = yf4.f35196a;
                        } else {
                            yf4Var3 = yf4Var;
                        }
                        kt2 kt2Var = kt2.f23428a;
                        if (i6 != 0) {
                            mq1Var3 = null;
                        }
                        yf4Var4 = yf4Var3;
                        mq1Var4 = mq1Var3;
                        nv2Var3 = nv2Var4;
                        nt2Var3 = kt2Var;
                    } else {
                        ir1Var.m6874W();
                        int i14 = i5 & (-7169);
                        oz3VarM10799H = oz3Var;
                        yf4Var4 = yf4Var;
                        i9 = i14;
                        mq1Var4 = mq1Var3;
                        i50Var2 = i50Var;
                        nt2Var3 = nt2Var;
                        nv2Var3 = nv2Var;
                    }
                    ir1Var.m6913s();
                    nt2 nt2VarM10029m = qq2.m10029m(nt2Var3, new hv1((byte) 0));
                    if ((i9 & 112) == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = z6 | ((i9 & 14) == 4);
                    Object objM6869O2 = ir1Var.m6869O();
                    obj = objM6869O2;
                    if (z7 || objM6869O2 == i50Var2) {
                        dz3 dz3Var = new dz3((byte) 0);
                        dz3Var.f17535b = yp1Var;
                        dz3Var.f17536c = z;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(dz3Var);
                        obj = dz3Var;
                    }
                    C0823k5 c0823k5 = new C0823k5((byte) 6);
                    c0823k5.f22892b = z;
                    c0823k5.f22893c = nv2Var3;
                    VarHandle.storeStoreFence();
                    int i15 = 805306368 | ((i9 >> 6) & 896) | (458752 & i9);
                    int i16 = i9 >> 3;
                    int i17 = i15 | (3670016 & i16) | (29360128 & i16) | (i16 & 234881024);
                    nt2 nt2Var4 = nt2Var3;
                    oz3Var2 = oz3VarM10799H;
                    z5 = z3;
                    nv2Var2 = nv2Var3;
                    m8463e(nt2VarM10029m, oz3Var2, z5, (wp1) obj, null, nv2Var2, mq1Var, null, mq1Var4, vd6.m11834R(3265976, c0823k5, ir1Var), ir1Var, i17, 16);
                    nt2Var2 = nt2Var4;
                    yf4Var2 = yf4Var4;
                } else {
                    ir1Var.m6874W();
                    nt2Var2 = nt2Var;
                    oz3Var2 = oz3Var;
                    mq1Var4 = mq1Var3;
                    z5 = z3;
                    nv2Var2 = nv2Var;
                    yf4Var2 = yf4Var;
                }
                yk3VarM6916v = ir1Var.m6916v();
                if (yk3VarM6916v != null) {
                    ez3 ez3Var = new ez3();
                    ez3Var.f18604a = z;
                    ez3Var.f18605b = yp1Var;
                    ez3Var.f18606c = nt2Var2;
                    ez3Var.f18607d = oz3Var2;
                    ez3Var.f18608e = z5;
                    ez3Var.f18609f = nv2Var2;
                    ez3Var.f18610g = yf4Var2;
                    ez3Var.f18611h = mq1Var;
                    ez3Var.f18612i = mq1Var4;
                    ez3Var.f18613j = i;
                    ez3Var.f18614k = i2;
                    VarHandle.storeStoreFence();
                    yk3VarM6916v.f35300d = ez3Var;
                }
            }
            i5 = 905969664 | i4;
            mq1Var3 = mq1Var2;
            if ((306259091 & i5) != 306259090) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ir1Var.m6871T(i5 & 1, z4)) {
                ir1Var.m6876Y();
                i8 = i & 1;
                i50Var = ki0.f23136a;
                if (i8 != 0) {
                    int i18 = i5;
                    i50Var2 = i50Var;
                    oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
                    i9 = i18 & (-7169);
                    if (i12 != 0) {
                        z3 = true;
                    }
                    objM6869O = ir1Var.m6869O();
                    if (objM6869O == i50Var2) {
                        objM6869O = sj3.m10810f();
                        ir1Var.m6905n0(objM6869O);
                    }
                    nv2 nv2Var5 = (nv2) objM6869O;
                    if ((i2 & 64) != 0) {
                        yf4Var3 = yf4.f35196a;
                    } else {
                        yf4Var3 = yf4Var;
                    }
                    kt2 kt2Var2 = kt2.f23428a;
                    if (i6 != 0) {
                        mq1Var3 = null;
                    }
                    yf4Var4 = yf4Var3;
                    mq1Var4 = mq1Var3;
                    nv2Var3 = nv2Var5;
                    nt2Var3 = kt2Var2;
                } else {
                    int i19 = i5;
                    i50Var2 = i50Var;
                    oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
                    i9 = i19 & (-7169);
                    if (i12 != 0) {
                        z3 = true;
                    }
                    objM6869O = ir1Var.m6869O();
                    if (objM6869O == i50Var2) {
                        objM6869O = sj3.m10810f();
                        ir1Var.m6905n0(objM6869O);
                    }
                    nv2 nv2Var6 = (nv2) objM6869O;
                    if ((i2 & 64) != 0) {
                        yf4Var3 = yf4.f35196a;
                    } else {
                        yf4Var3 = yf4Var;
                    }
                    kt2 kt2Var3 = kt2.f23428a;
                    if (i6 != 0) {
                        mq1Var3 = null;
                    }
                    yf4Var4 = yf4Var3;
                    mq1Var4 = mq1Var3;
                    nv2Var3 = nv2Var6;
                    nt2Var3 = kt2Var3;
                }
                ir1Var.m6913s();
                nt2 nt2VarM10029m2 = qq2.m10029m(nt2Var3, new hv1((byte) 0));
                if ((i9 & 112) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = z6 | ((i9 & 14) == 4);
                Object objM6869O3 = ir1Var.m6869O();
                obj = objM6869O3;
                if (z7) {
                    dz3 dz3Var2 = new dz3((byte) 0);
                    dz3Var2.f17535b = yp1Var;
                    dz3Var2.f17536c = z;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(dz3Var2);
                    obj = dz3Var2;
                } else {
                    dz3 dz3Var3 = new dz3((byte) 0);
                    dz3Var3.f17535b = yp1Var;
                    dz3Var3.f17536c = z;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(dz3Var3);
                    obj = dz3Var3;
                }
                C0823k5 c0823k6 = new C0823k5((byte) 6);
                c0823k6.f22892b = z;
                c0823k6.f22893c = nv2Var3;
                VarHandle.storeStoreFence();
                int i110 = 805306368 | ((i9 >> 6) & 896) | (458752 & i9);
                int i111 = i9 >> 3;
                int i112 = i110 | (3670016 & i111) | (29360128 & i111) | (i111 & 234881024);
                nt2 nt2Var5 = nt2Var3;
                oz3Var2 = oz3VarM10799H;
                z5 = z3;
                nv2Var2 = nv2Var3;
                m8463e(nt2VarM10029m2, oz3Var2, z5, (wp1) obj, null, nv2Var2, mq1Var, null, mq1Var4, vd6.m11834R(3265976, c0823k6, ir1Var), ir1Var, i112, 16);
                nt2Var2 = nt2Var5;
                yf4Var2 = yf4Var4;
            } else {
                ir1Var.m6874W();
                nt2Var2 = nt2Var;
                oz3Var2 = oz3Var;
                mq1Var4 = mq1Var3;
                z5 = z3;
                nv2Var2 = nv2Var;
                yf4Var2 = yf4Var;
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                ez3 ez3Var2 = new ez3();
                ez3Var2.f18604a = z;
                ez3Var2.f18605b = yp1Var;
                ez3Var2.f18606c = nt2Var2;
                ez3Var2.f18607d = oz3Var2;
                ez3Var2.f18608e = z5;
                ez3Var2.f18609f = nv2Var2;
                ez3Var2.f18610g = yf4Var2;
                ez3Var2.f18611h = mq1Var;
                ez3Var2.f18612i = mq1Var4;
                ez3Var2.f18613j = i;
                ez3Var2.f18614k = i2;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = ez3Var2;
            }
        }
        i11 |= 24576;
        z3 = z2;
        i4 = i11 | 196608;
        if ((12582912 & i) == 0) {
            if (ir1Var.m6894i(mq1Var)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i4 |= i10;
        }
        i5 = 100663296 | i4;
        i6 = i2 & 512;
        if (i6 != 0) {
            if ((i & 805306368) == 0) {
                mq1Var3 = mq1Var2;
                if (ir1Var.m6894i(mq1Var3)) {
                    i7 = 536870912;
                } else {
                    i7 = 268435456;
                }
                i5 |= i7;
            }
            if ((306259091 & i5) != 306259090) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ir1Var.m6871T(i5 & 1, z4)) {
                ir1Var.m6876Y();
                i8 = i & 1;
                i50Var = ki0.f23136a;
                if (i8 != 0) {
                    int i113 = i5;
                    i50Var2 = i50Var;
                    oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
                    i9 = i113 & (-7169);
                    if (i12 != 0) {
                        z3 = true;
                    }
                    objM6869O = ir1Var.m6869O();
                    if (objM6869O == i50Var2) {
                        objM6869O = sj3.m10810f();
                        ir1Var.m6905n0(objM6869O);
                    }
                    nv2 nv2Var7 = (nv2) objM6869O;
                    if ((i2 & 64) != 0) {
                        yf4Var3 = yf4.f35196a;
                    } else {
                        yf4Var3 = yf4Var;
                    }
                    kt2 kt2Var4 = kt2.f23428a;
                    if (i6 != 0) {
                        mq1Var3 = null;
                    }
                    yf4Var4 = yf4Var3;
                    mq1Var4 = mq1Var3;
                    nv2Var3 = nv2Var7;
                    nt2Var3 = kt2Var4;
                } else {
                    int i114 = i5;
                    i50Var2 = i50Var;
                    oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
                    i9 = i114 & (-7169);
                    if (i12 != 0) {
                        z3 = true;
                    }
                    objM6869O = ir1Var.m6869O();
                    if (objM6869O == i50Var2) {
                        objM6869O = sj3.m10810f();
                        ir1Var.m6905n0(objM6869O);
                    }
                    nv2 nv2Var8 = (nv2) objM6869O;
                    if ((i2 & 64) != 0) {
                        yf4Var3 = yf4.f35196a;
                    } else {
                        yf4Var3 = yf4Var;
                    }
                    kt2 kt2Var5 = kt2.f23428a;
                    if (i6 != 0) {
                        mq1Var3 = null;
                    }
                    yf4Var4 = yf4Var3;
                    mq1Var4 = mq1Var3;
                    nv2Var3 = nv2Var8;
                    nt2Var3 = kt2Var5;
                }
                ir1Var.m6913s();
                nt2 nt2VarM10029m3 = qq2.m10029m(nt2Var3, new hv1((byte) 0));
                if ((i9 & 112) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = z6 | ((i9 & 14) == 4);
                Object objM6869O4 = ir1Var.m6869O();
                obj = objM6869O4;
                if (z7) {
                    dz3 dz3Var4 = new dz3((byte) 0);
                    dz3Var4.f17535b = yp1Var;
                    dz3Var4.f17536c = z;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(dz3Var4);
                    obj = dz3Var4;
                } else {
                    dz3 dz3Var5 = new dz3((byte) 0);
                    dz3Var5.f17535b = yp1Var;
                    dz3Var5.f17536c = z;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(dz3Var5);
                    obj = dz3Var5;
                }
                C0823k5 c0823k7 = new C0823k5((byte) 6);
                c0823k7.f22892b = z;
                c0823k7.f22893c = nv2Var3;
                VarHandle.storeStoreFence();
                int i115 = 805306368 | ((i9 >> 6) & 896) | (458752 & i9);
                int i116 = i9 >> 3;
                int i117 = i115 | (3670016 & i116) | (29360128 & i116) | (i116 & 234881024);
                nt2 nt2Var6 = nt2Var3;
                oz3Var2 = oz3VarM10799H;
                z5 = z3;
                nv2Var2 = nv2Var3;
                m8463e(nt2VarM10029m3, oz3Var2, z5, (wp1) obj, null, nv2Var2, mq1Var, null, mq1Var4, vd6.m11834R(3265976, c0823k7, ir1Var), ir1Var, i117, 16);
                nt2Var2 = nt2Var6;
                yf4Var2 = yf4Var4;
            } else {
                ir1Var.m6874W();
                nt2Var2 = nt2Var;
                oz3Var2 = oz3Var;
                mq1Var4 = mq1Var3;
                z5 = z3;
                nv2Var2 = nv2Var;
                yf4Var2 = yf4Var;
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                ez3 ez3Var3 = new ez3();
                ez3Var3.f18604a = z;
                ez3Var3.f18605b = yp1Var;
                ez3Var3.f18606c = nt2Var2;
                ez3Var3.f18607d = oz3Var2;
                ez3Var3.f18608e = z5;
                ez3Var3.f18609f = nv2Var2;
                ez3Var3.f18610g = yf4Var2;
                ez3Var3.f18611h = mq1Var;
                ez3Var3.f18612i = mq1Var4;
                ez3Var3.f18613j = i;
                ez3Var3.f18614k = i2;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = ez3Var3;
            }
        }
        i5 = 905969664 | i4;
        mq1Var3 = mq1Var2;
        if ((306259091 & i5) != 306259090) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (ir1Var.m6871T(i5 & 1, z4)) {
            ir1Var.m6876Y();
            i8 = i & 1;
            i50Var = ki0.f23136a;
            if (i8 != 0) {
                int i118 = i5;
                i50Var2 = i50Var;
                oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
                i9 = i118 & (-7169);
                if (i12 != 0) {
                    z3 = true;
                }
                objM6869O = ir1Var.m6869O();
                if (objM6869O == i50Var2) {
                    objM6869O = sj3.m10810f();
                    ir1Var.m6905n0(objM6869O);
                }
                nv2 nv2Var9 = (nv2) objM6869O;
                if ((i2 & 64) != 0) {
                    yf4Var3 = yf4.f35196a;
                } else {
                    yf4Var3 = yf4Var;
                }
                kt2 kt2Var6 = kt2.f23428a;
                if (i6 != 0) {
                    mq1Var3 = null;
                }
                yf4Var4 = yf4Var3;
                mq1Var4 = mq1Var3;
                nv2Var3 = nv2Var9;
                nt2Var3 = kt2Var6;
            } else {
                int i119 = i5;
                i50Var2 = i50Var;
                oz3VarM10799H = sj3.m10799H(null, null, null, ir1Var, 12582912, 127);
                i9 = i119 & (-7169);
                if (i12 != 0) {
                    z3 = true;
                }
                objM6869O = ir1Var.m6869O();
                if (objM6869O == i50Var2) {
                    objM6869O = sj3.m10810f();
                    ir1Var.m6905n0(objM6869O);
                }
                nv2 nv2Var10 = (nv2) objM6869O;
                if ((i2 & 64) != 0) {
                    yf4Var3 = yf4.f35196a;
                } else {
                    yf4Var3 = yf4Var;
                }
                kt2 kt2Var7 = kt2.f23428a;
                if (i6 != 0) {
                    mq1Var3 = null;
                }
                yf4Var4 = yf4Var3;
                mq1Var4 = mq1Var3;
                nv2Var3 = nv2Var10;
                nt2Var3 = kt2Var7;
            }
            ir1Var.m6913s();
            nt2 nt2VarM10029m4 = qq2.m10029m(nt2Var3, new hv1((byte) 0));
            if ((i9 & 112) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = z6 | ((i9 & 14) == 4);
            Object objM6869O5 = ir1Var.m6869O();
            obj = objM6869O5;
            if (z7) {
                dz3 dz3Var6 = new dz3((byte) 0);
                dz3Var6.f17535b = yp1Var;
                dz3Var6.f17536c = z;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(dz3Var6);
                obj = dz3Var6;
            } else {
                dz3 dz3Var7 = new dz3((byte) 0);
                dz3Var7.f17535b = yp1Var;
                dz3Var7.f17536c = z;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(dz3Var7);
                obj = dz3Var7;
            }
            C0823k5 c0823k8 = new C0823k5((byte) 6);
            c0823k8.f22892b = z;
            c0823k8.f22893c = nv2Var3;
            VarHandle.storeStoreFence();
            int i1110 = 805306368 | ((i9 >> 6) & 896) | (458752 & i9);
            int i1111 = i9 >> 3;
            int i1112 = i1110 | (3670016 & i1111) | (29360128 & i1111) | (i1111 & 234881024);
            nt2 nt2Var7 = nt2Var3;
            oz3Var2 = oz3VarM10799H;
            z5 = z3;
            nv2Var2 = nv2Var3;
            m8463e(nt2VarM10029m4, oz3Var2, z5, (wp1) obj, null, nv2Var2, mq1Var, null, mq1Var4, vd6.m11834R(3265976, c0823k8, ir1Var), ir1Var, i1112, 16);
            nt2Var2 = nt2Var7;
            yf4Var2 = yf4Var4;
        } else {
            ir1Var.m6874W();
            nt2Var2 = nt2Var;
            oz3Var2 = oz3Var;
            mq1Var4 = mq1Var3;
            z5 = z3;
            nv2Var2 = nv2Var;
            yf4Var2 = yf4Var;
        }
        yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ez3 ez3Var4 = new ez3();
            ez3Var4.f18604a = z;
            ez3Var4.f18605b = yp1Var;
            ez3Var4.f18606c = nt2Var2;
            ez3Var4.f18607d = oz3Var2;
            ez3Var4.f18608e = z5;
            ez3Var4.f18609f = nv2Var2;
            ez3Var4.f18610g = yf4Var2;
            ez3Var4.f18611h = mq1Var;
            ez3Var4.f18612i = mq1Var4;
            ez3Var4.f18613j = i;
            ez3Var4.f18614k = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ez3Var4;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r27v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v0 ??, new type: mq1
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r28v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r28v0 ??, new type: mq1
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: mq1
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: mq1
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v21 ??, new type: mq1
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v21 ??, new type: mq1
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v32 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v32 ??, new type: mq1
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v14 ??, new type: mq1
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v6 ??, new type: mq1
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v6 ??, new type: mq1
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v7 ??, new type: mq1
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v7 ??, new type: mq1
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v9 ??, new type: iq1
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v9 ??, new type: iq1
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r27v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v0 ??, new type: mq1
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r28v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r28v0 ??, new type: mq1
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v7 ??, new type: java.lang.Object
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: i */
    public static final void m8467i(p000.xk4 r21, p000.yp1 r22, p000.nt2 r23, p000.nd2 r24, p000.oz3 r25, p000.mq1 r26, p000.mq1 r27, p000.mq1 r28, p000.mi0 r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.mz3.m8467i(xk4, yp1, nt2, nd2, oz3, mq1, mq1, mq1, mi0, int, int):void");
    }

    /* JADX INFO: renamed from: j */
    public static final void m8468j(vg2 vg2Var, nq1 nq1Var, Object obj, yp1 yp1Var) {
        ArrayList arrayList = new ArrayList();
        kz3 kz3Var = new kz3();
        kz3Var.f23638b = arrayList;
        kz3Var.f23637a = vg2Var;
        VarHandle.storeStoreFence();
        yp1Var.invoke(kz3Var);
        byte b = 1;
        if (nq1Var != null) {
            boolean z = ((fi2) vg2Var.f32596c).f19015a.f22193b == 0;
            C0724hg c0724hg = new C0724hg(b);
            c0724hg.f20540b = z;
            c0724hg.f20541c = nq1Var;
            VarHandle.storeStoreFence();
            oi2.m9121c(vg2Var, obj, new pg0(-306813543, true, c0724hg), 2);
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            if (i < 0) {
                kx5.m7735t0();
                throw null;
            }
            lz3 lz3Var = (lz3) obj2;
            boolean z2 = ((fi2) vg2Var.f32596c).f19015a.f22193b == 0;
            Object obj3 = lz3Var.f24484a;
            gz3 gz3Var = new gz3();
            gz3Var.f20216a = i;
            gz3Var.f20217b = arrayList;
            gz3Var.f20218c = nq1Var;
            gz3Var.f20219d = z2;
            gz3Var.f20220e = lz3Var;
            VarHandle.storeStoreFence();
            oi2.m9121c(vg2Var, obj3, new pg0(-2008875742, true, gz3Var), 2);
            i = i3;
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m8469k(vg2 vg2Var, pg0 pg0Var, yp1 yp1Var, int i) {
        if ((i & 1) != 0) {
            pg0Var = null;
        }
        m8468j(vg2Var, pg0Var, null, yp1Var);
    }
}
