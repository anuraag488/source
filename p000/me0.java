package p000;

import ads_mobile_sdk.C0200km;
import ads_mobile_sdk.bq1;
import ads_mobile_sdk.cn0;
import ads_mobile_sdk.l93;
import ads_mobile_sdk.tq1;
import android.app.Activity;
import android.content.Context;
import android.graphics.BlendModeColorFilter;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class me0 implements oq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24837a;

    public /* synthetic */ me0(byte b) {
        this.f24837a = b;
    }

    @Override // p000.oq1
    /* JADX INFO: renamed from: g */
    public final Object mo183g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Object obj5;
        byte b = 12;
        switch (this.f24837a) {
            case 0:
                C0456aj c0456aj = (C0456aj) obj;
                mi0 mi0Var = (mi0) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    i = iIntValue | ((iIntValue & 8) == 0 ? ((ir1) mi0Var).m6890g(c0456aj) : ((ir1) mi0Var).m6894i(c0456aj) ? 4 : 2);
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= (iIntValue & 64) == 0 ? ((ir1) mi0Var).m6890g(obj2) : ((ir1) mi0Var).m6894i(obj2) ? 32 : 16;
                }
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(i & 1, (i & 147) != 146)) {
                    zh3 zh3VarMo7523a = sm2.f30395a.mo7523a(c0456aj);
                    ne0 ne0Var = new ne0(b);
                    ne0Var.f25728b = c0456aj;
                    ne0Var.f25729c = obj2;
                    VarHandle.storeStoreFence();
                    as4.m3244c(zh3VarMo7523a, vd6.m11834R(-384460011, ne0Var, ir1Var), ir1Var, 48);
                } else {
                    ir1Var.m6874W();
                }
                return ju4.f22634a;
            case 1:
                vk3 vk3Var = (vk3) obj;
                mi0 mi0Var2 = (mi0) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((ir1) mi0Var2).m6890g(vk3Var) ? 4 : 2;
                }
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 131) != 130)) {
                    long j = ((pb0) ir1Var2.m6898k(zl0.f36166a)).f27503a;
                    BlendModeColorFilter blendModeColorFilter = new BlendModeColorFilter(zy5.m13858V(j), d24.m4295J(5));
                    o00 o00Var = new o00();
                    o00Var.f26229a = blendModeColorFilter;
                    o00Var.f26230b = j;
                    o00Var.f26231c = 5;
                    VarHandle.storeStoreFence();
                    oh6.m9103i(vk3Var, null, null, null, null, 0.0f, o00Var, false, ir1Var2, iIntValue2 & 14, 191);
                } else {
                    ir1Var2.m6874W();
                }
                return ju4.f22634a;
            case 2:
                i10 i10Var = (i10) obj2;
                mi0 mi0Var3 = (mi0) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= ((ir1) mi0Var3).m6886e(i10Var.ordinal()) ? 32 : 16;
                }
                ir1 ir1Var3 = (ir1) mi0Var3;
                if (ir1Var3.m6871T(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                    i10Var.f21000b.invoke(ir1Var3, 0);
                } else {
                    ir1Var3.m6874W();
                }
                return ju4.f22634a;
            case 3:
                l73 l73Var = (l73) obj2;
                mi0 mi0Var4 = (mi0) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= ((ir1) mi0Var4).m6890g(l73Var) ? 32 : 16;
                }
                ir1 ir1Var4 = (ir1) mi0Var4;
                if (ir1Var4.m6871T(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    mq1 mq1Var = (mq1) l73Var.f23833a;
                    boolean zBooleanValue = ((Boolean) l73Var.f23834b).booleanValue();
                    zh3 zh3VarMo7523a2 = ln0.f24194e.mo7523a(zBooleanValue ? dn0.f17204b : dn0.f17203a);
                    nc4 nc4Var = ln0.f24195f;
                    boolean zM6892h = ir1Var4.m6892h(zBooleanValue);
                    Object objM6869O = ir1Var4.m6869O();
                    if (zM6892h || objM6869O == ki0.f23136a) {
                        obj5 = objM6869O;
                        gh0 gh0Var = new gh0();
                        gh0Var.f19791a = zBooleanValue;
                        VarHandle.storeStoreFence();
                        ir1Var4.m6905n0(gh0Var);
                        obj5 = gh0Var;
                    }
                    obj5 = objM6869O;
                    zh3[] zh3VarArr = {zh3VarMo7523a2, nc4Var.mo7523a((wp1) obj5)};
                    hh0 hh0Var = new hh0(false ? 1 : 0);
                    hh0Var.f20573b = mq1Var;
                    VarHandle.storeStoreFence();
                    as4.m3245d(zh3VarArr, vd6.m11834R(-1981138336, hh0Var, ir1Var4), ir1Var4, 48);
                } else {
                    ir1Var4.m6874W();
                }
                return ju4.f22634a;
            case 4:
                l93 l93Var = (l93) obj;
                Activity activity = (Activity) obj2;
                rp1 rp1Var = new rp1();
                rp1Var.f29510a = (lp1) obj3;
                VarHandle.storeStoreFence();
                C0200km c0200km = l93Var.f6765c;
                ic2 ic2Var = l93.f6763e[0];
                c0200km.setValue(l93Var, rp1Var);
                C1040pn c1040pn = new C1040pn(b);
                c1040pn.f27754b = (wp1) obj4;
                VarHandle.storeStoreFence();
                bq1 bq1Var = l93Var.f6764b;
                bq1Var.getClass();
                cn0 cn0VarM1164j = bq1Var.m1164j();
                synchronized (cn0VarM1164j) {
                    cn0VarM1164j.f2206o = c1040pn;
                }
                bq1Var.f7388m.mo839a(activity, bq1Var.f7389n, bq1Var.f7390o);
                return ju4.f22634a;
            case 5:
                tq1 tq1Var = (tq1) obj;
                qp1 qp1Var = new qp1();
                qp1Var.f28654a = (lp1) obj3;
                VarHandle.storeStoreFence();
                C0200km c0200km2 = tq1Var.f12079c;
                ic2 ic2Var2 = tq1.f12077e[0];
                c0200km2.setValue(tq1Var, qp1Var);
                ei5 ei5Var = tq1Var.f12078b;
                ei5Var.f7388m.mo839a((Activity) obj2, ei5Var.f7389n, ei5Var.f7390o);
                return ju4.f22634a;
            default:
                tb3 tb3Var = new tb3();
                tb3Var.f31053a = (ro0) obj;
                tb3Var.f31054b = (Context) obj2;
                tb3Var.f31055c = (j04) obj3;
                tb3Var.f31056d = (zm2) obj4;
                tb3Var.f31057e = hx2.m6530a();
                tb3Var.f31059g = k43.m7398w(null);
                tb3Var.f31060h = new Object();
                VarHandle.storeStoreFence();
                return tb3Var;
        }
    }
}
