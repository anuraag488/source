package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ke1 implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23082a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ie1 f23083b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ yp1 f23084c;

    public /* synthetic */ ke1(byte b) {
        this.f23082a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r20v1, types: [ir1, mi0] */
    /* JADX WARN: Type inference failed for: r2v39, types: [ir1] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.lang.Object, pv] */
    /* JADX WARN: Type inference failed for: r8v29 */
    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        i50 i50Var;
        ju4 ju4Var;
        byte b;
        byte b2 = this.f23082a;
        byte b3 = 2;
        byte b4 = 4;
        i50 i50Var2 = ki0.f23136a;
        ju4 ju4Var2 = ju4.f22634a;
        byte b5 = 1;
        switch (b2) {
            case 0:
                ie1 ie1Var = this.f23083b;
                yp1 yp1Var = this.f23084c;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ke1 ke1Var = new ke1(b5);
                    ke1Var.f23083b = ie1Var;
                    ke1Var.f23084c = yp1Var;
                    VarHandle.storeStoreFence();
                    C1297wl c1297wlM10510c = rz2.m10510c(vd6.m11834R(-735341886, ke1Var, ir1Var), ir1Var);
                    ke1 ke1Var2 = new ke1(b3);
                    ke1Var2.f23084c = yp1Var;
                    ke1Var2.f23083b = ie1Var;
                    VarHandle.storeStoreFence();
                    C1297wl c1297wlM10510c2 = rz2.m10510c(vd6.m11834R(-869924575, ke1Var2, ir1Var), ir1Var);
                    pg0 pg0Var = lb5.f23918f;
                    pg0 pg0Var2 = lb5.f23919g;
                    C1017p0 c1017p0 = new C1017p0((byte) 20);
                    c1017p0.f27254b = ie1Var;
                    VarHandle.storeStoreFence();
                    mz3.m8463e(null, null, false, c1297wlM10510c, c1297wlM10510c2, null, pg0Var, null, pg0Var2, vd6.m11834R(923323917, c1017p0, ir1Var), ir1Var, 907542528, 167);
                } else {
                    ir1Var.m6874W();
                }
                return ju4Var2;
            case 1:
                ie1 ie1Var2 = this.f23083b;
                yp1 yp1Var2 = this.f23084c;
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    pb0 pb0Var = ie1Var2.f21283a;
                    if (pb0Var == null) {
                        ir1Var2.m6885d0(2006054697);
                        j = ((lq2) ir1Var2.m6898k(pq2.f27894b)).f24277a.f16940a;
                        ir1Var2.m6912r(false);
                    } else {
                        ir1Var2.m6885d0(2006053271);
                        ir1Var2.m6912r(false);
                        j = pb0Var.f27503a;
                    }
                    long j2 = j;
                    boolean zM6890g = ir1Var2.m6890g(yp1Var2) | ir1Var2.m6890g(ie1Var2);
                    Object objM6869O = ir1Var2.m6869O();
                    Object obj4 = objM6869O;
                    if (zM6890g || objM6869O == i50Var2) {
                        C0686gf c0686gf = new C0686gf((byte) 7);
                        c0686gf.f19762b = yp1Var2;
                        c0686gf.f19763c = ie1Var2;
                        VarHandle.storeStoreFence();
                        ir1Var2.m6905n0(c0686gf);
                        obj4 = c0686gf;
                    }
                    bc0.m3543a(j2, null, null, (yp1) obj4, ir1Var2, 0);
                } else {
                    ir1Var2.m6874W();
                }
                return ju4Var2;
            case 2:
                yp1 yp1Var3 = this.f23084c;
                ie1 ie1Var3 = this.f23083b;
                wp1 wp1Var = (wp1) obj;
                mi0 mi0Var3 = (mi0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((ir1) mi0Var3).m6894i(wp1Var) ? (byte) 4 : (byte) 2;
                }
                ir1 ir1Var3 = (ir1) mi0Var3;
                if (ir1Var3.m6871T(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    boolean zM6890g2 = ir1Var3.m6890g(yp1Var3) | ir1Var3.m6890g(ie1Var3) | ((iIntValue3 & 14) == 4);
                    Object objM6869O2 = ir1Var3.m6869O();
                    Object obj5 = objM6869O2;
                    if (zM6890g2 || objM6869O2 == i50Var2) {
                        C1164t c1164t = new C1164t((byte) 15);
                        c1164t.f30699b = yp1Var3;
                        c1164t.f30700c = ie1Var3;
                        c1164t.f30701d = wp1Var;
                        VarHandle.storeStoreFence();
                        ir1Var3.m6905n0(c1164t);
                        obj5 = c1164t;
                    }
                    AbstractC0647fd.m5674l(null, null, false, (yp1) obj5, ir1Var3, 0, 7);
                } else {
                    ir1Var3.m6874W();
                }
                return ju4Var2;
            case 3:
                ie1 ie1Var4 = this.f23083b;
                yp1 yp1Var4 = this.f23084c;
                mi0 mi0Var4 = (mi0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ir1 ir1Var4 = (ir1) mi0Var4;
                if (ir1Var4.m6871T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    nt2 nt2VarM5653K = AbstractC0647fd.m5653K(n74.m8586n(n74.m8574b(kt2.f23428a, 1.0f)), 16.0f, 0.0f, 16.0f, 16.0f, 2);
                    C1225un c1225unM12720f = AbstractC1337xn.m12720f(8.0f, ig1.f21390n);
                    C1225un c1225unM12719e = AbstractC1337xn.m12719e(8.0f);
                    ke1 ke1Var3 = new ke1(b4);
                    ke1Var3.f23083b = ie1Var4;
                    ke1Var3.f23084c = yp1Var4;
                    VarHandle.storeStoreFence();
                    ks5.m7602c(nt2VarM5653K, c1225unM12720f, c1225unM12719e, null, 0, 0, vd6.m11834R(2071411562, ke1Var3, ir1Var4), ir1Var4, 1573302);
                } else {
                    ir1Var4.m6874W();
                }
                return ju4Var2;
            default:
                ie1 ie1Var5 = this.f23083b;
                yp1 yp1Var5 = this.f23084c;
                mi0 mi0Var5 = (mi0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ir1 ir1Var5 = (ir1) mi0Var5;
                if (!ir1Var5.m6871T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    ir1Var5.m6874W();
                    return ju4Var2;
                }
                ir1Var5.m6885d0(2056654885);
                v91 v91Var = qd1.f28396c;
                int iM5779K = fq2.m5779K(ib0.m6717y0(v91Var, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM5779K >= 16 ? iM5779K : 16);
                for (Object obj6 : v91Var) {
                    linkedHashMap.put(obj6, i20.m6566A(ie1.m6771a(ie1Var5, null, null, (qd1) obj6, 3), ir1Var5));
                }
                ir1Var5.m6912r(false);
                boolean zM6890g3 = ir1Var5.m6890g(linkedHashMap);
                Object objM6869O3 = ir1Var5.m6869O();
                if (zM6890g3 || objM6869O3 == i50Var2) {
                    sl2 sl2VarM7680G = kx5.m7680G();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (fe1 fe1Var : fe1.f18929d) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            qd1 qd1Var = (qd1) entry.getKey();
                            byte b6 = b5;
                            dc0 dc0Var = (dc0) entry.getValue();
                            i50 i50Var3 = i50Var2;
                            long j3 = ((pb0) fe1Var.f18930a.invoke(dc0Var)).f27503a;
                            long jM6741a = ic0.m6741a(dc0Var, j3);
                            ju4 ju4Var3 = ju4Var2;
                            LinkedHashMap linkedHashMap2 = linkedHashMap;
                            if (linkedHashSet.add(new l73(pb0.m9462a(j3), pb0.m9462a(jM6741a)))) {
                                le1 le1Var = new le1();
                                le1Var.f23975a = fe1Var;
                                le1Var.f23976b = qd1Var;
                                le1Var.f23977c = j3;
                                le1Var.f23978d = jM6741a;
                                VarHandle.storeStoreFence();
                                sl2VarM7680G.add(le1Var);
                            }
                            linkedHashMap = linkedHashMap2;
                            b5 = b6;
                            i50Var2 = i50Var3;
                            ju4Var2 = ju4Var3;
                        }
                    }
                    i50Var = i50Var2;
                    ju4Var = ju4Var2;
                    b = b5;
                    objM6869O3 = kx5.m7740w(sl2VarM7680G);
                    ir1Var5.m6905n0(objM6869O3);
                } else {
                    i50Var = i50Var2;
                    ju4Var = ju4Var2;
                    b = 1;
                }
                List list = (List) objM6869O3;
                boolean zM6890g4 = ir1Var5.m6890g(list);
                Object objM6869O4 = ir1Var5.m6869O();
                i50 i50Var4 = i50Var;
                Object obj7 = objM6869O4;
                if (zM6890g4 || objM6869O4 == i50Var4) {
                    List<le1> list2 = list;
                    ArrayList arrayList = new ArrayList(ib0.m6717y0(list2, 10));
                    for (le1 le1Var2 : list2) {
                        arrayList.add(new b20());
                    }
                    ir1Var5.m6905n0(arrayList);
                    obj7 = arrayList;
                }
                List list3 = (List) obj7;
                int i = 0;
                ?? r2 = ir1Var5;
                for (Object obj8 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        kx5.m7735t0();
                        throw null;
                    }
                    le1 le1Var3 = (le1) obj8;
                    r2.m6879a0(1034544743, le1Var3);
                    nt2 nt2VarM5653K2 = AbstractC0647fd.m5653K(kt2.f23428a, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    long j4 = le1Var3.f23977c;
                    long j5 = le1Var3.f23978d;
                    ?? r15 = (le1Var3.f23975a == ie1Var5.f21284b && le1Var3.f23976b == ie1Var5.f21285c) ? b : 0;
                    boolean zM6890g5 = r2.m6890g(yp1Var5) | r2.m6890g(ie1Var5) | r2.m6890g(le1Var3);
                    ?? M6869O = r2.m6869O();
                    if (zM6890g5 || M6869O == i50Var4) {
                        M6869O = new C1048pv((byte) 7);
                        M6869O.f28016b = yp1Var5;
                        M6869O.f28017c = ie1Var5;
                        M6869O.f28018d = le1Var3;
                        VarHandle.storeStoreFence();
                        r2.m6905n0(M6869O);
                    }
                    ?? r20 = r2;
                    as4.m3242a(j4, j5, r15, (wp1) M6869O, i, list3, nt2VarM5653K2, r20, 1572864, 0);
                    r20.m6912r(false);
                    r2 = r20;
                    i = i2;
                }
                return ju4Var;
        }
    }
}
