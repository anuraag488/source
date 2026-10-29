package p000;

import essentials.app.EsActivity;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ia1 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21198a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ EsActivity f21199b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ xz4 f21200c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f21201d;

    public /* synthetic */ ia1(byte b) {
        this.f21198a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        switch (this.f21198a) {
            case 0:
                xz4 xz4Var = this.f21200c;
                EsActivity esActivity = this.f21199b;
                int i = this.f21201d;
                int i2 = EsActivity.f18447A;
                ba3.m3533a();
                xz4Var.f34748c.setValue(esActivity);
                ka1 ka1Var = new ka1((byte) 0);
                ka1Var.f23022b = xz4Var;
                ka1Var.f23023c = i;
                VarHandle.storeStoreFence();
                return ka1Var;
            default:
                EsActivity esActivity2 = this.f21199b;
                xz4 xz4Var2 = this.f21200c;
                int i3 = this.f21201d;
                int i4 = EsActivity.f18447A;
                esActivity2.setTurnScreenOn(true);
                esActivity2.setShowWhenLocked(true);
                ka1 ka1Var2 = new ka1((byte) 1);
                ka1Var2.f23022b = xz4Var2;
                ka1Var2.f23023c = i3;
                VarHandle.storeStoreFence();
                return ka1Var2;
        }
    }
}
