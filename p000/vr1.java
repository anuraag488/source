package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class vr1 extends AbstractC1277w1 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static final Map<Class<?>, vr1> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected ou4 unknownFields;

    public vr1() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ou4.f27126f;
    }

    /* JADX INFO: renamed from: c */
    public static vr1 m11974c(Class cls) {
        Map<Class<?>, vr1> map = defaultInstanceMap;
        vr1 vr1Var = map.get(cls);
        if (vr1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                vr1Var = map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (vr1Var != null) {
            return vr1Var;
        }
        try {
            vr1 vr1Var2 = (vr1) ((vr1) dv4.f17429a.allocateInstance(cls)).mo3989b(6);
            if (vr1Var2 != null) {
                map.put(cls, vr1Var2);
                return vr1Var2;
            }
            xy4.m12787p();
            return null;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static Object m11975d(Method method, vr1 vr1Var, Object... objArr) {
        try {
            return method.invoke(vr1Var, objArr);
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

    /* JADX INFO: renamed from: e */
    public static final boolean m11976e(vr1 vr1Var, boolean z) {
        byte bByteValue = ((Byte) vr1Var.mo3989b(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        rh3 rh3Var = rh3.f29290c;
        rh3Var.getClass();
        boolean zMo6181c = rh3Var.m10338a(vr1Var.getClass()).mo6181c(vr1Var);
        if (z) {
            vr1Var.mo3989b(2);
        }
        return zMo6181c;
    }

    /* JADX INFO: renamed from: h */
    public static rj3 m11977h(vr1 vr1Var, String str, Object[] objArr) {
        char cCharAt;
        rj3 rj3Var = new rj3();
        rj3Var.f29354a = vr1Var;
        rj3Var.f29355b = str;
        rj3Var.f29356c = objArr;
        char cCharAt2 = str.charAt(0);
        if (cCharAt2 < 55296) {
            rj3Var.f29357d = cCharAt2;
        } else {
            int i = cCharAt2 & 8191;
            int i2 = 13;
            int i3 = 1;
            while (true) {
                int i4 = i3 + 1;
                cCharAt = str.charAt(i3);
                if (cCharAt < 55296) {
                    break;
                }
                i |= (cCharAt & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
            rj3Var.f29357d = i | (cCharAt << i2);
        }
        VarHandle.storeStoreFence();
        return rj3Var;
    }

    /* JADX INFO: renamed from: j */
    public static void m11978j(Class cls, vr1 vr1Var) {
        vr1Var.m11981g();
        defaultInstanceMap.put(cls, vr1Var);
    }

    @Override // p000.AbstractC1277w1
    /* JADX INFO: renamed from: a */
    public final int mo11979a(gw3 gw3Var) {
        int iMo6185g;
        int iMo6185g2;
        if (m11980f()) {
            if (gw3Var == null) {
                rh3 rh3Var = rh3.f29290c;
                rh3Var.getClass();
                iMo6185g2 = rh3Var.m10338a(getClass()).mo6185g(this);
            } else {
                iMo6185g2 = gw3Var.mo6185g(this);
            }
            if (iMo6185g2 >= 0) {
                return iMo6185g2;
            }
            C1077qn.m9989o(c75.m3877i(iMo6185g2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (gw3Var == null) {
            rh3 rh3Var2 = rh3.f29290c;
            rh3Var2.getClass();
            iMo6185g = rh3Var2.m10338a(getClass()).mo6185g(this);
        } else {
            iMo6185g = gw3Var.mo6185g(this);
        }
        m11983k(iMo6185g);
        return iMo6185g;
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo3989b(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rh3 rh3Var = rh3.f29290c;
        rh3Var.getClass();
        return rh3Var.m10338a(getClass()).mo6186h(this, (vr1) obj);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m11980f() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m11981g() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (m11980f()) {
            rh3 rh3Var = rh3.f29290c;
            rh3Var.getClass();
            return rh3Var.m10338a(getClass()).mo6183e(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        rh3 rh3Var2 = rh3.f29290c;
        rh3Var2.getClass();
        int iMo6183e = rh3Var2.m10338a(getClass()).mo6183e(this);
        this.memoizedHashCode = iMo6183e;
        return iMo6183e;
    }

    /* JADX INFO: renamed from: i */
    public final vr1 m11982i() {
        return (vr1) mo3989b(4);
    }

    /* JADX INFO: renamed from: k */
    public final void m11983k(int i) {
        if (i < 0) {
            C1077qn.m9989o(c75.m3877i(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m11984l(C1145sh c1145sh) {
        rh3 rh3Var = rh3.f29290c;
        rh3Var.getClass();
        gw3 gw3VarM10338a = rh3Var.m10338a(getClass());
        js1 js1Var = (js1) c1145sh.f30264c;
        if (js1Var == null) {
            js1Var = new js1();
            byte[] bArr = l62.f23817a;
            js1Var.f22555a = c1145sh;
            c1145sh.f30264c = js1Var;
            VarHandle.storeStoreFence();
        }
        gw3VarM10338a.mo6187i(this, js1Var);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = os2.f27054a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        os2.m9255c(this, sb, 0);
        return sb.toString();
    }
}
