package p000;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class iy3 extends v21 implements wc2, g14 {

    /* JADX INFO: renamed from: J */
    public g03 f21883J;

    /* JADX INFO: renamed from: K */
    public C1017p0 f21884K;

    /* JADX INFO: renamed from: L */
    public C0968o2 f21885L;

    /* JADX INFO: renamed from: M */
    public boolean f21886M;

    /* JADX INFO: renamed from: N */
    public boolean f21887N;

    /* JADX INFO: renamed from: O */
    public ru2 f21888O;

    /* JADX INFO: renamed from: P */
    public no4 f21889P;

    /* JADX INFO: renamed from: Q */
    public final aw0 f21890Q;

    /* JADX INFO: renamed from: R */
    public final vy3 f21891R;

    /* JADX INFO: renamed from: S */
    public final fy3 f21892S;

    /* JADX INFO: renamed from: T */
    public final sl1 f21893T;

    /* JADX INFO: renamed from: U */
    public final fm0 f21894U;

    public iy3(C1289wd c1289wd, k30 k30Var, xh1 xh1Var, nv2 nv2Var, d63 d63Var, jy3 jy3Var, boolean z, boolean z2) {
        super(qs5.f28771d, z, nv2Var, d63Var);
        g03 g03Var = new g03();
        this.f21883J = g03Var;
        wd3 wd3Var = new wd3(dy3.f17505c);
        gv0 gv0Var = new gv0();
        gv0Var.f20145a = wd3Var;
        VarHandle.storeStoreFence();
        aw0 aw0Var = new aw0(gv0Var);
        this.f21890Q = aw0Var;
        xh1Var = xh1Var == null ? aw0Var : xh1Var;
        gy3 gy3Var = new gy3((byte) 0);
        gy3Var.f20193b = this;
        VarHandle.storeStoreFence();
        vy3 vy3Var = new vy3();
        vy3Var.f32958a = jy3Var;
        vy3Var.f32959b = c1289wd;
        vy3Var.f32960c = xh1Var;
        vy3Var.f32961d = d63Var;
        vy3Var.f32962e = z2;
        vy3Var.f32963f = g03Var;
        vy3Var.f32964g = this;
        vy3Var.f32965h = gy3Var;
        vy3Var.f32967j = (byte) 1;
        vy3Var.f32968k = dy3.f17503a;
        ty3 ty3Var = new ty3();
        ty3Var.f31538a = vy3Var;
        VarHandle.storeStoreFence();
        vy3Var.f32969l = ty3Var;
        b71 b71Var = new b71((byte) 29);
        b71Var.f15141b = vy3Var;
        VarHandle.storeStoreFence();
        vy3Var.f32970m = b71Var;
        VarHandle.storeStoreFence();
        this.f21891R = vy3Var;
        fy3 fy3Var = new fy3();
        fy3Var.f19422a = vy3Var;
        fy3Var.f19423b = z;
        VarHandle.storeStoreFence();
        this.f21892S = fy3Var;
        sl1 sl1Var = new sl1(2, null, 10);
        m10154O0(sl1Var);
        this.f21893T = sl1Var;
        gy3 gy3Var2 = new gy3((byte) 1);
        gy3Var2.f20193b = this;
        VarHandle.storeStoreFence();
        fm0 fm0Var = new fm0();
        fm0Var.f19108o = d63Var;
        fm0Var.f19109p = vy3Var;
        fm0Var.f19110q = z2;
        fm0Var.f19111r = k30Var;
        fm0Var.f19112s = gy3Var2;
        b30 b30Var = new b30();
        b30Var.f15048a = new uw2(new cm0[16]);
        VarHandle.storeStoreFence();
        fm0Var.f19113t = b30Var;
        fm0Var.f19115v = -1L;
        VarHandle.storeStoreFence();
        m10154O0(fm0Var);
        this.f21894U = fm0Var;
        m10154O0(new k03(fy3Var, g03Var));
        h30 h30Var = new h30();
        h30Var.f20296o = fm0Var;
        m10154O0(h30Var);
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: D0 */
    public final boolean mo4191D0() {
        return false;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: G0 */
    public final void mo26G0() {
        ru2 ru2Var = this.f21888O;
        if (ru2Var != null) {
            ru2Var.f26286c = sc6.m10652X(this).f33336z;
        }
        no4 no4Var = this.f21889P;
        if (no4Var != null) {
            no4Var.f26286c = sc6.m10652X(this).f33336z;
        }
        if (this.f25208n) {
            ky0 ky0Var = sc6.m10652X(this).f33336z;
            aw0 aw0Var = this.f21890Q;
            aw0Var.getClass();
            wd3 wd3Var = new wd3(ky0Var);
            gv0 gv0Var = new gv0();
            gv0Var.f20145a = wd3Var;
            VarHandle.storeStoreFence();
            aw0Var.f14909a = gv0Var;
        }
    }

    @Override // p000.v21, p000.oc3
    /* JADX INFO: renamed from: N */
    public final void mo6964N(ec3 ec3Var, fc3 fc3Var, long j) {
        boolean z;
        byte b;
        int i;
        List list = ec3Var.f18000a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            lc3 lc3Var = (lc3) list.get(i2);
            yp1 yp1Var = this.f32336r;
            int i3 = lc3Var.f23943i;
            tc3 tc3Var = new tc3();
            tc3Var.f31073a = i3;
            VarHandle.storeStoreFence();
            if (((Boolean) yp1Var.invoke(tc3Var)).booleanValue()) {
                super.mo6964N(ec3Var, fc3Var, j);
                break;
            }
        }
        if (this.f32337s) {
            if (this.f32326A == null) {
                bs1 bs1Var = new bs1();
                bs1Var.f15546o = this;
                VarHandle.storeStoreFence();
                m10154O0(bs1Var);
                this.f32326A = bs1Var;
            }
            fc3 fc3Var2 = fc3.f18903a;
            wm0 wm0Var = null;
            if (fc3Var == fc3Var2 && ec3Var.f18005f == 6) {
                if (this.f21886M) {
                    z = true;
                } else {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(zc6.m13511H(this).getContext());
                    js1 js1Var = new js1();
                    js1Var.f22555a = viewConfiguration;
                    VarHandle.storeStoreFence();
                    ru2 ru2Var = new ru2(this.f21891R, new og0(2, this, iy3.class, "onMouseWheelScrollStopped", "onMouseWheelScrollStopped-TH1AsA0(J)V", 4, (byte) 1), sc6.m10652X(this).f33336z);
                    ru2Var.f29639f = js1Var;
                    ru2Var.f29640g = ev0.m5333H(Integer.MAX_VALUE, null, null, 6);
                    VarHandle.storeStoreFence();
                    this.f21888O = ru2Var;
                    z = true;
                    this.f21886M = true;
                }
                ru2 ru2Var2 = this.f21888O;
                if (ru2Var2 != null) {
                    zo0 zo0VarM8391C0 = m8391C0();
                    if (ru2Var2.f29641h == null) {
                        ru2Var2.f29641h = lb5.m7910S(zo0VarM8391C0, null, null, new C0682gb(ru2Var2, wm0Var, (byte) 5), 3);
                    }
                }
            } else {
                z = true;
            }
            ru2 ru2Var3 = this.f21888O;
            if (ru2Var3 != null && ec3Var.f18005f == 6) {
                List list2 = ec3Var.f18000a;
                int size2 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        if (fc3Var == fc3.f18903a && ru2Var3.f26287d) {
                            ru2Var3.m10442f(ec3Var);
                            o13.m8918a(ec3Var);
                        }
                        if (fc3Var != fc3.f18904b || ru2Var3.f26287d || !ru2Var3.m10442f(ec3Var)) {
                            break;
                            break;
                            break;
                        } else {
                            o13.m8918a(ec3Var);
                            break;
                        }
                    }
                    if (((lc3) list2.get(i4)).m7954c()) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            if (fc3Var == fc3Var2 && ((i = ec3Var.f18005f) == 10 || i == 11 || i == 12)) {
                if (this.f21887N) {
                    b = 10;
                } else {
                    b = 10;
                    no4 no4Var = new no4(this.f21891R, new og0(2, this, iy3.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, (byte) 2), sc6.m10652X(this).f33336z);
                    no4Var.f25983f = ev0.m5333H(Integer.MAX_VALUE, null, null, 6);
                    VarHandle.storeStoreFence();
                    this.f21889P = no4Var;
                    this.f21887N = z;
                }
                no4 no4Var2 = this.f21889P;
                if (no4Var2 != null) {
                    zo0 zo0VarM8391C1 = m8391C0();
                    if (no4Var2.f25984g == null) {
                        no4Var2.f25984g = lb5.m7910S(zo0VarM8391C1, null, null, new C1312wz(no4Var2, wm0Var, b), 3);
                    }
                }
            } else {
                b = 10;
            }
            no4 no4Var3 = this.f21889P;
            if (no4Var3 != null) {
                int i5 = ec3Var.f18005f;
                if (i5 == b || i5 == 11 || i5 == 12) {
                    List list3 = ec3Var.f18000a;
                    int size3 = list3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        if (((lc3) list3.get(i6)).m7954c()) {
                            return;
                        }
                    }
                    if (fc3Var == fc3.f18903a && no4Var3.f26287d) {
                        no4Var3.m8805d(ec3Var);
                        o13.m8918a(ec3Var);
                    }
                    if (fc3Var == fc3.f18904b && !no4Var3.f26287d && no4Var3.m8805d(ec3Var)) {
                        o13.m8918a(ec3Var);
                    }
                }
            }
        }
    }

    @Override // p000.v21
    /* JADX INFO: renamed from: S0 */
    public final Object mo6290S0(C1031pe c1031pe, C1312wz c1312wz) {
        xw2 xw2Var = xw2.f34666b;
        vy3 vy3Var = this.f21891R;
        Object objM12034g = vy3Var.m12034g(xw2Var, new er2((Object) c1031pe, (Object) vy3Var, (wm0) null, (byte) 11), c1312wz);
        return objM12034g == ap0.f14763a ? objM12034g : ju4.f22634a;
    }

    @Override // p000.wc2
    /* JADX INFO: renamed from: X */
    public final boolean mo6965X(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.f32337s || ((!nc2.m8689a(qs5.m10079D(keyEvent), nc2.f25635D) && !nc2.m8689a(i20.m6579d(keyEvent.getKeyCode()), nc2.f25634C)) || qs5.m10083H(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.f21891R.f32961d == d63.f16814a;
        fm0 fm0Var = this.f21894U;
        if (z) {
            int iM5740P0 = (int) (fm0Var.m5740P0() & 4294967295L);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(nc2.m8689a(i20.m6579d(keyEvent.getKeyCode()), nc2.f25634C) ? iM5740P0 : -iM5740P0)));
        } else {
            int iM5740P1 = (int) (fm0Var.m5740P0() >> 32);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(nc2.m8689a(i20.m6579d(keyEvent.getKeyCode()), nc2.f25634C) ? iM5740P1 : -iM5740P1)) << 32);
        }
        lb5.m7910S(m8391C0(), null, null, new C0968o2(this, jFloatToRawIntBits, null, (byte) 1), 3);
        return true;
    }

    @Override // p000.v21
    /* JADX INFO: renamed from: Y0 */
    public final void mo6967Y0(g21 g21Var) {
        if (this.f25208n) {
            lb5.m7910S(this.f21883J.m5872c(), null, null, new it1((Object) g21Var, (Object) this, (wm0) null, (byte) 23), 3);
        }
    }

    @Override // p000.px0
    /* JADX INFO: renamed from: a */
    public final void mo4197a() {
        mo8143j0();
        ru2 ru2Var = this.f21888O;
        if (ru2Var != null) {
            ru2Var.f26286c = sc6.m10652X(this).f33336z;
        }
        no4 no4Var = this.f21889P;
        if (no4Var != null) {
            no4Var.f26286c = sc6.m10652X(this).f33336z;
        }
        mo8143j0();
        if (this.f25208n) {
            ky0 ky0Var = sc6.m10652X(this).f33336z;
            aw0 aw0Var = this.f21890Q;
            aw0Var.getClass();
            wd3 wd3Var = new wd3(ky0Var);
            gv0 gv0Var = new gv0();
            gv0Var.f20145a = wd3Var;
            VarHandle.storeStoreFence();
            aw0Var.f14909a = gv0Var;
        }
    }

    @Override // p000.g14
    /* JADX INFO: renamed from: i0 */
    public final void mo4513i0(q14 q14Var) {
        if (this.f32337s && (this.f21884K == null || this.f21885L == null)) {
            C1017p0 c1017p0 = new C1017p0((byte) 1);
            c1017p0.f27254b = this;
            VarHandle.storeStoreFence();
            this.f21884K = c1017p0;
            this.f21885L = new C0968o2(this, null);
        }
        C1017p0 c1017p1 = this.f21884K;
        if (c1017p1 != null) {
            ic2[] ic2VarArr = o14.f26289a;
            q14Var.mo4898a(d14.f16707d, new C1353y2(null, c1017p1));
        }
        C0968o2 c0968o2 = this.f21885L;
        if (c0968o2 != null) {
            ic2[] ic2VarArr2 = o14.f26289a;
            q14Var.mo4898a(d14.f16708e, c0968o2);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final void m6968j1(C1289wd c1289wd, k30 k30Var, xh1 xh1Var, nv2 nv2Var, d63 d63Var, jy3 jy3Var, boolean z, boolean z2) {
        boolean z3;
        if (this.f32337s != z) {
            this.f21892S.f19423b = z;
            this.f21884K = null;
            this.f21885L = null;
            y70.m13004E(this);
        }
        if (xh1Var == null) {
            xh1Var = this.f21890Q;
        }
        g03 g03Var = this.f21883J;
        vy3 vy3Var = this.f21891R;
        boolean z4 = true;
        if (z62.m13387o(vy3Var.f32958a, jy3Var)) {
            z3 = false;
        } else {
            vy3Var.f32958a = jy3Var;
            z3 = true;
        }
        vy3Var.f32959b = c1289wd;
        d63 d63Var2 = vy3Var.f32961d;
        if (d63Var2 != d63Var) {
            vy3Var.f32961d = d63Var;
            d63Var2 = d63Var;
            z3 = true;
        }
        if (vy3Var.f32962e != z2) {
            vy3Var.f32962e = z2;
        } else {
            z4 = z3;
        }
        vy3Var.f32960c = xh1Var;
        vy3Var.f32963f = g03Var;
        fm0 fm0Var = this.f21894U;
        fm0Var.f19108o = d63Var;
        fm0Var.f19110q = z2;
        fm0Var.f19111r = k30Var;
        C0891m c0891m = qs5.f28771d;
        d63 d63Var3 = d63.f16814a;
        if (d63Var2 != d63Var3) {
            d63Var3 = d63.f16815b;
        }
        m11708i1(c0891m, z, nv2Var, d63Var3, z4);
    }

    @Override // p000.wc2
    /* JADX INFO: renamed from: n */
    public final boolean mo6969n(KeyEvent keyEvent) {
        return false;
    }

    @Override // p000.v21
    /* JADX INFO: renamed from: X0 */
    public final void mo6966X0(long j) {
    }
}
