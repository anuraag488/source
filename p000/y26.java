package p000;

import java.util.concurrent.Executor;
import org.chromium.net.NetworkQualityRttListener;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y26 extends NetworkQualityRttListener {

    /* JADX INFO: renamed from: a */
    public final NetworkQualityRttListener f34827a;

    public y26(NetworkQualityRttListener networkQualityRttListener) {
        super(networkQualityRttListener.getExecutor());
        this.f34827a = networkQualityRttListener;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof y26)) {
            return false;
        }
        return this.f34827a.equals(((y26) obj).f34827a);
    }

    @Override // org.chromium.net.NetworkQualityRttListener
    public final Executor getExecutor() {
        return this.f34827a.getExecutor();
    }

    public final int hashCode() {
        return this.f34827a.hashCode();
    }

    @Override // org.chromium.net.NetworkQualityRttListener
    public final void onRttObservation(int i, long j, int i2) {
        this.f34827a.onRttObservation(i, j, i2);
    }
}
