package p000;

import android.os.Bundle;
import java.lang.invoke.VarHandle;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pu3 implements lu3, av3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ mu3 f28010a;

    /* JADX INFO: renamed from: b */
    public ok2 f28011b;

    /* JADX INFO: renamed from: c */
    public pq3 f28012c;

    @Override // p000.lu3
    /* JADX INFO: renamed from: a */
    public final ku3 mo8109a(String str, wp1 wp1Var) {
        return this.f28010a.mo8109a(str, wp1Var);
    }

    @Override // p000.lu3
    /* JADX INFO: renamed from: b */
    public final boolean mo8110b(Object obj) {
        return this.f28010a.mo8110b(obj);
    }

    @Override // p000.lu3
    /* JADX INFO: renamed from: c */
    public final Map mo8111c() {
        return this.f28010a.mo8111c();
    }

    @Override // p000.lu3
    /* JADX INFO: renamed from: d */
    public final Object mo8112d(String str) {
        return this.f28010a.mo8112d(str);
    }

    /* JADX INFO: renamed from: e */
    public final pq3 m9677e(Bundle bundle) {
        pq3 pq3Var = this.f28012c;
        if (pq3Var != null) {
            return pq3Var;
        }
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
        pq3 pq3Var2 = new pq3((byte) 1);
        pq3Var2.f27896b = zu3Var;
        yu3 yu3Var = new yu3();
        yu3Var.f35540a = zu3Var;
        VarHandle.storeStoreFence();
        pq3Var2.f27897c = yu3Var;
        VarHandle.storeStoreFence();
        this.f28012c = pq3Var2;
        pq3Var2.m9608f(bundle);
        return pq3Var2;
    }

    @Override // p000.lk2
    public final gk2 getLifecycle() {
        ok2 ok2Var = this.f28011b;
        if (ok2Var != null) {
            return ok2Var;
        }
        ok2 ok2Var2 = new ok2(this, false);
        this.f28011b = ok2Var2;
        return ok2Var2;
    }

    @Override // p000.av3
    public final yu3 getSavedStateRegistry() {
        return (yu3) m9677e(null).f27897c;
    }
}
