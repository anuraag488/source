package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class io3 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21606a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f21606a) {
            case 0:
                ho3 ho3Var = new ho3(runnable, "fonts-androidx");
                ho3Var.f20754a = (byte) 10;
                VarHandle.storeStoreFence();
                return ho3Var;
            default:
                ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
                au3 au3Var = new au3((byte) 4);
                au3Var.f14880b = runnable;
                VarHandle.storeStoreFence();
                return threadFactoryDefaultThreadFactory.newThread(au3Var);
        }
    }
}
