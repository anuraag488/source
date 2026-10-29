package p000;

import ads_mobile_sdk.al3;
import ads_mobile_sdk.cr3;
import ads_mobile_sdk.el3;
import ads_mobile_sdk.ir0;
import ads_mobile_sdk.lx3;
import ads_mobile_sdk.oy3;
import ads_mobile_sdk.qo0;
import ads_mobile_sdk.sv1;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.lang.invoke.VarHandle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u75 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31709a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ nm5 f31710b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Context f31711c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ String f31712d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ View f31713e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Activity f31714f;

    public /* synthetic */ u75(byte b) {
        this.f31709a = b;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String strM2273a;
        switch (this.f31709a) {
            case 0:
                el3 el3Var = (el3) this.f31710b;
                Context context = this.f31711c;
                String str = this.f31712d;
                View view = this.f31713e;
                Activity activity = this.f31714f;
                HashMap map = new HashMap();
                oy3 oy3Var = el3Var.f3095h;
                ir0 ir0Var = ir0.f5320i3;
                s75 s75Var = new s75((byte) 0);
                s75Var.f29949b = el3Var;
                s75Var.f29950c = map;
                s75Var.f29951d = context;
                s75Var.f29952e = view;
                s75Var.f29953f = activity;
                s75Var.f29954g = str;
                VarHandle.storeStoreFence();
                oy3Var.m1893a(ir0Var, s75Var);
                String strM831a = el3Var.m831a(map);
                map.clear();
                return strM831a;
            case 1:
                el3 el3Var2 = (el3) this.f31710b;
                Context context2 = this.f31711c;
                String str2 = this.f31712d;
                View view2 = this.f31713e;
                Activity activity2 = this.f31714f;
                HashMap map2 = new HashMap();
                oy3 oy3Var2 = el3Var2.f3095h;
                ir0 ir0Var2 = ir0.f5320i3;
                s75 s75Var2 = new s75((byte) 1);
                s75Var2.f29949b = el3Var2;
                s75Var2.f29950c = map2;
                s75Var2.f29951d = context2;
                s75Var2.f29952e = view2;
                s75Var2.f29953f = activity2;
                s75Var2.f29954g = str2;
                VarHandle.storeStoreFence();
                oy3Var2.m1893a(ir0Var2, s75Var2);
                String strM831a2 = el3Var2.m831a(map2);
                map2.clear();
                return strM831a2;
            default:
                al3 al3Var = (al3) this.f31710b;
                Context context3 = this.f31711c;
                String str3 = this.f31712d;
                View view3 = this.f31713e;
                Activity activity3 = this.f31714f;
                sv1 sv1VarM1260a = al3Var.f673a.m1260a();
                if (sv1VarM1260a == null) {
                    al3Var.f676d.m1894b(ir0.f5304f2);
                    return "";
                }
                synchronized (sv1VarM1260a) {
                    try {
                        qo0 qo0Var = sv1VarM1260a.f11761b;
                        oy3 oy3Var3 = qo0Var.f9051c;
                        lx3 lx3Var = new lx3(ir0.f5329k2, oy3Var3.f8415b, oy3Var3.f8414a);
                        try {
                            lx3Var.m1630b();
                            cr3 cr3Var = qo0Var.f9050b;
                            cr3Var.getClass();
                            HashMap map3 = new HashMap();
                            Iterator it = cr3Var.f2249a.iterator();
                            while (it.hasNext()) {
                                ((xj5) it.next()).mo217b(map3);
                            }
                            qo0Var.m2055a(map3);
                            lx3Var.m1628a();
                            map3.put("f", "c");
                            map3.put("ctx", context3);
                            map3.put("cs", str3);
                            map3.put("aid", null);
                            map3.put("view", view3);
                            map3.put("act", activity3);
                            byte[] bArrM2276a = sv1VarM1260a.m2276a(map3);
                            if (sv1VarM1260a.f11763d) {
                                map3.clear();
                            }
                            strM2273a = sv1.m2273a(bArrM2276a);
                        } catch (Throwable th) {
                            lx3Var.m1628a();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (strM2273a != null) {
                    return strM2273a;
                }
                al3Var.f676d.m1894b(ir0.f5324j2);
                return "";
        }
    }
}
