package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s72 implements BiConsumer {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ vi4 f29941a;

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        vi4 vi4Var = this.f29941a;
        RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9((byte) 12);
        runnableC1285w9.f33164b = (wl0) obj;
        runnableC1285w9.f33165c = vi4Var;
        VarHandle.storeStoreFence();
        ((Executor) obj2).execute(runnableC1285w9);
    }
}
