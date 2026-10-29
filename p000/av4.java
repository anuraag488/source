package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class av4 extends bv4 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ byte f14905c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ av4(Unsafe unsafe, byte b) {
        super(unsafe, (byte) 1);
        this.f14905c = b;
    }

    @Override // p000.bv4
    /* JADX INFO: renamed from: a */
    public final boolean mo3316a(long j, Object obj) {
        switch (this.f14905c) {
            case 0:
                if (dv4.f17433e) {
                    return dv4.m4755e(j, obj);
                }
                return ((byte) ((dv4.m4756f((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
            case 1:
                if (dv4.f17433e) {
                    return dv4.m4755e(j, obj);
                }
                return ((byte) ((dv4.m4756f((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
            default:
                return this.f15653b.getBoolean(obj, j);
        }
    }

    @Override // p000.bv4
    /* JADX INFO: renamed from: c */
    public final double mo3317c(long j, Object obj) {
        switch (this.f14905c) {
            case 0:
                return Double.longBitsToDouble(this.f15653b.getLong(obj, j));
            case 1:
                return Double.longBitsToDouble(this.f15653b.getLong(obj, j));
            default:
                return this.f15653b.getDouble(obj, j);
        }
    }

    @Override // p000.bv4
    /* JADX INFO: renamed from: d */
    public final float mo3318d(long j, Object obj) {
        switch (this.f14905c) {
            case 0:
                return Float.intBitsToFloat(this.f15653b.getInt(obj, j));
            case 1:
                return Float.intBitsToFloat(this.f15653b.getInt(obj, j));
            default:
                return this.f15653b.getFloat(obj, j);
        }
    }

    @Override // p000.bv4
    /* JADX INFO: renamed from: e */
    public final void mo3319e(long j, Object obj, boolean z) {
        switch (this.f14905c) {
            case 0:
                if (!dv4.f17433e) {
                    dv4.m4762l(j, obj, z);
                } else {
                    dv4.m4761k(j, obj, z);
                }
                break;
            case 1:
                if (!dv4.f17433e) {
                    dv4.m4762l(j, obj, z);
                } else {
                    dv4.m4761k(j, obj, z);
                }
                break;
            default:
                this.f15653b.putBoolean(obj, j, z);
                break;
        }
    }

    @Override // p000.bv4
    /* JADX INFO: renamed from: g */
    public final void mo3320g(Object obj, long j, double d) {
        switch (this.f14905c) {
            case 0:
                this.f15653b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            case 1:
                this.f15653b.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.f15653b.putDouble(obj, j, d);
                break;
        }
    }

    @Override // p000.bv4
    /* JADX INFO: renamed from: h */
    public final void mo3321h(Object obj, long j, float f) {
        switch (this.f14905c) {
            case 0:
                this.f15653b.putInt(obj, j, Float.floatToIntBits(f));
                break;
            case 1:
                this.f15653b.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                this.f15653b.putFloat(obj, j, f);
                break;
        }
    }

    @Override // p000.bv4
    /* JADX INFO: renamed from: i */
    public boolean mo3322i() {
        switch (this.f14905c) {
            case 2:
                if (!super.mo3322i()) {
                    return false;
                }
                try {
                    Class<?> cls = this.f15653b.getClass();
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getByte", Object.class, cls2);
                    cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                    cls.getMethod("getBoolean", Object.class, cls2);
                    cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                    cls.getMethod("getFloat", Object.class, cls2);
                    cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                    cls.getMethod("getDouble", Object.class, cls2);
                    cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                    return true;
                } catch (Throwable th) {
                    dv4.m4760j(th);
                    return false;
                }
            default:
                return super.mo3322i();
        }
    }

    @Override // p000.bv4
    /* JADX INFO: renamed from: j */
    public final boolean mo3323j() {
        switch (this.f14905c) {
            case 0:
            case 1:
                return false;
            default:
                Unsafe unsafe = this.f15653b;
                if (unsafe == null) {
                    return false;
                }
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getLong", Object.class, cls2);
                    if (dv4.m4753c() == null) {
                        return false;
                    }
                    try {
                        Class<?> cls3 = unsafe.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        dv4.m4760j(th);
                        return false;
                    }
                } catch (Throwable th2) {
                    dv4.m4760j(th2);
                    return false;
                }
        }
    }
}
