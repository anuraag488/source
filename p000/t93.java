package p000;

import android.app.Application;
import android.os.Process;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t93 {

    /* JADX INFO: renamed from: b */
    public static final t93 f31011b;

    /* JADX INFO: renamed from: a */
    public hg3 f31012a;

    static {
        hg3 hg3Var;
        d81 d81Var = d81.f16851c;
        t93 t93Var = new t93();
        if (d81Var.f16855b) {
            hg3Var = d81.f16852d;
        } else {
            int iMyPid = Process.myPid();
            String processName = Application.getProcessName();
            synchronized (d81Var.f16854a) {
                if (!d81Var.f16855b) {
                    d81.f16852d = new hg3(d81Var, iMyPid, processName);
                    d81Var.f16855b = true;
                }
            }
            hg3Var = d81.f16852d;
        }
        t93Var.f31012a = hg3Var;
        VarHandle.storeStoreFence();
        f31011b = t93Var;
    }
}
