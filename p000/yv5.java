package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yv5 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ cw5 f35554a;

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
            Log.i("ServiceConnMgrImpl", "onBindingDied: ".concat(String.valueOf(componentName)));
        }
        cw5 cw5Var = this.f35554a;
        tv5 tv5Var = new tv5((byte) 2);
        tv5Var.f31475b = this;
        VarHandle.storeStoreFence();
        cw5Var.m4218b(tv5Var);
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
            Log.i("ServiceConnMgrImpl", "onNullBinding: ".concat(String.valueOf(componentName)));
        }
        cw5 cw5Var = this.f35554a;
        tv5 tv5Var = new tv5((byte) 0);
        tv5Var.f31475b = this;
        VarHandle.storeStoreFence();
        cw5Var.m4218b(tv5Var);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
            Log.i("ServiceConnMgrImpl", "onServiceConnected: ".concat(String.valueOf(componentName)));
        }
        cw5 cw5Var = this.f35554a;
        oz5 oz5Var = new oz5((byte) 14);
        oz5Var.f27249b = this;
        oz5Var.f27250c = iBinder;
        VarHandle.storeStoreFence();
        cw5Var.m4218b(oz5Var);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
            Log.i("ServiceConnMgrImpl", "onServiceDisconnected: ".concat(String.valueOf(componentName)));
        }
        cw5 cw5Var = this.f35554a;
        tv5 tv5Var = new tv5((byte) 1);
        tv5Var.f31475b = this;
        VarHandle.storeStoreFence();
        cw5Var.m4218b(tv5Var);
    }
}
