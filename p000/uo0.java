package p000;

import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class uo0 {

    /* JADX INFO: renamed from: a */
    public static final Collection f32020a;

    static {
        try {
            Iterator it = Arrays.asList(new C1364yd()).iterator();
            nb0 nb0Var = new nb0((byte) 2);
            nb0Var.f25616b = it;
            VarHandle.storeStoreFence();
            fl0 fl0Var = new fl0();
            fl0Var.f19066a = new AtomicReference(nb0Var);
            VarHandle.storeStoreFence();
            f32020a = c24.m3833P(fl0Var);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
