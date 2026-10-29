package p000;

import ads_mobile_sdk.wr3;
import ads_mobile_sdk.zx2;
import androidx.work.impl.WorkDatabase;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wx0 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33817a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f33818b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f33819c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f33820d;

    public /* synthetic */ wx0(byte b) {
        this.f33817a = b;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f33817a) {
            case 0:
                xx0 xx0Var = (xx0) this.f33818b;
                Callable callable = (Callable) this.f33819c;
                ar3 ar3Var = (ar3) this.f33820d;
                ExecutorService executorService = xx0Var.f34689a;
                RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9((byte) 9);
                runnableC1285w9.f33164b = callable;
                runnableC1285w9.f33165c = ar3Var;
                VarHandle.storeStoreFence();
                return executorService.submit(runnableC1285w9);
            case 1:
                jg3 jg3Var = (jg3) this.f33818b;
                ArrayList arrayList = (ArrayList) this.f33819c;
                String str = (String) this.f33820d;
                WorkDatabase workDatabase = jg3Var.f22250d;
                WorkDatabase workDatabase2 = workDatabase.mo3081x().f33049a;
                C1051py c1051py = new C1051py((byte) 23);
                c1051py.f28076b = str;
                VarHandle.storeStoreFence();
                arrayList.addAll((List) as4.m3231J(workDatabase2, true, false, c1051py));
                return workDatabase.mo3080w().m11210b(str);
            default:
                wr3 wr3Var = (wr3) this.f33818b;
                wr3Var.f13058a.m1733a((zx2) this.f33819c, null, (byte[]) this.f33820d);
                return null;
        }
    }
}
