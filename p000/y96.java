package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y96 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: a */
    public final long f35056a;

    /* JADX INFO: renamed from: b */
    public final boolean f35057b;

    /* JADX INFO: renamed from: c */
    public final String f35058c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ea6 f35059d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y96(ea6 ea6Var, Callable callable, boolean z) {
        super(callable);
        this.f35059d = ea6Var;
        long andIncrement = ea6.f17930o.getAndIncrement();
        this.f35056a = andIncrement;
        this.f35058c = "Task exception on worker thread";
        this.f35057b = z;
        if (andIncrement == Long.MAX_VALUE) {
            d76 d76Var = ((oa6) ea6Var.f36084a).f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12504a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y96 y96Var = (y96) obj;
        boolean z = y96Var.f35057b;
        boolean z2 = this.f35057b;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = y96Var.f35056a;
        long j2 = this.f35056a;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        d76 d76Var = ((oa6) this.f35059d.f36084a).f26514f;
        oa6.m9016l(d76Var);
        d76Var.f16836k.m12505b(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        d76 d76Var = ((oa6) this.f35059d.f36084a).f26514f;
        oa6.m9016l(d76Var);
        d76Var.f16835j.m12505b(th, this.f35058c);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y96(ea6 ea6Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.f35059d = ea6Var;
        long andIncrement = ea6.f17930o.getAndIncrement();
        this.f35056a = andIncrement;
        this.f35058c = str;
        this.f35057b = z;
        if (andIncrement == Long.MAX_VALUE) {
            d76 d76Var = ((oa6) ea6Var.f36084a).f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12504a("Tasks index overflow");
        }
    }
}
