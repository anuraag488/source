package com.materialkolor.ktx;

import java.lang.invoke.VarHandle;
import java.util.List;
import p000.C1035pi;
import p000.ag1;
import p000.bp4;
import p000.d55;
import p000.d83;
import p000.dc0;
import p000.dp4;
import p000.e94;
import p000.ec0;
import p000.ev0;
import p000.fc0;
import p000.fh0;
import p000.gc0;
import p000.hc0;
import p000.i50;
import p000.ir1;
import p000.ki0;
import p000.kx5;
import p000.lc0;
import p000.mi0;
import p000.nq1;
import p000.pb0;
import p000.s94;
import p000.sq4;
import p000.xb4;
import p000.yp1;
import p000.zh0;
import p000.zp0;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ColorSchemeKt {
    /* JADX INFO: renamed from: a */
    public static final List m4085a(dp4 dp4Var, nq1 nq1Var, mi0 mi0Var, int i) {
        Object objM4366k;
        boolean z;
        Object objM4366k2;
        boolean z2;
        Object objM4366k3;
        boolean z3;
        Object objM4366k4;
        boolean z4;
        Object objM4366k5;
        boolean z5;
        Object objM4366k6;
        Object objM10566b;
        zh0 zh0Var = dp4Var.f17258a;
        C1035pi c1035pi = C1035pi.f27617o;
        int i2 = (i & 14) | 384 | (i & 112);
        d83 d83Var = dp4Var.f17261d;
        dc0 dc0Var = (dc0) d83Var.getValue();
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6885d0(-835464483);
        long j = dc0Var.f16957n;
        ir1Var.m6912r(false);
        lc0 lc0VarM9467f = pb0.m9467f(j);
        boolean zM6890g = ir1Var.m6890g(lc0VarM9467f);
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (zM6890g || objM6869O == i50Var) {
            objM6869O = d55.m4364i(lc0VarM9467f, c1035pi, ir1Var);
        }
        sq4 sq4Var = (sq4) objM6869O;
        int i3 = ((i2 << 3) & 896) | (i2 & 14) | 3072;
        if (dp4Var.m4648j()) {
            objM4366k = d55.m4366k(ir1Var, 1666827533, false, zh0Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z6 = (((i3 & 14) ^ 6) > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4366k = ir1Var.m6869O();
            if (z6 || objM4366k == i50Var) {
                e94 e94VarM5353c0 = ev0.m5353c0();
                yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
                e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
                try {
                    Object objMo11188l = zh0Var.mo11188l();
                    ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                    ir1Var.m6905n0(objMo11188l);
                    objM4366k = objMo11188l;
                } catch (Throwable th) {
                    ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                    throw th;
                }
            }
            ir1Var.m6912r(false);
        }
        ir1Var.m6885d0(-835464483);
        long j2 = ((dc0) objM4366k).f16957n;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a = pb0.m9462a(j2);
        int i4 = i3 & 14;
        int i5 = i4 ^ 6;
        boolean z7 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O2 = ir1Var.m6869O();
        if (z7 || objM6869O2 == i50Var) {
            ec0 ec0Var = new ec0((byte) 3);
            ec0Var.f17959b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O2 = s94.m10566b(ec0Var);
            ir1Var.m6905n0(objM6869O2);
        }
        dc0 dc0Var2 = (dc0) ((xb4) objM6869O2).getValue();
        ir1Var.m6885d0(-835464483);
        long j3 = dc0Var2.f16957n;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a2 = pb0.m9462a(j3);
        boolean z8 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O3 = ir1Var.m6869O();
        if (z8 || objM6869O3 == i50Var) {
            ec0 ec0Var2 = new ec0((byte) 4);
            ec0Var2.f17959b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O3 = s94.m10566b(ec0Var2);
            ir1Var.m6905n0(objM6869O3);
        }
        Object value = ((xb4) objM6869O3).getValue();
        int i6 = (i3 >> 3) & 112;
        int i7 = 196608 | i4;
        bp4 bp4VarM13688t = zp0.m13688t(dp4Var, pb0VarM9462a, pb0VarM9462a2, (ag1) nq1Var.invoke(value, ir1Var, Integer.valueOf(i6)), sq4Var, ir1Var, i7);
        dc0 dc0Var3 = (dc0) d83Var.getValue();
        ir1Var.m6885d0(-223639234);
        long j4 = dc0Var3.f16958o;
        ir1Var.m6912r(false);
        lc0 lc0VarM9467f2 = pb0.m9467f(j4);
        boolean zM6890g2 = ir1Var.m6890g(lc0VarM9467f2);
        Object objM6869O4 = ir1Var.m6869O();
        if (zM6890g2 || objM6869O4 == i50Var) {
            objM6869O4 = d55.m4364i(lc0VarM9467f2, c1035pi, ir1Var);
        }
        sq4 sq4Var2 = (sq4) objM6869O4;
        if (dp4Var.m4648j()) {
            bp4VarM13688t = bp4VarM13688t;
            z = false;
            objM4366k2 = d55.m4366k(ir1Var, 1666827533, false, zh0Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z9 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4366k2 = ir1Var.m6869O();
            if (z9 || objM4366k2 == i50Var) {
                e94 e94VarM5353c1 = ev0.m5353c0();
                yp1 yp1VarMo3783e2 = e94VarM5353c1 != null ? e94VarM5353c1.mo3783e() : null;
                e94 e94VarM5361k1 = ev0.m5361k0(e94VarM5353c1);
                try {
                    Object objMo11188l2 = zh0Var.mo11188l();
                    ev0.m5370t0(e94VarM5353c1, e94VarM5361k1, yp1VarMo3783e2);
                    ir1Var.m6905n0(objMo11188l2);
                    objM4366k2 = objMo11188l2;
                } catch (Throwable th2) {
                    ev0.m5370t0(e94VarM5353c1, e94VarM5361k1, yp1VarMo3783e2);
                    throw th2;
                }
            }
            z = false;
            ir1Var.m6912r(false);
        }
        ir1Var.m6885d0(-223639234);
        long j5 = ((dc0) objM4366k2).f16958o;
        ir1Var.m6912r(z);
        pb0 pb0VarM9462a3 = pb0.m9462a(j5);
        boolean z10 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O5 = ir1Var.m6869O();
        if (z10 || objM6869O5 == i50Var) {
            ec0 ec0Var3 = new ec0((byte) 5);
            ec0Var3.f17959b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O5 = s94.m10566b(ec0Var3);
            ir1Var.m6905n0(objM6869O5);
        }
        dc0 dc0Var4 = (dc0) ((xb4) objM6869O5).getValue();
        ir1Var.m6885d0(-223639234);
        long j6 = dc0Var4.f16958o;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a4 = pb0.m9462a(j6);
        boolean z11 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O6 = ir1Var.m6869O();
        if (z11 || objM6869O6 == i50Var) {
            ec0 ec0Var4 = new ec0((byte) 6);
            ec0Var4.f17959b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O6 = s94.m10566b(ec0Var4);
            ir1Var.m6905n0(objM6869O6);
        }
        ag1 ag1Var = (ag1) nq1Var.invoke(((xb4) objM6869O6).getValue(), ir1Var, Integer.valueOf(i6));
        bp4 bp4Var = bp4VarM13688t;
        bp4 bp4VarM13688t2 = zp0.m13688t(dp4Var, pb0VarM9462a3, pb0VarM9462a4, ag1Var, sq4Var2, ir1Var, i7);
        dc0 dc0Var5 = (dc0) d83Var.getValue();
        ir1Var.m6885d0(-2038357105);
        long j7 = dc0Var5.f16966w;
        ir1Var.m6912r(false);
        lc0 lc0VarM9467f3 = pb0.m9467f(j7);
        boolean zM6890g3 = ir1Var.m6890g(lc0VarM9467f3);
        Object objM6869O7 = ir1Var.m6869O();
        if (zM6890g3 || objM6869O7 == i50Var) {
            objM6869O7 = d55.m4364i(lc0VarM9467f3, c1035pi, ir1Var);
        }
        sq4 sq4Var3 = (sq4) objM6869O7;
        if (dp4Var.m4648j()) {
            bp4VarM13688t2 = bp4VarM13688t2;
            sq4Var3 = sq4Var3;
            z2 = false;
            objM4366k3 = d55.m4366k(ir1Var, 1666827533, false, zh0Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z12 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4366k3 = ir1Var.m6869O();
            if (z12 || objM4366k3 == i50Var) {
                e94 e94VarM5353c2 = ev0.m5353c0();
                yp1 yp1VarMo3783e3 = e94VarM5353c2 != null ? e94VarM5353c2.mo3783e() : null;
                e94 e94VarM5361k2 = ev0.m5361k0(e94VarM5353c2);
                try {
                    Object objMo11188l3 = zh0Var.mo11188l();
                    ev0.m5370t0(e94VarM5353c2, e94VarM5361k2, yp1VarMo3783e3);
                    ir1Var.m6905n0(objMo11188l3);
                    objM4366k3 = objMo11188l3;
                } catch (Throwable th3) {
                    ev0.m5370t0(e94VarM5353c2, e94VarM5361k2, yp1VarMo3783e3);
                    throw th3;
                }
            }
            z2 = false;
            ir1Var.m6912r(false);
        }
        ir1Var.m6885d0(-2038357105);
        long j8 = ((dc0) objM4366k3).f16966w;
        ir1Var.m6912r(z2);
        pb0 pb0VarM9462a5 = pb0.m9462a(j8);
        boolean z13 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O8 = ir1Var.m6869O();
        if (z13 || objM6869O8 == i50Var) {
            ec0 ec0Var5 = new ec0((byte) 7);
            ec0Var5.f17959b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O8 = s94.m10566b(ec0Var5);
            ir1Var.m6905n0(objM6869O8);
        }
        dc0 dc0Var6 = (dc0) ((xb4) objM6869O8).getValue();
        ir1Var.m6885d0(-2038357105);
        long j9 = dc0Var6.f16966w;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a6 = pb0.m9462a(j9);
        boolean z14 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O9 = ir1Var.m6869O();
        if (z14 || objM6869O9 == i50Var) {
            ec0 ec0Var6 = new ec0((byte) 8);
            ec0Var6.f17959b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O9 = s94.m10566b(ec0Var6);
            ir1Var.m6905n0(objM6869O9);
        }
        bp4 bp4Var2 = bp4VarM13688t2;
        bp4 bp4VarM13688t3 = zp0.m13688t(dp4Var, pb0VarM9462a5, pb0VarM9462a6, (ag1) nq1Var.invoke(((xb4) objM6869O9).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var3, ir1Var, i7);
        dc0 dc0Var7 = (dc0) d83Var.getValue();
        ir1Var.m6885d0(-1401473906);
        long j10 = dc0Var7.f16967x;
        ir1Var.m6912r(false);
        lc0 lc0VarM9467f4 = pb0.m9467f(j10);
        boolean zM6890g4 = ir1Var.m6890g(lc0VarM9467f4);
        Object objM6869O10 = ir1Var.m6869O();
        if (zM6890g4 || objM6869O10 == i50Var) {
            objM6869O10 = d55.m4364i(lc0VarM9467f4, c1035pi, ir1Var);
        }
        sq4 sq4Var4 = (sq4) objM6869O10;
        if (dp4Var.m4648j()) {
            bp4VarM13688t3 = bp4VarM13688t3;
            sq4Var4 = sq4Var4;
            z3 = false;
            objM4366k4 = d55.m4366k(ir1Var, 1666827533, false, zh0Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z15 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4366k4 = ir1Var.m6869O();
            if (z15 || objM4366k4 == i50Var) {
                e94 e94VarM5353c3 = ev0.m5353c0();
                yp1 yp1VarMo3783e4 = e94VarM5353c3 != null ? e94VarM5353c3.mo3783e() : null;
                e94 e94VarM5361k3 = ev0.m5361k0(e94VarM5353c3);
                try {
                    Object objMo11188l4 = zh0Var.mo11188l();
                    ev0.m5370t0(e94VarM5353c3, e94VarM5361k3, yp1VarMo3783e4);
                    ir1Var.m6905n0(objMo11188l4);
                    objM4366k4 = objMo11188l4;
                } catch (Throwable th4) {
                    ev0.m5370t0(e94VarM5353c3, e94VarM5361k3, yp1VarMo3783e4);
                    throw th4;
                }
            }
            z3 = false;
            ir1Var.m6912r(false);
        }
        ir1Var.m6885d0(-1401473906);
        long j11 = ((dc0) objM4366k4).f16967x;
        ir1Var.m6912r(z3);
        pb0 pb0VarM9462a7 = pb0.m9462a(j11);
        boolean z16 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O11 = ir1Var.m6869O();
        if (z16 || objM6869O11 == i50Var) {
            ec0 ec0Var7 = new ec0((byte) 9);
            ec0Var7.f17959b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O11 = s94.m10566b(ec0Var7);
            ir1Var.m6905n0(objM6869O11);
        }
        dc0 dc0Var8 = (dc0) ((xb4) objM6869O11).getValue();
        ir1Var.m6885d0(-1401473906);
        long j12 = dc0Var8.f16967x;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a8 = pb0.m9462a(j12);
        boolean z17 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O12 = ir1Var.m6869O();
        if (z17 || objM6869O12 == i50Var) {
            ec0 ec0Var8 = new ec0((byte) 10);
            ec0Var8.f17959b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O12 = s94.m10566b(ec0Var8);
            ir1Var.m6905n0(objM6869O12);
        }
        bp4 bp4Var3 = bp4VarM13688t3;
        bp4 bp4VarM13688t4 = zp0.m13688t(dp4Var, pb0VarM9462a7, pb0VarM9462a8, (ag1) nq1Var.invoke(((xb4) objM6869O12).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var4, ir1Var, i7);
        dc0 dc0Var9 = (dc0) d83Var.getValue();
        ir1Var.m6885d0(1510356562);
        long j13 = dc0Var9.f16968y;
        ir1Var.m6912r(false);
        lc0 lc0VarM9467f5 = pb0.m9467f(j13);
        boolean zM6890g5 = ir1Var.m6890g(lc0VarM9467f5);
        Object objM6869O13 = ir1Var.m6869O();
        if (zM6890g5 || objM6869O13 == i50Var) {
            objM6869O13 = d55.m4364i(lc0VarM9467f5, c1035pi, ir1Var);
        }
        sq4 sq4Var5 = (sq4) objM6869O13;
        if (dp4Var.m4648j()) {
            bp4VarM13688t4 = bp4VarM13688t4;
            sq4Var5 = sq4Var5;
            z4 = false;
            objM4366k5 = d55.m4366k(ir1Var, 1666827533, false, zh0Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z18 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4366k5 = ir1Var.m6869O();
            if (z18 || objM4366k5 == i50Var) {
                e94 e94VarM5353c4 = ev0.m5353c0();
                yp1 yp1VarMo3783e5 = e94VarM5353c4 != null ? e94VarM5353c4.mo3783e() : null;
                e94 e94VarM5361k4 = ev0.m5361k0(e94VarM5353c4);
                try {
                    Object objMo11188l5 = zh0Var.mo11188l();
                    ev0.m5370t0(e94VarM5353c4, e94VarM5361k4, yp1VarMo3783e5);
                    ir1Var.m6905n0(objMo11188l5);
                    objM4366k5 = objMo11188l5;
                } catch (Throwable th5) {
                    ev0.m5370t0(e94VarM5353c4, e94VarM5361k4, yp1VarMo3783e5);
                    throw th5;
                }
            }
            z4 = false;
            ir1Var.m6912r(false);
        }
        ir1Var.m6885d0(1510356562);
        long j14 = ((dc0) objM4366k5).f16968y;
        ir1Var.m6912r(z4);
        pb0 pb0VarM9462a9 = pb0.m9462a(j14);
        boolean z19 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O14 = ir1Var.m6869O();
        if (z19 || objM6869O14 == i50Var) {
            ec0 ec0Var9 = new ec0((byte) 11);
            ec0Var9.f17959b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O14 = s94.m10566b(ec0Var9);
            ir1Var.m6905n0(objM6869O14);
        }
        dc0 dc0Var10 = (dc0) ((xb4) objM6869O14).getValue();
        ir1Var.m6885d0(1510356562);
        long j15 = dc0Var10.f16968y;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a10 = pb0.m9462a(j15);
        boolean z20 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O15 = ir1Var.m6869O();
        if (z20 || objM6869O15 == i50Var) {
            ec0 ec0Var10 = new ec0((byte) 0);
            ec0Var10.f17959b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O15 = s94.m10566b(ec0Var10);
            ir1Var.m6905n0(objM6869O15);
        }
        ag1 ag1Var2 = (ag1) nq1Var.invoke(((xb4) objM6869O15).getValue(), ir1Var, Integer.valueOf(i6));
        bp4 bp4Var4 = bp4VarM13688t4;
        bp4 bp4VarM13688t5 = zp0.m13688t(dp4Var, pb0VarM9462a9, pb0VarM9462a10, ag1Var2, sq4Var5, ir1Var, i7);
        dc0 dc0Var11 = (dc0) d83Var.getValue();
        ir1Var.m6885d0(1963578419);
        long j16 = dc0Var11.f16969z;
        ir1Var.m6912r(false);
        lc0 lc0VarM9467f6 = pb0.m9467f(j16);
        boolean zM6890g6 = ir1Var.m6890g(lc0VarM9467f6);
        Object objM6869O16 = ir1Var.m6869O();
        if (zM6890g6 || objM6869O16 == i50Var) {
            objM6869O16 = d55.m4364i(lc0VarM9467f6, c1035pi, ir1Var);
        }
        sq4 sq4Var6 = (sq4) objM6869O16;
        if (dp4Var.m4648j()) {
            z5 = false;
            objM4366k6 = d55.m4366k(ir1Var, 1666827533, false, zh0Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z21 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            Object objM6869O17 = ir1Var.m6869O();
            if (z21 || objM6869O17 == i50Var) {
                e94 e94VarM5353c5 = ev0.m5353c0();
                yp1 yp1VarMo3783e6 = e94VarM5353c5 != null ? e94VarM5353c5.mo3783e() : null;
                e94 e94VarM5361k5 = ev0.m5361k0(e94VarM5353c5);
                try {
                    Object objMo11188l6 = zh0Var.mo11188l();
                    ev0.m5370t0(e94VarM5353c5, e94VarM5361k5, yp1VarMo3783e6);
                    ir1Var.m6905n0(objMo11188l6);
                    objM6869O17 = objMo11188l6;
                } catch (Throwable th6) {
                    ev0.m5370t0(e94VarM5353c5, e94VarM5361k5, yp1VarMo3783e6);
                    throw th6;
                }
            }
            ir1Var.m6912r(false);
            objM4366k6 = objM6869O17;
            z5 = false;
        }
        ir1Var.m6885d0(1963578419);
        long j17 = ((dc0) objM4366k6).f16969z;
        ir1Var.m6912r(z5);
        pb0 pb0VarM9462a11 = pb0.m9462a(j17);
        boolean z22 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O18 = ir1Var.m6869O();
        if (z22 || objM6869O18 == i50Var) {
            ec0 ec0Var11 = new ec0((byte) 1);
            ec0Var11.f17959b = dp4Var;
            VarHandle.storeStoreFence();
            objM10566b = s94.m10566b(ec0Var11);
            ir1Var.m6905n0(objM10566b);
        } else {
            objM10566b = objM6869O18;
        }
        dc0 dc0Var12 = (dc0) ((xb4) objM10566b).getValue();
        ir1Var.m6885d0(1963578419);
        long j18 = dc0Var12.f16969z;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a12 = pb0.m9462a(j18);
        boolean z23 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O19 = ir1Var.m6869O();
        if (z23 || objM6869O19 == i50Var) {
            ec0 ec0Var12 = new ec0((byte) 2);
            ec0Var12.f17959b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O19 = s94.m10566b(ec0Var12);
            ir1Var.m6905n0(objM6869O19);
        }
        return kx5.m7694Y(pb0.m9462a(((pb0) bp4Var.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) bp4Var2.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) bp4Var3.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) bp4Var4.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) bp4VarM13688t5.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) zp0.m13688t(dp4Var, pb0VarM9462a11, pb0VarM9462a12, (ag1) nq1Var.invoke(((xb4) objM6869O19).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var6, ir1Var, i7).f15494j.getValue()).f27503a));
    }

    public static final dc0 animateColorScheme(dc0 dc0Var, nq1 nq1Var, String str, mi0 mi0Var, int i, int i2) {
        Object objM4366k;
        Object objM4366k2;
        Object objM4366k3;
        Object objM4366k4;
        Object objM4366k5;
        boolean z;
        Object objM4366k6;
        boolean z2;
        Object objM4366k7;
        boolean z3;
        Object objM4366k8;
        boolean z4;
        Object objM4366k9;
        nq1 fh0Var = (i2 & 2) != 0 ? new fh0((byte) 4) : nq1Var;
        dp4 dp4VarM13668T = zp0.m13668T(dc0Var, (i2 & 4) != 0 ? "ColorSchemeAnimation" : str, mi0Var, (i & 14) | ((i >> 3) & 112), 0);
        d83 d83Var = dp4VarM13668T.f17261d;
        zh0 zh0Var = dp4VarM13668T.f17258a;
        int i3 = i & 112;
        C1035pi c1035pi = C1035pi.f27617o;
        int i4 = 384 | i3;
        dc0 dc0Var2 = (dc0) d83Var.getValue();
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6885d0(999586274);
        long j = dc0Var2.f16940a;
        ir1Var.m6912r(false);
        lc0 lc0VarM9467f = pb0.m9467f(j);
        boolean zM6890g = ir1Var.m6890g(lc0VarM9467f);
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (zM6890g || objM6869O == i50Var) {
            objM6869O = d55.m4364i(lc0VarM9467f, c1035pi, ir1Var);
        }
        sq4 sq4Var = (sq4) objM6869O;
        int i5 = 3;
        int i6 = ((i4 << 3) & 896) | 3072;
        if (dp4VarM13668T.m4648j()) {
            i5 = 3;
            objM4366k = d55.m4366k(ir1Var, 1666827533, false, zh0Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean zM6890g2 = ir1Var.m6890g(dp4VarM13668T);
            objM4366k = ir1Var.m6869O();
            if (zM6890g2 || objM4366k == i50Var) {
                e94 e94VarM5353c0 = ev0.m5353c0();
                yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
                e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
                try {
                    Object objMo11188l = zh0Var.mo11188l();
                    ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                    ir1Var.m6905n0(objMo11188l);
                    objM4366k = objMo11188l;
                } catch (Throwable th) {
                    ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                    throw th;
                }
            }
            ir1Var.m6912r(false);
        }
        ir1Var.m6885d0(999586274);
        long j2 = ((dc0) objM4366k).f16940a;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a = pb0.m9462a(j2);
        boolean zM6890g3 = ir1Var.m6890g(dp4VarM13668T);
        Object objM6869O2 = ir1Var.m6869O();
        if (zM6890g3 || objM6869O2 == i50Var) {
            fc0 fc0Var = new fc0((byte) 7);
            fc0Var.f18900b = dp4VarM13668T;
            VarHandle.storeStoreFence();
            objM6869O2 = s94.m10566b(fc0Var);
            ir1Var.m6905n0(objM6869O2);
        }
        dc0 dc0Var3 = (dc0) ((xb4) objM6869O2).getValue();
        ir1Var.m6885d0(999586274);
        long j3 = dc0Var3.f16940a;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a2 = pb0.m9462a(j3);
        boolean zM6890g4 = ir1Var.m6890g(dp4VarM13668T);
        Object objM6869O3 = ir1Var.m6869O();
        if (zM6890g4 || objM6869O3 == i50Var) {
            fc0 fc0Var2 = new fc0((byte) 8);
            fc0Var2.f18900b = dp4VarM13668T;
            VarHandle.storeStoreFence();
            objM6869O3 = s94.m10566b(fc0Var2);
            ir1Var.m6905n0(objM6869O3);
        }
        Object value = ((xb4) objM6869O3).getValue();
        int i7 = (i6 >> 3) & 112;
        bp4 bp4VarM13688t = zp0.m13688t(dp4VarM13668T, pb0VarM9462a, pb0VarM9462a2, (ag1) fh0Var.invoke(value, ir1Var, Integer.valueOf(i7)), sq4Var, ir1Var, 196608);
        dc0 dc0Var4 = (dc0) d83Var.getValue();
        ir1Var.m6885d0(-543523325);
        long j4 = dc0Var4.f16942b;
        ir1Var.m6912r(false);
        lc0 lc0VarM9467f2 = pb0.m9467f(j4);
        boolean zM6890g5 = ir1Var.m6890g(lc0VarM9467f2);
        Object objM6869O4 = ir1Var.m6869O();
        if (zM6890g5 || objM6869O4 == i50Var) {
            objM6869O4 = d55.m4364i(lc0VarM9467f2, c1035pi, ir1Var);
        }
        sq4 sq4Var2 = (sq4) objM6869O4;
        if (dp4VarM13668T.m4648j()) {
            objM4366k2 = d55.m4366k(ir1Var, 1666827533, false, zh0Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean zM6890g6 = ir1Var.m6890g(dp4VarM13668T);
            objM4366k2 = ir1Var.m6869O();
            if (zM6890g6 || objM4366k2 == i50Var) {
                e94 e94VarM5353c1 = ev0.m5353c0();
                yp1 yp1VarMo3783e2 = e94VarM5353c1 != null ? e94VarM5353c1.mo3783e() : null;
                e94 e94VarM5361k1 = ev0.m5361k0(e94VarM5353c1);
                try {
                    Object objMo11188l2 = zh0Var.mo11188l();
                    ev0.m5370t0(e94VarM5353c1, e94VarM5361k1, yp1VarMo3783e2);
                    ir1Var.m6905n0(objMo11188l2);
                    objM4366k2 = objMo11188l2;
                } catch (Throwable th2) {
                    ev0.m5370t0(e94VarM5353c1, e94VarM5361k1, yp1VarMo3783e2);
                    throw th2;
                }
            }
            ir1Var.m6912r(false);
        }
        ir1Var.m6885d0(-543523325);
        long j5 = ((dc0) objM4366k2).f16942b;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a3 = pb0.m9462a(j5);
        boolean zM6890g7 = ir1Var.m6890g(dp4VarM13668T);
        Object objM6869O5 = ir1Var.m6869O();
        if (zM6890g7 || objM6869O5 == i50Var) {
            fc0 fc0Var3 = new fc0((byte) 9);
            fc0Var3.f18900b = dp4VarM13668T;
            VarHandle.storeStoreFence();
            objM6869O5 = s94.m10566b(fc0Var3);
            ir1Var.m6905n0(objM6869O5);
        }
        dc0 dc0Var5 = (dc0) ((xb4) objM6869O5).getValue();
        ir1Var.m6885d0(-543523325);
        long j6 = dc0Var5.f16942b;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a4 = pb0.m9462a(j6);
        boolean zM6890g8 = ir1Var.m6890g(dp4VarM13668T);
        Object objM6869O6 = ir1Var.m6869O();
        if (zM6890g8 || objM6869O6 == i50Var) {
            fc0 fc0Var4 = new fc0((byte) 10);
            fc0Var4.f18900b = dp4VarM13668T;
            VarHandle.storeStoreFence();
            objM6869O6 = s94.m10566b(fc0Var4);
            ir1Var.m6905n0(objM6869O6);
        }
        bp4 bp4VarM13688t2 = zp0.m13688t(dp4VarM13668T, pb0VarM9462a3, pb0VarM9462a4, (ag1) fh0Var.invoke(((xb4) objM6869O6).getValue(), ir1Var, Integer.valueOf(i7)), sq4Var2, ir1Var, 196608);
        dc0 dc0Var6 = (dc0) d83Var.getValue();
        ir1Var.m6885d0(-158641333);
        long j7 = dc0Var6.f16944c;
        ir1Var.m6912r(false);
        lc0 lc0VarM9467f3 = pb0.m9467f(j7);
        boolean zM6890g9 = ir1Var.m6890g(lc0VarM9467f3);
        Object objM6869O7 = ir1Var.m6869O();
        if (zM6890g9 || objM6869O7 == i50Var) {
            objM6869O7 = d55.m4364i(lc0VarM9467f3, c1035pi, ir1Var);
        }
        sq4 sq4Var3 = (sq4) objM6869O7;
        if (dp4VarM13668T.m4648j()) {
            objM4366k3 = d55.m4366k(ir1Var, 1666827533, false, zh0Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean zM6890g10 = ir1Var.m6890g(dp4VarM13668T);
            objM4366k3 = ir1Var.m6869O();
            if (zM6890g10 || objM4366k3 == i50Var) {
                e94 e94VarM5353c2 = ev0.m5353c0();
                yp1 yp1VarMo3783e3 = e94VarM5353c2 != null ? e94VarM5353c2.mo3783e() : null;
                e94 e94VarM5361k2 = ev0.m5361k0(e94VarM5353c2);
                try {
                    Object objMo11188l3 = zh0Var.mo11188l();
                    ev0.m5370t0(e94VarM5353c2, e94VarM5361k2, yp1VarMo3783e3);
                    ir1Var.m6905n0(objMo11188l3);
                    objM4366k3 = objMo11188l3;
                } catch (Throwable th3) {
                    ev0.m5370t0(e94VarM5353c2, e94VarM5361k2, yp1VarMo3783e3);
                    throw th3;
                }
            }
            ir1Var.m6912r(false);
        }
        ir1Var.m6885d0(-158641333);
        long j8 = ((dc0) objM4366k3).f16944c;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a5 = pb0.m9462a(j8);
        boolean zM6890g11 = ir1Var.m6890g(dp4VarM13668T);
        Object objM6869O8 = ir1Var.m6869O();
        if (zM6890g11 || objM6869O8 == i50Var) {
            fc0 fc0Var5 = new fc0((byte) 11);
            fc0Var5.f18900b = dp4VarM13668T;
            VarHandle.storeStoreFence();
            objM6869O8 = s94.m10566b(fc0Var5);
            ir1Var.m6905n0(objM6869O8);
        }
        dc0 dc0Var7 = (dc0) ((xb4) objM6869O8).getValue();
        ir1Var.m6885d0(-158641333);
        long j9 = dc0Var7.f16944c;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a6 = pb0.m9462a(j9);
        boolean zM6890g12 = ir1Var.m6890g(dp4VarM13668T);
        Object objM6869O9 = ir1Var.m6869O();
        if (zM6890g12 || objM6869O9 == i50Var) {
            fc0 fc0Var6 = new fc0((byte) 12);
            fc0Var6.f18900b = dp4VarM13668T;
            VarHandle.storeStoreFence();
            objM6869O9 = s94.m10566b(fc0Var6);
            ir1Var.m6905n0(objM6869O9);
        }
        bp4 bp4VarM13688t3 = zp0.m13688t(dp4VarM13668T, pb0VarM9462a5, pb0VarM9462a6, (ag1) fh0Var.invoke(((xb4) objM6869O9).getValue(), ir1Var, Integer.valueOf(i7)), sq4Var3, ir1Var, 196608);
        dc0 dc0Var8 = (dc0) d83Var.getValue();
        ir1Var.m6885d0(478241866);
        long j10 = dc0Var8.f16946d;
        ir1Var.m6912r(false);
        lc0 lc0VarM9467f4 = pb0.m9467f(j10);
        boolean zM6890g13 = ir1Var.m6890g(lc0VarM9467f4);
        Object objM6869O10 = ir1Var.m6869O();
        if (zM6890g13 || objM6869O10 == i50Var) {
            objM6869O10 = d55.m4364i(lc0VarM9467f4, c1035pi, ir1Var);
        }
        sq4 sq4Var4 = (sq4) objM6869O10;
        if (dp4VarM13668T.m4648j()) {
            objM4366k4 = d55.m4366k(ir1Var, 1666827533, false, zh0Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean zM6890g14 = ir1Var.m6890g(dp4VarM13668T);
            objM4366k4 = ir1Var.m6869O();
            if (zM6890g14 || objM4366k4 == i50Var) {
                e94 e94VarM5353c3 = ev0.m5353c0();
                yp1 yp1VarMo3783e4 = e94VarM5353c3 != null ? e94VarM5353c3.mo3783e() : null;
                e94 e94VarM5361k3 = ev0.m5361k0(e94VarM5353c3);
                try {
                    Object objMo11188l4 = zh0Var.mo11188l();
                    ev0.m5370t0(e94VarM5353c3, e94VarM5361k3, yp1VarMo3783e4);
                    ir1Var.m6905n0(objMo11188l4);
                    objM4366k4 = objMo11188l4;
                } catch (Throwable th4) {
                    ev0.m5370t0(e94VarM5353c3, e94VarM5361k3, yp1VarMo3783e4);
                    throw th4;
                }
            }
            ir1Var.m6912r(false);
        }
        ir1Var.m6885d0(478241866);
        long j11 = ((dc0) objM4366k4).f16946d;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a7 = pb0.m9462a(j11);
        boolean zM6890g15 = ir1Var.m6890g(dp4VarM13668T);
        Object objM6869O11 = ir1Var.m6869O();
        if (zM6890g15 || objM6869O11 == i50Var) {
            fc0 fc0Var7 = new fc0((byte) 13);
            fc0Var7.f18900b = dp4VarM13668T;
            VarHandle.storeStoreFence();
            objM6869O11 = s94.m10566b(fc0Var7);
            ir1Var.m6905n0(objM6869O11);
        }
        dc0 dc0Var9 = (dc0) ((xb4) objM6869O11).getValue();
        ir1Var.m6885d0(478241866);
        long j12 = dc0Var9.f16946d;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a8 = pb0.m9462a(j12);
        boolean zM6890g16 = ir1Var.m6890g(dp4VarM13668T);
        Object objM6869O12 = ir1Var.m6869O();
        if (zM6890g16 || objM6869O12 == i50Var) {
            fc0 fc0Var8 = new fc0((byte) 14);
            fc0Var8.f18900b = dp4VarM13668T;
            VarHandle.storeStoreFence();
            objM6869O12 = s94.m10566b(fc0Var8);
            ir1Var.m6905n0(objM6869O12);
        }
        bp4 bp4VarM13688t4 = zp0.m13688t(dp4VarM13668T, pb0VarM9462a7, pb0VarM9462a8, (ag1) fh0Var.invoke(((xb4) objM6869O12).getValue(), ir1Var, Integer.valueOf(i7)), sq4Var4, ir1Var, 196608);
        dc0 dc0Var10 = (dc0) d83Var.getValue();
        ir1Var.m6885d0(-314960546);
        long j13 = dc0Var10.f16948e;
        ir1Var.m6912r(false);
        lc0 lc0VarM9467f5 = pb0.m9467f(j13);
        boolean zM6890g17 = ir1Var.m6890g(lc0VarM9467f5);
        Object objM6869O13 = ir1Var.m6869O();
        if (zM6890g17 || objM6869O13 == i50Var) {
            objM6869O13 = d55.m4364i(lc0VarM9467f5, c1035pi, ir1Var);
        }
        sq4 sq4Var5 = (sq4) objM6869O13;
        if (dp4VarM13668T.m4648j()) {
            objM4366k5 = d55.m4366k(ir1Var, 1666827533, false, zh0Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean zM6890g18 = ir1Var.m6890g(dp4VarM13668T);
            objM4366k5 = ir1Var.m6869O();
            if (zM6890g18 || objM4366k5 == i50Var) {
                e94 e94VarM5353c4 = ev0.m5353c0();
                yp1 yp1VarMo3783e5 = e94VarM5353c4 != null ? e94VarM5353c4.mo3783e() : null;
                e94 e94VarM5361k4 = ev0.m5361k0(e94VarM5353c4);
                try {
                    Object objMo11188l5 = zh0Var.mo11188l();
                    ev0.m5370t0(e94VarM5353c4, e94VarM5361k4, yp1VarMo3783e5);
                    ir1Var.m6905n0(objMo11188l5);
                    objM4366k5 = objMo11188l5;
                } catch (Throwable th5) {
                    ev0.m5370t0(e94VarM5353c4, e94VarM5361k4, yp1VarMo3783e5);
                    throw th5;
                }
            }
            ir1Var.m6912r(false);
        }
        ir1Var.m6885d0(-314960546);
        long j14 = ((dc0) objM4366k5).f16948e;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a9 = pb0.m9462a(j14);
        boolean zM6890g19 = ir1Var.m6890g(dp4VarM13668T);
        Object objM6869O14 = ir1Var.m6869O();
        if (zM6890g19 || objM6869O14 == i50Var) {
            fc0 fc0Var9 = new fc0((byte) 15);
            fc0Var9.f18900b = dp4VarM13668T;
            VarHandle.storeStoreFence();
            objM6869O14 = s94.m10566b(fc0Var9);
            ir1Var.m6905n0(objM6869O14);
        }
        dc0 dc0Var11 = (dc0) ((xb4) objM6869O14).getValue();
        ir1Var.m6885d0(-314960546);
        long j15 = dc0Var11.f16948e;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a10 = pb0.m9462a(j15);
        boolean zM6890g20 = ir1Var.m6890g(dp4VarM13668T);
        Object objM6869O15 = ir1Var.m6869O();
        if (zM6890g20 || objM6869O15 == i50Var) {
            fc0 fc0Var10 = new fc0((byte) 6);
            fc0Var10.f18900b = dp4VarM13668T;
            VarHandle.storeStoreFence();
            objM6869O15 = s94.m10566b(fc0Var10);
            ir1Var.m6905n0(objM6869O15);
        }
        List listM7694Y = kx5.m7694Y(pb0.m9462a(((pb0) bp4VarM13688t.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) bp4VarM13688t2.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) bp4VarM13688t3.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) bp4VarM13688t4.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) zp0.m13688t(dp4VarM13668T, pb0VarM9462a9, pb0VarM9462a10, (ag1) fh0Var.invoke(((xb4) objM6869O15).getValue(), ir1Var, Integer.valueOf(i7)), sq4Var5, ir1Var, 196608).f15494j.getValue()).f27503a));
        dc0 dc0Var12 = (dc0) d83Var.getValue();
        ir1Var.m6885d0(-864381662);
        long j16 = dc0Var12.f16949f;
        ir1Var.m6912r(false);
        lc0 lc0VarM9467f6 = pb0.m9467f(j16);
        boolean zM6890g21 = ir1Var.m6890g(lc0VarM9467f6);
        Object objM6869O16 = ir1Var.m6869O();
        if (zM6890g21 || objM6869O16 == i50Var) {
            objM6869O16 = d55.m4364i(lc0VarM9467f6, c1035pi, ir1Var);
        }
        sq4 sq4Var6 = (sq4) objM6869O16;
        if (dp4VarM13668T.m4648j()) {
            z = false;
            objM4366k6 = d55.m4366k(ir1Var, 1666827533, false, zh0Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean zM6890g22 = ir1Var.m6890g(dp4VarM13668T);
            objM4366k6 = ir1Var.m6869O();
            if (zM6890g22 || objM4366k6 == i50Var) {
                e94 e94VarM5353c5 = ev0.m5353c0();
                yp1 yp1VarMo3783e6 = e94VarM5353c5 != null ? e94VarM5353c5.mo3783e() : null;
                e94 e94VarM5361k5 = ev0.m5361k0(e94VarM5353c5);
                try {
                    Object objMo11188l6 = zh0Var.mo11188l();
                    ev0.m5370t0(e94VarM5353c5, e94VarM5361k5, yp1VarMo3783e6);
                    ir1Var.m6905n0(objMo11188l6);
                    objM4366k6 = objMo11188l6;
                } catch (Throwable th6) {
                    ev0.m5370t0(e94VarM5353c5, e94VarM5361k5, yp1VarMo3783e6);
                    throw th6;
                }
            }
            z = false;
            ir1Var.m6912r(false);
        }
        ir1Var.m6885d0(-864381662);
        long j17 = ((dc0) objM4366k6).f16949f;
        ir1Var.m6912r(z);
        pb0 pb0VarM9462a11 = pb0.m9462a(j17);
        boolean zM6890g23 = ir1Var.m6890g(dp4VarM13668T);
        Object objM6869O17 = ir1Var.m6869O();
        if (zM6890g23 || objM6869O17 == i50Var) {
            fc0 fc0Var11 = new fc0((byte) 16);
            fc0Var11.f18900b = dp4VarM13668T;
            VarHandle.storeStoreFence();
            objM6869O17 = s94.m10566b(fc0Var11);
            ir1Var.m6905n0(objM6869O17);
        }
        dc0 dc0Var13 = (dc0) ((xb4) objM6869O17).getValue();
        ir1Var.m6885d0(-864381662);
        long j18 = dc0Var13.f16949f;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a12 = pb0.m9462a(j18);
        boolean zM6890g24 = ir1Var.m6890g(dp4VarM13668T);
        Object objM6869O18 = ir1Var.m6869O();
        if (zM6890g24 || objM6869O18 == i50Var) {
            fc0 fc0Var12 = new fc0((byte) 17);
            fc0Var12.f18900b = dp4VarM13668T;
            VarHandle.storeStoreFence();
            objM6869O18 = s94.m10566b(fc0Var12);
            ir1Var.m6905n0(objM6869O18);
        }
        bp4 bp4VarM13688t5 = zp0.m13688t(dp4VarM13668T, pb0VarM9462a11, pb0VarM9462a12, (ag1) fh0Var.invoke(((xb4) objM6869O18).getValue(), ir1Var, Integer.valueOf(i7)), sq4Var6, ir1Var, 196608);
        dc0 dc0Var14 = (dc0) d83Var.getValue();
        ir1Var.m6885d0(934256835);
        long j19 = dc0Var14.f16950g;
        ir1Var.m6912r(false);
        lc0 lc0VarM9467f7 = pb0.m9467f(j19);
        boolean zM6890g25 = ir1Var.m6890g(lc0VarM9467f7);
        Object objM6869O19 = ir1Var.m6869O();
        if (zM6890g25 || objM6869O19 == i50Var) {
            objM6869O19 = d55.m4364i(lc0VarM9467f7, c1035pi, ir1Var);
        }
        sq4 sq4Var7 = (sq4) objM6869O19;
        if (dp4VarM13668T.m4648j()) {
            z2 = false;
            objM4366k7 = d55.m4366k(ir1Var, 1666827533, false, zh0Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean zM6890g26 = ir1Var.m6890g(dp4VarM13668T);
            objM4366k7 = ir1Var.m6869O();
            if (zM6890g26 || objM4366k7 == i50Var) {
                e94 e94VarM5353c6 = ev0.m5353c0();
                yp1 yp1VarMo3783e7 = e94VarM5353c6 != null ? e94VarM5353c6.mo3783e() : null;
                e94 e94VarM5361k6 = ev0.m5361k0(e94VarM5353c6);
                try {
                    Object objMo11188l7 = zh0Var.mo11188l();
                    ev0.m5370t0(e94VarM5353c6, e94VarM5361k6, yp1VarMo3783e7);
                    ir1Var.m6905n0(objMo11188l7);
                    objM4366k7 = objMo11188l7;
                } catch (Throwable th7) {
                    ev0.m5370t0(e94VarM5353c6, e94VarM5361k6, yp1VarMo3783e7);
                    throw th7;
                }
            }
            z2 = false;
            ir1Var.m6912r(false);
        }
        ir1Var.m6885d0(934256835);
        long j20 = ((dc0) objM4366k7).f16950g;
        ir1Var.m6912r(z2);
        pb0 pb0VarM9462a13 = pb0.m9462a(j20);
        boolean zM6890g27 = ir1Var.m6890g(dp4VarM13668T);
        Object objM6869O20 = ir1Var.m6869O();
        if (zM6890g27 || objM6869O20 == i50Var) {
            fc0 fc0Var13 = new fc0((byte) 18);
            fc0Var13.f18900b = dp4VarM13668T;
            VarHandle.storeStoreFence();
            objM6869O20 = s94.m10566b(fc0Var13);
            ir1Var.m6905n0(objM6869O20);
        }
        dc0 dc0Var15 = (dc0) ((xb4) objM6869O20).getValue();
        ir1Var.m6885d0(934256835);
        long j21 = dc0Var15.f16950g;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a14 = pb0.m9462a(j21);
        boolean zM6890g28 = ir1Var.m6890g(dp4VarM13668T);
        Object objM6869O21 = ir1Var.m6869O();
        if (zM6890g28 || objM6869O21 == i50Var) {
            fc0 fc0Var14 = new fc0((byte) 19);
            fc0Var14.f18900b = dp4VarM13668T;
            VarHandle.storeStoreFence();
            objM6869O21 = s94.m10566b(fc0Var14);
            ir1Var.m6905n0(objM6869O21);
        }
        bp4 bp4VarM13688t6 = zp0.m13688t(dp4VarM13668T, pb0VarM9462a13, pb0VarM9462a14, (ag1) fh0Var.invoke(((xb4) objM6869O21).getValue(), ir1Var, Integer.valueOf(i7)), sq4Var7, ir1Var, 196608);
        dc0 dc0Var16 = (dc0) d83Var.getValue();
        ir1Var.m6885d0(765186471);
        long j22 = dc0Var16.f16951h;
        ir1Var.m6912r(false);
        lc0 lc0VarM9467f8 = pb0.m9467f(j22);
        boolean zM6890g29 = ir1Var.m6890g(lc0VarM9467f8);
        Object objM6869O22 = ir1Var.m6869O();
        if (zM6890g29 || objM6869O22 == i50Var) {
            objM6869O22 = d55.m4364i(lc0VarM9467f8, c1035pi, ir1Var);
        }
        sq4 sq4Var8 = (sq4) objM6869O22;
        if (dp4VarM13668T.m4648j()) {
            z3 = false;
            objM4366k8 = d55.m4366k(ir1Var, 1666827533, false, zh0Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean zM6890g30 = ir1Var.m6890g(dp4VarM13668T);
            objM4366k8 = ir1Var.m6869O();
            if (zM6890g30 || objM4366k8 == i50Var) {
                e94 e94VarM5353c7 = ev0.m5353c0();
                yp1 yp1VarMo3783e8 = e94VarM5353c7 != null ? e94VarM5353c7.mo3783e() : null;
                e94 e94VarM5361k7 = ev0.m5361k0(e94VarM5353c7);
                try {
                    Object objMo11188l8 = zh0Var.mo11188l();
                    ev0.m5370t0(e94VarM5353c7, e94VarM5361k7, yp1VarMo3783e8);
                    ir1Var.m6905n0(objMo11188l8);
                    objM4366k8 = objMo11188l8;
                } catch (Throwable th8) {
                    ev0.m5370t0(e94VarM5353c7, e94VarM5361k7, yp1VarMo3783e8);
                    throw th8;
                }
            }
            z3 = false;
            ir1Var.m6912r(false);
        }
        ir1Var.m6885d0(765186471);
        long j23 = ((dc0) objM4366k8).f16951h;
        ir1Var.m6912r(z3);
        pb0 pb0VarM9462a15 = pb0.m9462a(j23);
        boolean zM6890g31 = ir1Var.m6890g(dp4VarM13668T);
        Object objM6869O23 = ir1Var.m6869O();
        if (zM6890g31 || objM6869O23 == i50Var) {
            fc0 fc0Var15 = new fc0((byte) 20);
            fc0Var15.f18900b = dp4VarM13668T;
            VarHandle.storeStoreFence();
            objM6869O23 = s94.m10566b(fc0Var15);
            ir1Var.m6905n0(objM6869O23);
        }
        dc0 dc0Var17 = (dc0) ((xb4) objM6869O23).getValue();
        ir1Var.m6885d0(765186471);
        long j24 = dc0Var17.f16951h;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a16 = pb0.m9462a(j24);
        boolean zM6890g32 = ir1Var.m6890g(dp4VarM13668T);
        Object objM6869O24 = ir1Var.m6869O();
        if (zM6890g32 || objM6869O24 == i50Var) {
            fc0 fc0Var16 = new fc0((byte) 21);
            fc0Var16.f18900b = dp4VarM13668T;
            VarHandle.storeStoreFence();
            objM6869O24 = s94.m10566b(fc0Var16);
            ir1Var.m6905n0(objM6869O24);
        }
        bp4 bp4VarM13688t7 = zp0.m13688t(dp4VarM13668T, pb0VarM9462a15, pb0VarM9462a16, (ag1) fh0Var.invoke(((xb4) objM6869O24).getValue(), ir1Var, Integer.valueOf(i7)), sq4Var8, ir1Var, 196608);
        dc0 dc0Var18 = (dc0) d83Var.getValue();
        ir1Var.m6885d0(1477659430);
        long j25 = dc0Var18.f16952i;
        ir1Var.m6912r(false);
        lc0 lc0VarM9467f9 = pb0.m9467f(j25);
        boolean zM6890g33 = ir1Var.m6890g(lc0VarM9467f9);
        Object objM6869O25 = ir1Var.m6869O();
        if (zM6890g33 || objM6869O25 == i50Var) {
            objM6869O25 = d55.m4364i(lc0VarM9467f9, c1035pi, ir1Var);
        }
        sq4 sq4Var9 = (sq4) objM6869O25;
        if (dp4VarM13668T.m4648j()) {
            z4 = false;
            objM4366k9 = d55.m4366k(ir1Var, 1666827533, false, zh0Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean zM6890g34 = ir1Var.m6890g(dp4VarM13668T);
            Object objM6869O26 = ir1Var.m6869O();
            if (zM6890g34 || objM6869O26 == i50Var) {
                e94 e94VarM5353c8 = ev0.m5353c0();
                yp1 yp1VarMo3783e9 = e94VarM5353c8 != null ? e94VarM5353c8.mo3783e() : null;
                e94 e94VarM5361k8 = ev0.m5361k0(e94VarM5353c8);
                try {
                    Object objMo11188l9 = zh0Var.mo11188l();
                    ev0.m5370t0(e94VarM5353c8, e94VarM5361k8, yp1VarMo3783e9);
                    ir1Var.m6905n0(objMo11188l9);
                    objM6869O26 = objMo11188l9;
                } catch (Throwable th9) {
                    ev0.m5370t0(e94VarM5353c8, e94VarM5361k8, yp1VarMo3783e9);
                    throw th9;
                }
            }
            ir1Var.m6912r(false);
            Object obj = objM6869O26;
            z4 = false;
            objM4366k9 = obj;
        }
        ir1Var.m6885d0(1477659430);
        long j26 = ((dc0) objM4366k9).f16952i;
        ir1Var.m6912r(z4);
        pb0 pb0VarM9462a17 = pb0.m9462a(j26);
        boolean zM6890g35 = ir1Var.m6890g(dp4VarM13668T);
        Object objM6869O27 = ir1Var.m6869O();
        if (zM6890g35 || objM6869O27 == i50Var) {
            fc0 fc0Var17 = new fc0((byte) 22);
            fc0Var17.f18900b = dp4VarM13668T;
            VarHandle.storeStoreFence();
            objM6869O27 = s94.m10566b(fc0Var17);
            ir1Var.m6905n0(objM6869O27);
        }
        dc0 dc0Var19 = (dc0) ((xb4) objM6869O27).getValue();
        ir1Var.m6885d0(1477659430);
        long j27 = dc0Var19.f16952i;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a18 = pb0.m9462a(j27);
        boolean zM6890g36 = ir1Var.m6890g(dp4VarM13668T);
        Object objM6869O28 = ir1Var.m6869O();
        if (zM6890g36 || objM6869O28 == i50Var) {
            fc0 fc0Var18 = new fc0((byte) 23);
            fc0Var18.f18900b = dp4VarM13668T;
            VarHandle.storeStoreFence();
            objM6869O28 = s94.m10566b(fc0Var18);
            ir1Var.m6905n0(objM6869O28);
        }
        List listM7694Y2 = kx5.m7694Y(pb0.m9462a(((pb0) bp4VarM13688t5.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) bp4VarM13688t6.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) bp4VarM13688t7.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) zp0.m13688t(dp4VarM13668T, pb0VarM9462a17, pb0VarM9462a18, (ag1) fh0Var.invoke(((xb4) objM6869O28).getValue(), ir1Var, Integer.valueOf(i7)), sq4Var9, ir1Var, 196608).f15494j.getValue()).f27503a));
        List listM4100p = m4100p(dp4VarM13668T, fh0Var, mi0Var, i3);
        List listM4093i = m4093i(dp4VarM13668T, fh0Var, mi0Var, i3);
        List listM4085a = m4085a(dp4VarM13668T, fh0Var, mi0Var, i3);
        List listM4101q = m4101q(dp4VarM13668T, fh0Var, mi0Var, i3);
        List listM4086b = m4086b(dp4VarM13668T, fh0Var, mi0Var, i3);
        return new dc0(((pb0) listM7694Y.get(0)).f27503a, ((pb0) listM7694Y.get(1)).f27503a, ((pb0) listM7694Y.get(2)).f27503a, ((pb0) listM7694Y.get(i5)).f27503a, ((pb0) listM7694Y.get(4)).f27503a, ((pb0) listM7694Y2.get(0)).f27503a, ((pb0) listM7694Y2.get(1)).f27503a, ((pb0) listM7694Y2.get(2)).f27503a, ((pb0) listM7694Y2.get(3)).f27503a, ((pb0) listM4100p.get(0)).f27503a, ((pb0) listM4100p.get(1)).f27503a, ((pb0) listM4100p.get(2)).f27503a, ((pb0) listM4100p.get(3)).f27503a, ((pb0) listM4085a.get(0)).f27503a, ((pb0) listM4085a.get(1)).f27503a, ((pb0) listM4093i.get(0)).f27503a, ((pb0) listM4093i.get(1)).f27503a, ((pb0) listM4093i.get(2)).f27503a, ((pb0) listM4093i.get(3)).f27503a, ((pb0) listM4093i.get(4)).f27503a, ((pb0) listM4101q.get(0)).f27503a, ((pb0) listM4101q.get(1)).f27503a, ((pb0) listM4085a.get(2)).f27503a, ((pb0) listM4085a.get(3)).f27503a, ((pb0) listM4085a.get(4)).f27503a, ((pb0) listM4085a.get(5)).f27503a, ((pb0) listM4101q.get(2)).f27503a, ((pb0) listM4101q.get(3)).f27503a, ((pb0) listM4101q.get(4)).f27503a, ((pb0) listM4093i.get(5)).f27503a, ((pb0) listM4093i.get(6)).f27503a, ((pb0) listM4093i.get(7)).f27503a, ((pb0) listM4093i.get(8)).f27503a, ((pb0) listM4093i.get(9)).f27503a, ((pb0) listM4093i.get(10)).f27503a, ((pb0) listM4093i.get(11)).f27503a, ((pb0) listM4086b.get(0)).f27503a, ((pb0) listM4086b.get(1)).f27503a, ((pb0) listM4086b.get(2)).f27503a, ((pb0) listM4086b.get(3)).f27503a, ((pb0) listM4086b.get(4)).f27503a, ((pb0) listM4086b.get(5)).f27503a, ((pb0) listM4086b.get(6)).f27503a, ((pb0) listM4086b.get(7)).f27503a, ((pb0) listM4086b.get(8)).f27503a, ((pb0) listM4086b.get(9)).f27503a, ((pb0) listM4086b.get(10)).f27503a, ((pb0) listM4086b.get(11)).f27503a);
    }

    /* JADX INFO: renamed from: b */
    public static final List m4086b(dp4 dp4Var, nq1 nq1Var, mi0 mi0Var, int i) {
        Object objM4365j;
        Object objM4365j2;
        boolean z;
        Object objM10566b;
        Object objM4365j3;
        boolean z2;
        Object objM10566b2;
        Object objM4365j4;
        Object objM4365j5;
        Object objM4365j6;
        Object objM4365j7;
        Object objM4365j8;
        Object objM4365j9;
        Object objM4365j10;
        Object objM4365j11;
        Object objM4365j12;
        C1035pi c1035pi = C1035pi.f27617o;
        int i2 = (i & 14) | 384 | (i & 112);
        dc0 dc0Var = (dc0) dp4Var.m4646h();
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6885d0(705124748);
        long j = dc0Var.f16924K;
        ir1Var.m6915u();
        lc0 lc0VarM9467f = pb0.m9467f(j);
        boolean zM6890g = ir1Var.m6890g(lc0VarM9467f);
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (zM6890g || objM6869O == i50Var) {
            objM6869O = d55.m4364i(lc0VarM9467f, c1035pi, ir1Var);
        }
        sq4 sq4Var = (sq4) objM6869O;
        int i3 = ((i2 << 3) & 896) | (i2 & 14) | 3072;
        if (dp4Var.m4648j()) {
            objM4365j = d55.m4365j(ir1Var, 1666827533, dp4Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z3 = (((i3 & 14) ^ 6) > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4365j = ir1Var.m6869O();
            if (z3 || objM4365j == i50Var) {
                e94 e94VarM5353c0 = ev0.m5353c0();
                yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
                e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
                try {
                    Object objM4642d = dp4Var.m4642d();
                    ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                    ir1Var.m6905n0(objM4642d);
                    objM4365j = objM4642d;
                } catch (Throwable th) {
                    ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                    throw th;
                }
            }
            ir1Var.m6915u();
        }
        ir1Var.m6885d0(705124748);
        long j2 = ((dc0) objM4365j).f16924K;
        ir1Var.m6915u();
        pb0 pb0VarM9462a = pb0.m9462a(j2);
        int i4 = i3 & 14;
        int i5 = i4 ^ 6;
        boolean z4 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O2 = ir1Var.m6869O();
        if (z4 || objM6869O2 == i50Var) {
            objM6869O2 = s94.m10566b(new ec0(dp4Var, (byte) 22));
            ir1Var.m6905n0(objM6869O2);
        }
        dc0 dc0Var2 = (dc0) ((xb4) objM6869O2).getValue();
        ir1Var.m6885d0(705124748);
        long j3 = dc0Var2.f16924K;
        ir1Var.m6915u();
        pb0 pb0VarM9462a2 = pb0.m9462a(j3);
        boolean z5 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O3 = ir1Var.m6869O();
        if (z5 || objM6869O3 == i50Var) {
            objM6869O3 = s94.m10566b(new ec0(dp4Var, (byte) 28));
            ir1Var.m6905n0(objM6869O3);
        }
        Object value = ((xb4) objM6869O3).getValue();
        int i6 = (i3 >> 3) & 112;
        int i7 = i4 | 196608;
        bp4 bp4VarM13688t = zp0.m13688t(dp4Var, pb0VarM9462a, pb0VarM9462a2, (ag1) nq1Var.invoke(value, ir1Var, Integer.valueOf(i6)), sq4Var, ir1Var, i7);
        dc0 dc0Var3 = (dc0) dp4Var.m4646h();
        ir1Var.m6885d0(-1062804668);
        long j4 = dc0Var3.f16925L;
        ir1Var.m6915u();
        lc0 lc0VarM9467f2 = pb0.m9467f(j4);
        boolean zM6890g2 = ir1Var.m6890g(lc0VarM9467f2);
        Object objM6869O4 = ir1Var.m6869O();
        if (zM6890g2 || objM6869O4 == i50Var) {
            objM6869O4 = d55.m4364i(lc0VarM9467f2, c1035pi, ir1Var);
        }
        sq4 sq4Var2 = (sq4) objM6869O4;
        if (dp4Var.m4648j()) {
            objM4365j2 = d55.m4365j(ir1Var, 1666827533, dp4Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z6 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4365j2 = ir1Var.m6869O();
            if (z6 || objM4365j2 == i50Var) {
                e94 e94VarM5353c1 = ev0.m5353c0();
                yp1 yp1VarMo3783e2 = e94VarM5353c1 != null ? e94VarM5353c1.mo3783e() : null;
                e94 e94VarM5361k1 = ev0.m5361k0(e94VarM5353c1);
                try {
                    Object objM4642d2 = dp4Var.m4642d();
                    ev0.m5370t0(e94VarM5353c1, e94VarM5361k1, yp1VarMo3783e2);
                    ir1Var.m6905n0(objM4642d2);
                    objM4365j2 = objM4642d2;
                } catch (Throwable th2) {
                    ev0.m5370t0(e94VarM5353c1, e94VarM5361k1, yp1VarMo3783e2);
                    throw th2;
                }
            }
            ir1Var.m6915u();
        }
        ir1Var.m6885d0(-1062804668);
        long j5 = ((dc0) objM4365j2).f16925L;
        ir1Var.m6915u();
        pb0 pb0VarM9462a3 = pb0.m9462a(j5);
        boolean z7 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O5 = ir1Var.m6869O();
        if (z7 || objM6869O5 == i50Var) {
            objM6869O5 = s94.m10566b(new ec0(dp4Var, (byte) 29));
            ir1Var.m6905n0(objM6869O5);
        }
        dc0 dc0Var4 = (dc0) ((xb4) objM6869O5).getValue();
        ir1Var.m6885d0(-1062804668);
        long j6 = dc0Var4.f16925L;
        ir1Var.m6915u();
        pb0 pb0VarM9462a4 = pb0.m9462a(j6);
        boolean z8 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O6 = ir1Var.m6869O();
        if (z8 || objM6869O6 == i50Var) {
            z = false;
            objM10566b = s94.m10566b(new fc0(dp4Var, (byte) 0));
            ir1Var.m6905n0(objM10566b);
        } else {
            objM10566b = objM6869O6;
            z = false;
        }
        bp4 bp4VarM13688t2 = zp0.m13688t(dp4Var, pb0VarM9462a3, pb0VarM9462a4, (ag1) nq1Var.invoke(((xb4) objM10566b).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var2, ir1Var, i7);
        dc0 dc0Var5 = (dc0) dp4Var.m4646h();
        ir1Var.m6885d0(-1037969973);
        long j7 = dc0Var5.f16926M;
        ir1Var.m6915u();
        lc0 lc0VarM9467f3 = pb0.m9467f(j7);
        boolean zM6890g3 = ir1Var.m6890g(lc0VarM9467f3);
        Object objM6869O7 = ir1Var.m6869O();
        if (zM6890g3 || objM6869O7 == i50Var) {
            objM6869O7 = d55.m4364i(lc0VarM9467f3, c1035pi, ir1Var);
        }
        sq4 sq4Var3 = (sq4) objM6869O7;
        if (dp4Var.m4648j()) {
            objM4365j3 = d55.m4365j(ir1Var, 1666827533, dp4Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z9 = ((i5 <= 4 || !ir1Var.m6890g(dp4Var)) && (i3 & 6) != 4) ? z : true;
            objM4365j3 = ir1Var.m6869O();
            if (z9 || objM4365j3 == i50Var) {
                e94 e94VarM5353c2 = ev0.m5353c0();
                yp1 yp1VarMo3783e3 = e94VarM5353c2 != null ? e94VarM5353c2.mo3783e() : null;
                e94 e94VarM5361k2 = ev0.m5361k0(e94VarM5353c2);
                try {
                    Object objM4642d3 = dp4Var.m4642d();
                    ev0.m5370t0(e94VarM5353c2, e94VarM5361k2, yp1VarMo3783e3);
                    ir1Var.m6905n0(objM4642d3);
                    objM4365j3 = objM4642d3;
                } catch (Throwable th3) {
                    ev0.m5370t0(e94VarM5353c2, e94VarM5361k2, yp1VarMo3783e3);
                    throw th3;
                }
            }
            ir1Var.m6915u();
        }
        ir1Var.m6885d0(-1037969973);
        long j8 = ((dc0) objM4365j3).f16926M;
        ir1Var.m6915u();
        pb0 pb0VarM9462a5 = pb0.m9462a(j8);
        boolean z10 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O8 = ir1Var.m6869O();
        if (z10 || objM6869O8 == i50Var) {
            z2 = true;
            objM10566b2 = s94.m10566b(new fc0(dp4Var, (byte) 1));
            ir1Var.m6905n0(objM10566b2);
        } else {
            objM10566b2 = objM6869O8;
            z2 = true;
        }
        dc0 dc0Var6 = (dc0) ((xb4) objM10566b2).getValue();
        ir1Var.m6885d0(-1037969973);
        long j9 = dc0Var6.f16926M;
        ir1Var.m6915u();
        pb0 pb0VarM9462a6 = pb0.m9462a(j9);
        boolean z11 = ((i5 <= 4 || !ir1Var.m6890g(dp4Var)) && (i3 & 6) != 4) ? false : z2;
        Object objM6869O9 = ir1Var.m6869O();
        if (z11 || objM6869O9 == i50Var) {
            objM6869O9 = s94.m10566b(new fc0(dp4Var, (byte) 2));
            ir1Var.m6905n0(objM6869O9);
        }
        bp4 bp4VarM13688t3 = zp0.m13688t(dp4Var, pb0VarM9462a5, pb0VarM9462a6, (ag1) nq1Var.invoke(((xb4) objM6869O9).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var3, ir1Var, i7);
        dc0 dc0Var7 = (dc0) dp4Var.m4646h();
        ir1Var.m6885d0(-1429178142);
        long j10 = dc0Var7.f16927N;
        ir1Var.m6915u();
        lc0 lc0VarM9467f4 = pb0.m9467f(j10);
        boolean zM6890g4 = ir1Var.m6890g(lc0VarM9467f4);
        Object objM6869O10 = ir1Var.m6869O();
        if (zM6890g4 || objM6869O10 == i50Var) {
            objM6869O10 = d55.m4364i(lc0VarM9467f4, c1035pi, ir1Var);
        }
        sq4 sq4Var4 = (sq4) objM6869O10;
        if (dp4Var.m4648j()) {
            objM4365j4 = d55.m4365j(ir1Var, 1666827533, dp4Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z12 = ((i5 <= 4 || !ir1Var.m6890g(dp4Var)) && (i3 & 6) != 4) ? false : z2;
            objM4365j4 = ir1Var.m6869O();
            if (z12 || objM4365j4 == i50Var) {
                e94 e94VarM5353c3 = ev0.m5353c0();
                yp1 yp1VarMo3783e4 = e94VarM5353c3 != null ? e94VarM5353c3.mo3783e() : null;
                e94 e94VarM5361k3 = ev0.m5361k0(e94VarM5353c3);
                try {
                    Object objM4642d4 = dp4Var.m4642d();
                    ev0.m5370t0(e94VarM5353c3, e94VarM5361k3, yp1VarMo3783e4);
                    ir1Var.m6905n0(objM4642d4);
                    objM4365j4 = objM4642d4;
                } catch (Throwable th4) {
                    ev0.m5370t0(e94VarM5353c3, e94VarM5361k3, yp1VarMo3783e4);
                    throw th4;
                }
            }
            ir1Var.m6915u();
        }
        ir1Var.m6885d0(-1429178142);
        long j11 = ((dc0) objM4365j4).f16927N;
        ir1Var.m6915u();
        pb0 pb0VarM9462a7 = pb0.m9462a(j11);
        boolean z13 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O11 = ir1Var.m6869O();
        if (z13 || objM6869O11 == i50Var) {
            objM6869O11 = s94.m10566b(new fc0(dp4Var, (byte) 3));
            ir1Var.m6905n0(objM6869O11);
        }
        dc0 dc0Var8 = (dc0) ((xb4) objM6869O11).getValue();
        ir1Var.m6885d0(-1429178142);
        long j12 = dc0Var8.f16927N;
        ir1Var.m6915u();
        pb0 pb0VarM9462a8 = pb0.m9462a(j12);
        boolean z14 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O12 = ir1Var.m6869O();
        if (z14 || objM6869O12 == i50Var) {
            objM6869O12 = s94.m10566b(new fc0(dp4Var, (byte) 4));
            ir1Var.m6905n0(objM6869O12);
        }
        bp4 bp4VarM13688t4 = zp0.m13688t(dp4Var, pb0VarM9462a7, pb0VarM9462a8, (ag1) nq1Var.invoke(((xb4) objM6869O12).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var4, ir1Var, i7);
        dc0 dc0Var9 = (dc0) dp4Var.m4646h();
        ir1Var.m6885d0(-489786278);
        long j13 = dc0Var9.f16928O;
        ir1Var.m6915u();
        lc0 lc0VarM9467f5 = pb0.m9467f(j13);
        boolean zM6890g5 = ir1Var.m6890g(lc0VarM9467f5);
        Object objM6869O13 = ir1Var.m6869O();
        if (zM6890g5 || objM6869O13 == i50Var) {
            objM6869O13 = d55.m4364i(lc0VarM9467f5, c1035pi, ir1Var);
        }
        sq4 sq4Var5 = (sq4) objM6869O13;
        if (dp4Var.m4648j()) {
            objM4365j5 = d55.m4365j(ir1Var, 1666827533, dp4Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z15 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4365j5 = ir1Var.m6869O();
            if (z15 || objM4365j5 == i50Var) {
                e94 e94VarM5353c4 = ev0.m5353c0();
                yp1 yp1VarMo3783e5 = e94VarM5353c4 != null ? e94VarM5353c4.mo3783e() : null;
                e94 e94VarM5361k4 = ev0.m5361k0(e94VarM5353c4);
                try {
                    Object objM4642d5 = dp4Var.m4642d();
                    ev0.m5370t0(e94VarM5353c4, e94VarM5361k4, yp1VarMo3783e5);
                    ir1Var.m6905n0(objM4642d5);
                    objM4365j5 = objM4642d5;
                } catch (Throwable th5) {
                    ev0.m5370t0(e94VarM5353c4, e94VarM5361k4, yp1VarMo3783e5);
                    throw th5;
                }
            }
            ir1Var.m6915u();
        }
        ir1Var.m6885d0(-489786278);
        long j14 = ((dc0) objM4365j5).f16928O;
        ir1Var.m6915u();
        pb0 pb0VarM9462a9 = pb0.m9462a(j14);
        boolean z16 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O14 = ir1Var.m6869O();
        if (z16 || objM6869O14 == i50Var) {
            objM6869O14 = s94.m10566b(new fc0(dp4Var, (byte) 5));
            ir1Var.m6905n0(objM6869O14);
        }
        dc0 dc0Var10 = (dc0) ((xb4) objM6869O14).getValue();
        ir1Var.m6885d0(-489786278);
        long j15 = dc0Var10.f16928O;
        ir1Var.m6915u();
        pb0 pb0VarM9462a10 = pb0.m9462a(j15);
        boolean z17 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O15 = ir1Var.m6869O();
        if (z17 || objM6869O15 == i50Var) {
            objM6869O15 = s94.m10566b(new ec0(dp4Var, (byte) 12));
            ir1Var.m6905n0(objM6869O15);
        }
        bp4 bp4VarM13688t5 = zp0.m13688t(dp4Var, pb0VarM9462a9, pb0VarM9462a10, (ag1) nq1Var.invoke(((xb4) objM6869O15).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var5, ir1Var, i7);
        dc0 dc0Var11 = (dc0) dp4Var.m4646h();
        ir1Var.m6885d0(-1968230986);
        long j16 = dc0Var11.f16929P;
        ir1Var.m6915u();
        lc0 lc0VarM9467f6 = pb0.m9467f(j16);
        boolean zM6890g6 = ir1Var.m6890g(lc0VarM9467f6);
        Object objM6869O16 = ir1Var.m6869O();
        if (zM6890g6 || objM6869O16 == i50Var) {
            objM6869O16 = d55.m4364i(lc0VarM9467f6, c1035pi, ir1Var);
        }
        sq4 sq4Var6 = (sq4) objM6869O16;
        if (dp4Var.m4648j()) {
            sq4Var6 = sq4Var6;
            objM4365j6 = d55.m4365j(ir1Var, 1666827533, dp4Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z18 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4365j6 = ir1Var.m6869O();
            if (z18 || objM4365j6 == i50Var) {
                e94 e94VarM5353c5 = ev0.m5353c0();
                yp1 yp1VarMo3783e6 = e94VarM5353c5 != null ? e94VarM5353c5.mo3783e() : null;
                e94 e94VarM5361k5 = ev0.m5361k0(e94VarM5353c5);
                try {
                    Object objM4642d6 = dp4Var.m4642d();
                    ev0.m5370t0(e94VarM5353c5, e94VarM5361k5, yp1VarMo3783e6);
                    ir1Var.m6905n0(objM4642d6);
                    objM4365j6 = objM4642d6;
                } catch (Throwable th6) {
                    ev0.m5370t0(e94VarM5353c5, e94VarM5361k5, yp1VarMo3783e6);
                    throw th6;
                }
            }
            ir1Var.m6915u();
        }
        ir1Var.m6885d0(-1968230986);
        long j17 = ((dc0) objM4365j6).f16929P;
        ir1Var.m6915u();
        pb0 pb0VarM9462a11 = pb0.m9462a(j17);
        boolean z19 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O17 = ir1Var.m6869O();
        if (z19 || objM6869O17 == i50Var) {
            objM6869O17 = s94.m10566b(new ec0(dp4Var, (byte) 13));
            ir1Var.m6905n0(objM6869O17);
        }
        dc0 dc0Var12 = (dc0) ((xb4) objM6869O17).getValue();
        ir1Var.m6885d0(-1968230986);
        long j18 = dc0Var12.f16929P;
        ir1Var.m6915u();
        pb0 pb0VarM9462a12 = pb0.m9462a(j18);
        boolean z20 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O18 = ir1Var.m6869O();
        if (z20 || objM6869O18 == i50Var) {
            objM6869O18 = s94.m10566b(new ec0(dp4Var, (byte) 14));
            ir1Var.m6905n0(objM6869O18);
        }
        bp4 bp4VarM13688t6 = zp0.m13688t(dp4Var, pb0VarM9462a11, pb0VarM9462a12, (ag1) nq1Var.invoke(((xb4) objM6869O18).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var6, ir1Var, i7);
        dc0 dc0Var13 = (dc0) dp4Var.m4646h();
        ir1Var.m6885d0(-566567719);
        long j19 = dc0Var13.f16930Q;
        ir1Var.m6915u();
        lc0 lc0VarM9467f7 = pb0.m9467f(j19);
        boolean zM6890g7 = ir1Var.m6890g(lc0VarM9467f7);
        Object objM6869O19 = ir1Var.m6869O();
        if (zM6890g7 || objM6869O19 == i50Var) {
            objM6869O19 = d55.m4364i(lc0VarM9467f7, c1035pi, ir1Var);
        }
        sq4 sq4Var7 = (sq4) objM6869O19;
        if (dp4Var.m4648j()) {
            bp4VarM13688t6 = bp4VarM13688t6;
            sq4Var7 = sq4Var7;
            objM4365j7 = d55.m4365j(ir1Var, 1666827533, dp4Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z21 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4365j7 = ir1Var.m6869O();
            if (z21 || objM4365j7 == i50Var) {
                e94 e94VarM5353c6 = ev0.m5353c0();
                yp1 yp1VarMo3783e7 = e94VarM5353c6 != null ? e94VarM5353c6.mo3783e() : null;
                e94 e94VarM5361k6 = ev0.m5361k0(e94VarM5353c6);
                try {
                    Object objM4642d7 = dp4Var.m4642d();
                    ev0.m5370t0(e94VarM5353c6, e94VarM5361k6, yp1VarMo3783e7);
                    ir1Var.m6905n0(objM4642d7);
                    objM4365j7 = objM4642d7;
                } catch (Throwable th7) {
                    ev0.m5370t0(e94VarM5353c6, e94VarM5361k6, yp1VarMo3783e7);
                    throw th7;
                }
            }
            ir1Var.m6915u();
        }
        ir1Var.m6885d0(-566567719);
        long j20 = ((dc0) objM4365j7).f16930Q;
        ir1Var.m6915u();
        pb0 pb0VarM9462a13 = pb0.m9462a(j20);
        boolean z22 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O20 = ir1Var.m6869O();
        if (z22 || objM6869O20 == i50Var) {
            objM6869O20 = s94.m10566b(new ec0(dp4Var, (byte) 15));
            ir1Var.m6905n0(objM6869O20);
        }
        dc0 dc0Var14 = (dc0) ((xb4) objM6869O20).getValue();
        ir1Var.m6885d0(-566567719);
        long j21 = dc0Var14.f16930Q;
        ir1Var.m6915u();
        pb0 pb0VarM9462a14 = pb0.m9462a(j21);
        boolean z23 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O21 = ir1Var.m6869O();
        if (z23 || objM6869O21 == i50Var) {
            objM6869O21 = s94.m10566b(new ec0(dp4Var, (byte) 16));
            ir1Var.m6905n0(objM6869O21);
        }
        bp4 bp4Var = bp4VarM13688t6;
        bp4 bp4VarM13688t7 = zp0.m13688t(dp4Var, pb0VarM9462a13, pb0VarM9462a14, (ag1) nq1Var.invoke(((xb4) objM6869O21).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var7, ir1Var, i7);
        dc0 dc0Var15 = (dc0) dp4Var.m4646h();
        ir1Var.m6885d0(1193412116);
        long j22 = dc0Var15.f16931R;
        ir1Var.m6915u();
        lc0 lc0VarM9467f8 = pb0.m9467f(j22);
        boolean zM6890g8 = ir1Var.m6890g(lc0VarM9467f8);
        Object objM6869O22 = ir1Var.m6869O();
        if (zM6890g8 || objM6869O22 == i50Var) {
            objM6869O22 = d55.m4364i(lc0VarM9467f8, c1035pi, ir1Var);
        }
        sq4 sq4Var8 = (sq4) objM6869O22;
        if (dp4Var.m4648j()) {
            sq4Var8 = sq4Var8;
            objM4365j8 = d55.m4365j(ir1Var, 1666827533, dp4Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z24 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4365j8 = ir1Var.m6869O();
            if (z24 || objM4365j8 == i50Var) {
                e94 e94VarM5353c7 = ev0.m5353c0();
                yp1 yp1VarMo3783e8 = e94VarM5353c7 != null ? e94VarM5353c7.mo3783e() : null;
                e94 e94VarM5361k7 = ev0.m5361k0(e94VarM5353c7);
                try {
                    Object objM4642d8 = dp4Var.m4642d();
                    ev0.m5370t0(e94VarM5353c7, e94VarM5361k7, yp1VarMo3783e8);
                    ir1Var.m6905n0(objM4642d8);
                    objM4365j8 = objM4642d8;
                } catch (Throwable th8) {
                    ev0.m5370t0(e94VarM5353c7, e94VarM5361k7, yp1VarMo3783e8);
                    throw th8;
                }
            }
            ir1Var.m6915u();
        }
        ir1Var.m6885d0(1193412116);
        long j23 = ((dc0) objM4365j8).f16931R;
        ir1Var.m6915u();
        pb0 pb0VarM9462a15 = pb0.m9462a(j23);
        boolean z25 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O23 = ir1Var.m6869O();
        if (z25 || objM6869O23 == i50Var) {
            objM6869O23 = s94.m10566b(new ec0(dp4Var, (byte) 17));
            ir1Var.m6905n0(objM6869O23);
        }
        dc0 dc0Var16 = (dc0) ((xb4) objM6869O23).getValue();
        ir1Var.m6885d0(1193412116);
        long j24 = dc0Var16.f16931R;
        ir1Var.m6915u();
        pb0 pb0VarM9462a16 = pb0.m9462a(j24);
        boolean z26 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O24 = ir1Var.m6869O();
        if (z26 || objM6869O24 == i50Var) {
            objM6869O24 = s94.m10566b(new ec0(dp4Var, (byte) 18));
            ir1Var.m6905n0(objM6869O24);
        }
        bp4 bp4VarM13688t8 = zp0.m13688t(dp4Var, pb0VarM9462a15, pb0VarM9462a16, (ag1) nq1Var.invoke(((xb4) objM6869O24).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var8, ir1Var, i7);
        dc0 dc0Var17 = (dc0) dp4Var.m4646h();
        ir1Var.m6885d0(426203248);
        long j25 = dc0Var17.f16932S;
        ir1Var.m6915u();
        lc0 lc0VarM9467f9 = pb0.m9467f(j25);
        boolean zM6890g9 = ir1Var.m6890g(lc0VarM9467f9);
        Object objM6869O25 = ir1Var.m6869O();
        if (zM6890g9 || objM6869O25 == i50Var) {
            objM6869O25 = d55.m4364i(lc0VarM9467f9, c1035pi, ir1Var);
        }
        sq4 sq4Var9 = (sq4) objM6869O25;
        if (dp4Var.m4648j()) {
            sq4Var9 = sq4Var9;
            objM4365j9 = d55.m4365j(ir1Var, 1666827533, dp4Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z27 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4365j9 = ir1Var.m6869O();
            if (z27 || objM4365j9 == i50Var) {
                e94 e94VarM5353c8 = ev0.m5353c0();
                yp1 yp1VarMo3783e9 = e94VarM5353c8 != null ? e94VarM5353c8.mo3783e() : null;
                e94 e94VarM5361k8 = ev0.m5361k0(e94VarM5353c8);
                try {
                    Object objM4642d9 = dp4Var.m4642d();
                    ev0.m5370t0(e94VarM5353c8, e94VarM5361k8, yp1VarMo3783e9);
                    ir1Var.m6905n0(objM4642d9);
                    objM4365j9 = objM4642d9;
                } catch (Throwable th9) {
                    ev0.m5370t0(e94VarM5353c8, e94VarM5361k8, yp1VarMo3783e9);
                    throw th9;
                }
            }
            ir1Var.m6915u();
        }
        ir1Var.m6885d0(426203248);
        long j26 = ((dc0) objM4365j9).f16932S;
        ir1Var.m6915u();
        pb0 pb0VarM9462a17 = pb0.m9462a(j26);
        boolean z28 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O26 = ir1Var.m6869O();
        if (z28 || objM6869O26 == i50Var) {
            objM6869O26 = s94.m10566b(new ec0(dp4Var, (byte) 19));
            ir1Var.m6905n0(objM6869O26);
        }
        dc0 dc0Var18 = (dc0) ((xb4) objM6869O26).getValue();
        ir1Var.m6885d0(426203248);
        long j27 = dc0Var18.f16932S;
        ir1Var.m6915u();
        pb0 pb0VarM9462a18 = pb0.m9462a(j27);
        boolean z29 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O27 = ir1Var.m6869O();
        if (z29 || objM6869O27 == i50Var) {
            objM6869O27 = s94.m10566b(new ec0(dp4Var, (byte) 20));
            ir1Var.m6905n0(objM6869O27);
        }
        bp4 bp4VarM13688t9 = zp0.m13688t(dp4Var, pb0VarM9462a17, pb0VarM9462a18, (ag1) nq1Var.invoke(((xb4) objM6869O27).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var9, ir1Var, i7);
        dc0 dc0Var19 = (dc0) dp4Var.m4646h();
        ir1Var.m6885d0(348506592);
        long j28 = dc0Var19.f16933T;
        ir1Var.m6915u();
        lc0 lc0VarM9467f10 = pb0.m9467f(j28);
        boolean zM6890g10 = ir1Var.m6890g(lc0VarM9467f10);
        Object objM6869O28 = ir1Var.m6869O();
        if (zM6890g10 || objM6869O28 == i50Var) {
            objM6869O28 = d55.m4364i(lc0VarM9467f10, c1035pi, ir1Var);
        }
        sq4 sq4Var10 = (sq4) objM6869O28;
        if (dp4Var.m4648j()) {
            sq4Var10 = sq4Var10;
            objM4365j10 = d55.m4365j(ir1Var, 1666827533, dp4Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z30 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4365j10 = ir1Var.m6869O();
            if (z30 || objM4365j10 == i50Var) {
                e94 e94VarM5353c9 = ev0.m5353c0();
                yp1 yp1VarMo3783e10 = e94VarM5353c9 != null ? e94VarM5353c9.mo3783e() : null;
                e94 e94VarM5361k9 = ev0.m5361k0(e94VarM5353c9);
                try {
                    Object objM4642d10 = dp4Var.m4642d();
                    ev0.m5370t0(e94VarM5353c9, e94VarM5361k9, yp1VarMo3783e10);
                    ir1Var.m6905n0(objM4642d10);
                    objM4365j10 = objM4642d10;
                } catch (Throwable th10) {
                    ev0.m5370t0(e94VarM5353c9, e94VarM5361k9, yp1VarMo3783e10);
                    throw th10;
                }
            }
            ir1Var.m6915u();
        }
        ir1Var.m6885d0(348506592);
        long j29 = ((dc0) objM4365j10).f16933T;
        ir1Var.m6915u();
        pb0 pb0VarM9462a19 = pb0.m9462a(j29);
        boolean z31 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O29 = ir1Var.m6869O();
        if (z31 || objM6869O29 == i50Var) {
            objM6869O29 = s94.m10566b(new ec0(dp4Var, (byte) 21));
            ir1Var.m6905n0(objM6869O29);
        }
        dc0 dc0Var20 = (dc0) ((xb4) objM6869O29).getValue();
        ir1Var.m6885d0(348506592);
        long j30 = dc0Var20.f16933T;
        ir1Var.m6915u();
        pb0 pb0VarM9462a20 = pb0.m9462a(j30);
        boolean z32 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O30 = ir1Var.m6869O();
        if (z32 || objM6869O30 == i50Var) {
            objM6869O30 = s94.m10566b(new ec0(dp4Var, (byte) 23));
            ir1Var.m6905n0(objM6869O30);
        }
        bp4 bp4VarM13688t10 = zp0.m13688t(dp4Var, pb0VarM9462a19, pb0VarM9462a20, (ag1) nq1Var.invoke(((xb4) objM6869O30).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var10, ir1Var, i7);
        dc0 dc0Var21 = (dc0) dp4Var.m4646h();
        ir1Var.m6885d0(-2070125551);
        long j31 = dc0Var21.f16934U;
        ir1Var.m6915u();
        lc0 lc0VarM9467f11 = pb0.m9467f(j31);
        boolean zM6890g11 = ir1Var.m6890g(lc0VarM9467f11);
        Object objM6869O31 = ir1Var.m6869O();
        if (zM6890g11 || objM6869O31 == i50Var) {
            objM6869O31 = d55.m4364i(lc0VarM9467f11, c1035pi, ir1Var);
        }
        sq4 sq4Var11 = (sq4) objM6869O31;
        if (dp4Var.m4648j()) {
            sq4Var11 = sq4Var11;
            objM4365j11 = d55.m4365j(ir1Var, 1666827533, dp4Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z33 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4365j11 = ir1Var.m6869O();
            if (z33 || objM4365j11 == i50Var) {
                e94 e94VarM5353c10 = ev0.m5353c0();
                yp1 yp1VarMo3783e11 = e94VarM5353c10 != null ? e94VarM5353c10.mo3783e() : null;
                e94 e94VarM5361k10 = ev0.m5361k0(e94VarM5353c10);
                try {
                    Object objM4642d11 = dp4Var.m4642d();
                    ev0.m5370t0(e94VarM5353c10, e94VarM5361k10, yp1VarMo3783e11);
                    ir1Var.m6905n0(objM4642d11);
                    objM4365j11 = objM4642d11;
                } catch (Throwable th11) {
                    ev0.m5370t0(e94VarM5353c10, e94VarM5361k10, yp1VarMo3783e11);
                    throw th11;
                }
            }
            ir1Var.m6915u();
        }
        ir1Var.m6885d0(-2070125551);
        long j32 = ((dc0) objM4365j11).f16934U;
        ir1Var.m6915u();
        pb0 pb0VarM9462a21 = pb0.m9462a(j32);
        boolean z34 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O32 = ir1Var.m6869O();
        if (z34 || objM6869O32 == i50Var) {
            objM6869O32 = s94.m10566b(new ec0(dp4Var, (byte) 24));
            ir1Var.m6905n0(objM6869O32);
        }
        dc0 dc0Var22 = (dc0) ((xb4) objM6869O32).getValue();
        ir1Var.m6885d0(-2070125551);
        long j33 = dc0Var22.f16934U;
        ir1Var.m6915u();
        pb0 pb0VarM9462a22 = pb0.m9462a(j33);
        boolean z35 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O33 = ir1Var.m6869O();
        if (z35 || objM6869O33 == i50Var) {
            objM6869O33 = s94.m10566b(new ec0(dp4Var, (byte) 25));
            ir1Var.m6905n0(objM6869O33);
        }
        bp4 bp4VarM13688t11 = zp0.m13688t(dp4Var, pb0VarM9462a21, pb0VarM9462a22, (ag1) nq1Var.invoke(((xb4) objM6869O33).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var11, ir1Var, i7);
        dc0 dc0Var23 = (dc0) dp4Var.m4646h();
        ir1Var.m6885d0(1502375900);
        long j34 = dc0Var23.f16935V;
        ir1Var.m6915u();
        lc0 lc0VarM9467f12 = pb0.m9467f(j34);
        boolean zM6890g12 = ir1Var.m6890g(lc0VarM9467f12);
        Object objM6869O34 = ir1Var.m6869O();
        if (zM6890g12 || objM6869O34 == i50Var) {
            objM6869O34 = d55.m4364i(lc0VarM9467f12, c1035pi, ir1Var);
        }
        sq4 sq4Var12 = (sq4) objM6869O34;
        if (dp4Var.m4648j()) {
            objM4365j12 = d55.m4365j(ir1Var, 1666827533, dp4Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z36 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4365j12 = ir1Var.m6869O();
            if (z36 || objM4365j12 == i50Var) {
                e94 e94VarM5353c11 = ev0.m5353c0();
                yp1 yp1VarMo3783e12 = e94VarM5353c11 != null ? e94VarM5353c11.mo3783e() : null;
                e94 e94VarM5361k11 = ev0.m5361k0(e94VarM5353c11);
                try {
                    Object objM4642d12 = dp4Var.m4642d();
                    ev0.m5370t0(e94VarM5353c11, e94VarM5361k11, yp1VarMo3783e12);
                    ir1Var.m6905n0(objM4642d12);
                    objM4365j12 = objM4642d12;
                } catch (Throwable th12) {
                    ev0.m5370t0(e94VarM5353c11, e94VarM5361k11, yp1VarMo3783e12);
                    throw th12;
                }
            }
            ir1Var.m6915u();
        }
        ir1Var.m6885d0(1502375900);
        long j35 = ((dc0) objM4365j12).f16935V;
        ir1Var.m6915u();
        pb0 pb0VarM9462a23 = pb0.m9462a(j35);
        boolean z37 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O35 = ir1Var.m6869O();
        if (z37 || objM6869O35 == i50Var) {
            objM6869O35 = s94.m10566b(new ec0(dp4Var, (byte) 26));
            ir1Var.m6905n0(objM6869O35);
        }
        dc0 dc0Var24 = (dc0) ((xb4) objM6869O35).getValue();
        ir1Var.m6885d0(1502375900);
        long j36 = dc0Var24.f16935V;
        ir1Var.m6915u();
        pb0 pb0VarM9462a24 = pb0.m9462a(j36);
        boolean z38 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O36 = ir1Var.m6869O();
        if (z38 || objM6869O36 == i50Var) {
            objM6869O36 = s94.m10566b(new ec0(dp4Var, (byte) 27));
            ir1Var.m6905n0(objM6869O36);
        }
        return kx5.m7694Y(pb0.m9462a(((pb0) bp4VarM13688t.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) bp4VarM13688t2.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) bp4VarM13688t3.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) bp4VarM13688t4.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) bp4VarM13688t5.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) bp4Var.f15494j.getValue()).f27503a), pb0.m9462a(m4087c(bp4VarM13688t7)), pb0.m9462a(m4088d(bp4VarM13688t8)), pb0.m9462a(m4089e(bp4VarM13688t9)), pb0.m9462a(m4090f(bp4VarM13688t10)), pb0.m9462a(m4091g(bp4VarM13688t11)), pb0.m9462a(m4092h(zp0.m13688t(dp4Var, pb0VarM9462a23, pb0VarM9462a24, (ag1) nq1Var.invoke(((xb4) objM6869O36).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var12, ir1Var, i7))));
    }

    /* JADX INFO: renamed from: c */
    public static final long m4087c(bp4 bp4Var) {
        return ((pb0) bp4Var.f15494j.getValue()).f27503a;
    }

    /* JADX INFO: renamed from: d */
    public static final long m4088d(bp4 bp4Var) {
        return ((pb0) bp4Var.f15494j.getValue()).f27503a;
    }

    /* JADX INFO: renamed from: e */
    public static final long m4089e(bp4 bp4Var) {
        return ((pb0) bp4Var.f15494j.getValue()).f27503a;
    }

    /* JADX INFO: renamed from: f */
    public static final long m4090f(bp4 bp4Var) {
        return ((pb0) bp4Var.f15494j.getValue()).f27503a;
    }

    /* JADX INFO: renamed from: g */
    public static final long m4091g(bp4 bp4Var) {
        return ((pb0) bp4Var.f15494j.getValue()).f27503a;
    }

    /* JADX INFO: renamed from: h */
    public static final long m4092h(bp4 bp4Var) {
        return ((pb0) bp4Var.f15494j.getValue()).f27503a;
    }

    /* JADX INFO: renamed from: i */
    public static final List m4093i(dp4 dp4Var, nq1 nq1Var, mi0 mi0Var, int i) {
        Object objM4365j;
        Object objM4365j2;
        Object objM4365j3;
        Object objM4365j4;
        Object objM4365j5;
        Object objM4365j6;
        Object objM4365j7;
        Object objM4365j8;
        Object objM10566b;
        Object objM4365j9;
        Object objM10566b2;
        Object objM4365j10;
        Object objM4365j11;
        Object objM10566b3;
        Object objM4365j12;
        C1035pi c1035pi = C1035pi.f27617o;
        int i2 = (i & 14) | 384 | (i & 112);
        dc0 dc0Var = (dc0) dp4Var.m4646h();
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6885d0(1645312066);
        long j = dc0Var.f16959p;
        ir1Var.m6915u();
        lc0 lc0VarM9467f = pb0.m9467f(j);
        boolean zM6890g = ir1Var.m6890g(lc0VarM9467f);
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (zM6890g || objM6869O == i50Var) {
            objM6869O = d55.m4364i(lc0VarM9467f, c1035pi, ir1Var);
        }
        sq4 sq4Var = (sq4) objM6869O;
        int i3 = ((i2 << 3) & 896) | (i2 & 14) | 3072;
        if (dp4Var.m4648j()) {
            objM4365j = d55.m4365j(ir1Var, 1666827533, dp4Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z = (((i3 & 14) ^ 6) > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4365j = ir1Var.m6869O();
            if (z || objM4365j == i50Var) {
                e94 e94VarM5353c0 = ev0.m5353c0();
                yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
                e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
                try {
                    Object objM4642d = dp4Var.m4642d();
                    ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                    ir1Var.m6905n0(objM4642d);
                    objM4365j = objM4642d;
                } catch (Throwable th) {
                    ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                    throw th;
                }
            }
            ir1Var.m6915u();
        }
        ir1Var.m6885d0(1645312066);
        long j2 = ((dc0) objM4365j).f16959p;
        ir1Var.m6915u();
        pb0 pb0VarM9462a = pb0.m9462a(j2);
        int i4 = i3 & 14;
        int i5 = i4 ^ 6;
        boolean z2 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O2 = ir1Var.m6869O();
        if (z2 || objM6869O2 == i50Var) {
            objM6869O2 = s94.m10566b(new gc0(dp4Var, (byte) 4));
            ir1Var.m6905n0(objM6869O2);
        }
        dc0 dc0Var2 = (dc0) ((xb4) objM6869O2).getValue();
        ir1Var.m6885d0(1645312066);
        long j3 = dc0Var2.f16959p;
        ir1Var.m6915u();
        pb0 pb0VarM9462a2 = pb0.m9462a(j3);
        boolean z3 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O3 = ir1Var.m6869O();
        if (z3 || objM6869O3 == i50Var) {
            objM6869O3 = s94.m10566b(new gc0(dp4Var, (byte) 10));
            ir1Var.m6905n0(objM6869O3);
        }
        Object value = ((xb4) objM6869O3).getValue();
        int i6 = (i3 >> 3) & 112;
        int i7 = i4 | 196608;
        bp4 bp4VarM13688t = zp0.m13688t(dp4Var, pb0VarM9462a, pb0VarM9462a2, (ag1) nq1Var.invoke(value, ir1Var, Integer.valueOf(i6)), sq4Var, ir1Var, i7);
        dc0 dc0Var3 = (dc0) dp4Var.m4646h();
        ir1Var.m6885d0(102202467);
        long j4 = dc0Var3.f16960q;
        ir1Var.m6915u();
        lc0 lc0VarM9467f2 = pb0.m9467f(j4);
        boolean zM6890g2 = ir1Var.m6890g(lc0VarM9467f2);
        Object objM6869O4 = ir1Var.m6869O();
        if (zM6890g2 || objM6869O4 == i50Var) {
            objM6869O4 = d55.m4364i(lc0VarM9467f2, c1035pi, ir1Var);
        }
        sq4 sq4Var2 = (sq4) objM6869O4;
        if (dp4Var.m4648j()) {
            objM4365j2 = d55.m4365j(ir1Var, 1666827533, dp4Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z4 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4365j2 = ir1Var.m6869O();
            if (z4 || objM4365j2 == i50Var) {
                e94 e94VarM5353c1 = ev0.m5353c0();
                yp1 yp1VarMo3783e2 = e94VarM5353c1 != null ? e94VarM5353c1.mo3783e() : null;
                e94 e94VarM5361k1 = ev0.m5361k0(e94VarM5353c1);
                try {
                    Object objM4642d2 = dp4Var.m4642d();
                    ev0.m5370t0(e94VarM5353c1, e94VarM5361k1, yp1VarMo3783e2);
                    ir1Var.m6905n0(objM4642d2);
                    objM4365j2 = objM4642d2;
                } catch (Throwable th2) {
                    ev0.m5370t0(e94VarM5353c1, e94VarM5361k1, yp1VarMo3783e2);
                    throw th2;
                }
            }
            ir1Var.m6915u();
        }
        ir1Var.m6885d0(102202467);
        long j5 = ((dc0) objM4365j2).f16960q;
        ir1Var.m6915u();
        pb0 pb0VarM9462a3 = pb0.m9462a(j5);
        boolean z5 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O5 = ir1Var.m6869O();
        if (z5 || objM6869O5 == i50Var) {
            objM6869O5 = s94.m10566b(new gc0(dp4Var, (byte) 11));
            ir1Var.m6905n0(objM6869O5);
        }
        dc0 dc0Var4 = (dc0) ((xb4) objM6869O5).getValue();
        ir1Var.m6885d0(102202467);
        long j6 = dc0Var4.f16960q;
        ir1Var.m6915u();
        pb0 pb0VarM9462a4 = pb0.m9462a(j6);
        boolean z6 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O6 = ir1Var.m6869O();
        if (z6 || objM6869O6 == i50Var) {
            objM6869O6 = s94.m10566b(new gc0(dp4Var, (byte) 12));
            ir1Var.m6905n0(objM6869O6);
        }
        bp4 bp4VarM13688t2 = zp0.m13688t(dp4Var, pb0VarM9462a3, pb0VarM9462a4, (ag1) nq1Var.invoke(((xb4) objM6869O6).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var2, ir1Var, i7);
        dc0 dc0Var5 = (dc0) dp4Var.m4646h();
        ir1Var.m6885d0(-835141639);
        long j7 = dc0Var5.f16961r;
        ir1Var.m6915u();
        lc0 lc0VarM9467f3 = pb0.m9467f(j7);
        boolean zM6890g3 = ir1Var.m6890g(lc0VarM9467f3);
        Object objM6869O7 = ir1Var.m6869O();
        if (zM6890g3 || objM6869O7 == i50Var) {
            objM6869O7 = d55.m4364i(lc0VarM9467f3, c1035pi, ir1Var);
        }
        sq4 sq4Var3 = (sq4) objM6869O7;
        if (dp4Var.m4648j()) {
            objM4365j3 = d55.m4365j(ir1Var, 1666827533, dp4Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z7 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4365j3 = ir1Var.m6869O();
            if (z7 || objM4365j3 == i50Var) {
                e94 e94VarM5353c2 = ev0.m5353c0();
                yp1 yp1VarMo3783e3 = e94VarM5353c2 != null ? e94VarM5353c2.mo3783e() : null;
                e94 e94VarM5361k2 = ev0.m5361k0(e94VarM5353c2);
                try {
                    Object objM4642d3 = dp4Var.m4642d();
                    ev0.m5370t0(e94VarM5353c2, e94VarM5361k2, yp1VarMo3783e3);
                    ir1Var.m6905n0(objM4642d3);
                    objM4365j3 = objM4642d3;
                } catch (Throwable th3) {
                    ev0.m5370t0(e94VarM5353c2, e94VarM5361k2, yp1VarMo3783e3);
                    throw th3;
                }
            }
            ir1Var.m6915u();
        }
        ir1Var.m6885d0(-835141639);
        long j8 = ((dc0) objM4365j3).f16961r;
        ir1Var.m6915u();
        pb0 pb0VarM9462a5 = pb0.m9462a(j8);
        boolean z8 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O8 = ir1Var.m6869O();
        if (z8 || objM6869O8 == i50Var) {
            objM6869O8 = s94.m10566b(new gc0(dp4Var, (byte) 13));
            ir1Var.m6905n0(objM6869O8);
        }
        dc0 dc0Var6 = (dc0) ((xb4) objM6869O8).getValue();
        ir1Var.m6885d0(-835141639);
        long j9 = dc0Var6.f16961r;
        ir1Var.m6915u();
        pb0 pb0VarM9462a6 = pb0.m9462a(j9);
        boolean z9 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O9 = ir1Var.m6869O();
        if (z9 || objM6869O9 == i50Var) {
            objM6869O9 = s94.m10566b(new gc0(dp4Var, (byte) 14));
            ir1Var.m6905n0(objM6869O9);
        }
        bp4 bp4VarM13688t3 = zp0.m13688t(dp4Var, pb0VarM9462a5, pb0VarM9462a6, (ag1) nq1Var.invoke(((xb4) objM6869O9).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var3, ir1Var, i7);
        dc0 dc0Var7 = (dc0) dp4Var.m4646h();
        ir1Var.m6885d0(-1607662408);
        long j10 = dc0Var7.f16962s;
        ir1Var.m6915u();
        lc0 lc0VarM9467f4 = pb0.m9467f(j10);
        boolean zM6890g4 = ir1Var.m6890g(lc0VarM9467f4);
        Object objM6869O10 = ir1Var.m6869O();
        if (zM6890g4 || objM6869O10 == i50Var) {
            objM6869O10 = d55.m4364i(lc0VarM9467f4, c1035pi, ir1Var);
        }
        sq4 sq4Var4 = (sq4) objM6869O10;
        if (dp4Var.m4648j()) {
            sq4Var4 = sq4Var4;
            objM4365j4 = d55.m4365j(ir1Var, 1666827533, dp4Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z10 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4365j4 = ir1Var.m6869O();
            if (z10 || objM4365j4 == i50Var) {
                e94 e94VarM5353c3 = ev0.m5353c0();
                yp1 yp1VarMo3783e4 = e94VarM5353c3 != null ? e94VarM5353c3.mo3783e() : null;
                e94 e94VarM5361k3 = ev0.m5361k0(e94VarM5353c3);
                try {
                    Object objM4642d4 = dp4Var.m4642d();
                    ev0.m5370t0(e94VarM5353c3, e94VarM5361k3, yp1VarMo3783e4);
                    ir1Var.m6905n0(objM4642d4);
                    objM4365j4 = objM4642d4;
                } catch (Throwable th4) {
                    ev0.m5370t0(e94VarM5353c3, e94VarM5361k3, yp1VarMo3783e4);
                    throw th4;
                }
            }
            ir1Var.m6915u();
        }
        ir1Var.m6885d0(-1607662408);
        long j11 = ((dc0) objM4365j4).f16962s;
        ir1Var.m6915u();
        pb0 pb0VarM9462a7 = pb0.m9462a(j11);
        boolean z11 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O11 = ir1Var.m6869O();
        if (z11 || objM6869O11 == i50Var) {
            objM6869O11 = s94.m10566b(new gc0(dp4Var, (byte) 15));
            ir1Var.m6905n0(objM6869O11);
        }
        dc0 dc0Var8 = (dc0) ((xb4) objM6869O11).getValue();
        ir1Var.m6885d0(-1607662408);
        long j12 = dc0Var8.f16962s;
        ir1Var.m6915u();
        pb0 pb0VarM9462a8 = pb0.m9462a(j12);
        boolean z12 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O12 = ir1Var.m6869O();
        if (z12 || objM6869O12 == i50Var) {
            objM6869O12 = s94.m10566b(new gc0(dp4Var, (byte) 16));
            ir1Var.m6905n0(objM6869O12);
        }
        bp4 bp4VarM13688t4 = zp0.m13688t(dp4Var, pb0VarM9462a7, pb0VarM9462a8, (ag1) nq1Var.invoke(((xb4) objM6869O12).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var4, ir1Var, i7);
        dc0 dc0Var9 = (dc0) dp4Var.m4646h();
        ir1Var.m6885d0(561656925);
        long j13 = dc0Var9.f16963t;
        ir1Var.m6915u();
        lc0 lc0VarM9467f5 = pb0.m9467f(j13);
        boolean zM6890g5 = ir1Var.m6890g(lc0VarM9467f5);
        Object objM6869O13 = ir1Var.m6869O();
        if (zM6890g5 || objM6869O13 == i50Var) {
            objM6869O13 = d55.m4364i(lc0VarM9467f5, c1035pi, ir1Var);
        }
        sq4 sq4Var5 = (sq4) objM6869O13;
        if (dp4Var.m4648j()) {
            bp4VarM13688t4 = bp4VarM13688t4;
            sq4Var5 = sq4Var5;
            objM4365j5 = d55.m4365j(ir1Var, 1666827533, dp4Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z13 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4365j5 = ir1Var.m6869O();
            if (z13 || objM4365j5 == i50Var) {
                e94 e94VarM5353c4 = ev0.m5353c0();
                yp1 yp1VarMo3783e5 = e94VarM5353c4 != null ? e94VarM5353c4.mo3783e() : null;
                e94 e94VarM5361k4 = ev0.m5361k0(e94VarM5353c4);
                try {
                    Object objM4642d5 = dp4Var.m4642d();
                    ev0.m5370t0(e94VarM5353c4, e94VarM5361k4, yp1VarMo3783e5);
                    ir1Var.m6905n0(objM4642d5);
                    objM4365j5 = objM4642d5;
                } catch (Throwable th5) {
                    ev0.m5370t0(e94VarM5353c4, e94VarM5361k4, yp1VarMo3783e5);
                    throw th5;
                }
            }
            ir1Var.m6915u();
        }
        ir1Var.m6885d0(561656925);
        long j14 = ((dc0) objM4365j5).f16963t;
        ir1Var.m6915u();
        pb0 pb0VarM9462a9 = pb0.m9462a(j14);
        boolean z14 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O14 = ir1Var.m6869O();
        if (z14 || objM6869O14 == i50Var) {
            objM6869O14 = s94.m10566b(new gc0(dp4Var, (byte) 17));
            ir1Var.m6905n0(objM6869O14);
        }
        dc0 dc0Var10 = (dc0) ((xb4) objM6869O14).getValue();
        ir1Var.m6885d0(561656925);
        long j15 = dc0Var10.f16963t;
        ir1Var.m6915u();
        pb0 pb0VarM9462a10 = pb0.m9462a(j15);
        boolean z15 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O15 = ir1Var.m6869O();
        if (z15 || objM6869O15 == i50Var) {
            objM6869O15 = s94.m10566b(new fc0(dp4Var, (byte) 24));
            ir1Var.m6905n0(objM6869O15);
        }
        bp4 bp4Var = bp4VarM13688t4;
        bp4 bp4VarM13688t5 = zp0.m13688t(dp4Var, pb0VarM9462a9, pb0VarM9462a10, (ag1) nq1Var.invoke(((xb4) objM6869O15).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var5, ir1Var, i7);
        dc0 dc0Var11 = (dc0) dp4Var.m4646h();
        ir1Var.m6885d0(1343000860);
        long j16 = dc0Var11.f16917D;
        ir1Var.m6915u();
        lc0 lc0VarM9467f6 = pb0.m9467f(j16);
        boolean zM6890g6 = ir1Var.m6890g(lc0VarM9467f6);
        Object objM6869O16 = ir1Var.m6869O();
        if (zM6890g6 || objM6869O16 == i50Var) {
            objM6869O16 = d55.m4364i(lc0VarM9467f6, c1035pi, ir1Var);
        }
        sq4 sq4Var6 = (sq4) objM6869O16;
        if (dp4Var.m4648j()) {
            bp4VarM13688t5 = bp4VarM13688t5;
            sq4Var6 = sq4Var6;
            objM4365j6 = d55.m4365j(ir1Var, 1666827533, dp4Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z16 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4365j6 = ir1Var.m6869O();
            if (z16 || objM4365j6 == i50Var) {
                e94 e94VarM5353c5 = ev0.m5353c0();
                yp1 yp1VarMo3783e6 = e94VarM5353c5 != null ? e94VarM5353c5.mo3783e() : null;
                e94 e94VarM5361k5 = ev0.m5361k0(e94VarM5353c5);
                try {
                    Object objM4642d6 = dp4Var.m4642d();
                    ev0.m5370t0(e94VarM5353c5, e94VarM5361k5, yp1VarMo3783e6);
                    ir1Var.m6905n0(objM4642d6);
                    objM4365j6 = objM4642d6;
                } catch (Throwable th6) {
                    ev0.m5370t0(e94VarM5353c5, e94VarM5361k5, yp1VarMo3783e6);
                    throw th6;
                }
            }
            ir1Var.m6915u();
        }
        ir1Var.m6885d0(1343000860);
        long j17 = ((dc0) objM4365j6).f16917D;
        ir1Var.m6915u();
        pb0 pb0VarM9462a11 = pb0.m9462a(j17);
        boolean z17 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O17 = ir1Var.m6869O();
        if (z17 || objM6869O17 == i50Var) {
            objM6869O17 = s94.m10566b(new fc0(dp4Var, (byte) 25));
            ir1Var.m6905n0(objM6869O17);
        }
        dc0 dc0Var12 = (dc0) ((xb4) objM6869O17).getValue();
        ir1Var.m6885d0(1343000860);
        long j18 = dc0Var12.f16917D;
        ir1Var.m6915u();
        pb0 pb0VarM9462a12 = pb0.m9462a(j18);
        boolean z18 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O18 = ir1Var.m6869O();
        if (z18 || objM6869O18 == i50Var) {
            objM6869O18 = s94.m10566b(new fc0(dp4Var, (byte) 26));
            ir1Var.m6905n0(objM6869O18);
        }
        ag1 ag1Var = (ag1) nq1Var.invoke(((xb4) objM6869O18).getValue(), ir1Var, Integer.valueOf(i6));
        bp4 bp4Var2 = bp4VarM13688t5;
        bp4 bp4VarM13688t6 = zp0.m13688t(dp4Var, pb0VarM9462a11, pb0VarM9462a12, ag1Var, sq4Var6, ir1Var, i7);
        dc0 dc0Var13 = (dc0) dp4Var.m4646h();
        ir1Var.m6885d0(-495778564);
        long j19 = dc0Var13.f16918E;
        ir1Var.m6915u();
        lc0 lc0VarM9467f7 = pb0.m9467f(j19);
        boolean zM6890g7 = ir1Var.m6890g(lc0VarM9467f7);
        Object objM6869O19 = ir1Var.m6869O();
        if (zM6890g7 || objM6869O19 == i50Var) {
            objM6869O19 = d55.m4364i(lc0VarM9467f7, c1035pi, ir1Var);
        }
        sq4 sq4Var7 = (sq4) objM6869O19;
        if (dp4Var.m4648j()) {
            bp4VarM13688t6 = bp4VarM13688t6;
            sq4Var7 = sq4Var7;
            objM4365j7 = d55.m4365j(ir1Var, 1666827533, dp4Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z19 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4365j7 = ir1Var.m6869O();
            if (z19 || objM4365j7 == i50Var) {
                e94 e94VarM5353c6 = ev0.m5353c0();
                yp1 yp1VarMo3783e7 = e94VarM5353c6 != null ? e94VarM5353c6.mo3783e() : null;
                e94 e94VarM5361k6 = ev0.m5361k0(e94VarM5353c6);
                try {
                    Object objM4642d7 = dp4Var.m4642d();
                    ev0.m5370t0(e94VarM5353c6, e94VarM5361k6, yp1VarMo3783e7);
                    ir1Var.m6905n0(objM4642d7);
                    objM4365j7 = objM4642d7;
                } catch (Throwable th7) {
                    ev0.m5370t0(e94VarM5353c6, e94VarM5361k6, yp1VarMo3783e7);
                    throw th7;
                }
            }
            ir1Var.m6915u();
        }
        ir1Var.m6885d0(-495778564);
        long j20 = ((dc0) objM4365j7).f16918E;
        ir1Var.m6915u();
        pb0 pb0VarM9462a13 = pb0.m9462a(j20);
        boolean z20 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O20 = ir1Var.m6869O();
        if (z20 || objM6869O20 == i50Var) {
            objM6869O20 = s94.m10566b(new fc0(dp4Var, (byte) 27));
            ir1Var.m6905n0(objM6869O20);
        }
        dc0 dc0Var14 = (dc0) ((xb4) objM6869O20).getValue();
        ir1Var.m6885d0(-495778564);
        long j21 = dc0Var14.f16918E;
        ir1Var.m6915u();
        pb0 pb0VarM9462a14 = pb0.m9462a(j21);
        boolean z21 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O21 = ir1Var.m6869O();
        if (z21 || objM6869O21 == i50Var) {
            objM6869O21 = s94.m10566b(new fc0(dp4Var, (byte) 28));
            ir1Var.m6905n0(objM6869O21);
        }
        bp4 bp4Var3 = bp4VarM13688t6;
        bp4 bp4VarM13688t7 = zp0.m13688t(dp4Var, pb0VarM9462a13, pb0VarM9462a14, (ag1) nq1Var.invoke(((xb4) objM6869O21).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var7, ir1Var, i7);
        dc0 dc0Var15 = (dc0) dp4Var.m4646h();
        ir1Var.m6885d0(213451701);
        long j22 = dc0Var15.f16919F;
        ir1Var.m6915u();
        lc0 lc0VarM9467f8 = pb0.m9467f(j22);
        boolean zM6890g8 = ir1Var.m6890g(lc0VarM9467f8);
        Object objM6869O22 = ir1Var.m6869O();
        if (zM6890g8 || objM6869O22 == i50Var) {
            objM6869O22 = d55.m4364i(lc0VarM9467f8, c1035pi, ir1Var);
        }
        sq4 sq4Var8 = (sq4) objM6869O22;
        if (dp4Var.m4648j()) {
            sq4Var8 = sq4Var8;
            objM4365j8 = d55.m4365j(ir1Var, 1666827533, dp4Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z22 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4365j8 = ir1Var.m6869O();
            if (z22 || objM4365j8 == i50Var) {
                e94 e94VarM5353c7 = ev0.m5353c0();
                yp1 yp1VarMo3783e8 = e94VarM5353c7 != null ? e94VarM5353c7.mo3783e() : null;
                e94 e94VarM5361k7 = ev0.m5361k0(e94VarM5353c7);
                try {
                    Object objM4642d8 = dp4Var.m4642d();
                    ev0.m5370t0(e94VarM5353c7, e94VarM5361k7, yp1VarMo3783e8);
                    ir1Var.m6905n0(objM4642d8);
                    objM4365j8 = objM4642d8;
                } catch (Throwable th8) {
                    ev0.m5370t0(e94VarM5353c7, e94VarM5361k7, yp1VarMo3783e8);
                    throw th8;
                }
            }
            ir1Var.m6915u();
        }
        ir1Var.m6885d0(213451701);
        long j23 = ((dc0) objM4365j8).f16919F;
        ir1Var.m6915u();
        pb0 pb0VarM9462a15 = pb0.m9462a(j23);
        boolean z23 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O23 = ir1Var.m6869O();
        if (z23 || objM6869O23 == i50Var) {
            objM6869O23 = s94.m10566b(new fc0(dp4Var, (byte) 29));
            ir1Var.m6905n0(objM6869O23);
        }
        dc0 dc0Var16 = (dc0) ((xb4) objM6869O23).getValue();
        ir1Var.m6885d0(213451701);
        long j24 = dc0Var16.f16919F;
        ir1Var.m6915u();
        pb0 pb0VarM9462a16 = pb0.m9462a(j24);
        boolean z24 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O24 = ir1Var.m6869O();
        if (z24 || objM6869O24 == i50Var) {
            objM10566b = s94.m10566b(new gc0(dp4Var, (byte) 0));
            ir1Var.m6905n0(objM10566b);
        } else {
            objM10566b = objM6869O24;
        }
        bp4 bp4VarM13688t8 = zp0.m13688t(dp4Var, pb0VarM9462a15, pb0VarM9462a16, (ag1) nq1Var.invoke(((xb4) objM10566b).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var8, ir1Var, i7);
        dc0 dc0Var17 = (dc0) dp4Var.m4646h();
        ir1Var.m6885d0(-1129354377);
        long j25 = dc0Var17.f16920G;
        ir1Var.m6915u();
        lc0 lc0VarM9467f9 = pb0.m9467f(j25);
        boolean zM6890g9 = ir1Var.m6890g(lc0VarM9467f9);
        Object objM6869O25 = ir1Var.m6869O();
        if (zM6890g9 || objM6869O25 == i50Var) {
            objM6869O25 = d55.m4364i(lc0VarM9467f9, c1035pi, ir1Var);
        }
        sq4 sq4Var9 = (sq4) objM6869O25;
        if (dp4Var.m4648j()) {
            sq4Var9 = sq4Var9;
            objM4365j9 = d55.m4365j(ir1Var, 1666827533, dp4Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z25 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4365j9 = ir1Var.m6869O();
            if (z25 || objM4365j9 == i50Var) {
                e94 e94VarM5353c8 = ev0.m5353c0();
                yp1 yp1VarMo3783e9 = e94VarM5353c8 != null ? e94VarM5353c8.mo3783e() : null;
                e94 e94VarM5361k8 = ev0.m5361k0(e94VarM5353c8);
                try {
                    Object objM4642d9 = dp4Var.m4642d();
                    ev0.m5370t0(e94VarM5353c8, e94VarM5361k8, yp1VarMo3783e9);
                    ir1Var.m6905n0(objM4642d9);
                    objM4365j9 = objM4642d9;
                } catch (Throwable th9) {
                    ev0.m5370t0(e94VarM5353c8, e94VarM5361k8, yp1VarMo3783e9);
                    throw th9;
                }
            }
            ir1Var.m6915u();
        }
        ir1Var.m6885d0(-1129354377);
        long j26 = ((dc0) objM4365j9).f16920G;
        ir1Var.m6915u();
        pb0 pb0VarM9462a17 = pb0.m9462a(j26);
        boolean z26 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O26 = ir1Var.m6869O();
        if (z26 || objM6869O26 == i50Var) {
            objM10566b2 = s94.m10566b(new gc0(dp4Var, (byte) 1));
            ir1Var.m6905n0(objM10566b2);
        } else {
            objM10566b2 = objM6869O26;
        }
        dc0 dc0Var18 = (dc0) ((xb4) objM10566b2).getValue();
        ir1Var.m6885d0(-1129354377);
        long j27 = dc0Var18.f16920G;
        ir1Var.m6915u();
        pb0 pb0VarM9462a18 = pb0.m9462a(j27);
        boolean z27 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O27 = ir1Var.m6869O();
        if (z27 || objM6869O27 == i50Var) {
            objM6869O27 = s94.m10566b(new gc0(dp4Var, (byte) 2));
            ir1Var.m6905n0(objM6869O27);
        }
        boolean z28 = true;
        bp4 bp4VarM13688t9 = zp0.m13688t(dp4Var, pb0VarM9462a17, pb0VarM9462a18, (ag1) nq1Var.invoke(((xb4) objM6869O27).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var9, ir1Var, i7);
        dc0 dc0Var19 = (dc0) dp4Var.m4646h();
        ir1Var.m6885d0(468788165);
        long j28 = dc0Var19.f16921H;
        ir1Var.m6915u();
        lc0 lc0VarM9467f10 = pb0.m9467f(j28);
        boolean zM6890g10 = ir1Var.m6890g(lc0VarM9467f10);
        Object objM6869O28 = ir1Var.m6869O();
        if (zM6890g10 || objM6869O28 == i50Var) {
            objM6869O28 = d55.m4364i(lc0VarM9467f10, c1035pi, ir1Var);
        }
        sq4 sq4Var10 = (sq4) objM6869O28;
        if (dp4Var.m4648j()) {
            sq4Var10 = sq4Var10;
            objM4365j10 = d55.m4365j(ir1Var, 1666827533, dp4Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z29 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4365j10 = ir1Var.m6869O();
            if (z29 || objM4365j10 == i50Var) {
                e94 e94VarM5353c9 = ev0.m5353c0();
                yp1 yp1VarMo3783e10 = e94VarM5353c9 != null ? e94VarM5353c9.mo3783e() : null;
                e94 e94VarM5361k9 = ev0.m5361k0(e94VarM5353c9);
                try {
                    Object objM4642d10 = dp4Var.m4642d();
                    ev0.m5370t0(e94VarM5353c9, e94VarM5361k9, yp1VarMo3783e10);
                    ir1Var.m6905n0(objM4642d10);
                    objM4365j10 = objM4642d10;
                } catch (Throwable th10) {
                    ev0.m5370t0(e94VarM5353c9, e94VarM5361k9, yp1VarMo3783e10);
                    throw th10;
                }
            }
            ir1Var.m6915u();
        }
        ir1Var.m6885d0(468788165);
        long j29 = ((dc0) objM4365j10).f16921H;
        ir1Var.m6915u();
        pb0 pb0VarM9462a19 = pb0.m9462a(j29);
        boolean z30 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O29 = ir1Var.m6869O();
        if (z30 || objM6869O29 == i50Var) {
            objM6869O29 = s94.m10566b(new gc0(dp4Var, (byte) 3));
            ir1Var.m6905n0(objM6869O29);
        }
        dc0 dc0Var20 = (dc0) ((xb4) objM6869O29).getValue();
        ir1Var.m6885d0(468788165);
        long j30 = dc0Var20.f16921H;
        ir1Var.m6915u();
        pb0 pb0VarM9462a20 = pb0.m9462a(j30);
        boolean z31 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O30 = ir1Var.m6869O();
        if (z31 || objM6869O30 == i50Var) {
            objM6869O30 = s94.m10566b(new gc0(dp4Var, (byte) 5));
            ir1Var.m6905n0(objM6869O30);
        }
        bp4 bp4VarM13688t10 = zp0.m13688t(dp4Var, pb0VarM9462a19, pb0VarM9462a20, (ag1) nq1Var.invoke(((xb4) objM6869O30).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var10, ir1Var, i7);
        dc0 dc0Var21 = (dc0) dp4Var.m4646h();
        ir1Var.m6885d0(-1518988939);
        long j31 = dc0Var21.f16922I;
        ir1Var.m6915u();
        lc0 lc0VarM9467f11 = pb0.m9467f(j31);
        boolean zM6890g11 = ir1Var.m6890g(lc0VarM9467f11);
        Object objM6869O31 = ir1Var.m6869O();
        if (zM6890g11 || objM6869O31 == i50Var) {
            objM6869O31 = d55.m4364i(lc0VarM9467f11, c1035pi, ir1Var);
        }
        sq4 sq4Var11 = (sq4) objM6869O31;
        if (dp4Var.m4648j()) {
            sq4Var11 = sq4Var11;
            objM4365j11 = d55.m4365j(ir1Var, 1666827533, dp4Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z32 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4365j11 = ir1Var.m6869O();
            if (z32 || objM4365j11 == i50Var) {
                e94 e94VarM5353c10 = ev0.m5353c0();
                yp1 yp1VarMo3783e11 = e94VarM5353c10 != null ? e94VarM5353c10.mo3783e() : null;
                e94 e94VarM5361k10 = ev0.m5361k0(e94VarM5353c10);
                try {
                    Object objM4642d11 = dp4Var.m4642d();
                    ev0.m5370t0(e94VarM5353c10, e94VarM5361k10, yp1VarMo3783e11);
                    ir1Var.m6905n0(objM4642d11);
                    objM4365j11 = objM4642d11;
                } catch (Throwable th11) {
                    ev0.m5370t0(e94VarM5353c10, e94VarM5361k10, yp1VarMo3783e11);
                    throw th11;
                }
            }
            ir1Var.m6915u();
        }
        ir1Var.m6885d0(-1518988939);
        long j32 = ((dc0) objM4365j11).f16922I;
        ir1Var.m6915u();
        pb0 pb0VarM9462a21 = pb0.m9462a(j32);
        boolean z33 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O32 = ir1Var.m6869O();
        if (z33 || objM6869O32 == i50Var) {
            objM10566b3 = s94.m10566b(new gc0(dp4Var, (byte) 6));
            ir1Var.m6905n0(objM10566b3);
        } else {
            objM10566b3 = objM6869O32;
        }
        dc0 dc0Var22 = (dc0) ((xb4) objM10566b3).getValue();
        ir1Var.m6885d0(-1518988939);
        long j33 = dc0Var22.f16922I;
        ir1Var.m6915u();
        pb0 pb0VarM9462a22 = pb0.m9462a(j33);
        boolean z34 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O33 = ir1Var.m6869O();
        if (z34 || objM6869O33 == i50Var) {
            objM6869O33 = s94.m10566b(new gc0(dp4Var, (byte) 7));
            ir1Var.m6905n0(objM6869O33);
        }
        bp4 bp4VarM13688t11 = zp0.m13688t(dp4Var, pb0VarM9462a21, pb0VarM9462a22, (ag1) nq1Var.invoke(((xb4) objM6869O33).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var11, ir1Var, i7);
        dc0 dc0Var23 = (dc0) dp4Var.m4646h();
        ir1Var.m6885d0(-2132814585);
        long j34 = dc0Var23.f16923J;
        ir1Var.m6915u();
        lc0 lc0VarM9467f12 = pb0.m9467f(j34);
        boolean zM6890g12 = ir1Var.m6890g(lc0VarM9467f12);
        Object objM6869O34 = ir1Var.m6869O();
        if (zM6890g12 || objM6869O34 == i50Var) {
            objM6869O34 = d55.m4364i(lc0VarM9467f12, c1035pi, ir1Var);
        }
        sq4 sq4Var12 = (sq4) objM6869O34;
        if (dp4Var.m4648j()) {
            objM4365j12 = d55.m4365j(ir1Var, 1666827533, dp4Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z35 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4365j12 = ir1Var.m6869O();
            if (z35 || objM4365j12 == i50Var) {
                e94 e94VarM5353c11 = ev0.m5353c0();
                yp1 yp1VarMo3783e12 = e94VarM5353c11 != null ? e94VarM5353c11.mo3783e() : null;
                e94 e94VarM5361k11 = ev0.m5361k0(e94VarM5353c11);
                try {
                    Object objM4642d12 = dp4Var.m4642d();
                    ev0.m5370t0(e94VarM5353c11, e94VarM5361k11, yp1VarMo3783e12);
                    ir1Var.m6905n0(objM4642d12);
                    objM4365j12 = objM4642d12;
                } catch (Throwable th12) {
                    ev0.m5370t0(e94VarM5353c11, e94VarM5361k11, yp1VarMo3783e12);
                    throw th12;
                }
            }
            ir1Var.m6915u();
        }
        ir1Var.m6885d0(-2132814585);
        long j35 = ((dc0) objM4365j12).f16923J;
        ir1Var.m6915u();
        pb0 pb0VarM9462a23 = pb0.m9462a(j35);
        boolean z36 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O35 = ir1Var.m6869O();
        if (z36 || objM6869O35 == i50Var) {
            objM6869O35 = s94.m10566b(new gc0(dp4Var, (byte) 8));
            ir1Var.m6905n0(objM6869O35);
        }
        dc0 dc0Var24 = (dc0) ((xb4) objM6869O35).getValue();
        ir1Var.m6885d0(-2132814585);
        long j36 = dc0Var24.f16923J;
        ir1Var.m6915u();
        pb0 pb0VarM9462a24 = pb0.m9462a(j36);
        if ((i5 <= 4 || !ir1Var.m6890g(dp4Var)) && (i3 & 6) != 4) {
            z28 = false;
        }
        Object objM6869O36 = ir1Var.m6869O();
        if (z28 || objM6869O36 == i50Var) {
            objM6869O36 = s94.m10566b(new gc0(dp4Var, (byte) 9));
            ir1Var.m6905n0(objM6869O36);
        }
        return kx5.m7694Y(pb0.m9462a(((pb0) bp4VarM13688t.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) bp4VarM13688t2.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) bp4VarM13688t3.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) bp4Var.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) bp4Var2.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) bp4Var3.f15494j.getValue()).f27503a), pb0.m9462a(m4094j(bp4VarM13688t7)), pb0.m9462a(m4095k(bp4VarM13688t8)), pb0.m9462a(m4096l(bp4VarM13688t9)), pb0.m9462a(m4097m(bp4VarM13688t10)), pb0.m9462a(m4098n(bp4VarM13688t11)), pb0.m9462a(m4099o(zp0.m13688t(dp4Var, pb0VarM9462a23, pb0VarM9462a24, (ag1) nq1Var.invoke(((xb4) objM6869O36).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var12, ir1Var, i7))));
    }

    /* JADX INFO: renamed from: j */
    public static final long m4094j(bp4 bp4Var) {
        return ((pb0) bp4Var.f15494j.getValue()).f27503a;
    }

    /* JADX INFO: renamed from: k */
    public static final long m4095k(bp4 bp4Var) {
        return ((pb0) bp4Var.f15494j.getValue()).f27503a;
    }

    /* JADX INFO: renamed from: l */
    public static final long m4096l(bp4 bp4Var) {
        return ((pb0) bp4Var.f15494j.getValue()).f27503a;
    }

    /* JADX INFO: renamed from: m */
    public static final long m4097m(bp4 bp4Var) {
        return ((pb0) bp4Var.f15494j.getValue()).f27503a;
    }

    /* JADX INFO: renamed from: n */
    public static final long m4098n(bp4 bp4Var) {
        return ((pb0) bp4Var.f15494j.getValue()).f27503a;
    }

    /* JADX INFO: renamed from: o */
    public static final long m4099o(bp4 bp4Var) {
        return ((pb0) bp4Var.f15494j.getValue()).f27503a;
    }

    /* JADX INFO: renamed from: p */
    public static final List m4100p(dp4 dp4Var, nq1 nq1Var, mi0 mi0Var, int i) {
        Object objM4366k;
        Object objM4366k2;
        boolean z;
        Object objM4366k3;
        boolean z2;
        Object objM4366k4;
        C1035pi c1035pi = C1035pi.f27617o;
        int i2 = (i & 14) | 384 | (i & 112);
        d83 d83Var = dp4Var.f17261d;
        zh0 zh0Var = dp4Var.f17258a;
        dc0 dc0Var = (dc0) d83Var.getValue();
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6885d0(193446150);
        long j = dc0Var.f16953j;
        boolean z3 = false;
        ir1Var.m6912r(false);
        lc0 lc0VarM9467f = pb0.m9467f(j);
        boolean zM6890g = ir1Var.m6890g(lc0VarM9467f);
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (zM6890g || objM6869O == i50Var) {
            objM6869O = d55.m4364i(lc0VarM9467f, c1035pi, ir1Var);
        }
        sq4 sq4Var = (sq4) objM6869O;
        int i3 = ((i2 << 3) & 896) | (i2 & 14) | 3072;
        boolean z4 = true;
        if (dp4Var.m4648j()) {
            objM4366k = d55.m4366k(ir1Var, 1666827533, false, zh0Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z5 = (((i3 & 14) ^ 6) > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4366k = ir1Var.m6869O();
            if (z5 || objM4366k == i50Var) {
                e94 e94VarM5353c0 = ev0.m5353c0();
                yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
                e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
                try {
                    Object objMo11188l = zh0Var.mo11188l();
                    ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                    ir1Var.m6905n0(objMo11188l);
                    objM4366k = objMo11188l;
                } catch (Throwable th) {
                    ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                    throw th;
                }
            }
            ir1Var.m6912r(false);
        }
        ir1Var.m6885d0(193446150);
        long j2 = ((dc0) objM4366k).f16953j;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a = pb0.m9462a(j2);
        int i4 = i3 & 14;
        int i5 = i4 ^ 6;
        boolean z6 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O2 = ir1Var.m6869O();
        if (z6 || objM6869O2 == i50Var) {
            gc0 gc0Var = new gc0((byte) 18);
            gc0Var.f19738b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O2 = s94.m10566b(gc0Var);
            ir1Var.m6905n0(objM6869O2);
        }
        dc0 dc0Var2 = (dc0) ((xb4) objM6869O2).getValue();
        ir1Var.m6885d0(193446150);
        long j3 = dc0Var2.f16953j;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a2 = pb0.m9462a(j3);
        boolean z7 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O3 = ir1Var.m6869O();
        if (z7 || objM6869O3 == i50Var) {
            gc0 gc0Var2 = new gc0((byte) 19);
            gc0Var2.f19738b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O3 = s94.m10566b(gc0Var2);
            ir1Var.m6905n0(objM6869O3);
        }
        int i6 = (i3 >> 3) & 112;
        ag1 ag1Var = (ag1) nq1Var.invoke(((xb4) objM6869O3).getValue(), ir1Var, Integer.valueOf(i6));
        int i7 = 196608 | i4;
        bp4 bp4VarM13688t = zp0.m13688t(dp4Var, pb0VarM9462a, pb0VarM9462a2, ag1Var, sq4Var, ir1Var, i7);
        dc0 dc0Var3 = (dc0) d83Var.getValue();
        ir1Var.m6885d0(-971161369);
        long j4 = dc0Var3.f16954k;
        ir1Var.m6912r(false);
        lc0 lc0VarM9467f2 = pb0.m9467f(j4);
        boolean zM6890g2 = ir1Var.m6890g(lc0VarM9467f2);
        Object objM6869O4 = ir1Var.m6869O();
        if (zM6890g2 || objM6869O4 == i50Var) {
            objM6869O4 = d55.m4364i(lc0VarM9467f2, c1035pi, ir1Var);
        }
        sq4 sq4Var2 = (sq4) objM6869O4;
        if (dp4Var.m4648j()) {
            objM4366k2 = d55.m4366k(ir1Var, 1666827533, false, zh0Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z8 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4366k2 = ir1Var.m6869O();
            if (z8 || objM4366k2 == i50Var) {
                e94 e94VarM5353c1 = ev0.m5353c0();
                yp1 yp1VarMo3783e2 = e94VarM5353c1 != null ? e94VarM5353c1.mo3783e() : null;
                e94 e94VarM5361k1 = ev0.m5361k0(e94VarM5353c1);
                try {
                    Object objMo11188l2 = zh0Var.mo11188l();
                    ev0.m5370t0(e94VarM5353c1, e94VarM5361k1, yp1VarMo3783e2);
                    ir1Var.m6905n0(objMo11188l2);
                    objM4366k2 = objMo11188l2;
                    z3 = false;
                } catch (Throwable th2) {
                    ev0.m5370t0(e94VarM5353c1, e94VarM5361k1, yp1VarMo3783e2);
                    throw th2;
                }
            }
            ir1Var.m6912r(z3);
        }
        ir1Var.m6885d0(-971161369);
        long j5 = ((dc0) objM4366k2).f16954k;
        ir1Var.m6912r(z3);
        pb0 pb0VarM9462a3 = pb0.m9462a(j5);
        boolean z9 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O5 = ir1Var.m6869O();
        if (z9 || objM6869O5 == i50Var) {
            gc0 gc0Var3 = new gc0((byte) 20);
            gc0Var3.f19738b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O5 = s94.m10566b(gc0Var3);
            ir1Var.m6905n0(objM6869O5);
        }
        dc0 dc0Var4 = (dc0) ((xb4) objM6869O5).getValue();
        ir1Var.m6885d0(-971161369);
        long j6 = dc0Var4.f16954k;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a4 = pb0.m9462a(j6);
        boolean z10 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O6 = ir1Var.m6869O();
        if (z10 || objM6869O6 == i50Var) {
            gc0 gc0Var4 = new gc0((byte) 21);
            gc0Var4.f19738b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O6 = s94.m10566b(gc0Var4);
            ir1Var.m6905n0(objM6869O6);
        }
        bp4 bp4VarM13688t2 = zp0.m13688t(dp4Var, pb0VarM9462a3, pb0VarM9462a4, (ag1) nq1Var.invoke(((xb4) objM6869O6).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var2, ir1Var, i7);
        dc0 dc0Var5 = (dc0) d83Var.getValue();
        ir1Var.m6885d0(-639376011);
        long j7 = dc0Var5.f16955l;
        ir1Var.m6912r(false);
        lc0 lc0VarM9467f3 = pb0.m9467f(j7);
        boolean zM6890g3 = ir1Var.m6890g(lc0VarM9467f3);
        Object objM6869O7 = ir1Var.m6869O();
        if (zM6890g3 || objM6869O7 == i50Var) {
            objM6869O7 = d55.m4364i(lc0VarM9467f3, c1035pi, ir1Var);
        }
        sq4 sq4Var3 = (sq4) objM6869O7;
        if (dp4Var.m4648j()) {
            bp4VarM13688t2 = bp4VarM13688t2;
            z = false;
            objM4366k3 = d55.m4366k(ir1Var, 1666827533, false, zh0Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z11 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4366k3 = ir1Var.m6869O();
            if (z11 || objM4366k3 == i50Var) {
                e94 e94VarM5353c2 = ev0.m5353c0();
                yp1 yp1VarMo3783e3 = e94VarM5353c2 != null ? e94VarM5353c2.mo3783e() : null;
                e94 e94VarM5361k2 = ev0.m5361k0(e94VarM5353c2);
                try {
                    Object objMo11188l3 = zh0Var.mo11188l();
                    ev0.m5370t0(e94VarM5353c2, e94VarM5361k2, yp1VarMo3783e3);
                    ir1Var.m6905n0(objMo11188l3);
                    objM4366k3 = objMo11188l3;
                } catch (Throwable th3) {
                    ev0.m5370t0(e94VarM5353c2, e94VarM5361k2, yp1VarMo3783e3);
                    throw th3;
                }
            }
            z = false;
            ir1Var.m6912r(false);
        }
        ir1Var.m6885d0(-639376011);
        long j8 = ((dc0) objM4366k3).f16955l;
        ir1Var.m6912r(z);
        pb0 pb0VarM9462a5 = pb0.m9462a(j8);
        boolean z12 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O8 = ir1Var.m6869O();
        if (z12 || objM6869O8 == i50Var) {
            gc0 gc0Var5 = new gc0((byte) 22);
            gc0Var5.f19738b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O8 = s94.m10566b(gc0Var5);
            ir1Var.m6905n0(objM6869O8);
        }
        dc0 dc0Var6 = (dc0) ((xb4) objM6869O8).getValue();
        ir1Var.m6885d0(-639376011);
        long j9 = dc0Var6.f16955l;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a6 = pb0.m9462a(j9);
        boolean z13 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O9 = ir1Var.m6869O();
        if (z13 || objM6869O9 == i50Var) {
            gc0 gc0Var6 = new gc0((byte) 23);
            gc0Var6.f19738b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O9 = s94.m10566b(gc0Var6);
            ir1Var.m6905n0(objM6869O9);
        }
        ag1 ag1Var2 = (ag1) nq1Var.invoke(((xb4) objM6869O9).getValue(), ir1Var, Integer.valueOf(i6));
        bp4 bp4Var = bp4VarM13688t2;
        bp4 bp4VarM13688t3 = zp0.m13688t(dp4Var, pb0VarM9462a5, pb0VarM9462a6, ag1Var2, sq4Var3, ir1Var, i7);
        dc0 dc0Var7 = (dc0) d83Var.getValue();
        ir1Var.m6885d0(1520022196);
        long j10 = dc0Var7.f16956m;
        ir1Var.m6912r(false);
        lc0 lc0VarM9467f4 = pb0.m9467f(j10);
        boolean zM6890g4 = ir1Var.m6890g(lc0VarM9467f4);
        Object objM6869O10 = ir1Var.m6869O();
        if (zM6890g4 || objM6869O10 == i50Var) {
            objM6869O10 = d55.m4364i(lc0VarM9467f4, c1035pi, ir1Var);
        }
        sq4 sq4Var4 = (sq4) objM6869O10;
        if (dp4Var.m4648j()) {
            z2 = false;
            objM4366k4 = d55.m4366k(ir1Var, 1666827533, false, zh0Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z14 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4366k4 = ir1Var.m6869O();
            if (z14 || objM4366k4 == i50Var) {
                e94 e94VarM5353c3 = ev0.m5353c0();
                yp1 yp1VarMo3783e4 = e94VarM5353c3 != null ? e94VarM5353c3.mo3783e() : null;
                e94 e94VarM5361k3 = ev0.m5361k0(e94VarM5353c3);
                try {
                    Object objMo11188l4 = zh0Var.mo11188l();
                    ev0.m5370t0(e94VarM5353c3, e94VarM5361k3, yp1VarMo3783e4);
                    ir1Var.m6905n0(objMo11188l4);
                    objM4366k4 = objMo11188l4;
                } catch (Throwable th4) {
                    ev0.m5370t0(e94VarM5353c3, e94VarM5361k3, yp1VarMo3783e4);
                    throw th4;
                }
            }
            z2 = false;
            ir1Var.m6912r(false);
        }
        ir1Var.m6885d0(1520022196);
        long j11 = ((dc0) objM4366k4).f16956m;
        ir1Var.m6912r(z2);
        pb0 pb0VarM9462a7 = pb0.m9462a(j11);
        boolean z15 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O11 = ir1Var.m6869O();
        if (z15 || objM6869O11 == i50Var) {
            gc0 gc0Var7 = new gc0((byte) 24);
            gc0Var7.f19738b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O11 = s94.m10566b(gc0Var7);
            ir1Var.m6905n0(objM6869O11);
        }
        dc0 dc0Var8 = (dc0) ((xb4) objM6869O11).getValue();
        ir1Var.m6885d0(1520022196);
        long j12 = dc0Var8.f16956m;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a8 = pb0.m9462a(j12);
        if ((i5 <= 4 || !ir1Var.m6890g(dp4Var)) && (i3 & 6) != 4) {
            z4 = false;
        }
        Object objM6869O12 = ir1Var.m6869O();
        if (z4 || objM6869O12 == i50Var) {
            gc0 gc0Var8 = new gc0((byte) 25);
            gc0Var8.f19738b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O12 = s94.m10566b(gc0Var8);
            ir1Var.m6905n0(objM6869O12);
        }
        return kx5.m7694Y(pb0.m9462a(((pb0) bp4VarM13688t.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) bp4Var.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) bp4VarM13688t3.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) zp0.m13688t(dp4Var, pb0VarM9462a7, pb0VarM9462a8, (ag1) nq1Var.invoke(((xb4) objM6869O12).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var4, ir1Var, i7).f15494j.getValue()).f27503a));
    }

    /* JADX INFO: renamed from: q */
    public static final List m4101q(dp4 dp4Var, nq1 nq1Var, mi0 mi0Var, int i) {
        Object objM4366k;
        Object objM4366k2;
        boolean z;
        Object objM4366k3;
        Object objM10566b;
        boolean z2;
        Object objM4366k4;
        boolean z3;
        Object objM4366k5;
        zh0 zh0Var = dp4Var.f17258a;
        C1035pi c1035pi = C1035pi.f27617o;
        int i2 = (i & 14) | 384 | (i & 112);
        d83 d83Var = dp4Var.f17261d;
        dc0 dc0Var = (dc0) d83Var.getValue();
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6885d0(-129903265);
        long j = dc0Var.f16964u;
        boolean z4 = false;
        ir1Var.m6912r(false);
        lc0 lc0VarM9467f = pb0.m9467f(j);
        boolean zM6890g = ir1Var.m6890g(lc0VarM9467f);
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (zM6890g || objM6869O == i50Var) {
            objM6869O = d55.m4364i(lc0VarM9467f, c1035pi, ir1Var);
        }
        sq4 sq4Var = (sq4) objM6869O;
        int i3 = ((i2 << 3) & 896) | (i2 & 14) | 3072;
        if (dp4Var.m4648j()) {
            objM4366k = d55.m4366k(ir1Var, 1666827533, false, zh0Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z5 = (((i3 & 14) ^ 6) > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4366k = ir1Var.m6869O();
            if (z5 || objM4366k == i50Var) {
                e94 e94VarM5353c0 = ev0.m5353c0();
                yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
                e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
                try {
                    Object objMo11188l = zh0Var.mo11188l();
                    ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                    ir1Var.m6905n0(objMo11188l);
                    objM4366k = objMo11188l;
                } catch (Throwable th) {
                    ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
                    throw th;
                }
            }
            ir1Var.m6912r(false);
        }
        ir1Var.m6885d0(-129903265);
        long j2 = ((dc0) objM4366k).f16964u;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a = pb0.m9462a(j2);
        int i4 = i3 & 14;
        int i5 = i4 ^ 6;
        boolean z6 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O2 = ir1Var.m6869O();
        if (z6 || objM6869O2 == i50Var) {
            gc0 gc0Var = new gc0((byte) 27);
            gc0Var.f19738b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O2 = s94.m10566b(gc0Var);
            ir1Var.m6905n0(objM6869O2);
        }
        dc0 dc0Var2 = (dc0) ((xb4) objM6869O2).getValue();
        ir1Var.m6885d0(-129903265);
        long j3 = dc0Var2.f16964u;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a2 = pb0.m9462a(j3);
        boolean z7 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O3 = ir1Var.m6869O();
        if (z7 || objM6869O3 == i50Var) {
            gc0 gc0Var2 = new gc0((byte) 28);
            gc0Var2.f19738b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O3 = s94.m10566b(gc0Var2);
            ir1Var.m6905n0(objM6869O3);
        }
        int i6 = (i3 >> 3) & 112;
        ag1 ag1Var = (ag1) nq1Var.invoke(((xb4) objM6869O3).getValue(), ir1Var, Integer.valueOf(i6));
        int i7 = 196608 | i4;
        bp4 bp4VarM13688t = zp0.m13688t(dp4Var, pb0VarM9462a, pb0VarM9462a2, ag1Var, sq4Var, ir1Var, i7);
        dc0 dc0Var3 = (dc0) d83Var.getValue();
        ir1Var.m6885d0(-917575040);
        long j4 = dc0Var3.f16965v;
        ir1Var.m6912r(false);
        lc0 lc0VarM9467f2 = pb0.m9467f(j4);
        boolean zM6890g2 = ir1Var.m6890g(lc0VarM9467f2);
        Object objM6869O4 = ir1Var.m6869O();
        if (zM6890g2 || objM6869O4 == i50Var) {
            objM6869O4 = d55.m4364i(lc0VarM9467f2, c1035pi, ir1Var);
        }
        sq4 sq4Var2 = (sq4) objM6869O4;
        if (dp4Var.m4648j()) {
            objM4366k2 = d55.m4366k(ir1Var, 1666827533, false, zh0Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z8 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4366k2 = ir1Var.m6869O();
            if (z8 || objM4366k2 == i50Var) {
                e94 e94VarM5353c1 = ev0.m5353c0();
                yp1 yp1VarMo3783e2 = e94VarM5353c1 != null ? e94VarM5353c1.mo3783e() : null;
                e94 e94VarM5361k1 = ev0.m5361k0(e94VarM5353c1);
                try {
                    Object objMo11188l2 = zh0Var.mo11188l();
                    ev0.m5370t0(e94VarM5353c1, e94VarM5361k1, yp1VarMo3783e2);
                    ir1Var.m6905n0(objMo11188l2);
                    objM4366k2 = objMo11188l2;
                    z4 = false;
                } catch (Throwable th2) {
                    ev0.m5370t0(e94VarM5353c1, e94VarM5361k1, yp1VarMo3783e2);
                    throw th2;
                }
            }
            ir1Var.m6912r(z4);
        }
        ir1Var.m6885d0(-917575040);
        long j5 = ((dc0) objM4366k2).f16965v;
        ir1Var.m6912r(z4);
        pb0 pb0VarM9462a3 = pb0.m9462a(j5);
        boolean z9 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O5 = ir1Var.m6869O();
        if (z9 || objM6869O5 == i50Var) {
            gc0 gc0Var3 = new gc0((byte) 29);
            gc0Var3.f19738b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O5 = s94.m10566b(gc0Var3);
            ir1Var.m6905n0(objM6869O5);
        }
        dc0 dc0Var4 = (dc0) ((xb4) objM6869O5).getValue();
        ir1Var.m6885d0(-917575040);
        long j6 = dc0Var4.f16965v;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a4 = pb0.m9462a(j6);
        boolean z10 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O6 = ir1Var.m6869O();
        if (z10 || objM6869O6 == i50Var) {
            hc0 hc0Var = new hc0((byte) 0);
            hc0Var.f20476b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O6 = s94.m10566b(hc0Var);
            ir1Var.m6905n0(objM6869O6);
        }
        bp4 bp4VarM13688t2 = zp0.m13688t(dp4Var, pb0VarM9462a3, pb0VarM9462a4, (ag1) nq1Var.invoke(((xb4) objM6869O6).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var2, ir1Var, i7);
        dc0 dc0Var5 = (dc0) d83Var.getValue();
        ir1Var.m6885d0(736165112);
        long j7 = dc0Var5.f16914A;
        ir1Var.m6912r(false);
        lc0 lc0VarM9467f3 = pb0.m9467f(j7);
        boolean zM6890g3 = ir1Var.m6890g(lc0VarM9467f3);
        Object objM6869O7 = ir1Var.m6869O();
        if (zM6890g3 || objM6869O7 == i50Var) {
            objM6869O7 = d55.m4364i(lc0VarM9467f3, c1035pi, ir1Var);
        }
        sq4 sq4Var3 = (sq4) objM6869O7;
        if (dp4Var.m4648j()) {
            sq4Var3 = sq4Var3;
            z = false;
            objM4366k3 = d55.m4366k(ir1Var, 1666827533, false, zh0Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z11 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4366k3 = ir1Var.m6869O();
            if (z11 || objM4366k3 == i50Var) {
                e94 e94VarM5353c2 = ev0.m5353c0();
                yp1 yp1VarMo3783e3 = e94VarM5353c2 != null ? e94VarM5353c2.mo3783e() : null;
                e94 e94VarM5361k2 = ev0.m5361k0(e94VarM5353c2);
                try {
                    Object objMo11188l3 = zh0Var.mo11188l();
                    ev0.m5370t0(e94VarM5353c2, e94VarM5361k2, yp1VarMo3783e3);
                    ir1Var.m6905n0(objMo11188l3);
                    objM4366k3 = objMo11188l3;
                } catch (Throwable th3) {
                    ev0.m5370t0(e94VarM5353c2, e94VarM5361k2, yp1VarMo3783e3);
                    throw th3;
                }
            }
            z = false;
            ir1Var.m6912r(false);
        }
        ir1Var.m6885d0(736165112);
        long j8 = ((dc0) objM4366k3).f16914A;
        ir1Var.m6912r(z);
        pb0 pb0VarM9462a5 = pb0.m9462a(j8);
        boolean z12 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O8 = ir1Var.m6869O();
        if (z12 || objM6869O8 == i50Var) {
            hc0 hc0Var2 = new hc0((byte) 1);
            hc0Var2.f20476b = dp4Var;
            VarHandle.storeStoreFence();
            objM10566b = s94.m10566b(hc0Var2);
            ir1Var.m6905n0(objM10566b);
        } else {
            objM10566b = objM6869O8;
        }
        dc0 dc0Var6 = (dc0) ((xb4) objM10566b).getValue();
        ir1Var.m6885d0(736165112);
        long j9 = dc0Var6.f16914A;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a6 = pb0.m9462a(j9);
        boolean z13 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O9 = ir1Var.m6869O();
        if (z13 || objM6869O9 == i50Var) {
            hc0 hc0Var3 = new hc0((byte) 2);
            hc0Var3.f20476b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O9 = s94.m10566b(hc0Var3);
            ir1Var.m6905n0(objM6869O9);
        }
        boolean z14 = true;
        bp4 bp4VarM13688t3 = zp0.m13688t(dp4Var, pb0VarM9462a5, pb0VarM9462a6, (ag1) nq1Var.invoke(((xb4) objM6869O9).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var3, ir1Var, i7);
        dc0 dc0Var7 = (dc0) d83Var.getValue();
        ir1Var.m6885d0(598084837);
        long j10 = dc0Var7.f16915B;
        ir1Var.m6912r(false);
        lc0 lc0VarM9467f4 = pb0.m9467f(j10);
        boolean zM6890g4 = ir1Var.m6890g(lc0VarM9467f4);
        Object objM6869O10 = ir1Var.m6869O();
        if (zM6890g4 || objM6869O10 == i50Var) {
            objM6869O10 = d55.m4364i(lc0VarM9467f4, c1035pi, ir1Var);
        }
        sq4 sq4Var4 = (sq4) objM6869O10;
        if (dp4Var.m4648j()) {
            bp4VarM13688t3 = bp4VarM13688t3;
            sq4Var4 = sq4Var4;
            z2 = false;
            objM4366k4 = d55.m4366k(ir1Var, 1666827533, false, zh0Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z15 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            objM4366k4 = ir1Var.m6869O();
            if (z15 || objM4366k4 == i50Var) {
                e94 e94VarM5353c3 = ev0.m5353c0();
                yp1 yp1VarMo3783e4 = e94VarM5353c3 != null ? e94VarM5353c3.mo3783e() : null;
                e94 e94VarM5361k3 = ev0.m5361k0(e94VarM5353c3);
                try {
                    Object objMo11188l4 = zh0Var.mo11188l();
                    ev0.m5370t0(e94VarM5353c3, e94VarM5361k3, yp1VarMo3783e4);
                    ir1Var.m6905n0(objMo11188l4);
                    objM4366k4 = objMo11188l4;
                } catch (Throwable th4) {
                    ev0.m5370t0(e94VarM5353c3, e94VarM5361k3, yp1VarMo3783e4);
                    throw th4;
                }
            }
            z2 = false;
            ir1Var.m6912r(false);
        }
        ir1Var.m6885d0(598084837);
        long j11 = ((dc0) objM4366k4).f16915B;
        ir1Var.m6912r(z2);
        pb0 pb0VarM9462a7 = pb0.m9462a(j11);
        boolean z16 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O11 = ir1Var.m6869O();
        if (z16 || objM6869O11 == i50Var) {
            hc0 hc0Var4 = new hc0((byte) 3);
            hc0Var4.f20476b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O11 = s94.m10566b(hc0Var4);
            ir1Var.m6905n0(objM6869O11);
        }
        dc0 dc0Var8 = (dc0) ((xb4) objM6869O11).getValue();
        ir1Var.m6885d0(598084837);
        long j12 = dc0Var8.f16915B;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a8 = pb0.m9462a(j12);
        boolean z17 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O12 = ir1Var.m6869O();
        if (z17 || objM6869O12 == i50Var) {
            hc0 hc0Var5 = new hc0((byte) 4);
            hc0Var5.f20476b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O12 = s94.m10566b(hc0Var5);
            ir1Var.m6905n0(objM6869O12);
        }
        bp4 bp4Var = bp4VarM13688t3;
        bp4 bp4VarM13688t4 = zp0.m13688t(dp4Var, pb0VarM9462a7, pb0VarM9462a8, (ag1) nq1Var.invoke(((xb4) objM6869O12).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var4, ir1Var, i7);
        dc0 dc0Var9 = (dc0) d83Var.getValue();
        ir1Var.m6885d0(-1333650948);
        long j13 = dc0Var9.f16916C;
        ir1Var.m6912r(false);
        lc0 lc0VarM9467f5 = pb0.m9467f(j13);
        boolean zM6890g5 = ir1Var.m6890g(lc0VarM9467f5);
        Object objM6869O13 = ir1Var.m6869O();
        if (zM6890g5 || objM6869O13 == i50Var) {
            objM6869O13 = d55.m4364i(lc0VarM9467f5, c1035pi, ir1Var);
        }
        sq4 sq4Var5 = (sq4) objM6869O13;
        if (dp4Var.m4648j()) {
            z3 = false;
            objM4366k5 = d55.m4366k(ir1Var, 1666827533, false, zh0Var);
        } else {
            ir1Var.m6885d0(1666573488);
            boolean z18 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
            Object objM6869O14 = ir1Var.m6869O();
            if (z18 || objM6869O14 == i50Var) {
                e94 e94VarM5353c4 = ev0.m5353c0();
                yp1 yp1VarMo3783e5 = e94VarM5353c4 != null ? e94VarM5353c4.mo3783e() : null;
                e94 e94VarM5361k4 = ev0.m5361k0(e94VarM5353c4);
                try {
                    Object objMo11188l5 = zh0Var.mo11188l();
                    ev0.m5370t0(e94VarM5353c4, e94VarM5361k4, yp1VarMo3783e5);
                    ir1Var.m6905n0(objMo11188l5);
                    objM6869O14 = objMo11188l5;
                } catch (Throwable th5) {
                    ev0.m5370t0(e94VarM5353c4, e94VarM5361k4, yp1VarMo3783e5);
                    throw th5;
                }
            }
            ir1Var.m6912r(false);
            objM4366k5 = objM6869O14;
            z3 = false;
        }
        ir1Var.m6885d0(-1333650948);
        long j14 = ((dc0) objM4366k5).f16916C;
        ir1Var.m6912r(z3);
        pb0 pb0VarM9462a9 = pb0.m9462a(j14);
        boolean z19 = (i5 > 4 && ir1Var.m6890g(dp4Var)) || (i3 & 6) == 4;
        Object objM6869O15 = ir1Var.m6869O();
        if (z19 || objM6869O15 == i50Var) {
            hc0 hc0Var6 = new hc0((byte) 5);
            hc0Var6.f20476b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O15 = s94.m10566b(hc0Var6);
            ir1Var.m6905n0(objM6869O15);
        }
        dc0 dc0Var10 = (dc0) ((xb4) objM6869O15).getValue();
        ir1Var.m6885d0(-1333650948);
        long j15 = dc0Var10.f16916C;
        ir1Var.m6912r(false);
        pb0 pb0VarM9462a10 = pb0.m9462a(j15);
        if ((i5 <= 4 || !ir1Var.m6890g(dp4Var)) && (i3 & 6) != 4) {
            z14 = false;
        }
        Object objM6869O16 = ir1Var.m6869O();
        if (z14 || objM6869O16 == i50Var) {
            gc0 gc0Var4 = new gc0((byte) 26);
            gc0Var4.f19738b = dp4Var;
            VarHandle.storeStoreFence();
            objM6869O16 = s94.m10566b(gc0Var4);
            ir1Var.m6905n0(objM6869O16);
        }
        return kx5.m7694Y(pb0.m9462a(((pb0) bp4VarM13688t.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) bp4VarM13688t2.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) bp4Var.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) bp4VarM13688t4.f15494j.getValue()).f27503a), pb0.m9462a(((pb0) zp0.m13688t(dp4Var, pb0VarM9462a9, pb0VarM9462a10, (ag1) nq1Var.invoke(((xb4) objM6869O16).getValue(), ir1Var, Integer.valueOf(i6)), sq4Var5, ir1Var, i7).f15494j.getValue()).f27503a));
    }
}
