package p000;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: h1 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0709h1 extends y62 {

    /* JADX INFO: renamed from: C */
    public static final Unsafe f20254C;

    /* JADX INFO: renamed from: D */
    public static final long f20255D;

    /* JADX INFO: renamed from: E */
    public static final long f20256E;

    /* JADX INFO: renamed from: F */
    public static final long f20257F;

    /* JADX INFO: renamed from: G */
    public static final long f20258G;

    /* JADX INFO: renamed from: H */
    public static final long f20259H;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                xy4.m12785n("Could not initialize intrinsics", e.getCause());
                return;
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new C0672g1((byte) 0));
        }
        try {
            f20256E = unsafe.objectFieldOffset(AbstractC0782j1.class.getDeclaredField("c"));
            f20255D = unsafe.objectFieldOffset(AbstractC0782j1.class.getDeclaredField("b"));
            f20257F = unsafe.objectFieldOffset(AbstractC0782j1.class.getDeclaredField("a"));
            f20258G = unsafe.objectFieldOffset(C0746i1.class.getDeclaredField("a"));
            f20259H = unsafe.objectFieldOffset(C0746i1.class.getDeclaredField("b"));
            f20254C = unsafe;
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        } catch (RuntimeException e3) {
            throw e3;
        }
    }

    @Override // p000.y62
    /* JADX INFO: renamed from: D */
    public final C0002a1 mo3394D(AbstractC0782j1 abstractC0782j1) {
        C0002a1 c0002a1;
        C0002a1 c0002a2 = C0002a1.f28d;
        do {
            c0002a1 = abstractC0782j1.f21943b;
            if (c0002a2 == c0002a1) {
                break;
            }
        } while (!mo3398s(abstractC0782j1, c0002a1, c0002a2));
        return c0002a1;
    }

    @Override // p000.y62
    /* JADX INFO: renamed from: E */
    public final C0746i1 mo3395E(AbstractC0782j1 abstractC0782j1) {
        C0746i1 c0746i1;
        C0746i1 c0746i2 = C0746i1.f20994c;
        do {
            c0746i1 = abstractC0782j1.f21944c;
            if (c0746i2 == c0746i1) {
                break;
            }
        } while (!mo3400u(abstractC0782j1, c0746i1, c0746i2));
        return c0746i1;
    }

    @Override // p000.y62
    /* JADX INFO: renamed from: T */
    public final void mo3396T(C0746i1 c0746i1, C0746i1 c0746i2) {
        f20254C.putObject(c0746i1, f20259H, c0746i2);
    }

    @Override // p000.y62
    /* JADX INFO: renamed from: U */
    public final void mo3397U(C0746i1 c0746i1, Thread thread) {
        f20254C.putObject(c0746i1, f20258G, thread);
    }

    @Override // p000.y62
    /* JADX INFO: renamed from: s */
    public final boolean mo3398s(AbstractC0782j1 abstractC0782j1, C0002a1 c0002a1, C0002a1 c0002a2) {
        return f20254C.compareAndSwapObject(abstractC0782j1, f20255D, c0002a1, c0002a2);
    }

    @Override // p000.y62
    /* JADX INFO: renamed from: t */
    public final boolean mo3399t(AbstractC0782j1 abstractC0782j1, Object obj, Object obj2) {
        return f20254C.compareAndSwapObject(abstractC0782j1, f20257F, obj, obj2);
    }

    @Override // p000.y62
    /* JADX INFO: renamed from: u */
    public final boolean mo3400u(AbstractC0782j1 abstractC0782j1, C0746i1 c0746i1, C0746i1 c0746i2) {
        return f20254C.compareAndSwapObject(abstractC0782j1, f20256E, c0746i1, c0746i2);
    }
}
