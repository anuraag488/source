package p000;

import androidx.work.impl.WorkDatabase;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class td3 {

    /* JADX INFO: renamed from: a */
    public WorkDatabase f31089a;

    /* JADX INFO: renamed from: b */
    public qy0 f31090b;

    /* JADX INFO: renamed from: a */
    public final Long m11031a(String str) {
        WorkDatabase workDatabase = this.f31089a;
        C1051py c1051py = new C1051py((byte) 4);
        c1051py.f28076b = str;
        VarHandle.storeStoreFence();
        return (Long) as4.m3231J(workDatabase, true, false, c1051py);
    }

    /* JADX INFO: renamed from: b */
    public final void m11032b(sd3 sd3Var) {
        WorkDatabase workDatabase = this.f31089a;
        na1 na1Var = new na1((byte) 21);
        na1Var.f25595b = this;
        na1Var.f25596c = sd3Var;
        VarHandle.storeStoreFence();
        as4.m3231J(workDatabase, false, true, na1Var);
    }
}
