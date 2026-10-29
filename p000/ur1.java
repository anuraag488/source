package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ur1 extends iv5 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static final Map<Class<?>, ur1> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected ax5 unknownFields;

    public ur1() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ax5.f14932f;
    }

    /* JADX INFO: renamed from: c */
    public static ur1 m11627c(Class cls) {
        Map<Class<?>, ur1> map = defaultInstanceMap;
        ur1 ur1Var = map.get(cls);
        if (ur1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                ur1Var = map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (ur1Var != null) {
            return ur1Var;
        }
        try {
            ur1 ur1Var2 = (ur1) ((ur1) rx5.f29717a.allocateInstance(cls)).mo5307i(6);
            if (ur1Var2 != null) {
                map.put(cls, ur1Var2);
                return ur1Var2;
            }
            xy4.m12787p();
            return null;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m11628e(Class cls, ur1 ur1Var) {
        ur1Var.m11632d();
        defaultInstanceMap.put(cls, ur1Var);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m11629h(ur1 ur1Var, boolean z) {
        byte bByteValue = ((Byte) ur1Var.mo5307i(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo9294e = uv5.f32208b.m11661a(ur1Var.getClass()).mo9294e(ur1Var);
        if (z) {
            ur1Var.mo5307i(2);
        }
        return zMo9294e;
    }

    /* JADX INFO: renamed from: j */
    public static Object m11630j(Method method, ur1 ur1Var, Object... objArr) {
        try {
            return method.invoke(ur1Var, objArr);
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

    /* JADX INFO: renamed from: k */
    public static xv5 m11631k(ur1 ur1Var, String str, Object[] objArr) {
        char cCharAt;
        xv5 xv5Var = new xv5();
        xv5Var.f34648a = ur1Var;
        xv5Var.f34649b = str;
        xv5Var.f34650c = objArr;
        char cCharAt2 = str.charAt(0);
        if (cCharAt2 < 55296) {
            xv5Var.f34651d = cCharAt2;
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
            xv5Var.f34651d = i | (cCharAt << i3);
        }
        VarHandle.storeStoreFence();
        return xv5Var;
    }

    @Override // p000.iv5
    /* JADX INFO: renamed from: a */
    public final void mo6947a(n83 n83Var) {
        zv5 zv5VarM11661a = uv5.f32208b.m11661a(getClass());
        wd3 wd3Var = (wd3) n83Var.f25534d;
        if (wd3Var == null) {
            wd3Var = new wd3((byte) 27);
            byte[] bArr = kr5.f23354a;
            wd3Var.f33259b = n83Var;
            n83Var.f25534d = wd3Var;
            VarHandle.storeStoreFence();
        }
        zv5VarM11661a.mo9298i(this, wd3Var);
    }

    @Override // p000.iv5
    /* JADX INFO: renamed from: b */
    public final int mo6948b(zv5 zv5Var) {
        int iMo9293d;
        int iMo9293d2;
        if (m11634g()) {
            if (zv5Var == null) {
                iMo9293d2 = uv5.f32208b.m11661a(getClass()).mo9293d(this);
            } else {
                iMo9293d2 = zv5Var.mo9293d(this);
            }
            if (iMo9293d2 >= 0) {
                return iMo9293d2;
            }
            C1077qn.m9989o(c75.m3877i(iMo9293d2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        if (zv5Var == null) {
            iMo9293d = uv5.f32208b.m11661a(getClass()).mo9293d(this);
        } else {
            iMo9293d = zv5Var.mo9293d(this);
        }
        m11633f(iMo9293d);
        return iMo9293d;
    }

    /* JADX INFO: renamed from: d */
    public final void m11632d() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return uv5.f32208b.m11661a(getClass()).mo9296g(this, (ur1) obj);
    }

    /* JADX INFO: renamed from: f */
    public final void m11633f(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = i | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            C1077qn.m9989o(c75.m3877i(i, "serialized size must be non-negative, was "));
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m11634g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final int hashCode() {
        if (m11634g()) {
            return uv5.f32208b.m11661a(getClass()).mo9295f(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iMo9295f = uv5.f32208b.m11661a(getClass()).mo9295f(this);
        this.memoizedHashCode = iMo9295f;
        return iMo9295f;
    }

    /* JADX INFO: renamed from: i */
    public abstract Object mo5307i(int i);

    public final String toString() {
        String string = super.toString();
        char[] cArr = mu5.f25225a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        mu5.m8402c(this, sb, 0);
        return sb.toString();
    }
}
