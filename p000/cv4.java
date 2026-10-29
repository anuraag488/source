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
public abstract class cv4 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f16510a;

    /* JADX INFO: renamed from: b */
    public static final Class f16511b;

    /* JADX INFO: renamed from: c */
    public static final bv4 f16512c;

    /* JADX INFO: renamed from: d */
    public static final boolean f16513d;

    /* JADX INFO: renamed from: e */
    public static final boolean f16514e;

    /* JADX INFO: renamed from: f */
    public static final long f16515f;

    /* JADX INFO: renamed from: g */
    public static final boolean f16516g;

    static {
        Unsafe unsafe;
        boolean z = true;
        zu4 zu4Var = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C0672g1((byte) 1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        f16510a = unsafe;
        f16511b = AbstractC1139sb.f30044a;
        boolean zM4177d = m4177d(Long.TYPE);
        boolean zM4177d2 = m4177d(Integer.TYPE);
        byte b = 0;
        if (unsafe != null) {
            if (!AbstractC1139sb.m10589a()) {
                zu4Var = new zu4(unsafe, (byte) 2);
            } else if (zM4177d) {
                zu4Var = new zu4(unsafe, z ? 1 : 0);
            } else if (zM4177d2) {
                zu4Var = new zu4(unsafe, b);
            }
        }
        f16512c = zu4Var;
        f16513d = zu4Var == null ? false : zu4Var.mo3323j();
        f16514e = zu4Var == null ? false : zu4Var.mo3322i();
        f16515f = m4174a(byte[].class);
        m4174a(boolean[].class);
        m4175b(boolean[].class);
        m4174a(int[].class);
        m4175b(int[].class);
        m4174a(long[].class);
        m4175b(long[].class);
        m4174a(float[].class);
        m4175b(float[].class);
        m4174a(double[].class);
        m4175b(double[].class);
        m4174a(Object[].class);
        m4175b(Object[].class);
        Field fieldM4176c = m4176c();
        if (fieldM4176c != null && zu4Var != null) {
            zu4Var.f15653b.objectFieldOffset(fieldM4176c);
        }
        f16516g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static int m4174a(Class cls) {
        if (f16514e) {
            return f16512c.f15653b.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static void m4175b(Class cls) {
        if (f16514e) {
            f16512c.f15653b.arrayIndexScale(cls);
        }
    }

    /* JADX INFO: renamed from: c */
    public static Field m4176c() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC1139sb.m10589a()) {
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
    public static boolean m4177d(Class cls) {
        if (!AbstractC1139sb.m10589a()) {
            return false;
        }
        try {
            Class cls2 = f16511b;
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
    public static byte m4178e(byte[] bArr, long j) {
        return f16512c.mo3729b(f16515f + j, bArr);
    }

    /* JADX INFO: renamed from: f */
    public static byte m4179f(long j, Object obj) {
        return (byte) ((m4181h((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: g */
    public static byte m4180g(long j, Object obj) {
        return (byte) ((m4181h((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: h */
    public static int m4181h(long j, Object obj) {
        return f16512c.f15653b.getInt(obj, j);
    }

    /* JADX INFO: renamed from: i */
    public static long m4182i(long j, Object obj) {
        return f16512c.f15653b.getLong(obj, j);
    }

    /* JADX INFO: renamed from: j */
    public static Object m4183j(long j, Object obj) {
        return f16512c.f15653b.getObject(obj, j);
    }

    /* JADX INFO: renamed from: k */
    public static void m4184k(Throwable th) {
        Logger.getLogger(cv4.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX INFO: renamed from: l */
    public static void m4185l(byte[] bArr, long j, byte b) {
        f16512c.mo3730f(bArr, f16515f + j, b);
    }

    /* JADX INFO: renamed from: m */
    public static void m4186m(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM4181h = m4181h(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m4188o(j2, ((255 & b) << i) | (iM4181h & (~(255 << i))), obj);
    }

    /* JADX INFO: renamed from: n */
    public static void m4187n(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m4188o(j2, ((255 & b) << i) | (m4181h(j2, obj) & (~(255 << i))), obj);
    }

    /* JADX INFO: renamed from: o */
    public static void m4188o(long j, int i, Object obj) {
        f16512c.f15653b.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: p */
    public static void m4189p(Object obj, long j, long j2) {
        f16512c.f15653b.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: q */
    public static void m4190q(long j, Object obj, Object obj2) {
        f16512c.f15653b.putObject(obj, j, obj2);
    }
}
