package p000;

import androidx.work.impl.WorkDatabase;
import java.lang.invoke.VarHandle;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z25 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35726a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ h35 f35727b;

    public /* synthetic */ z25(byte b) {
        this.f35726a = b;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.f35726a;
        h35 h35Var = this.f35727b;
        switch (b) {
            case 0:
                q25 q25Var = h35Var.f20341a;
                f25 f25Var = q25Var.f28163b;
                String str = q25Var.f28164c;
                f25 f25Var2 = f25.f18681a;
                if (f25Var != f25Var2) {
                    String str2 = i35.f21109a;
                    wn2.m12326e().m12328b(str2, str + " is not in ENQUEUED state. Nothing more to do");
                    return Boolean.TRUE;
                }
                if (q25Var.m9717b() || (q25Var.f28163b == f25Var2 && q25Var.f28172k > 0)) {
                    h35Var.f20346f.getClass();
                    if (System.currentTimeMillis() < q25Var.m9716a()) {
                        wn2.m12326e().m12328b(i35.f21109a, "Delaying execution for " + str + " because it is being executed before schedule.");
                        return Boolean.TRUE;
                    }
                }
                return Boolean.FALSE;
            default:
                u25 u25Var = h35Var.f20348h;
                String str3 = h35Var.f20343c;
                boolean z = false;
                if (u25Var.m11209a(str3) == f25.f18681a) {
                    u25Var.m11214f(f25.f18682b, str3);
                    WorkDatabase workDatabase = u25Var.f31629a;
                    C1051py c1051py = new C1051py((byte) 21);
                    c1051py.f28076b = str3;
                    VarHandle.storeStoreFence();
                    ((Number) as4.m3231J(workDatabase, false, true, c1051py)).intValue();
                    u25Var.m11215g(-256, str3);
                    h35Var.f20345e.getClass();
                    h35Var.f20353m = true;
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
