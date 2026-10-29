package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p000.C0811ju;
import p000.cg0;
import p000.ds3;
import p000.ip4;
import p000.kp4;
import p000.mp4;
import p000.ni3;
import p000.ny0;
import p000.pf0;
import p000.qf0;
import p000.v50;
import p000.wj2;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ kp4 lambda$getComponents$0(cg0 cg0Var) {
        mp4.m8367b((Context) cg0Var.mo4017a(Context.class));
        return mp4.m8366a().m8368c(v50.f32412f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ kp4 lambda$getComponents$1(cg0 cg0Var) {
        mp4.m8367b((Context) cg0Var.mo4017a(Context.class));
        return mp4.m8366a().m8368c(v50.f32412f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ kp4 lambda$getComponents$2(cg0 cg0Var) {
        mp4.m8367b((Context) cg0Var.mo4017a(Context.class));
        return mp4.m8366a().m8368c(v50.f32411e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<qf0> getComponents() {
        pf0 pf0VarM9880b = qf0.m9880b(kp4.class);
        pf0VarM9880b.f27571a = LIBRARY_NAME;
        pf0VarM9880b.m9509a(ny0.m8897b(Context.class));
        pf0VarM9880b.f27576f = new ds3((byte) 23);
        qf0 qf0VarM9510b = pf0VarM9880b.m9510b();
        pf0 pf0VarM9879a = qf0.m9879a(new ni3(wj2.class, kp4.class));
        pf0VarM9879a.m9509a(ny0.m8897b(Context.class));
        pf0VarM9879a.f27576f = new ds3((byte) 24);
        qf0 qf0VarM9510b2 = pf0VarM9879a.m9510b();
        pf0 pf0VarM9879a2 = qf0.m9879a(new ni3(ip4.class, kp4.class));
        pf0VarM9879a2.m9509a(ny0.m8897b(Context.class));
        pf0VarM9879a2.f27576f = new ds3((byte) 25);
        return Arrays.asList(qf0VarM9510b, qf0VarM9510b2, pf0VarM9879a2.m9510b(), qf0.m9881c(C0811ju.m7283a(LIBRARY_NAME, "19.0.0"), C0811ju.class));
    }
}
