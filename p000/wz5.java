package p000;

import android.net.TrafficStats;
import org.chromium.net.ThreadStatsUid;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wz5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f33883a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f33884b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f33885c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Runnable f33886d;

    @Override // java.lang.Runnable
    public final void run() {
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        TrafficStats.setThreadStatsTag(this.f33883a);
        Runnable runnable = this.f33886d;
        boolean z = this.f33884b;
        if (z) {
            ThreadStatsUid.set(this.f33885c);
        }
        try {
            runnable.run();
            if (z) {
            }
        } finally {
            if (z) {
                ThreadStatsUid.clear();
            }
            TrafficStats.setThreadStatsTag(threadStatsTag);
        }
    }
}
