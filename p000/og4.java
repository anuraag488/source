package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class og4 implements bw3 {

    /* JADX INFO: renamed from: f */
    public static final String f26683f = wn2.m12327g("SystemJobScheduler");

    /* JADX INFO: renamed from: a */
    public Context f26684a;

    /* JADX INFO: renamed from: b */
    public JobScheduler f26685b;

    /* JADX INFO: renamed from: c */
    public ng4 f26686c;

    /* JADX INFO: renamed from: d */
    public WorkDatabase f26687d;

    /* JADX INFO: renamed from: e */
    public ik0 f26688e;

    /* JADX INFO: renamed from: b */
    public static void m9059b(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            wn2.m12326e().m12330d(f26683f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList m9060d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        String str = x82.f34061a;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            wn2.m12326e().m12330d(x82.f34061a, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static e25 m9061f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new e25(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p000.bw3
    /* JADX INFO: renamed from: a */
    public final void mo3746a(String str) {
        ArrayList arrayList;
        Context context = this.f26684a;
        JobScheduler jobScheduler = this.f26685b;
        ArrayList arrayListM9060d = m9060d(context, jobScheduler);
        if (arrayListM9060d == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            int size = arrayListM9060d.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListM9060d.get(i);
                i++;
                JobInfo jobInfo = (JobInfo) obj;
                e25 e25VarM9061f = m9061f(jobInfo);
                if (e25VarM9061f != null && str.equals(e25VarM9061f.f17648a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            int iIntValue = ((Integer) obj2).intValue();
            wn2.m12326e().m12328b(f26683f, "Cancelling work ID " + str + ", Job ID " + iIntValue);
            m9059b(jobScheduler, iIntValue);
        }
        WorkDatabase workDatabase = this.f26687d.mo3076s().f23111a;
        C1051py c1051py = new C1051py((byte) 7);
        c1051py.f28076b = str;
        VarHandle.storeStoreFence();
        as4.m3231J(workDatabase, false, true, c1051py);
    }

    @Override // p000.bw3
    /* JADX INFO: renamed from: c */
    public final void mo3747c(q25... q25VarArr) throws Throwable {
        int iIntValue;
        ik0 ik0Var = this.f26688e;
        WorkDatabase workDatabase = this.f26687d;
        ar3 ar3Var = new ar3((byte) 28);
        ar3Var.f14813b = workDatabase;
        VarHandle.storeStoreFence();
        byte b = 0;
        for (q25 q25Var : q25VarArr) {
            workDatabase.m3059b();
            try {
                u25 u25VarMo3080w = workDatabase.mo3080w();
                String str = q25Var.f28162a;
                q25 q25VarM11210b = u25VarMo3080w.m11210b(str);
                String str2 = f26683f;
                if (q25VarM11210b == null) {
                    wn2.m12326e().m12332h(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.m3075r();
                } else if (q25VarM11210b.f28163b != f25.f18681a) {
                    wn2.m12326e().m12332h(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.m3075r();
                } else {
                    e25 e25VarM7904L = lb5.m7904L(q25Var);
                    ig4 ig4VarM7515a = workDatabase.mo3076s().m7515a(e25VarM7904L);
                    if (ig4VarM7515a != null) {
                        iIntValue = ig4VarM7515a.f21410c;
                    } else {
                        int i = ik0Var.f21511h;
                        WorkDatabase workDatabase2 = (WorkDatabase) ar3Var.f14813b;
                        p02 p02Var = new p02(b);
                        p02Var.f27259c = ar3Var;
                        p02Var.f27258b = i;
                        VarHandle.storeStoreFence();
                        iIntValue = ((Number) workDatabase2.m3073p(p02Var)).intValue();
                    }
                    if (ig4VarM7515a == null) {
                        ig4 ig4Var = new ig4(e25VarM7904L.f17649b, e25VarM7904L.f17648a, iIntValue);
                        kg4 kg4VarMo3076s = workDatabase.mo3076s();
                        WorkDatabase workDatabase3 = kg4VarMo3076s.f23111a;
                        cz3 cz3Var = new cz3((byte) 6);
                        cz3Var.f16638b = kg4VarMo3076s;
                        cz3Var.f16639c = ig4Var;
                        VarHandle.storeStoreFence();
                        as4.m3231J(workDatabase3, false, true, cz3Var);
                    }
                    m9062g(q25Var, iIntValue);
                    workDatabase.m3075r();
                }
                workDatabase.m3070m();
            } catch (Throwable th) {
                workDatabase.m3070m();
                throw th;
            }
        }
    }

    @Override // p000.bw3
    /* JADX INFO: renamed from: e */
    public final boolean mo3748e() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m9062g(q25 q25Var, int i) {
        int i2;
        List<JobInfo> allPendingJobs;
        String str;
        ik0 ik0Var = this.f26688e;
        ng4 ng4Var = this.f26686c;
        jl0 jl0Var = q25Var.f28171j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str2 = q25Var.f28162a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str2);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", q25Var.f28181t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", q25Var.m9717b());
        JobInfo.Builder builder = new JobInfo.Builder(i, ng4Var.f25777a);
        boolean z = jl0Var.f22384c;
        Set<il0> set = jl0Var.f22390i;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = jl0Var.f22385d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        NetworkRequest networkRequestM7163a = jl0Var.m7163a();
        if (networkRequestM7163a != null) {
            extras.setRequiredNetwork(networkRequestM7163a);
        } else {
            s03 s03Var = jl0Var.f22382a;
            if (s03Var == s03.f29793f) {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            } else {
                int iOrdinal = s03Var.ordinal();
                if (iOrdinal == 0) {
                    i2 = 0;
                } else if (iOrdinal != 1) {
                    i2 = 2;
                    if (iOrdinal != 2) {
                        i2 = 3;
                        if (iOrdinal != 3) {
                            i2 = 4;
                            if (iOrdinal != 4) {
                                wn2.m12326e().m12328b(ng4.f25776d, "API version too low. Cannot convert network type value " + s03Var);
                                i2 = 1;
                            }
                        }
                    }
                } else {
                    i2 = 1;
                }
                extras.setRequiredNetworkType(i2);
            }
        }
        if (!z2) {
            extras.setBackoffCriteria(q25Var.f28174m, q25Var.f28173l == EnumC0887lw.f24407b ? 0 : 1);
        }
        long jM9716a = q25Var.m9716a();
        ng4Var.f25778b.getClass();
        long jMax = Math.max(jM9716a - System.currentTimeMillis(), 0L);
        if (jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!q25Var.f28178q && ng4Var.f25779c) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (il0 il0Var : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(il0Var.f21526a, il0Var.f21527b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(jl0Var.f22388g);
            extras.setTriggerContentMaxDelay(jl0Var.f22389h);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(jl0Var.f22386e);
        extras.setRequiresStorageNotLow(jl0Var.f22387f);
        boolean z3 = q25Var.f28172k > 0;
        boolean z4 = jMax > 0;
        if (q25Var.f28178q && !z3 && !z4) {
            extras.setExpedited(true);
        }
        if (Build.VERSION.SDK_INT >= 35 && (str = q25Var.f28185x) != null) {
            extras.setTraceTag(str);
        }
        JobInfo jobInfoBuild = extras.build();
        wn2 wn2VarM12326e = wn2.m12326e();
        StringBuilder sbM10844j = sk5.m10844j("Scheduling work ID ", str2, " (");
        sbM10844j.append(q25Var.f28164c);
        sbM10844j.append("), Job ID ");
        sbM10844j.append(i);
        String string = sbM10844j.toString();
        String str3 = f26683f;
        wn2VarM12326e.m12328b(str3, string);
        try {
            if (this.f26685b.schedule(jobInfoBuild) == 0) {
                wn2.m12326e().m12332h(str3, "Unable to schedule work ID " + str2);
                if (q25Var.f28178q && q25Var.f28179r == f63.f18787a) {
                    q25Var.f28178q = false;
                    wn2.m12326e().m12328b(str3, "Scheduling a non-expedited job (work ID " + str2 + ")");
                    m9062g(q25Var, i);
                }
            }
        } catch (IllegalStateException e) {
            Context context = this.f26684a;
            WorkDatabase workDatabase = this.f26687d;
            String str4 = x82.f34061a;
            WorkDatabase workDatabase2 = workDatabase.mo3080w().f31629a;
            ro4 ro4Var = new ro4((byte) 26);
            VarHandle.storeStoreFence();
            int size = ((List) as4.m3231J(workDatabase2, true, false, ro4Var)).size();
            String strM6305Q0 = "<faulty JobScheduler failed to getPendingJobs>";
            if (Build.VERSION.SDK_INT >= 34) {
                JobScheduler jobSchedulerM12529a = x82.m12529a(context);
                try {
                    allPendingJobs = jobSchedulerM12529a.getAllPendingJobs();
                } catch (Throwable th) {
                    wn2.m12326e().m12330d(x82.f34061a, "getAllPendingJobs() is not reliable on this device.", th);
                    allPendingJobs = null;
                }
                if (allPendingJobs != null) {
                    ArrayList arrayListM9060d = m9060d(context, jobSchedulerM12529a);
                    int size2 = arrayListM9060d != null ? allPendingJobs.size() - arrayListM9060d.size() : 0;
                    String str5 = size2 == 0 ? null : size2 + " of which are not owned by WorkManager";
                    ArrayList arrayListM9060d2 = m9060d(context, (JobScheduler) context.getSystemService("jobscheduler"));
                    int size3 = arrayListM9060d2 != null ? arrayListM9060d2.size() : 0;
                    strM6305Q0 = hb0.m6305Q0(AbstractC0990oo.m9209d0(new String[]{allPendingJobs.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str5, size3 != 0 ? size3 + " from WorkManager in the default namespace" : null}), ",\n", null, null, 0, null, 62);
                }
            } else {
                ArrayList arrayListM9060d3 = m9060d(context, x82.m12529a(context));
                if (arrayListM9060d3 != null) {
                    strM6305Q0 = arrayListM9060d3.size() + " jobs from WorkManager";
                }
            }
            byte b = ik0Var.f21513j;
            StringBuilder sb = new StringBuilder("JobScheduler 150 job limit exceeded.\nIn JobScheduler there are ");
            sb.append(strM6305Q0);
            sb.append(".\nThere are ");
            sb.append(size);
            sb.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String strM3880l = c75.m3880l(sb, b, ".");
            wn2.m12326e().m12329c(str3, strM3880l);
            throw new IllegalStateException(strM3880l, e);
        } catch (Throwable th2) {
            wn2.m12326e().m12330d(str3, "Unable to schedule " + q25Var, th2);
        }
    }
}
