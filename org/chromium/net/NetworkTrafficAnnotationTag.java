package org.chromium.net;

import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class NetworkTrafficAnnotationTag {
    private final int mHashCode;
    public static final NetworkTrafficAnnotationTag NO_TRAFFIC_ANNOTATION_YET = createComplete("undefined", "Nothing here yet.");
    public static final NetworkTrafficAnnotationTag MISSING_TRAFFIC_ANNOTATION = createComplete("undefined", "Function called without traffic annotation.");
    public static final NetworkTrafficAnnotationTag TRAFFIC_ANNOTATION_FOR_TESTS = createComplete("test", "Traffic annotation for unit, browser and other tests");

    private NetworkTrafficAnnotationTag(String str) {
        this.mHashCode = iterativeHash(str);
    }

    public static NetworkTrafficAnnotationTag createComplete(String str, String str2) {
        return new NetworkTrafficAnnotationTag(str);
    }

    public static int iterativeHash(String str) {
        long j = 0;
        for (byte b : str.getBytes(StandardCharsets.UTF_8)) {
            j = ((j * 31) + ((long) b)) % 138003713;
        }
        return (int) j;
    }

    public int getHashCode() {
        return this.mHashCode;
    }
}
