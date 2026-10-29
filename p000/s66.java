package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class s66 extends u36 {
    private static final Map zzb = new ConcurrentHashMap();
    protected mb6 zzc;
    private int zzd;

    public s66() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = mb6.f24801f;
    }

    /* JADX INFO: renamed from: f */
    public static void m10531f(Class cls, s66 s66Var) {
        s66Var.m10539e();
        zzb.put(cls, s66Var);
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m10532i(s66 s66Var, boolean z) {
        byte bByteValue = ((Byte) s66Var.mo3836j(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo8655b = da6.f16886b.m4415a(s66Var.getClass()).mo8655b(s66Var);
        if (z) {
            s66Var.mo3836j(2);
        }
        return zMo8655b;
    }

    /* JADX INFO: renamed from: m */
    public static s66 m10533m(Class cls) {
        Map map = zzb;
        s66 s66Var = (s66) map.get(cls);
        if (s66Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                s66Var = (s66) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (s66Var != null) {
            return s66Var;
        }
        try {
            s66 s66Var2 = (s66) ((s66) vb6.f32511a.allocateInstance(cls)).mo3836j(6);
            if (s66Var2 != null) {
                map.put(cls, s66Var2);
                return s66Var2;
            }
            xy4.m12787p();
            return null;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: renamed from: o */
    public static Object m10534o(Method method, s66 s66Var, Object... objArr) {
        try {
            return method.invoke(s66Var, objArr);
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

    /* JADX INFO: renamed from: p */
    public static la6 m10535p(u36 u36Var, String str, Object[] objArr) {
        char cCharAt;
        la6 la6Var = new la6();
        la6Var.f23898a = u36Var;
        la6Var.f23899b = str;
        la6Var.f23900c = objArr;
        char cCharAt2 = str.charAt(0);
        if (cCharAt2 < 55296) {
            la6Var.f23901d = cCharAt2;
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
            la6Var.f23901d = i | (cCharAt << i3);
        }
        VarHandle.storeStoreFence();
        return la6Var;
    }

    @Override // p000.u36
    /* JADX INFO: renamed from: a */
    public final void mo10536a(n83 n83Var) {
        na6 na6VarM4415a = da6.f16886b.m4415a(getClass());
        rr5 rr5Var = (rr5) n83Var.f25534d;
        if (rr5Var == null) {
            rr5Var = new rr5((byte) 9);
            rr5Var.f29555b = n83Var;
            n83Var.f25534d = rr5Var;
            VarHandle.storeStoreFence();
        }
        na6VarM4415a.mo8660g(this, rr5Var);
    }

    @Override // p000.u36
    /* JADX INFO: renamed from: c */
    public final int mo10537c(na6 na6Var) {
        if (m10541h()) {
            int iMo8661h = na6Var.mo8661h(this);
            if (iMo8661h >= 0) {
                return iMo8661h;
            }
            C1077qn.m9989o(c75.m3877i(iMo8661h, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iMo8661h2 = na6Var.mo8661h(this);
        if (iMo8661h2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iMo8661h2;
            return iMo8661h2;
        }
        C1077qn.m9989o(c75.m3877i(iMo8661h2, "serialized size must be non-negative, was "));
        return 0;
    }

    @Override // p000.u36
    /* JADX INFO: renamed from: d */
    public final int mo10538d() {
        if (m10541h()) {
            int iMo8661h = da6.f16886b.m4415a(getClass()).mo8661h(this);
            if (iMo8661h >= 0) {
                return iMo8661h;
            }
            C1077qn.m9989o(c75.m3877i(iMo8661h, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iMo8661h2 = da6.f16886b.m4415a(getClass()).mo8661h(this);
        if (iMo8661h2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iMo8661h2;
            return iMo8661h2;
        }
        C1077qn.m9989o(c75.m3877i(iMo8661h2, "serialized size must be non-negative, was "));
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m10539e() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return da6.f16886b.m4415a(getClass()).mo8658e(this, (s66) obj);
    }

    /* JADX INFO: renamed from: g */
    public final void m10540g() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m10541h() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (m10541h()) {
            return da6.f16886b.m4415a(getClass()).mo8657d(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iMo8657d = da6.f16886b.m4415a(getClass()).mo8657d(this);
        this.zza = iMo8657d;
        return iMo8657d;
    }

    /* JADX INFO: renamed from: j */
    public abstract Object mo3836j(int i);

    /* JADX INFO: renamed from: k */
    public final o66 m10542k() {
        return (o66) mo3836j(5);
    }

    /* JADX INFO: renamed from: l */
    public final o66 m10543l() {
        o66 o66Var = (o66) mo3836j(5);
        s66 s66Var = o66Var.f26372a;
        if (!s66Var.getClass().isInstance(this)) {
            C1077qn.m9987m("mergeFrom(MessageLite) can only merge messages of the same type.");
            return null;
        }
        if (!s66Var.equals(this)) {
            if (!o66Var.f26373b.m10541h()) {
                s66 s66VarM10544n = o66Var.f26372a.m10544n();
                da6.f16886b.m4415a(s66VarM10544n.getClass()).mo8659f(s66VarM10544n, o66Var.f26373b);
                o66Var.f26373b = s66VarM10544n;
            }
            s66 s66Var2 = o66Var.f26373b;
            da6.f16886b.m4415a(s66Var2.getClass()).mo8659f(s66Var2, this);
        }
        return o66Var;
    }

    /* JADX INFO: renamed from: n */
    public final s66 m10544n() {
        return (s66) mo3836j(4);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = o96.f26495a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        o96.m9011c(this, sb, 0);
        return sb.toString();
    }
}
