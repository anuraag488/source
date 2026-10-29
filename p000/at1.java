package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class at1 implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f14854a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f14855b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f14856c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f14857d;

    public /* synthetic */ at1(byte b) {
        this.f14854a = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) throws IllegalAccessException, InvocationTargetException {
        Object obj4;
        Object obj5;
        pg0 pg0Var;
        Object obj6;
        wf4 wf4Var;
        xx2 xx2Var;
        byte b = this.f14854a;
        byte b2 = 3;
        da2 da2Var = wf2.f33290T;
        kt2 kt2Var = kt2.f23428a;
        i50 i50Var = ki0.f23136a;
        ju4 ju4Var = ju4.f22634a;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        switch (b) {
            case 0:
                lv1 lv1Var = (lv1) this.f14855b;
                yp1 yp1Var = (yp1) this.f14856c;
                xs1 xs1Var = (xs1) this.f14857d;
                yp1 yp1Var2 = (yp1) obj;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((ir1) mi0Var).m6894i(yp1Var2) ? 4 : 2;
                }
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    Object objM6869O = ir1Var.m6869O();
                    if (objM6869O == i50Var) {
                        obj4 = objM6869O;
                        C0910mi c0910miM4700c = dt0.m4700c(0.0f);
                        ir1Var.m6905n0(c0910miM4700c);
                        obj4 = c0910miM4700c;
                    }
                    obj4 = objM6869O;
                    C0910mi c0910mi = (C0910mi) obj4;
                    Object objM6869O2 = ir1Var.m6869O();
                    Object obj7 = objM6869O2;
                    if (objM6869O2 == i50Var) {
                        C0910mi c0910miM4700c2 = dt0.m4700c(r8);
                        ir1Var.m6905n0(c0910miM4700c2);
                        obj7 = c0910miM4700c2;
                    }
                    C0910mi c0910mi2 = (C0910mi) obj7;
                    boolean zM6890g = ((iIntValue & 14) == 4) | ir1Var.m6890g(lv1Var) | ir1Var.m6894i(c0910mi2) | ir1Var.m6894i(c0910mi) | ir1Var.m6890g(yp1Var) | ir1Var.m6894i(xs1Var);
                    Object objM6869O3 = ir1Var.m6869O();
                    if (zM6890g || objM6869O3 == i50Var) {
                        objM6869O3 = new C0667fx(c0910mi, yp1Var2, lv1Var, c0910mi2, yp1Var, xs1Var, null);
                        ir1Var.m6905n0(objM6869O3);
                    }
                    lb5.m7926g(ir1Var, (mq1) objM6869O3, ju4Var);
                    vf1 vf1Var = n74.f25506c;
                    xq2 xq2VarM9704c = q20.m9704c(ig1.f21382f, false);
                    int iHashCode = Long.hashCode(ir1Var.f21683T);
                    ga3 ga3VarM6902m = ir1Var.m6902m();
                    nt2 nt2VarM10006A = qq2.m10006A(ir1Var, vf1Var);
                    bi0.f15310ap.getClass();
                    if (ir1Var.f21685a == null) {
                        dt0.m4682E();
                        throw null;
                    }
                    ir1Var.m6893h0();
                    if (ir1Var.f21682S) {
                        ir1Var.m6900l(da2Var);
                    } else {
                        ir1Var.m6911q0();
                    }
                    C0006a5.m53I(ir1Var, ia5.f21216g, xq2VarM9704c);
                    C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
                    C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
                    C0006a5.m50F(ir1Var);
                    C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
                    nt2 nt2VarM7386h = k43.m7386h(n74.m8574b(kt2Var, 1.0f));
                    boolean zM6894i = ir1Var.m6894i(c0910mi) | ir1Var.m6894i(c0910mi2);
                    Object objM6869O4 = ir1Var.m6869O();
                    Object obj8 = objM6869O4;
                    if (zM6894i || objM6869O4 == i50Var) {
                        na1 na1Var = new na1((byte) 6);
                        na1Var.f25595b = c0910mi;
                        na1Var.f25596c = c0910mi2;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(na1Var);
                        obj8 = na1Var;
                    }
                    nt2 nt2VarM10693F = se0.m10693F(nt2VarM7386h, (yp1) obj8);
                    g12 g12VarM5449e = c20.f15772n;
                    if (g12VarM5449e == null) {
                        f12 f12Var = new f12("Filled.Favorite", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i = uw4.f32218a;
                        ga4 ga4Var = new ga4(pb0.f27495b);
                        tv1 tv1Var = new tv1((byte) 1);
                        tv1Var.m11175k(12.0f, 21.35f);
                        tv1Var.m11174j(-1.45f, -1.32f);
                        tv1Var.m11169e(5.4f, 15.36f, 2.0f, 12.28f, 2.0f, 8.5f);
                        tv1Var.m11169e(2.0f, 5.42f, 4.42f, 3.0f, 7.5f, 3.0f);
                        tv1Var.m11170f(1.74f, 0.0f, 3.41f, 0.81f, 4.5f, 2.09f);
                        tv1Var.m11169e(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f);
                        tv1Var.m11169e(19.58f, 3.0f, 22.0f, 5.42f, 22.0f, 8.5f);
                        tv1Var.m11170f(0.0f, 3.78f, -3.4f, 6.86f, -8.55f, 11.54f);
                        tv1Var.m11173i(12.0f, 21.35f);
                        tv1Var.m11168d();
                        f12.m5445c(f12Var, tv1Var.f31466a, ga4Var, 1.0f, 1.0f, 2, 1.0f, 14336);
                        g12VarM5449e = f12Var.m5449e();
                        c20.f15772n = g12VarM5449e;
                    }
                    l02.m7759a(g12VarM5449e, nt2VarM10693F, zy5.m13870e(4294246487L), ir1Var, 3120, 0);
                    ir1Var.m6912r(true);
                } else {
                    ir1Var.m6874W();
                }
                return ju4Var;
            case 1:
                nq1 nq1Var = (nq1) this.f14855b;
                String str = (String) this.f14856c;
                nt2 nt2Var = (nt2) this.f14857d;
                Object obj9 = (v20) obj;
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((ir1) mi0Var2).m6890g(obj9) ? 4 : 2;
                }
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    C0516c6 c0516c6 = (C0516c6) nq1Var.invoke(obj9, ir1Var2, Integer.valueOf(iIntValue2 & 14));
                    if (c0516c6 != null) {
                        lu2 lu2Var = ((lq2) ir1Var2.m6898k(pq2.f27894b)).f24280d;
                        l73 l73Var = new l73(str, c0516c6);
                        boolean zM6890g2 = ir1Var2.m6890g(lu2Var);
                        Object objM6869O5 = ir1Var2.m6869O();
                        if (zM6890g2 || objM6869O5 == i50Var) {
                            obj5 = objM6869O5;
                            C0713h5 c0713h5 = new C0713h5((byte) 0);
                            c0713h5.f20393b = lu2Var;
                            VarHandle.storeStoreFence();
                            ir1Var2.m6905n0(c0713h5);
                            obj5 = c0713h5;
                        }
                        C0750i5 c0750i5 = new C0750i5((byte) 0);
                        c0750i5.f21129b = nt2Var;
                        VarHandle.storeStoreFence();
                        ev0.m5331F(l73Var, null, (yp1) obj5, null, null, null, vd6.m11834R(-1690614882, c0750i5, ir1Var2), ir1Var2, 1572864, 58);
                    }
                } else {
                    ir1Var2.m6874W();
                }
                return ju4Var;
            case 2:
                C1112rl c1112rl = (C1112rl) this.f14855b;
                sw2 sw2Var = (sw2) this.f14856c;
                lt0 lt0Var = (lt0) this.f14857d;
                sg2 sg2Var = (sg2) obj;
                mi0 mi0Var3 = (mi0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((ir1) mi0Var3).m6890g(sg2Var) ? 4 : 2;
                }
                ir1 ir1Var3 = (ir1) mi0Var3;
                if (ir1Var3.m6871T(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    nt2 nt2VarM12840M = y42.m12840M(as4.m3253l(sg2Var, ir1Var3), ((lq2) ir1Var3.m6898k(pq2.f27894b)).f24280d.mo7289f());
                    if (z62.m13387o(c1112rl, (C1112rl) sw2Var.getValue())) {
                        ir1Var3.m6885d0(-764475319);
                        C1223ul c1223ul = new C1223ul(z ? (byte) 1 : (byte) 0);
                        c1223ul.f31966b = c1112rl;
                        VarHandle.storeStoreFence();
                        pg0 pg0VarM11834R = vd6.m11834R(840632158, c1223ul, ir1Var3);
                        ir1Var3.m6912r(false);
                        pg0Var = pg0VarM11834R;
                    } else {
                        ir1Var3.m6885d0(2071057356);
                        ir1Var3.m6912r(false);
                        pg0Var = null;
                    }
                    boolean zM6890g3 = ir1Var3.m6890g(c1112rl);
                    Object objM6869O6 = ir1Var3.m6869O();
                    Object obj10 = objM6869O6;
                    if (zM6890g3 || objM6869O6 == i50Var) {
                        C0675g4 c0675g4 = new C0675g4((byte) 5);
                        c0675g4.f19600b = c1112rl;
                        c0675g4.f19601c = sw2Var;
                        VarHandle.storeStoreFence();
                        ir1Var3.m6905n0(c0675g4);
                        obj10 = c0675g4;
                    }
                    C1223ul c1223ul2 = new C1223ul(z2 ? 1 : 0);
                    c1223ul2.f31966b = c1112rl;
                    VarHandle.storeStoreFence();
                    pg0 pg0VarM11834R2 = vd6.m11834R(-1074696138, c1223ul2, ir1Var3);
                    ne0 ne0Var = new ne0(b2);
                    ne0Var.f25728b = lt0Var;
                    ne0Var.f25729c = c1112rl;
                    VarHandle.storeStoreFence();
                    mz3.m8463e(nt2VarM12840M, null, false, (wp1) obj10, null, null, pg0VarM11834R2, pg0Var, null, vd6.m11834R(-1711575149, ne0Var, ir1Var3), ir1Var3, 806879232, 310);
                } else {
                    ir1Var3.m6874W();
                }
                return ju4Var;
            case 3:
                Object obj11 = this.f14855b;
                f40 f40Var = (f40) this.f14856c;
                g04 g04Var = (g04) this.f14857d;
                if (obj11 != h40.f20371l) {
                    y42.m12846R(f40Var.f18740b, obj11, g04Var.f19472a);
                }
                return ju4Var;
            case 4:
                yp1 yp1Var3 = (yp1) this.f14856c;
                ie1 ie1Var = (ie1) this.f14855b;
                wp1 wp1Var = (wp1) this.f14857d;
                mi0 mi0Var4 = (mi0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ir1 ir1Var4 = (ir1) mi0Var4;
                if (ir1Var4.m6871T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    boolean zM6890g4 = ir1Var4.m6890g(yp1Var3) | ir1Var4.m6890g(ie1Var) | ir1Var4.m6890g(wp1Var);
                    Object objM6869O7 = ir1Var4.m6869O();
                    if (zM6890g4 || objM6869O7 == i50Var) {
                        obj6 = objM6869O7;
                        C1048pv c1048pv = new C1048pv((byte) 8);
                        c1048pv.f28016b = yp1Var3;
                        c1048pv.f28017c = ie1Var;
                        c1048pv.f28018d = wp1Var;
                        VarHandle.storeStoreFence();
                        ir1Var4.m6905n0(c1048pv);
                        obj6 = c1048pv;
                    }
                    mz3.m8463e(null, null, false, (wp1) obj6, null, null, lb5.f23917e, null, null, null, ir1Var4, 1572864, 951);
                } else {
                    ir1Var4.m6874W();
                }
                return ju4Var;
            case 5:
                sw2 sw2Var2 = (sw2) this.f14855b;
                sw2 sw2Var3 = (sw2) this.f14856c;
                sw2 sw2Var4 = (sw2) this.f14857d;
                b33 b33Var = (b33) obj;
                jx4 jx4Var = (jx4) obj2;
                zr1 zr1Var = (zr1) obj3;
                int i2 = zr1Var == null ? -1 : zy2.f36468c[zr1Var.ordinal()];
                if (i2 == 1) {
                    wf4Var = wf4.f33339a;
                } else if (i2 == 2) {
                    wf4Var = wf4.f33340b;
                } else if (i2 != 3) {
                    wf4Var = i2 != 4 ? null : wf4.f33342d;
                } else {
                    wf4Var = wf4.f33341c;
                }
                wf4 wf4VarM13853Q = wf4Var != null ? zy5.m13853Q(wf4Var, sw2Var2) : null;
                int i3 = wf4VarM13853Q != null ? zy2.f36467b[wf4VarM13853Q.ordinal()] : -1;
                if (i3 == 1) {
                    xx2Var = xx2.SwipeLeft;
                } else if (i3 != 2) {
                    xx2Var = i3 != 3 ? null : xx2.SwipeRight;
                } else {
                    xx2Var = xx2.SwipeUp;
                }
                ((pq1) sw2Var3.getValue()).mo6994d(wf4VarM13853Q, b33.m3423a(0L), new es1(0.0f), xx2Var != null ? jx4Var : null, b33Var);
                if (xx2Var != null) {
                    ((yp1) sw2Var4.getValue()).invoke(xx2Var);
                }
                return ju4Var;
            case 6:
                sw2 sw2Var5 = (sw2) this.f14855b;
                sw2 sw2Var6 = (sw2) this.f14856c;
                pg0 pg0Var2 = (pg0) this.f14857d;
                v20 v20Var = (v20) obj;
                mi0 mi0Var5 = (mi0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((ir1) mi0Var5).m6890g(v20Var) ? 4 : 2;
                }
                ir1 ir1Var5 = (ir1) mi0Var5;
                if (ir1Var5.m6871T(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    boolean z5 = (iIntValue5 & 14) == 4;
                    Object objM6869O8 = ir1Var5.m6869O();
                    Object obj12 = objM6869O8;
                    if (z5 || objM6869O8 == i50Var) {
                        cz3 cz3Var = new cz3(z3 ? 1 : 0);
                        cz3Var.f16638b = v20Var;
                        cz3Var.f16639c = sw2Var5;
                        VarHandle.storeStoreFence();
                        ir1Var5.m6905n0(cz3Var);
                        obj12 = cz3Var;
                    }
                    nt2 nt2VarM5651I = AbstractC0647fd.m5651I(y42.m12841M0(gq6.m6101z(kt2Var, (yp1) obj12), (a05) sw2Var6.getValue()), 6.0f, 0.0f, 2);
                    id0 id0VarM6333a = hd0.m6333a(AbstractC1337xn.f34436c, ig1.f21390n, ir1Var5, 0);
                    int iHashCode2 = Long.hashCode(ir1Var5.f21683T);
                    ga3 ga3VarM6902m2 = ir1Var5.m6902m();
                    nt2 nt2VarM10006A2 = qq2.m10006A(ir1Var5, nt2VarM5651I);
                    bi0.f15310ap.getClass();
                    if (ir1Var5.f21685a == null) {
                        dt0.m4682E();
                        throw null;
                    }
                    ir1Var5.m6893h0();
                    if (ir1Var5.f21682S) {
                        ir1Var5.m6900l(da2Var);
                    } else {
                        ir1Var5.m6911q0();
                    }
                    C0006a5.m53I(ir1Var5, ia5.f21216g, id0VarM6333a);
                    C0006a5.m53I(ir1Var5, ia5.f21215f, ga3VarM6902m2);
                    C0006a5.m53I(ir1Var5, ia5.f21217h, Integer.valueOf(iHashCode2));
                    C0006a5.m50F(ir1Var5);
                    C0006a5.m53I(ir1Var5, ia5.f21214e, nt2VarM10006A2);
                    xh3 xh3Var = ra1.f29113a;
                    e73 e73Var = (e73) ir1Var5.m6898k(xh3Var);
                    g73 g73VarM5670h = AbstractC0647fd.m5670h(0.0f, 0.0f, 5);
                    b73 b73Var = new b73();
                    b73Var.f15145b = e73Var;
                    b73Var.f15146c = g73VarM5670h;
                    VarHandle.storeStoreFence();
                    zh3 zh3VarMo7523a = xh3Var.mo7523a(b73Var);
                    h02 h02Var = new h02((byte) 8);
                    h02Var.f20244b = pg0Var2;
                    VarHandle.storeStoreFence();
                    as4.m3244c(zh3VarMo7523a, vd6.m11834R(-468166154, h02Var, ir1Var5), ir1Var5, 56);
                    ir1Var5.m6912r(true);
                } else {
                    ir1Var5.m6874W();
                }
                return ju4Var;
            default:
                pn0 pn0Var = (pn0) this.f14855b;
                yp1 yp1Var4 = (yp1) this.f14856c;
                wp1 wp1Var2 = (wp1) this.f14857d;
                mi0 mi0Var6 = (mi0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ir1 ir1Var6 = (ir1) mi0Var6;
                if (ir1Var6.m6871T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    pw3 pw3VarM10148d = qw3.m10148d(ir1Var6);
                    nn0 nn0Var = new nn0(z4 ? 1 : 0);
                    nn0Var.f25955b = pw3VarM10148d;
                    nn0Var.f25956c = pn0Var;
                    nn0Var.f25957d = yp1Var4;
                    nn0Var.f25958e = wp1Var2;
                    VarHandle.storeStoreFence();
                    mz3.m8463e(null, sj3.m10799H(qn4.f28624a, null, null, ir1Var6, 12582918, 126), false, nn0Var, null, null, ev0.f18494b, null, ev0.f18495c, null, ir1Var6, 102236160, 693);
                } else {
                    ir1Var6.m6874W();
                }
                return ju4Var;
        }
    }
}
