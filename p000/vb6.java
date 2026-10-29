package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class vb6 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f32511a;

    /* JADX INFO: renamed from: b */
    public static final Class f32512b;

    /* JADX INFO: renamed from: c */
    public static final bv4 f32513c;

    /* JADX INFO: renamed from: d */
    public static final boolean f32514d;

    /* JADX INFO: renamed from: e */
    public static final boolean f32515e;

    static {
        boolean z;
        bv4 bv4Var;
        Unsafe unsafeM11793d = m11793d();
        f32511a = unsafeM11793d;
        int i = a46.f101a;
        f32512b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM11800k = m11800k(cls);
        Class cls2 = Integer.TYPE;
        boolean zM11800k2 = m11800k(cls2);
        boolean z2 = true;
        qb6 qb6Var = null;
        byte b = 0;
        if (unsafeM11793d != null) {
            if (zM11800k) {
                qb6Var = new qb6(unsafeM11793d, z2 ? 1 : 0);
            } else if (zM11800k2) {
                qb6Var = new qb6(unsafeM11793d, b);
            }
        }
        f32513c = qb6Var;
        if (qb6Var != null) {
            try {
                Class<?> cls3 = qb6Var.f15653b.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                m11803n();
            } catch (Throwable th) {
                Logger.getLogger(vb6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        bv4 bv4Var2 = f32513c;
        if (bv4Var2 == null) {
            z = false;
        } else {
            try {
                Class<?> cls4 = bv4Var2.f15653b.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z = true;
            } catch (Throwable th2) {
                Logger.getLogger(vb6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z = false;
            }
        }
        f32514d = z;
        m11801l(byte[].class);
        m11801l(boolean[].class);
        m11802m(boolean[].class);
        m11801l(int[].class);
        m11802m(int[].class);
        m11801l(long[].class);
        m11802m(long[].class);
        m11801l(float[].class);
        m11802m(float[].class);
        m11801l(double[].class);
        m11802m(double[].class);
        m11801l(Object[].class);
        m11802m(Object[].class);
        Field fieldM11803n = m11803n();
        if (fieldM11803n != null && (bv4Var = f32513c) != null) {
            bv4Var.f15653b.objectFieldOffset(fieldM11803n);
        }
        f32515e = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static int m11790a(long j, Object obj) {
        return f32513c.f15653b.getInt(obj, j);
    }

    /* JADX INFO: renamed from: b */
    public static long m11791b(long j, Object obj) {
        return f32513c.f15653b.getLong(obj, j);
    }

    /* JADX INFO: renamed from: c */
    public static Object m11792c(long j, Object obj) {
        return f32513c.f15653b.getObject(obj, j);
    }

    /* JADX INFO: renamed from: d */
    public static Unsafe m11793d() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C0672g1((byte) 6));
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(vb6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m11794e(long j, Object obj, boolean z) {
        Unsafe unsafe = f32513c.f15653b;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((z ? 1 : 0) << i2) | ((~(255 << i2)) & i));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m11795f(long j, Object obj, boolean z) {
        Unsafe unsafe = f32513c.f15653b;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((z ? 1 : 0) << i) | ((~(255 << i)) & unsafe.getInt(obj, j2)));
    }

    /* JADX INFO: renamed from: g */
    public static void m11796g(long j, int i, Object obj) {
        f32513c.f15653b.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: h */
    public static void m11797h(long j, Object obj, Object obj2) {
        f32513c.f15653b.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ boolean m11798i(long j, Object obj) {
        return ((byte) ((f32513c.f15653b.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ boolean m11799j(long j, Object obj) {
        return ((byte) ((f32513c.f15653b.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m11800k(Class cls) {
        int i = a46.f101a;
        try {
            Class cls2 = f32512b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m11801l(Class cls) {
        if (f32514d) {
            f32513c.f15653b.arrayBaseOffset(cls);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m11802m(Class cls) {
        if (f32514d) {
            f32513c.f15653b.arrayIndexScale(cls);
        }
    }

    /* JADX INFO: renamed from: n */
    public static Field m11803n() {
        Field declaredField;
        Field declaredField2;
        int i = a46.f101a;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }
}
