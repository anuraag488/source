package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o25 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f26303b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f26304c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ long f26305d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ long f26306e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ long f26307f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ long f26308g;

    /* JADX INFO: renamed from: a */
    public AtomicReferenceArray f26309a;
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Unsafe unsafe = AbstractC1078qo.f28633a;
        f26307f = unsafe.objectFieldOffset(o25.class.getDeclaredField("lastScheduledTask$volatile"));
        f26303b = AtomicIntegerFieldUpdater.newUpdater(o25.class, "producerIndex$volatile");
        f26308g = unsafe.objectFieldOffset(o25.class.getDeclaredField("producerIndex$volatile"));
        f26306e = unsafe.objectFieldOffset(o25.class.getDeclaredField("consumerIndex$volatile"));
        f26304c = AtomicIntegerFieldUpdater.newUpdater(o25.class, "blockingTasksInBuffer$volatile");
        f26305d = unsafe.objectFieldOffset(o25.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    /* JADX INFO: renamed from: a */
    public final ji4 m8928a(ji4 ji4Var) {
        AtomicReferenceArray atomicReferenceArray = this.f26309a;
        if (m8929b() == 127) {
            return ji4Var;
        }
        if (ji4Var.f22318b) {
            f26304c.incrementAndGet(this);
        }
        int intVolatile = AbstractC1078qo.f28633a.getIntVolatile(this, f26308g) & 127;
        while (atomicReferenceArray.get(intVolatile) != null) {
            Thread.yield();
        }
        atomicReferenceArray.lazySet(intVolatile, ji4Var);
        f26303b.incrementAndGet(this);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final int m8929b() {
        return AbstractC1078qo.f28633a.getIntVolatile(this, f26308g) - AbstractC1078qo.f28633a.getIntVolatile(this, f26306e);
    }

    /* JADX INFO: renamed from: c */
    public final ji4 m8930c() {
        ji4 ji4Var;
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j = f26306e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, f26308g) == 0) {
                return null;
            }
            int i = intVolatile & 127;
            o25 o25Var = this;
            if (unsafe.compareAndSwapInt(o25Var, j, intVolatile, intVolatile + 1) && (ji4Var = (ji4) o25Var.f26309a.getAndSet(i, null)) != null) {
                if (ji4Var.f22318b) {
                    f26304c.decrementAndGet(o25Var);
                }
                return ji4Var;
            }
            this = o25Var;
        }
    }

    /* JADX INFO: renamed from: d */
    public final ji4 m8931d(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f26309a;
        ji4 ji4Var = (ji4) atomicReferenceArray.get(i2);
        if (ji4Var == null || ji4Var.f22318b != z || !atomicReferenceArray.compareAndSet(i2, ji4Var, null)) {
            return null;
        }
        if (z) {
            f26304c.decrementAndGet(this);
        }
        return ji4Var;
    }
}
