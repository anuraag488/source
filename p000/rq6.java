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
public abstract class rq6 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f29534a;

    /* JADX INFO: renamed from: b */
    public static final Class f29535b;

    /* JADX INFO: renamed from: c */
    public static final bv4 f29536c;

    /* JADX INFO: renamed from: d */
    public static final boolean f29537d;

    /* JADX INFO: renamed from: e */
    public static final boolean f29538e;

    /* JADX INFO: renamed from: f */
    public static final long f29539f;

    /* JADX INFO: renamed from: g */
    public static final boolean f29540g;

    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    static {
        Unsafe unsafe;
        boolean z;
        boolean z2;
        bv4 bv4Var;
        qq6 qq6Var = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C0672g1((byte) 8));
        } catch (Throwable unused) {
            unsafe = null;
        }
        f29534a = unsafe;
        int i = lm6.f24186a;
        f29535b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM10412l = m10412l(cls);
        Class cls2 = Integer.TYPE;
        boolean zM10412l2 = m10412l(cls2);
        boolean z3 = true;
        byte b = 0;
        if (unsafe != null) {
            if (zM10412l) {
                qq6Var = new qq6(unsafe, z3 ? 1 : 0);
            } else if (zM10412l2) {
                qq6Var = new qq6(unsafe, b);
            }
        }
        f29536c = qq6Var;
        if (qq6Var == null) {
            z = false;
        } else {
            try {
                Class<?> cls3 = qq6Var.f15653b.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (m10402b() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                Logger.getLogger(rq6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        f29537d = z;
        bv4 bv4Var2 = f29536c;
        if (bv4Var2 == null) {
            z2 = false;
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
                z2 = true;
            } catch (Throwable th2) {
                Logger.getLogger(rq6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z2 = false;
            }
        }
        f29538e = z2;
        f29539f = m10413m(byte[].class);
        m10413m(boolean[].class);
        m10401a(boolean[].class);
        m10413m(int[].class);
        m10401a(int[].class);
        m10413m(long[].class);
        m10401a(long[].class);
        m10413m(float[].class);
        m10401a(float[].class);
        m10413m(double[].class);
        m10401a(double[].class);
        m10413m(Object[].class);
        m10401a(Object[].class);
        Field fieldM10402b = m10402b();
        if (fieldM10402b != null && (bv4Var = f29536c) != null) {
            bv4Var.f15653b.objectFieldOffset(fieldM10402b);
        }
        f29540g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static void m10401a(Class cls) {
        if (f29538e) {
            f29536c.f15653b.arrayIndexScale(cls);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Field m10402b() {
        Field declaredField;
        Field declaredField2;
        int i = lm6.f24186a;
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

    /* JADX INFO: renamed from: c */
    public static void m10403c(Object obj, long j, byte b) {
        Unsafe unsafe = f29536c.f15653b;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: renamed from: d */
    public static void m10404d(Object obj, long j, byte b) {
        Unsafe unsafe = f29536c.f15653b;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: e */
    public static int m10405e(long j, Object obj) {
        return f29536c.f15653b.getInt(obj, j);
    }

    /* JADX INFO: renamed from: f */
    public static long m10406f(long j, Object obj) {
        return f29536c.f15653b.getLong(obj, j);
    }

    /* JADX INFO: renamed from: g */
    public static Object m10407g(long j, Object obj) {
        return f29536c.f15653b.getObject(obj, j);
    }

    /* JADX INFO: renamed from: h */
    public static void m10408h(long j, int i, Object obj) {
        f29536c.f15653b.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: i */
    public static void m10409i(long j, Object obj, Object obj2) {
        f29536c.f15653b.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ boolean m10410j(long j, Object obj) {
        return ((byte) ((f29536c.f15653b.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ boolean m10411k(long j, Object obj) {
        return ((byte) ((f29536c.f15653b.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m10412l(Class cls) {
        int i = lm6.f24186a;
        try {
            Class cls2 = f29535b;
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

    /* JADX INFO: renamed from: m */
    public static int m10413m(Class cls) {
        if (f29538e) {
            return f29536c.f15653b.arrayBaseOffset(cls);
        }
        return -1;
    }
}
