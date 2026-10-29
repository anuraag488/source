package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cz5 implements Executor {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ThreadPoolExecutor f16649a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f16650b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f16651c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f16652d;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.f16650b;
        boolean z = this.f16651c;
        int i2 = this.f16652d;
        wz5 wz5Var = new wz5();
        wz5Var.f33883a = i;
        wz5Var.f33884b = z;
        wz5Var.f33885c = i2;
        wz5Var.f33886d = runnable;
        VarHandle.storeStoreFence();
        this.f16649a.execute(wz5Var);
    }
}
