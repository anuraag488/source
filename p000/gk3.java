package p000;

import ads_mobile_sdk.C0045ba;
import ads_mobile_sdk.C0213l2;
import ads_mobile_sdk.C0367uz;
import ads_mobile_sdk.b11;
import ads_mobile_sdk.cy3;
import ads_mobile_sdk.ey0;
import ads_mobile_sdk.is1;
import ads_mobile_sdk.j31;
import ads_mobile_sdk.mx3;
import ads_mobile_sdk.oh3;
import ads_mobile_sdk.qh3;
import ads_mobile_sdk.s21;
import ads_mobile_sdk.su1;
import ads_mobile_sdk.ty0;
import ads_mobile_sdk.w01;
import ads_mobile_sdk.w11;
import android.view.View;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gk3 extends ue2 implements wp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f19832i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f19833j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f19834k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f19835l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk3(ey0 ey0Var, wa2 wa2Var, hx0 hx0Var) {
        super(0);
        this.f19832i = (byte) 3;
        this.f19833j = wa2Var;
        this.f19834k = ey0Var;
        this.f19835l = hx0Var;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f19832i;
        ju4 ju4Var = ju4.f22634a;
        Object obj = this.f19835l;
        Object obj2 = this.f19834k;
        Object obj3 = this.f19833j;
        switch (b) {
            case 0:
                return ((n70) obj3).f25488b.mo4796j(((C1394z6) obj).f35775h.f17521d, ((av1) obj2).m3315a());
            case 1:
                C0045ba c0045ba = (C0045ba) obj3;
                View view = (View) obj2;
                ty0 ty0Var = (ty0) obj;
                if (!c0045ba.f1084f) {
                    c0045ba.f1080b.m2496a(view, ty0Var);
                }
                return ju4Var;
            case 2:
                is1 is1Var = (is1) obj3;
                View view2 = (View) obj2;
                ty0 ty0Var2 = (ty0) obj;
                for (C0045ba c0045ba2 : is1Var.f5411e.values()) {
                    if (!c0045ba2.f1084f) {
                        c0045ba2.f1080b.m2496a(view2, ty0Var2);
                    }
                }
                is1Var.f5412f.m2496a(view2, ty0Var2);
                return ju4Var;
            default:
                wa2 wa2Var = (wa2) obj3;
                ey0 ey0Var = (ey0) obj2;
                hx0 hx0Var = (hx0) obj;
                mx3 mx3VarM655a = cy3.m655a(s21.f11026J, v71.f32439a, true);
                try {
                    o92 o92VarM12176A = wa2Var.m12176A("responses");
                    int i = 0;
                    wa2 wa2VarM3528l = !o92VarM12176A.f26491a.isEmpty() ? ((ba2) o92VarM12176A.f26491a.get(0)).m3528l() : null;
                    su1 su1Var = su1.f11748a;
                    o92 o92VarM12176A2 = wa2VarM3528l != null ? wa2VarM3528l.m12176A("ad_configs") : null;
                    ArrayList arrayList = new ArrayList();
                    if (o92VarM12176A2 != null) {
                        ArrayList arrayList2 = o92VarM12176A2.f26491a;
                        int size = arrayList2.size();
                        int i2 = 0;
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj4 = arrayList2.get(i3);
                            i3++;
                            int i4 = i2 + 1;
                            if (i2 < 0) {
                                kx5.m7735t0();
                                throw null;
                            }
                            List list = C0213l2.f6574J0;
                            C0213l2 c0213l2M5336K = ev0.m5336K(((ba2) obj4).m3528l(), i2, hx0Var);
                            if (c0213l2M5336K != null) {
                                arrayList.add(c0213l2M5336K);
                            }
                            i2 = i4;
                        }
                    }
                    C0367uz c0367uzM3814i = c20.m3814i(wa2VarM3528l != null ? wa2VarM3528l.m12177B("common") : null, ey0Var);
                    su1 su1Var2 = su1.f11748a;
                    ba2 ba2VarM12186z = wa2Var.m12186z("actions");
                    o92 o92VarM3527g = ba2VarM12186z != null ? ba2VarM12186z.m3527g() : null;
                    ArrayList arrayList3 = new ArrayList();
                    if (o92VarM3527g != null) {
                        ArrayList arrayList4 = o92VarM3527g.f26491a;
                        int size2 = arrayList4.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj5 = arrayList4.get(i5);
                            i5++;
                            int i6 = i + 1;
                            if (i < 0) {
                                kx5.m7735t0();
                                throw null;
                            }
                            oh3 oh3VarM9107m = oh6.m9107m(((ba2) obj5).m3528l());
                            if (oh3VarM9107m != null) {
                                arrayList3.add(oh3VarM9107m);
                            }
                            i = i6;
                        }
                    }
                    qh3 qh3Var = new qh3();
                    qh3Var.f9006a = arrayList;
                    qh3Var.f9007b = c0367uzM3814i;
                    qh3Var.f9008c = arrayList3;
                    VarHandle.storeStoreFence();
                    mx3VarM655a.close();
                    return qh3Var;
                } catch (Throwable th) {
                    try {
                        mx3VarM655a.m1736b(th);
                        if (th instanceof ka5) {
                            throw th;
                        }
                        if (!(th instanceof zm4) && !(th instanceof CancellationException)) {
                            mx3VarM655a.m1735a(th);
                        }
                        if (th instanceof zm4) {
                            throw new j31(th);
                        }
                        if (th instanceof CancellationException) {
                            throw new w01(th);
                        }
                        if (th instanceof w11) {
                            throw th;
                        }
                        throw new b11(th);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            lb5.m7941v(mx3VarM655a, th2);
                            throw th3;
                        }
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gk3(Object obj, Object obj2, Object obj3, byte b) {
        super(0);
        this.f19832i = b;
        this.f19833j = obj;
        this.f19834k = obj2;
        this.f19835l = obj3;
    }
}
