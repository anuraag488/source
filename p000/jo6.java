package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class jo6 extends hm6 {
    private static final Map zzb = new ConcurrentHashMap();
    protected pq6 zzc;
    private int zzd;

    public jo6() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = pq6.f27901e;
    }

    /* JADX INFO: renamed from: i */
    public static jo6 m7195i(Class cls) {
        Map map = zzb;
        jo6 jo6Var = (jo6) map.get(cls);
        if (jo6Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                jo6Var = (jo6) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (jo6Var != null) {
            return jo6Var;
        }
        try {
            jo6 jo6Var2 = (jo6) ((jo6) rq6.f29534a.allocateInstance(cls)).mo205g(6);
            if (jo6Var2 != null) {
                map.put(cls, jo6Var2);
                return jo6Var2;
            }
            xy4.m12787p();
            return null;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: renamed from: j */
    public static Object m7196j(Method method, jo6 jo6Var, Object... objArr) {
        try {
            return method.invoke(jo6Var, objArr);
        } catch (IllegalAccessException e) {
            xy4.m12785n("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            xy4.m12785n("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m7197l(Class cls, jo6 jo6Var) {
        jo6Var.m7201k();
        zzb.put(cls, jo6Var);
    }

    @Override // p000.hm6
    /* JADX INFO: renamed from: a */
    public final void mo6448a(in6 in6Var) {
        kq6 kq6VarM13720a = zp6.f36259c.m13720a(getClass());
        rr5 rr5Var = in6Var.f21597a;
        if (rr5Var == null) {
            rr5Var = new rr5((byte) 16);
            Charset charset = ro6.f29484a;
            rr5Var.f29555b = in6Var;
            in6Var.f21597a = rr5Var;
            VarHandle.storeStoreFence();
        }
        kq6VarM13720a.mo7583f(this, rr5Var);
    }

    @Override // p000.hm6
    /* JADX INFO: renamed from: c */
    public final int mo6450c(kq6 kq6Var) {
        if (m7199f()) {
            int iMo7582e = kq6Var.mo7582e(this);
            if (iMo7582e >= 0) {
                return iMo7582e;
            }
            C1077qn.m9989o(c75.m3877i(iMo7582e, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iMo7582e2 = kq6Var.mo7582e(this);
        if (iMo7582e2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iMo7582e2;
            return iMo7582e2;
        }
        C1077qn.m9989o(c75.m3877i(iMo7582e2, "serialized size must be non-negative, was "));
        return 0;
    }

    @Override // p000.hm6
    /* JADX INFO: renamed from: d */
    public final int mo6451d() {
        if (m7199f()) {
            int iMo7582e = zp6.f36259c.m13720a(getClass()).mo7582e(this);
            if (iMo7582e >= 0) {
                return iMo7582e;
            }
            C1077qn.m9989o(c75.m3877i(iMo7582e, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iMo7582e2 = zp6.f36259c.m13720a(getClass()).mo7582e(this);
        if (iMo7582e2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iMo7582e2;
            return iMo7582e2;
        }
        C1077qn.m9989o(c75.m3877i(iMo7582e2, "serialized size must be non-negative, was "));
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m7198e() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zp6.f36259c.m13720a(getClass()).mo7580c(this, (jo6) obj);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m7199f() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo205g(int i);

    /* JADX INFO: renamed from: h */
    public final fo6 m7200h() {
        return (fo6) mo205g(5);
    }

    public final int hashCode() {
        if (m7199f()) {
            return zp6.f36259c.m13720a(getClass()).mo7584g(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iMo7584g = zp6.f36259c.m13720a(getClass()).mo7584g(this);
        this.zza = iMo7584g;
        return iMo7584g;
    }

    /* JADX INFO: renamed from: k */
    public final void m7201k() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = vp6.f32788a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        vp6.m11952c(this, sb, 0);
        return sb.toString();
    }
}
