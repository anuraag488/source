package p000;

import java.io.Closeable;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Method;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ra0 implements Closeable {

    /* JADX INFO: renamed from: d */
    public static final qa0 f29109d;

    /* JADX INFO: renamed from: a */
    public qa0 f29110a;

    /* JADX INFO: renamed from: b */
    public ArrayDeque f29111b;

    /* JADX INFO: renamed from: c */
    public Throwable f29112c;

    static {
        qa0 qa0Var;
        try {
            Method method = Throwable.class.getMethod("addSuppressed", Throwable.class);
            js1 js1Var = new js1();
            js1Var.f22555a = method;
            VarHandle.storeStoreFence();
            qa0Var = js1Var;
        } catch (Throwable unused) {
            qa0Var = null;
        }
        if (qa0Var == null) {
            qa0Var = wv1.f33761d;
        }
        f29109d = qa0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayDeque arrayDeque = this.f29111b;
        Throwable th = this.f29112c;
        while (!arrayDeque.isEmpty()) {
            Closeable closeable = (Closeable) arrayDeque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.f29110a.mo7273f(closeable, th, th2);
                }
            }
        }
        if (this.f29112c != null || th == null) {
            return;
        }
        nm4.m8799a(th);
        C1077qn.m9985k(th);
    }
}
