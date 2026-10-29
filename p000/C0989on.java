package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: on */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0989on extends dt0 {

    /* JADX INFO: renamed from: s */
    public static volatile C0989on f26893s;

    /* JADX INFO: renamed from: t */
    public static final ExecutorC0952nn f26894t = new ExecutorC0952nn((byte) 0);

    /* JADX INFO: renamed from: r */
    public final ax0 f26895r;

    public C0989on() {
        ax0 ax0Var = new ax0();
        ax0Var.f14924r = new Object();
        zw0 zw0Var = new zw0((byte) 0);
        zw0Var.f36423b = new AtomicInteger(0);
        VarHandle.storeStoreFence();
        ax0Var.f14925s = Executors.newFixedThreadPool(4, zw0Var);
        VarHandle.storeStoreFence();
        this.f26895r = ax0Var;
    }

    /* JADX INFO: renamed from: f0 */
    public static C0989on m9190f0() {
        if (f26893s != null) {
            return f26893s;
        }
        synchronized (C0989on.class) {
            try {
                if (f26893s == null) {
                    f26893s = new C0989on();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f26893s;
    }
}
