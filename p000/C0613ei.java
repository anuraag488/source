package p000;

import android.content.Context;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import essentials.app.EsApp;
import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ei */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0613ei implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18111a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f18112b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f18113c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f18114d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f18115e;

    public /* synthetic */ C0613ei(byte b) {
        this.f18111a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        tn2 tn2Var;
        Object obj4;
        xn2 xn2Var;
        char c;
        byte b;
        byte b2 = this.f18111a;
        i50 i50Var = ki0.f23136a;
        int iIntValue = 0;
        ju4 ju4Var = ju4.f22634a;
        switch (b2) {
            case 0:
                ((Integer) obj2).getClass();
                zp0.m13669a((yp1) this.f18113c, (nt2) this.f18112b, (yp1) this.f18114d, (yp1) this.f18115e, (mi0) obj, vd6.m11838V(3073));
                return ju4Var;
            case 1:
                nt2 nt2Var = (nt2) this.f18112b;
                sw2 sw2Var = (sw2) this.f18113c;
                pg0 pg0Var = (pg0) this.f18114d;
                C0705gy c0705gy = (C0705gy) this.f18115e;
                mi0 mi0Var = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objM6869O = ir1Var.m6869O();
                    byte b3 = 3;
                    if (objM6869O == i50Var) {
                        obj3 = objM6869O;
                        C0761ih c0761ih = new C0761ih(b3);
                        c0761ih.f21416b = sw2Var;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(c0761ih);
                        obj3 = c0761ih;
                    }
                    obj3 = objM6869O;
                    nt2 nt2VarM9120z = oh6.m9120z(nt2Var, (yp1) obj3);
                    xq2 xq2VarM9704c = q20.m9704c(ig1.f21378b, true);
                    int iHashCode = Long.hashCode(ir1Var.f21683T);
                    ga3 ga3VarM6902m = ir1Var.m6902m();
                    nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM9120z);
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
                    C0006a5.m53I(ir1Var, ia5.f21216g, xq2VarM9704c);
                    C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
                    C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
                    C0006a5.m50F(ir1Var);
                    C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
                    pg0Var.invoke(ir1Var, 0);
                    Object objM6869O2 = ir1Var.m6869O();
                    Object obj5 = objM6869O2;
                    if (objM6869O2 == i50Var) {
                        C0725hh c0725hh = new C0725hh((byte) 3);
                        c0725hh.f20571b = sw2Var;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(c0725hh);
                        obj5 = c0725hh;
                    }
                    c0705gy.m6194b((wp1) obj5, ir1Var, 6);
                    ir1Var.m6912r(true);
                } else {
                    ir1Var.m6874W();
                }
                return ju4Var;
            case 2:
                ((Integer) obj2).getClass();
                r30.m10185b((String[]) this.f18114d, (C0950nl) this.f18115e, (Context) this.f18112b, (yp1) this.f18113c, (mi0) obj, vd6.m11838V(1));
                return ju4Var;
            case 3:
                mq1 mq1Var = (mq1) this.f18113c;
                String str = (String) this.f18114d;
                sn0 sn0Var = (sn0) this.f18115e;
                Set set = (Set) this.f18112b;
                ((Integer) obj2).getClass();
                ir1 ir1Var2 = (ir1) ((mi0) obj);
                ir1Var2.m6885d0(612339958);
                InterfaceC0755ia interfaceC0755ia = (InterfaceC0755ia) ir1Var2.m6898k(AbstractC1138sa.f30027b);
                pn0 pn0Var = (pn0) mq1Var.invoke(ir1Var2, 0);
                sw2 sw2VarM7369C = k43.m7369C(pn0Var.getTitle(), ir1Var2);
                sw2 sw2VarM7369C2 = k43.m7369C(pn0Var.getDescription(), ir1Var2);
                sw2 sw2VarM7369C3 = k43.m7369C(pn0Var.getIcon(), ir1Var2);
                sw2 sw2VarM7369C4 = k43.m7369C(pn0Var.mo6045a(), ir1Var2);
                sw2 sw2VarM7369C5 = k43.m7369C(pn0Var.mo6048d(), ir1Var2);
                sw2 sw2VarM7369C6 = k43.m7369C(pn0Var.mo6047c(), ir1Var2);
                sw2 sw2VarM7369C7 = k43.m7369C(pn0Var.mo6046b(), ir1Var2);
                Object objM6869O3 = ir1Var2.m6869O();
                Object obj6 = objM6869O3;
                if (objM6869O3 == i50Var) {
                    kn0 kn0Var = new kn0();
                    kn0Var.f23251a = sw2VarM7369C;
                    kn0Var.f23252b = sw2VarM7369C2;
                    kn0Var.f23253c = sw2VarM7369C3;
                    kn0Var.f23254d = sw2VarM7369C4;
                    kn0Var.f23255e = sw2VarM7369C5;
                    kn0Var.f23256f = sw2VarM7369C6;
                    kn0Var.f23257g = sw2VarM7369C7;
                    VarHandle.storeStoreFence();
                    ir1Var2.m6905n0(kn0Var);
                    obj6 = kn0Var;
                }
                kn0 kn0Var2 = (kn0) obj6;
                Object objM6869O4 = ir1Var2.m6869O();
                Object obj7 = objM6869O4;
                if (objM6869O4 == i50Var) {
                    in0 in0Var = new in0();
                    in0Var.f21568a = kn0Var2;
                    in0Var.f21569b = interfaceC0755ia;
                    in0Var.f21570c = str;
                    in0Var.f21571d = sn0Var;
                    in0Var.f21572e = set;
                    VarHandle.storeStoreFence();
                    ir1Var2.m6905n0(in0Var);
                    obj7 = in0Var;
                }
                in0 in0Var2 = (in0) obj7;
                ir1Var2.m6912r(false);
                return in0Var2;
            case 4:
                dc0 dc0Var = (dc0) this.f18113c;
                s44 s44Var = (s44) this.f18114d;
                js4 js4Var = (js4) this.f18115e;
                mq1 mq1Var2 = (mq1) this.f18112b;
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ir1 ir1Var3 = (ir1) mi0Var2;
                if (ir1Var3.m6871T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    pq2.m9600c(dc0Var, s44Var, js4Var, mq1Var2, ir1Var3, 0, 0);
                } else {
                    ir1Var3.m6874W();
                }
                return ju4Var;
            case 5:
                C0945ng c0945ng = (C0945ng) this.f18113c;
                EsApp esApp = (EsApp) this.f18114d;
                mq1 mq1Var3 = (mq1) this.f18115e;
                C0459am c0459am = (C0459am) this.f18112b;
                mi0 mi0Var3 = (mi0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i = EsApp.f18450c;
                ir1 ir1Var4 = (ir1) mi0Var3;
                if (ir1Var4.m6871T(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    ic2[] ic2VarArr = un2.f32012a;
                    ir1Var4.m6885d0(-2060217469);
                    if (yn2.m13181a((a44) ir1Var4.m6898k(h44.m6217a()))) {
                        wp1 wp1Var = (wp1) ir1Var4.m6898k(hj0.f20619a);
                        Object objM6869O5 = ir1Var4.m6869O();
                        if (objM6869O5 == i50Var) {
                            ac4 ac4VarM3547a = bc4.m3547a(v71.f32439a);
                            tn2 tn2Var2 = new tn2();
                            tn2Var2.f31260a = new xj3(ac4VarM3547a, null);
                            sn2 sn2Var = new sn2();
                            sn2Var.f30407a = ac4VarM3547a;
                            sn2Var.f30408b = wp1Var;
                            VarHandle.storeStoreFence();
                            tn2Var2.f31261b = sn2Var;
                            VarHandle.storeStoreFence();
                            ir1Var4.m6905n0(tn2Var2);
                            objM6869O5 = tn2Var2;
                        }
                        tn2Var = (tn2) objM6869O5;
                        ir1Var4.m6912r(false);
                    } else {
                        ir1Var4.m6912r(false);
                        tn2Var = null;
                    }
                    nc4 nc4Var = qm2.f28573a;
                    C0950nl c0950nl = (C0950nl) ir1Var4.m6898k(AbstractC0987ol.m9168a());
                    nc4 nc4Var2 = AndroidCompositionLocals_androidKt.f14651b;
                    Context context = (Context) ir1Var4.m6898k(nc4Var2);
                    Object objM6869O6 = ir1Var4.m6869O();
                    Object obj8 = objM6869O6;
                    if (objM6869O6 == i50Var) {
                        C0558d0 c0558d0 = new C0558d0((byte) 8);
                        c0558d0.f16655b = context;
                        c0558d0.f16656c = c0950nl;
                        VarHandle.storeStoreFence();
                        ir1Var4.m6905n0(c0558d0);
                        obj8 = c0558d0;
                    }
                    List listSingletonList = Collections.singletonList((yp1) obj8);
                    Context context2 = (Context) ir1Var4.m6898k(nc4Var2);
                    so0 so0Var = ((C0459am) ir1Var4.m6898k(AbstractC0496bm.m3626a())).f14621c;
                    Object objM6869O7 = ir1Var4.m6869O();
                    if (objM6869O7 == i50Var) {
                        z02 z02Var = new z02(context2);
                        nw0 nw0Var = z02Var.f35668b;
                        z02Var.f35668b = new nw0(nw0Var.f26128a, so0Var, so0Var, so0Var, nw0Var.f26132e, nw0Var.f26133f, nw0Var.f26134g, nw0Var.f26135h, nw0Var.f26136i, nw0Var.f26137j, nw0Var.f26138k, nw0Var.f26139l, nw0Var.f26140m, nw0Var.f26141n, nw0Var.f26142o);
                        Iterator it = listSingletonList.iterator();
                        while (it.hasNext()) {
                            ((yp1) it.next()).invoke(z02Var);
                        }
                        objM6869O7 = z02Var.m13285a();
                        ir1Var4.m6905n0(objM6869O7);
                    }
                    zh3 zh3VarMo7523a = nc4Var.mo7523a((lk3) objM6869O7);
                    nc4 nc4Var3 = yn2.f35357b;
                    if (yn2.m13181a(c0945ng)) {
                        ir1Var4.m6885d0(1007804628);
                        boolean zM6890g = ir1Var4.m6890g(tn2Var);
                        Object objM6869O8 = ir1Var4.m6869O();
                        if (zM6890g || objM6869O8 == i50Var) {
                            obj4 = objM6869O8;
                            C1053q c1053q = new C1053q((byte) 24);
                            c1053q.f28113b = tn2Var;
                            VarHandle.storeStoreFence();
                            ir1Var4.m6905n0(c1053q);
                            obj4 = c1053q;
                        }
                        wp1 wp1Var2 = (wp1) obj4;
                        ir1Var4.m6885d0(-1313502009);
                        Object objM6869O9 = ir1Var4.m6869O();
                        if (objM6869O9 == i50Var) {
                            pn2[] pn2VarArr = (pn2[]) wp1Var2.invoke();
                            pn2[] pn2VarArr2 = (pn2[]) Arrays.copyOf(pn2VarArr, pn2VarArr.length);
                            k44 k44Var = AbstractC1310wx.f33816a;
                            List listM9215j0 = AbstractC0990oo.m9215j0(pn2VarArr2);
                            mc4 mc4Var = new mc4();
                            mc4Var.f24819a = k44Var;
                            mc4Var.f24820b = listM9215j0;
                            VarHandle.storeStoreFence();
                            objM6869O9 = new xn2(mc4Var, "");
                            ir1Var4.m6905n0(objM6869O9);
                        }
                        xn2Var = (xn2) objM6869O9;
                        c = 0;
                        ir1Var4.m6912r(false);
                        ir1Var4.m6912r(false);
                    } else {
                        ir1Var4.m6885d0(1177137925);
                        ir1Var4.m6912r(false);
                        c = 0;
                        xn2Var = null;
                    }
                    zh3 zh3VarMo7523a2 = nc4Var3.mo7523a(xn2Var);
                    zh3 zh3VarMo7523a3 = ((xh3) un2.f32013b.m9574l(null, un2.f32012a[c])).mo7523a(tn2Var);
                    xh3 xh3Var = (xh3) aa3.f209b.m9574l(null, aa3.f208a[c]);
                    xz4 xz4Var = (xz4) ir1Var4.m6898k(la1.f23888a);
                    Object objM6869O10 = ir1Var4.m6869O();
                    r71 r71Var = r71.f29063a;
                    if (objM6869O10 == i50Var) {
                        objM6869O10 = lb5.m7942w(r71Var, ir1Var4);
                        ir1Var4.m6905n0(objM6869O10);
                    }
                    zo0 zo0Var = (zo0) objM6869O10;
                    lv1 lv1Var = (lv1) ir1Var4.m6898k(nv1.f26110a);
                    Object objM6869O11 = ir1Var4.m6869O();
                    if (objM6869O11 == i50Var) {
                        y93 y93Var = new y93(lv1Var, xz4Var, null);
                        r50 r50Var = i41.f21117b;
                        l54 l54Var = new l54(hx2.m6530a(), new LinkedHashMap(), zo0Var, r71Var, y93Var, null);
                        ir1Var4.m6905n0(l54Var);
                        objM6869O11 = l54Var;
                    }
                    mq1 mq1Var4 = (mq1) objM6869O11;
                    Object objM6869O12 = ir1Var4.m6869O();
                    if (objM6869O12 == i50Var) {
                        b = 0;
                        objM6869O12 = new w93(mq1Var4, (wm0) null, (byte) 0);
                        ir1Var4.m6905n0(objM6869O12);
                    } else {
                        b = 0;
                    }
                    zh3[] zh3VarArr = {zh3VarMo7523a, zh3VarMo7523a2, zh3VarMo7523a3, xh3Var.mo7523a((mq1) objM6869O12)};
                    ma1 ma1Var = new ma1(b);
                    ma1Var.f24781b = esApp;
                    ma1Var.f24782c = mq1Var3;
                    ma1Var.f24783d = c0459am;
                    VarHandle.storeStoreFence();
                    as4.m3245d(zh3VarArr, vd6.m11834R(1906626808, ma1Var, ir1Var4), ir1Var4, 48);
                } else {
                    ir1Var4.m6874W();
                }
                return ju4Var;
            case 6:
                ((Integer) obj2).getClass();
                lb5.m7930k((wp1) this.f18113c, (nt2) this.f18112b, (vh2) this.f18114d, (li2) this.f18115e, (mi0) obj, vd6.m11838V(1));
                return ju4Var;
            case 7:
                ((Integer) obj2).getClass();
                zy5.m13876k((List) this.f18113c, (Map) this.f18114d, (ie1) this.f18115e, (zx2) this.f18112b, (mi0) obj, vd6.m11838V(1));
                return ju4Var;
            case 8:
                wf4 wf4Var = (wf4) this.f18113c;
                lu2 lu2Var = (lu2) this.f18114d;
                sw2 sw2Var2 = (sw2) this.f18115e;
                pn0 pn0Var2 = (pn0) this.f18112b;
                mi0 mi0Var4 = (mi0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ir1 ir1Var5 = (ir1) mi0Var4;
                if (ir1Var5.m6871T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    fs1 fs1Var = (fs1) sw2Var2.getValue();
                    cs1 cs1Var = fs1Var instanceof cs1 ? (cs1) fs1Var : null;
                    boolean z = (cs1Var != null ? cs1Var.f16424a : null) == wf4Var;
                    p91 p91VarM9439a = k91.m7438c(lu2Var.mo7286c(), 2).m9439a(k91.m7440e(lu2Var.mo7289f(), 0.0f, 6));
                    mc1 mc1VarM8273a = k91.m7439d(lu2Var.mo7286c(), 2).m8273a(k91.m7441f(lu2Var.mo7289f(), 0.0f, 6));
                    C0928n c0928n = new C0928n((byte) 15);
                    c0928n.f25353b = pn0Var2;
                    VarHandle.storeStoreFence();
                    z62.m13372c(z, null, p91VarM9439a, mc1VarM8273a, null, vd6.m11834R(260272036, c0928n, ir1Var5), ir1Var5, 196608);
                } else {
                    ir1Var5.m6874W();
                }
                return ju4Var;
            case 9:
                ((Integer) obj2).getClass();
                mz3.m8464f((xk4) this.f18114d, (yp1) this.f18113c, (nt2) this.f18112b, (oz3) this.f18115e, (mi0) obj, vd6.m11838V(49));
                return ju4Var;
            default:
                g12 g12Var = (g12) this.f18113c;
                g12 g12Var2 = (g12) this.f18114d;
                mq1 mq1Var5 = (mq1) this.f18115e;
                d83 d83Var = ((C1367yg) this.f18112b).f35202a;
                mi0 mi0Var5 = (mi0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ir1 ir1Var6 = (ir1) mi0Var5;
                if (ir1Var6.m6871T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    dn0 dn0Var = (dn0) ir1Var6.m6898k(ln0.f24194e);
                    if (dn0Var != dn0.f17204b) {
                        iIntValue = ((Number) d83Var.getValue()).intValue();
                    } else if (((Number) d83Var.getValue()).intValue() != 1) {
                        iIntValue = 1;
                    }
                    je0.m7085a(iIntValue == 1 ? g12Var : g12Var2, (nt2) mq1Var5.invoke(Integer.valueOf(((Number) d83Var.getValue()).intValue()), dn0Var), null, ir1Var6, 0, 4);
                } else {
                    ir1Var6.m6874W();
                }
                return ju4Var;
        }
    }
}
