package androidx.work;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import p000.cm2;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class Worker {

    /* JADX INFO: renamed from: a */
    public final Context f14680a;

    /* JADX INFO: renamed from: b */
    public final WorkerParameters f14681b;

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f14682c = new AtomicInteger(-256);

    /* JADX INFO: renamed from: d */
    public boolean f14683d;

    public Worker(Context context, WorkerParameters workerParameters) {
        this.f14680a = context;
        this.f14681b = workerParameters;
    }

    /* JADX INFO: renamed from: a */
    public abstract cm2 mo3057a();
}
