package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ts1 {

    /* JADX INFO: renamed from: a */
    public static final C1302wp f31385a;

    static {
        C1302wp c1302wp = new C1302wp();
        c1302wp.f33577a = new AtomicBoolean(false);
        VarHandle.storeStoreFence();
        f31385a = c1302wp;
    }
}
