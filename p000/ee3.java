package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ee3 extends vr1 {
    private static final ee3 DEFAULT_INSTANCE;
    private static volatile m83 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private j62 strings_ = th3.f31170e;

    static {
        ee3 ee3Var = new ee3();
        DEFAULT_INSTANCE = ee3Var;
        vr1.m11978j(ee3.class, ee3Var);
    }

    /* JADX INFO: renamed from: n */
    public static ee3 m5101n() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static de3 m5102p() {
        return (de3) ((qr1) DEFAULT_INSTANCE.mo3989b(5));
    }

    @Override // p000.vr1
    /* JADX INFO: renamed from: b */
    public final Object mo3989b(int i) {
        m83 sr1Var;
        int iM4376u = d55.m4376u(i);
        if (iM4376u == 0) {
            return (byte) 1;
        }
        if (iM4376u == 2) {
            return vr1.m11977h(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
        }
        if (iM4376u == 3) {
            return new ee3();
        }
        if (iM4376u == 4) {
            return new de3(DEFAULT_INSTANCE);
        }
        if (iM4376u == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iM4376u != 6) {
            throw null;
        }
        m83 m83Var = PARSER;
        if (m83Var != null) {
            return m83Var;
        }
        synchronized (ee3.class) {
            try {
                sr1Var = PARSER;
                if (sr1Var == null) {
                    sr1Var = new sr1(DEFAULT_INSTANCE);
                    PARSER = sr1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sr1Var;
    }

    /* JADX INFO: renamed from: m */
    public final void m5103m(Iterable iterable) {
        j62 j62VarM11051c = this.strings_;
        if (!((AbstractC0596e2) j62VarM11051c).f17637a) {
            j62VarM11051c = ((th3) j62VarM11051c).m11051c(j62VarM11051c.size() * 2);
            this.strings_ = j62VarM11051c;
        }
        byte[] bArr = l62.f23817a;
        if (iterable instanceof zi2) {
            ((zi2) iterable).m13597p();
            xy4.m12778e();
            return;
        }
        if (iterable instanceof uf3) {
            j62VarM11051c.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (j62VarM11051c instanceof ArrayList) {
                ((ArrayList) j62VarM11051c).ensureCapacity(j62VarM11051c.size() + size);
            } else if (j62VarM11051c instanceof th3) {
                th3 th3Var = (th3) j62VarM11051c;
                int i = th3Var.f31172c + size;
                Object[] objArr = th3Var.f31171b;
                if (i > objArr.length) {
                    if (objArr.length == 0) {
                        th3Var.f31171b = new Object[Math.max(i, 10)];
                    } else {
                        int length = objArr.length;
                        while (length < i) {
                            length = zi4.m13610j(length, 3, 2, 1, 10);
                        }
                        th3Var.f31171b = Arrays.copyOf(th3Var.f31171b, length);
                    }
                }
            }
        }
        int size2 = j62VarM11051c.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    qr1.m10044d(j62VarM11051c, size2);
                    throw null;
                }
                j62VarM11051c.add(obj);
            }
            return;
        }
        List list = (List) iterable;
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj2 = list.get(i2);
            if (obj2 == null) {
                qr1.m10044d(j62VarM11051c, size2);
                throw null;
            }
            j62VarM11051c.add(obj2);
        }
    }

    /* JADX INFO: renamed from: o */
    public final j62 m5104o() {
        return this.strings_;
    }
}
