package p000;

import ads_mobile_sdk.op3;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p02 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f27257a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f27258b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f27259c;

    public /* synthetic */ p02(byte b) {
        this.f27257a = b;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f27257a) {
            case 0:
                ar3 ar3Var = (ar3) this.f27259c;
                int i = this.f27258b;
                WorkDatabase workDatabase = (WorkDatabase) ar3Var.f14813b;
                Long lM11031a = workDatabase.mo3072o().m11031a("next_job_scheduler_id");
                int i2 = 0;
                int iLongValue = lM11031a != null ? (int) lM11031a.longValue() : 0;
                workDatabase.mo3072o().m11032b(new sd3("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                if (iLongValue < 0 || iLongValue > i) {
                    ((WorkDatabase) ar3Var.f14813b).mo3072o().m11032b(new sd3("next_job_scheduler_id", 1L));
                } else {
                    i2 = iLongValue;
                }
                return Integer.valueOf(i2);
            default:
                op3 op3Var = (op3) this.f27259c;
                int iM4376u = d55.m4376u(this.f27258b);
                if (iM4376u == 1) {
                    return (ec5) op3Var.f8375a.get();
                }
                if (iM4376u == 2) {
                    return (ec5) op3Var.f8376b.get();
                }
                if (iM4376u == 3) {
                    return (ec5) op3Var.f8377c.get();
                }
                if (iM4376u == 4) {
                    return (ec5) op3Var.f8378d.get();
                }
                ds3.m4665g();
                return null;
        }
    }
}
