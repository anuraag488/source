package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l82 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public m60 f23844a;

    /* JADX INFO: renamed from: b */
    public m82 f23845b;

    /* JADX INFO: renamed from: c */
    public Context f23846c;

    /* JADX INFO: renamed from: a */
    public final void m7844a(Exception exc) {
        if (this.f23845b != null) {
            Log.e("JavaScriptSandbox", "Sandbox has died", exc);
            this.f23845b.m8225k();
        } else {
            this.f23846c.unbindService(this);
            m82.f24723j.set(true);
        }
        m60 m60Var = this.f23844a;
        if (m60Var != null) {
            m60Var.m8199b(exc);
        }
        this.f23844a = null;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        m7844a(new RuntimeException("JavaScriptSandbox internal error: onBindingDied()"));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        m7844a(new RuntimeException("JavaScriptSandbox internal error: onNullBinding()"));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        wz1 wz1Var;
        if (this.f23844a == null) {
            return;
        }
        int i = vz1.f32982a;
        if (iBinder == null) {
            wz1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(wz1.f33872kp);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof wz1)) {
                uz1 uz1Var = new uz1();
                uz1Var.f32265a = iBinder;
                wz1Var = uz1Var;
            } else {
                wz1Var = (wz1) iInterfaceQueryLocalInterface;
            }
        }
        try {
            m82 m82Var = new m82(this.f23846c, this, wz1Var);
            this.f23845b = m82Var;
            this.f23844a.m8198a(m82Var);
            this.f23844a = null;
        } catch (DeadObjectException e) {
            m7844a(e);
        } catch (RemoteException | RuntimeException e2) {
            m7844a(e2);
            if (!(e2 instanceof RuntimeException)) {
                throw new RuntimeException(e2);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        m7844a(new RuntimeException("JavaScriptSandbox internal error: onServiceDisconnected()"));
    }
}
