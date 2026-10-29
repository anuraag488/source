package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ri1 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f29307a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ iq1 f29308b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f29309c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f29310d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f29311e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f29312f;

    public /* synthetic */ ri1(byte b) {
        this.f29307a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Object obj5;
        ir1 ir1Var;
        boolean z;
        boolean z2;
        byte b = this.f29307a;
        i50 i50Var = ki0.f23136a;
        Object obj6 = rr3.f29550a;
        kt2 kt2Var = kt2.f23428a;
        da2 da2Var = wf2.f33290T;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                sw2 sw2Var = (sw2) this.f29309c;
                yp1 yp1Var = (yp1) this.f29310d;
                String str = (String) this.f29311e;
                String str2 = (String) this.f29312f;
                pg0 pg0Var = (pg0) this.f29308b;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var;
                if (ir1Var2.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var2.m6885d0(407549954);
                    ir1Var2.m6912r(false);
                    boolean zM6890g = ir1Var2.m6890g(sw2Var) | ir1Var2.m6890g(yp1Var) | ir1Var2.m6890g(str) | ir1Var2.m6890g(str2);
                    Object objM6869O = ir1Var2.m6869O();
                    if (zM6890g || objM6869O == i50Var) {
                        obj3 = objM6869O;
                        C0762ii c0762ii = new C0762ii((byte) 5);
                        c0762ii.f21430b = str;
                        c0762ii.f21431c = str2;
                        c0762ii.f21433e = sw2Var;
                        c0762ii.f21432d = yp1Var;
                        VarHandle.storeStoreFence();
                        ir1Var2.m6905n0(c0762ii);
                        obj3 = c0762ii;
                    }
                    i83 i83Var = new i83();
                    i83Var.f21171a = (yp1) obj3;
                    VarHandle.storeStoreFence();
                    db4 db4VarMo7286c = ((lq2) ir1Var2.m6898k(pq2.f27894b)).f24280d.mo7286c();
                    et2 et2Var = new et2();
                    et2Var.f18468a = false;
                    et2Var.f18469b = false;
                    et2Var.f18470c = db4VarMo7286c;
                    VarHandle.storeStoreFence();
                    nt2 nt2VarMo7630d = i83Var.mo7630d(et2Var);
                    pr3 pr3VarM9243a = or3.m9243a(AbstractC1337xn.f34434a, ig1.f21387k, ir1Var2, 0);
                    int iHashCode = Long.hashCode(ir1Var2.f21683T);
                    ga3 ga3VarM6902m = ir1Var2.m6902m();
                    nt2 nt2VarM10006A = qq2.m10006A(ir1Var2, nt2VarMo7630d);
                    bi0.f15310ap.getClass();
                    if (ir1Var2.f21685a == null) {
                        dt0.m4682E();
                        throw null;
                    }
                    ir1Var2.m6893h0();
                    if (ir1Var2.f21682S) {
                        ir1Var2.m6900l(da2Var);
                    } else {
                        ir1Var2.m6911q0();
                    }
                    C0006a5.m53I(ir1Var2, ia5.f21216g, pr3VarM9243a);
                    C0006a5.m53I(ir1Var2, ia5.f21215f, ga3VarM6902m);
                    C0006a5.m53I(ir1Var2, ia5.f21217h, Integer.valueOf(iHashCode));
                    C0006a5.m50F(ir1Var2);
                    C0006a5.m53I(ir1Var2, ia5.f21214e, nt2VarM10006A);
                    pg0Var.invoke(obj6, ir1Var2, 6);
                    ir1Var2.m6912r(true);
                    ir1Var2.m6885d0(409301826);
                    ir1Var2.m6912r(false);
                } else {
                    ir1Var2.m6874W();
                }
                return ju4Var;
            case 1:
                ((Integer) obj2).getClass();
                y62.m12967f((C0800jj) this.f29309c, (nt2) this.f29310d, (p91) this.f29311e, (mc1) this.f29312f, (pg0) this.f29308b, (mi0) obj, vd6.m11838V(24577));
                return ju4Var;
            case 2:
                ((Integer) obj2).getClass();
                gq6.m6079d((nt2) this.f29309c, (mq1) this.f29310d, (do4) this.f29311e, (a91) this.f29312f, (pg0) this.f29308b, (mi0) obj, vd6.m11838V(196609));
                return ju4Var;
            case 3:
                ((Integer) obj2).getClass();
                z62.m13379g((nt2) this.f29309c, (pi1) this.f29310d, (e73) this.f29311e, (p44) this.f29312f, (pg0) this.f29308b, (mi0) obj, vd6.m11838V(7));
                return ju4Var;
            case 4:
                nt2 nt2Var = (nt2) this.f29310d;
                sw2 sw2Var2 = (sw2) this.f29309c;
                pg0 pg0Var2 = (pg0) this.f29308b;
                C0705gy c0705gy = (C0705gy) this.f29311e;
                wp1 wp1Var = (wp1) this.f29312f;
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ir1 ir1Var3 = (ir1) mi0Var2;
                if (ir1Var3.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objM6869O2 = ir1Var3.m6869O();
                    if (objM6869O2 == i50Var) {
                        obj4 = objM6869O2;
                        C0761ih c0761ih = new C0761ih((byte) 8);
                        c0761ih.f21416b = sw2Var2;
                        VarHandle.storeStoreFence();
                        ir1Var3.m6905n0(c0761ih);
                        obj4 = c0761ih;
                    }
                    obj4 = objM6869O2;
                    nt2 nt2VarM9120z = oh6.m9120z(nt2Var, (yp1) obj4);
                    xq2 xq2VarM9704c = q20.m9704c(ig1.f21378b, true);
                    int iHashCode2 = Long.hashCode(ir1Var3.f21683T);
                    ga3 ga3VarM6902m2 = ir1Var3.m6902m();
                    nt2 nt2VarM10006A2 = qq2.m10006A(ir1Var3, nt2VarM9120z);
                    bi0.f15310ap.getClass();
                    if (ir1Var3.f21685a == null) {
                        dt0.m4682E();
                        throw null;
                    }
                    ir1Var3.m6893h0();
                    if (ir1Var3.f21682S) {
                        ir1Var3.m6900l(da2Var);
                    } else {
                        ir1Var3.m6911q0();
                    }
                    C0006a5.m53I(ir1Var3, ia5.f21216g, xq2VarM9704c);
                    C0006a5.m53I(ir1Var3, ia5.f21215f, ga3VarM6902m2);
                    C0006a5.m53I(ir1Var3, ia5.f21217h, Integer.valueOf(iHashCode2));
                    C0006a5.m50F(ir1Var3);
                    C0006a5.m53I(ir1Var3, ia5.f21214e, nt2VarM10006A2);
                    pg0Var2.invoke(ir1Var3, 0);
                    c0705gy.m6194b(wp1Var, ir1Var3, 6);
                    ir1Var3.m6912r(true);
                } else {
                    ir1Var3.m6874W();
                }
                return ju4Var;
            case 5:
                mq1 mq1Var = (mq1) this.f29309c;
                oz3 oz3Var = (oz3) this.f29310d;
                nz3 nz3Var = oz3Var.f27246c;
                xy3 xy3Var = oz3Var.f27244a;
                mq1 mq1Var2 = (mq1) this.f29311e;
                mq1 mq1Var3 = (mq1) this.f29312f;
                mq1 mq1Var4 = (mq1) this.f29308b;
                mi0 mi0Var3 = (mi0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ir1 ir1Var4 = (ir1) mi0Var3;
                boolean zM6871T = ir1Var4.m6871T(iIntValue3 & 1, (iIntValue3 & 3) != 2);
                InterfaceC0618en interfaceC0618en = ir1Var4.f21685a;
                if (zM6871T) {
                    C0779iz c0779iz = ig1.f21390n;
                    pr3 pr3VarM9243a2 = or3.m9243a(AbstractC1337xn.m12720f(18.0f, c0779iz), ig1.f21388l, ir1Var4, 54);
                    int iHashCode3 = Long.hashCode(ir1Var4.f21683T);
                    ga3 ga3VarM6902m3 = ir1Var4.m6902m();
                    nt2 nt2VarM10006A3 = qq2.m10006A(ir1Var4, kt2Var);
                    bi0.f15310ap.getClass();
                    if (interfaceC0618en == null) {
                        dt0.m4682E();
                        throw null;
                    }
                    ir1Var4.m6893h0();
                    if (ir1Var4.f21682S) {
                        ir1Var4.m6900l(da2Var);
                    } else {
                        ir1Var4.m6911q0();
                    }
                    jh0 jh0Var = ia5.f21216g;
                    C0006a5.m53I(ir1Var4, jh0Var, pr3VarM9243a2);
                    jh0 jh0Var2 = ia5.f21215f;
                    C0006a5.m53I(ir1Var4, jh0Var2, ga3VarM6902m3);
                    Integer numValueOf = Integer.valueOf(iHashCode3);
                    jh0 jh0Var3 = ia5.f21217h;
                    C0006a5.m53I(ir1Var4, jh0Var3, numValueOf);
                    C0006a5.m50F(ir1Var4);
                    jh0 jh0Var4 = ia5.f21214e;
                    C0006a5.m53I(ir1Var4, jh0Var4, nt2VarM10006A3);
                    if (mq1Var != null) {
                        ir1Var4.m6885d0(931692210);
                        long j = xy3Var.f34724c;
                        xl4 xl4Var = ((lq2) ir1Var4.m6898k(pq2.f27894b)).f24278b.f22583n;
                        hh0 hh0Var = new hh0((byte) 3);
                        hh0Var.f20573b = mq1Var;
                        VarHandle.storeStoreFence();
                        k43.m7380b(j, xl4Var, vd6.m11834R(2004409683, hh0Var, ir1Var4), ir1Var4, 384);
                        ir1Var4.m6912r(false);
                    } else {
                        ir1Var4.m6885d0(931870956);
                        ir1Var4.m6912r(false);
                    }
                    nt2 nt2VarM5653K = AbstractC0647fd.m5653K(new lg2(1.0f, true), 0.0f, nz3Var.f26223b.mo3505d(), 0.0f, nz3Var.f26223b.mo3504c(), 5);
                    id0 id0VarM6333a = hd0.m6333a(AbstractC1337xn.m12719e(2.0f), c0779iz, ir1Var4, 6);
                    int iHashCode4 = Long.hashCode(ir1Var4.f21683T);
                    ga3 ga3VarM6902m4 = ir1Var4.m6902m();
                    nt2 nt2VarM10006A4 = qq2.m10006A(ir1Var4, nt2VarM5653K);
                    ir1Var4.m6893h0();
                    if (ir1Var4.f21682S) {
                        ir1Var4.m6900l(da2Var);
                    } else {
                        ir1Var4.m6911q0();
                    }
                    C0006a5.m53I(ir1Var4, jh0Var, id0VarM6333a);
                    C0006a5.m53I(ir1Var4, jh0Var2, ga3VarM6902m4);
                    d55.m4373r(iHashCode4, ir1Var4, jh0Var3, ir1Var4);
                    C0006a5.m53I(ir1Var4, jh0Var4, nt2VarM10006A4);
                    if (mq1Var3 != null) {
                        ir1Var4.m6885d0(1351141990);
                        long j2 = xy3Var.f34723b;
                        xl4 xl4Var2 = ((lq2) ir1Var4.m6898k(pq2.f27894b)).f24278b.f22579j;
                        hh0 hh0Var2 = new hh0((byte) 4);
                        hh0Var2.f20573b = mq1Var3;
                        VarHandle.storeStoreFence();
                        k43.m7380b(j2, xl4Var2, vd6.m11834R(-670142179, hh0Var2, ir1Var4), ir1Var4, 384);
                        ir1Var4.m6912r(false);
                    } else {
                        ir1Var4.m6885d0(1351322658);
                        ir1Var4.m6912r(false);
                    }
                    if (mq1Var4 != null) {
                        ir1Var4.m6885d0(1351362989);
                        long jM9464c = pb0.m9464c(xy3Var.f34723b, 0.9f, 0.0f, 0.0f, 0.0f, 14);
                        xl4 xl4Var3 = ((lq2) ir1Var4.m6898k(pq2.f27894b)).f24278b.f22581l;
                        hh0 hh0Var3 = new hh0((byte) 5);
                        hh0Var3.f20573b = mq1Var4;
                        VarHandle.storeStoreFence();
                        k43.m7380b(jM9464c, xl4Var3, vd6.m11834R(1051035910, hh0Var3, ir1Var4), ir1Var4, 384);
                        ir1Var4.m6912r(false);
                    } else {
                        ir1Var4.m6885d0(1351567682);
                        ir1Var4.m6912r(false);
                    }
                    ir1Var4.m6912r(true);
                    if (mq1Var2 != null) {
                        ir1Var4.m6885d0(932709103);
                        long j3 = xy3Var.f34725d;
                        xl4 xl4Var4 = ((lq2) ir1Var4.m6898k(pq2.f27894b)).f24278b.f22583n;
                        hh0 hh0Var4 = new hh0((byte) 6);
                        hh0Var4.f20573b = mq1Var2;
                        VarHandle.storeStoreFence();
                        k43.m7380b(j3, xl4Var4, vd6.m11834R(2049845180, hh0Var4, ir1Var4), ir1Var4, 384);
                        ir1Var4.m6912r(false);
                    } else {
                        ir1Var4.m6885d0(932890732);
                        ir1Var4.m6912r(false);
                    }
                    ir1Var4.m6912r(true);
                } else {
                    ir1Var4.m6874W();
                }
                return ju4Var;
            default:
                mq1 mq1Var5 = (mq1) this.f29309c;
                mq1 mq1Var6 = (mq1) this.f29310d;
                nq1 nq1Var = (nq1) this.f29311e;
                oz3 oz3Var2 = (oz3) this.f29312f;
                nq1 nq1Var2 = (nq1) this.f29308b;
                mi0 mi0Var4 = (mi0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                C0816jz c0816jz = ig1.f21388l;
                ir1 ir1Var5 = (ir1) mi0Var4;
                boolean zM6871T2 = ir1Var5.m6871T(iIntValue4 & 1, (iIntValue4 & 3) != 2);
                InterfaceC0618en interfaceC0618en2 = ir1Var5.f21685a;
                if (zM6871T2) {
                    nt2 nt2VarM5651I = AbstractC0647fd.m5651I(kt2Var, 0.0f, 8.0f, 1);
                    C1225un c1225unM12718d = AbstractC1337xn.m12718d(8.0f);
                    C0779iz c0779iz2 = ig1.f21390n;
                    id0 id0VarM6333a2 = hd0.m6333a(c1225unM12718d, c0779iz2, ir1Var5, 6);
                    int iHashCode5 = Long.hashCode(ir1Var5.f21683T);
                    ga3 ga3VarM6902m5 = ir1Var5.m6902m();
                    nt2 nt2VarM10006A5 = qq2.m10006A(ir1Var5, nt2VarM5651I);
                    bi0.f15310ap.getClass();
                    if (interfaceC0618en2 == null) {
                        dt0.m4682E();
                        throw null;
                    }
                    ir1Var5.m6893h0();
                    if (ir1Var5.f21682S) {
                        ir1Var5.m6900l(da2Var);
                    } else {
                        ir1Var5.m6911q0();
                    }
                    jh0 jh0Var5 = ia5.f21216g;
                    C0006a5.m53I(ir1Var5, jh0Var5, id0VarM6333a2);
                    jh0 jh0Var6 = ia5.f21215f;
                    C0006a5.m53I(ir1Var5, jh0Var6, ga3VarM6902m5);
                    Integer numValueOf2 = Integer.valueOf(iHashCode5);
                    jh0 jh0Var7 = ia5.f21217h;
                    C0006a5.m53I(ir1Var5, jh0Var7, numValueOf2);
                    C0006a5.m50F(ir1Var5);
                    jh0 jh0Var8 = ia5.f21214e;
                    C0006a5.m53I(ir1Var5, jh0Var8, nt2VarM10006A5);
                    if (mq1Var5 == null && mq1Var6 == null) {
                        ir1Var5.m6885d0(-422567537);
                        ir1Var5.m6912r(false);
                        obj5 = obj6;
                        ir1Var = ir1Var5;
                    } else {
                        ir1Var5.m6885d0(-423188591);
                        pr3 pr3VarM9243a3 = or3.m9243a(AbstractC1337xn.m12720f(8.0f, c0779iz2), c0816jz, ir1Var5, 54);
                        int iHashCode6 = Long.hashCode(ir1Var5.f21683T);
                        ga3 ga3VarM6902m6 = ir1Var5.m6902m();
                        obj5 = obj6;
                        nt2 nt2VarM10006A6 = qq2.m10006A(ir1Var5, kt2Var);
                        ir1Var5.m6893h0();
                        if (ir1Var5.f21682S) {
                            ir1Var5.m6900l(da2Var);
                        } else {
                            ir1Var5.m6911q0();
                        }
                        C0006a5.m53I(ir1Var5, jh0Var5, pr3VarM9243a3);
                        C0006a5.m53I(ir1Var5, jh0Var6, ga3VarM6902m6);
                        d55.m4373r(iHashCode6, ir1Var5, jh0Var7, ir1Var5);
                        C0006a5.m53I(ir1Var5, jh0Var8, nt2VarM10006A6);
                        if (mq1Var5 != null) {
                            ir1Var5.m6885d0(414005825);
                            lg2 lg2Var = new lg2(1.0f, true);
                            xq2 xq2VarM9704c2 = q20.m9704c(ig1.f21378b, false);
                            int iHashCode7 = Long.hashCode(ir1Var5.f21683T);
                            ga3 ga3VarM6902m7 = ir1Var5.m6902m();
                            nt2 nt2VarM10006A7 = qq2.m10006A(ir1Var5, lg2Var);
                            ir1Var5.m6893h0();
                            if (ir1Var5.f21682S) {
                                ir1Var5.m6900l(da2Var);
                            } else {
                                ir1Var5.m6911q0();
                            }
                            C0006a5.m53I(ir1Var5, jh0Var5, xq2VarM9704c2);
                            C0006a5.m53I(ir1Var5, jh0Var6, ga3VarM6902m7);
                            d55.m4373r(iHashCode7, ir1Var5, jh0Var7, ir1Var5);
                            C0006a5.m53I(ir1Var5, jh0Var8, nt2VarM10006A7);
                            long j4 = oz3Var2.f27244a.f34723b;
                            xl4 xl4Var5 = ((lq2) ir1Var5.m6898k(pq2.f27894b)).f24278b.f22578i;
                            hh0 hh0Var5 = new hh0((byte) 7);
                            hh0Var5.f20573b = mq1Var5;
                            VarHandle.storeStoreFence();
                            k43.m7380b(j4, xl4Var5, vd6.m11834R(-77004293, hh0Var5, ir1Var5), ir1Var5, 384);
                            ir1Var = ir1Var5;
                            ir1Var.m6912r(true);
                            ir1Var.m6912r(false);
                        } else {
                            ir1Var = ir1Var5;
                            ir1Var.m6885d0(414266256);
                            ir1Var.m6912r(false);
                        }
                        if (mq1Var6 != null) {
                            ir1Var.m6885d0(414300511);
                            zh3 zh3VarMo7523a = zl0.f36166a.mo7523a(pb0.m9462a(oz3Var2.f27244a.f34724c));
                            hh0 hh0Var6 = new hh0((byte) 8);
                            hh0Var6.f20573b = mq1Var6;
                            VarHandle.storeStoreFence();
                            as4.m3244c(zh3VarMo7523a, vd6.m11834R(-1510290684, hh0Var6, ir1Var), ir1Var, 56);
                            z = false;
                            ir1Var.m6912r(false);
                        } else {
                            z = false;
                            ir1Var.m6885d0(414439856);
                            ir1Var.m6912r(false);
                        }
                        ir1Var.m6912r(true);
                        ir1Var.m6912r(z);
                    }
                    if (nq1Var != null) {
                        ir1Var.m6885d0(-422528477);
                        long jM9464c2 = pb0.m9464c(oz3Var2.f27244a.f34723b, 0.9f, 0.0f, 0.0f, 0.0f, 14);
                        xl4 xl4Var6 = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24278b.f22580k;
                        C0616el c0616el = new C0616el((byte) 1);
                        c0616el.f18196b = nq1Var;
                        VarHandle.storeStoreFence();
                        k43.m7380b(jM9464c2, xl4Var6, vd6.m11834R(1387813165, c0616el, ir1Var), ir1Var, 384);
                        ir1Var.m6912r(false);
                    } else {
                        ir1Var.m6885d0(-422332433);
                        ir1Var.m6912r(false);
                    }
                    if (nq1Var2 != 0) {
                        ir1Var.m6885d0(-422296659);
                        nt2 nt2VarM8574b = n74.m8574b(kt2Var, 1.0f);
                        pr3 pr3VarM9243a4 = or3.m9243a(AbstractC1337xn.m12720f(8.0f, ig1.f21392p), c0816jz, ir1Var, 54);
                        int iHashCode8 = Long.hashCode(ir1Var.f21683T);
                        ga3 ga3VarM6902m8 = ir1Var.m6902m();
                        nt2 nt2VarM10006A8 = qq2.m10006A(ir1Var, nt2VarM8574b);
                        ir1Var.m6893h0();
                        if (ir1Var.f21682S) {
                            ir1Var.m6900l(da2Var);
                        } else {
                            ir1Var.m6911q0();
                        }
                        C0006a5.m53I(ir1Var, jh0Var5, pr3VarM9243a4);
                        C0006a5.m53I(ir1Var, jh0Var6, ga3VarM6902m8);
                        d55.m4373r(iHashCode8, ir1Var, jh0Var7, ir1Var);
                        C0006a5.m53I(ir1Var, jh0Var8, nt2VarM10006A8);
                        nq1Var2.invoke(obj5, ir1Var, 6);
                        z2 = true;
                        ir1Var.m6912r(true);
                        ir1Var.m6912r(false);
                    } else {
                        z2 = true;
                        ir1Var.m6885d0(-422079473);
                        ir1Var.m6912r(false);
                    }
                    ir1Var.m6912r(z2);
                } else {
                    ir1Var5.m6874W();
                }
                return ju4Var;
        }
    }
}
