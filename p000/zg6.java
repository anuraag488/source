package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zg6 extends q56 {

    /* JADX INFO: renamed from: g */
    public JobScheduler f36078g;

    @Override // p000.q56
    /* JADX INFO: renamed from: x */
    public final boolean mo8203x() {
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final void m13551y(long j) {
        oa6 oa6Var = (oa6) this.f36084a;
        m9741u();
        mo5038t();
        JobScheduler jobScheduler = this.f36078g;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(oa6Var.f26509a.getPackageName())).hashCode()) != null) {
            d76 d76Var = oa6Var.f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16831L.m12504a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int iM13552z = m13552z();
        if (iM13552z != 2) {
            d76 d76Var2 = oa6Var.f26514f;
            oa6.m9016l(d76Var2);
            d76Var2.f16831L.m12505b(sk5.m10851q(iM13552z), "[sgtm] Not eligible for Scion upload");
            return;
        }
        d76 d76Var3 = oa6Var.f26514f;
        oa6.m9016l(d76Var3);
        d76Var3.f16831L.m12505b(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(oa6Var.f26509a.getPackageName())).hashCode(), new ComponentName(oa6Var.f26509a, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.f36078g;
        y42.m12854a0(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        d76 d76Var4 = oa6Var.f26514f;
        oa6.m9016l(d76Var4);
        d76Var4.f16831L.m12505b(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    /* JADX INFO: renamed from: z */
    public final int m13552z() {
        oa6 oa6Var = (oa6) this.f36084a;
        m9741u();
        mo5038t();
        if (this.f36078g == null) {
            return 7;
        }
        Boolean boolM9227G = oa6Var.f26512d.m9227G("google_analytics_sgtm_upload_enabled");
        if (!(boolM9227G == null ? false : boolM9227G.booleanValue())) {
            return 8;
        }
        if (oa6Var.m9029p().f17857n < 119000) {
            return 6;
        }
        if (dn6.m4567N(oa6Var.f26509a)) {
            return !oa6Var.m9027n().m9133B() ? 5 : 2;
        }
        return 3;
    }
}
