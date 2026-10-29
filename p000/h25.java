package p000;

import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.lang.invoke.VarHandle;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h25 extends xq1 implements qq1 {

    /* JADX INFO: renamed from: b */
    public static final h25 f20286b = new h25(6, i25.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // p000.qq1
    /* JADX INFO: renamed from: c */
    public final Object mo6204c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        ik0 ik0Var = (ik0) obj2;
        j25 j25Var = (j25) obj3;
        ko4 ko4Var = (ko4) obj5;
        jg3 jg3Var = (jg3) obj6;
        sl2 sl2VarM7680G = kx5.m7680G();
        String str = ew3.f18545a;
        JobScheduler jobSchedulerM12529a = x82.m12529a(context);
        i50 i50Var = ik0Var.f21506c;
        boolean z = ik0Var.f21514k;
        ng4 ng4Var = new ng4();
        ng4Var.f25778b = i50Var;
        ng4Var.f25777a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        ng4Var.f25779c = z;
        VarHandle.storeStoreFence();
        og4 og4Var = new og4();
        og4Var.f26684a = context;
        og4Var.f26685b = jobSchedulerM12529a;
        og4Var.f26686c = ng4Var;
        og4Var.f26687d = (WorkDatabase) obj4;
        og4Var.f26688e = ik0Var;
        VarHandle.storeStoreFence();
        String str2 = x63.f34026a;
        x63.m12495a(context.getPackageManager(), new ComponentName(context, (Class<?>) SystemJobService.class), true, w63.f33123b);
        wn2.m12326e().m12328b(ew3.f18545a, "Created SystemJobScheduler and enabled SystemJobService");
        sl2VarM7680G.add(og4Var);
        if (ik0Var.f21516m) {
            pq3 pq3Var = new pq3(jg3Var, j25Var);
            hu1 hu1Var = new hu1();
            hu1Var.f20868b = new HashMap();
            hu1Var.f20871e = new Object();
            ys0 ys0Var = new ys0();
            ys0Var.f35491a = new LinkedHashMap();
            VarHandle.storeStoreFence();
            pq3 pq3Var2 = new pq3((byte) 3);
            pq3Var2.f27896b = ys0Var;
            pq3Var2.f27897c = new Object();
            VarHandle.storeStoreFence();
            hu1Var.f20872f = pq3Var2;
            hu1Var.f20876j = new HashMap();
            hu1Var.f20867a = context;
            ar3 ar3Var = ik0Var.f21509f;
            ox0 ox0Var = new ox0();
            ox0Var.f27182a = hu1Var;
            ox0Var.f27183b = ar3Var;
            ox0Var.f27184c = i50Var;
            ox0Var.f27185d = new HashMap();
            VarHandle.storeStoreFence();
            hu1Var.f20869c = ox0Var;
            C1283w7 c1283w7 = new C1283w7((byte) 20);
            c1283w7.f33127c = ar3Var;
            c1283w7.f33128d = pq3Var;
            c1283w7.f33129e = new Object();
            c1283w7.f33126b = new LinkedHashMap();
            VarHandle.storeStoreFence();
            hu1Var.f20880n = c1283w7;
            hu1Var.f20879m = j25Var;
            hu1Var.f20878l = new cu2(ko4Var);
            hu1Var.f20875i = ik0Var;
            hu1Var.f20873g = jg3Var;
            hu1Var.f20874h = pq3Var;
            VarHandle.storeStoreFence();
            sl2VarM7680G.add(hu1Var);
        }
        return kx5.m7740w(sl2VarM7680G);
    }
}
