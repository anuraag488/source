package p000;

import androidx.work.impl.WorkDatabase;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ew3 {

    /* JADX INFO: renamed from: a */
    public static final String f18545a = wn2.m12327g("Schedulers");

    /* JADX INFO: renamed from: a */
    public static void m5410a(u25 u25Var, i50 i50Var, List list) {
        if (list.size() > 0) {
            i50Var.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                u25Var.m11211c(((q25) it.next()).f28162a, jCurrentTimeMillis);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m5411b(ik0 ik0Var, WorkDatabase workDatabase, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        u25 u25VarMo3080w = workDatabase.mo3080w();
        new ArrayList();
        workDatabase.m3059b();
        try {
            WorkDatabase workDatabase2 = u25VarMo3080w.f31629a;
            WorkDatabase workDatabase3 = u25VarMo3080w.f31629a;
            C1051py c1051py = new C1051py((byte) 18);
            c1051py.f28076b = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time";
            VarHandle.storeStoreFence();
            List list2 = (List) as4.m3231J(workDatabase2, true, false, c1051py);
            m5410a(u25VarMo3080w, ik0Var.f21506c, list2);
            ro4 ro4Var = new ro4((byte) 28);
            VarHandle.storeStoreFence();
            List list3 = (List) as4.m3231J(workDatabase3, true, false, ro4Var);
            byte b = ik0Var.f21513j;
            s25 s25Var = new s25();
            s25Var.f29841a = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))";
            s25Var.f29842b = b;
            VarHandle.storeStoreFence();
            List list4 = (List) as4.m3231J(workDatabase3, true, false, s25Var);
            m5410a(u25VarMo3080w, ik0Var.f21506c, list4);
            list4.addAll(list2);
            workDatabase.m3075r();
            workDatabase.m3070m();
            m5412c(list4, list, true);
            m5412c(list3, list, false);
        } catch (Throwable th) {
            workDatabase.m3070m();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m5412c(List list, List list2, boolean z) {
        if (list.isEmpty()) {
            return;
        }
        q25[] q25VarArr = (q25[]) list.toArray(new q25[list.size()]);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            bw3 bw3Var = (bw3) it.next();
            if (bw3Var.mo3748e() == z) {
                bw3Var.mo3747c(q25VarArr);
            }
        }
    }
}
