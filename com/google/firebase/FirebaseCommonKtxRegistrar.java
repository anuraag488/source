package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import p000.InterfaceC0703gw;
import p000.gb5;
import p000.ia5;
import p000.ig1;
import p000.kx5;
import p000.ni3;
import p000.ny0;
import p000.pf0;
import p000.qf0;
import p000.r00;
import p000.so0;
import p000.tt4;
import p000.vk2;
import p000.wv1;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<qf0> getComponents() {
        pf0 pf0VarM9879a = qf0.m9879a(new ni3(InterfaceC0703gw.class, so0.class));
        pf0VarM9879a.m9509a(new ny0(new ni3(InterfaceC0703gw.class, Executor.class), 1, 0));
        pf0VarM9879a.f27576f = ia5.f21221l;
        qf0 qf0VarM9510b = pf0VarM9879a.m9510b();
        pf0 pf0VarM9879a2 = qf0.m9879a(new ni3(vk2.class, so0.class));
        pf0VarM9879a2.m9509a(new ny0(new ni3(vk2.class, Executor.class), 1, 0));
        pf0VarM9879a2.f27576f = gb5.f19714e;
        qf0 qf0VarM9510b2 = pf0VarM9879a2.m9510b();
        pf0 pf0VarM9879a3 = qf0.m9879a(new ni3(r00.class, so0.class));
        pf0VarM9879a3.m9509a(new ny0(new ni3(r00.class, Executor.class), 1, 0));
        pf0VarM9879a3.f27576f = ig1.f21397u;
        qf0 qf0VarM9510b3 = pf0VarM9879a3.m9510b();
        pf0 pf0VarM9879a4 = qf0.m9879a(new ni3(tt4.class, so0.class));
        pf0VarM9879a4.m9509a(new ny0(new ni3(tt4.class, Executor.class), 1, 0));
        pf0VarM9879a4.f27576f = wv1.f33765h;
        return kx5.m7694Y(qf0VarM9510b, qf0VarM9510b2, qf0VarM9510b3, pf0VarM9879a4.m9510b());
    }
}
