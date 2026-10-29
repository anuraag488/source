package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class zh6 extends ef6 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb;
    protected el6 zzc;

    public zh6() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = el6.f18242f;
    }

    /* JADX INFO: renamed from: j */
    public static zh6 m13561j(Class cls) {
        Map map = zzd;
        zh6 zh6Var = (zh6) map.get(cls);
        if (zh6Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zh6Var = (zh6) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zh6Var != null) {
            return zh6Var;
        }
        try {
            zh6 zh6Var2 = (zh6) ((zh6) ml6.f25010a.allocateInstance(cls)).mo97n(6);
            if (zh6Var2 != null) {
                map.put(cls, zh6Var2);
                return zh6Var2;
            }
            xy4.m12787p();
            return null;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m13562k(Class cls, zh6 zh6Var) {
        zh6Var.m13567e();
        zzd.put(cls, zh6Var);
    }

    /* JADX INFO: renamed from: l */
    public static ek6 m13563l(ef6 ef6Var, String str, Object[] objArr) {
        char cCharAt;
        ek6 ek6Var = new ek6();
        ek6Var.f18191a = ef6Var;
        ek6Var.f18192b = str;
        ek6Var.f18193c = objArr;
        char cCharAt2 = str.charAt(0);
        if (cCharAt2 < 55296) {
            ek6Var.f18194d = cCharAt2;
        } else {
            int i = cCharAt2 & 8191;
            int i2 = 1;
            int i3 = 13;
            while (true) {
                int i4 = i2 + 1;
                cCharAt = str.charAt(i2);
                if (cCharAt < 55296) {
                    break;
                }
                i |= (cCharAt & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
            ek6Var.f18194d = i | (cCharAt << i3);
        }
        VarHandle.storeStoreFence();
        return ek6Var;
    }

    /* JADX INFO: renamed from: m */
    public static Object m13564m(Method method, zh6 zh6Var, Object... objArr) {
        try {
            return method.invoke(zh6Var, objArr);
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

    @Override // p000.ef6
    /* JADX INFO: renamed from: b */
    public final int mo5119b(gk6 gk6Var) {
        if (m13566d()) {
            int iMo6026d = gk6Var.mo6026d(this);
            if (iMo6026d >= 0) {
                return iMo6026d;
            }
            qm5.m9912c(String.valueOf(iMo6026d).length() + 42, iMo6026d);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iMo6026d2 = gk6Var.mo6026d(this);
        if (iMo6026d2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iMo6026d2;
            return iMo6026d2;
        }
        qm5.m9912c(String.valueOf(iMo6026d2).length() + 42, iMo6026d2);
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m13565c(ng6 ng6Var) {
        gk6 gk6VarM3613a = bk6.f15375c.m3613a(getClass());
        bt5 bt5Var = ng6Var.f25783a;
        if (bt5Var == null) {
            bt5Var = new bt5((byte) 13);
            Charset charset = ni6.f25875a;
            bt5Var.f15596b = ng6Var;
            ng6Var.f25783a = bt5Var;
            VarHandle.storeStoreFence();
        }
        gk6VarM3613a.mo6023a(this, bt5Var);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m13566d() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m13567e() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return bk6.f15375c.m3613a(getClass()).mo6027e(this, (zh6) obj);
    }

    /* JADX INFO: renamed from: f */
    public final th6 m13568f() {
        return (th6) mo97n(5);
    }

    /* JADX INFO: renamed from: g */
    public final th6 m13569g() {
        th6 th6Var = (th6) mo97n(5);
        th6Var.m11057f(this);
        return th6Var;
    }

    /* JADX INFO: renamed from: h */
    public final void m13570h() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (m13566d()) {
            return bk6.f15375c.m3613a(getClass()).mo6029g(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iMo6029g = bk6.f15375c.m3613a(getClass()).mo6029g(this);
        this.zza = iMo6029g;
        return iMo6029g;
    }

    /* JADX INFO: renamed from: i */
    public final int m13571i() {
        if (m13566d()) {
            int iMo6026d = bk6.f15375c.m3613a(getClass()).mo6026d(this);
            if (iMo6026d >= 0) {
                return iMo6026d;
            }
            qm5.m9912c(String.valueOf(iMo6026d).length() + 42, iMo6026d);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iMo6026d2 = bk6.f15375c.m3613a(getClass()).mo6026d(this);
        if (iMo6026d2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iMo6026d2;
            return iMo6026d2;
        }
        qm5.m9912c(String.valueOf(iMo6026d2).length() + 42, iMo6026d2);
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public abstract Object mo97n(int i);

    public final String toString() {
        String string = super.toString();
        char[] cArr = sj6.f30347a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        sj6.m10832b(this, sb, 0);
        return sb.toString();
    }
}
