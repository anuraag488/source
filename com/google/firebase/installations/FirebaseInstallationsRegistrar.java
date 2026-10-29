package com.google.firebase.installations;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.invoke.VarHandle;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p000.C0811ju;
import p000.InterfaceC0703gw;
import p000.ar1;
import p000.b52;
import p000.bi3;
import p000.cg0;
import p000.dw4;
import p000.e24;
import p000.fg0;
import p000.hg1;
import p000.ni3;
import p000.ny0;
import p000.oj3;
import p000.pf0;
import p000.pg1;
import p000.qf0;
import p000.qg2;
import p000.r00;
import p000.rg1;
import p000.sg1;
import p000.wb1;
import p000.wv1;
import p000.xv1;
import p000.y42;
import p000.z32;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static sg1 lambda$getComponents$0(cg0 cg0Var) {
        hg1 hg1Var = (hg1) cg0Var.mo4017a(hg1.class);
        bi3 bi3VarMo4020d = cg0Var.mo4020d(xv1.class);
        ExecutorService executorService = (ExecutorService) cg0Var.mo4023g(new ni3(InterfaceC0703gw.class, ExecutorService.class));
        Executor executor = (Executor) cg0Var.mo4023g(new ni3(r00.class, Executor.class));
        e24 e24Var = new e24();
        e24Var.f17644b = new ArrayDeque();
        e24Var.f17645c = 1;
        e24Var.f17646d = 0L;
        ar1 ar1Var = new ar1((byte) 4);
        ar1Var.f14799c = e24Var;
        VarHandle.storeStoreFence();
        e24Var.f17647e = ar1Var;
        y42.m12854a0(executor);
        e24Var.f17643a = executor;
        VarHandle.storeStoreFence();
        hg1Var.m6388a();
        Context context = hg1Var.f20545a;
        pg1 pg1Var = new pg1();
        pg1Var.f27591a = context;
        pg1Var.f27592b = bi3VarMo4020d;
        b52 b52Var = new b52();
        dw4.m4783a();
        VarHandle.storeStoreFence();
        pg1Var.f27593c = b52Var;
        VarHandle.storeStoreFence();
        z32 z32Var = new z32((byte) 26);
        z32Var.f35739c = hg1Var;
        VarHandle.storeStoreFence();
        dw4 dw4VarM4783a = dw4.m4783a();
        fg0 fg0Var = new fg0((byte) 2);
        fg0Var.f18956b = hg1Var;
        VarHandle.storeStoreFence();
        qg2 qg2Var = new qg2(fg0Var);
        oj3 oj3Var = new oj3();
        rg1 rg1Var = new rg1();
        rg1Var.f29242g = new Object();
        rg1Var.f29246k = new HashSet();
        rg1Var.f29247l = new ArrayList();
        rg1Var.f29236a = hg1Var;
        rg1Var.f29237b = pg1Var;
        rg1Var.f29238c = z32Var;
        rg1Var.f29239d = dw4VarM4783a;
        rg1Var.f29240e = qg2Var;
        rg1Var.f29241f = oj3Var;
        rg1Var.f29243h = executorService;
        rg1Var.f29244i = e24Var;
        VarHandle.storeStoreFence();
        return rg1Var;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<qf0> getComponents() {
        pf0 pf0VarM9880b = qf0.m9880b(sg1.class);
        pf0VarM9880b.f27571a = LIBRARY_NAME;
        pf0VarM9880b.m9509a(ny0.m8897b(hg1.class));
        pf0VarM9880b.m9509a(new ny0(xv1.class, 0, 1));
        pf0VarM9880b.m9509a(new ny0(new ni3(InterfaceC0703gw.class, ExecutorService.class), 1, 0));
        pf0VarM9880b.m9509a(new ny0(new ni3(r00.class, Executor.class), 1, 0));
        pf0VarM9880b.f27576f = new wb1((byte) 10);
        return Arrays.asList(pf0VarM9880b.m9510b(), qf0.m9881c(new wv1((byte) 0), wv1.class), qf0.m9881c(C0811ju.m7283a(LIBRARY_NAME, "20.0.0"), C0811ju.class));
    }
}
