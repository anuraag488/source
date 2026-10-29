package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ah0 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f14505a;

    public /* synthetic */ ah0(byte b) {
        this.f14505a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f14505a;
        ju4 ju4Var = ju4.f22634a;
        boolean z = false;
        switch (b) {
            case 0:
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                } else {
                    gl4.m6037b("Color", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var, 6, 0, 262142);
                }
                break;
            case 1:
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ir1Var2.m6874W();
                } else {
                    l02.m7759a((g12) o02.f26251h.getValue(), null, 0L, ir1Var2, 48, 12);
                }
                break;
            case 2:
                mi0 mi0Var3 = (mi0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ir1 ir1Var3 = (ir1) mi0Var3;
                if (!ir1Var3.m6871T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ir1Var3.m6874W();
                } else {
                    gl4.m6037b("Style", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var3, 6, 0, 262142);
                }
                break;
            case 3:
                mi0 mi0Var4 = (mi0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ir1 ir1Var4 = (ir1) mi0Var4;
                if (!ir1Var4.m6871T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ir1Var4.m6874W();
                } else {
                    gl4.m6037b("What premium gets you:", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var4, 6, 0, 262142);
                }
                break;
            case 4:
                mi0 mi0Var5 = (mi0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ir1 ir1Var5 = (ir1) mi0Var5;
                if (!ir1Var5.m6871T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ir1Var5.m6874W();
                } else {
                    gl4.m6037b("Tap to select a plan:", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var5, 6, 0, 262142);
                }
                break;
            case 5:
                mi0 mi0Var6 = (mi0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ir1 ir1Var6 = (ir1) mi0Var6;
                if (!ir1Var6.m6871T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ir1Var6.m6874W();
                } else {
                    gl4.m6037b("Free trial", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var6, 6, 0, 262142);
                }
                break;
            case 6:
                mi0 mi0Var7 = (mi0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ir1 ir1Var7 = (ir1) mi0Var7;
                if (!ir1Var7.m6871T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ir1Var7.m6874W();
                } else {
                    gl4.m6037b("Free", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((lq2) ir1Var7.m6898k(pq2.f27894b)).f24278b.f22573d, ir1Var7, 6, 0, 131070);
                }
                break;
            case 7:
                mi0 mi0Var8 = (mi0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ir1 ir1Var8 = (ir1) mi0Var8;
                if (!ir1Var8.m6871T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ir1Var8.m6874W();
                } else {
                    gl4.m6037b("Help", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var8, 6, 0, 262142);
                }
                break;
            case 8:
                mi0 mi0Var9 = (mi0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ir1 ir1Var9 = (ir1) mi0Var9;
                if (!ir1Var9.m6871T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ir1Var9.m6874W();
                } else {
                    gl4.m6037b("Why not offer a one-time purchase?", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var9, 6, 0, 262142);
                }
                break;
            case 9:
                mi0 mi0Var10 = (mi0) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ir1 ir1Var10 = (ir1) mi0Var10;
                if (!ir1Var10.m6871T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ir1Var10.m6874W();
                } else {
                    gl4.m6037b("Filter", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var10, 6, 0, 262142);
                }
                break;
            case 10:
                mi0 mi0Var11 = (mi0) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ir1 ir1Var11 = (ir1) mi0Var11;
                if (!ir1Var11.m6871T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ir1Var11.m6874W();
                } else {
                    je0.m7085a(oh6.m9115u(), null, null, ir1Var11, 0, 6);
                }
                break;
            case 11:
                mi0 mi0Var12 = (mi0) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                ir1 ir1Var12 = (ir1) mi0Var12;
                if (!ir1Var12.m6871T(1 & iIntValue12, (iIntValue12 & 3) != 2)) {
                    ir1Var12.m6874W();
                } else {
                    y42.m12834J(0, ir1Var12);
                }
                break;
            case 12:
                mi0 mi0Var13 = (mi0) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                ir1 ir1Var13 = (ir1) mi0Var13;
                if (!ir1Var13.m6871T(1 & iIntValue13, (iIntValue13 & 3) != 2)) {
                    ir1Var13.m6874W();
                } else {
                    y42.m12822D(0, ir1Var13);
                }
                break;
            case 13:
                mi0 mi0Var14 = (mi0) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                ir1 ir1Var14 = (ir1) mi0Var14;
                if (!ir1Var14.m6871T(1 & iIntValue14, (iIntValue14 & 3) != 2)) {
                    ir1Var14.m6874W();
                } else {
                    y42.m12828G(0, ir1Var14);
                }
                break;
            case 14:
                mi0 mi0Var15 = (mi0) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                ir1 ir1Var15 = (ir1) mi0Var15;
                if (!ir1Var15.m6871T(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    ir1Var15.m6874W();
                } else {
                    gq6.m6077b(i10.f20998d, null, ir1Var15, 3456);
                }
                break;
            case 15:
                mi0 mi0Var16 = (mi0) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                ir1 ir1Var16 = (ir1) mi0Var16;
                if (!ir1Var16.m6871T(1 & iIntValue16, (iIntValue16 & 3) != 2)) {
                    ir1Var16.m6874W();
                } else {
                    a44 a44Var = (a44) ir1Var16.m6898k(h44.m6217a());
                    ch0 ch0Var = new ch0(z ? (byte) 1 : (byte) 0);
                    ch0Var.f16014b = a44Var;
                    VarHandle.storeStoreFence();
                    zt5.m13771b(-2, vd6.m11834R(1080592498, ch0Var, ir1Var16), ir1Var16, 54, 0);
                }
                break;
            case 16:
                mi0 mi0Var17 = (mi0) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                ir1 ir1Var17 = (ir1) mi0Var17;
                if (!ir1Var17.m6871T(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    ir1Var17.m6874W();
                } else {
                    gl4.m6037b("Immersive mode", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var17, 6, 0, 262142);
                }
                break;
            case 17:
                mi0 mi0Var18 = (mi0) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                ir1 ir1Var18 = (ir1) mi0Var18;
                if (!ir1Var18.m6871T(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    ir1Var18.m6874W();
                } else {
                    gl4.m6037b("Force tablet mode", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var18, 6, 0, 262142);
                }
                break;
            case 18:
                mi0 mi0Var19 = (mi0) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                ir1 ir1Var19 = (ir1) mi0Var19;
                if (!ir1Var19.m6871T(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    ir1Var19.m6874W();
                } else {
                    gl4.m6037b("Force premium", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var19, 6, 0, 262142);
                }
                break;
            case 19:
                mi0 mi0Var20 = (mi0) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                ir1 ir1Var20 = (ir1) mi0Var20;
                if (!ir1Var20.m6871T(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    ir1Var20.m6874W();
                } else {
                    gl4.m6037b("Consume purchase", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var20, 6, 0, 262142);
                }
                break;
            case 20:
                mi0 mi0Var21 = (mi0) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                ir1 ir1Var21 = (ir1) mi0Var21;
                if (!ir1Var21.m6871T(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    ir1Var21.m6874W();
                }
                break;
            case 21:
                mi0 mi0Var22 = (mi0) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                ir1 ir1Var22 = (ir1) mi0Var22;
                if (!ir1Var22.m6871T(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    ir1Var22.m6874W();
                }
                break;
            case 22:
                mi0 mi0Var23 = (mi0) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                ir1 ir1Var23 = (ir1) mi0Var23;
                if (!ir1Var23.m6871T(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    ir1Var23.m6874W();
                }
                break;
            case 23:
                mi0 mi0Var24 = (mi0) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                ir1 ir1Var24 = (ir1) mi0Var24;
                if (!ir1Var24.m6871T(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    ir1Var24.m6874W();
                }
                break;
            case 24:
                mi0 mi0Var25 = (mi0) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                ir1 ir1Var25 = (ir1) mi0Var25;
                if (!ir1Var25.m6871T(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    ir1Var25.m6874W();
                } else {
                    gl4.m6037b("Look and feel", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var25, 6, 0, 262142);
                }
                break;
            case 25:
                mi0 mi0Var26 = (mi0) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                ir1 ir1Var26 = (ir1) mi0Var26;
                if (!ir1Var26.m6871T(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    ir1Var26.m6874W();
                } else {
                    gl4.m6037b("Center buttons in tablet mode", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var26, 6, 0, 262142);
                }
                break;
            case 26:
                mi0 mi0Var27 = (mi0) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                ir1 ir1Var27 = (ir1) mi0Var27;
                if (!ir1Var27.m6871T(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    ir1Var27.m6874W();
                } else {
                    l02.m7759a((g12) o02.f26243K.getValue(), C0006a5.m52H(kt2.f23428a), 0L, ir1Var27, 432, 8);
                }
                break;
            case 27:
                mi0 mi0Var28 = (mi0) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                ir1 ir1Var28 = (ir1) mi0Var28;
                if (!ir1Var28.m6871T(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    ir1Var28.m6874W();
                } else {
                    l02.m7759a(k43.m7394s(), null, 0L, ir1Var28, 48, 12);
                }
                break;
            case 28:
                mi0 mi0Var29 = (mi0) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                ir1 ir1Var29 = (ir1) mi0Var29;
                if (!ir1Var29.m6871T(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    ir1Var29.m6874W();
                } else {
                    g12 g12VarM5449e = n40.f25438i;
                    if (g12VarM5449e == null) {
                        f12 f12Var = new f12("Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i = uw4.f32218a;
                        ga4 ga4Var = new ga4(pb0.f27495b);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new w83(8.59f, 16.59f));
                        arrayList.add(new v83(13.17f, 12.0f));
                        arrayList.add(new v83(8.59f, 7.41f));
                        arrayList.add(new v83(10.0f, 6.0f));
                        arrayList.add(new d93(6.0f, 6.0f));
                        arrayList.add(new d93(-6.0f, 6.0f));
                        arrayList.add(new d93(-1.41f, -1.41f));
                        arrayList.add(s83.f29968c);
                        f12.m5445c(f12Var, arrayList, ga4Var, 1.0f, 1.0f, 2, 1.0f, 14336);
                        g12VarM5449e = f12Var.m5449e();
                        n40.f25438i = g12VarM5449e;
                    }
                    l02.m7759a(g12VarM5449e, null, 0L, ir1Var29, 48, 12);
                }
                break;
            default:
                mi0 mi0Var30 = (mi0) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                ir1 ir1Var30 = (ir1) mi0Var30;
                if (!ir1Var30.m6871T(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    ir1Var30.m6874W();
                } else {
                    l02.m7759a((g12) o02.f26258o.getValue(), null, 0L, ir1Var30, 48, 12);
                }
                break;
        }
        return ju4Var;
    }
}
