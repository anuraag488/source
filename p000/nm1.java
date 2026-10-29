package p000;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nm1 implements Callable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ String f25940a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Context f25941b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f25942c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f25943d;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            return pm1.m9570b(this.f25940a, this.f25941b, this.f25942c, this.f25943d);
        } catch (Throwable unused) {
            return new om1(-3);
        }
    }
}
