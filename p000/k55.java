package p000;

import ads_mobile_sdk.al3;
import ads_mobile_sdk.cr3;
import ads_mobile_sdk.ir0;
import ads_mobile_sdk.lx3;
import ads_mobile_sdk.oy3;
import ads_mobile_sdk.qo0;
import ads_mobile_sdk.sv1;
import ads_mobile_sdk.wr3;
import ads_mobile_sdk.zx2;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k55 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22915a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f22916b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f22917c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f22918d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f22919e;

    public /* synthetic */ k55(byte b) {
        this.f22915a = b;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String strM2273a;
        switch (this.f22915a) {
            case 0:
                al3 al3Var = (al3) this.f22916b;
                Context context = (Context) this.f22917c;
                View view = (View) this.f22918d;
                Activity activity = (Activity) this.f22919e;
                sv1 sv1VarM1260a = al3Var.f673a.m1260a();
                if (sv1VarM1260a == null) {
                    al3Var.f676d.m1894b(ir0.f5304f2);
                    return "";
                }
                synchronized (sv1VarM1260a) {
                    try {
                        qo0 qo0Var = sv1VarM1260a.f11761b;
                        oy3 oy3Var = qo0Var.f9051c;
                        lx3 lx3Var = new lx3(ir0.f5329k2, oy3Var.f8415b, oy3Var.f8414a);
                        try {
                            lx3Var.m1630b();
                            cr3 cr3Var = qo0Var.f9050b;
                            Context context2 = qo0Var.f9049a;
                            cr3Var.getClass();
                            HashMap map = new HashMap();
                            Iterator it = cr3Var.f2249a.iterator();
                            while (it.hasNext()) {
                                ((xj5) it.next()).mo216a(map, context2, null);
                            }
                            qo0Var.m2055a(map);
                            lx3Var.m1628a();
                            map.put("f", "v");
                            map.put("ctx", context);
                            map.put("aid", null);
                            map.put("view", view);
                            map.put("act", activity);
                            byte[] bArrM2276a = sv1VarM1260a.m2276a(map);
                            if (sv1VarM1260a.f11763d) {
                                map.clear();
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
                al3Var.f676d.m1894b(ir0.f5319i2);
                return "";
            default:
                wr3 wr3Var = (wr3) this.f22916b;
                wr3Var.f13058a.m1733a((zx2) this.f22917c, (byte[]) this.f22918d, (byte[]) this.f22919e);
                return null;
        }
    }
}
