package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fl6 extends rl6 {

    /* JADX INFO: renamed from: h */
    public AlarmManager f19105h;

    /* JADX INFO: renamed from: i */
    public kk6 f19106i;

    /* JADX INFO: renamed from: j */
    public Integer f19107j;

    /* JADX INFO: renamed from: A */
    public final int m5734A() {
        Integer numValueOf = this.f19107j;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf("measurement".concat(String.valueOf(((oa6) this.f36084a).f26509a.getPackageName())).hashCode());
            this.f19107j = numValueOf;
        }
        return numValueOf.intValue();
    }

    @Override // p000.rl6
    /* JADX INFO: renamed from: x */
    public final void mo3209x() {
        AlarmManager alarmManager = this.f19105h;
        if (alarmManager != null) {
            Context context = ((oa6) this.f36084a).f26509a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 33554432));
        }
        m5736z();
    }

    /* JADX INFO: renamed from: y */
    public final void m5735y() {
        m10368u();
        oa6 oa6Var = (oa6) this.f36084a;
        d76 d76Var = oa6Var.f26514f;
        oa6.m9016l(d76Var);
        d76Var.f16831L.m12504a("Unscheduling upload");
        AlarmManager alarmManager = this.f19105h;
        if (alarmManager != null) {
            Context context = oa6Var.f26509a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 33554432));
        }
        kk6 kk6Var = this.f19106i;
        if (kk6Var == null) {
            kk6 kk6Var2 = new kk6(this, this.f19870f.f28602l, (byte) 1);
            this.f19106i = kk6Var2;
            kk6Var = kk6Var2;
        }
        kk6Var.m6924c();
        m5736z();
    }

    /* JADX INFO: renamed from: z */
    public final void m5736z() {
        JobScheduler jobScheduler = (JobScheduler) ((oa6) this.f36084a).f26509a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m5734A());
        }
    }
}
