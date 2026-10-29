package p000;

import android.content.Context;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.View;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import com.materialkolor.ktx.ColorKt;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fh0 implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18981a;

    public /* synthetic */ fh0(byte b) {
        this.f18981a = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List listM7694Y;
        float f;
        Object obj4;
        byte b = this.f18981a;
        w71 w71Var = w71.f33134a;
        kt2 kt2Var = kt2.f23428a;
        r71 r71Var = r71.f29063a;
        C0516c6 c0516c6M13029i = null;
        i50 i50Var = ki0.f23136a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                zx2 zx2Var = (zx2) obj;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((ir1) mi0Var).m6890g(zx2Var) ? 4 : 2;
                }
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    View view = (View) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14655f);
                    yx2 yx2Var = zx2Var.f36443a;
                    boolean z = false;
                    float f2 = zx2Var.f36444b;
                    boolean zM6890g = ir1Var.m6890g(view) | ir1Var.m6886e(yx2Var.ordinal());
                    Object objM6869O = ir1Var.m6869O();
                    if (zM6890g || objM6869O == i50Var) {
                        obj4 = objM6869O;
                        Display display = view.getDisplay();
                        if (display == null) {
                            f = 0.0f;
                        } else {
                            int iOrdinal = yx2Var.ordinal();
                            if (iOrdinal == 0) {
                                listM7694Y = kx5.m7694Y(0, 3);
                            } else {
                                if (iOrdinal != 1) {
                                    if (iOrdinal == 2) {
                                        listM7694Y = kx5.m7694Y(3, 2);
                                    } else {
                                        C0670g.m5864c();
                                    }
                                    return null;
                                }
                                listM7694Y = kx5.m7694Y(1, 2);
                            }
                            Iterator it = listM7694Y.iterator();
                            if (!it.hasNext()) {
                                xy4.m12795x();
                                return null;
                            }
                            RoundedCorner roundedCorner = display.getRoundedCorner(((Number) it.next()).intValue());
                            float radius = roundedCorner != null ? roundedCorner.getRadius() : 0.0f;
                            while (it.hasNext()) {
                                RoundedCorner roundedCorner2 = display.getRoundedCorner(((Number) it.next()).intValue());
                                radius = Math.max(radius, roundedCorner2 != null ? roundedCorner2.getRadius() : 0.0f);
                            }
                            f = radius;
                        }
                        Float fValueOf = Float.valueOf(f);
                        ir1Var.m6905n0(fValueOf);
                        obj4 = fValueOf;
                    }
                    float fFloatValue = ((Number) obj4).floatValue();
                    float fMo3572A0 = ((ky0) ir1Var.m6898k(ij0.f21473h)).mo3572A0(fFloatValue);
                    nt2 nt2VarM8575c = yx2Var == yx2.f35586c ? n74.m8575c(n74.m8574b(kt2Var, 1.0f), f2 + fMo3572A0) : n74.m8583k(kt2Var, f2 + fMo3572A0).mo7630d(n74.f25505b);
                    if ((iIntValue & 14) == 4) {
                        z = true;
                    }
                    boolean zM6884d = z | ir1Var.m6884d(fFloatValue);
                    Object objM6869O2 = ir1Var.m6869O();
                    Object obj5 = objM6869O2;
                    if (zM6884d || objM6869O2 == i50Var) {
                        m10 m10Var = new m10(true ? (byte) 1 : (byte) 0);
                        m10Var.f24531c = zx2Var;
                        m10Var.f24530b = fFloatValue;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(m10Var);
                        obj5 = m10Var;
                    }
                    i25.m6610b(ir1Var, C0638f5.m5543n(nt2VarM8575c, (yp1) obj5));
                } else {
                    ir1Var.m6874W();
                }
                return ju4Var;
            case 1:
                zq2 zq2Var = (zq2) obj;
                int iMo3579U = zq2Var.mo3579U(10.0f);
                int i = iMo3579U * 2;
                db3 db3VarMo5826e = ((sq2) obj2).mo5826e(ll0.m8017i(i, ((kl0) obj3).f23210a, 0));
                int i2 = db3VarMo5826e.f16900b;
                int i3 = db3VarMo5826e.f16899a - i;
                C0822k4 c0822k4 = new C0822k4((byte) 0);
                c0822k4.f22854b = db3VarMo5826e;
                c0822k4.f22855c = iMo3579U;
                VarHandle.storeStoreFence();
                return zq2Var.mo3583l0(i3, i2, w71Var, c0822k4);
            case 2:
                zq2 zq2Var2 = (zq2) obj;
                int iMo3579U2 = zq2Var2.mo3579U(10.0f);
                int i4 = iMo3579U2 * 2;
                db3 db3VarMo5826e2 = ((sq2) obj2).mo5826e(ll0.m8017i(0, ((kl0) obj3).f23210a, i4));
                int i5 = db3VarMo5826e2.f16900b - i4;
                int i6 = db3VarMo5826e2.f16899a;
                C0822k4 c0822k5 = new C0822k4((byte) 1);
                c0822k5.f22854b = db3VarMo5826e2;
                c0822k5.f22855c = iMo3579U2;
                VarHandle.storeStoreFence();
                return zq2Var2.mo3583l0(i6, i5, w71Var, c0822k5);
            case 3:
                v20 v20Var = (v20) obj;
                ((Integer) obj3).getClass();
                ir1 ir1Var2 = (ir1) ((mi0) obj2);
                ir1Var2.m6885d0(-458206569);
                Context context = (Context) ir1Var2.m6898k(AndroidCompositionLocals_androidKt.f14651b);
                fe4 fe4Var = v20Var.f32324a;
                long j = v20Var.f32325b;
                int iM10010E = qq2.m10010E(kl0.m7535e(j) ? fe4Var.mo3586w0(kl0.m7539i(j)) : Float.POSITIVE_INFINITY);
                String str = hb0.m6306R0(hd4.m6353s0(((C0950nl) ir1Var2.m6898k(AbstractC0987ol.m9168a())).f25922c, new String[]{"."}, 6)) + "_banner_size";
                Object objM6869O3 = ir1Var2.m6869O();
                if (objM6869O3 == i50Var) {
                    objM6869O3 = new C0515c5((byte) 1);
                    ir1Var2.m6905n0(objM6869O3);
                }
                wp1 wp1Var = (wp1) objM6869O3;
                Object objM6869O4 = ir1Var2.m6869O();
                if (objM6869O4 == i50Var) {
                    objM6869O4 = C0971o5.f26339b;
                    ir1Var2.m6905n0(objM6869O4);
                }
                EnumC1059q5 enumC1059q5 = (EnumC1059q5) ev0.m5367q0(str, false, (wp1) objM6869O4, wp1Var, ir1Var2, 3456);
                boolean zM6886e = ir1Var2.m6886e(enumC1059q5 == null ? -1 : enumC1059q5.ordinal()) | ir1Var2.m6886e(iM10010E);
                Object objM6869O5 = ir1Var2.m6869O();
                if (zM6886e || objM6869O5 == i50Var) {
                    int i7 = enumC1059q5 == null ? -1 : AbstractC1022p5.f27378a[enumC1059q5.ordinal()];
                    if (i7 != -1) {
                        if (i7 == 1) {
                            C0516c6 c0516c6 = C0516c6.f15819g;
                            c0516c6M13029i = y70.m13029i(context, iM10010E, 0);
                        } else if (i7 == 2) {
                            c0516c6M13029i = C0516c6.f15819g;
                        } else {
                            if (i7 != 3) {
                                C0670g.m5864c();
                                return null;
                            }
                            c0516c6M13029i = C0516c6.f15820h;
                        }
                    }
                    ir1Var2.m6905n0(c0516c6M13029i);
                    objM6869O5 = c0516c6M13029i;
                }
                C0516c6 c0516c7 = (C0516c6) objM6869O5;
                ir1Var2.m6912r(false);
                return c0516c7;
            case 4:
                ((Integer) obj3).intValue();
                ir1 ir1Var3 = (ir1) ((mi0) obj2);
                ir1Var3.m6885d0(-1885765762);
                db4 defaultColorSpring = ColorKt.getDefaultColorSpring();
                ir1Var3.m6912r(false);
                return defaultColorSpring;
            case 5:
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ir1 ir1Var4 = (ir1) mi0Var2;
                if (ir1Var4.m6871T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Object objM6869O6 = ir1Var4.m6869O();
                    if (objM6869O6 == i50Var) {
                        objM6869O6 = new C0515c5((byte) 24);
                        ir1Var4.m6905n0(objM6869O6);
                    }
                    mz3.m8463e(null, null, false, qq2.m10038v(ir1Var4, (wp1) objM6869O6), null, null, oh6.f26739m, oh6.f26740n, oh6.f26741o, null, ir1Var4, 114819072, 567);
                } else {
                    ir1Var4.m6874W();
                }
                return ju4Var;
            case 6:
                mi0 mi0Var3 = (mi0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ir1 ir1Var5 = (ir1) mi0Var3;
                if (ir1Var5.m6871T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    mz3.m8462d(null, false, oh6.f26745s, ir1Var5, 384, 3);
                } else {
                    ir1Var5.m6874W();
                }
                return ju4Var;
            case 7:
                mi0 mi0Var4 = (mi0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ir1 ir1Var6 = (ir1) mi0Var4;
                if (ir1Var6.m6871T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    mz3.m8462d(null, false, oh6.f26727a, ir1Var6, 384, 3);
                } else {
                    ir1Var6.m6874W();
                }
                return ju4Var;
            case 8:
                mi0 mi0Var5 = (mi0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ir1 ir1Var7 = (ir1) mi0Var5;
                if (ir1Var7.m6871T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    Object objM6869O7 = ir1Var7.m6869O();
                    if (objM6869O7 == i50Var) {
                        objM6869O7 = new C0515c5((byte) 26);
                        ir1Var7.m6905n0(objM6869O7);
                    }
                    mz3.m8463e(null, null, false, qq2.m10038v(ir1Var7, (wp1) objM6869O7), null, null, oh6.f26747u, oh6.f26748v, oh6.f26749w, null, ir1Var7, 114819072, 567);
                } else {
                    ir1Var7.m6874W();
                }
                return ju4Var;
            case 9:
                mi0 mi0Var6 = (mi0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ir1 ir1Var8 = (ir1) mi0Var6;
                if (ir1Var8.m6871T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    Object objM6869O8 = ir1Var8.m6869O();
                    if (objM6869O8 == i50Var) {
                        objM6869O8 = new C0515c5((byte) 28);
                        ir1Var8.m6905n0(objM6869O8);
                    }
                    mz3.m8463e(null, null, false, qq2.m10038v(ir1Var8, (wp1) objM6869O8), null, null, oh6.f26751y, oh6.f26752z, oh6.f26707A, null, ir1Var8, 114819072, 567);
                } else {
                    ir1Var8.m6874W();
                }
                return ju4Var;
            case 10:
                mi0 mi0Var7 = (mi0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ir1 ir1Var9 = (ir1) mi0Var7;
                if (ir1Var9.m6871T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    mz3.m8462d(null, false, oh6.f26709C, ir1Var9, 384, 3);
                } else {
                    ir1Var9.m6874W();
                }
                return ju4Var;
            case 11:
                mi0 mi0Var8 = (mi0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ir1 ir1Var10 = (ir1) mi0Var8;
                if (ir1Var10.m6871T(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    Object objM6869O9 = ir1Var10.m6869O();
                    if (objM6869O9 == i50Var) {
                        objM6869O9 = new C0515c5((byte) 27);
                        ir1Var10.m6905n0(objM6869O9);
                    }
                    mz3.m8463e(null, null, false, qq2.m10038v(ir1Var10, (wp1) objM6869O9), null, null, oh6.f26711E, null, oh6.f26712F, null, ir1Var10, 102236160, 695);
                } else {
                    ir1Var10.m6874W();
                }
                return ju4Var;
            case 12:
                mi0 mi0Var9 = (mi0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ir1 ir1Var11 = (ir1) mi0Var9;
                if (ir1Var11.m6871T(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    mz3.m8462d(null, false, oh6.f26731e, ir1Var11, 384, 3);
                } else {
                    ir1Var11.m6874W();
                }
                return ju4Var;
            case 13:
                mi0 mi0Var10 = (mi0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ir1 ir1Var12 = (ir1) mi0Var10;
                if (ir1Var12.m6871T(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    Object objM6869O10 = ir1Var12.m6869O();
                    if (objM6869O10 == i50Var) {
                        objM6869O10 = new C0515c5((byte) 25);
                        ir1Var12.m6905n0(objM6869O10);
                    }
                    mz3.m8463e(null, null, false, qq2.m10038v(ir1Var12, (wp1) objM6869O10), null, null, oh6.f26733g, null, oh6.f26734h, null, ir1Var12, 102236160, 695);
                } else {
                    ir1Var12.m6874W();
                }
                return ju4Var;
            case 14:
                mi0 mi0Var11 = (mi0) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ir1 ir1Var13 = (ir1) mi0Var11;
                if (ir1Var13.m6871T(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    Object objM6869O11 = ir1Var13.m6869O();
                    if (objM6869O11 == i50Var) {
                        objM6869O11 = lb5.m7942w(r71Var, ir1Var13);
                        ir1Var13.m6905n0(objM6869O11);
                    }
                    C0898m6 c0898m6 = new C0898m6((byte) 2);
                    c0898m6.f24677b = (zo0) objM6869O11;
                    VarHandle.storeStoreFence();
                    mz3.m8463e(null, null, false, c0898m6, null, null, se0.f30192e, null, null, null, ir1Var13, 1572864, 951);
                } else {
                    ir1Var13.m6874W();
                }
                return ju4Var;
            case 15:
                yp1 yp1Var = (yp1) obj;
                mi0 mi0Var12 = (mi0) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= ((ir1) mi0Var12).m6894i(yp1Var) ? 4 : 2;
                }
                ir1 ir1Var14 = (ir1) mi0Var12;
                if (ir1Var14.m6871T(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    y62.m12963d(null, null, yp1Var, ir1Var14, (iIntValue12 << 6) & 896);
                } else {
                    ir1Var14.m6874W();
                }
                return ju4Var;
            case 16:
                sg2 sg2Var = (sg2) obj;
                mi0 mi0Var13 = (mi0) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= ((ir1) mi0Var13).m6890g(sg2Var) ? 4 : 2;
                }
                ir1 ir1Var15 = (ir1) mi0Var13;
                if (ir1Var15.m6871T(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    nt2 nt2VarM3253l = as4.m3253l(sg2Var, ir1Var15);
                    a83 a83Var = sg2Var.f30240a;
                    a83 a83Var2 = sg2Var.f30241b;
                    j83 j83Var = new j83();
                    j83Var.f22088a = 1.0f;
                    j83Var.f22089b = a83Var;
                    j83Var.f22090c = a83Var2;
                    VarHandle.storeStoreFence();
                    dz4.m4819a(n74.m8585m(nt2VarM3253l.mo7630d(j83Var), null, 3), 0L, 0L, null, null, 0.0f, 0.0f, 0.0f, 0.0f, ir1Var15, 0);
                } else {
                    ir1Var15.m6874W();
                }
                return ju4Var;
            case 17:
                mq1 mq1Var = (mq1) obj;
                mi0 mi0Var14 = (mi0) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= ((ir1) mi0Var14).m6894i(mq1Var) ? 4 : 2;
                }
                ir1 ir1Var16 = (ir1) mi0Var14;
                if (ir1Var16.m6871T(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    mq1Var.invoke(ir1Var16, Integer.valueOf(iIntValue14 & 14));
                } else {
                    ir1Var16.m6874W();
                }
                return ju4Var;
            case 18:
                mi0 mi0Var15 = (mi0) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ir1 ir1Var17 = (ir1) mi0Var15;
                if (ir1Var17.m6871T(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    gl4.m6037b("Close", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var17, 6, 0, 262142);
                } else {
                    ir1Var17.m6874W();
                }
                return ju4Var;
            case 19:
                mi0 mi0Var16 = (mi0) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ir1 ir1Var18 = (ir1) mi0Var16;
                if (ir1Var18.m6871T(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    mz3.m8463e(null, null, false, rz2.m10510c(y62.f34939q, ir1Var18), null, null, y62.f34940r, null, y62.f34941s, null, ir1Var18, 102236160, 695);
                } else {
                    ir1Var18.m6874W();
                }
                return ju4Var;
            case 20:
                mi0 mi0Var17 = (mi0) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ir1 ir1Var19 = (ir1) mi0Var17;
                if (ir1Var19.m6871T(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    cv0.m4170b(0, ir1Var19);
                } else {
                    ir1Var19.m6874W();
                }
                return ju4Var;
            case 21:
                sg2 sg2Var2 = (sg2) obj;
                mi0 mi0Var18 = (mi0) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= ((ir1) mi0Var18).m6890g(sg2Var2) ? 4 : 2;
                }
                ir1 ir1Var20 = (ir1) mi0Var18;
                if (ir1Var20.m6871T(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    List listM6316b1 = hb0.m6316b1(((od1) ir1Var20.m6898k(pd1.m9499d())).f26636a.f20487e.f16331b, 3);
                    ArrayList arrayList = new ArrayList(ib0.m6717y0(listM6316b1, 10));
                    Iterator it2 = listM6316b1.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((pe3) it2.next()).f27566a);
                    }
                    qe3 qe3Var = (qe3) ir1Var20.m6898k(ze3.f36022a);
                    nt2 nt2VarM3253l2 = as4.m3253l(sg2Var2, ir1Var20);
                    Object objM6869O12 = ir1Var20.m6869O();
                    if (objM6869O12 == i50Var) {
                        objM6869O12 = lb5.m7942w(r71Var, ir1Var20);
                        ir1Var20.m6905n0(objM6869O12);
                    }
                    vg0 vg0Var = new vg0(false ? (byte) 1 : (byte) 0);
                    vg0Var.f32591b = (zo0) objM6869O12;
                    vg0Var.f32592c = qe3Var;
                    VarHandle.storeStoreFence();
                    pg0 pg0Var = y62.f34925c;
                    C1017p0 c1017p0 = new C1017p0((byte) 8);
                    c1017p0.f27254b = arrayList;
                    VarHandle.storeStoreFence();
                    mz3.m8463e(nt2VarM3253l2, null, false, vg0Var, null, null, pg0Var, vd6.m11834R(-1236743970, c1017p0, ir1Var20), y62.f34926d, null, ir1Var20, 114819072, 566);
                } else {
                    ir1Var20.m6874W();
                }
                return ju4Var;
            case 22:
                mi0 mi0Var19 = (mi0) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ir1 ir1Var21 = (ir1) mi0Var19;
                if (ir1Var21.m6871T(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    mz3.m8462d(null, false, y62.f34932j, ir1Var21, 384, 3);
                } else {
                    ir1Var21.m6874W();
                }
                return ju4Var;
            case 23:
                sg2 sg2Var3 = (sg2) obj;
                mi0 mi0Var20 = (mi0) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= ((ir1) mi0Var20).m6890g(sg2Var3) ? 4 : 2;
                }
                ir1 ir1Var22 = (ir1) mi0Var20;
                if (ir1Var22.m6871T(iIntValue20 & 1, (iIntValue20 & 19) != 18)) {
                    qe3 qe3Var2 = (qe3) ir1Var22.m6898k(ze3.f36022a);
                    nt2 nt2VarM3253l3 = as4.m3253l(sg2Var3, ir1Var22);
                    oz3 oz3VarM10799H = sj3.m10799H(qn4.f28627d, null, null, ir1Var22, 12582918, 126);
                    Object objM6869O13 = ir1Var22.m6869O();
                    if (objM6869O13 == i50Var) {
                        objM6869O13 = lb5.m7942w(r71Var, ir1Var22);
                        ir1Var22.m6905n0(objM6869O13);
                    }
                    vg0 vg0Var2 = new vg0(true ? (byte) 1 : (byte) 0);
                    vg0Var2.f32591b = (zo0) objM6869O13;
                    vg0Var2.f32592c = qe3Var2;
                    VarHandle.storeStoreFence();
                    mz3.m8463e(nt2VarM3253l3, oz3VarM10799H, false, vg0Var2, null, null, y62.f34928f, y62.f34929g, y62.f34930h, null, ir1Var22, 114819072, 564);
                } else {
                    ir1Var22.m6874W();
                }
                return ju4Var;
            case 24:
                mi0 mi0Var21 = (mi0) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ir1 ir1Var23 = (ir1) mi0Var21;
                if (ir1Var23.m6871T(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    AbstractC0647fd.m5663a(null, null, ir1Var23, 0);
                } else {
                    ir1Var23.m6874W();
                }
                return ju4Var;
            case 25:
                mi0 mi0Var22 = (mi0) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ir1 ir1Var24 = (ir1) mi0Var22;
                if (ir1Var24.m6871T(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    mz3.m8463e(null, null, false, rz2.m10510c(y62.f34934l, ir1Var24), null, null, y62.f34935m, y62.f34936n, y62.f34937o, null, ir1Var24, 114819072, 567);
                } else {
                    ir1Var24.m6874W();
                }
                return ju4Var;
            case 26:
                mi0 mi0Var23 = (mi0) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ir1 ir1Var25 = (ir1) mi0Var23;
                if (ir1Var25.m6871T(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    AbstractC1238v.m11688a(null, ir1Var25, 0);
                } else {
                    ir1Var25.m6874W();
                }
                return ju4Var;
            case 27:
                om0 om0Var = (om0) obj;
                mi0 mi0Var24 = (mi0) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                if ((iIntValue24 & 6) == 0) {
                    iIntValue24 |= ((ir1) mi0Var24).m6890g(om0Var) ? 4 : 2;
                }
                ir1 ir1Var26 = (ir1) mi0Var24;
                if (ir1Var26.m6871T(iIntValue24 & 1, (iIntValue24 & 19) != 18)) {
                    q20.m9702a(as4.m3258q(n74.m8575c(n74.m8574b(AbstractC0647fd.m5651I(kt2Var, 0.0f, qm0.f28568g, 1), 1.0f), qm0.f28567f), om0Var.f26874c, k43.f22879x), ir1Var26, 0);
                } else {
                    ir1Var26.m6874W();
                }
                return ju4Var;
            case 28:
                mi0 mi0Var25 = (mi0) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ir1 ir1Var27 = (ir1) mi0Var25;
                if (ir1Var27.m6871T(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    cv0.m4171c(0, ir1Var27);
                } else {
                    ir1Var27.m6874W();
                }
                return ju4Var;
            default:
                mi0 mi0Var26 = (mi0) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ir1 ir1Var28 = (ir1) mi0Var26;
                if (ir1Var28.m6871T(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    un2.m11586a(0, ir1Var28);
                } else {
                    ir1Var28.m6874W();
                }
                return ju4Var;
        }
    }
}
