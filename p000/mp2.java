package p000;

import android.os.Looper;
import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class mp2 {

    /* JADX INFO: renamed from: a */
    public static final yu1 f25111a;

    static {
        String property;
        int i = ph4.f27610a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it = Arrays.asList(new C1067qd()).iterator();
            nb0 nb0Var = new nb0((byte) 2);
            nb0Var.f25616b = it;
            VarHandle.storeStoreFence();
            fl0 fl0Var = new fl0();
            fl0Var.f19066a = new AtomicReference(nb0Var);
            VarHandle.storeStoreFence();
            Iterator it2 = c24.m3833P(fl0Var).iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    ((C1067qd) next).getClass();
                    do {
                        ((C1067qd) it2.next()).getClass();
                    } while (it2.hasNext());
                }
            }
            if (((C1067qd) next) == null) {
                C1077qn.m9989o("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                f25111a = new yu1(zu1.m13794a(mainLooper));
            } else {
                C1077qn.m9989o("The main looper is not available");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
