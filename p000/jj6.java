package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jj6 implements ServiceConnection, InterfaceC1124rx, InterfaceC1161sx {

    /* JADX INFO: renamed from: a */
    public volatile boolean f22342a;

    /* JADX INFO: renamed from: b */
    public volatile ue5 f22343b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ oj6 f22344c;

    @Override // p000.InterfaceC1124rx
    public final void onConnected() {
        ea6 ea6Var = ((oa6) this.f22344c.f36084a).f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.m5040z();
        synchronized (this) {
            try {
                y42.m12854a0(this.f22343b);
                s56 s56Var = (s56) this.f22343b.getService();
                ea6 ea6Var2 = ((oa6) this.f22344c.f36084a).f26515g;
                oa6.m9016l(ea6Var2);
                vi6 vi6Var = new vi6((byte) 1);
                vi6Var.f32654b = s56Var;
                vi6Var.f32655c = this;
                VarHandle.storeStoreFence();
                ea6Var2.m5033D(vi6Var);
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f22343b = null;
                this.f22342a = false;
            }
        }
    }

    @Override // p000.InterfaceC1161sx
    public final void onConnectionFailed(lk0 lk0Var) {
        oj6 oj6Var = this.f22344c;
        ea6 ea6Var = ((oa6) oj6Var.f36084a).f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.m5040z();
        d76 d76Var = ((oa6) oj6Var.f36084a).f26514f;
        if (d76Var == null || !d76Var.f23955f) {
            d76Var = null;
        }
        if (d76Var != null) {
            d76Var.f16831L.m12505b(lk0Var, "Service connection failed");
        }
        synchronized (this) {
            this.f22342a = false;
            this.f22343b = null;
        }
        ea6 ea6Var2 = ((oa6) this.f22344c.f36084a).f26515g;
        oa6.m9016l(ea6Var2);
        oz5 oz5Var = new oz5((byte) 26);
        oz5Var.f27249b = lk0Var;
        oz5Var.f27250c = this;
        VarHandle.storeStoreFence();
        ea6Var2.m5033D(oz5Var);
    }

    @Override // p000.InterfaceC1124rx
    public final void onConnectionSuspended(int i) {
        oa6 oa6Var = (oa6) this.f22344c.f36084a;
        ea6 ea6Var = oa6Var.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.m5040z();
        d76 d76Var = oa6Var.f26514f;
        oa6.m9016l(d76Var);
        d76Var.f16842q.m12504a("Service connection suspended");
        ea6 ea6Var2 = oa6Var.f26515g;
        oa6.m9016l(ea6Var2);
        RunnableC1029pc runnableC1029pc = new RunnableC1029pc((byte) 28);
        runnableC1029pc.f27515b = this;
        VarHandle.storeStoreFence();
        ea6Var2.m5033D(runnableC1029pc);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ea6 ea6Var = ((oa6) this.f22344c.f36084a).f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.m5040z();
        synchronized (this) {
            byte b = 0;
            if (iBinder == null) {
                this.f22342a = false;
                d76 d76Var = ((oa6) this.f22344c.f36084a).f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16835j.m12504a("Service connected with null binder");
                return;
            }
            s56 f56Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    f56Var = iInterfaceQueryLocalInterface instanceof s56 ? (s56) iInterfaceQueryLocalInterface : new f56(iBinder);
                    d76 d76Var2 = ((oa6) this.f22344c.f36084a).f26514f;
                    oa6.m9016l(d76Var2);
                    d76Var2.f16831L.m12504a("Bound to IMeasurementService interface");
                } else {
                    d76 d76Var3 = ((oa6) this.f22344c.f36084a).f26514f;
                    oa6.m9016l(d76Var3);
                    d76Var3.f16835j.m12505b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                d76 d76Var4 = ((oa6) this.f22344c.f36084a).f26514f;
                oa6.m9016l(d76Var4);
                d76Var4.f16835j.m12504a("Service connect failed to get IMeasurementService");
            }
            if (f56Var == null) {
                this.f22342a = false;
                try {
                    ar3 ar3VarM3128s = ar3.m3128s();
                    oj6 oj6Var = this.f22344c;
                    ar3VarM3128s.m3131B(((oa6) oj6Var.f36084a).f26509a, oj6Var.f26788g);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                ea6 ea6Var2 = ((oa6) this.f22344c.f36084a).f26515g;
                oa6.m9016l(ea6Var2);
                vi6 vi6Var = new vi6(b);
                vi6Var.f32654b = f56Var;
                vi6Var.f32655c = this;
                VarHandle.storeStoreFence();
                ea6Var2.m5033D(vi6Var);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        oa6 oa6Var = (oa6) this.f22344c.f36084a;
        ea6 ea6Var = oa6Var.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.m5040z();
        d76 d76Var = oa6Var.f26514f;
        oa6.m9016l(d76Var);
        d76Var.f16842q.m12504a("Service disconnected");
        ea6 ea6Var2 = oa6Var.f26515g;
        oa6.m9016l(ea6Var2);
        ar1 ar1Var = new ar1((byte) 27);
        ar1Var.f14798b = componentName;
        ar1Var.f14799c = this;
        VarHandle.storeStoreFence();
        ea6Var2.m5033D(ar1Var);
    }
}
