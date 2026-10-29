package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.lang.invoke.VarHandle;
import java.util.List;
import p000.C0942nd;
import p000.as4;
import p000.bm2;
import p000.cm2;
import p000.g25;
import p000.jz0;
import p000.kg4;
import p000.l25;
import p000.ro4;
import p000.t25;
import p000.u25;
import p000.w25;
import p000.wn2;
import p000.zs0;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    /* JADX INFO: renamed from: a */
    public final cm2 mo3057a() {
        g25 g25VarM5888b = g25.m5888b(this.f14680a);
        WorkDatabase workDatabase = g25VarM5888b.f19514c;
        u25 u25VarMo3080w = workDatabase.mo3080w();
        l25 l25VarMo3078u = workDatabase.mo3078u();
        w25 w25VarMo3081x = workDatabase.mo3081x();
        kg4 kg4VarMo3076s = workDatabase.mo3076s();
        g25VarM5888b.f19513b.f21506c.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
        WorkDatabase workDatabase2 = u25VarMo3080w.f31629a;
        C0942nd c0942nd = new C0942nd((byte) 4);
        c0942nd.f25690b = jCurrentTimeMillis;
        VarHandle.storeStoreFence();
        List list = (List) as4.m3231J(workDatabase2, true, false, c0942nd);
        WorkDatabase workDatabase3 = u25VarMo3080w.f31629a;
        t25 t25Var = new t25((byte) 0);
        VarHandle.storeStoreFence();
        List list2 = (List) as4.m3231J(workDatabase3, true, false, t25Var);
        ro4 ro4Var = new ro4((byte) 28);
        VarHandle.storeStoreFence();
        List list3 = (List) as4.m3231J(workDatabase3, true, false, ro4Var);
        if (!list.isEmpty()) {
            wn2 wn2VarM12326e = wn2.m12326e();
            String str = jz0.f22751a;
            wn2VarM12326e.m12331f(str, "Recently completed work:\n\n");
            wn2.m12326e().m12331f(str, jz0.m7344a(l25VarMo3078u, w25VarMo3081x, kg4VarMo3076s, list));
        }
        if (!list2.isEmpty()) {
            wn2 wn2VarM12326e2 = wn2.m12326e();
            String str2 = jz0.f22751a;
            wn2VarM12326e2.m12331f(str2, "Running work:\n\n");
            wn2.m12326e().m12331f(str2, jz0.m7344a(l25VarMo3078u, w25VarMo3081x, kg4VarMo3076s, list2));
        }
        if (!list3.isEmpty()) {
            wn2 wn2VarM12326e3 = wn2.m12326e();
            String str3 = jz0.f22751a;
            wn2VarM12326e3.m12331f(str3, "Enqueued work:\n\n");
            wn2.m12326e().m12331f(str3, jz0.m7344a(l25VarMo3078u, w25VarMo3081x, kg4VarMo3076s, list3));
        }
        zs0 zs0Var = zs0.f36338b;
        bm2 bm2Var = new bm2();
        bm2Var.f15412a = zs0Var;
        VarHandle.storeStoreFence();
        return bm2Var;
    }
}
