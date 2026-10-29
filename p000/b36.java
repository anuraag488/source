package p000;

import java.util.concurrent.Executor;
import org.chromium.net.NetworkQualityThroughputListener;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b36 extends NetworkQualityThroughputListener {

    /* JADX INFO: renamed from: a */
    public final NetworkQualityThroughputListener f15064a;

    public b36(NetworkQualityThroughputListener networkQualityThroughputListener) {
        super(networkQualityThroughputListener.getExecutor());
        this.f15064a = networkQualityThroughputListener;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b36)) {
            return false;
        }
        return this.f15064a.equals(((b36) obj).f15064a);
    }

    @Override // org.chromium.net.NetworkQualityThroughputListener
    public final Executor getExecutor() {
        return this.f15064a.getExecutor();
    }

    public final int hashCode() {
        return this.f15064a.hashCode();
    }

    @Override // org.chromium.net.NetworkQualityThroughputListener
    public final void onThroughputObservation(int i, long j, int i2) {
        this.f15064a.onThroughputObservation(i, j, i2);
    }
}
