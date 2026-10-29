package p000;

import java.lang.invoke.VarHandle;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class fn2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ long f19131a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ long f19132b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ long f19133c;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = AbstractC1078qo.f28633a;
        f19131a = unsafe.objectFieldOffset(fn2.class.getDeclaredField("_next$volatile"));
        f19132b = unsafe.objectFieldOffset(fn2.class.getDeclaredField("_prev$volatile"));
        f19133c = unsafe.objectFieldOffset(fn2.class.getDeclaredField("_removedRef$volatile"));
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5748e(fn2 fn2Var, int i) {
        while (true) {
            fn2 fn2VarM5754k = this.m5754k();
            if (fn2VarM5754k instanceof tl2) {
                return (((tl2) fn2VarM5754k).f31222d & i) == 0 && fn2VarM5754k.m5748e(fn2Var, i);
            }
            Unsafe unsafe = AbstractC1078qo.f28633a;
            unsafe.putObjectVolatile(fn2Var, f19132b, fn2VarM5754k);
            long j = f19131a;
            unsafe.putObjectVolatile(fn2Var, j, this);
            fn2 fn2Var2 = this;
            fn2 fn2Var3 = fn2Var;
            if (unsafe.compareAndSwapObject(fn2VarM5754k, j, fn2Var2, fn2Var3)) {
                fn2Var3.m5751h(fn2Var2);
                return true;
            }
            this = fn2Var2;
            fn2Var = fn2Var3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final void m5749f(int i) {
        tl2 tl2Var = new tl2();
        tl2Var.f31222d = i;
        VarHandle.storeStoreFence();
        m5748e(tl2Var, i);
    }

    /* JADX INFO: renamed from: g */
    public final fn2 m5750g() {
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j = f19132b;
            fn2 fn2Var = (fn2) unsafe.getObjectVolatile(this, j);
            fn2 fn2Var2 = null;
            fn2 fn2Var3 = fn2Var;
            while (true) {
                if (fn2Var3 == null) {
                    xy4.m12778e();
                    return null;
                }
                Unsafe unsafe2 = AbstractC1078qo.f28633a;
                long j2 = f19131a;
                Object objectVolatile = unsafe2.getObjectVolatile(fn2Var3, j2);
                if (objectVolatile == this) {
                    if (fn2Var != fn2Var3) {
                        fn2 fn2Var4 = this;
                        boolean zCompareAndSwapObject = unsafe2.compareAndSwapObject(fn2Var4, f19132b, fn2Var, fn2Var3);
                        this = fn2Var4;
                        if (!zCompareAndSwapObject) {
                            break;
                        }
                    }
                    return fn2Var3;
                }
                fn2 fn2Var5 = fn2Var3;
                this = this;
                if (this.mo5755l()) {
                    return null;
                }
                if (!(objectVolatile instanceof bn3)) {
                    fn2Var2 = fn2Var5;
                    fn2Var3 = (fn2) objectVolatile;
                } else if (fn2Var2 != null) {
                    if (!unsafe2.compareAndSwapObject(fn2Var2, j2, fn2Var5, ((bn3) objectVolatile).f15436a)) {
                        break;
                    }
                    fn2Var3 = fn2Var2;
                    fn2Var2 = null;
                } else {
                    if (fn2Var5 == null) {
                        xy4.m12778e();
                        return null;
                    }
                    fn2Var3 = (fn2) unsafe2.getObjectVolatile(fn2Var5, j);
                }
            }
            this = this;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5751h(fn2 fn2Var) {
        while (true) {
            Unsafe unsafe = AbstractC1078qo.f28633a;
            long j = f19132b;
            fn2 fn2Var2 = (fn2) unsafe.getObjectVolatile(fn2Var, j);
            if (this.m5752i() != fn2Var) {
                return;
            }
            fn2 fn2Var3 = this;
            fn2 fn2Var4 = fn2Var;
            if (unsafe.compareAndSwapObject(fn2Var4, j, fn2Var2, fn2Var3)) {
                if (fn2Var3.mo5755l()) {
                    fn2Var4.m5750g();
                    return;
                }
                return;
            }
            fn2Var = fn2Var4;
            this = fn2Var3;
        }
    }

    /* JADX INFO: renamed from: i */
    public final Object m5752i() {
        return AbstractC1078qo.f28633a.getObjectVolatile(this, f19131a);
    }

    /* JADX INFO: renamed from: j */
    public final fn2 m5753j() {
        Object objM5752i = m5752i();
        bn3 bn3Var = objM5752i instanceof bn3 ? (bn3) objM5752i : null;
        return bn3Var != null ? bn3Var.f15436a : (fn2) objM5752i;
    }

    /* JADX INFO: renamed from: k */
    public final fn2 m5754k() {
        fn2 fn2VarM5750g = m5750g();
        if (fn2VarM5750g != null) {
            return fn2VarM5750g;
        }
        Unsafe unsafe = AbstractC1078qo.f28633a;
        long j = f19132b;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        while (true) {
            fn2 fn2Var = (fn2) objectVolatile;
            if (!fn2Var.mo5755l()) {
                return fn2Var;
            }
            objectVolatile = AbstractC1078qo.f28633a.getObjectVolatile(fn2Var, j);
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean mo5755l() {
        return m5752i() instanceof bn3;
    }

    public String toString() {
        return new ii2(this, ev0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1, (byte) 1) + '@' + ev0.m5354d0(this);
    }
}
