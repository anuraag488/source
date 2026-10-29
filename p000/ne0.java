package p000;

import essentials.app.EsActivity;
import essentials.app.EsApp;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ne0 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25727a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f25728b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f25729c;

    public /* synthetic */ ne0(byte b) {
        this.f25727a = b;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x042f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0432  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r10v55 */
    /* JADX INFO: renamed from: b */
    private final Object m8692b(Object obj, Object obj2) {
        C1349xz c1349xzM12820B0;
        wp1 wp1Var;
        long j;
        g44 g44Var;
        sw2 sw2Var;
        Object obj3;
        qe3 qe3Var;
        Object obj4;
        String str;
        og3 og3Var;
        og3 og3Var2;
        Object obj5;
        C0950nl c0950nl;
        ?? r10;
        sp1 sp1VarM9076A;
        boolean z;
        sp1 sp1VarM9076A2;
        xn2 xn2Var;
        long jM3238Q;
        xn2 xn2Var2;
        hd1 hd1Var = (hd1) this.f25728b;
        mq1 mq1Var = (mq1) this.f25729c;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        fp1 fp1Var = oh6.f26718L;
        ir1 ir1Var = (ir1) mi0Var;
        boolean zM6871T = ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2);
        ju4 ju4Var = ju4.f22634a;
        if (!zM6871T) {
            ir1Var.m6874W();
            return ju4Var;
        }
        C0950nl c0950nl2 = (C0950nl) ir1Var.m6898k(AbstractC0987ol.m9168a());
        cp1 cp1Var = hd1Var.f20487e;
        if (cp1Var == null) {
            ir1Var.m6885d0(-1985393762);
            ir1Var.m6912r(false);
            c1349xzM12820B0 = null;
        } else {
            ir1Var.m6885d0(-1033875819);
            c1349xzM12820B0 = y42.m12820B0(ir1Var);
            ir1Var.m6912r(false);
        }
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            objM6869O = k43.m7398w(fp1Var);
            ir1Var.m6905n0(objM6869O);
        }
        sw2 sw2Var2 = (sw2) objM6869O;
        Object objM6869O2 = ir1Var.m6869O();
        if (objM6869O2 == i50Var) {
            objM6869O2 = k43.m7398w(fp1Var);
            ir1Var.m6905n0(objM6869O2);
        }
        sw2 sw2Var3 = (sw2) objM6869O2;
        Object objM6869O3 = ir1Var.m6869O();
        if (objM6869O3 == i50Var) {
            objM6869O3 = k43.m7398w(null);
            ir1Var.m6905n0(objM6869O3);
        }
        sw2 sw2Var4 = (sw2) objM6869O3;
        Object objM6869O4 = ir1Var.m6869O();
        if (objM6869O4 == i50Var) {
            objM6869O4 = k43.m7398w(Boolean.FALSE);
            ir1Var.m6905n0(objM6869O4);
        }
        sw2 sw2Var5 = (sw2) objM6869O4;
        if (cp1Var == null) {
            ir1Var.m6885d0(-1985001828);
            ir1Var.m6912r(false);
            qe3Var = ze3.f36023b;
            c0950nl2 = c0950nl2;
            ju4Var = ju4Var;
        } else {
            ir1Var.m6885d0(-1984930094);
            Object objM6869O5 = ir1Var.m6869O();
            if (objM6869O5 == i50Var) {
                objM6869O5 = k43.m7398w(ze3.f36023b);
                ir1Var.m6905n0(objM6869O5);
            }
            sw2 sw2Var6 = (sw2) objM6869O5;
            List list = cp1Var.f16331b;
            ir1Var.m6885d0(-1033854111);
            List list2 = cp1Var.f16330a;
            ArrayList arrayList = new ArrayList(ib0.m6717y0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(y42.m12821C0((og3) it.next(), c1349xzM12820B0, ir1Var));
            }
            ir1Var.m6912r(false);
            ir1Var.m6885d0(-1033849535);
            v71 v71Var = v71.f32439a;
            ArrayList arrayList2 = new ArrayList(ib0.m6717y0(v71Var, 10));
            Iterator<E> it2 = v71Var.iterator();
            while (it2.hasNext()) {
                arrayList2.add(y42.m12821C0((og3) it2.next(), c1349xzM12820B0, ir1Var));
            }
            ir1Var.m6912r(false);
            Object objM6869O6 = ir1Var.m6869O();
            r71 r71Var = r71.f29063a;
            if (objM6869O6 == i50Var) {
                objM6869O6 = lb5.m7942w(r71Var, ir1Var);
                ir1Var.m6905n0(objM6869O6);
            }
            C0686gf c0686gf = new C0686gf((byte) 6);
            c0686gf.f19762b = (zo0) objM6869O6;
            c0686gf.f19763c = sw2Var2;
            VarHandle.storeStoreFence();
            Object objM6869O7 = ir1Var.m6869O();
            Object obj6 = objM6869O7;
            if (objM6869O7 == i50Var) {
                ld1 ld1Var = new ld1((byte) 0);
                ld1Var.f23961b = sw2Var4;
                ld1Var.f23962c = sw2Var5;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(ld1Var);
                obj6 = ld1Var;
            }
            wp1 wp1Var2 = (wp1) obj6;
            if (((xp4) sw2Var4.getValue()) == xp4.f34520a) {
                ir1Var.m6885d0(-1984144430);
                Object objM6869O8 = ir1Var.m6869O();
                if (objM6869O8 == i50Var) {
                    obj5 = objM6869O8;
                    C0725hh c0725hh = new C0725hh((byte) 7);
                    c0725hh.f20571b = sw2Var3;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0725hh);
                    obj5 = c0725hh;
                }
                obj5 = objM6869O8;
                wp1Var = (wp1) obj5;
                ir1Var.m6912r(false);
            } else {
                ir1Var.m6885d0(-1984113090);
                ir1Var.m6912r(false);
                wp1Var = null;
            }
            int i = pe3.f27565d;
            nc4 nc4Var = ze3.f36022a;
            r50 r50Var = i41.f21117b;
            long jM3238Q2 = as4.m3238Q(10, m41.MINUTES);
            sw2 sw2VarM7369C = k43.m7369C(wp1Var2, ir1Var);
            sw2 sw2VarM7369C2 = k43.m7369C(wp1Var, ir1Var);
            xn2 xn2Var3 = (xn2) ir1Var.m6898k(yn2.f35357b);
            if (xn2Var3 == null) {
                ir1Var.m6885d0(-1476823888);
                ir1Var.m6912r(false);
            } else {
                ir1Var.m6885d0(-1476823887);
                boolean zM6890g = ir1Var.m6890g("PremiumVersionState") | ir1Var.m6890g(xn2Var3);
                Object objM6869O9 = ir1Var.m6869O();
                if (zM6890g || objM6869O9 == i50Var) {
                    objM6869O9 = xn2Var3.m12723c("PremiumVersionState");
                    ir1Var.m6905n0(objM6869O9);
                }
                ir1Var.m6912r(false);
            }
            Object objM6869O10 = ir1Var.m6869O();
            if (objM6869O10 == i50Var) {
                objM6869O10 = lb5.m7942w(r71Var, ir1Var);
                ir1Var.m6905n0(objM6869O10);
            }
            zo0 zo0Var = (zo0) objM6869O10;
            yp1 yp1VarM5366p0 = ev0.m5366p0(ir1Var);
            xz4 xz4Var = (xz4) ir1Var.m6898k(la1.f23888a);
            sl2 sl2VarM7680G = kx5.m7680G();
            sl2VarM7680G.addAll(arrayList);
            sl2VarM7680G.addAll(arrayList2);
            sl2 sl2VarM7740w = kx5.m7740w(sl2VarM7680G);
            ir1Var.m6885d0(675811308);
            ir1Var.m6912r(false);
            sw2 sw2VarM7369C3 = k43.m7369C(null, ir1Var);
            Object objM6869O11 = ir1Var.m6869O();
            if (objM6869O11 == i50Var) {
                objM6869O11 = new da2((byte) 12);
                ir1Var.m6905n0(objM6869O11);
            }
            wp1 wp1Var3 = (wp1) objM6869O11;
            a44 a44Var = (a44) ir1Var.m6898k(h44.m6217a());
            Object objM6869O12 = ir1Var.m6869O();
            if (objM6869O12 == i50Var) {
                objM6869O12 = C0971o5.f26347j;
                ir1Var.m6905n0(objM6869O12);
            }
            g44 g44VarM6218b = h44.m6218b("force_premium", (wp1) objM6869O12, a44Var, wp1Var3, ir1Var);
            InterfaceC0755ia interfaceC0755ia = (InterfaceC0755ia) ir1Var.m6898k(AbstractC1138sa.f30027b);
            wp1 wp1Var4 = (wp1) ir1Var.m6898k(hj0.f20619a);
            Object objM6869O13 = ir1Var.m6869O();
            if (objM6869O13 == i50Var) {
                objM6869O13 = k43.m7398w(Boolean.FALSE);
                ir1Var.m6905n0(objM6869O13);
            }
            sw2 sw2Var7 = (sw2) objM6869O13;
            Object objM6869O14 = ir1Var.m6869O();
            if (objM6869O14 == i50Var) {
                objM6869O14 = k43.m7398w(i41.m6644c(0L));
                ir1Var.m6905n0(objM6869O14);
            }
            sw2 sw2Var8 = (sw2) objM6869O14;
            if (((Boolean) sw2Var7.getValue()).booleanValue()) {
                ir1Var.m6885d0(676641675);
                boolean zM6888f = ir1Var.m6888f(jM3238Q2);
                j = jM3238Q2;
                Object objM6869O15 = ir1Var.m6869O();
                if (zM6888f || objM6869O15 == i50Var) {
                    objM6869O15 = new k31(j, (Object) sw2Var7, (Object) sw2Var8, (wm0) null, (byte) 2);
                    ir1Var.m6905n0(objM6869O15);
                }
                lb5.m7926g(ir1Var, (mq1) objM6869O15, ju4Var);
                ir1Var.m6912r(false);
            } else {
                g44VarM6218b = g44VarM6218b;
                wp1Var4 = wp1Var4;
                j = jM3238Q2;
                sw2Var7 = sw2Var7;
                sw2Var8 = sw2Var8;
                ir1Var.m6885d0(676770449);
                ir1Var.m6912r(false);
            }
            Object objM6869O16 = ir1Var.m6869O();
            if (objM6869O16 == i50Var) {
                ye3 ye3Var = new ye3();
                ye3Var.f35163b = arrayList;
                ye3Var.f35164c = sl2VarM7740w;
                ye3Var.f35165d = sw2VarM7369C;
                ye3Var.f35166e = sw2Var7;
                ye3Var.f35167f = sw2VarM7369C2;
                ye3Var.f35168g = sw2Var8;
                ye3Var.f35169h = zo0Var;
                ye3Var.f35170i = j;
                ye3Var.f35171j = list;
                ye3Var.f35172k = xz4Var;
                ye3Var.f35173l = interfaceC0755ia;
                ye3Var.f35174m = c0686gf;
                ye3Var.f35175n = wp1Var4;
                ye3Var.f35176o = yp1VarM5366p0;
                C1048pv c1048pv = new C1048pv((byte) 14);
                c1048pv.f28016b = sl2VarM7740w;
                g44Var = g44VarM6218b;
                c1048pv.f28017c = g44Var;
                sw2Var = sw2VarM7369C3;
                c1048pv.f28018d = sw2Var;
                VarHandle.storeStoreFence();
                ye3Var.f35162a = s94.m10566b(c1048pv);
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(ye3Var);
                obj3 = ye3Var;
            } else {
                g44Var = g44VarM6218b;
                sw2Var = sw2VarM7369C3;
                obj3 = objM6869O16;
            }
            ye3 ye3Var2 = (ye3) obj3;
            if (interfaceC0755ia != null) {
                ir1Var.m6885d0(679519839);
                ArrayList arrayList3 = new ArrayList();
                ListIterator listIterator = sl2VarM7740w.listIterator(0);
                while (true) {
                    ow1 ow1Var = (ow1) listIterator;
                    if (!ow1Var.hasNext()) {
                        break;
                    }
                    Object next = ow1Var.next();
                    if (z62.m13387o((Boolean) ((d00) next).f16657a.getValue(), Boolean.TRUE)) {
                        arrayList3.add(next);
                    }
                }
                int size = arrayList3.size();
                int i2 = 0;
                do {
                    if (i2 >= size) {
                        obj4 = null;
                        break;
                    }
                    obj4 = arrayList3.get(i2);
                    i2++;
                } while (((d00) obj4).f16662f.f26682b != ng3.InApp);
                d00 d00Var = (d00) obj4;
                if (d00Var == null) {
                    d00Var = (d00) hb0.m6301M0(arrayList3);
                }
                if (((Boolean) g44Var.getValue()).booleanValue()) {
                    str = "debug";
                } else if (z62.m13387o((Boolean) sw2Var.getValue(), Boolean.TRUE)) {
                    str = "old_app";
                } else {
                    if (((d00Var == null || (og3Var = d00Var.f16662f) == null) ? null : og3Var.f26682b) == ng3.InApp) {
                        str = "lifetime";
                    } else if (d00Var != null) {
                        str = "sub";
                    } else if (!sl2VarM7740w.isEmpty()) {
                        ListIterator listIterator2 = sl2VarM7740w.listIterator(0);
                        while (true) {
                            ow1 ow1Var2 = (ow1) listIterator2;
                            if (ow1Var2.hasNext()) {
                                if (((Boolean) ((d00) ow1Var2.next()).f16657a.getValue()) == null) {
                                    str = null;
                                }
                            } else if (((Boolean) sw2Var7.getValue()).booleanValue()) {
                                str = "ad_trial";
                            } else {
                                str = "free";
                            }
                        }
                    } else if (((Boolean) sw2Var7.getValue()).booleanValue()) {
                        str = "ad_trial";
                    } else {
                        str = "free";
                    }
                }
                String str2 = (d00Var == null || (og3Var2 = d00Var.f16662f) == null) ? null : og3Var2.f26681a;
                boolean zM6890g2 = ir1Var.m6890g(str) | ir1Var.m6890g(interfaceC0755ia) | ir1Var.m6890g(d00Var);
                Object objM6869O17 = ir1Var.m6869O();
                Object obj7 = objM6869O17;
                if (zM6890g2 || objM6869O17 == i50Var) {
                    C1048pv c1048pv2 = new C1048pv((byte) 13);
                    c1048pv2.f28016b = str;
                    c1048pv2.f28017c = interfaceC0755ia;
                    c1048pv2.f28018d = d00Var;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c1048pv2);
                    obj7 = c1048pv2;
                }
                lb5.m7933n(str, str2, (wp1) obj7, ir1Var);
                ir1Var.m6912r(false);
            } else {
                ir1Var.m6885d0(680275185);
                ir1Var.m6912r(false);
            }
            boolean zM6890g3 = ir1Var.m6890g(g44Var);
            Object objM6869O18 = ir1Var.m6869O();
            Object obj8 = objM6869O18;
            if (zM6890g3 || objM6869O18 == i50Var) {
                na1 na1Var = new na1((byte) 22);
                na1Var.f25595b = ye3Var2;
                na1Var.f25596c = g44Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(na1Var);
                obj8 = na1Var;
            }
            cv0.m4169a((yp1) obj8, ir1Var, 0);
            sw2Var6.setValue(ye3Var2);
            ir1Var.m6912r(false);
            qe3Var = ye3Var2;
        }
        ir1Var.m6879a0(-1033831449, "interstitial");
        String str3 = "ca-app-pub-9158627376176162/1775000729";
        if ((cp1Var != 0 ? "ca-app-pub-9158627376176162/1775000729" : null) == null || !z62.m13387o(qe3Var.mo9873f(), Boolean.FALSE)) {
            c0950nl = c0950nl2;
            r10 = 0;
            ir1Var.m6885d0(-1983609060);
            ir1Var.m6912r(false);
            sp1VarM9076A = fp1Var;
        } else {
            ir1Var.m6885d0(-1983872808);
            c0950nl = c0950nl2;
            if (c0950nl.f25920a) {
                str3 = "ca-app-pub-3940256099942544/1033173712";
            } else {
                cp1Var.getClass();
            }
            String str4 = str3;
            if (((xp4) sw2Var4.getValue()) == xp4.f34520a) {
                r50 r50Var2 = i41.f21117b;
                jM3238Q = as4.m3238Q(120, m41.SECONDS);
            } else {
                r50 r50Var3 = i41.f21117b;
                jM3238Q = as4.m3238Q(30, m41.SECONDS);
            }
            xn2 xn2Var4 = (xn2) ir1Var.m6898k(yn2.f35357b);
            if (xn2Var4 == null) {
                ir1Var.m6885d0(-1476823888);
                ir1Var.m6912r(false);
                xn2Var2 = null;
            } else {
                ir1Var.m6885d0(-1476823887);
                String strConcat = "InterstitialAdState ".concat(str4);
                boolean zM6890g4 = ir1Var.m6890g(strConcat) | ir1Var.m6890g(xn2Var4);
                Object objM6869O19 = ir1Var.m6869O();
                if (zM6890g4 || objM6869O19 == i50Var) {
                    objM6869O19 = xn2Var4.m12723c(strConcat);
                    ir1Var.m6905n0(objM6869O19);
                }
                ir1Var.m6912r(false);
                xn2Var2 = (xn2) objM6869O19;
            }
            Object objM6869O20 = ir1Var.m6869O();
            if (objM6869O20 == i50Var) {
                objM6869O20 = new en0((byte) 21);
                ir1Var.m6905n0(objM6869O20);
            }
            mq1 mq1Var2 = (mq1) objM6869O20;
            Object objM6869O21 = ir1Var.m6869O();
            if (objM6869O21 == i50Var) {
                objM6869O21 = new me0((byte) 5);
                ir1Var.m6905n0(objM6869O21);
            }
            sp1VarM9076A = oh6.m9076A(str4, xn2Var2, jM3238Q, mq1Var2, (oq1) objM6869O21, ir1Var, 0);
            r10 = 0;
            ir1Var.m6912r(false);
        }
        ir1Var.m6912r(r10);
        boolean zM6890g5 = ir1Var.m6890g(sp1VarM9076A);
        Object objM6869O22 = ir1Var.m6869O();
        Object obj9 = objM6869O22;
        if (zM6890g5 || objM6869O22 == i50Var) {
            md1 md1Var = new md1(r10);
            md1Var.f24832b = sp1VarM9076A;
            md1Var.f24833c = sw2Var2;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(md1Var);
            obj9 = md1Var;
        }
        lb5.m7932m(sp1VarM9076A, (wp1) obj9, ir1Var);
        ir1Var.m6879a0(-1033812860, "reward_ad");
        if (cp1Var == 0 || !z62.m13387o(qe3Var.mo9873f(), Boolean.FALSE)) {
            z = false;
            ir1Var.m6885d0(-1983097188);
            ir1Var.m6912r(false);
            sp1VarM9076A2 = fp1Var;
        } else {
            ir1Var.m6885d0(-1983255226);
            String str5 = c0950nl.f25920a ? "ca-app-pub-3940256099942544/5224354917" : "ca-app-pub-9158627376176162/7145908487";
            xn2 xn2Var5 = (xn2) ir1Var.m6898k(yn2.f35357b);
            if (xn2Var5 == null) {
                ir1Var.m6885d0(-1476823888);
                ir1Var.m6912r(false);
                xn2Var = null;
            } else {
                ir1Var.m6885d0(-1476823887);
                String strConcat2 = "RewardedAdState ".concat(str5);
                boolean zM6890g6 = ir1Var.m6890g(strConcat2) | ir1Var.m6890g(xn2Var5);
                Object objM6869O23 = ir1Var.m6869O();
                if (zM6890g6 || objM6869O23 == i50Var) {
                    objM6869O23 = xn2Var5.m12723c(strConcat2);
                    ir1Var.m6905n0(objM6869O23);
                }
                ir1Var.m6912r(false);
                xn2Var = (xn2) objM6869O23;
            }
            Object objM6869O24 = ir1Var.m6869O();
            if (objM6869O24 == i50Var) {
                objM6869O24 = new en0((byte) 20);
                ir1Var.m6905n0(objM6869O24);
            }
            mq1 mq1Var3 = (mq1) objM6869O24;
            Object objM6869O25 = ir1Var.m6869O();
            if (objM6869O25 == i50Var) {
                objM6869O25 = new me0((byte) 4);
                ir1Var.m6905n0(objM6869O25);
            }
            sp1VarM9076A2 = oh6.m9076A(str5, xn2Var, 0L, mq1Var3, (oq1) objM6869O25, ir1Var, 4);
            z = false;
            ir1Var.m6912r(false);
        }
        ir1Var.m6912r(z);
        boolean zM6890g7 = ir1Var.m6890g(sp1VarM9076A2);
        Object objM6869O26 = ir1Var.m6869O();
        Object obj10 = objM6869O26;
        if (zM6890g7 || objM6869O26 == i50Var) {
            md1 md1Var2 = new md1((byte) 1);
            md1Var2.f24832b = sp1VarM9076A2;
            md1Var2.f24833c = sw2Var3;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(md1Var2);
            obj10 = md1Var2;
        }
        lb5.m7932m(sp1VarM9076A2, (wp1) obj10, ir1Var);
        List list3 = hd1Var.f20486d;
        ic2[] ic2VarArr = aa3.f208a;
        sw2 sw2VarM7369C4 = k43.m7369C(list3, ir1Var);
        mq1 mq1Var4 = (mq1) ir1Var.m6898k((xh3) aa3.f209b.m9574l(null, aa3.f208a[0]));
        Object objM6869O27 = ir1Var.m6869O();
        Object obj11 = objM6869O27;
        if (objM6869O27 == i50Var) {
            v93 v93Var = new v93();
            v93Var.f32478a = sw2VarM7369C4;
            v93Var.f32479b = mq1Var4;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(v93Var);
            obj11 = v93Var;
        }
        v93 v93Var2 = (v93) obj11;
        String str6 = hd1Var.f20485c;
        Object objM6869O28 = ir1Var.m6869O();
        Object obj12 = objM6869O28;
        if (objM6869O28 == i50Var) {
            C0725hh c0725hh2 = new C0725hh((byte) 8);
            c0725hh2.f20571b = sw2Var2;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(c0725hh2);
            obj12 = c0725hh2;
        }
        wp1 wp1Var5 = (wp1) obj12;
        Object objM6869O29 = ir1Var.m6869O();
        Object obj13 = objM6869O29;
        if (objM6869O29 == i50Var) {
            C0725hh c0725hh3 = new C0725hh((byte) 9);
            c0725hh3.f20571b = sw2Var3;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(c0725hh3);
            obj13 = c0725hh3;
        }
        int i3 = pe3.f27565d;
        a44 a44Var2 = (a44) ir1Var.m6898k(h44.m6217a());
        Object objM6869O30 = ir1Var.m6869O();
        if (objM6869O30 == i50Var) {
            objM6869O30 = a44Var2.mo44a(str6, a10.f32a);
            ir1Var.m6905n0(objM6869O30);
        }
        sw2 sw2Var9 = (sw2) objM6869O30;
        Object objM6869O31 = ir1Var.m6869O();
        Object obj14 = objM6869O31;
        if (objM6869O31 == i50Var) {
            od1 od1Var = new od1();
            od1Var.f26636a = hd1Var;
            od1Var.f26637b = v93Var2;
            od1Var.f26638c = wp1Var5;
            od1Var.f26639d = qe3Var;
            od1Var.f26640e = sw2Var9;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(od1Var);
            obj14 = od1Var;
        }
        od1 od1Var2 = (od1) obj14;
        zh3[] zh3VarArr = {pd1.m9499d().mo7523a(od1Var2), ze3.f36022a.mo7523a(qe3Var)};
        nd1 nd1Var = new nd1();
        nd1Var.f25703a = qe3Var;
        nd1Var.f25704b = hd1Var;
        nd1Var.f25705c = mq1Var;
        nd1Var.f25706d = od1Var2;
        nd1Var.f25707e = c1349xzM12820B0;
        nd1Var.f25708f = c0950nl;
        nd1Var.f25709g = sw2Var4;
        nd1Var.f25710h = sw2Var5;
        nd1Var.f25711i = sw2Var2;
        VarHandle.storeStoreFence();
        as4.m3245d(zh3VarArr, vd6.m11834R(-564508993, nd1Var, ir1Var), ir1Var, 48);
        return ju4Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        byte b = this.f25727a;
        byte b2 = 8;
        da2 da2Var = wf2.f33290T;
        kt2 kt2Var = kt2.f23428a;
        i50 i50Var = ki0.f23136a;
        byte b3 = 2;
        byte b4 = 1;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                si2 si2Var = (si2) this.f25728b;
                yp1 yp1Var = (yp1) this.f25729c;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    as4.m3246e(n74.f25506c, si2Var, null, null, null, yp1Var, ir1Var, 6);
                } else {
                    ir1Var.m6874W();
                }
                return ju4Var;
            case 1:
                C0903mb c0903mb = (C0903mb) this.f25728b;
                nl3 nl3Var = (nl3) this.f25729c;
                float fFloatValue = ((Float) obj).floatValue();
                c0903mb.m8259a(fFloatValue, ((Float) obj2).floatValue());
                nl3Var.f25933a = fFloatValue;
                return ju4Var;
            case 2:
                j14 j14Var = (j14) this.f25728b;
                ViewOnAttachStateChangeListenerC0758id viewOnAttachStateChangeListenerC0758id = (ViewOnAttachStateChangeListenerC0758id) this.f25729c;
                int iIntValue2 = ((Integer) obj).intValue();
                i14 i14Var = (i14) obj2;
                if (!j14Var.f21956b.m8404b(i14Var.f21014f)) {
                    viewOnAttachStateChangeListenerC0758id.m6759i(iIntValue2, i14Var);
                    viewOnAttachStateChangeListenerC0758id.f21267h.mo5493n(ju4Var);
                }
                return ju4Var;
            case 3:
                lt0 lt0Var = (lt0) this.f25728b;
                C1112rl c1112rl = (C1112rl) this.f25729c;
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (ir1Var2.m6871T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Object objM6869O = ir1Var2.m6869O();
                    if (objM6869O == i50Var) {
                        objM6869O = lb5.m7942w(r71.f29063a, ir1Var2);
                        ir1Var2.m6905n0(objM6869O);
                    }
                    C1297wl c1297wl = new C1297wl(false ? (byte) 1 : (byte) 0);
                    c1297wl.f33457b = (zo0) objM6869O;
                    c1297wl.f33458c = lt0Var;
                    c1297wl.f33459d = c1112rl;
                    VarHandle.storeStoreFence();
                    dt0.m4707i(1572864, se0.f30191d, ir1Var2, c1297wl, null, null, null, false);
                } else {
                    ir1Var2.m6874W();
                }
                return ju4Var;
            case 4:
                tp3 tp3Var = (tp3) this.f25728b;
                pg0 pg0Var = (pg0) this.f25729c;
                mi0 mi0Var3 = (mi0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ir1 ir1Var3 = (ir1) mi0Var3;
                if (ir1Var3.m6871T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    as4.m3244c(xp3.f34517b.mo7523a(tp3Var), pg0Var, ir1Var3, 8);
                } else {
                    ir1Var3.m6874W();
                }
                return ju4Var;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC0647fd.m5663a((mq1) this.f25728b, (InterfaceC0961nw) this.f25729c, (mi0) obj, vd6.m11838V(1));
                return ju4Var;
            case 6:
                String str = (String) this.f25728b;
                pg0 pg0Var2 = (pg0) this.f25729c;
                mi0 mi0Var4 = (mi0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ir1 ir1Var4 = (ir1) mi0Var4;
                if (ir1Var4.m6871T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zM6890g = ir1Var4.m6890g(str);
                    Object objM6869O2 = ir1Var4.m6869O();
                    if (zM6890g || objM6869O2 == i50Var) {
                        obj3 = objM6869O2;
                        C1051py c1051py = new C1051py(false ? (byte) 1 : (byte) 0);
                        c1051py.f28076b = str;
                        VarHandle.storeStoreFence();
                        ir1Var4.m6905n0(c1051py);
                        obj3 = c1051py;
                    }
                    nt2 nt2VarM5458a = f14.m5458a(kt2Var, false, (yp1) obj3);
                    xq2 xq2VarM9704c = q20.m9704c(ig1.f21378b, false);
                    int iHashCode = Long.hashCode(ir1Var4.f21683T);
                    ga3 ga3VarM6902m = ir1Var4.m6902m();
                    nt2 nt2VarM10006A = qq2.m10006A(ir1Var4, nt2VarM5458a);
                    bi0.f15310ap.getClass();
                    if (ir1Var4.f21685a == null) {
                        dt0.m4682E();
                        throw null;
                    }
                    ir1Var4.m6893h0();
                    if (ir1Var4.f21682S) {
                        ir1Var4.m6900l(da2Var);
                    } else {
                        ir1Var4.m6911q0();
                    }
                    C0006a5.m53I(ir1Var4, ia5.f21216g, xq2VarM9704c);
                    C0006a5.m53I(ir1Var4, ia5.f21215f, ga3VarM6902m);
                    C0006a5.m53I(ir1Var4, ia5.f21217h, Integer.valueOf(iHashCode));
                    C0006a5.m50F(ir1Var4);
                    C0006a5.m53I(ir1Var4, ia5.f21214e, nt2VarM10006A);
                    pg0Var2.invoke(ir1Var4, 0);
                    ir1Var4.m6912r(true);
                } else {
                    ir1Var4.m6874W();
                }
                return ju4Var;
            case 7:
                xq2 xq2Var = (xq2) this.f25728b;
                pg0 pg0Var3 = (pg0) this.f25729c;
                fe4 fe4Var = (fe4) obj;
                kl0 kl0Var = (kl0) obj2;
                long j = kl0Var.f23210a;
                v20 v20Var = new v20();
                v20Var.f32324a = fe4Var;
                v20Var.f32325b = j;
                VarHandle.storeStoreFence();
                ne0 ne0Var = new ne0(b2);
                ne0Var.f25728b = pg0Var3;
                ne0Var.f25729c = v20Var;
                VarHandle.storeStoreFence();
                return xq2Var.mo5763f(fe4Var, fe4Var.mo3576L(new pg0(-431986394, true, ne0Var), ju4Var), kl0Var.f23210a);
            case 8:
                pg0 pg0Var4 = (pg0) this.f25728b;
                v20 v20Var2 = (v20) this.f25729c;
                mi0 mi0Var5 = (mi0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ir1 ir1Var5 = (ir1) mi0Var5;
                if (ir1Var5.m6871T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    pg0Var4.invoke(v20Var2, ir1Var5, 0);
                } else {
                    ir1Var5.m6874W();
                }
                return ju4Var;
            case 9:
                e73 e73Var = (e73) this.f25728b;
                pg0 pg0Var5 = (pg0) this.f25729c;
                mi0 mi0Var6 = (mi0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ir1 ir1Var6 = (ir1) mi0Var6;
                if (ir1Var6.m6871T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    nt2 nt2VarM5648F = AbstractC0647fd.m5648F(n74.m8573a(kt2Var, r40.f28990b, ((Boolean) hd3.f20495a.getValue()).booleanValue() ? 36.0f : 40.0f), e73Var);
                    pr3 pr3VarM9243a = or3.m9243a(AbstractC1337xn.f34437d, ig1.f21388l, ir1Var6, 54);
                    int iHashCode2 = Long.hashCode(ir1Var6.f21683T);
                    ga3 ga3VarM6902m2 = ir1Var6.m6902m();
                    nt2 nt2VarM10006A2 = qq2.m10006A(ir1Var6, nt2VarM5648F);
                    bi0.f15310ap.getClass();
                    if (ir1Var6.f21685a == null) {
                        dt0.m4682E();
                        throw null;
                    }
                    ir1Var6.m6893h0();
                    if (ir1Var6.f21682S) {
                        ir1Var6.m6900l(da2Var);
                    } else {
                        ir1Var6.m6911q0();
                    }
                    C0006a5.m53I(ir1Var6, ia5.f21216g, pr3VarM9243a);
                    C0006a5.m53I(ir1Var6, ia5.f21215f, ga3VarM6902m2);
                    C0006a5.m53I(ir1Var6, ia5.f21217h, Integer.valueOf(iHashCode2));
                    C0006a5.m50F(ir1Var6);
                    C0006a5.m53I(ir1Var6, ia5.f21214e, nt2VarM10006A2);
                    pg0Var5.invoke(rr3.f29550a, ir1Var6, 6);
                    ir1Var6.m6912r(true);
                } else {
                    ir1Var6.m6874W();
                }
                return ju4Var;
            case 10:
                ((Integer) obj2).getClass();
                i20.m6577b((nt2) this.f25728b, (yp1) this.f25729c, (mi0) obj, vd6.m11838V(1));
                return ju4Var;
            case 11:
                String str2 = (String) this.f25728b;
                oz3 oz3Var = (oz3) this.f25729c;
                mi0 mi0Var7 = (mi0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ir1 ir1Var7 = (ir1) mi0Var7;
                if (ir1Var7.m6871T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    gl4.m6037b(str2, null, oz3Var.f27244a.f34723b, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((lq2) ir1Var7.m6898k(pq2.f27894b)).f24278b.f22579j, ir1Var7, 0, 0, 131066);
                } else {
                    ir1Var7.m6874W();
                }
                return ju4Var;
            case 12:
                pg0 pg0Var6 = zy5.f36475d;
                C0456aj c0456aj = (C0456aj) this.f25728b;
                Object obj5 = this.f25729c;
                mi0 mi0Var8 = (mi0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ir1 ir1Var8 = (ir1) mi0Var8;
                if (ir1Var8.m6871T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    pg0Var6.mo183g(c0456aj, obj5, ir1Var8, 0);
                } else {
                    ir1Var8.m6874W();
                }
                return ju4Var;
            case 13:
                List list = (List) this.f25728b;
                sw2 sw2Var = (sw2) this.f25729c;
                mi0 mi0Var9 = (mi0) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ir1 ir1Var9 = (ir1) mi0Var9;
                if (ir1Var9.m6871T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    nt2 nt2VarM5653K = AbstractC0647fd.m5653K(y62.m12946N(n74.m8585m(n74.m8574b(kt2Var, 1.0f), ig1.f21385i, 2)), 16.0f, 0.0f, 16.0f, 16.0f, 2);
                    up4 up4Var = new up4(b3);
                    up4Var.f32065b = list;
                    up4Var.f32066c = sw2Var;
                    VarHandle.storeStoreFence();
                    z62.m13379g(nt2VarM5653K, null, null, null, vd6.m11834R(797908440, up4Var, ir1Var9), ir1Var9, 6);
                } else {
                    ir1Var9.m6874W();
                }
                return ju4Var;
            case 14:
                ((Integer) obj2).getClass();
                gq6.m6077b((List) this.f25728b, this.f25729c, (mi0) obj, vd6.m11838V(3457));
                return ju4Var;
            case 15:
                nq1 nq1Var = (nq1) this.f25728b;
                C0766im c0766im = (C0766im) this.f25729c;
                mi0 mi0Var10 = (mi0) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ir1 ir1Var10 = (ir1) mi0Var10;
                if (ir1Var10.m6871T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    nq1Var.invoke(c0766im, ir1Var10, 0);
                } else {
                    ir1Var10.m6874W();
                }
                return ju4Var;
            case 16:
                a44 a44Var = (a44) this.f25728b;
                zx2 zx2Var = (zx2) this.f25729c;
                mi0 mi0Var11 = (mi0) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                ir1 ir1Var11 = (ir1) mi0Var11;
                if (ir1Var11.m6871T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    List listM12433a = wx2.m12433a(a44Var);
                    Map mapM12435c = wx2.m12435c(a44Var);
                    ie1 ie1Var = (ie1) wx2.f33822b.m11153t(a44Var, wx2.f33821a[0]);
                    he1 he1Var = ie1.Companion;
                    zy5.m13876k(listM12433a, mapM12435c, ie1Var, zx2Var, ir1Var11, 0);
                } else {
                    ir1Var11.m6874W();
                }
                return ju4Var;
            case 17:
                ei0 ei0Var = (ei0) this.f25728b;
                sw2 sw2Var2 = (sw2) this.f25729c;
                mi0 mi0Var12 = (mi0) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                ir1 ir1Var12 = (ir1) mi0Var12;
                if (ir1Var12.m6871T(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ei0Var.f18116a.setValue(((mq1) sw2Var2.getValue()).invoke(ir1Var12, 0));
                } else {
                    ir1Var12.m6874W();
                }
                return ju4Var;
            case 18:
                pg0 pg0Var7 = (pg0) this.f25728b;
                ql3 ql3Var = (ql3) this.f25729c;
                mi0 mi0Var13 = (mi0) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                ir1 ir1Var13 = (ir1) mi0Var13;
                if (ir1Var13.m6871T(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    C1017p0 c1017p0 = new C1017p0((byte) 13);
                    c1017p0.f27254b = ql3Var;
                    VarHandle.storeStoreFence();
                    pg0Var7.invoke(vd6.m11834R(1221207105, c1017p0, ir1Var13), ir1Var13, 6);
                } else {
                    ir1Var13.m6874W();
                }
                return ju4Var;
            case 19:
                ((Integer) obj2).getClass();
                as4.m3243b((cj0) this.f25728b, (pg0) this.f25729c, (mi0) obj, vd6.m11838V(49));
                return ju4Var;
            case 20:
                ((Integer) obj2).getClass();
                ((pm0) this.f25728b).m9568a((om0) this.f25729c, (mi0) obj, vd6.m11838V(1));
                return ju4Var;
            case 21:
                ((Integer) obj2).getClass();
                zc6.m13517b((String) this.f25728b, (yp1) this.f25729c, (mi0) obj, vd6.m11838V(1));
                return ju4Var;
            case 22:
                ej4 ej4Var = (ej4) this.f25728b;
                pj4 pj4Var = (pj4) this.f25729c;
                mi0 mi0Var14 = (mi0) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                ir1 ir1Var14 = (ir1) mi0Var14;
                if (ir1Var14.m6871T(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    boolean zM6890g2 = ir1Var14.m6890g(ej4Var);
                    Object objM6869O3 = ir1Var14.m6869O();
                    if (zM6890g2 || objM6869O3 == i50Var) {
                        objM6869O3 = s94.m10566b(new C0941nc(0, ej4Var, ej4.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, (byte) 4));
                        ir1Var14.m6905n0(objM6869O3);
                    }
                    dx0.m4785a(pj4Var, (dj4) ((xb4) objM6869O3).getValue(), ir1Var14, 0);
                } else {
                    ir1Var14.m6874W();
                }
                return ju4Var;
            case 23:
                ((Integer) obj2).getClass();
                dx0.m4785a((pj4) this.f25728b, (dj4) this.f25729c, (mi0) obj, vd6.m11838V(1));
                return ju4Var;
            case 24:
                ArrayList arrayList = (ArrayList) this.f25728b;
                xz4 xz4Var = (xz4) this.f25729c;
                mi0 mi0Var15 = (mi0) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                int i = EsActivity.f18447A;
                ir1 ir1Var15 = (ir1) mi0Var15;
                if (ir1Var15.m6871T(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    EsActivity.m5323k(arrayList, xz4Var, ir1Var15);
                } else {
                    ir1Var15.m6874W();
                }
                return ju4Var;
            case 25:
                mq1 mq1Var = (mq1) this.f25728b;
                C0459am c0459am = (C0459am) this.f25729c;
                mi0 mi0Var16 = (mi0) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                int i2 = EsApp.f18450c;
                ir1 ir1Var16 = (ir1) mi0Var16;
                if (ir1Var16.m6871T(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    Object objM6869O4 = ir1Var16.m6869O();
                    if (objM6869O4 == i50Var) {
                        obj4 = objM6869O4;
                        b71 b71Var = new b71(b3);
                        b71Var.f15141b = c0459am;
                        VarHandle.storeStoreFence();
                        ir1Var16.m6905n0(b71Var);
                        obj4 = b71Var;
                    }
                    obj4 = objM6869O4;
                    cv0.m4169a((yp1) obj4, ir1Var16, 6);
                    mq1Var.invoke(ir1Var16, 0);
                } else {
                    ir1Var16.m6874W();
                }
                return ju4Var;
            case 26:
                a91 a91Var = (a91) this.f25728b;
                mq1 mq1Var2 = (mq1) this.f25729c;
                mi0 mi0Var17 = (mi0) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                ir1 ir1Var17 = (ir1) mi0Var17;
                if (ir1Var17.m6871T(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    zh3 zh3VarMo7523a = ra1.f29114b.mo7523a(a91Var);
                    hh0 hh0Var = new hh0(b4);
                    hh0Var.f20573b = mq1Var2;
                    VarHandle.storeStoreFence();
                    as4.m3244c(zh3VarMo7523a, vd6.m11834R(-1661472803, hh0Var, ir1Var17), ir1Var17, 56);
                } else {
                    ir1Var17.m6874W();
                }
                return ju4Var;
            case 27:
                return m8692b(obj, obj2);
            case 28:
                ((Integer) obj2).getClass();
                pd1.m9496a((od1) this.f25728b, (C1349xz) this.f25729c, (mi0) obj, vd6.m11838V(385));
                return ju4Var;
            default:
                ((Integer) obj2).getClass();
                i20.m6585j((ie1) this.f25728b, (yp1) this.f25729c, (mi0) obj, vd6.m11838V(1));
                return ju4Var;
        }
    }
}
