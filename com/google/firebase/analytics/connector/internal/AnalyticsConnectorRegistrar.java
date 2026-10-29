package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p000.C0811ju;
import p000.C0865la;
import p000.InterfaceC0828ka;
import p000.aj5;
import p000.cg0;
import p000.ct0;
import p000.hg1;
import p000.ie4;
import p000.ny0;
import p000.pf0;
import p000.qf0;
import p000.wa1;
import p000.x36;
import p000.y42;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC0828ka lambda$getComponents$0(cg0 cg0Var) {
        boolean z;
        hg1 hg1Var = (hg1) cg0Var.mo4017a(hg1.class);
        Context context = (Context) cg0Var.mo4017a(Context.class);
        ie4 ie4Var = (ie4) cg0Var.mo4017a(ie4.class);
        y42.m12854a0(hg1Var);
        y42.m12854a0(context);
        y42.m12854a0(ie4Var);
        y42.m12854a0(context.getApplicationContext());
        if (C0865la.f23884c == null) {
            synchronized (C0865la.class) {
                if (C0865la.f23884c == null) {
                    Bundle bundle = new Bundle(1);
                    hg1Var.m6388a();
                    if ("[DEFAULT]".equals(hg1Var.f20546b)) {
                        ((wa1) ie4Var).m12175a();
                        hg1Var.m6388a();
                        ct0 ct0Var = (ct0) hg1Var.f20551g.get();
                        synchronized (ct0Var) {
                            z = ct0Var.f16442a;
                        }
                        bundle.putBoolean("dataCollectionDefaultEnabled", z);
                    }
                    AppMeasurementSdk appMeasurementSdk = x36.m12475e(context, bundle).f33962b;
                    C0865la c0865la = new C0865la();
                    y42.m12854a0(appMeasurementSdk);
                    c0865la.f23885a = appMeasurementSdk;
                    c0865la.f23886b = new ConcurrentHashMap();
                    VarHandle.storeStoreFence();
                    C0865la.f23884c = c0865la;
                }
            }
        }
        return C0865la.f23884c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<qf0> getComponents() {
        pf0 pf0VarM9880b = qf0.m9880b(InterfaceC0828ka.class);
        pf0VarM9880b.m9509a(ny0.m8897b(hg1.class));
        pf0VarM9880b.m9509a(ny0.m8897b(Context.class));
        pf0VarM9880b.m9509a(ny0.m8897b(ie4.class));
        pf0VarM9880b.f27576f = aj5.f14546b;
        pf0VarM9880b.m9511c();
        return Arrays.asList(pf0VarM9880b.m9510b(), qf0.m9881c(C0811ju.m7283a("fire-analytics", "22.5.0"), C0811ju.class));
    }
}
