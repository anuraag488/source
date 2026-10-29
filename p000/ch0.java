package p000;

import com.google.android.play.core.hsdp.model.EngagementPanelDisplayConfig;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ch0 implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f16013a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ a44 f16014b;

    public /* synthetic */ ch0(byte b) {
        this.f16013a = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        Object obj5;
        ArrayList arrayListM6309U0;
        Object obj6;
        byte b = this.f16013a;
        byte b2 = 2;
        i50 i50Var = ki0.f23136a;
        byte b3 = 16;
        ju4 ju4Var = ju4.f22634a;
        int i = 0;
        int i2 = 0;
        switch (b) {
            case 0:
                a44 a44Var = this.f16014b;
                zx2 zx2Var = (zx2) obj;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? ((ir1) mi0Var).m6890g(zx2Var) : ((ir1) mi0Var).m6894i(zx2Var) ? (byte) 4 : (byte) 2;
                }
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ie1 ie1Var = (ie1) wx2.f33822b.m11153t(a44Var, wx2.f33821a[0]);
                    he1 he1Var = ie1.Companion;
                    dc0 dc0VarM6566A = i20.m6566A(ie1Var, ir1Var);
                    ne0 ne0Var = new ne0(b3);
                    ne0Var.f25728b = a44Var;
                    ne0Var.f25729c = zx2Var;
                    VarHandle.storeStoreFence();
                    pq2.m9600c(dc0VarM6566A, null, null, vd6.m11834R(1251666246, ne0Var, ir1Var), ir1Var, 3072, 6);
                } else {
                    ir1Var.m6874W();
                }
                return ju4Var;
            case 1:
                a44 a44Var2 = this.f16014b;
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zBooleanValue = ((Boolean) cv0.f16505c.m11153t(a44Var2, cv0.f16503a[1])).booleanValue();
                    boolean zM6890g = ir1Var2.m6890g(a44Var2);
                    Object objM6869O = ir1Var2.m6869O();
                    if (zM6890g || objM6869O == i50Var) {
                        obj4 = objM6869O;
                        zg0 zg0Var = new zg0(b2);
                        zg0Var.f36059b = a44Var2;
                        VarHandle.storeStoreFence();
                        ir1Var2.m6905n0(zg0Var);
                        obj4 = zg0Var;
                    }
                    mz3.m8466h(zBooleanValue, (yp1) obj4, null, null, false, null, null, k43.f22873r, null, ir1Var2, 12582912, 892);
                } else {
                    ir1Var2.m6874W();
                }
                return ju4Var;
            case 2:
                ih0 ih0Var = ih0.f21417c;
                a44 a44Var3 = this.f16014b;
                mi0 mi0Var3 = (mi0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ir1 ir1Var3 = (ir1) mi0Var3;
                if (ir1Var3.m6871T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ie1 ie1Var2 = (ie1) ih0Var.get(a44Var3);
                    boolean zM6894i = ir1Var3.m6894i(ih0Var) | ir1Var3.m6890g(a44Var3);
                    Object objM6869O2 = ir1Var3.m6869O();
                    if (zM6894i || objM6869O2 == i50Var) {
                        obj5 = objM6869O2;
                        zg0 zg0Var2 = new zg0((byte) 3);
                        zg0Var2.f36059b = a44Var3;
                        VarHandle.storeStoreFence();
                        ir1Var3.m6905n0(zg0Var2);
                        obj5 = zg0Var2;
                    }
                    i20.m6585j(ie1Var2, (yp1) obj5, ir1Var3, 0);
                } else {
                    ir1Var3.m6874W();
                }
                return ju4Var;
            case 3:
                a44 a44Var4 = this.f16014b;
                int iIntValue4 = ((Integer) obj).intValue();
                vx2 vx2Var = (vx2) obj2;
                sn0 sn0Var = (sn0) obj3;
                if (sn0Var == null) {
                    arrayListM6309U0 = hb0.m6309U0(wx2.m12433a(a44Var4), vx2Var);
                } else {
                    List listM12433a = wx2.m12433a(a44Var4);
                    ArrayList arrayList = new ArrayList(ib0.m6717y0(listM12433a, 10));
                    for (Object vx2Var2 : listM12433a) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            kx5.m7735t0();
                            throw null;
                        }
                        if (i2 == iIntValue4) {
                            vx2 vx2Var3 = (vx2) vx2Var2;
                            sn0 sn0Var2 = vx2Var3.f32908b;
                            vx2Var3.getClass();
                            vx2Var2 = new vx2(sn0Var, sn0Var2);
                        }
                        arrayList.add(vx2Var2);
                        i2 = i3;
                    }
                    arrayListM6309U0 = arrayList;
                }
                wx2.m12437e(a44Var4, arrayListM6309U0);
                return ju4Var;
            case 4:
                a44 a44Var5 = this.f16014b;
                int iIntValue5 = ((Integer) obj).intValue();
                sn0 sn0Var3 = (sn0) obj3;
                List listM12433a2 = wx2.m12433a(a44Var5);
                ArrayList arrayList2 = new ArrayList(ib0.m6717y0(listM12433a2, 10));
                for (Object vx2Var4 : listM12433a2) {
                    int i4 = i + 1;
                    if (i < 0) {
                        kx5.m7735t0();
                        throw null;
                    }
                    if (i == iIntValue5) {
                        vx2 vx2Var5 = (vx2) vx2Var4;
                        sn0 sn0Var4 = vx2Var5.f32907a;
                        vx2Var5.getClass();
                        vx2Var4 = new vx2(sn0Var4, sn0Var3);
                    }
                    arrayList2.add(vx2Var4);
                    i = i4;
                }
                wx2.m12437e(a44Var5, arrayList2);
                return ju4Var;
            default:
                a44 a44Var6 = this.f16014b;
                mi0 mi0Var4 = (mi0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ir1 ir1Var4 = (ir1) mi0Var4;
                if (ir1Var4.m6871T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    boolean zM12434b = wx2.m12434b(a44Var6);
                    boolean zM6890g2 = ir1Var4.m6890g(a44Var6);
                    Object objM6869O3 = ir1Var4.m6869O();
                    if (zM6890g2 || objM6869O3 == i50Var) {
                        obj6 = objM6869O3;
                        zg0 zg0Var3 = new zg0((byte) 7);
                        zg0Var3.f36059b = a44Var6;
                        VarHandle.storeStoreFence();
                        ir1Var4.m6905n0(zg0Var3);
                        obj6 = zg0Var3;
                    }
                    mz3.m8466h(zM12434b, (yp1) obj6, null, null, false, null, null, se0.f30199l, se0.f30200m, ir1Var4, 817889280, EngagementPanelDisplayConfig.MIN_WIDTH_DP);
                } else {
                    ir1Var4.m6874W();
                }
                return ju4Var;
        }
    }
}
