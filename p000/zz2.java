package p000;

import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class zz2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ic2[] f36502a = {new hh3(zz2.class, "LocalSheets", "getLocalSheets()Landroidx/compose/runtime/ProvidableCompositionLocal;")};

    /* JADX INFO: renamed from: b */
    public static final C1040pn f36503b = hj0.m6413a();

    /* JADX INFO: renamed from: a */
    public static final void m13893a(pz2 pz2Var, nt2 nt2Var, List list, List list2, yp1 yp1Var, yp1 yp1Var2, mq1 mq1Var, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-707757313);
        byte b = 2;
        byte b2 = 4;
        int i2 = (ir1Var.m6890g(pz2Var) ? 4 : 2) | i | 599216;
        byte b3 = 0;
        if (ir1Var.m6871T(i2 & 1, (599187 & i2) != 599186)) {
            ir1Var.m6876Y();
            int i3 = i & 1;
            i50 i50Var = ki0.f23136a;
            if (i3 == 0 || ir1Var.m6856B()) {
                ju3 ju3VarM5656N = AbstractC0647fd.m5656N(ir1Var);
                Object objM6869O = ir1Var.m6869O();
                if (objM6869O == i50Var) {
                    objM6869O = new LinkedHashMap();
                    ir1Var.m6905n0(objM6869O);
                }
                Map map = (Map) objM6869O;
                boolean zM6894i = ir1Var.m6894i(map);
                Object objM6869O2 = ir1Var.m6869O();
                Object obj = objM6869O2;
                if (zM6894i || objM6869O2 == i50Var) {
                    uz2 uz2Var = new uz2((byte) 0);
                    uz2Var.f32267b = map;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(uz2Var);
                    obj = uz2Var;
                }
                lb5.m7923d(ju4.f22634a, (yp1) obj, ir1Var);
                Object objM6869O3 = ir1Var.m6869O();
                if (objM6869O3 == i50Var) {
                    uz2 uz2Var2 = new uz2((byte) 1);
                    uz2Var2.f32267b = map;
                    VarHandle.storeStoreFence();
                    C0928n c0928n = new C0928n((byte) 16);
                    c0928n.f25353b = map;
                    VarHandle.storeStoreFence();
                    objM6869O3 = new oy2(uz2Var2, new pg0(1723817001, true, c0928n));
                    ir1Var.m6905n0(objM6869O3);
                }
                list = kx5.m7694Y(ju3VarM5656N, (oy2) objM6869O3);
                Object objM6869O4 = ir1Var.m6869O();
                if (objM6869O4 == i50Var) {
                    objM6869O4 = new yz2();
                    ir1Var.m6905n0(objM6869O4);
                }
                list2 = Collections.singletonList((yz2) objM6869O4);
                nc4 nc4Var = pq2.f27894b;
                lu2 lu2Var = ((lq2) ir1Var.m6898k(nc4Var)).f24280d;
                boolean zM6890g = ir1Var.m6890g(lu2Var);
                Object objM6869O5 = ir1Var.m6869O();
                Object obj2 = objM6869O5;
                if (zM6890g || objM6869O5 == i50Var) {
                    C0713h5 c0713h5 = new C0713h5(b2);
                    c0713h5.f20393b = lu2Var;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0713h5);
                    obj2 = c0713h5;
                }
                yp1Var = (yp1) obj2;
                lu2 lu2Var2 = ((lq2) ir1Var.m6898k(nc4Var)).f24280d;
                ir1Var.m6887e0(-1131358425);
                ky0 ky0Var = (ky0) ir1Var.m6898k(ij0.f21473h);
                ir1Var.m6887e0(624596967);
                boolean zM6890g2 = ir1Var.m6890g(ky0Var) | ir1Var.m6884d(30.0f);
                Object objM6869O6 = ir1Var.m6869O();
                if (zM6890g2 || objM6869O6 == i50Var) {
                    objM6869O6 = Integer.valueOf(ky0Var.mo3579U(30.0f));
                    ir1Var.m6905n0(objM6869O6);
                }
                int iIntValue = ((Number) objM6869O6).intValue();
                ir1Var.m6912r(false);
                ir1Var.m6912r(false);
                boolean zM6890g3 = ir1Var.m6890g(lu2Var2) | ir1Var.m6886e(iIntValue);
                Object objM6869O7 = ir1Var.m6869O();
                Object obj3 = objM6869O7;
                if (zM6890g3 || objM6869O7 == i50Var) {
                    C1391z3 c1391z3 = new C1391z3(b);
                    c1391z3.f35731c = lu2Var2;
                    c1391z3.f35730b = iIntValue;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c1391z3);
                    obj3 = c1391z3;
                }
                yp1Var2 = (yp1) obj3;
                mq1Var = new en0((byte) 26);
                nt2Var = kt2.f23428a;
            } else {
                ir1Var.m6874W();
            }
            ir1Var.m6913s();
            Object objM6869O8 = ir1Var.m6869O();
            if (objM6869O8 == i50Var) {
                objM6869O8 = k43.m7397v();
                ir1Var.m6905n0(objM6869O8);
            }
            y94 y94Var = (y94) objM6869O8;
            zh3[] zh3VarArr = {rz2.m10508a().mo7523a(pz2Var), ((xh3) f36503b.m9574l(null, f36502a[0])).mo7523a(y94Var)};
            sz2 sz2Var = new sz2();
            sz2Var.f30682a = pz2Var;
            sz2Var.f30683b = nt2Var;
            sz2Var.f30684c = list;
            sz2Var.f30685d = list2;
            sz2Var.f30686e = yp1Var;
            sz2Var.f30687f = yp1Var2;
            sz2Var.f30688g = mq1Var;
            sz2Var.f30689h = y94Var;
            VarHandle.storeStoreFence();
            as4.m3245d(zh3VarArr, vd6.m11834R(1610100287, sz2Var, ir1Var), ir1Var, 48);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            tz2 tz2Var = new tz2(b3);
            tz2Var.f31560d = pz2Var;
            tz2Var.f31561e = nt2Var;
            tz2Var.f31562f = list;
            tz2Var.f31563g = list2;
            tz2Var.f31559c = yp1Var;
            tz2Var.f31564h = yp1Var2;
            tz2Var.f31558b = mq1Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = tz2Var;
        }
    }
}
