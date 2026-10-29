package p000;

import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class tr1 extends AbstractC1240v1 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Class<?>, tr1> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected nu4 unknownFields;

    public tr1() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = nu4.f26097f;
    }

    /* JADX INFO: renamed from: j */
    public static tr1 m11094j(Class cls) {
        tr1 tr1Var = defaultInstanceMap.get(cls);
        if (tr1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                tr1Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (tr1Var != null) {
            return tr1Var;
        }
        try {
            tr1 tr1VarMo45a = ((tr1) cv4.f16510a.allocateInstance(cls)).mo45a();
            if (tr1VarMo45a != null) {
                defaultInstanceMap.put(cls, tr1VarMo45a);
                return tr1VarMo45a;
            }
            xy4.m12787p();
            return null;
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: renamed from: m */
    public static Object m11095m(Method method, tr1 tr1Var, Object... objArr) {
        try {
            return method.invoke(tr1Var, objArr);
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

    /* JADX INFO: renamed from: n */
    public static final boolean m11096n(tr1 tr1Var, boolean z) {
        byte bByteValue = ((Byte) tr1Var.mo124i(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        ph3 ph3Var = ph3.f27607c;
        ph3Var.getClass();
        boolean zMo5830c = ph3Var.m9531a(tr1Var.getClass()).mo5830c(tr1Var);
        if (z) {
            tr1Var.mo124i(2);
        }
        return zMo5830c;
    }

    /* JADX INFO: renamed from: r */
    public static qj3 m11097r(AbstractC1240v1 abstractC1240v1, String str, Object[] objArr) {
        char cCharAt;
        qj3 qj3Var = new qj3();
        qj3Var.f28526a = abstractC1240v1;
        qj3Var.f28527b = str;
        qj3Var.f28528c = objArr;
        char cCharAt2 = str.charAt(0);
        if (cCharAt2 < 55296) {
            qj3Var.f28529d = cCharAt2;
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
            qj3Var.f28529d = i | (cCharAt << i2);
        }
        VarHandle.storeStoreFence();
        return qj3Var;
    }

    /* JADX INFO: renamed from: t */
    public static tr1 m11098t(tr1 tr1Var, t50 t50Var, qc1 qc1Var) throws h72 {
        o50 o50Var = (o50) t50Var;
        ta0 ta0VarM10997e = ta0.m10997e(o50Var.f26351d, o50Var.mo7016m(), o50Var.size(), true);
        tr1 tr1VarM11110s = tr1Var.m11110s();
        try {
            ph3 ph3Var = ph3.f27607c;
            ph3Var.getClass();
            fw3 fw3VarM9531a = ph3Var.m9531a(tr1VarM11110s.getClass());
            xa0 xa0Var = ta0VarM10997e.f31019b;
            if (xa0Var == null) {
                xa0Var = new xa0((byte) 0);
                xa0Var.f34094d = 0;
                Charset charset = k62.f22939a;
                xa0Var.f34095e = ta0VarM10997e;
                ta0VarM10997e.f31019b = xa0Var;
                VarHandle.storeStoreFence();
            }
            fw3VarM9531a.mo5834g(tr1VarM11110s, xa0Var, qc1Var);
            fw3VarM9531a.mo5829b(tr1VarM11110s);
            if (ta0VarM10997e.f31025h != 0) {
                throw new h72("Protocol message end-group tag did not match expected tag.");
            }
            if (m11096n(tr1VarM11110s, true)) {
                return tr1VarM11110s;
            }
            throw new h72(new eu4().getMessage());
        } catch (eu4 e) {
            throw new h72(e.getMessage());
        } catch (h72 e2) {
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof h72) {
                throw ((h72) e3.getCause());
            }
            throw new h72(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof h72) {
                throw ((h72) e4.getCause());
            }
            throw e4;
        }
    }

    /* JADX INFO: renamed from: u */
    public static tr1 m11099u(tr1 tr1Var, byte[] bArr, qc1 qc1Var) throws h72 {
        int length = bArr.length;
        if (length != 0) {
            tr1 tr1VarM11110s = tr1Var.m11110s();
            try {
                ph3 ph3Var = ph3.f27607c;
                ph3Var.getClass();
                fw3 fw3VarM9531a = ph3Var.m9531a(tr1VarM11110s.getClass());
                C1411zn c1411zn = new C1411zn();
                qc1Var.getClass();
                fw3VarM9531a.mo5836i(tr1VarM11110s, bArr, 0, length, c1411zn);
                fw3VarM9531a.mo5829b(tr1VarM11110s);
                tr1Var = tr1VarM11110s;
            } catch (eu4 e) {
                throw new h72(e.getMessage());
            } catch (h72 e2) {
                throw e2;
            } catch (IOException e3) {
                if (e3.getCause() instanceof h72) {
                    throw ((h72) e3.getCause());
                }
                throw new h72(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                throw h72.m6268e();
            }
        }
        if (tr1Var == null || m11096n(tr1Var, true)) {
            return tr1Var;
        }
        throw new h72(new eu4().getMessage());
    }

    /* JADX INFO: renamed from: v */
    public static void m11100v(Class cls, tr1 tr1Var) {
        tr1Var.m11108p();
        defaultInstanceMap.put(cls, tr1Var);
    }

    @Override // p000.AbstractC1240v1
    /* JADX INFO: renamed from: b */
    public final int mo11101b(fw3 fw3Var) {
        int iMo5835h;
        int iMo5835h2;
        if (m11107o()) {
            if (fw3Var == null) {
                ph3 ph3Var = ph3.f27607c;
                ph3Var.getClass();
                iMo5835h2 = ph3Var.m9531a(getClass()).mo5835h(this);
            } else {
                iMo5835h2 = fw3Var.mo5835h(this);
            }
            if (iMo5835h2 >= 0) {
                return iMo5835h2;
            }
            C1077qn.m9989o(c75.m3877i(iMo5835h2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (fw3Var == null) {
            ph3 ph3Var2 = ph3.f27607c;
            ph3Var2.getClass();
            iMo5835h = ph3Var2.m9531a(getClass()).mo5835h(this);
        } else {
            iMo5835h = fw3Var.mo5835h(this);
        }
        m11111w(iMo5835h);
        return iMo5835h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ph3 ph3Var = ph3.f27607c;
        ph3Var.getClass();
        return ph3Var.m9531a(getClass()).mo5837j(this, (tr1) obj);
    }

    @Override // p000.AbstractC1240v1
    /* JADX INFO: renamed from: g */
    public final void mo11103g(ya0 ya0Var) {
        ph3 ph3Var = ph3.f27607c;
        ph3Var.getClass();
        fw3 fw3VarM9531a = ph3Var.m9531a(getClass());
        ar3 ar3Var = ya0Var.f35064a;
        if (ar3Var == null) {
            ar3Var = new ar3((byte) 14);
            Charset charset = k62.f22939a;
            ar3Var.f14813b = ya0Var;
            ya0Var.f35064a = ar3Var;
            VarHandle.storeStoreFence();
        }
        fw3VarM9531a.mo5832e(this, ar3Var);
    }

    /* JADX INFO: renamed from: h */
    public final pr1 m11104h() {
        return (pr1) mo124i(5);
    }

    public final int hashCode() {
        if (m11107o()) {
            ph3 ph3Var = ph3.f27607c;
            ph3Var.getClass();
            return ph3Var.m9531a(getClass()).mo5833f(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        ph3 ph3Var2 = ph3.f27607c;
        ph3Var2.getClass();
        int iMo5833f = ph3Var2.m9531a(getClass()).mo5833f(this);
        this.memoizedHashCode = iMo5833f;
        return iMo5833f;
    }

    /* JADX INFO: renamed from: i */
    public abstract Object mo124i(int i);

    @Override // p000.ms2
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final tr1 mo45a() {
        return (tr1) mo124i(6);
    }

    /* JADX INFO: renamed from: l */
    public final l83 m11106l() {
        return (l83) mo124i(7);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m11107o() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    /* JADX INFO: renamed from: p */
    public final void m11108p() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // p000.AbstractC1240v1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final pr1 mo11102d() {
        return (pr1) mo124i(5);
    }

    /* JADX INFO: renamed from: s */
    public final tr1 m11110s() {
        return (tr1) mo124i(4);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = ns2.f26070a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        ns2.m8836c(this, sb, 0);
        return sb.toString();
    }

    /* JADX INFO: renamed from: w */
    public final void m11111w(int i) {
        if (i < 0) {
            C1077qn.m9989o(c75.m3877i(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }
}
