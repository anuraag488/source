package p000;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.lang.invoke.VarHandle;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qo1 implements ov1, av3, py4 {

    /* JADX INFO: renamed from: a */
    public pn1 f28634a;

    /* JADX INFO: renamed from: b */
    public oy4 f28635b;

    /* JADX INFO: renamed from: c */
    public ln1 f28636c;

    /* JADX INFO: renamed from: d */
    public ok2 f28637d;

    /* JADX INFO: renamed from: e */
    public pq3 f28638e;

    /* JADX INFO: renamed from: a */
    public final void m9993a() {
        if (this.f28637d == null) {
            this.f28637d = new ok2(this, true);
            g32 g32Var = new g32((byte) 20);
            g32Var.f19558b = this;
            VarHandle.storeStoreFence();
            zu3 zu3Var = new zu3();
            zu3Var.f36384a = this;
            zu3Var.f36385b = g32Var;
            zu3Var.f36386c = new r50((byte) 19);
            zu3Var.f36387d = new LinkedHashMap();
            zu3Var.f36391h = true;
            VarHandle.storeStoreFence();
            pq3 pq3Var = new pq3((byte) 1);
            pq3Var.f27896b = zu3Var;
            yu3 yu3Var = new yu3();
            yu3Var.f35540a = zu3Var;
            VarHandle.storeStoreFence();
            pq3Var.f27897c = yu3Var;
            VarHandle.storeStoreFence();
            this.f28638e = pq3Var;
            pq3Var.m9607e();
            this.f28636c.run();
        }
    }

    @Override // p000.ov1
    /* JADX INFO: renamed from: b */
    public final gv2 mo2975b() {
        Application application;
        pn1 pn1Var = this.f28634a;
        Context applicationContext = pn1Var.m9585v().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        gv2 gv2Var = new gv2(0);
        if (application != null) {
            gv2Var.m6174a(ly4.f24472d, application);
        }
        gv2Var.m6174a(tu3.f31456a, pn1Var);
        gv2Var.m6174a(tu3.f31457b, this);
        Bundle bundle = pn1Var.f27783f;
        if (bundle != null) {
            gv2Var.m6174a(tu3.f31458c, bundle);
        }
        return gv2Var;
    }

    @Override // p000.py4
    /* JADX INFO: renamed from: c */
    public final oy4 mo2976c() {
        m9993a();
        return this.f28635b;
    }

    @Override // p000.lk2
    public final gk2 getLifecycle() {
        m9993a();
        return this.f28637d;
    }

    @Override // p000.av3
    public final yu3 getSavedStateRegistry() {
        m9993a();
        return (yu3) this.f28638e.f27897c;
    }
}
