package p000;

import android.os.IBinder;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vu5 implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ cw5 f32882a;

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        cw5 cw5Var = this.f32882a;
        if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
            Log.i("ServiceConnMgrImpl", "Binder has died: ".concat(cw5Var.f16542c));
        }
        ArrayList arrayList = cw5Var.f16543d;
        synchronized (arrayList) {
            arrayList.clear();
        }
        iu5 iu5Var = new iu5((byte) 1);
        iu5Var.f21811b = cw5Var;
        VarHandle.storeStoreFence();
        cw5Var.m4218b(iu5Var);
    }
}
