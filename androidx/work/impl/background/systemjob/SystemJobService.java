package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Looper;
import android.os.PersistableBundle;
import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p000.C1077qn;
import p000.e25;
import p000.g25;
import p000.h50;
import p000.jg3;
import p000.pq3;
import p000.qb4;
import p000.rb1;
import p000.wn2;
import p000.ys0;
import p000.zi4;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements rb1 {

    /* JADX INFO: renamed from: e */
    public static final String f14704e = wn2.m12327g("SystemJobService");

    /* JADX INFO: renamed from: a */
    public g25 f14705a;

    /* JADX INFO: renamed from: b */
    public final HashMap f14706b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ys0 f14707c;

    /* JADX INFO: renamed from: d */
    public pq3 f14708d;

    public SystemJobService() {
        ys0 ys0Var = new ys0();
        ys0Var.f35491a = new LinkedHashMap();
        VarHandle.storeStoreFence();
        this.f14707c = ys0Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m3082a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        C1077qn.m9989o(zi4.m13621u("Cannot invoke ", str, " on a background thread"));
    }

    /* JADX INFO: renamed from: b */
    public static e25 m3083b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new e25(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p000.rb1
    /* JADX INFO: renamed from: d */
    public final void mo3084d(e25 e25Var, boolean z) {
        m3082a("onExecuted");
        JobParameters jobParameters = (JobParameters) this.f14706b.remove(e25Var);
        this.f14707c.m13232b(e25Var);
        if (jobParameters != null) {
            wn2.m12326e().m12328b(f14704e, e25Var.f17648a + " executed on JobScheduler");
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            g25 g25VarM5888b = g25.m5888b(getApplicationContext());
            this.f14705a = g25VarM5888b;
            jg3 jg3Var = g25VarM5888b.f19517f;
            this.f14708d = new pq3(jg3Var, g25VarM5888b.f19515d);
            jg3Var.m7104a(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            wn2.m12326e().m12332h(f14704e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        g25 g25Var = this.f14705a;
        if (g25Var != null) {
            jg3 jg3Var = g25Var.f19517f;
            synchronized (jg3Var.f22256j) {
                jg3Var.f22255i.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        m3082a("onStartJob");
        g25 g25Var = this.f14705a;
        String str = f14704e;
        if (g25Var == null) {
            wn2.m12326e().m12328b(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        e25 e25VarM3083b = m3083b(jobParameters);
        if (e25VarM3083b == null) {
            wn2.m12326e().m12329c(str, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.f14706b;
        if (map.containsKey(e25VarM3083b)) {
            wn2.m12326e().m12328b(str, "Job is already being executed by SystemJobService: " + e25VarM3083b);
            return false;
        }
        wn2.m12326e().m12328b(str, "onStartJob for " + e25VarM3083b);
        map.put(e25VarM3083b, jobParameters);
        h50 h50Var = new h50((byte) 23);
        if (jobParameters.getTriggeredContentUris() != null) {
            Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        jobParameters.getNetwork();
        this.f14708d.m9614m(this.f14707c.m13234d(e25VarM3083b), h50Var);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        m3082a("onStopJob");
        if (this.f14705a == null) {
            wn2.m12326e().m12328b(f14704e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        e25 e25VarM3083b = m3083b(jobParameters);
        if (e25VarM3083b == null) {
            wn2.m12326e().m12329c(f14704e, "WorkSpec id not found!");
            return false;
        }
        wn2.m12326e().m12328b(f14704e, "onStopJob for " + e25VarM3083b);
        this.f14706b.remove(e25VarM3083b);
        qb4 qb4VarM13232b = this.f14707c.m13232b(e25VarM3083b);
        if (qb4VarM13232b != null) {
            int stopReason = jobParameters.getStopReason();
            switch (stopReason) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    stopReason = -512;
                    break;
            }
            this.f14708d.m9615n(qb4VarM13232b, stopReason);
        }
        jg3 jg3Var = this.f14705a.f19517f;
        String str = e25VarM3083b.f17648a;
        synchronized (jg3Var.f22256j) {
            zContains = jg3Var.f22254h.contains(str);
        }
        return !zContains;
    }
}
