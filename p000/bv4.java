package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class bv4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15652a;

    /* JADX INFO: renamed from: b */
    public final Unsafe f15653b;

    public /* synthetic */ bv4(Unsafe unsafe, byte b) {
        this.f15652a = b;
        this.f15653b = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo3316a(long j, Object obj);

    /* JADX INFO: renamed from: b */
    public abstract byte mo3729b(long j, Object obj);

    /* JADX INFO: renamed from: c */
    public abstract double mo3317c(long j, Object obj);

    /* JADX INFO: renamed from: d */
    public abstract float mo3318d(long j, Object obj);

    /* JADX INFO: renamed from: e */
    public abstract void mo3319e(long j, Object obj, boolean z);

    /* JADX INFO: renamed from: f */
    public abstract void mo3730f(Object obj, long j, byte b);

    /* JADX INFO: renamed from: g */
    public abstract void mo3320g(Object obj, long j, double d);

    /* JADX INFO: renamed from: h */
    public abstract void mo3321h(Object obj, long j, float f);

    /* JADX INFO: renamed from: i */
    public boolean mo3322i() {
        byte b = this.f15652a;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        Unsafe unsafe = this.f15653b;
        switch (b) {
            case 0:
                if (unsafe != null) {
                    try {
                        Class<?> cls3 = unsafe.getClass();
                        cls3.getMethod("objectFieldOffset", Field.class);
                        cls3.getMethod("arrayBaseOffset", Class.class);
                        cls3.getMethod("arrayIndexScale", Class.class);
                        cls3.getMethod("getInt", Object.class, cls2);
                        cls3.getMethod("putInt", Object.class, cls2, cls);
                        cls3.getMethod("getLong", Object.class, cls2);
                        cls3.getMethod("putLong", Object.class, cls2, cls2);
                        cls3.getMethod("getObject", Object.class, cls2);
                        cls3.getMethod("putObject", Object.class, cls2, Object.class);
                        return true;
                    } catch (Throwable th) {
                        cv4.m4184k(th);
                    }
                }
                return false;
            default:
                if (unsafe != null) {
                    try {
                        Class<?> cls4 = unsafe.getClass();
                        cls4.getMethod("objectFieldOffset", Field.class);
                        cls4.getMethod("arrayBaseOffset", Class.class);
                        cls4.getMethod("arrayIndexScale", Class.class);
                        cls4.getMethod("getInt", Object.class, cls2);
                        cls4.getMethod("putInt", Object.class, cls2, cls);
                        cls4.getMethod("getLong", Object.class, cls2);
                        cls4.getMethod("putLong", Object.class, cls2, cls2);
                        cls4.getMethod("getObject", Object.class, cls2);
                        cls4.getMethod("putObject", Object.class, cls2, Object.class);
                        return true;
                    } catch (Throwable th2) {
                        dv4.m4760j(th2);
                    }
                }
                return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract boolean mo3323j();

    /* JADX INFO: renamed from: k */
    public abstract double mo3731k(long j, Object obj);

    /* JADX INFO: renamed from: l */
    public abstract void mo3732l(Object obj, long j, byte b);

    /* JADX INFO: renamed from: m */
    public abstract float mo3733m(long j, Object obj);

    /* JADX INFO: renamed from: n */
    public abstract boolean mo3734n(long j, Object obj);

    /* JADX INFO: renamed from: o */
    public abstract void mo3735o(long j, Object obj, boolean z);

    /* JADX INFO: renamed from: p */
    public abstract float mo3736p(long j, Object obj);

    /* JADX INFO: renamed from: q */
    public abstract void mo3737q(Object obj, long j, byte b);

    /* JADX INFO: renamed from: r */
    public abstract void mo3738r(Object obj, long j, double d);

    /* JADX INFO: renamed from: s */
    public abstract void mo3739s(Object obj, long j, double d);

    /* JADX INFO: renamed from: t */
    public abstract void mo3740t(Object obj, long j, float f);

    /* JADX INFO: renamed from: u */
    public abstract double mo3741u(long j, Object obj);

    /* JADX INFO: renamed from: v */
    public abstract void mo3742v(Object obj, long j, float f);

    /* JADX INFO: renamed from: w */
    public abstract boolean mo3743w(long j, Object obj);

    /* JADX INFO: renamed from: x */
    public abstract void mo3744x(Object obj, long j, double d);

    /* JADX INFO: renamed from: y */
    public abstract boolean mo3745y(long j, Object obj);
}
