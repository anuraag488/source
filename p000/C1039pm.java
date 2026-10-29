package p000;

import java.lang.invoke.VarHandle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: pm */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1039pm implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f27740a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ sw2 f27741b;

    public /* synthetic */ C1039pm(byte b) {
        this.f27740a = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        fk2 fk2Var;
        Object obj5;
        Object obj6;
        byte b = this.f27740a;
        byte b2 = 2;
        i50 i50Var = ki0.f23136a;
        ju4 ju4Var = ju4.f22634a;
        sw2 sw2Var = this.f27741b;
        switch (b) {
            case 0:
                sg2 sg2Var = (sg2) obj;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((ir1) mi0Var).m6890g(sg2Var) ? 4 : 2;
                }
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ir1Var.m6874W();
                } else {
                    nt2 nt2VarM3253l = as4.m3253l(sg2Var, ir1Var);
                    xk4 xk4Var = (xk4) sw2Var.getValue();
                    Object objM6869O = ir1Var.m6869O();
                    if (objM6869O == i50Var) {
                        obj4 = objM6869O;
                        C0761ih c0761ih = new C0761ih(b2);
                        c0761ih.f21416b = sw2Var;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(c0761ih);
                        obj4 = c0761ih;
                    }
                    obj4 = objM6869O;
                    mz3.m8464f(xk4Var, (yp1) obj4, nt2VarM3253l, null, ir1Var, 48);
                }
                break;
            case 1:
                ny2 ny2Var = (ny2) obj;
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((ir1) mi0Var2).m6890g(ny2Var) ? (byte) 4 : (byte) 2;
                }
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    ir1Var2.m6874W();
                } else {
                    List list = (List) sw2Var.getValue();
                    boolean z = (iIntValue2 & 14) == 4;
                    Object objM6869O2 = ir1Var2.m6869O();
                    Object obj7 = objM6869O2;
                    if (z || objM6869O2 == i50Var) {
                        C1127s c1127s = new C1127s((byte) 15);
                        c1127s.f29778b = ny2Var;
                        VarHandle.storeStoreFence();
                        ir1Var2.m6905n0(c1127s);
                        obj7 = c1127s;
                    }
                    yp1 yp1Var = (yp1) obj7;
                    if (list instanceof RandomAccess) {
                        int size = list.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                fk2Var = fk2.f19056c;
                            } else if (((Boolean) yp1Var.invoke(list.get(i))).booleanValue()) {
                                fk2Var = fk2.f19058e;
                            } else {
                                i++;
                            }
                        }
                    } else {
                        List list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((Boolean) yp1Var.invoke(it.next())).booleanValue()) {
                                        fk2Var = fk2.f19058e;
                                    }
                                }
                            }
                        }
                        fk2Var = fk2.f19056c;
                    }
                    zh3 zh3VarMo7523a = rm2.f29413a.mo7523a(n40.m8516z(fk2Var, ir1Var2));
                    C0553cw c0553cw = new C0553cw((byte) 0);
                    c0553cw.f16521b = ny2Var;
                    VarHandle.storeStoreFence();
                    as4.m3244c(zh3VarMo7523a, vd6.m11834R(-1713684244, c0553cw, ir1Var2), ir1Var2, 56);
                }
                break;
            case 2:
                mi0 mi0Var3 = (mi0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ir1 ir1Var3 = (ir1) mi0Var3;
                if (!ir1Var3.m6871T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ir1Var3.m6874W();
                } else {
                    ((mq1) sw2Var.getValue()).invoke(ir1Var3, 0);
                }
                break;
            case 3:
                mi0 mi0Var4 = (mi0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ir1 ir1Var4 = (ir1) mi0Var4;
                if (!ir1Var4.m6871T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ir1Var4.m6874W();
                } else {
                    xk4 xk4Var2 = (xk4) sw2Var.getValue();
                    Object objM6869O3 = ir1Var4.m6869O();
                    if (objM6869O3 == i50Var) {
                        obj5 = objM6869O3;
                        C0761ih c0761ih2 = new C0761ih((byte) 7);
                        c0761ih2.f21416b = sw2Var;
                        VarHandle.storeStoreFence();
                        ir1Var4.m6905n0(c0761ih2);
                        obj5 = c0761ih2;
                    }
                    obj5 = objM6869O3;
                    mz3.m8467i(xk4Var2, (yp1) obj5, null, null, null, null, null, zt5.f36365a, ir1Var4, 12582960, 124);
                }
                break;
            default:
                mi0 mi0Var5 = (mi0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ir1 ir1Var5 = (ir1) mi0Var5;
                if (!ir1Var5.m6871T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    ir1Var5.m6874W();
                } else {
                    yp1 yp1VarM5365o0 = ev0.m5365o0(ir1Var5);
                    mq1 mq1VarM10008C = qq2.m10008C(ir1Var5);
                    pw3 pw3VarM10148d = qw3.m10148d(ir1Var5);
                    yp1 yp1VarM5366p0 = ev0.m5366p0(ir1Var5);
                    boolean zM6890g = ir1Var5.m6890g(pw3VarM10148d) | ir1Var5.m6894i(mq1VarM10008C) | ir1Var5.m6890g(yp1VarM5366p0) | ir1Var5.m6890g(sw2Var) | ir1Var5.m6894i(yp1VarM5365o0);
                    Object objM6869O4 = ir1Var5.m6869O();
                    if (zM6890g || objM6869O4 == i50Var) {
                        obj6 = objM6869O4;
                        C0907mf c0907mf = new C0907mf(b2);
                        c0907mf.f24849b = pw3VarM10148d;
                        c0907mf.f24850c = yp1VarM5366p0;
                        c0907mf.f24851d = mq1VarM10008C;
                        c0907mf.f24852e = yp1VarM5365o0;
                        c0907mf.f24853f = sw2Var;
                        VarHandle.storeStoreFence();
                        ir1Var5.m6905n0(c0907mf);
                        obj6 = c0907mf;
                    }
                    zy5.m13865b((wp1) obj6, null, false, null, null, null, null, null, d24.f16745c, ir1Var5, 805306368, 510);
                }
                break;
        }
        return ju4Var;
    }
}
