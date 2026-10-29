package p000;

import android.app.Activity;
import android.app.KeyguardManager;
import android.graphics.Typeface;
import android.text.Spannable;
import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class up4 implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32064a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f32065b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f32066c;

    public /* synthetic */ up4(byte b) {
        this.f32064a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r18v0, types: [mi0] */
    /* JADX WARN: Type inference failed for: r1v11, types: [yp1] */
    /* JADX WARN: Type inference failed for: r2v25, types: [ir1, mi0] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r3v19, types: [ir1] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [d0, java.lang.Object] */
    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        Object obj5;
        byte b = this.f32064a;
        wm0 wm0Var = null;
        byte b2 = 4;
        i50 i50Var = ki0.f23136a;
        byte b3 = 1;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                od1 od1Var = (od1) this.f32065b;
                a83 a83Var = (a83) this.f32066c;
                yg4 yg4Var = (yg4) obj;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((ir1) mi0Var).m6890g(yg4Var) ? 4 : 2;
                }
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    lu2 lu2Var = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24280d;
                    nt2 nt2VarMo2996a = yg4Var.mo2996a(AbstractC0647fd.m5653K(y62.m12946N(n74.m8585m(n74.f25506c, ig1.f21385i, 2)), 32.0f, 0.0f, 32.0f, 64.0f, 2), k91.m7438c(lu2Var.mo7286c(), 2).m9439a(k91.m7440e(lu2Var.mo7289f(), 0.33f, 4)), k91.m7439d(lu2Var.mo7286c(), 2).m8273a(k91.m7441f(lu2Var.mo7289f(), 0.33f, 4)));
                    ic2[] ic2VarArr = gh4.f19795a;
                    hv1 hv1Var = new hv1(b2);
                    VarHandle.storeStoreFence();
                    nt2 nt2VarM10029m = qq2.m10029m(nt2VarMo2996a, hv1Var);
                    fr3 fr3Var = gr3.f20083a;
                    Object objM6869O = ir1Var.m6869O();
                    if (objM6869O == i50Var) {
                        objM6869O = lb5.m7942w(r71.f29063a, ir1Var);
                        ir1Var.m6905n0(objM6869O);
                    }
                    C0839kl c0839kl = new C0839kl((byte) 5);
                    c0839kl.f23208b = (zo0) objM6869O;
                    c0839kl.f23209c = od1Var;
                    VarHandle.storeStoreFence();
                    ve2 ve2Var = new ve2(b3);
                    ve2Var.f32556b = a83Var;
                    VarHandle.storeStoreFence();
                    kf4.m7512b(c0839kl, nt2VarM10029m, false, fr3Var, 0L, 0L, 0.0f, 1.0f, null, null, vd6.m11834R(1139706661, ve2Var, ir1Var), ir1Var, 12582912, 884);
                } else {
                    ir1Var.m6874W();
                }
                return ju4Var;
            case 1:
                y42.m12846R((yp1) this.f32065b, this.f32066c, (ro0) obj3);
                return ju4Var;
            case 2:
                List list = (List) this.f32065b;
                sw2 sw2Var = (sw2) this.f32066c;
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    pr3 pr3VarM9243a = or3.m9243a(AbstractC1337xn.m12718d(8.0f), ig1.f21387k, ir1Var2, 6);
                    int iHashCode = Long.hashCode(ir1Var2.f21683T);
                    ga3 ga3VarM6902m = ir1Var2.m6902m();
                    kt2 kt2Var = kt2.f23428a;
                    nt2 nt2VarM10006A = qq2.m10006A(ir1Var2, kt2Var);
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
                    C0006a5.m53I(ir1Var2, ia5.f21216g, pr3VarM9243a);
                    C0006a5.m53I(ir1Var2, ia5.f21215f, ga3VarM6902m);
                    C0006a5.m53I(ir1Var2, ia5.f21217h, Integer.valueOf(iHashCode));
                    C0006a5.m50F(ir1Var2);
                    C0006a5.m53I(ir1Var2, ia5.f21214e, nt2VarM10006A);
                    ir1Var2.m6885d0(-410731685);
                    ?? r2 = ir1Var2;
                    for (Object obj6 : list) {
                        boolean zM13387o = z62.m13387o(sw2Var.getValue(), obj6);
                        nt2 nt2VarM10029m2 = qq2.m10029m(n74.m8579g(kt2Var, 48.0f), new hv1(false ? (byte) 1 : (byte) 0));
                        boolean zM6890g = r2.m6890g(sw2Var) | r2.m6894i(obj6);
                        ?? M6869O = r2.m6869O();
                        if (zM6890g || M6869O == i50Var) {
                            M6869O = new C0558d0((byte) 22);
                            M6869O.f16655b = obj6;
                            M6869O.f16656c = sw2Var;
                            VarHandle.storeStoreFence();
                            r2.m6905n0(M6869O);
                        }
                        C1017p0 c1017p0 = new C1017p0((byte) 7);
                        c1017p0.f27254b = obj6;
                        VarHandle.storeStoreFence();
                        ?? r18 = r2;
                        dt0.m4706h(zM13387o, (yp1) M6869O, nt2VarM10029m2, false, null, null, vd6.m11834R(510583490, c1017p0, r2), r18, 12582912);
                        kt2Var = kt2Var;
                        r2 = r18;
                    }
                    ?? r3 = r2;
                    r3.m6912r(false);
                    r3.m6912r(true);
                } else {
                    ir1Var2.m6874W();
                }
                return ju4Var;
            case 3:
                ?? r1 = (yp1) this.f32065b;
                om0 om0Var = (om0) this.f32066c;
                mi0 mi0Var3 = (mi0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ir1 ir1Var3 = (ir1) mi0Var3;
                if (ir1Var3.m6871T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    Object objM6869O2 = ir1Var3.m6869O();
                    if (objM6869O2 == i50Var) {
                        obj4 = objM6869O2;
                        pm0 pm0Var = new pm0();
                        pm0Var.f27742a = new w94();
                        VarHandle.storeStoreFence();
                        ir1Var3.m6905n0(pm0Var);
                        obj4 = pm0Var;
                    }
                    obj4 = objM6869O2;
                    pm0 pm0Var2 = (pm0) obj4;
                    pm0Var2.f27742a.clear();
                    r1.invoke(pm0Var2);
                    pm0Var2.m9568a(om0Var, ir1Var3, 0);
                } else {
                    ir1Var3.m6874W();
                }
                return ju4Var;
            case 4:
                oy2 oy2Var = (oy2) this.f32065b;
                ny2 ny2Var = (ny2) this.f32066c;
                mi0 mi0Var4 = (mi0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ir1 ir1Var4 = (ir1) mi0Var4;
                if (ir1Var4.m6871T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    oy2Var.f27233b.invoke(ny2Var, ir1Var4, 0);
                } else {
                    ir1Var4.m6874W();
                }
                return ju4Var;
            case 5:
                KeyguardManager keyguardManager = (KeyguardManager) this.f32065b;
                xn2 xn2Var = (xn2) this.f32066c;
                yp1 yp1Var = (yp1) obj;
                mi0 mi0Var5 = (mi0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((ir1) mi0Var5).m6894i(yp1Var) ? 4 : 2;
                }
                ir1 ir1Var5 = (ir1) mi0Var5;
                if (ir1Var5.m6871T(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    Activity activity = (Activity) ir1Var5.m6898k(pm2.f27747a);
                    int i = (((ir1Var5.m6894i(activity) ? 1 : 0) | (ir1Var5.m6894i(keyguardManager) ? 1 : 0) ? 1 : 0) | (ir1Var5.m6894i(xn2Var) ? 1 : 0) ? 1 : 0) | ((iIntValue5 & 14) != 4 ? (byte) 0 : (byte) 1);
                    Object objM6869O3 = ir1Var5.m6869O();
                    if (i != 0 || objM6869O3 == i50Var) {
                        C1031pe c1031pe = new C1031pe(keyguardManager, activity, xn2Var, yp1Var, (wm0) null);
                        ir1Var5.m6905n0(c1031pe);
                        objM6869O3 = c1031pe;
                    }
                    lb5.m7926g(ir1Var5, (mq1) objM6869O3, ju4Var);
                } else {
                    ir1Var5.m6874W();
                }
                return ju4Var;
            case 6:
                List list2 = (List) this.f32065b;
                d83 d83Var = ((C0800jj) this.f32066c).f22323b;
                mi0 mi0Var6 = (mi0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ir1 ir1Var6 = (ir1) mi0Var6;
                if (ir1Var6.m6871T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    zy5.m13874i(list2.indexOf(d83Var.getValue()), (vx2) d83Var.getValue(), null, ir1Var6, 0);
                } else {
                    ir1Var6.m6874W();
                }
                return ju4Var;
            case 7:
                xn2 xn2Var2 = (xn2) this.f32065b;
                ac4 ac4Var = (ac4) this.f32066c;
                mi0 mi0Var7 = (mi0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ir1 ir1Var7 = (ir1) mi0Var7;
                if (ir1Var7.m6871T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    boolean zM6894i = ir1Var7.m6894i(xn2Var2) | ir1Var7.m6894i(ac4Var);
                    Object objM6869O4 = ir1Var7.m6869O();
                    if (zM6894i || objM6869O4 == i50Var) {
                        obj5 = objM6869O4;
                        na1 na1Var = new na1((byte) 28);
                        na1Var.f25595b = xn2Var2;
                        na1Var.f25596c = ac4Var;
                        VarHandle.storeStoreFence();
                        ir1Var7.m6905n0(na1Var);
                        obj5 = na1Var;
                    }
                    AbstractC0637f4.m5467b(4096, true, null, (yp1) obj5, ir1Var7, 54, 4);
                } else {
                    ir1Var7.m6874W();
                }
                return ju4Var;
            case 8:
                wp1 wp1Var = (wp1) this.f32065b;
                yp1 yp1Var2 = (yp1) this.f32066c;
                ((Integer) obj3).getClass();
                ir1 ir1Var8 = (ir1) ((mi0) obj2);
                ir1Var8.m6885d0(759876635);
                Object objM6869O5 = ir1Var8.m6869O();
                Object obj7 = objM6869O5;
                if (objM6869O5 == i50Var) {
                    wy0 wy0VarM10566b = s94.m10566b(wp1Var);
                    ir1Var8.m6905n0(wy0VarM10566b);
                    obj7 = wy0VarM10566b;
                }
                xb4 xb4Var = (xb4) obj7;
                Object objM6869O6 = ir1Var8.m6869O();
                Object obj8 = objM6869O6;
                if (objM6869O6 == i50Var) {
                    C0910mi c0910mi = new C0910mi(b33.m3423a(((b33) xb4Var.getValue()).f15059a), b14.f15025b, b33.m3423a(b14.f15026c), 8);
                    ir1Var8.m6905n0(c0910mi);
                    obj8 = c0910mi;
                }
                C0910mi c0910mi2 = (C0910mi) obj8;
                boolean zM6894i2 = ir1Var8.m6894i(c0910mi2);
                Object objM6869O7 = ir1Var8.m6869O();
                Object obj9 = objM6869O7;
                if (zM6894i2 || objM6869O7 == i50Var) {
                    er2 er2Var = new er2((Object) xb4Var, (Object) c0910mi2, wm0Var, (byte) 13);
                    ir1Var8.m6905n0(er2Var);
                    obj9 = er2Var;
                }
                lb5.m7926g(ir1Var8, (mq1) obj9, ju4Var);
                C0457ak c0457ak = c0910mi2.f24929c;
                boolean zM6890g2 = ir1Var8.m6890g(c0457ak);
                Object objM6869O8 = ir1Var8.m6869O();
                Object obj10 = objM6869O8;
                if (zM6890g2 || objM6869O8 == i50Var) {
                    a14 a14Var = new a14((byte) 0);
                    a14Var.f54b = c0457ak;
                    VarHandle.storeStoreFence();
                    ir1Var8.m6905n0(a14Var);
                    obj10 = a14Var;
                }
                nt2 nt2Var = (nt2) yp1Var2.invoke((wp1) obj10);
                ir1Var8.m6912r(false);
                return nt2Var;
            case 9:
                Spannable spannable = (Spannable) this.f32065b;
                C0750i5 c0750i5 = (C0750i5) this.f32066c;
                pa4 pa4Var = (pa4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int iIntValue9 = ((Integer) obj3).intValue();
                bm1 bm1Var = pa4Var.f27483f;
                xm1 xm1Var = pa4Var.f27480c;
                if (xm1Var == null) {
                    xm1Var = xm1.f34413f;
                }
                tm1 tm1Var = pa4Var.f27481d;
                tm1 tm1VarM11064a = tm1.m11064a(tm1Var != null ? tm1Var.f31237a : 0);
                um1 um1Var = pa4Var.f27482e;
                Typeface typeface = (Typeface) c0750i5.mo183g(bm1Var, xm1Var, tm1VarM11064a, um1.m11584a(um1Var != null ? um1Var.f31990a : 65535));
                em1 em1Var = new em1((byte) 1);
                em1Var.f18257b = typeface;
                VarHandle.storeStoreFence();
                spannable.setSpan(em1Var, iIntValue8, iIntValue9, 33);
                return ju4Var;
            default:
                C1354y3 c1354y3 = (C1354y3) this.f32066c;
                od1 od1Var2 = (od1) this.f32065b;
                yp1 yp1Var3 = (yp1) obj;
                mi0 mi0Var8 = (mi0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= ((ir1) mi0Var8).m6894i(yp1Var3) ? 4 : 2;
                }
                ir1 ir1Var9 = (ir1) mi0Var8;
                if (ir1Var9.m6871T(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    Object objM6869O9 = ir1Var9.m6869O();
                    if (objM6869O9 == i50Var) {
                        objM6869O9 = new a83(90);
                        ir1Var9.m6905n0(objM6869O9);
                    }
                    a83 a83Var2 = (a83) objM6869O9;
                    hh4 hh4Var = c1354y3.m12815a() != null ? hh4.f20583a : hh4.f20584b;
                    boolean z = !gh4.m6005a((a44) ir1Var9.m6898k(h44.m6217a()));
                    up4 up4Var = new up4(false ? (byte) 1 : (byte) 0);
                    up4Var.f32065b = od1Var2;
                    up4Var.f32066c = a83Var2;
                    VarHandle.storeStoreFence();
                    c20.m3811f(hh4Var, false, 0, z, vd6.m11834R(113533274, up4Var, ir1Var9), ir1Var9, 196608, 22);
                    b3 = (iIntValue10 & 14) != 4 ? (byte) 0 : (byte) 1;
                    Object objM6869O10 = ir1Var9.m6869O();
                    if (b3 != 0 || objM6869O10 == i50Var) {
                        objM6869O10 = new vp4(yp1Var3, a83Var2, wm0Var, false ? (byte) 1 : (byte) 0);
                        ir1Var9.m6905n0(objM6869O10);
                    }
                    lb5.m7926g(ir1Var9, (mq1) objM6869O10, ju4Var);
                } else {
                    ir1Var9.m6874W();
                }
                return ju4Var;
        }
    }
}
