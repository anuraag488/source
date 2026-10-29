package p000;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vx5 extends sx5 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f32915a;

    /* JADX INFO: renamed from: b */
    public static final long f32916b;

    /* JADX INFO: renamed from: c */
    public static final long f32917c;

    /* JADX INFO: renamed from: d */
    public static final long f32918d;

    /* JADX INFO: renamed from: e */
    public static final long f32919e;

    /* JADX INFO: renamed from: f */
    public static final long f32920f;

    static {
        Unsafe unsafeM12016i;
        try {
            try {
                unsafeM12016i = Unsafe.getUnsafe();
            } catch (Exception e) {
                xy4.m12785n("Could not initialize intrinsics", e);
                return;
            }
        } catch (SecurityException unused) {
            try {
                unsafeM12016i = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, new C0672g1((byte) 5));
            } catch (Exception unused2) {
                unsafeM12016i = m12016i();
            }
        }
        try {
            f32917c = unsafeM12016i.objectFieldOffset(yx5.class.getDeclaredField("c"));
            f32916b = unsafeM12016i.objectFieldOffset(yx5.class.getDeclaredField("b"));
            f32918d = unsafeM12016i.objectFieldOffset(yx5.class.getDeclaredField("a"));
            f32919e = unsafeM12016i.objectFieldOffset(wx5.class.getDeclaredField("a"));
            f32920f = unsafeM12016i.objectFieldOffset(wx5.class.getDeclaredField("b"));
            f32915a = unsafeM12016i;
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Unsafe m12016i() throws IllegalAccessException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // p000.sx5
    /* JADX INFO: renamed from: a */
    public final px5 mo10947a(e06 e06Var) {
        px5 px5Var;
        px5 px5Var2 = px5.f28071d;
        do {
            px5Var = e06Var.f35606b;
            if (px5Var2 == px5Var) {
                break;
            }
        } while (!mo10951f(e06Var, px5Var, px5Var2));
        return px5Var;
    }

    @Override // p000.sx5
    /* JADX INFO: renamed from: c */
    public final wx5 mo10948c(e06 e06Var) {
        wx5 wx5Var;
        wx5 wx5Var2 = wx5.f33841c;
        do {
            wx5Var = e06Var.f35607c;
            if (wx5Var2 == wx5Var) {
                break;
            }
        } while (!mo10953h(e06Var, wx5Var, wx5Var2));
        return wx5Var;
    }

    @Override // p000.sx5
    /* JADX INFO: renamed from: d */
    public final void mo10949d(wx5 wx5Var, wx5 wx5Var2) {
        f32915a.putObject(wx5Var, f32920f, wx5Var2);
    }

    @Override // p000.sx5
    /* JADX INFO: renamed from: e */
    public final void mo10950e(wx5 wx5Var, Thread thread) {
        f32915a.putObject(wx5Var, f32919e, thread);
    }

    @Override // p000.sx5
    /* JADX INFO: renamed from: f */
    public final boolean mo10951f(e06 e06Var, px5 px5Var, px5 px5Var2) {
        while (true) {
            Unsafe unsafe = f32915a;
            long j = f32916b;
            e06 e06Var2 = e06Var;
            px5 px5Var3 = px5Var;
            px5 px5Var4 = px5Var2;
            if (unsafe.compareAndSwapObject(e06Var2, j, px5Var3, px5Var4)) {
                return true;
            }
            if (unsafe.getObject(e06Var2, j) != px5Var3) {
                return false;
            }
            e06Var = e06Var2;
            px5Var = px5Var3;
            px5Var2 = px5Var4;
        }
    }

    @Override // p000.sx5
    /* JADX INFO: renamed from: g */
    public final boolean mo10952g(yx5 yx5Var, Object obj, Object obj2) {
        while (true) {
            Unsafe unsafe = f32915a;
            long j = f32918d;
            yx5 yx5Var2 = yx5Var;
            Object obj3 = obj;
            Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(yx5Var2, j, obj3, obj4)) {
                return true;
            }
            if (unsafe.getObject(yx5Var2, j) != obj3) {
                return false;
            }
            yx5Var = yx5Var2;
            obj = obj3;
            obj2 = obj4;
        }
    }

    @Override // p000.sx5
    /* JADX INFO: renamed from: h */
    public final boolean mo10953h(yx5 yx5Var, wx5 wx5Var, wx5 wx5Var2) {
        while (true) {
            Unsafe unsafe = f32915a;
            long j = f32917c;
            yx5 yx5Var2 = yx5Var;
            wx5 wx5Var3 = wx5Var;
            wx5 wx5Var4 = wx5Var2;
            if (unsafe.compareAndSwapObject(yx5Var2, j, wx5Var3, wx5Var4)) {
                return true;
            }
            if (unsafe.getObject(yx5Var2, j) != wx5Var3) {
                return false;
            }
            yx5Var = yx5Var2;
            wx5Var = wx5Var3;
            wx5Var2 = wx5Var4;
        }
    }
}
