package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class zn4 {

    /* JADX INFO: renamed from: a */
    public static final g73 f36210a = new g73(8.0f, 4.0f, 8.0f, 4.0f);

    /* JADX INFO: renamed from: a */
    public static final void m13646a(bo4 bo4Var, nt2 nt2Var, float f, p44 p44Var, long j, long j2, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-343758958);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ir1Var.m6890g(bo4Var) : ir1Var.m6894i(bo4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(nt2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6890g(null) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6884d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ir1Var.m6890g(p44Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ir1Var.m6888f(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ir1Var.m6888f(j2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= ir1Var.m6884d(0.0f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= ir1Var.m6884d(0.0f) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 536870912 : 268435456;
        }
        if (ir1Var.m6871T(i2 & 1, (306783379 & i2) != 306783378)) {
            ir1Var.m6876Y();
            if ((i & 1) != 0 && !ir1Var.m6856B()) {
                ir1Var.m6874W();
            }
            ir1Var.m6913s();
            ir1Var.m6885d0(-1719845879);
            ir1Var.m6912r(false);
            wn4 wn4Var = new wn4();
            wn4Var.f33520a = f;
            wn4Var.f33521b = j;
            wn4Var.f33522c = pg0Var;
            VarHandle.storeStoreFence();
            int i3 = 12582912 | ((i2 >> 12) & 896);
            int i4 = i2 >> 9;
            kf4.m7511a(nt2Var, p44Var, j2, 0L, 0.0f, vd6.m11834R(-1573998995, wn4Var, ir1Var), ir1Var, i3 | (57344 & i4) | (i4 & 458752), 72);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            xn4 xn4Var = new xn4();
            xn4Var.f34465a = bo4Var;
            xn4Var.f34466b = nt2Var;
            xn4Var.f34467c = f;
            xn4Var.f34468d = p44Var;
            xn4Var.f34469e = j;
            xn4Var.f34470f = j2;
            xn4Var.f34471g = pg0Var;
            xn4Var.f34472h = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = xn4Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m13647b(bo4 bo4Var, String str, nt2 nt2Var, float f, p44 p44Var, long j, long j2, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        nt2 nt2Var2;
        float f2;
        p44 p44Var2;
        long j3;
        long j4;
        int i3;
        long jM6745e;
        long j5;
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1931523930);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ir1Var.m6890g(bo4Var) : ir1Var.m6894i(bo4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(str) ? 32 : 16;
        }
        int i4 = i2 | 28032;
        if ((196608 & i) == 0) {
            i4 = 93568 | i2;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= 4194304;
        }
        int i5 = 905969664 | i4;
        if (ir1Var.m6871T(i5 & 1, (306783379 & i5) != 306783378)) {
            ir1Var.m6876Y();
            int i6 = i & 1;
            kt2 kt2Var = kt2.f23428a;
            if (i6 == 0 || ir1Var.m6856B()) {
                float f3 = vn4.f32749a;
                p44 p44VarM10977a = t44.m10977a(4, ir1Var);
                long jM6745e2 = ic0.m6745e(3, ir1Var);
                i3 = i5 & (-33488897);
                p44Var2 = p44VarM10977a;
                f2 = f3;
                jM6745e = ic0.m6745e(5, ir1Var);
                j5 = jM6745e2;
                nt2Var2 = kt2Var;
            } else {
                ir1Var.m6874W();
                i3 = i5 & (-33488897);
                nt2Var2 = nt2Var;
                f2 = f;
                p44Var2 = p44Var;
                j5 = j;
                jM6745e = j2;
            }
            ir1Var.m6913s();
            boolean z = (i3 & 112) == 32;
            Object objM6869O = ir1Var.m6869O();
            if (z || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                C1051py c1051py = new C1051py((byte) 8);
                c1051py.f28076b = str;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c1051py);
                obj = c1051py;
            }
            obj = objM6869O;
            nt2 nt2VarMo7630d = f14.m5458a(kt2Var, false, (yp1) obj).mo7630d(nt2Var2);
            int i7 = i3 & 14;
            int i8 = i3 >> 3;
            j3 = j5;
            j4 = jM6745e;
            m13646a(bo4Var, nt2VarMo7630d, f2, p44Var2, j3, j4, pg0Var, ir1Var, (i8 & 234881024) | i7 | (i8 & 896) | (i8 & 7168) | (29360128 & i8) | 805306368);
        } else {
            ir1Var.m6874W();
            nt2Var2 = nt2Var;
            f2 = f;
            p44Var2 = p44Var;
            j3 = j;
            j4 = j2;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            yn4 yn4Var = new yn4();
            yn4Var.f35363a = bo4Var;
            yn4Var.f35364b = str;
            yn4Var.f35365c = nt2Var2;
            yn4Var.f35366d = f2;
            yn4Var.f35367e = p44Var2;
            yn4Var.f35368f = j3;
            yn4Var.f35369g = j4;
            yn4Var.f35370h = pg0Var;
            yn4Var.f35371i = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = yn4Var;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m13648c(dd3 dd3Var, pg0 pg0Var, co4 co4Var, nt2 nt2Var, boolean z, mq1 mq1Var, mi0 mi0Var, int i) {
        int i2;
        byte b;
        boolean z2;
        Object objMo11188l;
        boolean z3;
        Object objMo11188l2;
        dd3 dd3Var2 = dd3Var;
        co4 co4Var2 = co4Var;
        nt2 nt2Var2 = nt2Var;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-293753984);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(dd3Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? ir1Var.m6890g(co4Var2) : ir1Var.m6894i(co4Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6890g(nt2Var2) ? 2048 : 1024;
        }
        int i3 = i2 | 14376960;
        if ((100663296 & i) == 0) {
            i3 |= ir1Var.m6894i(mq1Var) ? 67108864 : 33554432;
        }
        if (ir1Var.m6871T(i3 & 1, (38347923 & i3) != 38347922)) {
            dp4 dp4VarM13663O = zp0.m13663O(co4Var2.f16185b, "tooltip transition", ir1Var, 48, 0);
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                objM6869O = k43.m7398w(null);
                ir1Var.m6905n0(objM6869O);
            }
            sw2 sw2Var = (sw2) objM6869O;
            Object objM6869O2 = ir1Var.m6869O();
            if (objM6869O2 == i50Var) {
                objM6869O2 = new bo4();
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(objM6869O2);
            }
            bo4 bo4Var = (bo4) objM6869O2;
            er1 er1Var = new er1((byte) 22);
            er1Var.f18412b = sw2Var;
            er1Var.f18413c = mq1Var;
            VarHandle.storeStoreFence();
            pg0 pg0VarM11834R = vd6.m11834R(-23901870, er1Var, ir1Var);
            Object objM6869O3 = ir1Var.m6869O();
            if (objM6869O3 == i50Var) {
                objM6869O3 = k43.m7398w(null);
                ir1Var.m6905n0(objM6869O3);
            }
            sw2 sw2Var2 = (sw2) objM6869O3;
            Object objM6869O4 = ir1Var.m6869O();
            if (objM6869O4 == i50Var) {
                ld1 ld1Var = new ld1((byte) 3);
                ld1Var.f23961b = sw2Var;
                ld1Var.f23962c = sw2Var2;
                VarHandle.storeStoreFence();
                objM6869O4 = s94.m10566b(ld1Var);
                ir1Var.m6905n0(objM6869O4);
            }
            xb4 xb4Var = (xb4) objM6869O4;
            ag1 ag1VarM7919a0 = lb5.m7919a0(1, ir1Var);
            ag1 ag1VarM7919a1 = lb5.m7919a0(4, ir1Var);
            sq4 sq4Var = sw4.f30612a;
            boolean zM4648j = dp4VarM13663O.m4648j();
            zh0 zh0Var = dp4VarM13663O.f17258a;
            if (zM4648j) {
                ir1Var.m6885d0(1666827533);
                ir1Var.m6912r(false);
                objMo11188l = zh0Var.mo11188l();
            } else {
                ir1Var.m6885d0(1666573488);
                boolean zM6890g = ir1Var.m6890g(dp4VarM13663O);
                objMo11188l = ir1Var.m6869O();
                if (zM6890g || objMo11188l == i50Var) {
                    e94 e94VarM5353c0 = ev0.m5353c0();
                    yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
                    e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
                    try {
                        Object objMo11188l3 = zh0Var.mo11188l();
                        ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                        ir1Var.m6905n0(objMo11188l3);
                        objMo11188l = objMo11188l3;
                    } catch (Throwable th) {
                        ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                        throw th;
                    }
                }
                ir1Var.m6912r(false);
            }
            boolean zBooleanValue = ((Boolean) objMo11188l).booleanValue();
            ir1Var.m6885d0(838300572);
            float f = zBooleanValue ? 1.0f : 0.8f;
            ir1Var.m6912r(false);
            Float fValueOf = Float.valueOf(f);
            boolean zM6890g2 = ir1Var.m6890g(dp4VarM13663O);
            Object objM6869O5 = ir1Var.m6869O();
            if (zM6890g2 || objM6869O5 == i50Var) {
                hc0 hc0Var = new hc0((byte) 14);
                hc0Var.f20476b = dp4VarM13663O;
                VarHandle.storeStoreFence();
                objM6869O5 = s94.m10566b(hc0Var);
                ir1Var.m6905n0(objM6869O5);
            }
            boolean zBooleanValue2 = ((Boolean) ((xb4) objM6869O5).getValue()).booleanValue();
            ir1Var.m6885d0(838300572);
            float f2 = zBooleanValue2 ? 1.0f : 0.8f;
            ir1Var.m6912r(false);
            Float fValueOf2 = Float.valueOf(f2);
            boolean zM6890g3 = ir1Var.m6890g(dp4VarM13663O);
            Object objM6869O6 = ir1Var.m6869O();
            if (zM6890g3 || objM6869O6 == i50Var) {
                hc0 hc0Var2 = new hc0((byte) 15);
                hc0Var2.f20476b = dp4VarM13663O;
                VarHandle.storeStoreFence();
                objM6869O6 = s94.m10566b(hc0Var2);
                ir1Var.m6905n0(objM6869O6);
            }
            ir1Var.m6885d0(-1664496585);
            ir1Var.m6912r(false);
            bp4 bp4VarM13688t = zp0.m13688t(dp4VarM13663O, fValueOf, fValueOf2, ag1VarM7919a0, sq4Var, ir1Var, 196608);
            if (dp4VarM13663O.m4648j()) {
                pg0VarM11834R = pg0VarM11834R;
                z3 = false;
                ir1Var.m6885d0(1666827533);
                ir1Var.m6912r(false);
                objMo11188l2 = zh0Var.mo11188l();
            } else {
                ir1Var.m6885d0(1666573488);
                boolean zM6890g4 = ir1Var.m6890g(dp4VarM13663O);
                objMo11188l2 = ir1Var.m6869O();
                if (zM6890g4 || objMo11188l2 == i50Var) {
                    e94 e94VarM5353c1 = ev0.m5353c0();
                    yp1 yp1VarMo3783e2 = e94VarM5353c1 != null ? e94VarM5353c1.mo3783e() : null;
                    e94 e94VarM5361k1 = ev0.m5361k0(e94VarM5353c1);
                    try {
                        Object objMo11188l4 = zh0Var.mo11188l();
                        ev0.m5370t0(e94VarM5353c1, e94VarM5361k1, yp1VarMo3783e2);
                        ir1Var.m6905n0(objMo11188l4);
                        objMo11188l2 = objMo11188l4;
                        z3 = false;
                    } catch (Throwable th2) {
                        ev0.m5370t0(e94VarM5353c1, e94VarM5361k1, yp1VarMo3783e2);
                        throw th2;
                    }
                } else {
                    z3 = false;
                }
                ir1Var.m6912r(z3);
            }
            boolean zBooleanValue3 = ((Boolean) objMo11188l2).booleanValue();
            ir1Var.m6885d0(-1903393104);
            float f3 = zBooleanValue3 ? 1.0f : 0.0f;
            ir1Var.m6912r(z3);
            Float fValueOf3 = Float.valueOf(f3);
            boolean zM6890g5 = ir1Var.m6890g(dp4VarM13663O);
            Object objM6869O7 = ir1Var.m6869O();
            if (zM6890g5 || objM6869O7 == i50Var) {
                hc0 hc0Var3 = new hc0((byte) 16);
                hc0Var3.f20476b = dp4VarM13663O;
                VarHandle.storeStoreFence();
                objM6869O7 = s94.m10566b(hc0Var3);
                ir1Var.m6905n0(objM6869O7);
            }
            boolean zBooleanValue4 = ((Boolean) ((xb4) objM6869O7).getValue()).booleanValue();
            ir1Var.m6885d0(-1903393104);
            float f4 = zBooleanValue4 ? 1.0f : 0.0f;
            ir1Var.m6912r(false);
            Float fValueOf4 = Float.valueOf(f4);
            boolean zM6890g6 = ir1Var.m6890g(dp4VarM13663O);
            Object objM6869O8 = ir1Var.m6869O();
            if (zM6890g6 || objM6869O8 == i50Var) {
                hc0 hc0Var4 = new hc0((byte) 17);
                hc0Var4.f20476b = dp4VarM13663O;
                VarHandle.storeStoreFence();
                objM6869O8 = s94.m10566b(hc0Var4);
                ir1Var.m6905n0(objM6869O8);
            }
            ir1Var.m6885d0(-111222965);
            ir1Var.m6912r(false);
            bp4 bp4VarM13688t2 = zp0.m13688t(dp4VarM13663O, fValueOf3, fValueOf4, ag1VarM7919a1, sq4Var, ir1Var, 196608);
            C1373ym c1373ym = new C1373ym((byte) 2);
            c1373ym.f35321b = sw2Var2;
            c1373ym.f35322c = bp4VarM13688t;
            c1373ym.f35323d = bp4VarM13688t2;
            c1373ym.f35324e = xb4Var;
            c1373ym.f35326g = pg0Var;
            c1373ym.f35325f = bo4Var;
            VarHandle.storeStoreFence();
            co4Var2 = co4Var;
            nt2Var2 = nt2Var;
            b = 3;
            dd3Var2 = dd3Var;
            i20.m6576a(dd3Var2, vd6.m11834R(-527401546, c1373ym, ir1Var), co4Var2, nt2Var2, pg0VarM11834R, ir1Var, (i3 & 14) | 100663344 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128));
            z2 = true;
        } else {
            b = 3;
            ir1Var.m6874W();
            z2 = z;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1014oy c1014oy = new C1014oy(b);
            c1014oy.f27199d = dd3Var2;
            c1014oy.f27203h = pg0Var;
            c1014oy.f27200e = co4Var2;
            c1014oy.f27201f = nt2Var2;
            c1014oy.f27197b = z2;
            c1014oy.f27202g = mq1Var;
            c1014oy.f27198c = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1014oy;
        }
    }
}
