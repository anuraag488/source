package p000;

import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cn1 implements Runnable {

    /* JADX INFO: renamed from: e */
    public static final String f16136e = wn2.m12327g("ForceStopRunnable");

    /* JADX INFO: renamed from: f */
    public static final long f16137f = 315360000000L;

    /* JADX INFO: renamed from: a */
    public Context f16138a;

    /* JADX INFO: renamed from: b */
    public g25 f16139b;

    /* JADX INFO: renamed from: c */
    public wd3 f16140c;

    /* JADX INFO: renamed from: d */
    public int f16141d;

    /* JADX INFO: renamed from: a */
    public final void m4049a() throws Throwable {
        boolean z;
        wd3 wd3Var = this.f16140c;
        Context context = this.f16138a;
        g25 g25Var = this.f16139b;
        ik0 ik0Var = g25Var.f19513b;
        wd3 wd3Var2 = g25Var.f19518g;
        WorkDatabase workDatabase = g25Var.f19514c;
        String str = og4.f26683f;
        JobScheduler jobSchedulerM12529a = x82.m12529a(context);
        ArrayList arrayListM9060d = og4.m9060d(context, jobSchedulerM12529a);
        WorkDatabase workDatabase2 = workDatabase.mo3076s().f23111a;
        r54 r54Var = new r54((byte) 9);
        VarHandle.storeStoreFence();
        byte b = 0;
        List list = (List) as4.m3231J(workDatabase2, true, false, r54Var);
        HashSet hashSet = new HashSet(arrayListM9060d != null ? arrayListM9060d.size() : 0);
        if (arrayListM9060d != null && !arrayListM9060d.isEmpty()) {
            int size = arrayListM9060d.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListM9060d.get(i);
                i++;
                JobInfo jobInfo = (JobInfo) obj;
                e25 e25VarM9061f = og4.m9061f(jobInfo);
                if (e25VarM9061f != null) {
                    hashSet.add(e25VarM9061f.f17648a);
                } else {
                    og4.m9059b(jobSchedulerM12529a, jobInfo.getId());
                }
            }
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    wn2.m12326e().m12328b(og4.f26683f, "Reconciling jobs");
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            workDatabase.m3059b();
            try {
                u25 u25VarMo3080w = workDatabase.mo3080w();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    u25VarMo3080w.m11211c((String) it2.next(), -1L);
                }
                workDatabase.m3075r();
                workDatabase.m3070m();
            } catch (Throwable th) {
                workDatabase.m3070m();
                throw th;
            }
        }
        u25 u25VarMo3080w2 = workDatabase.mo3080w();
        m25 m25VarMo3079v = workDatabase.mo3079v();
        workDatabase.m3059b();
        try {
            WorkDatabase workDatabase3 = u25VarMo3080w2.f31629a;
            t25 t25Var = new t25(b);
            VarHandle.storeStoreFence();
            List<q25> list2 = (List) as4.m3231J(workDatabase3, true, false, t25Var);
            boolean z2 = (list2 == null || list2.isEmpty()) ? false : true;
            if (z2) {
                for (q25 q25Var : list2) {
                    f25 f25Var = f25.f18681a;
                    String str2 = q25Var.f28162a;
                    u25VarMo3080w2.m11214f(f25Var, str2);
                    u25VarMo3080w2.m11215g(-512, str2);
                    u25VarMo3080w2.m11211c(str2, -1L);
                }
            }
            WorkDatabase workDatabase4 = m25VarMo3079v.f24599a;
            C1051py c1051py = new C1051py((byte) 11);
            c1051py.f28076b = "DELETE FROM WorkProgress";
            VarHandle.storeStoreFence();
            as4.m3231J(workDatabase4, false, true, c1051py);
            workDatabase.m3075r();
            workDatabase.m3070m();
            boolean z3 = z2 || z;
            Long lM11031a = ((WorkDatabase) wd3Var2.f33259b).mo3072o().m11031a("reschedule_needed");
            String str3 = f16136e;
            if (lM11031a != null && lM11031a.longValue() == 1) {
                wn2.m12326e().m12328b(str3, "Rescheduling Workers.");
                g25Var.m5892e();
                wd3Var2.getClass();
                ((WorkDatabase) wd3Var2.f33259b).mo3072o().m11032b(new sd3("reschedule_needed", 0L));
                return;
            }
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, 570425344);
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long lM11031a2 = ((WorkDatabase) wd3Var.f33259b).mo3072o().m11031a("last_force_stop_ms");
                    long jLongValue = lM11031a2 != null ? lM11031a2.longValue() : 0L;
                    for (int i2 = 0; i2 < historicalProcessExitReasons.size(); i2++) {
                        ApplicationExitInfo applicationExitInfo = historicalProcessExitReasons.get(i2);
                        if (applicationExitInfo.getReason() == 10 && applicationExitInfo.getTimestamp() >= jLongValue) {
                            wn2.m12326e().m12328b(str3, "Application was force-stopped, rescheduling.");
                            g25Var.m5892e();
                            ik0Var.f21506c.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            wd3Var.getClass();
                            ((WorkDatabase) wd3Var.f33259b).mo3072o().m11032b(new sd3("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis)));
                            return;
                        }
                    }
                }
                if (z3) {
                    wn2.m12326e().m12328b(str3, "Found unfinished work, scheduling it.");
                    ew3.m5411b(ik0Var, workDatabase, g25Var.f19516e);
                }
            } catch (IllegalArgumentException | SecurityException e) {
                wn2.m12326e().m12333i(str3, "Ignoring exception", e);
            }
        } catch (Throwable th2) {
            workDatabase.m3070m();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4050b() {
        this.f16139b.f19513b.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f16136e;
        if (zIsEmpty) {
            wn2.m12326e().m12328b(str, "The default process name was not specified.");
            return true;
        }
        Context context = this.f16138a;
        int i = ig3.f21407a;
        boolean zEquals = Application.getProcessName().equals(context.getApplicationInfo().processName);
        wn2.m12326e().m12328b(str, "Is default app process = " + zEquals);
        return zEquals;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f16138a;
        g25 g25Var = this.f16139b;
        ik0 ik0Var = g25Var.f19513b;
        try {
            if (!m4050b()) {
                g25Var.m5891d();
                return;
            }
            boolean zM7908Q = lb5.m7908Q(context);
            String str = f16136e;
            if (!zM7908Q) {
                wn2.m12326e().m12329c(str, "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialize WorkManager from directBootAware components. See https://developer.android.com/training/articles/direct-boot");
                IllegalStateException illegalStateException = new IllegalStateException("WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialize WorkManager from directBootAware components. See https://developer.android.com/training/articles/direct-boot");
                ik0Var.getClass();
                throw illegalStateException;
            }
            while (true) {
                try {
                    C0006a5.m47B(context);
                    wn2.m12326e().m12328b(str, "Performing cleanup operations.");
                    try {
                        m4049a();
                        g25Var.m5891d();
                        return;
                    } catch (SQLiteException e) {
                        this.f16141d++;
                        if (this.f16141d >= 3) {
                            if (!(e instanceof SQLiteAccessPermException) && !(e instanceof SQLiteCantOpenDatabaseException) && !(e instanceof SQLiteConstraintException) && !(e instanceof SQLiteDatabaseCorruptException) && !(e instanceof SQLiteDatabaseLockedException) && !(e instanceof SQLiteDiskIOException) && !(e instanceof SQLiteFullException) && !(e instanceof SQLiteTableLockedException)) {
                                throw e;
                            }
                            wn2.m12326e().m12330d(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            IllegalStateException illegalStateException2 = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            ik0Var.getClass();
                            throw illegalStateException2;
                        }
                        long j = ((long) this.f16141d) * 300;
                        String str2 = "Retrying after " + j;
                        if (wn2.m12326e().f33518a <= 3) {
                            Log.d(str, str2, e);
                        }
                        try {
                            Thread.sleep(((long) this.f16141d) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    wn2.m12326e().m12329c(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException3 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    ik0Var.getClass();
                    throw illegalStateException3;
                }
            }
        } catch (Throwable th) {
            g25Var.m5891d();
            throw th;
        }
    }
}
