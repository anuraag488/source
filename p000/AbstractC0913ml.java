package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: ml */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0913ml {

    /* JADX INFO: renamed from: a */
    public static final float f24992a;

    static {
        new bs0(0.8f, 0.0f, 0.8f, 0.15f);
        f24992a = 12.0f;
    }

    /* JADX INFO: renamed from: a */
    public static final void m8340a(pg0 pg0Var, nt2 nt2Var, mq1 mq1Var, nq1 nq1Var, float f, a05 a05Var, do4 do4Var, a91 a91Var, e73 e73Var, mi0 mi0Var, int i) {
        int i2;
        float f2;
        a05 a05VarM5364n0;
        int i3;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1109867978);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6894i(pg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(nt2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6894i(mq1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6894i(nq1Var) ? 2048 : 1024;
        }
        int i4 = i2 | 24576;
        if ((196608 & i) == 0) {
            i4 = 90112 | i2;
        }
        if ((1572864 & i) == 0) {
            i4 |= ir1Var.m6890g(do4Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= ir1Var.m6890g(a91Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= ir1Var.m6890g(e73Var) ? 67108864 : 33554432;
        }
        if (ir1Var.m6871T(i4 & 1, (38347923 & i4) != 38347922)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                f2 = eo4.f18335a;
                i3 = i4 & (-458753);
                a05VarM5364n0 = ev0.m5364n0(AbstractC1356y5.m12932z(ir1Var), 16 | sj3.f30341k);
            } else {
                ir1Var.m6874W();
                i3 = i4 & (-458753);
                f2 = f;
                a05VarM5364n0 = a05Var;
            }
            ir1Var.m6913s();
            int i5 = i3;
            int i6 = i5 << 3;
            int i7 = ((i5 >> 3) & 14) | 224256 | (i6 & 112);
            int i8 = i5 << 12;
            m8341b(nt2Var, pg0Var, ks4.m7594a(12, ir1Var), xl4.f34388d, mq1Var, nq1Var, (p11.m9352c(f2, Float.NaN) || p11.m9352c(f2, Float.POSITIVE_INFINITY)) ? eo4.f18335a : f2, e73Var, a05VarM5364n0, do4Var, a91Var, ir1Var, i7 | (i8 & 3670016) | (i8 & 29360128) | (i6 & 1879048192), (i5 >> 15) & 1022);
        } else {
            ir1Var.m6874W();
            f2 = f;
            a05VarM5364n0 = a05Var;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0579dl c0579dl = new C0579dl();
            c0579dl.f17131a = pg0Var;
            c0579dl.f17132b = nt2Var;
            c0579dl.f17133c = mq1Var;
            c0579dl.f17134d = nq1Var;
            c0579dl.f17135e = f2;
            c0579dl.f17136f = a05VarM5364n0;
            c0579dl.f17137g = do4Var;
            c0579dl.f17138h = a91Var;
            c0579dl.f17139i = e73Var;
            c0579dl.f17140j = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0579dl;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8341b(nt2 nt2Var, pg0 pg0Var, xl4 xl4Var, xl4 xl4Var2, mq1 mq1Var, nq1 nq1Var, float f, e73 e73Var, a05 a05Var, do4 do4Var, a91 a91Var, mi0 mi0Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        pg0 pg0Var2;
        float f2;
        ir1 ir1Var;
        nt2 nt2Var2;
        Object obj;
        byte b;
        ho4 ho4Var;
        xl4 xl4Var3 = xl4Var;
        e73 e73Var2 = e73Var;
        C0779iz c0779iz = ig1.f21391o;
        ir1 ir1Var2 = (ir1) mi0Var;
        ir1Var2.m6889f0(703932376);
        if ((i & 6) == 0) {
            i3 = (ir1Var2.m6890g(nt2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i3;
        if ((i & 48) == 0) {
            i4 = i6 | (ir1Var2.m6894i(pg0Var) ? 32 : 16);
        } else {
            i4 = i6;
        }
        if ((i & 384) == 0) {
            i4 |= ir1Var2.m6890g(xl4Var3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= ir1Var2.m6894i(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= ir1Var2.m6890g(xl4Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= ir1Var2.m6890g(c0779iz) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= ir1Var2.m6894i(mq1Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= ir1Var2.m6894i(nq1Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= ir1Var2.m6884d(f) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i4 |= ir1Var2.m6890g(e73Var2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (ir1Var2.m6890g(a05Var) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= ir1Var2.m6890g(do4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= ir1Var2.m6890g(a91Var) ? 256 : 128;
        }
        if (!ir1Var2.m6871T(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 147) == 146) ? false : true)) {
            pg0Var2 = pg0Var;
            f2 = f;
            ir1 ir1Var3 = ir1Var2;
            ir1Var3.m6874W();
            ir1Var = ir1Var3;
        } else {
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) >= 2139095040) {
                C1077qn.m9987m("The expandedHeight is expected to be specified and finite");
                return;
            }
            boolean z = (i5 & 112) == 32;
            int i7 = i5 & 896;
            boolean z2 = z | (i7 == 256);
            Object objM6869O = ir1Var2.m6869O();
            i50 i50Var = ki0.f23136a;
            if (z2 || objM6869O == i50Var) {
                C0839kl c0839kl = new C0839kl((byte) 0);
                c0839kl.f23208b = a91Var;
                c0839kl.f23209c = do4Var;
                VarHandle.storeStoreFence();
                objM6869O = s94.m10566b(c0839kl);
                ir1Var2.m6905n0(objM6869O);
            }
            xb4 xb4VarM4941a = e74.m4941a(((pb0) ((xb4) objM6869O).getValue()).f27503a, lb5.m7919a0(3, ir1Var2), ir1Var2, 0);
            C0616el c0616el = new C0616el((byte) 0);
            c0616el.f18196b = nq1Var;
            VarHandle.storeStoreFence();
            pg0 pg0VarM11834R = vd6.m11834R(1222546095, c0616el, ir1Var2);
            nt2 nt2Var3 = kt2.f23428a;
            if (a91Var != null) {
                ir1Var2.m6885d0(-1473850236);
                d63 d63Var = d63.f16814a;
                boolean z3 = i7 == 256;
                Object objM6869O2 = ir1Var2.m6869O();
                Object obj2 = objM6869O2;
                if (z3 || objM6869O2 == i50Var) {
                    C1127s c1127s = new C1127s((byte) 13);
                    c1127s.f29778b = a91Var;
                    VarHandle.storeStoreFence();
                    ir1Var2.m6905n0(c1127s);
                    obj2 = c1127s;
                }
                m31 m31VarM6996a = j31.m6996a((yp1) obj2, ir1Var2);
                boolean z4 = i7 == 256;
                Object objM6869O3 = ir1Var2.m6869O();
                if (z4 || objM6869O3 == i50Var) {
                    objM6869O3 = new C0802jl(a91Var, null);
                    ir1Var2.m6905n0(objM6869O3);
                }
                d31 d31Var = j31.f21983a;
                b31 b31Var = new b31();
                b31Var.f15050a = m31VarM6996a;
                b31Var.f15051b = d63Var;
                b31Var.f15052c = true;
                b31Var.f15053d = null;
                b31Var.f15054e = false;
                b31Var.f15055f = d31Var;
                b31Var.f15056g = (nq1) objM6869O3;
                b31Var.f15057h = false;
                VarHandle.storeStoreFence();
                ir1Var2.m6912r(false);
                nt2Var2 = b31Var;
            } else {
                pg0VarM11834R = pg0VarM11834R;
                ir1Var2.m6885d0(-1473335574);
                ir1Var2.m6912r(false);
                nt2Var2 = nt2Var3;
            }
            nt2 nt2VarMo7630d = nt2Var.mo7630d(nt2Var2);
            boolean zM6890g = ir1Var2.m6890g(xb4VarM4941a);
            Object objM6869O4 = ir1Var2.m6869O();
            if (zM6890g || objM6869O4 == i50Var) {
                C0676g5 c0676g5 = new C0676g5((byte) 1);
                c0676g5.f19614b = xb4VarM4941a;
                VarHandle.storeStoreFence();
                ir1Var2.m6905n0(c0676g5);
                obj = c0676g5;
            } else {
                obj = objM6869O4;
            }
            nt2 nt2VarM5542m = C0638f5.m5542m(nt2VarMo7630d, (yp1) obj);
            Object objM6869O5 = ir1Var2.m6869O();
            if (objM6869O5 == i50Var) {
                objM6869O5 = new C0891m((byte) 26);
                ir1Var2.m6905n0(objM6869O5);
            }
            nt2 nt2VarM5458a = f14.m5458a(nt2VarM5542m, false, (yp1) objM6869O5);
            Object objM6869O6 = ir1Var2.m6869O();
            if (objM6869O6 == i50Var) {
                objM6869O6 = C0765il.f21522b;
                ir1Var2.m6905n0(objM6869O6);
            }
            nt2 nt2VarM10327a = rf4.m10327a(nt2VarM5458a, ju4.f22634a, (PointerInputEventHandler) objM6869O6);
            xq2 xq2VarM9704c = q20.m9704c(ig1.f21378b, false);
            int iHashCode = Long.hashCode(ir1Var2.f21683T);
            ga3 ga3VarM6902m = ir1Var2.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var2, nt2VarM10327a);
            bi0.f15310ap.getClass();
            if (ir1Var2.f21685a == null) {
                dt0.m4682E();
                throw null;
            }
            ir1Var2.m6893h0();
            if (ir1Var2.f21682S) {
                ir1Var2.m6900l(wf2.f33290T);
            } else {
                ir1Var2.m6911q0();
            }
            C0006a5.m53I(ir1Var2, ia5.f21216g, xq2VarM9704c);
            C0006a5.m53I(ir1Var2, ia5.f21215f, ga3VarM6902m);
            C0006a5.m53I(ir1Var2, ia5.f21217h, Integer.valueOf(iHashCode));
            C0006a5.m50F(ir1Var2);
            C0006a5.m53I(ir1Var2, ia5.f21214e, nt2VarM10006A);
            nt2 nt2VarM6620n = i25.m6620n(y42.m12841M0(nt2Var3, a05Var));
            if (a91Var == null || (ho4Var = a91Var.f176a) == null) {
                b = 0;
            } else {
                b = 0;
                C0531cl c0531cl = new C0531cl(b);
                c0531cl.f16097b = ho4Var;
                VarHandle.storeStoreFence();
                nt2 nt2VarM6101z = gq6.m6101z(nt2VarM6620n, c0531cl);
                if (nt2VarM6101z != null) {
                    nt2VarM6620n = nt2VarM6101z;
                }
            }
            if (i7 == 256) {
                b = 1;
            }
            Object objM6869O7 = ir1Var2.m6869O();
            Object obj3 = objM6869O7;
            if (b != 0 || objM6869O7 == i50Var) {
                C0655fl c0655fl = new C0655fl();
                c0655fl.f19065a = a91Var;
                VarHandle.storeStoreFence();
                ir1Var2.m6905n0(c0655fl);
                obj3 = c0655fl;
            }
            C0655fl c0655fl2 = (C0655fl) obj3;
            long j = do4Var.f17243c;
            long j2 = do4Var.f17244d;
            long j3 = do4Var.f17245e;
            long j4 = do4Var.f17246f;
            Object objM6869O8 = ir1Var2.m6869O();
            if (objM6869O8 == i50Var) {
                objM6869O8 = new C0515c5((byte) 14);
                ir1Var2.m6905n0(objM6869O8);
            }
            int i8 = (i4 << 15) & 2146959360;
            nt2 nt2Var4 = nt2VarM6620n;
            int i9 = ((i4 >> 9) & 896) | 1600566;
            int i10 = i4 >> 3;
            pg0Var2 = pg0Var;
            xl4Var3 = xl4Var;
            m8342c(nt2Var4, c0655fl2, j, j2, j4, j3, pg0Var2, xl4Var3, xl4Var2, (wp1) objM6869O8, mq1Var, pg0VarM11834R, f, e73Var, ir1Var2, i8, i9 | (i10 & 458752) | (i10 & 29360128) | (i10 & 234881024));
            f2 = f;
            e73Var2 = e73Var;
            ir1 ir1Var4 = ir1Var2;
            ir1Var4.m6912r(true);
            ir1Var = ir1Var4;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0692gl c0692gl = new C0692gl();
            c0692gl.f19839a = nt2Var;
            c0692gl.f19840b = pg0Var2;
            c0692gl.f19841c = xl4Var3;
            c0692gl.f19842d = xl4Var2;
            c0692gl.f19843e = mq1Var;
            c0692gl.f19844f = nq1Var;
            c0692gl.f19845g = f2;
            c0692gl.f19846h = e73Var2;
            c0692gl.f19847i = a05Var;
            c0692gl.f19848j = do4Var;
            c0692gl.f19849k = a91Var;
            c0692gl.f19850l = i;
            c0692gl.f19851m = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0692gl;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8342c(nt2 nt2Var, C0655fl c0655fl, long j, long j2, long j3, long j4, pg0 pg0Var, xl4 xl4Var, xl4 xl4Var2, wp1 wp1Var, mq1 mq1Var, pg0 pg0Var2, float f, e73 e73Var, mi0 mi0Var, int i, int i2) {
        int i3;
        wp1 wp1Var2;
        int i4;
        mq1 mq1Var2;
        pg0 pg0Var3;
        boolean z;
        Object obj;
        pg0 pg0Var4 = pg0Var;
        C0779iz c0779iz = ig1.f21391o;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(239553141);
        InterfaceC0618en interfaceC0618en = ir1Var.f21685a;
        if ((i & 6) == 0) {
            i3 = i | (ir1Var.m6890g(nt2Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? ir1Var.m6890g(c0655fl) : ir1Var.m6894i(c0655fl) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ir1Var.m6888f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ir1Var.m6888f(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ir1Var.m6888f(j3) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= ir1Var.m6888f(j4) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= ir1Var.m6894i(pg0Var4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ir1Var.m6890g(xl4Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= ir1Var.m6894i(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= ir1Var.m6890g(xl4Var2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            wp1Var2 = wp1Var;
            i4 = i2 | (ir1Var.m6894i(wp1Var2) ? 4 : 2);
        } else {
            wp1Var2 = wp1Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ir1Var.m6890g(AbstractC1337xn.f34437d) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ir1Var.m6890g(c0779iz) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ir1Var.m6886e(0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= ir1Var.m6892h(false) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            mq1Var2 = mq1Var;
            i4 |= ir1Var.m6894i(mq1Var2) ? 131072 : 65536;
        } else {
            mq1Var2 = mq1Var;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= ir1Var.m6894i(pg0Var2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= ir1Var.m6884d(f) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= ir1Var.m6890g(e73Var) ? 67108864 : 33554432;
        }
        int i5 = i4;
        if (ir1Var.m6871T(i3 & 1, ((i3 & 306783379) == 306783378 && (38347923 & i5) == 38347922) ? false : true)) {
            boolean z2 = ((i3 & 112) == 32 || ((i3 & 64) != 0 && ir1Var.m6890g(c0655fl))) | ((i5 & 112) == 32) | ((i5 & 896) == 256) | ((i5 & 7168) == 2048) | ((29360128 & i5) == 8388608);
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            Object obj2 = objM6869O;
            if (z2 || objM6869O == i50Var) {
                go4 go4Var = new go4();
                go4Var.f19994a = c0655fl;
                go4Var.f19995b = f;
                go4Var.f19996c = e73Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(go4Var);
                obj2 = go4Var;
            }
            go4 go4Var2 = (go4) obj2;
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2Var);
            bi0.f15310ap.getClass();
            if (interfaceC0618en == null) {
                dt0.m4682E();
                throw 0;
            }
            ir1Var.m6893h0();
            boolean z3 = ir1Var.f21682S;
            da2 da2Var = wf2.f33290T;
            if (z3) {
                ir1Var.m6900l(da2Var);
            } else {
                ir1Var.m6911q0();
            }
            jh0 jh0Var = ia5.f21216g;
            C0006a5.m53I(ir1Var, jh0Var, go4Var2);
            jh0 jh0Var2 = ia5.f21215f;
            C0006a5.m53I(ir1Var, jh0Var2, ga3VarM6902m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jh0 jh0Var3 = ia5.f21217h;
            C0006a5.m53I(ir1Var, jh0Var3, numValueOf);
            C0006a5.m50F(ir1Var);
            jh0 jh0Var4 = ia5.f21214e;
            C0006a5.m53I(ir1Var, jh0Var4, nt2VarM10006A);
            nt2 nt2VarM5653K = AbstractC0647fd.m5653K(qq2.m10041y("navigationIcon"), 4.0f, 0.0f, 0.0f, 0.0f, 14);
            C0853kz c0853kz = ig1.f21378b;
            xq2 xq2VarM9704c = q20.m9704c(c0853kz, false);
            int iHashCode2 = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m2 = ir1Var.m6902m();
            nt2 nt2VarM10006A2 = qq2.m10006A(ir1Var, nt2VarM5653K);
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
            kj0 kj0Var = zl0.f36166a;
            as4.m3244c(kj0Var.mo7523a(pb0.m9462a(j)), mq1Var2, ir1Var, ((i5 >> 12) & 112) | 8);
            ir1Var.m6912r(true);
            ir1Var.m6885d0(408669108);
            nt2 nt2VarM5651I = AbstractC0647fd.m5651I(qq2.m10041y("title"), 4.0f, 0.0f, 2);
            ir1Var.m6885d0(-402447002);
            ir1Var.m6912r(false);
            nt2 nt2VarMo7630d = nt2VarM5651I.mo7630d(kt2.f23428a);
            boolean z4 = (i5 & 14) == 4;
            Object objM6869O2 = ir1Var.m6869O();
            if (z4 || objM6869O2 == i50Var) {
                z = false;
                C0729hl c0729hl = new C0729hl((byte) 0);
                c0729hl.f20669b = wp1Var2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0729hl);
                obj = c0729hl;
            } else {
                z = false;
                obj = objM6869O2;
            }
            nt2 nt2VarM10693F = se0.m10693F(nt2VarMo7630d, (yp1) obj);
            xq2 xq2VarM9704c2 = q20.m9704c(c0853kz, z);
            int iHashCode3 = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m3 = ir1Var.m6902m();
            nt2 nt2VarM10006A3 = qq2.m10006A(ir1Var, nt2VarM10693F);
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
            pg0Var3 = pg0Var2;
            pg0Var4 = pg0Var;
            zt5.m13774e(j2, xl4Var, pg0Var4, ir1Var, ((i3 >> 9) & 14) | ((i3 >> 18) & 112) | ((i3 >> 12) & 896));
            ir1Var.m6912r(true);
            ir1Var.m6912r(false);
            nt2 nt2VarM5653K2 = AbstractC0647fd.m5653K(qq2.m10041y("actionIcons"), 0.0f, 0.0f, 4.0f, 0.0f, 11);
            xq2 xq2VarM9704c3 = q20.m9704c(c0853kz, false);
            int iHashCode4 = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m4 = ir1Var.m6902m();
            nt2 nt2VarM10006A4 = qq2.m10006A(ir1Var, nt2VarM5653K2);
            ir1Var.m6893h0();
            if (ir1Var.f21682S) {
                ir1Var.m6900l(da2Var);
            } else {
                ir1Var.m6911q0();
            }
            C0006a5.m53I(ir1Var, jh0Var, xq2VarM9704c3);
            C0006a5.m53I(ir1Var, jh0Var2, ga3VarM6902m4);
            d55.m4373r(iHashCode4, ir1Var, jh0Var3, ir1Var);
            C0006a5.m53I(ir1Var, jh0Var4, nt2VarM10006A4);
            as4.m3244c(kj0Var.mo7523a(pb0.m9462a(j4)), pg0Var3, ir1Var, 8 | ((i5 >> 15) & 112));
            ir1Var.m6912r(true);
            ir1Var.m6912r(true);
        } else {
            pg0Var3 = pg0Var2;
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0495bl c0495bl = new C0495bl();
            c0495bl.f15378a = nt2Var;
            c0495bl.f15379b = c0655fl;
            c0495bl.f15380c = j;
            c0495bl.f15381d = j2;
            c0495bl.f15382e = j3;
            c0495bl.f15383f = j4;
            c0495bl.f15384g = pg0Var4;
            c0495bl.f15385h = xl4Var;
            c0495bl.f15386i = xl4Var2;
            c0495bl.f15387j = wp1Var;
            c0495bl.f15388k = mq1Var;
            c0495bl.f15389l = pg0Var3;
            c0495bl.f15390m = f;
            c0495bl.f15391n = e73Var;
            c0495bl.f15392o = i;
            c0495bl.f15393p = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0495bl;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: d */
    public static final Object m8343d(ho4 ho4Var, float f, gv0 gv0Var, ag1 ag1Var, ym0 ym0Var) {
        C0876ll c0876ll;
        nl3 nl3Var;
        nl3 nl3Var2;
        if (ym0Var instanceof C0876ll) {
            c0876ll = (C0876ll) ym0Var;
            int i = c0876ll.f24122y;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0876ll.f24122y = i - Integer.MIN_VALUE;
            } else {
                c0876ll = new C0876ll(ym0Var);
            }
        } else {
            c0876ll = new C0876ll(ym0Var);
        }
        C0876ll c0876ll2 = c0876ll;
        Object obj = c0876ll2.f24121x;
        ap0 ap0Var = ap0.f14763a;
        int i2 = c0876ll2.f24122y;
        byte b = 1;
        if (i2 != 0) {
            if (i2 == 1) {
                f = c0876ll2.f24120w;
                nl3 nl3Var3 = c0876ll2.f24119v;
                ag1Var = c0876ll2.f24118u;
                ho4 ho4Var2 = c0876ll2.f24117t;
                k43.m7376J(obj);
                nl3Var = nl3Var3;
                ho4Var = ho4Var2;
            } else {
                if (i2 != 2) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                nl3Var2 = c0876ll2.f24119v;
                k43.m7376J(obj);
            }
            nl3Var = nl3Var2;
            return jx4.m7330a(qs5.m10097b(0.0f, nl3Var.f25933a));
        }
        k43.m7376J(obj);
        if (ho4Var.m6464a() < 0.01f || ho4Var.m6464a() == 1.0f) {
            return jx4.m7330a(0L);
        }
        nl3Var = new nl3();
        nl3Var.f25933a = f;
        if (gv0Var != null && Math.abs(f) > 1.0f) {
            nl3 nl3Var4 = new nl3();
            C0457ak c0457akM7379a = k43.m7379a(0.0f, f, 28);
            C1164t c1164t = new C1164t((byte) 3);
            c1164t.f30700c = nl3Var4;
            c1164t.f30699b = ho4Var;
            c1164t.f30701d = nl3Var;
            VarHandle.storeStoreFence();
            c0876ll2.f24117t = ho4Var;
            c0876ll2.f24118u = ag1Var;
            c0876ll2.f24119v = nl3Var;
            c0876ll2.f24120w = f;
            c0876ll2.f24122y = 1;
            if (qs5.m10105j(c0457akM7379a, gv0Var, false, c1164t, c0876ll2) != ap0Var) {
            }
            return ap0Var;
        }
        return jx4.m7330a(qs5.m10097b(0.0f, nl3Var.f25933a));
        if (ag1Var != null) {
            z73 z73Var = ho4Var.f20759d;
            if (z73Var.m13399h() < 0.0f && z73Var.m13399h() > ho4Var.f20756a) {
                C0457ak c0457akM7379a2 = k43.m7379a(z73Var.m13399h(), 0.0f, 30);
                Float f2 = new Float(ho4Var.m6464a() < 0.5f ? 0.0f : ho4Var.f20756a);
                C0531cl c0531cl = new C0531cl(b);
                c0531cl.f16097b = ho4Var;
                VarHandle.storeStoreFence();
                c0876ll2.f24117t = null;
                c0876ll2.f24118u = null;
                c0876ll2.f24119v = nl3Var;
                c0876ll2.f24120w = f;
                c0876ll2.f24122y = 2;
                if (qs5.m10107l(c0457akM7379a2, f2, ag1Var, c0531cl, c0876ll2, 4) != ap0Var) {
                    nl3Var2 = nl3Var;
                    nl3Var = nl3Var2;
                }
                return ap0Var;
            }
        }
        return jx4.m7330a(qs5.m10097b(0.0f, nl3Var.f25933a));
    }
}
