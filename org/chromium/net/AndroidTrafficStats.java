package org.chromium.net;

import android.net.TrafficStats;
import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class AndroidTrafficStats {
    private AndroidTrafficStats() {
    }

    private static long getCurrentUidRxBytes() {
        long uidRxBytes = TrafficStats.getUidRxBytes(Process.myUid());
        if (uidRxBytes != -1) {
            return uidRxBytes;
        }
        return 0L;
    }

    private static long getCurrentUidTxBytes() {
        long uidTxBytes = TrafficStats.getUidTxBytes(Process.myUid());
        if (uidTxBytes != -1) {
            return uidTxBytes;
        }
        return 0L;
    }

    private static long getTotalRxBytes() {
        long totalRxBytes = TrafficStats.getTotalRxBytes();
        if (totalRxBytes != -1) {
            return totalRxBytes;
        }
        return 0L;
    }

    private static long getTotalTxBytes() {
        long totalTxBytes = TrafficStats.getTotalTxBytes();
        if (totalTxBytes != -1) {
            return totalTxBytes;
        }
        return 0L;
    }
}
