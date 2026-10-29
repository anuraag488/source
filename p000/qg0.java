package p000;

import java.lang.invoke.VarHandle;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qg0 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28449a;

    public /* synthetic */ qg0(byte b) {
        this.f28449a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.f28449a;
        kt2 kt2Var = kt2.f23428a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                } else {
                    l02.m7759a((g12) o02.f26265v.getValue(), null, 0L, ir1Var, 48, 12);
                }
                break;
            case 1:
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ir1Var2.m6874W();
                } else {
                    gl4.m6037b("Privacy settings", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var2, 6, 0, 262142);
                }
                break;
            case 2:
                mi0 mi0Var3 = (mi0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ir1 ir1Var3 = (ir1) mi0Var3;
                if (!ir1Var3.m6871T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ir1Var3.m6874W();
                } else {
                    l02.m7759a((g12) AbstractC1238v.f32279a.getValue(), null, 0L, ir1Var3, 48, 12);
                }
                break;
            case 3:
                mi0 mi0Var4 = (mi0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ir1 ir1Var4 = (ir1) mi0Var4;
                if (!ir1Var4.m6871T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ir1Var4.m6874W();
                } else {
                    l02.m7759a(qs5.m10078C(), null, 0L, ir1Var4, 48, 12);
                }
                break;
            case 4:
                mi0 mi0Var5 = (mi0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ir1 ir1Var5 = (ir1) mi0Var5;
                if (!ir1Var5.m6871T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ir1Var5.m6874W();
                } else {
                    gl4.m6037b("Support", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var5, 6, 0, 262142);
                }
                break;
            case 5:
                mi0 mi0Var6 = (mi0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ir1 ir1Var6 = (ir1) mi0Var6;
                if (!ir1Var6.m6871T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ir1Var6.m6874W();
                } else {
                    gl4.m6037b("Manage subscription", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var6, 6, 0, 262142);
                }
                break;
            case 6:
                mi0 mi0Var7 = (mi0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ir1 ir1Var7 = (ir1) mi0Var7;
                if (!ir1Var7.m6871T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ir1Var7.m6874W();
                } else {
                    l02.m7759a((g12) o02.f26263t.getValue(), null, 0L, ir1Var7, 48, 12);
                }
                break;
            case 7:
                mi0 mi0Var8 = (mi0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ir1 ir1Var8 = (ir1) mi0Var8;
                if (!ir1Var8.m6871T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ir1Var8.m6874W();
                } else {
                    gl4.m6037b("Rate", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var8, 6, 0, 262142);
                }
                break;
            case 8:
                mi0 mi0Var9 = (mi0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ir1 ir1Var9 = (ir1) mi0Var9;
                if (!ir1Var9.m6871T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ir1Var9.m6874W();
                } else {
                    gl4.m6037b("Info", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var9, 6, 0, 262142);
                }
                break;
            case 9:
                mi0 mi0Var10 = (mi0) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ir1 ir1Var10 = (ir1) mi0Var10;
                if (!ir1Var10.m6871T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ir1Var10.m6874W();
                } else {
                    gl4.m6037b("If you enjoy the app, a 5-star rating helps a lot!", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var10, 6, 0, 262142);
                }
                break;
            case 10:
                mi0 mi0Var11 = (mi0) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ir1 ir1Var11 = (ir1) mi0Var11;
                if (!ir1Var11.m6871T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ir1Var11.m6874W();
                } else {
                    g12 g12VarM5449e = lb5.f23926n;
                    if (g12VarM5449e == null) {
                        f12 f12Var = new f12("Filled.Star", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i = uw4.f32218a;
                        ga4 ga4Var = new ga4(pb0.f27495b);
                        tv1 tv1Var = new tv1((byte) 1);
                        tv1Var.m11175k(12.0f, 17.27f);
                        tv1Var.m11173i(18.18f, 21.0f);
                        tv1Var.m11174j(-1.64f, -7.03f);
                        tv1Var.m11173i(22.0f, 9.24f);
                        tv1Var.m11174j(-7.19f, -0.61f);
                        tv1Var.m11173i(12.0f, 2.0f);
                        tv1Var.m11173i(9.19f, 8.63f);
                        tv1Var.m11173i(2.0f, 9.24f);
                        tv1Var.m11174j(5.46f, 4.73f);
                        tv1Var.m11173i(5.82f, 21.0f);
                        tv1Var.m11168d();
                        f12.m5445c(f12Var, tv1Var.f31466a, ga4Var, 1.0f, 1.0f, 2, 1.0f, 14336);
                        g12VarM5449e = f12Var.m5449e();
                        lb5.f23926n = g12VarM5449e;
                    }
                    l02.m7759a(g12VarM5449e, null, 0L, ir1Var11, 48, 12);
                }
                break;
            case 11:
                mi0 mi0Var12 = (mi0) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                ir1 ir1Var12 = (ir1) mi0Var12;
                if (!ir1Var12.m6871T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    ir1Var12.m6874W();
                } else {
                    gl4.m6037b("More apps", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var12, 6, 0, 262142);
                }
                break;
            case 12:
                mi0 mi0Var13 = (mi0) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                ir1 ir1Var13 = (ir1) mi0Var13;
                if (!ir1Var13.m6871T(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ir1Var13.m6874W();
                } else {
                    gl4.m6037b("Discover my other apps on Google Play", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var13, 6, 0, 262142);
                }
                break;
            case 13:
                mi0 mi0Var14 = (mi0) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                ir1 ir1Var14 = (ir1) mi0Var14;
                if (!ir1Var14.m6871T(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    ir1Var14.m6874W();
                } else {
                    WeakHashMap weakHashMap = y05.f34773x;
                    xb4 xb4VarM8766b = AbstractC0947ni.m8766b(((Boolean) k43.m7390o(ir1Var14).f34776c.f20594d.getValue()).booleanValue() ? -90.0f : 0.0f, ((lq2) ir1Var14.m6898k(pq2.f27894b)).f24280d.mo7287d(), ir1Var14);
                    g12 g12Var = (g12) AbstractC1057q3.f28188b.getValue();
                    boolean zM6890g = ir1Var14.m6890g(xb4VarM8766b);
                    Object objM6869O = ir1Var14.m6869O();
                    if (zM6890g || objM6869O == ki0.f23136a) {
                        obj3 = objM6869O;
                        C0676g5 c0676g5 = new C0676g5((byte) 4);
                        c0676g5.f19614b = xb4VarM8766b;
                        VarHandle.storeStoreFence();
                        ir1Var14.m6905n0(c0676g5);
                        obj3 = c0676g5;
                    }
                    obj3 = objM6869O;
                    l02.m7759a(g12Var, se0.m10693F(kt2Var, (yp1) obj3), 0L, ir1Var14, 48, 8);
                }
                break;
            case 14:
                mi0 mi0Var15 = (mi0) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                ir1 ir1Var15 = (ir1) mi0Var15;
                if (!ir1Var15.m6871T(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    ir1Var15.m6874W();
                } else {
                    l02.m7759a((g12) AbstractC1057q3.f28189c.getValue(), null, 0L, ir1Var15, 48, 12);
                }
                break;
            case 15:
                mi0 mi0Var16 = (mi0) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                ir1 ir1Var16 = (ir1) mi0Var16;
                if (!ir1Var16.m6871T(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    ir1Var16.m6874W();
                } else {
                    l02.m7759a((g12) o02.f26266w.getValue(), null, 0L, ir1Var16, 48, 12);
                }
                break;
            case 16:
                mi0 mi0Var17 = (mi0) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                ir1 ir1Var17 = (ir1) mi0Var17;
                if (!ir1Var17.m6871T(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    ir1Var17.m6874W();
                } else {
                    l02.m7759a((g12) o02.f26235C.getValue(), null, 0L, ir1Var17, 48, 12);
                }
                break;
            case 17:
                mi0 mi0Var18 = (mi0) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                ir1 ir1Var18 = (ir1) mi0Var18;
                if (!ir1Var18.m6871T(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    ir1Var18.m6874W();
                } else {
                    l02.m7759a((g12) AbstractC1057q3.f28190d.getValue(), null, 0L, ir1Var18, 48, 12);
                }
                break;
            case 18:
                mi0 mi0Var19 = (mi0) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                ir1 ir1Var19 = (ir1) mi0Var19;
                if (!ir1Var19.m6871T(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    ir1Var19.m6874W();
                } else {
                    l02.m7759a((g12) AbstractC1057q3.f28187a.getValue(), null, 0L, ir1Var19, 48, 12);
                }
                break;
            case 19:
                mi0 mi0Var20 = (mi0) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                ir1 ir1Var20 = (ir1) mi0Var20;
                if (!ir1Var20.m6871T(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    ir1Var20.m6874W();
                }
                break;
            case 20:
                mi0 mi0Var21 = (mi0) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                ir1 ir1Var21 = (ir1) mi0Var21;
                if (!ir1Var21.m6871T(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    ir1Var21.m6874W();
                } else {
                    l02.m7759a(vd6.m11861t(), null, 0L, ir1Var21, 48, 12);
                }
                break;
            case 21:
                mi0 mi0Var22 = (mi0) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                ir1 ir1Var22 = (ir1) mi0Var22;
                if (!ir1Var22.m6871T(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    ir1Var22.m6874W();
                } else {
                    gl4.m6037b("Force crash", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var22, 6, 0, 262142);
                }
                break;
            case 22:
                mi0 mi0Var23 = (mi0) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                ir1 ir1Var23 = (ir1) mi0Var23;
                if (!ir1Var23.m6871T(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    ir1Var23.m6874W();
                } else {
                    l02.m7759a((g12) o02.f26245b.getValue(), null, 0L, ir1Var23, 48, 12);
                }
                break;
            case 23:
                mi0 mi0Var24 = (mi0) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                ir1 ir1Var24 = (ir1) mi0Var24;
                if (!ir1Var24.m6871T(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    ir1Var24.m6874W();
                } else {
                    g12 g12VarM5449e2 = zp0.f36246i;
                    if (g12VarM5449e2 == null) {
                        f12 f12Var2 = new f12("Google", 488.0f, 512.0f, 488.0f, 512.0f, 0L, 0, false, 224);
                        ga4 ga4Var2 = new ga4(zy5.m13870e(4278190080L));
                        tv1 tv1Var2 = new tv1((byte) 1);
                        tv1Var2.m11175k(488.0f, 261.8f);
                        tv1Var2.m11169e(488.0f, 403.3f, 391.1f, 504.0f, 248.0f, 504.0f);
                        tv1Var2.m11169e(110.8f, 504.0f, 0.0f, 393.2f, 0.0f, 256.0f);
                        tv1Var2.m11176l(110.8f, 8.0f, 248.0f, 8.0f);
                        tv1Var2.m11170f(66.8f, 0.0f, 123.0f, 24.5f, 166.3f, 64.9f);
                        tv1Var2.m11174j(-67.5f, 64.9f);
                        tv1Var2.m11169e(258.5f, 52.6f, 94.3f, 116.6f, 94.3f, 256.0f);
                        tv1Var2.m11170f(0.0f, 86.5f, 69.1f, 156.6f, 153.7f, 156.6f);
                        tv1Var2.m11170f(98.2f, 0.0f, 135.0f, -70.4f, 140.8f, -106.9f);
                        tv1Var2.m11171g(248.0f);
                        tv1Var2.m11180p(-85.3f);
                        tv1Var2.m11172h(236.1f);
                        tv1Var2.m11170f(2.3f, 12.7f, 3.9f, 24.9f, 3.9f, 41.4f);
                        tv1Var2.m11168d();
                        f12.m5445c(f12Var2, tv1Var2.f31466a, ga4Var2, 1.0f, 0.0f, 0, 4.0f, 14336);
                        g12VarM5449e2 = f12Var2.m5449e();
                        zp0.f36246i = g12VarM5449e2;
                    }
                    l02.m7759a(g12VarM5449e2, n74.m8579g(kt2Var, 20.0f), 0L, ir1Var24, 432, 8);
                }
                break;
            case 24:
                mi0 mi0Var25 = (mi0) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                ir1 ir1Var25 = (ir1) mi0Var25;
                if (!ir1Var25.m6871T(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    ir1Var25.m6874W();
                } else {
                    gl4.m6037b("Export your data", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var25, 6, 0, 262142);
                }
                break;
            case 25:
                mi0 mi0Var26 = (mi0) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                ir1 ir1Var26 = (ir1) mi0Var26;
                if (!ir1Var26.m6871T(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    ir1Var26.m6874W();
                } else {
                    l02.m7759a((g12) o02.f26233A.getValue(), null, 0L, ir1Var26, 48, 12);
                }
                break;
            case 26:
                mi0 mi0Var27 = (mi0) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                ir1 ir1Var27 = (ir1) mi0Var27;
                if (!ir1Var27.m6871T(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    ir1Var27.m6874W();
                } else {
                    gl4.m6037b("Restore your data", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var27, 6, 0, 262142);
                }
                break;
            case 27:
                mi0 mi0Var28 = (mi0) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                ir1 ir1Var28 = (ir1) mi0Var28;
                if (!ir1Var28.m6871T(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    ir1Var28.m6874W();
                } else {
                    l02.m7759a((g12) o02.f26269z.getValue(), null, 0L, ir1Var28, 48, 12);
                }
                break;
            case 28:
                mi0 mi0Var29 = (mi0) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                ir1 ir1Var29 = (ir1) mi0Var29;
                if (!ir1Var29.m6871T(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    ir1Var29.m6874W();
                } else {
                    l02.m7759a((g12) o02.f26257n.getValue(), n74.m8579g(kt2Var, 24.0f), 0L, ir1Var29, 432, 8);
                }
                break;
            default:
                mi0 mi0Var30 = (mi0) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                ir1 ir1Var30 = (ir1) mi0Var30;
                if (!ir1Var30.m6871T(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    ir1Var30.m6874W();
                } else {
                    gl4.m6037b("#", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var30, 6, 0, 262142);
                }
                break;
        }
        return ju4Var;
    }
}
