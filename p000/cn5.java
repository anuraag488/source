package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cn5 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f16163a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ pv5 f16164b;

    public /* synthetic */ cn5(byte b) {
        this.f16163a = b;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f16163a) {
            case 0:
                tt2 tt2Var = this.f16164b.f28038c;
                ee6 ee6Var = new ee6("internal.eventLogger", (byte) 0);
                ee6Var.f18038d = tt2Var;
                VarHandle.storeStoreFence();
                return ee6Var;
            default:
                yg3 yg3Var = this.f16164b.f28039d;
                ee6 ee6Var2 = new ee6("internal.registerCallback", (byte) 4);
                ee6Var2.f18038d = yg3Var;
                VarHandle.storeStoreFence();
                return ee6Var2;
        }
    }
}
