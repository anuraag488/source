package p000;

import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qc1 {

    /* JADX INFO: renamed from: a */
    public static volatile qc1 f28373a;

    /* JADX INFO: renamed from: b */
    public static final qc1 f28374b;

    static {
        qc1 qc1Var = new qc1();
        Map map = Collections.EMPTY_MAP;
        VarHandle.storeStoreFence();
        f28374b = qc1Var;
    }

    /* JADX INFO: renamed from: a */
    public static qc1 m9861a() {
        qc1 qc1Var;
        ph3 ph3Var = ph3.f27607c;
        qc1 qc1Var2 = f28373a;
        if (qc1Var2 != null) {
            return qc1Var2;
        }
        synchronized (qc1.class) {
            try {
                qc1Var = f28373a;
                if (qc1Var == null) {
                    Class cls = oc1.f26572a;
                    qc1 qc1Var3 = null;
                    if (cls != null) {
                        try {
                            qc1Var3 = (qc1) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    qc1Var = qc1Var3 != null ? qc1Var3 : f28374b;
                    f28373a = qc1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qc1Var;
    }
}
