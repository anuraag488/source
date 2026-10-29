package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.invoke.VarHandle;
import java.util.List;
import p000.C0811ju;
import p000.C1122rv;
import p000.C1283w7;
import p000.InterfaceC0703gw;
import p000.ai3;
import p000.an3;
import p000.ar3;
import p000.b34;
import p000.bi3;
import p000.cg0;
import p000.dh1;
import p000.fh1;
import p000.gh1;
import p000.hg1;
import p000.hh1;
import p000.i11;
import p000.ib1;
import p000.kp4;
import p000.kx5;
import p000.mh1;
import p000.ni3;
import p000.ny0;
import p000.pf0;
import p000.qf0;
import p000.r00;
import p000.ro0;
import p000.sg1;
import p000.so0;
import p000.v42;
import p000.wb1;
import p000.ws0;
import p000.ya1;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";

    @Deprecated
    public static final String TAG = "FirebaseSessions";
    private static final mh1 Companion = new mh1();
    private static final ni3 appContext = ni3.m8779a(Context.class);
    private static final ni3 firebaseApp = ni3.m8779a(hg1.class);
    private static final ni3 firebaseInstallationsApi = ni3.m8779a(sg1.class);
    private static final ni3 backgroundDispatcher = new ni3(InterfaceC0703gw.class, so0.class);
    private static final ni3 blockingDispatcher = new ni3(r00.class, so0.class);
    private static final ni3 transportFactory = ni3.m8779a(kp4.class);
    private static final ni3 firebaseSessionsComponent = ni3.m8779a(fh1.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final dh1 getComponents$lambda$0(cg0 cg0Var) {
        return (dh1) ((ws0) ((fh1) cg0Var.mo4023g(firebaseSessionsComponent))).f33684i.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fh1 getComponents$lambda$1(cg0 cg0Var) {
        Context context = (Context) cg0Var.mo4023g(appContext);
        ro0 ro0Var = (ro0) cg0Var.mo4023g(backgroundDispatcher);
        hg1 hg1Var = (hg1) cg0Var.mo4023g(firebaseApp);
        sg1 sg1Var = (sg1) cg0Var.mo4023g(firebaseInstallationsApi);
        bi3 bi3VarMo4022f = cg0Var.mo4022f(transportFactory);
        ws0 ws0Var = new ws0();
        ws0Var.f33676a = v42.m11746a(hg1Var);
        v42 v42VarM11746a = v42.m11746a(context);
        ws0Var.f33677b = v42VarM11746a;
        ya1 ya1Var = new ya1((byte) 3);
        ya1Var.f35069b = v42VarM11746a;
        VarHandle.storeStoreFence();
        ws0Var.f33678c = i11.m6538a(ya1Var);
        ws0Var.f33679d = v42.m11746a(ro0Var);
        ws0Var.f33680e = v42.m11746a(sg1Var);
        v42 v42Var = ws0Var.f33676a;
        byte b = 1;
        ya1 ya1Var2 = new ya1(b);
        ya1Var2.f35069b = v42Var;
        VarHandle.storeStoreFence();
        ai3 ai3VarM6538a = i11.m6538a(ya1Var2);
        ws0Var.f33681f = ai3VarM6538a;
        v42 v42Var2 = ws0Var.f33679d;
        an3 an3Var = new an3((byte) 0);
        an3Var.f14641b = ai3VarM6538a;
        an3Var.f14642c = v42Var2;
        VarHandle.storeStoreFence();
        ws0Var.f33682g = i11.m6538a(an3Var);
        v42 v42Var3 = ws0Var.f33677b;
        ar3 ar3Var = new ar3((byte) 27);
        ar3Var.f14813b = v42Var3;
        VarHandle.storeStoreFence();
        ai3 ai3VarM6538a2 = i11.m6538a(ar3Var);
        byte b2 = 2;
        ib1 ib1Var = new ib1(b2);
        ib1Var.f21243b = ai3VarM6538a2;
        VarHandle.storeStoreFence();
        ai3 ai3VarM6538a3 = i11.m6538a(ib1Var);
        v42 v42Var4 = ws0Var.f33679d;
        v42 v42Var5 = ws0Var.f33680e;
        ai3 ai3Var = ws0Var.f33681f;
        ai3 ai3Var2 = ws0Var.f33682g;
        C1122rv c1122rv = new C1122rv((byte) 6, 0 == true ? 1 : 0);
        c1122rv.f29651b = v42Var4;
        c1122rv.f29652c = v42Var5;
        c1122rv.f29653d = ai3Var;
        c1122rv.f29654e = ai3Var2;
        c1122rv.f29655f = ai3VarM6538a3;
        VarHandle.storeStoreFence();
        ai3 ai3VarM6538a4 = i11.m6538a(c1122rv);
        ai3 ai3Var3 = ws0Var.f33678c;
        b34 b34Var = new b34(b);
        b34Var.f15061b = ai3Var3;
        b34Var.f15062c = ai3VarM6538a4;
        VarHandle.storeStoreFence();
        ws0Var.f33683h = i11.m6538a(b34Var);
        v42 v42Var6 = ws0Var.f33677b;
        ya1 ya1Var3 = new ya1((byte) 4);
        ya1Var3.f35069b = v42Var6;
        VarHandle.storeStoreFence();
        ai3 ai3VarM6538a5 = i11.m6538a(ya1Var3);
        v42 v42Var7 = ws0Var.f33676a;
        ai3 ai3Var4 = ws0Var.f33683h;
        v42 v42Var8 = ws0Var.f33679d;
        byte b3 = 10;
        C1283w7 c1283w7 = new C1283w7(b3);
        c1283w7.f33127c = v42Var7;
        c1283w7.f33128d = ai3Var4;
        c1283w7.f33129e = v42Var8;
        c1283w7.f33126b = ai3VarM6538a5;
        VarHandle.storeStoreFence();
        ws0Var.f33684i = i11.m6538a(c1283w7);
        v42 v42Var9 = ws0Var.f33677b;
        ya1 ya1Var4 = new ya1(b2);
        ya1Var4.f35069b = v42Var9;
        VarHandle.storeStoreFence();
        ai3 ai3VarM6538a6 = i11.m6538a(ya1Var4);
        v42 v42Var10 = ws0Var.f33679d;
        b34 b34Var2 = new b34(0 == true ? 1 : 0);
        b34Var2.f15061b = v42Var10;
        b34Var2.f15062c = ai3VarM6538a6;
        VarHandle.storeStoreFence();
        ws0Var.f33685j = i11.m6538a(b34Var2);
        v42 v42VarM11746a2 = v42.m11746a(bi3VarMo4022f);
        ya1 ya1Var5 = new ya1(0 == true ? 1 : 0);
        ya1Var5.f35069b = v42VarM11746a2;
        VarHandle.storeStoreFence();
        ai3 ai3VarM6538a7 = i11.m6538a(ya1Var5);
        v42 v42Var11 = ws0Var.f33676a;
        v42 v42Var12 = ws0Var.f33680e;
        ai3 ai3Var5 = ws0Var.f33683h;
        v42 v42Var13 = ws0Var.f33679d;
        C1122rv c1122rv2 = new C1122rv(b3, 0 == true ? 1 : 0);
        c1122rv2.f29651b = v42Var11;
        c1122rv2.f29652c = v42Var12;
        c1122rv2.f29653d = ai3Var5;
        c1122rv2.f29654e = ai3VarM6538a7;
        c1122rv2.f29655f = v42Var13;
        VarHandle.storeStoreFence();
        ws0Var.f33686k = i11.m6538a(c1122rv2);
        ws0Var.f33687l = i11.m6538a(gh1.f19792a);
        ai3 ai3VarM6538a8 = i11.m6538a(hh1.f20574a);
        ai3 ai3Var6 = ws0Var.f33687l;
        an3 an3Var2 = new an3(b2);
        an3Var2.f14641b = ai3Var6;
        an3Var2.f14642c = ai3VarM6538a8;
        VarHandle.storeStoreFence();
        ws0Var.f33688m = i11.m6538a(an3Var2);
        return ws0Var;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<qf0> getComponents() {
        pf0 pf0VarM9880b = qf0.m9880b(dh1.class);
        pf0VarM9880b.f27571a = LIBRARY_NAME;
        pf0VarM9880b.m9509a(ny0.m8896a(firebaseSessionsComponent));
        pf0VarM9880b.f27576f = new wb1((byte) 14);
        pf0VarM9880b.m9511c();
        qf0 qf0VarM9510b = pf0VarM9880b.m9510b();
        pf0 pf0VarM9880b2 = qf0.m9880b(fh1.class);
        pf0VarM9880b2.f27571a = "fire-sessions-component";
        pf0VarM9880b2.m9509a(ny0.m8896a(appContext));
        pf0VarM9880b2.m9509a(ny0.m8896a(backgroundDispatcher));
        pf0VarM9880b2.m9509a(ny0.m8896a(blockingDispatcher));
        pf0VarM9880b2.m9509a(ny0.m8896a(firebaseApp));
        pf0VarM9880b2.m9509a(ny0.m8896a(firebaseInstallationsApi));
        pf0VarM9880b2.m9509a(new ny0(transportFactory, 1, 1));
        pf0VarM9880b2.f27576f = new wb1((byte) 15);
        return kx5.m7694Y(qf0VarM9510b, pf0VarM9880b2.m9510b(), qf0.m9881c(C0811ju.m7283a(LIBRARY_NAME, "2.1.2"), C0811ju.class));
    }
}
