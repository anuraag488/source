package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.Objects;
import p000.ar1;
import p000.bt5;
import p000.d76;
import p000.ea6;
import p000.oz5;
import p000.qm6;
import p000.sz5;
import p000.uj6;
import p000.x36;
import p000.y42;
import p000.yj5;
import p000.yn3;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements uj6 {

    /* JADX INFO: renamed from: a */
    public bt5 f16255a;

    @Override // p000.uj6
    /* JADX INFO: renamed from: a */
    public final boolean mo4063a(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.uj6
    /* JADX INFO: renamed from: c */
    public final void mo4065c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    /* JADX INFO: renamed from: d */
    public final bt5 m4066d() {
        bt5 bt5Var = this.f16255a;
        if (bt5Var != null) {
            return bt5Var;
        }
        bt5 bt5Var2 = new bt5((byte) 14);
        bt5Var2.f15596b = this;
        VarHandle.storeStoreFence();
        this.f16255a = bt5Var2;
        return bt5Var2;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) m4066d().f15596b).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) m4066d().f15596b).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        m4066d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        bt5 bt5VarM4066d = m4066d();
        Service service = (Service) bt5VarM4066d.f15596b;
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            y42.m12854a0(string);
            qm6 qm6VarM9920B = qm6.m9920B(service);
            d76 d76VarMo9019b = qm6VarM9920B.mo9019b();
            yj5 yj5Var = qm6VarM9920B.f28602l.f26511c;
            d76VarMo9019b.f16831L.m12505b(string, "Local AppMeasurementJobService called. action");
            yn3 yn3Var = new yn3((byte) 22);
            yn3Var.f35360b = bt5VarM4066d;
            yn3Var.f35361c = d76VarMo9019b;
            yn3Var.f35362d = jobParameters;
            VarHandle.storeStoreFence();
            ea6 ea6VarMo9020c = qm6VarM9920B.mo9020c();
            ar1 ar1Var = new ar1((byte) 28);
            ar1Var.f14798b = qm6VarM9920B;
            ar1Var.f14799c = yn3Var;
            VarHandle.storeStoreFence();
            ea6VarMo9020c.m5033D(ar1Var);
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        y42.m12854a0(string);
        x36 x36VarM12475e = x36.m12475e(service, null);
        oz5 oz5Var = new oz5((byte) 27);
        oz5Var.f27249b = bt5VarM4066d;
        oz5Var.f27250c = jobParameters;
        VarHandle.storeStoreFence();
        x36VarM12475e.getClass();
        x36VarM12475e.m12478c(new sz5(x36VarM12475e, oz5Var));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        m4066d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    @Override // p000.uj6
    /* JADX INFO: renamed from: b */
    public final void mo4064b(Intent intent) {
    }
}
