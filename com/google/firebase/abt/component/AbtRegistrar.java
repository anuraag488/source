package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p000.C0670g;
import p000.C0811ju;
import p000.C1241v2;
import p000.InterfaceC0828ka;
import p000.bi3;
import p000.cg0;
import p000.ny0;
import p000.pf0;
import p000.qf0;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static C1241v2 lambda$getComponents$0(cg0 cg0Var) {
        bi3 bi3VarMo4020d = cg0Var.mo4020d(InterfaceC0828ka.class);
        C1241v2 c1241v2 = new C1241v2();
        c1241v2.f32322a = new HashMap();
        c1241v2.f32323b = bi3VarMo4020d;
        VarHandle.storeStoreFence();
        return c1241v2;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<qf0> getComponents() {
        pf0 pf0VarM9880b = qf0.m9880b(C1241v2.class);
        pf0VarM9880b.f27571a = LIBRARY_NAME;
        pf0VarM9880b.m9509a(ny0.m8897b(Context.class));
        pf0VarM9880b.m9509a(new ny0(InterfaceC0828ka.class, 0, 1));
        pf0VarM9880b.f27576f = new C0670g((byte) 1);
        return Arrays.asList(pf0VarM9880b.m9510b(), qf0.m9881c(C0811ju.m7283a(LIBRARY_NAME, "24.0.0"), C0811ju.class));
    }
}
