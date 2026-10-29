package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p000.C0811ju;
import p000.InterfaceC0703gw;
import p000.cw0;
import p000.ew0;
import p000.fx0;
import p000.hg1;
import p000.ni3;
import p000.nm0;
import p000.ny0;
import p000.pe2;
import p000.pf0;
import p000.qf0;
import p000.sc6;
import p000.wb1;
import p000.wv1;
import p000.xv1;
import p000.yv1;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX INFO: renamed from: a */
    public static String m4071a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        pf0 pf0VarM9880b = qf0.m9880b(fx0.class);
        pf0VarM9880b.m9509a(new ny0(C0811ju.class, 2, 0));
        pf0VarM9880b.f27576f = new nm0((byte) 9);
        arrayList.add(pf0VarM9880b.m9510b());
        ni3 ni3Var = new ni3(InterfaceC0703gw.class, Executor.class);
        pf0 pf0Var = new pf0(ew0.class, xv1.class, yv1.class);
        pf0Var.m9509a(ny0.m8897b(Context.class));
        pf0Var.m9509a(ny0.m8897b(hg1.class));
        pf0Var.m9509a(new ny0(wv1.class, 2, 0));
        pf0Var.m9509a(new ny0(fx0.class, 1, 1));
        pf0Var.m9509a(new ny0(ni3Var, 1, 0));
        cw0 cw0Var = new cw0((byte) 0);
        cw0Var.f16523b = ni3Var;
        VarHandle.storeStoreFence();
        pf0Var.f27576f = cw0Var;
        arrayList.add(pf0Var.m9510b());
        arrayList.add(qf0.m9881c(C0811ju.m7283a("fire-android", String.valueOf(Build.VERSION.SDK_INT)), C0811ju.class));
        arrayList.add(qf0.m9881c(C0811ju.m7283a("fire-core", "23.0.0"), C0811ju.class));
        arrayList.add(qf0.m9881c(C0811ju.m7283a("device-name", m4071a(Build.PRODUCT)), C0811ju.class));
        arrayList.add(qf0.m9881c(C0811ju.m7283a("device-model", m4071a(Build.DEVICE)), C0811ju.class));
        arrayList.add(qf0.m9881c(C0811ju.m7283a("device-brand", m4071a(Build.BRAND)), C0811ju.class));
        arrayList.add(sc6.m10632D("android-target-sdk", new wb1((byte) 5)));
        arrayList.add(sc6.m10632D("android-min-sdk", new wb1((byte) 6)));
        arrayList.add(sc6.m10632D("android-platform", new wb1((byte) 7)));
        arrayList.add(sc6.m10632D("android-installer", new wb1((byte) 8)));
        try {
            int i = pe2.f27563b;
            str = "2.4.21";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(qf0.m9881c(C0811ju.m7283a("kotlin", str), C0811ju.class));
        }
        return arrayList;
    }
}
