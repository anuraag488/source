package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class in2 {

    /* JADX INFO: renamed from: e */
    public static final C0641f8 f21574e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ long f21575f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ long f21576g;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a */
    public final int f21577a;

    /* JADX INFO: renamed from: b */
    public final boolean f21578b;

    /* JADX INFO: renamed from: c */
    public final int f21579c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f21580d;

    static {
        Unsafe unsafe = AbstractC1078qo.f28633a;
        f21575f = unsafe.objectFieldOffset(in2.class.getDeclaredField("_next$volatile"));
        f21576g = unsafe.objectFieldOffset(in2.class.getDeclaredField("_state$volatile"));
        f21574e = new C0641f8("REMOVE_FROZEN", (byte) 8);
    }

    public in2(int i, boolean z) {
        this.f21577a = i;
        this.f21578b = z;
        int i2 = i - 1;
        this.f21579c = i2;
        this.f21580d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            C1077qn.m9989o("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        C1077qn.m9989o("Check failed.");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final int m6820a(Object obj) {
        in2 in2Var = this;
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j = f21576g;
            long longVolatile = unsafe.getLongVolatile(in2Var, j);
            if ((3458764513820540928L & longVolatile) != 0) {
                return (2305843009213693952L & longVolatile) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & longVolatile);
            int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
            int i3 = in2Var.f21579c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = in2Var.f21578b;
            AtomicReferenceArray atomicReferenceArray = in2Var.f21580d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (unsafe.compareAndSwapLong(in2Var, f21576g, longVolatile, ((-1152921503533105153L) & longVolatile) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    in2 in2VarM6822c = this;
                    while ((AbstractC1078qo.f28633a.getLongVolatile(in2VarM6822c, j) & 1152921504606846976L) != 0) {
                        in2VarM6822c = in2VarM6822c.m6822c();
                        AtomicReferenceArray atomicReferenceArray2 = in2VarM6822c.f21580d;
                        int i4 = in2VarM6822c.f21579c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof hn2) && ((hn2) obj2).f20719a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            in2VarM6822c = null;
                        }
                        if (in2VarM6822c == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                in2Var = this;
            } else {
                int i5 = in2Var.f21577a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6821b() {
        while (true) {
            long longVolatile = AbstractC1078qo.f28633a.getLongVolatile(this, f21576g);
            if ((longVolatile & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & longVolatile) != 0) {
                return false;
            }
            in2 in2Var = this;
            if (AbstractC1078qo.f28633a.compareAndSwapLong(in2Var, f21576g, longVolatile, longVolatile | 2305843009213693952L)) {
                return true;
            }
            this = in2Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [hn2, java.lang.Object] */
    /* JADX INFO: renamed from: c */
    public final in2 m6822c() {
        in2 in2Var;
        long j;
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j2 = f21576g;
            long longVolatile = unsafe.getLongVolatile(this, j2);
            if ((longVolatile & 1152921504606846976L) != 0) {
                in2Var = this;
                j = longVolatile;
                break;
            }
            j = 1152921504606846976L | longVolatile;
            in2Var = this;
            if (unsafe.compareAndSwapLong(in2Var, j2, longVolatile, j)) {
                break;
            }
            this = in2Var;
        }
        while (true) {
            in2 in2Var2 = (in2) AbstractC1078qo.f28633a.getObjectVolatile(in2Var, f21575f);
            if (in2Var2 != null) {
                return in2Var2;
            }
            in2 in2Var3 = new in2(in2Var.f21577a * 2, in2Var.f21578b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = in2Var.f21579c;
                int i4 = i & i3;
                if (i4 != (i3 & i2)) {
                    ?? hn2Var = in2Var.f21580d.get(i4);
                    if (hn2Var == 0) {
                        hn2Var = new hn2();
                        hn2Var.f20719a = i;
                        VarHandle.storeStoreFence();
                    }
                    in2Var3.f21580d.set(in2Var3.f21579c & i, hn2Var);
                    i++;
                }
            }
            Unsafe unsafe2 = AbstractC1078qo.f28633a;
            unsafe2.putLongVolatile(in2Var3, f21576g, j & (-1152921504606846977L));
            unsafe2.compareAndSwapObject(in2Var, f21575f, (Object) null, in2Var3);
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m6823d() {
        in2 in2VarM6822c = this;
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j = f21576g;
            long longVolatile = unsafe.getLongVolatile(in2VarM6822c, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                return f21574e;
            }
            int i = (int) (longVolatile & 1073741823);
            int i2 = in2VarM6822c.f21579c;
            int i3 = ((int) ((1152921503533105152L & longVolatile) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 != i4) {
                AtomicReferenceArray atomicReferenceArray = in2VarM6822c.f21580d;
                Object obj = atomicReferenceArray.get(i4);
                boolean z = in2VarM6822c.f21578b;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof hn2)) {
                    long j2 = (i + 1) & 1073741823;
                    if (unsafe.compareAndSwapLong(in2VarM6822c, j, longVolatile, (longVolatile & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i4, null);
                        return obj;
                    }
                    in2VarM6822c = this;
                    if (z) {
                        while (true) {
                            Unsafe unsafe2 = AbstractC1078qo.f28633a;
                            long j3 = f21576g;
                            long longVolatile2 = unsafe2.getLongVolatile(in2VarM6822c, j3);
                            int i5 = (int) (longVolatile2 & 1073741823);
                            if ((longVolatile2 & 1152921504606846976L) != 0) {
                                in2VarM6822c = in2VarM6822c.m6822c();
                            } else {
                                if (unsafe2.compareAndSwapLong(in2VarM6822c, j3, longVolatile2, (longVolatile2 & (-1073741824)) | j2)) {
                                    in2VarM6822c.f21580d.set(in2VarM6822c.f21579c & i5, null);
                                    in2VarM6822c = null;
                                } else {
                                    continue;
                                }
                            }
                            if (in2VarM6822c == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
