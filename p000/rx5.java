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
public abstract class rx5 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f29717a;

    /* JADX INFO: renamed from: b */
    public static final Class f29718b;

    /* JADX INFO: renamed from: c */
    public static final bv4 f29719c;

    /* JADX INFO: renamed from: d */
    public static final boolean f29720d;

    /* JADX INFO: renamed from: e */
    public static final boolean f29721e;

    /* JADX WARN: Code duplicated, block: B:4:0x001d  */
    static {
        ix5 ix5Var;
        boolean z;
        Field declaredField;
        bv4 bv4Var;
        Field declaredField2;
        Unsafe unsafeM10486d = m10486d();
        f29717a = unsafeM10486d;
        f29718b = o36.f26319a;
        Class<?> cls = Long.TYPE;
        boolean zM10494l = m10494l(cls);
        Class cls2 = Integer.TYPE;
        boolean zM10494l2 = m10494l(cls2);
        boolean z2 = true;
        byte b = 0;
        Field field = null;
        if (unsafeM10486d == null) {
            ix5Var = null;
        } else if (zM10494l) {
            ix5Var = new ix5(unsafeM10486d, z2 ? 1 : 0);
        } else if (zM10494l2) {
            ix5Var = new ix5(unsafeM10486d, b);
        } else {
            ix5Var = null;
        }
        f29719c = ix5Var;
        if (ix5Var == null) {
            z = false;
        } else {
            try {
                Class<?> cls3 = ix5Var.f15653b.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("arrayBaseOffset", Class.class);
                cls3.getMethod("arrayIndexScale", Class.class);
                cls3.getMethod("getInt", Object.class, cls);
                cls3.getMethod("putInt", Object.class, cls, cls2);
                cls3.getMethod("getLong", Object.class, cls);
                cls3.getMethod("putLong", Object.class, cls, cls);
                cls3.getMethod("getObject", Object.class, cls);
                cls3.getMethod("putObject", Object.class, cls, Object.class);
                z = true;
            } catch (Throwable th) {
                Logger logger = Logger.getLogger(rx5.class.getName());
                th.toString();
                logger.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
                z = false;
            }
        }
        f29720d = z;
        m10495m(byte[].class);
        m10495m(boolean[].class);
        m10496n(boolean[].class);
        m10495m(int[].class);
        m10496n(int[].class);
        m10495m(long[].class);
        m10496n(long[].class);
        m10495m(float[].class);
        m10496n(float[].class);
        m10495m(double[].class);
        m10496n(double[].class);
        m10495m(Object[].class);
        m10496n(Object[].class);
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField == null) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("address");
            } catch (Throwable unused2) {
                declaredField2 = null;
            }
            if (declaredField2 != null && declaredField2.getType() == cls) {
                field = declaredField2;
            }
        } else {
            field = declaredField;
        }
        if (field != null && (bv4Var = f29719c) != null) {
            bv4Var.f15653b.objectFieldOffset(field);
        }
        f29721e = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static int m10483a(long j, Object obj) {
        return f29719c.f15653b.getInt(obj, j);
    }

    /* JADX INFO: renamed from: b */
    public static long m10484b(long j, Object obj) {
        return f29719c.f15653b.getLong(obj, j);
    }

    /* JADX INFO: renamed from: c */
    public static Object m10485c(long j, Object obj) {
        return f29719c.f15653b.getObject(obj, j);
    }

    /* JADX INFO: renamed from: d */
    public static Unsafe m10486d() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C0672g1((byte) 4));
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
            Logger.getLogger(rx5.class.getName()).log(Level.WARNING, "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m10487e(long j, Object obj, boolean z) {
        Unsafe unsafe = f29719c.f15653b;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((z ? 1 : 0) << i2) | ((~(255 << i2)) & i));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m10488f(long j, Object obj, boolean z) {
        Unsafe unsafe = f29719c.f15653b;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((z ? 1 : 0) << i) | ((~(255 << i)) & unsafe.getInt(obj, j2)));
    }

    /* JADX INFO: renamed from: g */
    public static void m10489g(long j, int i, Object obj) {
        f29719c.f15653b.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: h */
    public static void m10490h(Object obj, long j, long j2) {
        f29719c.f15653b.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: i */
    public static void m10491i(long j, Object obj, Object obj2) {
        f29719c.f15653b.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ boolean m10492j(long j, Object obj) {
        return ((byte) ((f29719c.f15653b.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ boolean m10493k(long j, Object obj) {
        return ((byte) ((f29719c.f15653b.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m10494l(Class cls) {
        Class cls2 = o36.f26319a;
        try {
            Class cls3 = f29718b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", cls, cls4);
            cls3.getMethod("pokeLong", cls, Long.TYPE, cls4);
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", cls, cls5, cls4);
            cls3.getMethod("peekInt", cls, cls4);
            cls3.getMethod("pokeByte", cls, Byte.TYPE);
            cls3.getMethod("peekByte", cls);
            cls3.getMethod("pokeByteArray", cls, byte[].class, cls5, cls5);
            cls3.getMethod("peekByteArray", cls, byte[].class, cls5, cls5);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m10495m(Class cls) {
        if (f29720d) {
            f29719c.f15653b.arrayBaseOffset(cls);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m10496n(Class cls) {
        if (f29720d) {
            f29719c.f15653b.arrayIndexScale(cls);
        }
    }
}
