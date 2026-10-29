package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.view.inputmethod.BaseInputConnection;
import androidx.work.Worker;
import androidx.work.impl.WorkDatabase;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sj4 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f30343a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f30344b;

    public /* synthetic */ sj4(byte b) {
        this.f30343a = b;
    }

    @Override // p000.wp1
    public final Object invoke() throws Throwable {
        byte b = this.f30343a;
        boolean z = false;
        ju4 ju4Var = ju4.f22634a;
        Object obj = this.f30344b;
        switch (b) {
            case 0:
                tj4 tj4Var = (tj4) obj;
                return tj4Var.f25208n ? sj3.m10821q(tj4Var) : dj4.f17106b;
            case 1:
                return new BaseInputConnection(((dl4) obj).f17158a, false);
            case 2:
                wl4 wl4Var = (wl4) obj;
                wl4Var.f33480y = null;
                y70.m13004E(wl4Var);
                z62.m13349H(wl4Var);
                z62.m13348G(wl4Var);
                return Boolean.TRUE;
            case 3:
                ((hn4) obj).m6457c(null);
                return ju4Var;
            case 4:
                kn4 kn4Var = (kn4) obj;
                kn4Var.f23263N.invoke(Boolean.valueOf(!kn4Var.f23262M));
                return ju4Var;
            case 5:
                ((ww4) obj).f33805i.setValue(ju4Var);
                return ju4Var;
            case 6:
                ((wp1) ((ql3) obj).f28555a).invoke();
                return ju4Var;
            case 7:
                Object objMo5493n = ((vy4) obj).f32971a.mo5493n(ju4Var);
                if (!(objMo5493n instanceof n80)) {
                    return ju4Var;
                }
                if (!(objMo5493n instanceof m80)) {
                    C1077qn.m9989o("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
                    return null;
                }
                Throwable th = ((m80) objMo5493n).f24722a;
                if (th != null) {
                    throw th;
                }
                C1077qn.m9989o("Trying to call 'getOrThrow' on a channel closed without a cause");
                return null;
            case 8:
                x15 x15Var = (x15) obj;
                String str = x81.f34060a;
                g25 g25Var = x15Var.f33927a;
                ik0 ik0Var = g25Var.f19513b;
                WorkDatabase workDatabase = g25Var.f19514c;
                HashSet hashSet = new HashSet();
                hashSet.addAll(x15Var.f33929c);
                HashSet hashSetM12461a = x15.m12461a(x15Var);
                Iterator it = hashSet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        hashSet.removeAll(x15Var.f33929c);
                    } else if (hashSetM12461a.contains((String) it.next())) {
                        z = true;
                    }
                }
                if (z) {
                    nm0.m8796h("WorkContinuation has cycles (", x15Var, ")");
                    return null;
                }
                workDatabase.m3059b();
                try {
                    sc6.m10671l(workDatabase, ik0Var, x15Var);
                    boolean zM12528a = x81.m12528a(x15Var);
                    workDatabase.m3075r();
                    workDatabase.m3070m();
                    if (zM12528a) {
                        ew3.m5411b(ik0Var, workDatabase, g25Var.f19516e);
                    }
                    return ju4Var;
                } catch (Throwable th2) {
                    workDatabase.m3070m();
                    throw th2;
                }
            case 9:
                g25 g25Var2 = (g25) obj;
                WorkDatabase workDatabase2 = g25Var2.f19514c;
                Context context = g25Var2.f19512a;
                String str2 = og4.f26683f;
                if (Build.VERSION.SDK_INT >= 34) {
                    x82.m12529a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList arrayListM9060d = og4.m9060d(context, jobScheduler);
                if (arrayListM9060d != null && !arrayListM9060d.isEmpty()) {
                    int size = arrayListM9060d.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayListM9060d.get(i);
                        i++;
                        og4.m9059b(jobScheduler, ((JobInfo) obj2).getId());
                    }
                }
                WorkDatabase workDatabase3 = workDatabase2.mo3080w().f31629a;
                ro4 ro4Var = new ro4((byte) 29);
                VarHandle.storeStoreFence();
                ((Number) as4.m3231J(workDatabase3, false, true, ro4Var)).intValue();
                ew3.m5411b(g25Var2.f19513b, workDatabase2, g25Var2.f19516e);
                return ju4Var;
            default:
                return ((Worker) obj).mo3057a();
        }
    }
}
