package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import java.lang.invoke.VarHandle;
import java.util.concurrent.Executor;
import p000.C0588dv;
import p000.RunnableC1285w9;
import p000.bg3;
import p000.jp0;
import p000.kv4;
import p000.mp4;
import p000.wo5;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f16210a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        mp4.m8367b(getApplicationContext());
        jp0 jp0VarM4741a = C0588dv.m4741a();
        jp0VarM4741a.m7225O(string);
        jp0VarM4741a.f22483d = bg3.m3589b(i);
        if (string2 != null) {
            jp0VarM4741a.f22481b = Base64.decode(string2, 0);
        }
        wo5 wo5Var = mp4.m8366a().f25118d;
        C0588dv c0588dvM7241j = jp0VarM4741a.m7241j();
        RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9((byte) 15);
        runnableC1285w9.f33164b = this;
        runnableC1285w9.f33165c = jobParameters;
        VarHandle.storeStoreFence();
        Executor executor = (Executor) wo5Var.f33570e;
        kv4 kv4Var = new kv4();
        kv4Var.f23544a = wo5Var;
        kv4Var.f23545b = c0588dvM7241j;
        kv4Var.f23546c = i2;
        kv4Var.f23547d = runnableC1285w9;
        VarHandle.storeStoreFence();
        executor.execute(kv4Var);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
