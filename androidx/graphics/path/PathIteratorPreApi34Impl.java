package androidx.graphics.path;

import android.graphics.Path;
import dalvik.annotation.optimization.FastNative;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class PathIteratorPreApi34Impl {
    static {
        System.loadLibrary("androidx.graphics.path");
    }

    private final native long createInternalPathIterator(Path path, int i, float f);

    private final native void destroyInternalPathIterator(long j);

    @FastNative
    private final native boolean internalPathIteratorHasNext(long j);

    @FastNative
    private final native int internalPathIteratorNext(long j, float[] fArr, int i);

    @FastNative
    private final native int internalPathIteratorPeek(long j);

    @FastNative
    private final native int internalPathIteratorRawSize(long j);

    @FastNative
    private final native int internalPathIteratorSize(long j);

    public final void finalize() {
        destroyInternalPathIterator(0L);
    }
}
