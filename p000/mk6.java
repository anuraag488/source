package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mk6 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public HashMap f24985a;

    /* JADX INFO: renamed from: b */
    public byte f24986b;

    /* JADX INFO: renamed from: c */
    public boolean f24987c;

    /* JADX INFO: renamed from: d */
    public IBinder f24988d;

    /* JADX INFO: renamed from: e */
    public bj6 f24989e;

    /* JADX INFO: renamed from: f */
    public ComponentName f24990f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ tn6 f24991g;

    /* JADX INFO: renamed from: a */
    public final lk0 m8339a(String str, Executor executor) {
        try {
            Intent intentM4103a = cp5.m4103a(this.f24991g.f31280b, this.f24989e);
            this.f24986b = (byte) 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            StrictMode.setVmPolicy(kv5.m7639a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            try {
                tn6 tn6Var = this.f24991g;
                ar3 ar3Var = tn6Var.f31282d;
                Context context = tn6Var.f31280b;
                bj6 bj6Var = this.f24989e;
                boolean zM3134E = ar3Var.m3134E(context, str, intentM4103a, this, 4225, executor);
                this.f24987c = zM3134E;
                if (zM3134E) {
                    tn6Var.f31281c.sendMessageDelayed(tn6Var.f31281c.obtainMessage(1, bj6Var), tn6Var.f31284f);
                    return lk0.f24095i;
                }
                this.f24986b = (byte) 2;
                try {
                    tn6Var.f31282d.m3131B(tn6Var.f31280b, this);
                } catch (IllegalArgumentException unused) {
                }
                return new lk0(16, null, null);
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (ho5 e) {
            return e.f20760a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        tn6 tn6Var = this.f24991g;
        synchronized (tn6Var.f31279a) {
            try {
                tn6Var.f31281c.removeMessages(1, this.f24989e);
                this.f24988d = iBinder;
                this.f24990f = componentName;
                Iterator it = this.f24985a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f24986b = (byte) 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        tn6 tn6Var = this.f24991g;
        synchronized (tn6Var.f31279a) {
            try {
                tn6Var.f31281c.removeMessages(1, this.f24989e);
                this.f24988d = null;
                this.f24990f = componentName;
                Iterator it = this.f24985a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f24986b = (byte) 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
