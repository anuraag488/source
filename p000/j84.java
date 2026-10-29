package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class j84 {

    /* JADX INFO: renamed from: a */
    public static final tx4 f22091a = new tx4(e84.f17895b);

    /* JADX INFO: renamed from: a */
    public static final void m7047a(float f, yp1 yp1Var, nt2 nt2Var, boolean z, ma0 ma0Var, wp1 wp1Var, u74 u74Var, nv2 nv2Var, mi0 mi0Var, int i) {
        int i2;
        Object obj;
        float fM7051e;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-202044027);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6884d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6894i(yp1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6890g(nt2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6892h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ir1Var.m6890g(ma0Var) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if ((1572864 & i) == 0) {
            i3 |= ir1Var.m6894i(wp1Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= ir1Var.m6890g(u74Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= ir1Var.m6890g(nv2Var) ? 67108864 : 33554432;
        }
        if (ir1Var.m6871T(i3 & 1, (38347923 & i3) != 38347922)) {
            ir1Var.m6876Y();
            if ((i & 1) != 0 && !ir1Var.m6856B()) {
                ir1Var.m6874W();
            }
            ir1Var.m6913s();
            boolean z2 = ((i3 & 458752) == 131072) | ((((i3 & 57344) ^ 24576) > 16384 && ir1Var.m6890g(ma0Var)) || (i3 & 24576) == 16384);
            Object objM6869O = ir1Var.m6869O();
            if (z2 || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                k84 k84Var = new k84();
                k84Var.f22986a = ma0Var;
                k84Var.f22987b = new z73(f);
                k84Var.f22988c = true;
                k84Var.f22989d = new float[0];
                k84Var.f22990e = new a83(0);
                k84Var.f22991f = new a83(0);
                k84Var.f22992g = d63.f16815b;
                Boolean bool = Boolean.FALSE;
                k84Var.f22994i = k43.m7398w(bool);
                k84Var.f22995j = new a83(0);
                k84Var.f22996k = new a83(0);
                k84Var.f22997l = k43.m7398w(bool);
                float f2 = ma0Var.f24778a;
                float f3 = ma0Var.f24779b - f2;
                k84Var.f22998m = new z73(zp0.m13656G(0.0f, 0.0f, sc6.m10674o(f3 == 0.0f ? 0.0f : (f - f2) / f3, 0.0f, 1.0f)));
                k84Var.f22999n = new z73(0.0f);
                vv0 vv0Var = new vv0((byte) 1);
                vv0Var.f32885b = k84Var;
                VarHandle.storeStoreFence();
                k84Var.f23000o = vv0Var;
                k84Var.f23001p = new dx2();
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(k84Var);
                obj = k84Var;
            }
            obj = objM6869O;
            k84 k84Var2 = (k84) obj;
            if (k84Var2.f22988c) {
                ma0 ma0Var2 = k84Var2.f22986a;
                float f4 = ma0Var2.f24778a;
                float f5 = ma0Var2.f24779b;
                fM7051e = m7051e(sc6.m10674o(f, f4, f5), ma0Var2.f24778a, f5, k84Var2.f22989d);
            } else {
                fM7051e = f;
            }
            k84Var2.f22987b.m13400i(fM7051e);
            byte b = 2;
            y52 y52Var = new y52(b);
            y52Var.f34911b = nv2Var;
            y52Var.f34913d = u74Var;
            y52Var.f34912c = z;
            VarHandle.storeStoreFence();
            pg0 pg0VarM11834R = vd6.m11834R(-1835235136, y52Var, ir1Var);
            C0724hg c0724hg = new C0724hg(b);
            c0724hg.f20540b = z;
            c0724hg.f20541c = u74Var;
            VarHandle.storeStoreFence();
            pg0 pg0VarM11834R2 = vd6.m11834R(308249025, c0724hg, ir1Var);
            int i4 = (i3 & 112) | 113246208 | (i3 & 896) | (i3 & 7168);
            int i5 = i3 >> 6;
            m7048b(k84Var2, yp1Var, nt2Var, z, wp1Var, u74Var, nv2Var, pg0VarM11834R, pg0VarM11834R2, ir1Var, (i5 & 3670016) | i4 | (i5 & 57344) | (i5 & 458752));
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            b84 b84Var = new b84();
            b84Var.f15156a = f;
            b84Var.f15157b = yp1Var;
            b84Var.f15158c = nt2Var;
            b84Var.f15159d = z;
            b84Var.f15160e = ma0Var;
            b84Var.f15161f = wp1Var;
            b84Var.f15162g = u74Var;
            b84Var.f15163h = nv2Var;
            b84Var.f15164i = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = b84Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m7048b(k84 k84Var, yp1 yp1Var, nt2 nt2Var, boolean z, wp1 wp1Var, u74 u74Var, nv2 nv2Var, pg0 pg0Var, pg0 pg0Var2, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1733864311);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6894i(k84Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6894i(yp1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6890g(nt2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6892h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ir1Var.m6894i(wp1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ir1Var.m6890g(u74Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ir1Var.m6890g(nv2Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= ir1Var.m6894i(pg0Var2) ? 67108864 : 33554432;
        }
        if (ir1Var.m6871T(i2 & 1, (38347923 & i2) != 38347922)) {
            ir1Var.m6876Y();
            if ((i & 1) != 0 && !ir1Var.m6856B()) {
                ir1Var.m6874W();
            }
            ir1Var.m6913s();
            k84Var.f22992g = d63.f16815b;
            int i3 = i2 >> 3;
            m7049c(nt2Var, k84Var, z, yp1Var, wp1Var, nv2Var, pg0Var, pg0Var2, ir1Var, (i2 & 57344) | ((i2 >> 6) & 14) | ((i2 << 3) & 112) | (i3 & 896) | ((i2 << 6) & 7168) | (458752 & i3) | (3670016 & i3) | (29360128 & i3));
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            rg2 rg2Var = new rg2(b);
            rg2Var.f29250c = k84Var;
            rg2Var.f29255h = yp1Var;
            rg2Var.f29249b = nt2Var;
            rg2Var.f29253f = z;
            rg2Var.f29251d = wp1Var;
            rg2Var.f29257j = u74Var;
            rg2Var.f29258k = nv2Var;
            rg2Var.f29252e = pg0Var;
            rg2Var.f29254g = pg0Var2;
            rg2Var.f29256i = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = rg2Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0393  */
    /* JADX WARN: Code duplicated, block: B:166:0x039c  */
    /* JADX WARN: Code duplicated, block: B:167:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:171:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:174:0x0415  */
    /* JADX WARN: Code duplicated, block: B:175:0x0419  */
    /* JADX WARN: Code duplicated, block: B:178:0x045e  */
    /* JADX WARN: Code duplicated, block: B:179:0x0462  */
    /* JADX WARN: Code duplicated, block: B:181:0x0488  */
    /* JADX INFO: renamed from: c */
    public static final void m7049c(nt2 nt2Var, k84 k84Var, boolean z, yp1 yp1Var, wp1 wp1Var, nv2 nv2Var, pg0 pg0Var, pg0 pg0Var2, mi0 mi0Var, int i) {
        int i2;
        pg0 pg0Var3;
        k84 k84Var2;
        pg0 pg0Var4;
        boolean z2;
        nt2 nt2Var2;
        nt2 pf4Var;
        nt2 nt2VarM8586n;
        i50 i50Var;
        xq2 xq2Var;
        int iHashCode;
        ga3 ga3VarM6902m;
        nt2 nt2VarM10006A;
        boolean z3;
        da2 da2Var;
        boolean zM6890g;
        Object obj;
        j35 j35VarM13347F;
        pg0 pg0Var5 = pg0Var2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1457062396);
        InterfaceC0618en interfaceC0618en = ir1Var.f21685a;
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(nt2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6894i(k84Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6892h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6894i(yp1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ir1Var.m6894i(wp1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ir1Var.m6890g(nv2Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= ir1Var.m6894i(pg0Var5) ? 8388608 : 4194304;
        }
        if (ir1Var.m6871T(i2 & 1, (4793491 & i2) != 4793490)) {
            k84Var.f22993h = ir1Var.m6898k(ij0.f21479n) == df2.f17012b;
            z73 z73Var = k84Var.f22987b;
            ma0 ma0Var = k84Var.f22986a;
            int i3 = i2 >> 15;
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var2 = ki0.f23136a;
            if (objM6869O == i50Var2) {
                objM6869O = k43.m7398w(Boolean.FALSE);
                ir1Var.m6905n0(objM6869O);
            }
            sw2 sw2Var = (sw2) objM6869O;
            byte b = 6;
            boolean z4 = (((i3 & 14) ^ 6) > 4 && ir1Var.m6890g(nv2Var)) || (i3 & 6) == 4;
            Object objM6869O2 = ir1Var.m6869O();
            boolean z5 = z4;
            wm0 wm0Var = null;
            if (z5 || objM6869O2 == i50Var2) {
                objM6869O2 = new vk1(nv2Var, sw2Var, wm0Var, (byte) 0);
                ir1Var.m6905n0(objM6869O2);
            }
            lb5.m7926g(ir1Var, (mq1) objM6869O2, nv2Var);
            Boolean bool = (Boolean) sw2Var.getValue();
            bool.booleanValue();
            k84Var.f22994i.setValue(bool);
            d63 d63Var = k84Var.f22992g;
            if (d63Var == d63.f16815b && k84Var.f22993h) {
                z2 = true;
            } else {
                d63 d63Var2 = d63.f16814a;
                z2 = false;
            }
            int i4 = i2 << 3;
            int i5 = (i2 & 112) | 6 | ((i2 >> 9) & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752);
            ir1Var.m6885d0(761622313);
            kt2 kt2Var = kt2.f23428a;
            if (z) {
                sw2 sw2VarM7369C = k43.m7369C(yp1Var, ir1Var);
                nt2Var2 = kt2Var;
                sw2 sw2VarM7369C2 = k43.m7369C(wp1Var, ir1Var);
                boolean zM6894i = ((((i5 & 896) ^ 384) > 256 && ir1Var.m6890g(nv2Var)) || (i5 & 384) == 256) | ir1Var.m6894i(k84Var) | ir1Var.m6890g(sw2VarM7369C) | ir1Var.m6890g(sw2VarM7369C2);
                Object objM6869O3 = ir1Var.m6869O();
                Object obj2 = objM6869O3;
                if (zM6894i || objM6869O3 == i50Var2) {
                    i84 i84Var = new i84((byte) 0);
                    i84Var.f21174c = nv2Var;
                    i84Var.f21175d = k84Var;
                    i84Var.f21173b = sw2VarM7369C;
                    i84Var.f21176e = sw2VarM7369C2;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(i84Var);
                    obj2 = i84Var;
                }
                ec3 ec3Var = rf4.f29227a;
                pf4Var = new pf4(k84Var, nv2Var, (PointerInputEventHandler) obj2, 4);
                ir1Var.m6912r(false);
            } else {
                ir1Var.m6912r(false);
                pf4Var = kt2Var;
                nt2Var2 = pf4Var;
            }
            boolean zM6894i2 = ir1Var.m6894i(k84Var) | ((i2 & 7168) == 2048);
            Object objM6869O4 = ir1Var.m6869O();
            Object obj3 = objM6869O4;
            if (zM6894i2 || objM6869O4 == i50Var2) {
                cz3 cz3Var = new cz3((byte) 4);
                cz3Var.f16639c = k84Var;
                cz3Var.f16638b = yp1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(cz3Var);
                obj3 = cz3Var;
            }
            m31 m31VarM6996a = j31.m6996a((yp1) obj3, ir1Var);
            boolean zBooleanValue = ((Boolean) k84Var.f22997l.getValue()).booleanValue();
            boolean zM6894i3 = ir1Var.m6894i(k84Var);
            Object objM6869O5 = ir1Var.m6869O();
            if (zM6894i3 || objM6869O5 == i50Var2) {
                objM6869O5 = new sh0(k84Var, null, (byte) 1);
                ir1Var.m6905n0(objM6869O5);
            }
            nq1 nq1Var = (nq1) objM6869O5;
            boolean zM6894i4 = ir1Var.m6894i(k84Var) | ((i2 & 57344) == 16384);
            Object objM6869O6 = ir1Var.m6869O();
            if (zM6894i4 || objM6869O6 == i50Var2) {
                objM6869O6 = new f54(k84Var, wp1Var, null);
                ir1Var.m6905n0(objM6869O6);
            }
            b31 b31Var = new b31();
            b31Var.f15050a = m31VarM6996a;
            b31Var.f15051b = d63Var;
            b31Var.f15052c = z;
            b31Var.f15053d = nv2Var;
            b31Var.f15054e = zBooleanValue;
            b31Var.f15055f = nq1Var;
            b31Var.f15056g = (nq1) objM6869O6;
            b31Var.f15057h = z2;
            VarHandle.storeStoreFence();
            d63 d63Var3 = d63.f16814a;
            if (d63Var == d63Var3) {
                nt2 nt2VarM10041y = qq2.m10041y(v74.f32448a);
                vf1 vf1Var = n74.f25504a;
                C0816jz c0816jz = ig1.f21388l;
                if (z62.m13387o(c0816jz, c0816jz)) {
                    j35VarM13347F = n74.f25509f;
                } else {
                    j35VarM13347F = z62.m13387o(c0816jz, ig1.f21387k) ? n74.f25510g : z62.m13347F(c0816jz);
                }
                nt2VarM8586n = nt2VarM10041y.mo7630d(j35VarM13347F);
            } else {
                nt2VarM8586n = n74.m8586n(qq2.m10041y(v74.f32448a));
            }
            ((kq3) ir1Var.m6898k(xp3.f34516a)).getClass();
            ir1Var.m6885d0(-1885985690);
            ir1Var.m6912r(false);
            ky0 ky0Var = (ky0) ir1Var.m6898k(ij0.f21473h);
            dx1 dx1Var = f62.f18784a;
            nt2 nt2VarM8578f = n74.m8578f(nt2Var.mo7630d(gt2.f20114a), d63Var == d63Var3 ? 16.0f : 4.0f, d63Var == d63Var3 ? 4.0f : 16.0f, 0.0f, 0.0f, 12);
            C0453ag c0453ag = new C0453ag((byte) 4);
            c0453ag.f14443b = z;
            c0453ag.f14445d = k84Var;
            c0453ag.f14446e = yp1Var;
            c0453ag.f14444c = wp1Var;
            VarHandle.storeStoreFence();
            nt2 nt2VarMo7630d = f14.m5458a(nt2VarM8578f, false, c0453ag).mo7630d(k84Var.f22992g == d63Var3 ? AbstractC0859l4.f23777b : AbstractC0859l4.f23776a);
            float fM13399h = z73Var.m13399h();
            nt2 nt2Var3 = nt2VarM8586n;
            ma0 ma0VarM10645Q = sc6.m10645Q(ma0Var.f24778a, ma0Var.f24779b);
            m10 m10Var = new m10((byte) 4);
            m10Var.f24530b = fM13399h;
            m10Var.f24531c = ma0VarM10645Q;
            VarHandle.storeStoreFence();
            nt2 nt2VarM11860s = vd6.m11860s(f14.m5458a(nt2VarMo7630d, true, m10Var), z, nv2Var);
            float fM13399h2 = z73Var.m13399h();
            boolean z6 = d63Var == d63Var3;
            g84 g84Var = new g84();
            g84Var.f19654a = z;
            g84Var.f19655b = ma0Var;
            g84Var.f19656c = z2;
            g84Var.f19657d = yp1Var;
            g84Var.f19658e = z6;
            g84Var.f19659f = fM13399h2;
            g84Var.f19660g = wp1Var;
            VarHandle.storeStoreFence();
            nt2 nt2VarMo7630d2 = z62.m13356O(nt2VarM11860s, g84Var).mo7630d(pf4Var).mo7630d(b31Var);
            k84Var2 = k84Var;
            boolean zM6892h = ir1Var.m6892h(false) | ir1Var.m6890g(sw2Var) | ir1Var.m6886e(d63Var.ordinal()) | ir1Var.m6894i(k84Var2) | ir1Var.m6892h(false);
            Object objM6869O7 = ir1Var.m6869O();
            if (zM6892h) {
                i50Var = i50Var2;
            } else {
                i50Var = i50Var2;
                if (objM6869O7 == i50Var) {
                }
                obj = objM6869O7;
                xq2Var = (xq2) obj;
                iHashCode = Long.hashCode(ir1Var.f21683T);
                ga3VarM6902m = ir1Var.m6902m();
                nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarMo7630d2);
                bi0.f15310ap.getClass();
                if (interfaceC0618en != null) {
                    dt0.m4682E();
                    throw null;
                }
                ir1Var.m6893h0();
                z3 = ir1Var.f21682S;
                da2Var = wf2.f33290T;
                if (z3) {
                    ir1Var.m6900l(da2Var);
                } else {
                    ir1Var.m6911q0();
                }
                jh0 jh0Var = ia5.f21216g;
                C0006a5.m53I(ir1Var, jh0Var, xq2Var);
                jh0 jh0Var2 = ia5.f21215f;
                C0006a5.m53I(ir1Var, jh0Var2, ga3VarM6902m);
                Integer numValueOf = Integer.valueOf(iHashCode);
                jh0 jh0Var3 = ia5.f21217h;
                C0006a5.m53I(ir1Var, jh0Var3, numValueOf);
                C0006a5.m50F(ir1Var);
                jh0 jh0Var4 = ia5.f21214e;
                C0006a5.m53I(ir1Var, jh0Var4, nt2VarM10006A);
                nt2 nt2VarMo7630d3 = nt2Var3.mo7630d(nt2Var2);
                zM6890g = ir1Var.m6890g(sw2Var) | ir1Var.m6892h(false) | ir1Var.m6890g(ky0Var) | ir1Var.m6894i(k84Var2);
                Object objM6869O8 = ir1Var.m6869O();
                obj = objM6869O8;
                if (zM6890g || objM6869O8 == i50Var) {
                    o04 o04Var = new o04(b);
                    o04Var.f26271b = k84Var2;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(o04Var);
                    obj = o04Var;
                }
                nt2 nt2VarM6101z = gq6.m6101z(nt2VarMo7630d3, (yp1) obj);
                C0853kz c0853kz = ig1.f21378b;
                xq2 xq2VarM9704c = q20.m9704c(c0853kz, false);
                int iHashCode2 = Long.hashCode(ir1Var.f21683T);
                ga3 ga3VarM6902m2 = ir1Var.m6902m();
                nt2 nt2VarM10006A2 = qq2.m10006A(ir1Var, nt2VarM6101z);
                ir1Var.m6893h0();
                if (ir1Var.f21682S) {
                    ir1Var.m6900l(da2Var);
                } else {
                    ir1Var.m6911q0();
                }
                C0006a5.m53I(ir1Var, jh0Var, xq2VarM9704c);
                C0006a5.m53I(ir1Var, jh0Var2, ga3VarM6902m2);
                d55.m4373r(iHashCode2, ir1Var, jh0Var3, ir1Var);
                C0006a5.m53I(ir1Var, jh0Var4, nt2VarM10006A2);
                int i6 = (i2 >> 3) & 14;
                pg0 pg0Var6 = pg0Var;
                pg0Var6.invoke(k84Var2, ir1Var, Integer.valueOf((i3 & 112) | i6));
                ir1Var.m6912r(true);
                nt2 nt2VarM10041y2 = qq2.m10041y(v74.f32449b);
                xq2 xq2VarM9704c2 = q20.m9704c(c0853kz, false);
                int iHashCode3 = Long.hashCode(ir1Var.f21683T);
                ga3 ga3VarM6902m3 = ir1Var.m6902m();
                nt2 nt2VarM10006A3 = qq2.m10006A(ir1Var, nt2VarM10041y2);
                ir1Var.m6893h0();
                if (ir1Var.f21682S) {
                    ir1Var.m6900l(da2Var);
                } else {
                    ir1Var.m6911q0();
                }
                C0006a5.m53I(ir1Var, jh0Var, xq2VarM9704c2);
                C0006a5.m53I(ir1Var, jh0Var2, ga3VarM6902m3);
                d55.m4373r(iHashCode3, ir1Var, jh0Var3, ir1Var);
                C0006a5.m53I(ir1Var, jh0Var4, nt2VarM10006A3);
                pg0 pg0Var7 = pg0Var2;
                pg0Var7.invoke(k84Var2, ir1Var, Integer.valueOf(i6 | ((i2 >> 18) & 112)));
                ir1Var.m6912r(true);
                ir1Var.m6912r(true);
                pg0Var4 = pg0Var7;
                pg0Var3 = pg0Var6;
            }
            obj = objM6869O7;
            C0981of c0981of = new C0981of((byte) 1);
            c0981of.f26662b = d63Var;
            c0981of.f26663c = k84Var2;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(c0981of);
            Object obj4 = c0981of;
            obj4 = objM6869O7;
            xq2Var = (xq2) obj4;
            iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3VarM6902m = ir1Var.m6902m();
            nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarMo7630d2);
            bi0.f15310ap.getClass();
            if (interfaceC0618en != null) {
                dt0.m4682E();
                throw null;
            }
            ir1Var.m6893h0();
            z3 = ir1Var.f21682S;
            da2Var = wf2.f33290T;
            if (z3) {
                ir1Var.m6900l(da2Var);
            } else {
                ir1Var.m6911q0();
            }
            jh0 jh0Var5 = ia5.f21216g;
            C0006a5.m53I(ir1Var, jh0Var5, xq2Var);
            jh0 jh0Var6 = ia5.f21215f;
            C0006a5.m53I(ir1Var, jh0Var6, ga3VarM6902m);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            jh0 jh0Var7 = ia5.f21217h;
            C0006a5.m53I(ir1Var, jh0Var7, numValueOf2);
            C0006a5.m50F(ir1Var);
            jh0 jh0Var8 = ia5.f21214e;
            C0006a5.m53I(ir1Var, jh0Var8, nt2VarM10006A);
            nt2 nt2VarMo7630d4 = nt2Var3.mo7630d(nt2Var2);
            zM6890g = ir1Var.m6890g(sw2Var) | ir1Var.m6892h(false) | ir1Var.m6890g(ky0Var) | ir1Var.m6894i(k84Var2);
            Object objM6869O9 = ir1Var.m6869O();
            obj = objM6869O9;
            if (zM6890g) {
                o04 o04Var2 = new o04(b);
                o04Var2.f26271b = k84Var2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(o04Var2);
                obj = o04Var2;
            } else {
                o04 o04Var3 = new o04(b);
                o04Var3.f26271b = k84Var2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(o04Var3);
                obj = o04Var3;
            }
            nt2 nt2VarM6101z2 = gq6.m6101z(nt2VarMo7630d4, (yp1) obj);
            C0853kz c0853kz2 = ig1.f21378b;
            xq2 xq2VarM9704c3 = q20.m9704c(c0853kz2, false);
            int iHashCode4 = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m4 = ir1Var.m6902m();
            nt2 nt2VarM10006A4 = qq2.m10006A(ir1Var, nt2VarM6101z2);
            ir1Var.m6893h0();
            if (ir1Var.f21682S) {
                ir1Var.m6900l(da2Var);
            } else {
                ir1Var.m6911q0();
            }
            C0006a5.m53I(ir1Var, jh0Var5, xq2VarM9704c3);
            C0006a5.m53I(ir1Var, jh0Var6, ga3VarM6902m4);
            d55.m4373r(iHashCode4, ir1Var, jh0Var7, ir1Var);
            C0006a5.m53I(ir1Var, jh0Var8, nt2VarM10006A4);
            int i7 = (i2 >> 3) & 14;
            pg0 pg0Var8 = pg0Var;
            pg0Var8.invoke(k84Var2, ir1Var, Integer.valueOf((i3 & 112) | i7));
            ir1Var.m6912r(true);
            nt2 nt2VarM10041y3 = qq2.m10041y(v74.f32449b);
            xq2 xq2VarM9704c4 = q20.m9704c(c0853kz2, false);
            int iHashCode5 = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m5 = ir1Var.m6902m();
            nt2 nt2VarM10006A5 = qq2.m10006A(ir1Var, nt2VarM10041y3);
            ir1Var.m6893h0();
            if (ir1Var.f21682S) {
                ir1Var.m6900l(da2Var);
            } else {
                ir1Var.m6911q0();
            }
            C0006a5.m53I(ir1Var, jh0Var5, xq2VarM9704c4);
            C0006a5.m53I(ir1Var, jh0Var6, ga3VarM6902m5);
            d55.m4373r(iHashCode5, ir1Var, jh0Var7, ir1Var);
            C0006a5.m53I(ir1Var, jh0Var8, nt2VarM10006A5);
            pg0 pg0Var9 = pg0Var2;
            pg0Var9.invoke(k84Var2, ir1Var, Integer.valueOf(i7 | ((i2 >> 18) & 112)));
            ir1Var.m6912r(true);
            ir1Var.m6912r(true);
            pg0Var4 = pg0Var9;
            pg0Var3 = pg0Var8;
        } else {
            pg0Var3 = pg0Var;
            k84Var2 = k84Var;
            ir1Var.m6874W();
            pg0Var4 = pg0Var5;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            c84 c84Var = new c84();
            c84Var.f15874a = nt2Var;
            c84Var.f15875b = k84Var2;
            c84Var.f15876c = z;
            c84Var.f15877d = yp1Var;
            c84Var.f15878e = wp1Var;
            c84Var.f15879f = nv2Var;
            c84Var.f15880g = pg0Var3;
            c84Var.f15881h = pg0Var4;
            c84Var.f15882i = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c84Var;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m7050d(nv2 nv2Var, nt2 nt2Var, u74 u74Var, boolean z, long j, mi0 mi0Var, int i) {
        int i2;
        long jFloatToRawIntBits;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1844845435);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(nv2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(nt2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6890g(u74Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6892h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ir1Var.m6888f(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ir1Var.m6892h(false) ? 131072 : 65536;
        }
        byte b = 1;
        if (ir1Var.m6871T(i2 & 1, (74899 & i2) != 74898)) {
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                objM6869O = new w94();
                ir1Var.m6905n0(objM6869O);
            }
            w94 w94Var = (w94) objM6869O;
            boolean z2 = (i2 & 14) == 4;
            Object objM6869O2 = ir1Var.m6869O();
            wm0 wm0Var = null;
            if (z2 || objM6869O2 == i50Var) {
                objM6869O2 = new s40(nv2Var, w94Var, wm0Var, b);
                ir1Var.m6905n0(objM6869O2);
            }
            lb5.m7926g(ir1Var, (mq1) objM6869O2, nv2Var);
            if (w94Var.isEmpty()) {
                jFloatToRawIntBits = j;
            } else {
                float fM10960b = t11.m10960b(j) / 2.0f;
                if ((2 & 1) != 0) {
                    fM10960b = t11.m10960b(j);
                }
                float fM10959a = (2 & 2) != 0 ? t11.m10959a(j) : 0.0f;
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM10959a)) & 4294967295L) | (((long) Float.floatToRawIntBits(fM10960b)) << 32);
            }
            vf1 vf1Var = n74.f25504a;
            nt2 nt2VarM8510t = n40.m8510t(n74.m8580h(nt2Var, t11.m10960b(j), t11.m10959a(j)), nv2Var);
            jc3.f22163a.getClass();
            C0796jf c0796jf = dt0.f17356n;
            hc3 hc3Var = new hc3();
            hc3Var.f20477a = c0796jf;
            VarHandle.storeStoreFence();
            nt2 nt2VarMo7630d = nt2VarM8510t.mo7630d(hc3Var);
            xq2 xq2VarM9704c = q20.m9704c(ig1.f21382f, false);
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarMo7630d);
            bi0.f15310ap.getClass();
            if (ir1Var.f21685a == null) {
                dt0.m4682E();
                throw 0;
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
            i25.m6610b(ir1Var, as4.m3258q(n74.m8580h(kt2.f23428a, t11.m10960b(jFloatToRawIntBits), t11.m10959a(jFloatToRawIntBits)), z ? u74Var.f31699a : u74Var.f31704f, t44.m10977a(6, ir1Var)));
            ir1Var.m6912r(true);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            d84 d84Var = new d84();
            d84Var.f16860a = nv2Var;
            d84Var.f16861b = nt2Var;
            d84Var.f16862c = u74Var;
            d84Var.f16863d = z;
            d84Var.f16864e = j;
            d84Var.f16865f = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = d84Var;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final float m7051e(float f, float f2, float f3, float[] fArr) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f4 = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f4);
            } else {
                float fAbs = Math.abs(zp0.m13656G(f2, f3, f4) - f);
                if (1 <= length) {
                    while (true) {
                        float f5 = fArr[i];
                        float fAbs2 = Math.abs(zp0.m13656G(f2, f3, f5) - f);
                        if (Float.compare(fAbs, fAbs2) > 0) {
                            f4 = f5;
                            fAbs = fAbs2;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                fValueOf = Float.valueOf(f4);
            }
        }
        return fValueOf != null ? zp0.m13656G(f2, f3, fValueOf.floatValue()) : f;
    }
}
