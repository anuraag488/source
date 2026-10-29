package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: k */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0817k extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final transient Object f22781a;

    public C0817k(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f22781a = obj;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
