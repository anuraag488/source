package p000;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kt1 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public Object f23418A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ Object f23419B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ Object f23420C;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f23421t = 1;

    /* JADX INFO: renamed from: u */
    public byte f23422u;

    /* JADX INFO: renamed from: v */
    public Object f23423v;

    /* JADX INFO: renamed from: w */
    public Object f23424w;

    /* JADX INFO: renamed from: x */
    public Object f23425x;

    /* JADX INFO: renamed from: y */
    public Object f23426y;

    /* JADX INFO: renamed from: z */
    public Object f23427z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt1(wm0 wm0Var, InterfaceC0755ia interfaceC0755ia, qe3 qe3Var, d00 d00Var, Activity activity, yp1 yp1Var, xz4 xz4Var, yp1 yp1Var2, lv1 lv1Var) {
        super(2, wm0Var);
        this.f23423v = interfaceC0755ia;
        this.f23424w = qe3Var;
        this.f23425x = d00Var;
        this.f23426y = activity;
        this.f23427z = yp1Var;
        this.f23419B = xz4Var;
        this.f23418A = yp1Var2;
        this.f23420C = lv1Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f23421t;
        Object obj2 = this.f23420C;
        Object obj3 = this.f23419B;
        switch (b) {
            case 0:
                return new kt1(wm0Var, (InterfaceC0755ia) this.f23423v, (qe3) this.f23424w, (d00) this.f23425x, (Activity) this.f23426y, (yp1) this.f23427z, (xz4) obj3, (yp1) this.f23418A, (lv1) obj2);
            default:
                return new kt1((g34) obj3, (c34) obj2, wm0Var);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f23421t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((kt1) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0098  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01da, code lost:
    
        if (p000.AbstractC0647fd.m5667e((p000.yp1) r19.f23427z, (p000.xz4) r4, r2, r3, "Premium version unlocked, enjoy! 🚀", r5, r19) == r9) goto L66;
     */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objMo9874g;
        Object objM5896a;
        Object objM6671f;
        u42 u42Var;
        e34 e34Var;
        hg1 hg1Var;
        c34 c34Var;
        s34 s34Var;
        Object objM7968b;
        s34 s34Var2;
        kp0 kp0Var;
        et0 et0Var;
        et0 et0Var2;
        et0 et0Var3;
        et0 et0Var4;
        kp0 kp0Var2;
        et0 et0Var5;
        byte b = this.f23421t;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f23420C;
        Object obj3 = this.f23419B;
        switch (b) {
            case 0:
                InterfaceC0755ia interfaceC0755ia = (InterfaceC0755ia) this.f23423v;
                d00 d00Var = (d00) this.f23425x;
                ap0 ap0Var = ap0.f14763a;
                byte b2 = this.f23422u;
                if (b2 != 0) {
                    if (b2 == 1) {
                        k43.m7376J(obj);
                        objMo9874g = obj;
                    } else {
                        if (b2 != 2) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj);
                    }
                    return ju4Var;
                }
                k43.m7376J(obj);
                if (interfaceC0755ia != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("product_id", d00Var.f16662f.f26681a);
                    interfaceC0755ia.mo6706b("paywall_product_selected", bundle);
                }
                qe3 qe3Var = (qe3) this.f23424w;
                Activity activity = (Activity) this.f23426y;
                this.f23422u = (byte) 1;
                objMo9874g = qe3Var.mo9874g(d00Var, activity, this);
                if (objMo9874g != ap0Var) {
                }
                return ap0Var;
                boolean zBooleanValue = ((Boolean) objMo9874g).booleanValue();
                if (interfaceC0755ia != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("product_id", d00Var.f16662f.f26681a);
                    bundle2.putString("success", String.valueOf(zBooleanValue));
                    interfaceC0755ia.mo6706b("purchase_flow_result", bundle2);
                }
                if (zBooleanValue) {
                    yp1 yp1Var = (yp1) this.f23418A;
                    lv1 lv1Var = (lv1) obj2;
                    og3 og3Var = d00Var.f16662f;
                    vs1 vs1Var = new vs1();
                    vs1Var.f32829a = og3Var;
                    VarHandle.storeStoreFence();
                    this.f23422u = (byte) 2;
                    break;
                }
                return ju4Var;
            default:
                g34 g34Var = (g34) obj3;
                ap0 ap0Var2 = ap0.f14763a;
                byte b3 = this.f23422u;
                if (b3 == 0) {
                    k43.m7376J(obj);
                    this.f23422u = (byte) 1;
                    int i = g34.f19587g;
                    objM5896a = g34Var.m5896a(this);
                    if (objM5896a != ap0Var2) {
                    }
                    return ap0Var2;
                }
                if (b3 == 1) {
                    k43.m7376J(obj);
                    objM5896a = obj;
                } else {
                    if (b3 == 2) {
                        k43.m7376J(obj);
                        objM6671f = obj;
                        u42Var = (u42) objM6671f;
                        e34Var = e34.f17665a;
                        hg1Var = g34Var.f19588a;
                        c34Var = (c34) obj2;
                        s34Var = g34Var.f19590c;
                        lh1 lh1Var = lh1.f24030a;
                        this.f23423v = u42Var;
                        this.f23424w = g34Var;
                        this.f23425x = e34Var;
                        this.f23426y = hg1Var;
                        this.f23427z = c34Var;
                        this.f23418A = s34Var;
                        this.f23422u = (byte) 3;
                        objM7968b = lh1Var.m7968b(this);
                        if (objM7968b != ap0Var2) {
                            s34Var2 = s34Var;
                        }
                        return ap0Var2;
                    }
                    if (b3 != 3) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    s34Var2 = (s34) this.f23418A;
                    c34Var = (c34) this.f23427z;
                    hg1Var = (hg1) this.f23426y;
                    e34Var = (e34) this.f23425x;
                    g34Var = (g34) this.f23424w;
                    u42Var = (u42) this.f23423v;
                    k43.m7376J(obj);
                    objM7968b = obj;
                }
                Map map = (Map) objM7968b;
                String str = u42Var.f31649a;
                String str2 = u42Var.f31650b;
                e34Var.getClass();
                String str3 = c34Var.f15784a;
                String str4 = c34Var.f15785b;
                int i2 = c34Var.f15786c;
                long j = c34Var.f15787d;
                kp0Var = (kp0) map.get(o34.f26316b);
                et0Var = et0.f18463d;
                et0Var2 = et0.f18462c;
                et0Var3 = et0.f18461b;
                if (kp0Var == null) {
                    et0Var4 = et0Var3;
                } else if (kp0Var.f23307a.m3668a()) {
                    et0Var4 = et0Var2;
                } else {
                    et0Var4 = et0Var;
                }
                kp0Var2 = (kp0) map.get(o34.f26315a);
                if (kp0Var2 == null) {
                    et0Var5 = et0Var3;
                } else if (kp0Var2.f23307a.m3668a()) {
                    et0Var5 = et0Var2;
                } else {
                    et0Var5 = et0Var;
                }
                double dM10516a = s34Var2.m10516a();
                ft0 ft0Var = new ft0();
                ft0Var.f19269a = et0Var4;
                ft0Var.f19270b = et0Var5;
                ft0Var.f19271c = dM10516a;
                VarHandle.storeStoreFence();
                i34 i34Var = new i34();
                i34Var.f21102a = str3;
                i34Var.f21103b = str4;
                i34Var.f21104c = i2;
                i34Var.f21105d = j;
                i34Var.f21106e = ft0Var;
                i34Var.f21107f = str;
                i34Var.f21108g = str2;
                VarHandle.storeStoreFence();
                C0533cn c0533cnM4915a = e34.m4915a(hg1Var);
                d34 d34Var = new d34();
                d34Var.f16763a = i34Var;
                d34Var.f16764b = c0533cnM4915a;
                VarHandle.storeStoreFence();
                int i3 = g34.f19587g;
                g34Var.getClass();
                try {
                    g34Var.f19591d.m12641a(d34Var);
                    Log.d("SessionFirelogPublisher", "Successfully logged Session Start event.");
                    break;
                } catch (RuntimeException e) {
                    Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e);
                }
                return ju4Var;
                if (((Boolean) objM5896a).booleanValue()) {
                    sg1 sg1Var = g34Var.f19589b;
                    this.f23422u = (byte) 2;
                    objM6671f = u42.f31648c.m6671f(sg1Var, this);
                    if (objM6671f != ap0Var2) {
                        u42Var = (u42) objM6671f;
                        e34Var = e34.f17665a;
                        hg1Var = g34Var.f19588a;
                        c34Var = (c34) obj2;
                        s34Var = g34Var.f19590c;
                        lh1 lh1Var2 = lh1.f24030a;
                        this.f23423v = u42Var;
                        this.f23424w = g34Var;
                        this.f23425x = e34Var;
                        this.f23426y = hg1Var;
                        this.f23427z = c34Var;
                        this.f23418A = s34Var;
                        this.f23422u = (byte) 3;
                        objM7968b = lh1Var2.m7968b(this);
                        if (objM7968b != ap0Var2) {
                            s34Var2 = s34Var;
                            Map map2 = (Map) objM7968b;
                            String str5 = u42Var.f31649a;
                            String str6 = u42Var.f31650b;
                            e34Var.getClass();
                            String str7 = c34Var.f15784a;
                            String str8 = c34Var.f15785b;
                            int i4 = c34Var.f15786c;
                            long j2 = c34Var.f15787d;
                            kp0Var = (kp0) map2.get(o34.f26316b);
                            et0Var = et0.f18463d;
                            et0Var2 = et0.f18462c;
                            et0Var3 = et0.f18461b;
                            if (kp0Var == null) {
                                et0Var4 = et0Var3;
                            } else if (kp0Var.f23307a.m3668a()) {
                                et0Var4 = et0Var2;
                            } else {
                                et0Var4 = et0Var;
                            }
                            kp0Var2 = (kp0) map2.get(o34.f26315a);
                            if (kp0Var2 == null) {
                                et0Var5 = et0Var3;
                            } else if (kp0Var2.f23307a.m3668a()) {
                                et0Var5 = et0Var2;
                            } else {
                                et0Var5 = et0Var;
                            }
                            double dM10516a2 = s34Var2.m10516a();
                            ft0 ft0Var2 = new ft0();
                            ft0Var2.f19269a = et0Var4;
                            ft0Var2.f19270b = et0Var5;
                            ft0Var2.f19271c = dM10516a2;
                            VarHandle.storeStoreFence();
                            i34 i34Var2 = new i34();
                            i34Var2.f21102a = str7;
                            i34Var2.f21103b = str8;
                            i34Var2.f21104c = i4;
                            i34Var2.f21105d = j2;
                            i34Var2.f21106e = ft0Var2;
                            i34Var2.f21107f = str5;
                            i34Var2.f21108g = str6;
                            VarHandle.storeStoreFence();
                            C0533cn c0533cnM4915a2 = e34.m4915a(hg1Var);
                            d34 d34Var2 = new d34();
                            d34Var2.f16763a = i34Var2;
                            d34Var2.f16764b = c0533cnM4915a2;
                            VarHandle.storeStoreFence();
                            int i5 = g34.f19587g;
                            g34Var.getClass();
                            g34Var.f19591d.m12641a(d34Var2);
                            Log.d("SessionFirelogPublisher", "Successfully logged Session Start event.");
                        }
                        break;
                    }
                    return ap0Var2;
                }
                ju4Var = ju4Var;
                return ju4Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt1(g34 g34Var, c34 c34Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f23419B = g34Var;
        this.f23420C = c34Var;
    }
}
