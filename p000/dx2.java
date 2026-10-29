package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dx2 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f17477a = new AtomicReference(null);

    /* JADX INFO: renamed from: b */
    public final gx2 f17478b = hx2.m6530a();

    /* JADX INFO: renamed from: a */
    public final void m4789a(ax2 ax2Var) {
        AtomicReference atomicReference;
        ax2 ax2Var2;
        do {
            atomicReference = this.f17477a;
            ax2Var2 = (ax2) atomicReference.get();
            if (ax2Var2 != null && ax2Var.f14927a.compareTo(ax2Var2.f14927a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!atomicReference.compareAndSet(ax2Var2, ax2Var));
        if (ax2Var2 != null) {
            ax2Var2.f14928b.mo4993a(new bi1("Mutation interrupted", (byte) 0));
        }
    }
}
