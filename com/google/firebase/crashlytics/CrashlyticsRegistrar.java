package com.google.firebase.crashlytics;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p000.C0811ju;
import p000.C1040pn;
import p000.InterfaceC0703gw;
import p000.InterfaceC0828ka;
import p000.ah1;
import p000.gx2;
import p000.hg1;
import p000.ig1;
import p000.jh1;
import p000.lh1;
import p000.ni3;
import p000.ny0;
import p000.o34;
import p000.pf0;
import p000.qf0;
import p000.r00;
import p000.sg1;
import p000.sp0;
import p000.vk2;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f16307d = 0;

    /* JADX INFO: renamed from: a */
    public final ni3 f16308a = new ni3(InterfaceC0703gw.class, ExecutorService.class);

    /* JADX INFO: renamed from: b */
    public final ni3 f16309b = new ni3(r00.class, ExecutorService.class);

    /* JADX INFO: renamed from: c */
    public final ni3 f16310c = new ni3(vk2.class, ExecutorService.class);

    static {
        Map map = lh1.f24031b;
        o34 o34Var = o34.f26315a;
        if (map.containsKey(o34Var)) {
            Log.d("SessionsDependencies", "Dependency " + o34Var + " already added.");
            return;
        }
        gx2 gx2Var = new gx2(true);
        jh1 jh1Var = new jh1();
        jh1Var.f22270a = gx2Var;
        jh1Var.f22271b = null;
        VarHandle.storeStoreFence();
        map.put(o34Var, jh1Var);
        Log.d("SessionsDependencies", "Dependency to " + o34Var + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        pf0 pf0VarM9880b = qf0.m9880b(ig1.class);
        pf0VarM9880b.f27571a = "fire-cls";
        pf0VarM9880b.m9509a(ny0.m8897b(hg1.class));
        pf0VarM9880b.m9509a(ny0.m8897b(sg1.class));
        pf0VarM9880b.m9509a(new ny0(this.f16308a, 1, 0));
        pf0VarM9880b.m9509a(new ny0(this.f16309b, 1, 0));
        pf0VarM9880b.m9509a(new ny0(this.f16310c, 1, 0));
        pf0VarM9880b.m9509a(new ny0(sp0.class, 0, 2));
        pf0VarM9880b.m9509a(new ny0(InterfaceC0828ka.class, 0, 2));
        pf0VarM9880b.m9509a(new ny0(ah1.class, 0, 2));
        C1040pn c1040pn = new C1040pn((byte) 8);
        c1040pn.f27754b = this;
        VarHandle.storeStoreFence();
        pf0VarM9880b.f27576f = c1040pn;
        pf0VarM9880b.m9511c();
        return Arrays.asList(pf0VarM9880b.m9510b(), qf0.m9881c(C0811ju.m7283a("fire-cls", "19.4.4"), C0811ju.class));
    }
}
