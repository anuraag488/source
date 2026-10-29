package p000;

import android.os.SystemClock;
import java.io.Serializable;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class is5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21762a;

    /* JADX INFO: renamed from: b */
    public static p56 m6929b(p56 p56Var) {
        if ((p56Var instanceof ia6) || (p56Var instanceof y76)) {
            return p56Var;
        }
        if (p56Var instanceof Serializable) {
            y76 y76Var = new y76();
            y76Var.f35005a = new h60();
            y76Var.f35006b = p56Var;
            VarHandle.storeStoreFence();
            return y76Var;
        }
        ia6 ia6Var = new ia6();
        ia6Var.f21237a = new h60();
        ia6Var.f21238b = p56Var;
        VarHandle.storeStoreFence();
        return ia6Var;
    }

    /* JADX INFO: renamed from: a */
    public final long m6930a() {
        switch (this.f21762a) {
            case 0:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
