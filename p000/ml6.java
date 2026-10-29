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
public abstract class ml6 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f25010a;

    /* JADX INFO: renamed from: b */
    public static final Class f25011b;

    /* JADX INFO: renamed from: c */
    public static final bv4 f25012c;

    /* JADX INFO: renamed from: d */
    public static final boolean f25013d;

    /* JADX INFO: renamed from: e */
    public static final boolean f25014e;

    /* JADX INFO: renamed from: f */
    public static final long f25015f;

    /* JADX INFO: renamed from: g */
    public static final boolean f25016g;

    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    static {
        Unsafe unsafe;
        boolean z;
        boolean z2;
        bv4 bv4Var;
        il6 il6Var = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C0672g1((byte) 7));
        } catch (Throwable unused) {
            unsafe = null;
        }
        f25010a = unsafe;
        int i = lf6.f24009a;
        f25011b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM8354j = m8354j(cls);
        Class cls2 = Integer.TYPE;
        boolean zM8354j2 = m8354j(cls2);
        boolean z3 = true;
        byte b = 0;
        if (unsafe != null) {
            if (zM8354j) {
                il6Var = new il6(unsafe, z3 ? 1 : 0);
            } else if (zM8354j2) {
                il6Var = new il6(unsafe, b);
            }
        }
        f25012c = il6Var;
        if (il6Var == null) {
            z = false;
        } else {
            try {
                Class<?> cls3 = il6Var.f15653b.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (m8346b() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                Logger.getLogger(ml6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        f25013d = z;
        bv4 bv4Var2 = f25012c;
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
                Logger.getLogger(ml6.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z2 = false;
            }
        }
        f25014e = z2;
        f25015f = m8357m(byte[].class);
        m8357m(boolean[].class);
        m8345a(boolean[].class);
        m8357m(int[].class);
        m8345a(int[].class);
        m8357m(long[].class);
        m8345a(long[].class);
        m8357m(float[].class);
        m8345a(float[].class);
        m8357m(double[].class);
        m8345a(double[].class);
        m8357m(Object[].class);
        m8345a(Object[].class);
        Field fieldM8346b = m8346b();
        if (fieldM8346b != null && (bv4Var = f25012c) != null) {
            bv4Var.f15653b.objectFieldOffset(fieldM8346b);
        }
        f25016g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static void m8345a(Class cls) {
        if (f25014e) {
            f25012c.f15653b.arrayIndexScale(cls);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Field m8346b() {
        Field declaredField;
        Field declaredField2;
        int i = lf6.f24009a;
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
    public static void m8347c(Object obj, long j, byte b) {
        Unsafe unsafe = f25012c.f15653b;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: renamed from: d */
    public static void m8348d(Object obj, long j, byte b) {
        Unsafe unsafe = f25012c.f15653b;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: e */
    public static int m8349e(long j, Object obj) {
        return f25012c.f15653b.getInt(obj, j);
    }

    /* JADX INFO: renamed from: f */
    public static void m8350f(long j, int i, Object obj) {
        f25012c.f15653b.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: g */
    public static long m8351g(long j, Object obj) {
        return f25012c.f15653b.getLong(obj, j);
    }

    /* JADX INFO: renamed from: h */
    public static Object m8352h(long j, Object obj) {
        return f25012c.f15653b.getObject(obj, j);
    }

    /* JADX INFO: renamed from: i */
    public static void m8353i(long j, Object obj, Object obj2) {
        f25012c.f15653b.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m8354j(Class cls) {
        int i = lf6.f24009a;
        try {
            Class cls2 = f25011b;
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

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ boolean m8355k(long j, Object obj) {
        return ((byte) ((f25012c.f15653b.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ boolean m8356l(long j, Object obj) {
        return ((byte) ((f25012c.f15653b.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: m */
    public static int m8357m(Class cls) {
        if (f25014e) {
            return f25012c.f15653b.arrayBaseOffset(cls);
        }
        return -1;
    }
}
