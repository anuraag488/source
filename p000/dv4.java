package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class dv4 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f17429a;

    /* JADX INFO: renamed from: b */
    public static final Class f17430b;

    /* JADX INFO: renamed from: c */
    public static final bv4 f17431c;

    /* JADX INFO: renamed from: d */
    public static final boolean f17432d;

    /* JADX INFO: renamed from: e */
    public static final boolean f17433e;

    static {
        Unsafe unsafeM4759i = m4759i();
        f17429a = unsafeM4759i;
        f17430b = AbstractC1176tb.f31045a;
        boolean zM4754d = m4754d(Long.TYPE);
        boolean zM4754d2 = m4754d(Integer.TYPE);
        boolean z = true;
        byte b = 0;
        av4 av4Var = null;
        if (unsafeM4759i != null) {
            if (!AbstractC1176tb.m11018a()) {
                av4Var = new av4(unsafeM4759i, (byte) 2);
            } else if (zM4754d) {
                av4Var = new av4(unsafeM4759i, z ? 1 : 0);
            } else if (zM4754d2) {
                av4Var = new av4(unsafeM4759i, b);
            }
        }
        f17431c = av4Var;
        if (av4Var != null) {
            av4Var.mo3323j();
        }
        f17432d = av4Var == null ? false : av4Var.mo3322i();
        m4751a(byte[].class);
        m4751a(boolean[].class);
        m4752b(boolean[].class);
        m4751a(int[].class);
        m4752b(int[].class);
        m4751a(long[].class);
        m4752b(long[].class);
        m4751a(float[].class);
        m4752b(float[].class);
        m4751a(double[].class);
        m4752b(double[].class);
        m4751a(Object[].class);
        m4752b(Object[].class);
        Field fieldM4753c = m4753c();
        if (fieldM4753c != null && av4Var != null) {
            av4Var.f15653b.objectFieldOffset(fieldM4753c);
        }
        f17433e = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static int m4751a(Class cls) {
        if (f17432d) {
            return f17431c.f15653b.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static void m4752b(Class cls) {
        if (f17432d) {
            f17431c.f15653b.arrayIndexScale(cls);
        }
    }

    /* JADX INFO: renamed from: c */
    public static Field m4753c() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC1176tb.m11018a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m4754d(Class cls) {
        if (!AbstractC1176tb.m11018a()) {
            return false;
        }
        try {
            Class cls2 = f17430b;
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

    /* JADX INFO: renamed from: e */
    public static boolean m4755e(long j, Object obj) {
        return ((byte) ((m4756f((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: f */
    public static int m4756f(long j, Object obj) {
        return f17431c.f15653b.getInt(obj, j);
    }

    /* JADX INFO: renamed from: g */
    public static long m4757g(long j, Object obj) {
        return f17431c.f15653b.getLong(obj, j);
    }

    /* JADX INFO: renamed from: h */
    public static Object m4758h(long j, Object obj) {
        return f17431c.f15653b.getObject(obj, j);
    }

    /* JADX INFO: renamed from: i */
    public static Unsafe m4759i() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C0672g1((byte) 2));
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
            Logger.getLogger(dv4.class.getName()).log(Level.WARNING, "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m4760j(Throwable th) {
        Logger.getLogger(dv4.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX INFO: renamed from: k */
    public static void m4761k(long j, Object obj, boolean z) {
        byte b = z ? (byte) 1 : (byte) 0;
        long j2 = (-4) & j;
        int iM4756f = m4756f(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m4763m(j2, ((255 & b) << i) | (iM4756f & (~(255 << i))), obj);
    }

    /* JADX INFO: renamed from: l */
    public static void m4762l(long j, Object obj, boolean z) {
        byte b = z ? (byte) 1 : (byte) 0;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m4763m(j2, ((255 & b) << i) | (m4756f(j2, obj) & (~(255 << i))), obj);
    }

    /* JADX INFO: renamed from: m */
    public static void m4763m(long j, int i, Object obj) {
        f17431c.f15653b.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: n */
    public static void m4764n(Object obj, long j, long j2) {
        f17431c.f15653b.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: o */
    public static void m4765o(long j, Object obj, Object obj2) {
        f17431c.f15653b.putObject(obj, j, obj2);
    }
}
