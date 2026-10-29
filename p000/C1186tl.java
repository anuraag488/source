package p000;

import java.util.List;

/* JADX INFO: renamed from: tl */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1186tl implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Thread.UncaughtExceptionHandler f31216a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ lt0 f31217b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ wp1 f31218c;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread thread2;
        Throwable th2;
        Object objM10807c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f31216a;
        try {
            thread2 = thread;
            th2 = th;
            try {
                objM10807c = (List) y70.m13014O(r71.f29063a, new C1031pe(this.f31217b, thread2, this.f31218c, th2, (wm0) null, (byte) 2));
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                sc6.m10643O(th4);
                objM10807c = sj3.m10807c(th4);
            }
        } catch (Throwable th5) {
            th = th5;
            thread2 = thread;
            th2 = th;
        }
        qq2.m10007B(objM10807c);
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread2, th2);
        }
    }
}
