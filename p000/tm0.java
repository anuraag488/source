package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class tm0 {

    /* JADX INFO: renamed from: a */
    public static final om0 f31236a;

    static {
        pz3 pz3Var = pz3.f28106a;
        kj0 kj0Var = AbstractC1217uf.f31816a;
        pz3 pz3Var2 = pz3.f28106a;
        pz3 pz3Var3 = pz3.f28106a;
        long j = pb0.f27497d;
        long j2 = pb0.f27495b;
        long jM9464c = pb0.m9464c(j2, 0.38f, 0.0f, 0.0f, 0.0f, 14);
        long jM9464c2 = pb0.m9464c(j2, 0.38f, 0.0f, 0.0f, 0.0f, 14);
        om0 om0Var = new om0();
        om0Var.f26872a = j;
        om0Var.f26873b = j2;
        om0Var.f26874c = j2;
        om0Var.f26875d = jM9464c;
        om0Var.f26876e = jM9464c2;
        VarHandle.storeStoreFence();
        f31236a = om0Var;
    }

    /* JADX INFO: renamed from: a */
    public static final void m11061a(om0 om0Var, nt2 nt2Var, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        nt2 nt2VarMo7630d;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-527864079);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(om0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(nt2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 256 : 128;
        }
        if (ir1Var.m6871T(i2 & 1, (i2 & 147) != 146)) {
            C0816jz c0816jz = qm0.f28562a;
            fr3 fr3VarM6151a = gr3.m6151a(4.0f);
            boolean z = p11.m9351b(3.0f, 0.0f) > 0;
            long j = eu1.f18488a;
            if (p11.m9351b(3.0f, 0.0f) > 0 || z) {
                n44 n44Var = new n44();
                n44Var.f25444a = 3.0f;
                n44Var.f25445b = fr3VarM6151a;
                n44Var.f25446c = z;
                n44Var.f25447d = j;
                n44Var.f25448e = j;
                VarHandle.storeStoreFence();
                nt2VarMo7630d = nt2Var.mo7630d(n44Var);
            } else {
                nt2VarMo7630d = nt2Var;
            }
            nt2 nt2VarM3258q = as4.m3258q(nt2VarMo7630d, om0Var.f26872a, k43.f22879x);
            u62 u62Var = u62.f31672a;
            nt2 nt2VarM5651I = AbstractC0647fd.m5651I(y62.m12980l0(nt2VarM3258q), 0.0f, qm0.f28565d, 1);
            Object[] objArr = new Object[0];
            yg3 yg3Var = wx3.f33827k;
            boolean zM6886e = ir1Var.m6886e(0);
            Object objM6869O = ir1Var.m6869O();
            if (zM6886e || objM6869O == ki0.f23136a) {
                objM6869O = new nu3((byte) 3);
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(objM6869O);
            }
            wx3 wx3Var = (wx3) dt0.m4688Q(objArr, yg3Var, (wp1) objM6869O, ir1Var, 0);
            nt2 nt2VarMo7630d2 = nt2VarM5651I.mo7630d(i25.m6619m(kt2.f23428a, ix1.f21856c)).mo7630d(new xx3(null, null, null, wx3Var.f33832e, d63.f16814a, wx3Var, true, true));
            qy3 qy3Var = new qy3();
            qy3Var.f28893a = wx3Var;
            qy3Var.f28894b = true;
            VarHandle.storeStoreFence();
            nt2 nt2VarMo7630d3 = nt2VarMo7630d2.mo7630d(qy3Var);
            int i3 = (i2 << 3) & 7168;
            id0 id0VarM6333a = hd0.m6333a(AbstractC1337xn.f34436c, ig1.f21390n, ir1Var, 0);
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarMo7630d3);
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
            C0006a5.m53I(ir1Var, ia5.f21216g, id0VarM6333a);
            C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
            C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
            C0006a5.m50F(ir1Var);
            C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
            pg0Var.invoke(jd0.f22171a, ir1Var, Integer.valueOf(((i3 >> 6) & 112) | 6));
            ir1Var.m6912r(true);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1403zf c1403zf = new C1403zf((byte) 4);
            c1403zf.f36036c = om0Var;
            c1403zf.f36037d = nt2Var;
            c1403zf.f36038e = pg0Var;
            c1403zf.f36035b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1403zf;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m11062b(nt2 nt2Var, om0 om0Var, yp1 yp1Var, mi0 mi0Var, int i, int i2) {
        int i3;
        int i4;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = i | (ir1Var.m6890g(nt2Var) ? 4 : 2);
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (ir1Var.m6890g(om0Var) ? 32 : 16);
        }
        int i7 = i4 | (ir1Var.m6894i(yp1Var) ? 256 : 128);
        if (ir1Var.m6871T(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                nt2Var = kt2.f23428a;
            }
            if (i6 != 0) {
                om0Var = f31236a;
            }
            up4 up4Var = new up4((byte) 3);
            up4Var.f32065b = yp1Var;
            up4Var.f32066c = om0Var;
            VarHandle.storeStoreFence();
            m11061a(om0Var, nt2Var, vd6.m11834R(-250345048, up4Var, ir1Var), ir1Var, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            rm0 rm0Var = new rm0((byte) 0);
            rm0Var.f29407c = nt2Var;
            rm0Var.f29408d = om0Var;
            rm0Var.f29409e = yp1Var;
            rm0Var.f29406b = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = rm0Var;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m11063c(String str, boolean z, om0 om0Var, nt2 nt2Var, nq1 nq1Var, wp1 wp1Var, mi0 mi0Var, int i) {
        int i2;
        byte b;
        Object obj;
        String str2 = str;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-2001167027);
        InterfaceC0618en interfaceC0618en = ir1Var.f21685a;
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(str2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6892h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6890g(om0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6890g(nt2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ir1Var.m6894i(nq1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ir1Var.m6894i(wp1Var) ? 131072 : 65536;
        }
        if (ir1Var.m6871T(i2 & 1, (74899 & i2) != 74898)) {
            C0816jz c0816jz = qm0.f28562a;
            float f = qm0.f28564c;
            C1225un c1225unM12718d = AbstractC1337xn.m12718d(f);
            boolean z2 = ((i2 & 112) == 32) | ((458752 & i2) == 131072);
            Object objM6869O = ir1Var.m6869O();
            if (z2 || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                sm0 sm0Var = new sm0((byte) 0);
                sm0Var.f30391b = z;
                sm0Var.f30392c = wp1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(sm0Var);
                obj = sm0Var;
            }
            obj = objM6869O;
            nt2 nt2VarM5651I = AbstractC0647fd.m5651I(n74.m8581i(n74.m8574b(kx5.m7745z(nt2Var, z, str2, (wp1) obj, 12), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), f, 0.0f, 2);
            pr3 pr3VarM9243a = or3.m9243a(c1225unM12718d, c0816jz, ir1Var, 54);
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM5651I);
            bi0.f15310ap.getClass();
            if (interfaceC0618en == null) {
                dt0.m4682E();
                throw null;
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
            C0006a5.m53I(ir1Var, jh0Var, pr3VarM9243a);
            jh0 jh0Var2 = ia5.f21215f;
            C0006a5.m53I(ir1Var, jh0Var2, ga3VarM6902m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jh0 jh0Var3 = ia5.f21217h;
            C0006a5.m53I(ir1Var, jh0Var3, numValueOf);
            C0006a5.m50F(ir1Var);
            jh0 jh0Var4 = ia5.f21214e;
            C0006a5.m53I(ir1Var, jh0Var4, nt2VarM10006A);
            if (nq1Var == null) {
                ir1Var.m6885d0(-1597947094);
                ir1Var.m6912r(false);
            } else {
                ir1Var.m6885d0(-1597947093);
                float f2 = qm0.f28566e;
                nt2 nt2VarM8578f = n74.m8578f(kt2.f23428a, f2, 0.0f, f2, f2, 2);
                xq2 xq2VarM9704c = q20.m9704c(ig1.f21378b, false);
                int iHashCode2 = Long.hashCode(ir1Var.f21683T);
                ga3 ga3VarM6902m2 = ir1Var.m6902m();
                nt2 nt2VarM10006A2 = qq2.m10006A(ir1Var, nt2VarM8578f);
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
                nq1Var.invoke(pb0.m9462a(z ? om0Var.f26874c : om0Var.f26876e), ir1Var, 0);
                ir1Var.m6912r(true);
                ir1Var.m6912r(false);
            }
            str2 = str;
            b = 1;
            c20.m3807b(str2, new lg2(1.0f, true), new xl4(z ? om0Var.f26873b : om0Var.f26875d, qm0.f28569h, qm0.f28570i, qm0.f28572k, 0L, qm0.f28563b, qm0.f28571j, 16613240), 0, false, 1, 0, ir1Var, (i2 & 14) | 1572864, 952);
            ir1Var.m6912r(true);
        } else {
            b = 1;
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1014oy c1014oy = new C1014oy(b);
            c1014oy.f27199d = str2;
            c1014oy.f27197b = z;
            c1014oy.f27200e = om0Var;
            c1014oy.f27201f = nt2Var;
            c1014oy.f27202g = nq1Var;
            c1014oy.f27203h = wp1Var;
            c1014oy.f27198c = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1014oy;
        }
    }
}
