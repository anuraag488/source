package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import java.lang.invoke.VarHandle;
import p000.ar1;
import p000.az4;
import p000.bt5;
import p000.d76;
import p000.ea6;
import p000.jc6;
import p000.oa6;
import p000.qm6;
import p000.tg6;
import p000.uj6;
import p000.y42;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements uj6 {

    /* JADX INFO: renamed from: a */
    public bt5 f16257a;

    @Override // p000.uj6
    /* JADX INFO: renamed from: a */
    public final boolean mo4063a(int i) {
        return stopSelfResult(i);
    }

    @Override // p000.uj6
    /* JADX INFO: renamed from: b */
    public final void mo4064b(Intent intent) {
        SparseArray sparseArray = az4.f14968a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = az4.f14968a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.uj6
    /* JADX INFO: renamed from: c */
    public final void mo4065c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: d */
    public final bt5 m4067d() {
        bt5 bt5Var = this.f16257a;
        if (bt5Var != null) {
            return bt5Var;
        }
        bt5 bt5Var2 = new bt5((byte) 14);
        bt5Var2.f15596b = this;
        VarHandle.storeStoreFence();
        this.f16257a = bt5Var2;
        return bt5Var2;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        bt5 bt5VarM4067d = m4067d();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if (!"com.google.android.gms.measurement.START".equals(action)) {
            Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
            return null;
        }
        qm6 qm6VarM9920B = qm6.m9920B((Service) bt5VarM4067d.f15596b);
        jc6 jc6Var = new jc6("com.google.android.gms.measurement.internal.IMeasurementService");
        y42.m12854a0(qm6VarM9920B);
        jc6Var.f22167a = qm6VarM9920B;
        jc6Var.f22169c = null;
        VarHandle.storeStoreFence();
        return jc6Var;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) m4067d().f15596b).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) m4067d().f15596b).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        m4067d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        bt5 bt5VarM4067d = m4067d();
        if (intent == null) {
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) bt5VarM4067d.f15596b;
        d76 d76Var = oa6.m9017q(service, null, null).f26514f;
        oa6.m9016l(d76Var);
        String action = intent.getAction();
        d76Var.f16831L.m12506c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        tg6 tg6Var = new tg6((byte) 1);
        tg6Var.f31156c = bt5VarM4067d;
        tg6Var.f31155b = i2;
        tg6Var.f31157d = d76Var;
        tg6Var.f31158e = intent;
        VarHandle.storeStoreFence();
        qm6 qm6VarM9920B = qm6.m9920B(service);
        ea6 ea6VarMo9020c = qm6VarM9920B.mo9020c();
        ar1 ar1Var = new ar1((byte) 28);
        ar1Var.f14798b = qm6VarM9920B;
        ar1Var.f14799c = tg6Var;
        VarHandle.storeStoreFence();
        ea6VarMo9020c.m5033D(ar1Var);
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        m4067d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }
}
