package p000;

import java.lang.invoke.VarHandle;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class k91 {

    /* JADX INFO: renamed from: a */
    public static final sq4 f23003a = sw4.m10941a(C1035pi.f27619q, C1035pi.f27620r);

    /* JADX INFO: renamed from: b */
    public static final db4 f23004b = qq2.m10014I(0.0f, 400.0f, null, 5);

    /* JADX INFO: renamed from: c */
    public static final db4 f23005c = qq2.m10014I(0.0f, 400.0f, null, 5);

    /* JADX INFO: renamed from: d */
    public static final db4 f23006d;

    /* JADX INFO: renamed from: e */
    public static final db4 f23007e;

    static {
        Map map = wy4.f33864a;
        f23006d = qq2.m10014I(0.0f, 400.0f, o52.m8954a(4294967297L), 1);
        f23007e = qq2.m10014I(0.0f, 400.0f, w52.m12106a(4294967297L), 1);
    }

    /* JADX INFO: renamed from: a */
    public static final void m7436a(dp4 dp4Var, wp1 wp1Var, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1186853286);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(dp4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6894i(wp1Var) ? 32 : 16;
        }
        if (ir1Var.m6871T(i2 & 1, (i2 & 19) != 18)) {
            d83 d83Var = dp4Var.f17262e;
            d83 d83Var2 = dp4Var.f17261d;
            boolean z = d83Var.getValue() != null;
            if (z62.m13387o(dp4Var.f17258a.mo11188l(), d83Var2.getValue()) && !z) {
                wp1Var.invoke();
            }
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            Object obj = objM6869O;
            if (objM6869O == i50Var) {
                boolean[] zArr = {z};
                ir1Var.m6905n0(zArr);
                obj = zArr;
            }
            boolean[] zArr2 = (boolean[]) obj;
            Object objM6869O2 = ir1Var.m6869O();
            if (objM6869O2 == i50Var) {
                objM6869O2 = new Object[1];
                ir1Var.m6905n0(objM6869O2);
            }
            Object[] objArr = (Object[]) objM6869O2;
            if (!z62.m13387o(objArr[0], d83Var2.getValue())) {
                if (!z && !zArr2[0]) {
                    wp1Var.invoke();
                }
                objArr[0] = d83Var2.getValue();
            }
            zArr2[0] = z;
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            yk3VarM6916v.f35300d = new e91(dp4Var, wp1Var, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final nt2 m7437b(dp4 dp4Var, p91 p91Var, mc1 mc1Var, b54 b54Var, String str, mi0 mi0Var, int i, int i2) {
        p91 p91VarM7442g;
        ir1 ir1Var;
        mc1 mc1VarM7443h;
        ir1 ir1Var2;
        z70 z70Var;
        cp4 cp4Var;
        yo4 yo4VarM13687s;
        yo4 yo4Var;
        yo4 yo4VarM13687s2;
        yo4 yo4Var2;
        yo4 yo4VarM13687s3;
        z70 z70Var2;
        dp4 dp4Var2;
        yo4 yo4Var3;
        p91 p91Var2;
        kt2 kt2Var;
        nt2 nt2Var;
        nt2 nt2Var2;
        yo4 yo4Var4;
        boolean z;
        yo4 yo4VarM13687s4;
        dp4 dp4Var3;
        yo4 yo4VarM13687s5;
        ir1 ir1Var3;
        byte b = 1;
        boolean z2 = (i2 & 4) != 0;
        ir1 ir1Var4 = (ir1) mi0Var;
        Object objM6869O = ir1Var4.m6869O();
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            objM6869O = b41.f15073k;
            ir1Var4.m6905n0(objM6869O);
        }
        wp1 wp1Var = (wp1) objM6869O;
        b54 b54Var2 = (i2 & 16) != 0 ? null : b54Var;
        if (z2) {
            ir1Var = (ir1) mi0Var;
            ir1Var.m6885d0(-1491184033);
            p91VarM7442g = m7442g(dp4Var, p91Var, ir1Var, 0);
        } else {
            p91VarM7442g = p91Var;
            ir1Var = (ir1) mi0Var;
            ir1Var.m6885d0(-1491182875);
        }
        ir1Var.m6912r(false);
        p91 p91Var3 = p91VarM7442g;
        if (z2) {
            ir1Var2 = (ir1) mi0Var;
            ir1Var2.m6885d0(-1491181156);
            mc1VarM7443h = m7443h(dp4Var, mc1Var, ir1Var2, 0);
        } else {
            mc1VarM7443h = mc1Var;
            ir1Var2 = (ir1) mi0Var;
            ir1Var2.m6885d0(-1491180092);
        }
        ir1Var2.m6912r(false);
        mc1 mc1Var2 = mc1VarM7443h;
        ir1 ir1Var5 = (ir1) mi0Var;
        if (b54Var2 == null) {
            ir1Var5.m6885d0(-968938819);
            boolean zM6890g = ir1Var5.m6890g(dp4Var);
            Object objM6869O2 = ir1Var5.m6869O();
            if (zM6890g || objM6869O2 == i50Var) {
                objM6869O2 = new b54();
                ir1Var5.m6905n0(objM6869O2);
            }
            b54Var2 = (b54) objM6869O2;
        } else {
            ir1Var5.m6885d0(-31257052);
        }
        ir1Var5.m6912r(false);
        b54 b54Var3 = b54Var2;
        b54Var3.m3458c(dp4Var.f17262e.getValue() != null);
        ir1 ir1Var6 = (ir1) mi0Var;
        boolean zM6894i = ir1Var6.m6894i(b54Var3);
        Object objM6869O3 = ir1Var6.m6869O();
        if (zM6894i || objM6869O3 == i50Var) {
            objM6869O3 = new h91(b54Var3, b);
            ir1Var6.m6905n0(objM6869O3);
        }
        m7436a(dp4Var, (wp1) objM6869O3, ir1Var6, 0);
        cp4 cp4Var2 = p91Var3.f27464a;
        z70 z70Var3 = cp4Var2.f16336c;
        cp4 cp4Var3 = mc1Var2.f24813a;
        cp4 cp4Var4 = mc1Var2.f24813a;
        boolean zM12408a = ws4.m12408a(b54Var3.f15093e, pb0.f27500g);
        boolean z3 = (cp4Var2.f16335b == null && cp4Var4.f16335b == null && o52.m8956c(b54Var3.f15097i, 0L)) ? false : true;
        boolean z4 = (z70Var3 == null && cp4Var4.f16336c == null) ? false : true;
        if (z3) {
            ir1Var6.m6885d0(1018653691);
            sq4 sq4Var = sw4.f30618g;
            Object objM6869O4 = ir1Var6.m6869O();
            if (objM6869O4 == i50Var) {
                objM6869O4 = str.concat(" slide");
                ir1Var6.m6905n0(objM6869O4);
            }
            z70Var = z70Var3;
            cp4Var = cp4Var4;
            yo4VarM13687s = zp0.m13687s(dp4Var, sq4Var, (String) objM6869O4, ir1Var6, 384, 0);
            ir1Var6.m6912r(false);
        } else {
            z70Var = z70Var3;
            cp4Var = cp4Var4;
            ir1Var6.m6885d0(1018759494);
            ir1Var6.m6912r(false);
            yo4VarM13687s = null;
        }
        if (z4) {
            ir1Var6.m6885d0(1018851285);
            yo4 yo4Var5 = yo4VarM13687s;
            sq4 sq4Var2 = sw4.f30619h;
            Object objM6869O5 = ir1Var6.m6869O();
            if (objM6869O5 == i50Var) {
                objM6869O5 = str.concat(" shrink/expand");
                ir1Var6.m6905n0(objM6869O5);
            }
            yo4Var = yo4Var5;
            yo4VarM13687s2 = zp0.m13687s(dp4Var, sq4Var2, (String) objM6869O5, ir1Var6, 384, 0);
            ir1Var6.m6912r(false);
        } else {
            yo4Var = yo4VarM13687s;
            ir1Var6.m6885d0(1018962109);
            ir1Var6.m6912r(false);
            yo4VarM13687s2 = null;
        }
        if (z4 != 0) {
            ir1Var6.m6885d0(1019035735);
            yo4 yo4Var6 = yo4VarM13687s2;
            sq4 sq4Var3 = sw4.f30618g;
            Object objM6869O6 = ir1Var6.m6869O();
            if (objM6869O6 == i50Var) {
                objM6869O6 = str.concat(" InterruptionHandlingOffset");
                ir1Var6.m6905n0(objM6869O6);
            }
            yo4Var2 = yo4Var6;
            yo4VarM13687s3 = zp0.m13687s(dp4Var, sq4Var3, (String) objM6869O6, ir1Var6, 384, 0);
            ir1Var6.m6912r(false);
        } else {
            yo4Var2 = yo4VarM13687s2;
            ir1Var6.m6885d0(1019206141);
            ir1Var6.m6912r(false);
            yo4VarM13687s3 = null;
        }
        boolean z5 = ((z70Var == null || z70Var.f35802d) && ((z70Var2 = cp4Var.f16336c) == null || z70Var2.f35802d) && z4) ? false : true;
        qp3 qp3Var = oc0.f26551e;
        kt2 kt2Var2 = kt2.f23428a;
        if (zM12408a) {
            dp4Var2 = dp4Var;
            yo4Var3 = yo4VarM13687s3;
            p91Var2 = p91Var3;
            kt2Var = kt2Var2;
            ir1Var6.m6885d0(1020031362);
            ir1Var6.m6912r(false);
            nt2Var = kt2Var;
        } else {
            ir1Var6.m6885d0(1019733235);
            yo4 yo4Var7 = yo4VarM13687s3;
            sq4 sq4VarM10941a = sw4.m10941a(C1035pi.f27617o, new C1183ti(qp3Var, (byte) 2));
            Object objM6869O7 = ir1Var6.m6869O();
            if (objM6869O7 == i50Var) {
                objM6869O7 = str.concat(" veil");
                ir1Var6.m6905n0(objM6869O7);
            }
            String str2 = (String) objM6869O7;
            yo4Var3 = yo4Var7;
            kt2Var = kt2Var2;
            dp4Var2 = dp4Var;
            yo4 yo4VarM13687s6 = zp0.m13687s(dp4Var2, sq4VarM10941a, str2, ir1Var6, 384, 0);
            gx4 gx4Var = new gx4();
            gx4Var.f20175a = dp4Var2;
            gx4Var.f20176b = yo4VarM13687s6;
            p91Var2 = p91Var3;
            gx4Var.f20177c = p91Var2;
            gx4Var.f20178d = mc1Var2;
            gx4Var.f20179e = b54Var3;
            VarHandle.storeStoreFence();
            ir1Var6.m6912r(false);
            nt2Var = gx4Var;
        }
        boolean z6 = (cp4Var2.f16334a == null && cp4Var.f16334a == null && b54Var3.f15094f == 1.0f) ? false : true;
        boolean z7 = (cp4Var2.f16337d == null && cp4Var.f16337d == null && b54Var3.f15095g == 1.0f) ? false : true;
        if (z6) {
            ir1Var6.m6885d0(-1511865571);
            sq4 sq4Var4 = sw4.f30612a;
            Object objM6869O8 = ir1Var6.m6869O();
            if (objM6869O8 == i50Var) {
                objM6869O8 = str.concat(" alpha");
                ir1Var6.m6905n0(objM6869O8);
            }
            nt2Var2 = nt2Var;
            yo4 yo4VarM13687s7 = zp0.m13687s(dp4Var2, sq4Var4, (String) objM6869O8, ir1Var6, 384, 0);
            ir1Var6.m6912r(false);
            yo4Var4 = yo4VarM13687s7;
        } else {
            nt2Var2 = nt2Var;
            ir1Var6.m6885d0(-1511696126);
            ir1Var6.m6912r(false);
            yo4Var4 = null;
        }
        nt2 nt2Var3 = nt2Var2;
        p91 p91Var4 = p91Var2;
        if (z7) {
            ir1Var6.m6885d0(-1511628483);
            sq4 sq4Var5 = sw4.f30612a;
            Object objM6869O9 = ir1Var6.m6869O();
            if (objM6869O9 == i50Var) {
                objM6869O9 = str.concat(" scale");
                ir1Var6.m6905n0(objM6869O9);
            }
            yo4VarM13687s4 = zp0.m13687s(dp4Var, sq4Var5, (String) objM6869O9, ir1Var6, 384, 0);
            z = false;
            ir1Var6.m6912r(false);
        } else {
            z = false;
            ir1Var6.m6885d0(-1511459038);
            ir1Var6.m6912r(false);
            yo4VarM13687s4 = null;
        }
        if (z7) {
            ir1Var6.m6885d0(-1511381382);
            yo4VarM13687s5 = zp0.m13687s(dp4Var, f23003a, "TransformOriginInterruptionHandling", ir1Var6, 384, 0);
            dp4Var3 = dp4Var;
            ir1 ir1Var7 = ir1Var6;
            ir1Var7.m6912r(z);
            ir1Var3 = ir1Var7;
        } else {
            dp4Var3 = dp4Var;
            ir1 ir1Var8 = ir1Var6;
            ir1Var8.m6885d0(-1511209054);
            ir1Var8.m6912r(z);
            yo4VarM13687s5 = null;
            ir1Var3 = ir1Var8;
        }
        boolean zM6894i2 = ir1Var3.m6894i(yo4Var4) | ir1Var3.m6890g(p91Var4) | ir1Var3.m6890g(mc1Var2) | ir1Var3.m6894i(b54Var3) | ir1Var3.m6894i(yo4VarM13687s4) | ir1Var3.m6890g(dp4Var3) | ir1Var3.m6894i(yo4VarM13687s5);
        Object objM6869O10 = ir1Var3.m6869O();
        Object obj = objM6869O10;
        if (zM6894i2 || objM6869O10 == i50Var) {
            d91 d91Var = new d91();
            d91Var.f16867a = yo4Var4;
            d91Var.f16868b = b54Var3;
            d91Var.f16869c = yo4VarM13687s4;
            d91Var.f16870d = dp4Var3;
            d91Var.f16871e = p91Var4;
            d91Var.f16872f = mc1Var2;
            d91Var.f16873g = yo4VarM13687s5;
            VarHandle.storeStoreFence();
            ir1Var3.m6905n0(d91Var);
            obj = d91Var;
        }
        d91 d91Var2 = (d91) obj;
        boolean zM6894i3 = ir1Var3.m6894i(b54Var3);
        Object objM6869O11 = ir1Var3.m6869O();
        if (zM6894i3 || objM6869O11 == i50Var) {
            objM6869O11 = new h91(b54Var3, (byte) 0);
            ir1Var3.m6905n0(objM6869O11);
        }
        qt2 qt2Var = new qt2();
        qt2Var.f28786r = s94.m10566b((wp1) objM6869O11);
        VarHandle.storeStoreFence();
        nt2 nt2VarMo7630d = qt2Var.mo7630d(kt2Var);
        boolean zM6892h = ir1Var3.m6892h(z5) | ir1Var3.m6890g(wp1Var);
        Object objM6869O12 = ir1Var3.m6869O();
        if (zM6892h || objM6869O12 == i50Var) {
            objM6869O12 = new i91(z5, wp1Var);
            ir1Var3.m6905n0(objM6869O12);
        }
        nt2 nt2VarMo7630d2 = nt2VarMo7630d.mo7630d(se0.m10693F(kt2Var, (yp1) objM6869O12));
        c91 c91Var = new c91();
        c91Var.f15883a = dp4Var3;
        c91Var.f15884b = yo4Var2;
        c91Var.f15885c = yo4Var3;
        c91Var.f15886d = yo4Var;
        c91Var.f15887e = p91Var4;
        c91Var.f15888f = mc1Var2;
        c91Var.f15889g = b54Var3;
        c91Var.f15890h = wp1Var;
        c91Var.f15891i = d91Var2;
        VarHandle.storeStoreFence();
        return nt2VarMo7630d2.mo7630d(c91Var).mo7630d(nt2Var3);
    }

    /* JADX INFO: renamed from: c */
    public static p91 m7438c(ag1 ag1Var, int i) {
        if ((i & 1) != 0) {
            ag1Var = qq2.m10014I(0.0f, 400.0f, null, 5);
        }
        return new p91(new cp4(new xc1(0.0f, ag1Var), (t74) null, (z70) null, (rv3) null, (LinkedHashMap) null, 126));
    }

    /* JADX INFO: renamed from: d */
    public static mc1 m7439d(ag1 ag1Var, int i) {
        if ((i & 1) != 0) {
            ag1Var = qq2.m10014I(0.0f, 400.0f, null, 5);
        }
        return new mc1(new cp4(new xc1(0.0f, ag1Var), (t74) null, (z70) null, (rv3) null, (LinkedHashMap) null, 126));
    }

    /* JADX INFO: renamed from: e */
    public static p91 m7440e(ag1 ag1Var, float f, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return new p91(new cp4((xc1) null, (t74) null, (z70) null, new rv3(f, to4.f31292b, ag1Var), (LinkedHashMap) null, 119));
    }

    /* JADX INFO: renamed from: f */
    public static mc1 m7441f(ag1 ag1Var, float f, int i) {
        if ((i & 1) != 0) {
            ag1Var = qq2.m10014I(0.0f, 400.0f, null, 5);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return new mc1(new cp4((xc1) null, (t74) null, (z70) null, new rv3(f, to4.f31292b, ag1Var), (LinkedHashMap) null, 119));
    }

    /* JADX INFO: renamed from: g */
    public static final p91 m7442g(dp4 dp4Var, p91 p91Var, mi0 mi0Var, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((ir1) mi0Var).m6890g(dp4Var)) || (i & 6) == 4;
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        if (z || objM6869O == ki0.f23136a) {
            objM6869O = k43.m7398w(p91Var);
            ir1Var.m6905n0(objM6869O);
        }
        sw2 sw2Var = (sw2) objM6869O;
        zh0 zh0Var = dp4Var.f17258a;
        d83 d83Var = dp4Var.f17261d;
        if (zh0Var.mo11188l() == d83Var.getValue() && dp4Var.f17258a.mo11188l() == b91.f15169b) {
            if (dp4Var.m4648j()) {
                sw2Var.setValue(p91Var);
            } else {
                sw2Var.setValue(p91.f27463b);
            }
        } else if (d83Var.getValue() != b91.f15170c) {
            sw2Var.setValue(((p91) sw2Var.getValue()).m9439a(p91Var));
        }
        return (p91) sw2Var.getValue();
    }

    /* JADX INFO: renamed from: h */
    public static final mc1 m7443h(dp4 dp4Var, mc1 mc1Var, mi0 mi0Var, int i) {
        t74 t74Var;
        z70 z70Var;
        boolean z = (((i & 14) ^ 6) > 4 && ((ir1) mi0Var).m6890g(dp4Var)) || (i & 6) == 4;
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (z || objM6869O == i50Var) {
            objM6869O = k43.m7398w(mc1Var);
            ir1Var.m6905n0(objM6869O);
        }
        sw2 sw2Var = (sw2) objM6869O;
        zh0 zh0Var = dp4Var.f17258a;
        d83 d83Var = dp4Var.f17261d;
        if (zh0Var.mo11188l() == d83Var.getValue() && dp4Var.f17258a.mo11188l() == b91.f15169b) {
            ir1Var.m6885d0(-505142498);
            ir1Var.m6912r(false);
            if (dp4Var.m4648j()) {
                sw2Var.setValue(mc1Var);
            } else {
                sw2Var.setValue(mc1.f24811b);
            }
        } else if (d83Var.getValue() != b91.f15169b) {
            ir1Var.m6885d0(-504838512);
            xc1 xc1Var = ((mc1) sw2Var.getValue()).f24813a.f16334a;
            xc1 xc1Var2 = xc1Var != null ? new xc1(1.0f, xc1Var.f34149b) : null;
            rv3 rv3Var = ((mc1) sw2Var.getValue()).f24813a.f16337d;
            rv3 rv3Var2 = rv3Var != null ? new rv3(1.0f, rv3Var.f29667b, rv3Var.f29668c) : null;
            t74 t74Var2 = ((mc1) sw2Var.getValue()).f24813a.f16335b;
            if (t74Var2 == null) {
                ir1Var.m6885d0(-504119809);
                ir1Var.m6912r(false);
                t74Var = null;
            } else {
                ir1Var.m6885d0(-708998590);
                Object objM6869O2 = ir1Var.m6869O();
                if (objM6869O2 == i50Var) {
                    objM6869O2 = C1035pi.f27622t;
                    ir1Var.m6905n0(objM6869O2);
                }
                t74 t74Var3 = new t74((yp1) objM6869O2, t74Var2.f30977b);
                ir1Var.m6912r(false);
                t74Var = t74Var3;
            }
            z70 z70Var2 = ((mc1) sw2Var.getValue()).f24813a.f16336c;
            if (z70Var2 == null) {
                ir1Var.m6885d0(-504024174);
                ir1Var.m6912r(false);
                z70Var = null;
            } else {
                ir1Var.m6885d0(-708995505);
                Object objM6869O3 = ir1Var.m6869O();
                if (objM6869O3 == i50Var) {
                    objM6869O3 = C1035pi.f27623u;
                    ir1Var.m6905n0(objM6869O3);
                }
                z70 z70Var3 = new z70(z70Var2.f35799a, (yp1) objM6869O3, z70Var2.f35801c, z70Var2.f35802d);
                ir1Var.m6912r(false);
                z70Var = z70Var3;
            }
            cp4 cp4Var = ((mc1) sw2Var.getValue()).f24813a;
            sw2Var.setValue(new mc1(new cp4(xc1Var2, t74Var, z70Var, rv3Var2, (LinkedHashMap) null, 96)).m8273a(mc1Var));
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6885d0(-503833306);
            ir1Var.m6912r(false);
        }
        return (mc1) sw2Var.getValue();
    }
}
