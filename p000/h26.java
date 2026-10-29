package p000;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class h26 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final long f20287a;

    /* JADX INFO: renamed from: b */
    public final long f20288b;

    /* JADX INFO: renamed from: c */
    public final boolean f20289c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ x36 f20290d;

    public h26(x36 x36Var, boolean z) {
        Objects.requireNonNull(x36Var);
        this.f20290d = x36Var;
        this.f20287a = System.currentTimeMillis();
        this.f20288b = SystemClock.elapsedRealtime();
        this.f20289c = z;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3419a();

    @Override // java.lang.Runnable
    public final void run() {
        x36 x36Var = this.f20290d;
        if (x36Var.f33965e) {
            mo6202b();
            return;
        }
        try {
            mo3419a();
        } catch (Exception e) {
            x36Var.m12479d(e, false, this.f20289c);
            mo6202b();
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo6202b() {
    }
}
