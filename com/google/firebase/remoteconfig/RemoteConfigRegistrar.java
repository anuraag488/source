package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import p000.C0811ju;
import p000.C1241v2;
import p000.ComponentCallbacks2C0776iw;
import p000.InterfaceC0828ka;
import p000.ah1;
import p000.bg1;
import p000.bi3;
import p000.cg0;
import p000.cw0;
import p000.hg1;
import p000.ni3;
import p000.ny0;
import p000.pf0;
import p000.qf0;
import p000.r00;
import p000.sg1;
import p000.sj0;
import p000.um3;
import p000.vm3;
import p000.y62;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static vm3 lambda$getComponents$0(ni3 ni3Var, cg0 cg0Var) {
        bg1 bg1Var;
        Context context = (Context) cg0Var.mo4017a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) cg0Var.mo4023g(ni3Var);
        hg1 hg1Var = (hg1) cg0Var.mo4017a(hg1.class);
        sg1 sg1Var = (sg1) cg0Var.mo4017a(sg1.class);
        C1241v2 c1241v2 = (C1241v2) cg0Var.mo4017a(C1241v2.class);
        synchronized (c1241v2) {
            try {
                if (!c1241v2.f32322a.containsKey("frc")) {
                    HashMap map = c1241v2.f32322a;
                    bi3 bi3Var = c1241v2.f32323b;
                    bg1 bg1Var2 = new bg1();
                    bg1Var2.f15253a = bi3Var;
                    bg1Var2.f15254b = "frc";
                    bg1Var2.f15255c = null;
                    VarHandle.storeStoreFence();
                    map.put("frc", bg1Var2);
                }
                bg1Var = (bg1) c1241v2.f32322a.get("frc");
            } catch (Throwable th) {
                throw th;
            }
        }
        bi3 bi3VarMo4020d = cg0Var.mo4020d(InterfaceC0828ka.class);
        vm3 vm3Var = new vm3();
        vm3Var.f32735a = new HashMap();
        vm3Var.f32743i = new HashMap();
        vm3Var.f32736b = context;
        vm3Var.f32737c = scheduledExecutorService;
        vm3Var.f32738d = hg1Var;
        vm3Var.f32739e = sg1Var;
        vm3Var.f32740f = bg1Var;
        vm3Var.f32741g = bi3VarMo4020d;
        hg1Var.m6388a();
        vm3Var.f32742h = hg1Var.f20547c.f31843b;
        AtomicReference atomicReference = um3.f31992a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = um3.f31992a;
        if (atomicReference2.get() == null) {
            um3 um3Var = new um3();
            if (atomicReference2.compareAndSet(null, um3Var)) {
                ComponentCallbacks2C0776iw.m6949b(application);
                ComponentCallbacks2C0776iw.f21830e.m6950a(um3Var);
            }
        }
        sj0 sj0Var = new sj0((byte) 3);
        sj0Var.f30325b = vm3Var;
        VarHandle.storeStoreFence();
        y62.m12991r(sj0Var, scheduledExecutorService);
        VarHandle.storeStoreFence();
        return vm3Var;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<qf0> getComponents() {
        ni3 ni3Var = new ni3(r00.class, ScheduledExecutorService.class);
        pf0 pf0Var = new pf0(vm3.class, ah1.class);
        pf0Var.f27571a = LIBRARY_NAME;
        pf0Var.m9509a(ny0.m8897b(Context.class));
        pf0Var.m9509a(new ny0(ni3Var, 1, 0));
        pf0Var.m9509a(ny0.m8897b(hg1.class));
        pf0Var.m9509a(ny0.m8897b(sg1.class));
        pf0Var.m9509a(ny0.m8897b(C1241v2.class));
        pf0Var.m9509a(new ny0(InterfaceC0828ka.class, 0, 1));
        cw0 cw0Var = new cw0((byte) 1);
        cw0Var.f16523b = ni3Var;
        VarHandle.storeStoreFence();
        pf0Var.f27576f = cw0Var;
        pf0Var.m9511c();
        return Arrays.asList(pf0Var.m9510b(), qf0.m9881c(C0811ju.m7283a(LIBRARY_NAME, "24.0.1"), C0811ju.class));
    }
}
