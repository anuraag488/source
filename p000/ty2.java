package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ty2 implements mq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f31533a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Map f31534b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ he0 f31535c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ zx2 f31536d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ long f31537e;

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        long j;
        nt2 nt2VarM5678p;
        sw2 sw2Var;
        Object obj3;
        int i;
        C0910mi c0910mi;
        sw2 sw2Var2;
        sw2 sw2Var3;
        wf4 wf4Var;
        zr1 zr1Var;
        Object obj4;
        Object obj5;
        List list = this.f31533a;
        Map map = this.f31534b;
        he0 he0Var = this.f31535c;
        zx2 zx2Var = this.f31536d;
        long j2 = this.f31537e;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zM12436d = wx2.m12436d(ir1Var);
            lu2 lu2Var = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24280d;
            byte b = 4;
            xb4 xb4VarM8765a = AbstractC0947ni.m8765a(list.size() > 4 ? 16.0f : 52.0f, lu2Var.mo7289f(), ir1Var);
            uy2 uy2Var = new uy2();
            uy2Var.f32253a = list;
            uy2Var.f32254b = lu2Var;
            VarHandle.storeStoreFence();
            pg0 pg0VarM11834R = vd6.m11834R(-1724717746, uy2Var, ir1Var);
            ir1Var.m6885d0(252009334);
            LinkedHashMap linkedHashMap = new LinkedHashMap(fq2.m5779K(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), ln0.m8040b((sn0) entry.getValue(), "nav_bar_swipe", ir1Var));
                b = b;
            }
            byte b2 = b;
            ir1Var.m6912r(false);
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                j = 0;
                objM6869O = new C0910mi(b33.m3423a(0L), sw4.f30617f, null, 12);
                ir1Var.m6905n0(objM6869O);
            } else {
                j = 0;
            }
            C0910mi c0910mi2 = (C0910mi) objM6869O;
            Object objM6869O2 = ir1Var.m6869O();
            if (objM6869O2 == i50Var) {
                objM6869O2 = dt0.m4700c(1.0f);
                ir1Var.m6905n0(objM6869O2);
            }
            C0910mi c0910mi3 = (C0910mi) objM6869O2;
            boolean zM6894i = ir1Var.m6894i(c0910mi2) | ir1Var.m6894i(c0910mi3);
            Object objM6869O3 = ir1Var.m6869O();
            Object obj6 = objM6869O3;
            if (zM6894i || objM6869O3 == i50Var) {
                jp1 jp1Var = new jp1((byte) 7);
                jp1Var.f22485b = c0910mi2;
                jp1Var.f22486c = c0910mi3;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(jp1Var);
                obj6 = jp1Var;
            }
            wp1 wp1Var = (wp1) obj6;
            he0Var.getClass();
            ir1Var.m6885d0(1245100996);
            boolean zM6890g = ir1Var.m6890g(he0Var) | ir1Var.m6890g(wp1Var);
            Object objM6869O4 = ir1Var.m6869O();
            Object obj7 = objM6869O4;
            if (zM6890g || objM6869O4 == i50Var) {
                C0558d0 c0558d0 = new C0558d0((byte) 21);
                c0558d0.f16655b = he0Var;
                c0558d0.f16656c = wp1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0558d0);
                obj7 = c0558d0;
            }
            lb5.m7923d(wp1Var, (yp1) obj7, ir1Var);
            ir1Var.m6912r(false);
            Object objM6869O5 = ir1Var.m6869O();
            if (objM6869O5 == i50Var) {
                objM6869O5 = k43.m7398w(null);
                ir1Var.m6905n0(objM6869O5);
            }
            sw2 sw2Var4 = (sw2) objM6869O5;
            Object objM6869O6 = ir1Var.m6869O();
            if (objM6869O6 == i50Var) {
                objM6869O6 = dt0.m4700c(0.0f);
                ir1Var.m6905n0(objM6869O6);
            }
            C0910mi c0910mi4 = (C0910mi) objM6869O6;
            ky0 ky0Var = (ky0) ir1Var.m6898k(ij0.f21473h);
            float fMo3575E = ky0Var.mo3575E(48.0f);
            float fMo3575E2 = ky0Var.mo3575E(36.0f);
            float fMo3575E3 = ky0Var.mo3575E(8.0f);
            float fMo3575E4 = ky0Var.mo3575E(32.0f);
            float fMo3575E5 = ky0Var.mo3575E(300.0f);
            float f = zx2Var.f36444b;
            yx2 yx2Var = zx2Var.f36443a;
            float f2 = (1.40625f * f) + 9.0f;
            InterfaceC0755ia interfaceC0755ia = (InterfaceC0755ia) ir1Var.m6898k(AbstractC1138sa.f30027b);
            Object objM6869O7 = ir1Var.m6869O();
            if (objM6869O7 == i50Var) {
                objM6869O7 = k43.m7398w(new es1(0.0f));
                ir1Var.m6905n0(objM6869O7);
            }
            sw2 sw2Var5 = (sw2) objM6869O7;
            Object objM6869O8 = ir1Var.m6869O();
            if (objM6869O8 == i50Var) {
                jp1 jp1Var2 = new jp1((byte) 8);
                jp1Var2.f22485b = c0910mi3;
                jp1Var2.f22486c = sw2Var5;
                VarHandle.storeStoreFence();
                objM6869O8 = s94.m10566b(jp1Var2);
                ir1Var.m6905n0(objM6869O8);
            }
            xb4 xb4Var = (xb4) objM6869O8;
            xb4 xb4VarM4941a = e74.m4941a(j2, lu2Var.mo7286c(), ir1Var, 0);
            Object objM6869O9 = ir1Var.m6869O();
            r71 r71Var = r71.f29063a;
            if (objM6869O9 == i50Var) {
                objM6869O9 = lb5.m7942w(r71Var, ir1Var);
                ir1Var.m6905n0(objM6869O9);
            }
            zo0 zo0Var = (zo0) objM6869O9;
            Object objM6869O10 = ir1Var.m6869O();
            if (objM6869O10 == i50Var) {
                objM6869O10 = k43.m7398w(null);
                ir1Var.m6905n0(objM6869O10);
            }
            sw2 sw2Var6 = (sw2) objM6869O10;
            Object objM6869O11 = ir1Var.m6869O();
            if (objM6869O11 == i50Var) {
                objM6869O11 = AbstractC0573df.m4495a();
                ir1Var.m6905n0(objM6869O11);
            }
            C0489bf c0489bf = (C0489bf) objM6869O11;
            int iOrdinal = yx2Var.ordinal();
            kt2 kt2Var = kt2.f23428a;
            if (iOrdinal == 0) {
                nt2VarM5678p = AbstractC0647fd.m5678p(0.0f, f2, 11);
            } else if (iOrdinal == 1) {
                nt2VarM5678p = AbstractC0647fd.m5678p(f2, 0.0f, 14);
            } else {
                if (iOrdinal != 2) {
                    C0670g.m5864c();
                    return null;
                }
                nt2VarM5678p = AbstractC0647fd.m5653K(kt2Var, 0.0f, f2, 0.0f, 0.0f, 13);
            }
            nt2 nt2VarMo7630d = nt2VarM5678p.mo7630d(yx2Var == yx2.f35586c ? n74.m8575c(n74.m8574b(kt2Var, 1.0f), f) : n74.m8583k(kt2Var, f).mo7630d(n74.f25505b));
            Set setKeySet = map.keySet();
            boolean zM6890g2 = ir1Var.m6890g(zo0Var) | ir1Var.m6894i(c0910mi4) | ir1Var.m6894i(zx2Var) | ir1Var.m6894i(c0910mi3) | ir1Var.m6890g(lu2Var) | ir1Var.m6884d(fMo3575E3) | ir1Var.m6884d(fMo3575E2) | ir1Var.m6884d(fMo3575E) | ir1Var.m6894i(c0910mi2);
            Object objM6869O12 = ir1Var.m6869O();
            if (zM6890g2 || objM6869O12 == i50Var) {
                vy2 vy2Var = new vy2();
                vy2Var.f32946a = zo0Var;
                vy2Var.f32947b = sw2Var6;
                vy2Var.f32948c = sw2Var4;
                vy2Var.f32949d = c0910mi4;
                vy2Var.f32950e = zx2Var;
                sw2Var = sw2Var5;
                vy2Var.f32951f = sw2Var;
                vy2Var.f32952g = c0910mi3;
                vy2Var.f32953h = lu2Var;
                vy2Var.f32954i = fMo3575E3;
                vy2Var.f32955j = fMo3575E2;
                vy2Var.f32956k = fMo3575E;
                vy2Var.f32957l = c0910mi2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(vy2Var);
                obj3 = vy2Var;
            } else {
                sw2Var = sw2Var5;
                obj3 = objM6869O12;
            }
            pq1 pq1Var = (pq1) obj3;
            Object objM6869O13 = ir1Var.m6869O();
            if (objM6869O13 == i50Var) {
                objM6869O13 = lb5.m7942w(r71Var, ir1Var);
                ir1Var.m6905n0(objM6869O13);
            }
            ie0 ie0Var = new ie0((byte) 1);
            ie0Var.f21278b = (zo0) objM6869O13;
            ie0Var.f21279c = interfaceC0755ia;
            ie0Var.f21280d = linkedHashMap;
            ie0Var.f21281e = map;
            VarHandle.storeStoreFence();
            ir1Var.m6885d0(1337278921);
            boolean zM6886e = ir1Var.m6886e(yx2Var.ordinal()) | ir1Var.m6890g(setKeySet);
            Object objM6869O14 = ir1Var.m6869O();
            if (zM6886e || objM6869O14 == i50Var) {
                int iOrdinal2 = yx2Var.ordinal();
                if (iOrdinal2 == 0) {
                    i = -1;
                } else if (iOrdinal2 == 1) {
                    i = 1;
                } else {
                    if (iOrdinal2 != 2) {
                        C0670g.m5864c();
                        return null;
                    }
                    i = 0;
                }
                Set set = setKeySet;
                int i2 = i;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    Iterator it2 = it;
                    int iOrdinal3 = ((xx2) it.next()).ordinal();
                    if (iOrdinal3 != 0) {
                        sw2Var3 = sw2Var;
                        if (iOrdinal3 == 1) {
                            wf4Var = wf4.f33340b;
                        } else {
                            if (iOrdinal3 != 2) {
                                C0670g.m5864c();
                                return null;
                            }
                            wf4Var = wf4.f33341c;
                        }
                    } else {
                        sw2Var3 = sw2Var;
                        wf4Var = wf4.f33339a;
                    }
                    v91 v91Var = wf4.f33344f;
                    int iOrdinal4 = (wf4Var.ordinal() - i2) % 4;
                    C0910mi c0910mi5 = c0910mi3;
                    int iOrdinal5 = ((wf4) v91Var.get(iOrdinal4 + ((((iOrdinal4 ^ 4) & ((-iOrdinal4) | iOrdinal4)) >> 31) & 4))).ordinal();
                    if (iOrdinal5 == 0) {
                        zr1Var = zr1.f36281a;
                    } else if (iOrdinal5 == 1) {
                        zr1Var = zr1.f36283c;
                    } else if (iOrdinal5 == 2) {
                        zr1Var = zr1.f36285e;
                    } else {
                        if (iOrdinal5 != 3) {
                            C0670g.m5864c();
                            return null;
                        }
                        zr1Var = zr1.f36287g;
                    }
                    if (zr1Var != null) {
                        linkedHashSet.add(zr1Var);
                    }
                    it = it2;
                    c0910mi3 = c0910mi5;
                    sw2Var = sw2Var3;
                }
                c0910mi = c0910mi3;
                sw2Var2 = sw2Var;
                ir1Var.m6905n0(linkedHashSet);
                objM6869O14 = linkedHashSet;
            } else {
                c0910mi = c0910mi3;
                sw2Var2 = sw2Var;
            }
            Set set2 = (Set) objM6869O14;
            if (set2.isEmpty()) {
                ir1Var.m6912r(false);
                lu2Var = lu2Var;
            } else {
                sw2 sw2VarM7369C = k43.m7369C(yx2Var, ir1Var);
                sw2 sw2VarM7369C2 = k43.m7369C(ie0Var, ir1Var);
                sw2 sw2VarM7369C3 = k43.m7369C(pq1Var, ir1Var);
                boolean zM6890g3 = ir1Var.m6890g(set2);
                Object objM6869O15 = ir1Var.m6869O();
                if (zM6890g3 || objM6869O15 == i50Var) {
                    obj4 = objM6869O15;
                    lf0 lf0Var = new lf0();
                    lf0Var.f23991a = set2;
                    lf0Var.f23992b = k43.m7398w(new es1(0.0f));
                    lf0Var.f23993c = k43.m7398w(null);
                    kf0 kf0Var = new kf0((byte) 0);
                    kf0Var.f23097b = lf0Var;
                    VarHandle.storeStoreFence();
                    lf0Var.f23994d = s94.m10566b(kf0Var);
                    kf0 kf0Var2 = new kf0((byte) 1);
                    kf0Var2.f23097b = lf0Var;
                    VarHandle.storeStoreFence();
                    lf0Var.f23995e = s94.m10566b(kf0Var2);
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(lf0Var);
                    obj4 = lf0Var;
                }
                lf0 lf0Var2 = (lf0) obj4;
                Object objM6869O16 = ir1Var.m6869O();
                if (objM6869O16 == i50Var) {
                    objM6869O16 = k43.m7398w(b33.m3423a(j));
                    ir1Var.m6905n0(objM6869O16);
                }
                sw2 sw2Var7 = (sw2) objM6869O16;
                boolean zM6890g4 = ir1Var.m6890g(sw2VarM7369C3);
                Object objM6869O17 = ir1Var.m6869O();
                Object obj8 = objM6869O17;
                if (zM6890g4 || objM6869O17 == i50Var) {
                    na1 na1Var = new na1((byte) 14);
                    na1Var.f25596c = sw2Var7;
                    na1Var.f25595b = sw2VarM7369C3;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(na1Var);
                    obj8 = na1Var;
                }
                yp1 yp1Var = (yp1) obj8;
                boolean zM6890g5 = ir1Var.m6890g(sw2VarM7369C) | ir1Var.m6890g(lf0Var2) | ir1Var.m6890g(sw2VarM7369C3);
                Object objM6869O18 = ir1Var.m6869O();
                if (zM6890g5 || objM6869O18 == i50Var) {
                    gy2 gy2Var = new gy2((byte) 1);
                    gy2Var.f20188b = lf0Var2;
                    gy2Var.f20189c = sw2VarM7369C;
                    gy2Var.f20190d = sw2VarM7369C3;
                    gy2Var.f20191e = sw2Var7;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(gy2Var);
                    obj5 = gy2Var;
                } else {
                    obj5 = objM6869O18;
                }
                oq1 oq1Var = (oq1) obj5;
                boolean zM6890g6 = ir1Var.m6890g(sw2VarM7369C) | ir1Var.m6890g(sw2VarM7369C3) | ir1Var.m6890g(sw2VarM7369C2);
                Object objM6869O19 = ir1Var.m6869O();
                Object obj9 = objM6869O19;
                if (zM6890g6 || objM6869O19 == i50Var) {
                    at1 at1Var = new at1((byte) 5);
                    at1Var.f14855b = sw2VarM7369C;
                    at1Var.f14856c = sw2VarM7369C3;
                    at1Var.f14857d = sw2VarM7369C2;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(at1Var);
                    obj9 = at1Var;
                }
                nq1 nq1Var = (nq1) obj9;
                if (!lf0Var2.f23991a.isEmpty()) {
                    nh2 nh2Var = new nh2(b2);
                    nh2Var.f25807d = lf0Var2;
                    nh2Var.f25805b = yp1Var;
                    nh2Var.f25808e = oq1Var;
                    nh2Var.f25806c = nq1Var;
                    VarHandle.storeStoreFence();
                    nt2VarMo7630d = qq2.m10029m(nt2VarMo7630d, nh2Var);
                }
                ir1Var.m6912r(false);
            }
            xq2 xq2VarM9704c = q20.m9704c(ig1.f21378b, true);
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarMo7630d);
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
            boolean zM6894i2 = ir1Var.m6894i(zx2Var) | ir1Var.m6894i(c0910mi2) | ir1Var.m6884d(fMo3575E4);
            Object objM6869O20 = ir1Var.m6869O();
            Object obj10 = objM6869O20;
            if (zM6894i2 || objM6869O20 == i50Var) {
                C0979od c0979od = new C0979od((byte) 1);
                c0979od.f26628c = zx2Var;
                c0979od.f26629d = c0910mi2;
                c0979od.f26627b = fMo3575E4;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0979od);
                obj10 = c0979od;
            }
            nt2 nt2VarM10693F = se0.m10693F(kt2Var, (yp1) obj10);
            boolean zM6894i3 = ir1Var.m6894i(c0910mi2) | ir1Var.m6894i(zx2Var) | ir1Var.m6884d(fMo3575E4) | ir1Var.m6884d(fMo3575E5) | ir1Var.m6894i(c0910mi4) | ir1Var.m6894i(c0489bf) | ir1Var.m6890g(xb4VarM4941a);
            Object objM6869O21 = ir1Var.m6869O();
            Object obj11 = objM6869O21;
            if (zM6894i3 || objM6869O21 == i50Var) {
                wy2 wy2Var = new wy2();
                wy2Var.f33855a = c0910mi2;
                wy2Var.f33856b = zx2Var;
                wy2Var.f33857c = fMo3575E4;
                wy2Var.f33858d = fMo3575E5;
                wy2Var.f33859e = c0910mi4;
                wy2Var.f33860f = c0489bf;
                wy2Var.f33861g = xb4VarM4941a;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(wy2Var);
                obj11 = wy2Var;
            }
            q20.m9702a(C0638f5.m5542m(nt2VarM10693F, (yp1) obj11), ir1Var, 0);
            boolean zM6894i4 = ir1Var.m6894i(c0910mi2);
            Object objM6869O22 = ir1Var.m6869O();
            Object obj12 = objM6869O22;
            if (zM6894i4 || objM6869O22 == i50Var) {
                zd0 zd0Var = new zd0((byte) 4);
                zd0Var.f35995b = c0910mi2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(zd0Var);
                obj12 = zd0Var;
            }
            nt2 nt2VarM10693F2 = se0.m10693F(kt2Var, (yp1) obj12);
            C0853kz c0853kz = ig1.f21381e;
            py2 py2Var = new py2();
            py2Var.f28085a = linkedHashMap;
            py2Var.f28086b = zx2Var;
            py2Var.f28087c = zM12436d;
            py2Var.f28088d = lu2Var;
            py2Var.f28089e = c0910mi;
            py2Var.f28090f = xb4Var;
            py2Var.f28091g = sw2Var4;
            py2Var.f28092h = sw2Var2;
            py2Var.f28093i = ky0Var;
            py2Var.f28094j = xb4VarM8765a;
            py2Var.f28095k = pg0VarM11834R;
            VarHandle.storeStoreFence();
            i25.m6609a(nt2VarM10693F2, c0853kz, false, vd6.m11834R(1999149067, py2Var, ir1Var), ir1Var, 3120, 4);
            ir1Var.m6912r(true);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
